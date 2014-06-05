package org.xtext.passi.generator

import org.xtext.passi.docGen.emptyElement
import java.io.File
import java.math.BigInteger
import java.util.ArrayList
import java.util.Hashtable
import org.docx4j.jaxb.Context
import org.docx4j.openpackaging.packages.WordprocessingMLPackage
import org.docx4j.wml.BooleanDefaultTrue
import org.docx4j.wml.Br
import org.docx4j.wml.CTBorder
import org.docx4j.wml.HpsMeasure
import org.docx4j.wml.ObjectFactory
import org.docx4j.wml.RPr
import org.docx4j.wml.STBorder
import org.docx4j.wml.STBrType
import org.docx4j.wml.Tbl
import org.docx4j.wml.TblBorders
import org.docx4j.wml.TblPr
import org.docx4j.wml.Tc
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend2.lib.StringConcatenation
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.xtext.passi.docGen.element
import org.text.passi.generationUi.DocGenAdvancedUI

class DocxBuilder extends DocumentationBuilder
{
	private static ObjectFactory factory;
	protected WordprocessingMLPackage wordMLPackage;
	
	new(Document MetamodelDocument, EList<element> ModelElementsList, Hashtable HashTable, String OutputFileName) 
	{
		super(MetamodelDocument, ModelElementsList, HashTable, OutputFileName)
		factory = Context.wmlObjectFactory
	}
	
	override BuildDocumentation() 
	{		
		//create a doc document
		wordMLPackage = WordprocessingMLPackage.createPackage();
				
		if(documentationTitle.nullOrEmpty)
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Title", outputFileName)
		else
			wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Title", documentationTitle)
		
		//insert the diagram image
		if(pathToDiagramImageToInclude != null)
			insertDiagramImage
		
		if(documentationStyle == DocGenAdvancedUI.DOCUMENTATION_STYLE.STYLE_BY_ECLASS)
			BuildByEClassDocumentation(keyEClass)
		else
			BuildFullDocumentation()
		
		return new StringConcatenation
	}
	
	/**
	 * Build the documentation using the "Full documentation" style. Using this style, the documentation
	 * will be composed by many tables, each one for a different EClass. 
	 */
	private def BuildFullDocumentation()
	{
		//Proceed with the full documentation style
		var eClassifiers = metamodelDoc.getElementsByTagName("eClassifiers");
		
		for (i : 0..< eClassifiers.length)
		{
			var currentEClassifier = Element.cast(eClassifiers.item(i));
			
			//check if the current EClass has been marked as excluded from user in the launcher UI
			if(!excludedEClasses.contains(currentEClassifier.getAttribute("name")))
			{
				//Check if exists in the model a tag corresponding to the current EClass
				if(existsElementInModel(currentEClassifier.getAttribute("name")))
				{
					//Take the EClass features
					var eStructuralFeatureList = currentEClassifier.getElementsByTagName("eStructuralFeatures")
					
					//Convert Nodelist to ArrayList
					var nodeList = new ArrayList<Node>() 
				 	for (k : 0 ..< eStructuralFeatureList.length)
				 		nodeList.add(eStructuralFeatureList.item(k))
				 
					nodeList.addAll(getSuperTypeFeatures(currentEClassifier))
					
					//Add the table name to the document
					//wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Subtitle", currentEClassifier.getAttribute("name"));
					wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Header1", currentEClassifier.getAttribute("name"));
					
					//Create the table
					var tbl = factory.createTbl

					buildTableHeaderForFullDocumentationStyle(currentEClassifier, nodeList, tbl);

					buildTableForFullDocumentationStyle(currentEClassifier, nodeList, tbl);

					tbl = addBordersToTable(tbl)
					
					//Add the table to the word document
					wordMLPackage.getMainDocumentPart().addObject(tbl);
					
					//Add two empty lines
					wordMLPackage.getMainDocumentPart().addObject(factory.createBr);
					wordMLPackage.getMainDocumentPart().addObject(factory.createBr);
				}
			}
		}
	}
	
	
	/**
	 * Add the header to a table, containing in each column the name of the EStructuralFeature of an EClass.
	 * 
	 * @param currentEClassifier the current EClass whose header must be created.
	 * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
	 * @param tbl the destination table.
	 */
	private def buildTableHeaderForFullDocumentationStyle(Element currentEClassifier, ArrayList<Node> nodeList, Tbl tbl)
	{
		var tr = factory.createTr
		for (k : 0 ..< nodeList.size) 
		{
			var currentEStructuralFeature = Element.cast(nodeList.get(k));
			
			val s = new StringBuilder().append(currentEClassifier.getAttribute("name")).append("=>").append(currentEStructuralFeature.getAttribute("name")).toString
			
			//Check if the current feature has been marked as excluded from user in the launcher UI 
			if(!excludedEStructuralFeatures.contains(s))
			{
				//Get the feature name
				var featName = currentEStructuralFeature.getAttribute("name")
				
				//Add the feature name to the header row							
				tr.content.add(addStyledTableCell(featName,true,null))
			}
		}
		
		//Add the header row to the table
		tbl.content.add(tr)
		
		//tbl.addBordersToTable
		//tbl = addBordersToTable(tbl)
	}
	
	/**
	 * Build the table for the "Full documentation" style.
	 *  
	 * @param currentEClassifier the current EClass whose table must be created.
	 * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
	 * @param tbl the destination table.
	 */
	private def buildTableForFullDocumentationStyle(Element currentEClassifier, ArrayList<Node> nodeList, Tbl tbl)
	{
		for (row : 0 ..< modelElements.length) 
		{
			//A row must be added to the table only if at least one value, for
			//the features in the  current EClass in row r is not null (See below...)
			var atLeastOneValueFound = false
			
			//Create a table row
			var tr = factory.createTr
			
			//Loop the features of the current EClass
			for (k : 0 ..< nodeList.size) 
			{
				var currentEStructuralFeature = Element.cast(nodeList.get(k));
				
				//Check if the feature has been marked as excluded by user, in the launcher UI
				val s = new StringBuilder().append(currentEClassifier.getAttribute("name")).append("=>").append(currentEStructuralFeature.getAttribute("name")).toString 
				if(!excludedEStructuralFeatures.contains(s))
				{
					var key = new String(currentEClassifier.getAttribute("name") + ":" + 
										 currentEStructuralFeature.getAttribute("name") + ":" + 
										 row.toString)
								
					//Get the attribute value		 
					var tableVal = persistenceModelHashTable.get(key)
					
					if(tableVal != null)
					{
						atLeastOneValueFound = true
						
						//Create and add a new table cell to the row
						tr.content.add(createTableCell(wordMLPackage, String.cast(tableVal)))
					}
					else
						tr.content.add(createTableCell(wordMLPackage, ""))
				}
			}
			
			if(atLeastOneValueFound)
				tbl.content.add(tr)
		}
	}
	
	/**
	 * Build the documentation using the "Ordered by EClass documentation" style.
	 */
	private def BuildByEClassDocumentation(String keyEClass)
	{
		var eClassifiers = metamodelDoc.getElementsByTagName("eClassifiers");
		
		for (i : 0..< eClassifiers.length)
		{
			var currentEClassifier = Element.cast(eClassifiers.item(i));
			val currentEClassName = currentEClassifier.getAttribute("name");
			
			//Proceed only if the current eclass is equal to the key class 
			if(currentEClassName.equals(keyEClass))
			{
				//Take the features for the current EClass
				var eStructuralFeatureList = currentEClassifier.getElementsByTagName("eStructuralFeatures")
				
				//Convert Nodelist to ArrayList<Node>
				var nodeList = new ArrayList<Node>() 
			 	for (k : 0 ..< eStructuralFeatureList.length)
			 		nodeList.add(eStructuralFeatureList.item(k))
			 
				nodeList.addAll(getSuperTypeFeatures(currentEClassifier))
				
				buildTableForEClassOrderedDocumentation(currentEClassifier, nodeList)
				
				return
			}
		}
		
		
		saveTempDocxFile	
	}
	
	
	/**
	 * Build the tables for the "ordered by EClass" documentation style.
	 * 
	 * @param currentEClassifier the current EClass whose header must be created.
	 * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
	 */
	private def buildTableForEClassOrderedDocumentation(Element currentEClassifier, ArrayList<Node> nodeList)
	{
		for (row : 0 ..< modelElements.length) 
		{
			//Create the table
			var tbl = factory.createTbl
			
			//A table must be added to the documentation only if at least one 
			//attribute value is not null
			var atLeastOneAttribute = false
			
			//Take the i-th element from the model
			var ee = emptyElement.cast(modelElements.get(row))
	
			//	Get the tag name						
			var tagName = ee.tagName.rightName
			
			if(tagName.equals(keyEClass))
			{
				for(k : 0..<nodeList.length)
				{
					//Add a styled cell with the feature name to the current row
					val EClassName = currentEClassifier.getAttribute("name")
					val currentFeatureName = Element.cast(nodeList.get(k)).getAttribute("name");
					
					val headerFeature = headerFields.get(EClassName)
					
					if(headerFeature == null || !headerFeature.equals(currentFeatureName))
					{	
						var newRow = addTableRow(EClassName, currentFeatureName, row )
						
						if(newRow != null)
						{
							atLeastOneAttribute = true;
							
							//Add the row to the table
							tbl.content.add(newRow)	
						}
						else
						{
							newRow = factory.createTr
							newRow.content.add(addStyledTableCell(currentFeatureName,true,null))
							newRow.content.add(createTableCell(wordMLPackage, ""))
						}
					}	
				}
				
				if(tableBorder)
				{
					//Add the borders to the table
					tbl = addBordersToTable(tbl)
				}
			}
			
			if(atLeastOneAttribute)
			{
				//Add the table title
				wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Subtitle", currentEClassifier.getAttribute("name"));
			
				//Add the header field
				addHeaderField(row)
				
				//Add the table
				wordMLPackage.getMainDocumentPart().addObject(tbl);
				
				//Add two empty lines
				wordMLPackage.getMainDocumentPart().addObject(factory.createBr);
				wordMLPackage.getMainDocumentPart().addObject(factory.createBr);
			}
			
		}
	}
	
	/**
	 * Add the header field for a table.
	 * 
	 * @param rowIndex a row index in the persistence model.
	 */
	private def addHeaderField(int rowIndex)
	{
		var headerField = headerFields.get(keyEClass);
						
		if(headerField != null)
		{		
			var content = getHeaderFieldValue(keyEClass, headerField, rowIndex);
			
			if(content != null)
			{
				wordMLPackage.getMainDocumentPart().addStyledParagraphOfText("Header2", content);
			}
		}
	}
	
	private def addTableRow(String currentEClassName, String currentFeatureName, int rowIndex )
	{
		//Create a new table row
		var tr = factory.createTr
		
		//Add a styled cell with the feature name to the current row
		tr.content.add(addStyledTableCell(currentFeatureName,true,null))
		
		//Get the attribute value
		var key = new String(currentEClassName + ":" + 
							 currentFeatureName + ":" + 
							 rowIndex.toString)
									 
		var tableVal = persistenceModelHashTable.get(key)
		
		if(tableVal != null)
		{
			//Create and add to the current row a new cell containing the attribute value
			tr.content.add(createTableCell(wordMLPackage, String.cast(tableVal)))
			
			return tr			
		}
		else
			return null
	}
	
	
	override insertDiagramImage() 
	{
		Docx4jImageHandler.addImageToPackage(wordMLPackage, pathToDiagramImageToInclude);
		
		//Insert a page break
		var objBr = new Br();
		objBr.setType(STBrType.PAGE);
		
		wordMLPackage.getMainDocumentPart.addObject(objBr)
	}
	
	
	/**
	 * Save the documentation temp file into the project src-gen folder.
	 * The saved file will be used to copy it's content into the final project documentation file,
	 * that will be visible into the package explorer in Eclipse.
	 */
	private def saveTempDocxFile()
	{
		var f = new File(getTempFilePath() + File.separator + "temp.docx")
		
		//Save the docx file
		wordMLPackage.save(f);	
	}
	
	/**
	 * Thanks to lvdpal (http://blog.iprofs.nl/2012/09/06/creating-word-documents-with-docx4j/)
	 */
	private def addBordersToTable(Tbl table) 
	{
        table.setTblPr(new TblPr());
        var border = new CTBorder();
        border.setColor("auto");
        border.setSz(new BigInteger("4"));
        border.setSpace(new BigInteger("0"));
        border.setVal(STBorder.SINGLE);
 
        var borders = new TblBorders();
        borders.setBottom(border);
        borders.setLeft(border);
        borders.setRight(border);
        borders.setTop(border);
        borders.setInsideH(border);
        borders.setInsideV(border);
        table.getTblPr().setTblBorders(borders);
        
        return table
    }
    
    /**
     *  In this method, we once again create a regular cell, as in the previous
     *  examples.
     */
    private def createTableCell(WordprocessingMLPackage pack, String content) 
    {
        var tableCell = factory.createTc();
        tableCell.getContent().add( pack.getMainDocumentPart().createParagraphOfText(content) );
        
        return tableCell
    }
    
    /**
	 * Thanks to lvdpal (http://blog.iprofs.nl/2012/09/06/creating-word-documents-with-docx4j/)
	 */
    private def addStyledTableCell(String content, boolean bold, String fontSize) 
    {
        var tableCell = factory.createTc();
        tableCell.getContent().add( addStyling(tableCell, content, bold, fontSize) );
        return tableCell
    }
	
	/**
	 * Thanks to lvdpal (http://blog.iprofs.nl/2012/09/06/creating-word-documents-with-docx4j/)
	 */
	private def addStyling(Tc tableCell, String content, boolean bold, String fontSize) 
	{
        var paragraph = factory.createP();
 
        var text = factory.createText();
        text.setValue(content);
 
        var run = factory.createR();
        run.getContent().add(text);
 
        paragraph.getContent().add(run);
 
        var runProperties = factory.createRPr();
        if (bold) 
            runProperties = addBoldStyle(runProperties);
        
 
        if (fontSize != null && !fontSize.isEmpty()) 
            runProperties = setFontSize(runProperties, fontSize);
        
 
        run.setRPr(runProperties);
 
 		return paragraph
    }
    
    /**
     *  In this method we're going to add the font size information to the run
     *  properties. First we'll create a half-point measurement. Then we'll
     *  set the fontSize as the value of this measurement. Finally we'll set
     *  the non-complex and complex script font sizes, sz and szCs respectively.
     */
    private def setFontSize(RPr runProperties, String fontSize) 
    {
        var size = new HpsMeasure();
        size.setVal(new BigInteger(fontSize));
        runProperties.setSz(size);
        runProperties.setSzCs(size);
        
        return runProperties
    }
 
    /**
     *  In this method we'll add the bold property to the run properties.
     *  BooleanDefaultTrue is the Docx4j object for the b property.
     *  Technically we wouldn't have to set the value to true, as this is
     *  the default.
     */
    private def addBoldStyle(RPr runProperties) 
    {
        var b = new BooleanDefaultTrue();
        b.setVal(true);
        runProperties.setB(b);
       	
       	return runProperties
    }
	
}