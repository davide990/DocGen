package org.xtext.passi.generator

import java.io.File
import java.util.ArrayList
import java.util.HashMap
import java.util.Hashtable
import java.util.LinkedList
import java.util.List
import org.apache.commons.io.FilenameUtils
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.emf.common.util.EList
import org.eclipse.xtend2.lib.StringConcatenation
import org.text.passi.generationUi.DocGenAdvancedUI
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.xtext.passi.docGen.element
import org.xtext.passi.docGen.emptyElement
import org.xtext.passi.metamodels.MetamodelsLoader
import org.text.passi.generationUi.DocGenAdvancedUI.DOCUMENTATION_STYLE

/**
 * Abstract class that define the behaviour of the documentation builder. It 
 * also contains methods to help the user to build the documentation.
 *
 */
abstract class DocumentationBuilder 
{	
	/**
	 * The document representing the metamodel.
	 */
	protected Document metamodelDoc 
	
	/**
	 * The set of current model's elements.
	 */
	protected EList<element> modelElements
	
	/**
	 * The list of the EClasses that must not be included in the final documentation
	 */
	protected List<String> excludedEClasses;
	
	
	//TODO da rimuovere
	/**
	 * The list of the Features(of all EClasses) that must not be included in the final documentation
	 */
	protected List<String> excludedEStructuralFeatures;

	/**
	 * The output documentation file name, without the extension.
	 */
	protected String outputFileName

	/**
	 * The absolute path to the diagram image file to include into the documentation
	 */
	protected String pathToDiagramImageToInclude;


	protected String templateTitle;
	protected String supportedExtension;
	protected String documentationTitle;
	protected String diagramImageFile;
	protected DocGenAdvancedUI.DOCUMENTATION_STYLE documentationStyle;
	protected String keyEClass;
	protected boolean tableBorder;
	protected boolean titleSeparator;
	protected boolean includeDiagramImage;
	
	protected HashMap<String, List<String>> excludedFeatures;
	protected HashMap<String, String> featureOrder;	
	protected HashMap<String, String> headerFields;
	
	protected Hashtable<String, String>  persistenceModelHashTable


	/**
	 * Initialize a new DocBuilder object
	 * 
	 * @param outFolder the output folder where the document will be generated
	 * @param outFileName the file name of the output documentation file
	 * @param MetamodelDocument the metamodel xml document 
	 * @param ModelElementsList the set of elements in the model document
	 * @param Hashtable the data structure needed to build the documentation
	 */
	public new(Document MetamodelDocument, EList<element> ModelElementsList, Hashtable<String, String>  persistenceModelHashTable, String OutputFileName)
	{
		metamodelDoc 				= MetamodelDocument
		modelElements 				= ModelElementsList
		this.persistenceModelHashTable	= persistenceModelHashTable
		excludedEClasses 			= new ArrayList<String>()
		excludedEStructuralFeatures = new ArrayList<String>()
		outputFileName 				= FilenameUtils.removeExtension(OutputFileName)
		pathToDiagramImageToInclude	= null;
		featureOrder  				= new HashMap<String, String>();
		headerFields 				= new HashMap<String, String>();
		excludedFeatures 			= new HashMap<String, List<String>>();
		documentationStyle 			= DOCUMENTATION_STYLE.STYLE_FULL;
	}	
	//---------------------------
	
	public def setFeaturesOrder(HashMap<String, String> s)
	{
		featureOrder = s;			
	}
	
	public def setExcludedFeatures(HashMap<String, List<String>> s)
	{
		excludedFeatures = s;
	}
	
	public def setTemplateTitle(String s)
	{
		templateTitle = s;
	}
	
	public def setSupportedExtension(String s)
	{
		supportedExtension = s;	
	}
	
	public def setDocumentationTitle(String s)
	{
		documentationTitle = s;	
	}
	
	public def setTitleSeparator(boolean v)
	{
		titleSeparator = v;	
	}
	
	public def setIncludeDiagramImage(boolean v)
	{
		includeDiagramImage = v;	
	}
	
	public def setDiagramImageFile(String s)
	{
		diagramImageFile = s;	
	}
	
	public def setDocumentationStyle(DocGenAdvancedUI.DOCUMENTATION_STYLE s)
	{
		documentationStyle = s;	
	}
	
	public def setKeyEClass(String s)
	{
		keyEClass = s;	
	}
	
	public def setTableBorder(boolean v)
	{
		tableBorder = v;
	}
	
	public def AddFeatureOrderForEClass(String EClass, String FeatureOrder)
	{
		this.featureOrder.put(EClass, FeatureOrder);
	}
	
	public def AddExcludedFeatureForEClass(String EClass, String FeatureName)
	{
		var excludedFeaturesList = excludedFeatures.get(EClass);
		
		if(excludedFeaturesList.nullOrEmpty)
		{
			excludedFeaturesList = new ArrayList<String>();
			excludedFeaturesList.add(FeatureName);
			excludedFeatures.put(EClass, excludedFeaturesList);
			return;
		}
		
		if(excludedFeaturesList.contains(FeatureName))
			return;
			
		excludedFeaturesList.add(FeatureName);
		excludedFeatures.remove(EClass);
		excludedFeatures.put(EClass, excludedFeaturesList);
	}
	
	public def setHeaderFieldForEClass(String EClass, String featureName)
	{
		headerFields.put(EClass, featureName);
	}
	
	
	//---------------------------
	/**
	 * Set the list of EClass that must not be included in the final documentation.
	 */
	def public SetExcludedEClasses(List<String> c)
	{
		excludedEClasses.clear
		excludedEClasses.addAll(c)
	}
	
	protected def removeNodeFromNodeList(List<Node> list, String attributeName)
	{
		var toRemoveID = -1;
		for(int id : 0 ..< list.length)
		{
			if(Element.cast(list.get(id)).getAttribute("name").equals(attributeName))
				toRemoveID = id;
		}
		
		if(toRemoveID != -1)
			list.remove(toRemoveID);
	}
	
	protected def getHeaderFieldValue(String currentEClassName, String currentFeatureName, int rowIndex)
	{
		//Get the key for the hash table
		var key = new String(currentEClassName + ":" + 
							 currentFeatureName + ":" + 
							 rowIndex.toString)
							 
		var value = persistenceModelHashTable.get(key)
						
		//value.replace("&#xD;&#xA;", Environment.NewLine)
								
		if(value != null)
			return value.toString
		
		return null	
	}
		
	/**
	 * Set the path to the diagram image file to include in the output documentation.
	 */
	def public setPathToDiagramImageFileToInclude(String path)
	{
		if(path != null && !path.empty)
			pathToDiagramImageToInclude = path;
	}
	
	/**
	 * This method define the template for the documentation. Put into this method all
	 * the necessary information (in form of string into a StringConcatenation object)
	 * that make up the final documentation.
	 */
	def public StringConcatenation BuildDocumentation()
	
	
	/**
	 * An abstract method that handle the diagram image insertion
	 * into the documentation. This task depends on the type of the
	 * output documentation.
	 */
	def public void insertDiagramImage()
	
	
	/**
	 * Check if in the current model document exists an element corresponding
	 * to the EClass specified by the EClassifierName string value
	 */
	def protected boolean existsElementInModel(String EClassifierName)
	{
		//search for all model elements
		for (i : 0 ..< modelElements.length)
		{
			var ee = emptyElement.cast(modelElements.get(i))
			if(ee.tagName.rightName.equals(EClassifierName))
				return true 
		}
		
		return false;
	}
	
	/**
	 * Return a list containing all the features of the input EClass and
	 * of all the parents EClass.
	 */
	def protected List<Node> getSuperTypeFeatures(Element eclassifier)
	{
		var nodeList = new ArrayList<Node>()
		
		var superTypeString = eclassifier.getAttribute("eSuperTypes")
		
		//if the current EClass doesn't contains an attribute "eSuperTypes",
		//return an empty list
		if(superTypeString.empty)
			return nodeList
	
		//parse the value of the attribute eSuperTypes
		var superTypesList = parseSuperTypesString(superTypeString)
		
		//loop every parent EClass 
		for (superType : superTypesList)
		{
			//Search for the EClass in the metamodel
			var eClassifier = getEClassByName(superType);
			
			if(eClassifier != null)
			{
				//take all the features
				var eStructuralFeatureList = eClassifier.getElementsByTagName("eStructuralFeatures")
				
				//Add them to the feature list
				for(k : 0 ..< eStructuralFeatureList.length)
					nodeList.add(eStructuralFeatureList.item(k))
				
				//Recursive call on [superType] 
				nodeList.addAll( getSuperTypeFeatures(getEClassByName(superType)) )
				
			}
		}
	
		return nodeList
	}
	
	/**
	 * Given a tag name from the model, that is, "Actor" for the 
	 * following example:
	 * <pre>
	 * {@code
	 * <passiseq:Actor name="NewActor1" List_RAMessagesOut="/3"/>
	 * }
	 * </pre>
	 * search for an EClass in the metamodel that has the same name.
	 * 
	 * @return the corresponding EClass element in the metamodel. If no EClass is found, return null.
	 */
	def protected Element getEClassByName(String tagName)
	{
		var listEclassifier = metamodelDoc.getElementsByTagName("eClassifiers")
		var length = listEclassifier.length
		
		for (i : 0 ..< length) 
		{
			var node = Element.cast(listEclassifier.item(i));
			var name = node.getAttribute("name");
			
			if(name.equals(tagName))
				return node;
		}
		
		return null
	}
	
	/**
	 * Given a string s that represents the super type value of the 
	 * attribute of a EClass, for example
	 * 
	 * <pre>
	 * eSuperTypes="#//Partecipant/Actor/"
	 * </pre>
	 * 
	 * Parse the string and return a list containing the parent Eclasses.
	 * For the previous example, the returned list contains
	 * "Partecipant" and "Actor" strings.
	 */
	def public static LinkedList<String> parseSuperTypesString(String s)
	{
		var l = new LinkedList<String>
		
		//Remove the chars "#/"
		var newString = s.substring(2)
		
		//Split the string by "/" character
		var SplittedString = newString.split("/")
		
		//Add every word to the linked list
		for (String word : SplittedString)
			if(!word.empty)
				l.add(word)
		
		return l
	}
	
	
	/**
	 * Get the absolute file system path to the folder where the temp output
	 * documentation file will be saved. 
	 * <br></br>
	 * The folder name is project root directory
	 */
	public static def String getTempFilePath()
	{
		var root = ResourcesPlugin.getWorkspace().getRoot();
		var project = root.getProject(MetamodelsLoader.ProjectName);
		
		//Get the complete path to the destination output folder
		return        root.getLocation().toFile().toString() + 
					  File.separator +
					  project.getName()
	}
	
}