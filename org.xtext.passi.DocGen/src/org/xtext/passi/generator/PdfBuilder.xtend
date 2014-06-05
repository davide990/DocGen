package org.xtext.passi.generator

import org.xtext.passi.docGen.emptyElement
import com.itextpdf.text.BaseColor
import com.itextpdf.text.Document
import com.itextpdf.text.Font
import com.itextpdf.text.Paragraph
import com.itextpdf.text.Phrase
import com.itextpdf.text.pdf.PdfPCell
import com.itextpdf.text.pdf.PdfPTable
import com.itextpdf.text.pdf.PdfWriter
import java.io.File
import java.io.FileOutputStream
import java.util.ArrayList
import java.util.Hashtable
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend2.lib.StringConcatenation
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.xtext.passi.docGen.element
import com.itextpdf.text.Chunk
import com.itextpdf.text.pdf.draw.LineSeparator
import com.itextpdf.text.Image
import org.text.passi.generationUi.DocGenAdvancedUI

class PdfBuilder extends DocumentationBuilder
{
	private val titleFont 			= new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD,		new BaseColor(23,54,93));
	private val subtitleFont 		= new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.ITALIC,	new BaseColor(79,129,189));
	private val tableHeaderFont 	= new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, 		BaseColor.BLACK);
	private val tableHeaderFont2 	= new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.ITALIC, 	BaseColor.LIGHT_GRAY);
	
	private Document document;
	
	new(org.w3c.dom.Document MetamodelDocument, EList<element> ModelElementsList, Hashtable HashTable, String OutputFileName) 
	{
		super(MetamodelDocument, ModelElementsList, HashTable, OutputFileName)
	}
	
	
	override BuildDocumentation()
	{			
		//Create a PDF document
		document = new Document();
      	PdfWriter.getInstance(document, new FileOutputStream(tempFilePath + File.separator + "temp.pdf"));
      	document.open();
				
		//Add an empty line
		var p = new Paragraph
		p.add(new Paragraph(" "));
		
		//Add the title
		if(documentationTitle.nullOrEmpty)	
			p.add(new Paragraph(outputFileName,titleFont))		
		else		
			p.add(new Paragraph(documentationTitle,titleFont))
		
		//Add a line separator
		if(titleSeparator)
			p.add(new Chunk(new LineSeparator));
			
		//Add an empty line
		p.add(new Paragraph(" "));
		document.add(p)
			
		if(includeDiagramImage)
		{
			//insert the diagram image
			if(pathToDiagramImageToInclude != null)
				insertDiagramImage()
		}
		
		if( documentationStyle == DocGenAdvancedUI.DOCUMENTATION_STYLE.STYLE_BY_ECLASS )
			BuildByEClassDocumentation(keyEClass)
		else
			BuildFullDocumentation();
		
		document.close
		
		return new StringConcatenation
	} 
	
	
	/**
	 * Build the documentation using the "Full documentation" style. Using this style, the documentation
	 * will be composed by many tables, each one for a different EClass. 
	 */
	private def BuildFullDocumentation()
	{
		var eClassifiers = metamodelDoc.getElementsByTagName("eClassifiers");
		for (i : 0..< eClassifiers.length)
		{
			//Get the current EClass
			var currentEClassifier = Element.cast(eClassifiers.item(i));
			val currentEClassName = currentEClassifier.getAttribute("name");
			
			//check if the current EClass has been marked as excluded from user in the launcher UI
			if(!excludedEClasses.contains(currentEClassName))
			{
				//Check if exists in the model a tag corresponding to the current EClass
				if(existsElementInModel(currentEClassName))
				{
					//Take the EClass features
					var eStructuralFeatureList = currentEClassifier.getElementsByTagName("eStructuralFeatures")
					
					//Convert Nodelist to ArrayList
					var nodeList = new ArrayList<Node>() 
				 	for (k : 0 ..< eStructuralFeatureList.length)
				 		nodeList.add(eStructuralFeatureList.item(k))

					nodeList.addAll(getSuperTypeFeatures(currentEClassifier))
					
					//Add the table name to the document
					document.add(new Paragraph(currentEClassName,subtitleFont));
					document.add(new Paragraph(" "))
					
					//Create a table with nodeList.size columns
					var table = new PdfPTable(nodeList.size)
 
					buildTableHeaderForFullDocumentationStyle(currentEClassName, nodeList, table);
					
					//Build a table for each EClass in the metamodel
					buildTableForFullDocumentationStyle(currentEClassifier, nodeList, table);
					
					//Add the table to the document
					document.add(table)
					
					//Add two empty lines
					document.add(new Paragraph(" "))
					document.add(new Paragraph(" "))
				}
			}
		}
	}
	
	
	/**
	 * Add the header to a table, containing in each column the name of the EStructuralFeature of an EClass.
	 * 
	 * @param currentEClassName the name of the current EClass whose header must be created.
	 * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
	 * @param table the destination table.
	 */
	private def buildTableHeaderForFullDocumentationStyle(String currentEClassName, ArrayList<Node> nodeList, PdfPTable table)
	{
		for (k : 0 ..< nodeList.size) 
		{
			//Take the k-th feature
			var currentEStructuralFeature = Element.cast(nodeList.get(k));
			
			//Check if the feature has been marked as excluded by user, in the launcher UI
			val s = new StringBuilder().append(currentEClassName)
									   .append("=>")
									   .append(currentEStructuralFeature.getAttribute("name")).toString
									    
			if(!excludedEStructuralFeatures.contains(s))
			{
				//Get the feature name
				var featName = currentEStructuralFeature.getAttribute("name")
				
				//Add the feature name to the table header row							
				var tableCell = new PdfPCell(new Phrase(featName, tableHeaderFont))
				tableCell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
				
				table.addCell(tableCell)
			}
		}
	}
	
	/**
	 * Build the table for the "Full documentation" style.
	 *  
	 * @param currentEClassifier the current EClass whose table must be created.
	 * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
	 * @param table the destination table.
	 */
	private def buildTableForFullDocumentationStyle(Element currentEClassifier, ArrayList<Node> nodeList, PdfPTable table)
	{
		for (r : 0 ..< modelElements.length) 
		{
			//A row must be added to the table only if at least one value, for
			//the features in the  current EClass in row r is not null (See below...)
			var atLeastOneValueFound = false
			
			//Create a new array of table cell
			var cellList = new ArrayList<PdfPCell>
			
			//Loop the features of the current EClass
			for (k : 0 ..< nodeList.size) 
			{
				//get the k-th feature
				var currentEStructuralFeature = Element.cast(nodeList.get(k));
				
				//Check if the feature has been marked to be excluded
				val s = new StringBuilder().append(currentEClassifier.getAttribute("name")).append("=>").append(currentEStructuralFeature.getAttribute("name")).toString 
				if(!excludedEStructuralFeatures.contains(s))
				{
					var key = new String(currentEClassifier.getAttribute("name") + ":" + 
										 currentEStructuralFeature.getAttribute("name") + ":" + 
										 r.toString)
					
					//Get the attribute value in the hash table						 
					var tableVal = persistenceModelHashTable.get(key)
					
					//If not null
					if(tableVal != null)
					{
						//At least one value for the current row has been found, so the row,
						//at the end, must be added to the table.
						atLeastOneValueFound = true
						
						//Add the attribute value to the table cell
						var tableCell = new PdfPCell(new Phrase(tableVal.toString))
						tableCell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
						cellList.add(tableCell)
					}
					else
						//If null, add an empty table cell to the row
						cellList.add(new PdfPCell())
				}
			}
			
			//Do not add a table row if at least an attribute for the current row is not 
			//null
			if(atLeastOneValueFound)
			{
				for (cell : cellList)
					table.addCell(cell) 
			} 
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
			 
			if(currentEClassName.equals(keyEClass))
			{
				//Take the features for the current EClass
				var eStructuralFeatureList = currentEClassifier.getElementsByTagName("eStructuralFeatures")
				
				//Convert Nodelist to ArrayList<Node>
				var nodeList = new ArrayList<Node>() 
			 	for (k : 0 ..< eStructuralFeatureList.length)
			 		nodeList.add(eStructuralFeatureList.item(k))
			 
			 	nodeList.addAll(getSuperTypeFeatures(currentEClassifier));
				
				var headerFieldName = headerFields.get(keyEClass);
				
				if(headerFieldName != null)
					removeNodeFromNodeList(nodeList, headerFieldName);
				
				//Once found the right EClass whose documentation must be builder, proceed with
				//the creation of the tables containing the informations.
				buildTableForEClassOrderedDocumentation(currentEClassName,headerFieldName,nodeList);
				
				//Nothing left to do!
				return
			}
		}
	}
	
	/**
	 * Build the tables for the "ordered by EClass" documentation style.
	 * 
	 * @param currentEClassName the name of the current EClass whose header must be created.
	 * @param headerFieldName the name of the feature whose value must be placed before the table.
	 * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
	 */
	private def buildTableForEClassOrderedDocumentation(String currentEClassName, String headerFieldName, ArrayList<Node> nodeList)
	{
		for (row : 0 ..< modelElements.length)
		{
			//Create a table with 2 columns
			var table = new PdfPTable(2)
			
			//A table must be added to the documentation only if at least one 
			//attribute value is not null
			var atLeastOneAttribute = false
			
			//Take the i-th element from the persistence model
			var ee = emptyElement.cast(modelElements.get(row))
	
			//Get the tag name						
			var tagName = ee.tagName.rightName
			
			if(tagName.equals(keyEClass))
			{
				var feature_order 	= featureOrder.get(keyEClass);
				var excludedFeature = excludedFeatures.get(keyEClass);	
				
				if(!feature_order.nullOrEmpty)
				{
					//Itero sulla feature ordinate
					for(String f : feature_order.split(","))
					{
						if(excludedFeature.nullOrEmpty || !excludedFeature.contains(f))
						{
							if( !headerFieldName.equals(f) )
							{
								if(addTableRow(table,currentEClassName,f,row))
									atLeastOneAttribute = true;	
							
								removeNodeFromNodeList(nodeList, f);
							}
						}
					}
				}
				
				for(k : 0..<nodeList.length)
				{
					val currentFeatureName = Element.cast(nodeList.get(k)).getAttribute("name");
					
					if(excludedFeature.nullOrEmpty || !excludedFeature.contains(currentFeatureName))
					{
						if(addTableRow(table,currentEClassName,currentFeatureName,row))
							atLeastOneAttribute = true;
					}	
				}
			}
			
			if(atLeastOneAttribute)
			{
				//Add the table title
				document.add(new Paragraph(currentEClassName,subtitleFont));
				document.add(new Paragraph(" "))
				
				//Add the header field
				addHeaderField(row);
				
				document.add(new Paragraph(" "))
				
				//Add the table to the document
				document.add(table)
				
				//Add two empty lines
				document.add(new Paragraph(" "))
				document.add(new Paragraph(" "))
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
				document.add(new Paragraph(content, tableHeaderFont2));
		}
	}
	
	
	private def boolean addTableRow(PdfPTable table, String currentEClassName, String currentFeatureName, int rowIndex )
	{
		var atLeastOneAttribute = false;
		
		//Create a cell for the attribute name
		var tableCell = new PdfPCell(new Phrase(currentFeatureName, tableHeaderFont))
		table.addCell(tableCell);
							
		//Get the key for the hash table
		var key = new String(currentEClassName + ":" + 
							 currentFeatureName + ":" + 
							 rowIndex.toString)
											
															 
		//Get the attribute value
		var tableVal = persistenceModelHashTable.get(key)
								
		if(tableVal != null)
		{
			//Create a table cell with the attribute value
			tableCell = new PdfPCell(new Phrase(tableVal.toString))
			table.addCell(tableCell)
									
			//the table must be added in the documentation, since
			//this value is not null.
			atLeastOneAttribute = true;
		}
		else
			table.addCell(new PdfPCell())
						
		return atLeastOneAttribute;			
	}
	
	
	override insertDiagramImage() 
	{
		var image = Image.getInstance(pathToDiagramImageToInclude)
		
		//Calculate the scale factor for the diagram image to fit it into the page.
		var scaler = ((document.getPageSize().getWidth() - document.leftMargin()
               - document.rightMargin()) / image.getWidth()) * 100;
		
		//Scale the image
		image.scalePercent(scaler)
		
		//Add to document
		document.add(image)
		
		//Add a page break
		document.newPage
	}
	
	
}