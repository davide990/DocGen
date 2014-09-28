/*
 * generated by Xtext
 */
package org.xtext.passi.generator

import java.io.File
import java.io.FileInputStream
import java.util.ArrayList
import java.util.Hashtable
import java.util.LinkedList
import java.util.List
import java.util.regex.Pattern
import javax.xml.parsers.DocumentBuilderFactory
import org.apache.commons.io.FilenameUtils
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.QualifiedName
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.PlatformUI
import org.eclipse.xtend2.lib.StringConcatenation
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.text.passi.generationUi.DocGenLauncher
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import org.xtext.passi.DocGenStandaloneSetup
import org.xtext.passi.docGen.Attribute
import org.xtext.passi.docGen.Model
import org.xtext.passi.docGen.element
import org.xtext.passi.docGen.emptyElement
import org.xtext.passi.metamodels.MetamodelsLoader
import org.xtext.passi.PassiPersistentModelExtensions
import org.xtext.passi.MetamodelKeyAttributes
import javax.sound.sampled.BooleanControl.Type

/**
 * Main class for documentation generation. It includes the entry point
 * method called when doc generation is selected from the eclipse
 * workspace (toolbar, menu or contextual menu).
 * 
 * @author Davide Guastella (<i>davide.guastella90@gmail.com</i>)
 */
class DocGenGenerator implements IGenerator
{
	String selectedModelFullPath;
	
	Model modelToCompile;
	
	/**
	 * la uso perchè memorizzo informazioni personalizzate su eclass feature e riga corrente,
	 * visto che devo generare la doc. tabella per tabella...
	 * 
	 * This hash table contains the informations needed for building the
	 * documentation, such the EClass name, the row and the value of 
	 * every element in the persistence model document.
	 * 
	 * Every entry is in the form of:
	 * <pre>
	 * {<i>Key:</i> [EClassName:AttributeName:CurrentRowInModel], <i>value:</i> AttributeValue}
	 * </pre>
	 * The value <i>AttributeValue</i> of the entry is the value of the attribute <i>AttributeName</i>.
	 */
	private Hashtable<String, String>  persistenceModelHashTable
		
	/**
	 * The name space of the model that must be converted
	 */ 
	private String ModelNameSpace
	
	/**
	 * The absolute path to the metamodel referenced by the model that has to be converted
	 */
	private String metamodelFileName
	
	/**
	 * The document representing the metamodel.
	 */
	private static Document metamodelDoc
	
	/**
	 * The set of current model's elements.
	 */
	private EList<element> modelElements
	
	
	private DocGenLauncher launcherUI;
	
	/**
	 * This is a list of strings containing the name of the EClasses that must not be included
	 * in the final documentation.
	 */
	private List<String> excludedEClasses;
	
	/**
	 * This is a list of strings containing the name of the EStructuralFeatures that must not be included
	 * in the final documentation. Every string is in the form of
	 * 
	 * <pre>
	 * "[ECLASS],[ESTRUCTURALFEATURE]"
	 * </pre>
	 */
	private List<String> excludedFeatures;
	
	/**
	 * The type of the generated documentation.
	 */
	private String outputDocumentationType
	
	
	/**
	 * The list containing the EClass nodes from the metamodel used
	 * to compile the selected persistence model file.
	 */
	private NodeList EClassList;
	
	/**
	 * This list contains the name of the EClasses which must be ignored during the 
	 * documentation generation process.
	 */
	private List<String> ignoredEclasses;
	
	
	/**
	 * Entry point. This function is called when user select "Generate Documentation" from the
	 * contextual menu or the tool bar. It reads the metamodel informations, builds the 
	 * necessary data structure and opens the launcher window.
	 */
	override void doGenerate(Resource resource, IFileSystemAccess fsa) 
	{
		persistenceModelHashTable 			= new Hashtable
		excludedFeatures 					= new ArrayList
		excludedEClasses 					= new ArrayList
		ignoredEclasses 					= new ArrayList
		outputDocumentationType 			= ""
		
		
		setIgnoredEClasses
		
		//Before reading the persistence models, (re)load the metamodels.
		//If no metamodel path is set, ReloadMetamodels method returns false,
		//then show an error message dialog.
		if(!MetamodelsLoader.ReloadMetamodels)
		{
			MessageDialog.openError(new Shell,"DocGen Error","Can't load the metamodel for the selected file. Please ensure the path to the metamodels folder is set. (Right-click project->Properties->Metamodels");
			return;
		}
		
		//Check if the selected file in the project outline is a valid model file.
		//If not, show an error message.
		if(!isValidModelFile)
		{
			MessageDialog.openError(new Shell,"DocGen Error","The selected file is not a valid model file.")
			return;
		}

		//Add the selected persistence model file to the plugin resource. This is needed
		//since handling the model files automatically makes the graphiti editor 
		//not working.
		var injector 		= new DocGenStandaloneSetup().createInjectorAndDoEMFRegistration()
		var resourceSet 	= injector.getInstance(typeof(XtextResourceSet))
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE)
		var res 			= resourceSet.getResource(URI.createFileURI(selectedModelFullPath),true)
		resource.load(new FileInputStream(selectedModelFullPath), resourceSet.loadOptions)
		
		//TODO rimuovere
		println('\n\nmodel registered\n\n');
		
		var eobj = res.getContents().get(0);
		try
		{
			modelToCompile = Model.cast(eobj);
		}
		catch(ClassCastException e)
		{
			println("ClassCastException");
		}
				
		//Load the metamodel
		metamodelDoc = loadMetamodelFileFromPersistenceModelXMLnameSpaceAttribute(modelToCompile.xmldoc.get(0));
		
		//If something gone wrong while loading the metamodel, do not continue
		if(metamodelDoc == null)
		{
			MessageDialog.openError(new Shell,"DocGen Error","No metamodel loaded for the selected persistence model.");
			return;
		}
		
		//Get the EClasses list from the metamodel document
		EClassList = metamodelDoc.getElementsByTagName("eClassifiers");

		//Build the data structure containing the persistence model informations
		//needed to produce the output documentation.
		buildPersistenceModelHashTable
		
		//Create and open a new launcher window. As parameter pass the
		//extension of the selected diagram file.
		launcherUI = new DocGenLauncher(FilenameUtils.getExtension(selectedModelFullPath), persistenceModelHashTable);
		
		launcherUI.setMetamodelDoc(metamodelDoc)
		launcherUI.setModelElements(modelElements);
		launcherUI.open
	}
	
	/**
	 * Ignore an EClass during the documentation generation process.
	 */
	private def setIgnoredEClasses()
	{
		ignoredEclasses.add("ResponsibleFor");
		//ignoredEclasses.add(EClassName);
	}
	
	/**
	 * Check if the selected file in the project outline is a persistence model.
	 * 
	 * @return True if the selected file's extension correspond to a valid model extension: drd,ai,rid.
	 * Return false otherwise.
	 */
	private def isValidModelFile()
	{
		//Get the active workbench window
		var window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		
		//get selection service
		var service = window.getSelectionService();
		
		//get the selection
		var selection = IStructuredSelection.cast(service.getSelection());
		
		if (selection instanceof IStructuredSelection)
		{
			var structuredSelection = IStructuredSelection.cast(selection);
			var firstElement = structuredSelection.getFirstElement();
		
			if (firstElement instanceof IFile)
			{
				//Get the selected file
				var file = IFile.cast(firstElement)
				
				//Get the handle to the runtime eclipse workspace
				var root = ResourcesPlugin.getWorkspace().getRoot();
		
				//Get the selected file full-path
				selectedModelFullPath = root.getLocation().toFile().toString() +
										file.fullPath.toString;
				
				//Get the selected file extension
				var fileExtension = FilenameUtils.getExtension(file.name)
				
				//Check if the selected file extension is supported by the plugin
				if(PassiPersistentModelExtensions.isPersistentModelExtension(fileExtension.toLowerCase))
					return true;			
			}
		}
		return false;
	}
		
	/**
	 * Extract from the model all the necessary informations to build 
	 * the documentation.
	 * <br></br>
	 * This method reads the xml namespace, into the model file to compile, and
	 * load the related metamodel file where to find the necessary informations to
	 * build the documentation.
	 */
	def Document loadMetamodelFileFromPersistenceModelXMLnameSpaceAttribute(element e)
	{
		if(e.start == null)
			throw new Exception("metamodel namespace information not found. May your diagram has only one element?");
			
		if(!e.start.attributes.empty)
		{
			for(att : e.start.attributes)
			{
				//Search for the metamodel from which to take the informations about the
				//elements of the persistence model to compile
				if(att.name.equals("xmlns") && !att.rightName.equals("xmi"))
				{
					//set the metamodel document to look at when generating 
					//documentation for the selected model
					this.metamodelFileName = getMetamodelAbsolutePath(att.^val)
					
					if(this.metamodelFileName == null)
					{
						MessageDialog.openError(new Shell,"DocGen Error","No metamodel loaded for the selected persistence model.");
						throw new Exception("[DOCGEN ERROR] No metamodel loaded for the selected persistence model.");
					}
					
					var docBuildFactory = DocumentBuilderFactory.newInstance();
					var docBuilder		= docBuildFactory.newDocumentBuilder();
	
					//Load the xml metamodel document and parse it
					var metamodelDoc = docBuilder.parse(new File(metamodelFileName));
					metamodelDoc.getDocumentElement().normalize();
					
					//Set the value of modelElements. It is the set of all the model elements
					modelElements = e.innerElement
					
					return metamodelDoc
				}
			}
		}
		else
			throw new Exception("[DOCGEN ERROR] xmi:XMI tag not found in the persistence model file. Aborting.");
		
		return null
	}
	 
	/**
	 * Build the hash table for the persistence model. Every entry
	 * in the hash table is in the form: 
	 * <br></br>
	 * [EClass:EStructuralFeature:RowIndex , attributeValue]
	 */
	def buildPersistenceModelHashTable()
	{
		persistenceModelHashTable.clear
		
		//get the number of elements in the model
		var numElements = modelElements.length
			/*	
		var xmiTagFound = false;  
		
		for (i : 0 ..< numElements)
		{ 
			if(modelElements.get(i).start.tagName.name.equals("xmi"))
				xmiTagFound = true;
		}	
		
		if(!xmiTagFound)
		{
			throw new Exception("xmi tag not found. May your diagram has only one element?");
		}*/
		
		for (i : 0 ..< numElements)
		{
			insertPersistentModelElementInHashTable(modelElements.get(i), i)
			
		}		
	}
	
	/**
	 * Read the informations of the element [e] from the persistent model (EClass name and attributes), 
	 * and insert these informations into the hash table data structure. Every entry in the hash 
	 * table is in the form: 
	 * <br></br>
	 * {@code
	 * [EClass:EStructuralFeature:RowIndex , attributeValue]
	 * }
	 * 
	 * @param currentRow The row where element <i>e</i> is located in the persistence model. Please note
	 * that the row count starts from the first element in the metamodel (the xml prolog is not cosidered).
	 * @param e The grammar element representing a persistence model element. 
	 */
	private def insertPersistentModelElementInHashTable(element e, int currentRow)
	{
		//Cast e to emptyElement. Model elements are only of type emptyElement. 
		//See the xText grammar for reference.
		if(e instanceof emptyElement)
		{
			var persistenceModelElement = emptyElement.cast(e)
			
			//Get the tag name. The value of this variable is the
			//EClass name.
			val EClassName = persistenceModelElement.tagName.rightName
			
			if(ignoredEclasses.contains(EClassName))
				return;
			
			//persistenceModelElement.attributes
			
			//Get the corresponding EClass object in the metamodel
			val eClassifier = getEClassByName(EClassName);
			
			 //Get the Feature list of the current EClass
			 var eStructuralFeatureList = eClassifier.getElementsByTagName("eStructuralFeatures")
			 
			 //Convert eStructuralFeatureList from NodeList to Arraylist<Node>
			 var nodeList = new ArrayList<Node>() 
			 for (k : 0 ..< eStructuralFeatureList.length)
			 	nodeList.add(eStructuralFeatureList.item(k))

			 //Add to the feature list the features of all the parent EClasses
			 nodeList.addAll(getParentEClassFeatures(eClassifier))
			 
			 //Loop on the EStructuralFeature list of the current EClass
			 for (i : 0 ..< nodeList.size) 
			 {
			 	//get the i-th feature (EStructuralFeature)
			 	var esf = Element.cast(nodeList.get(i));
			 	
			 	//Search for an attribute that has the same name of the current
			 	//feature name
			 	for(Attribute attr : persistenceModelElement.attributes)
			 	{
			 		if(esf.getAttribute("name").equals(attr.name))
			 		{			 			
			 			//Get the type of the attribute
			 			var type = esf.getAttribute("xsi:type").substring(6);
			 			
			 			//Get the attribute value
			 			var attributeValue = attr.^val;
			 			
			 			//If type is EReference, process it's value
			 			if(type.equals("EReference"))
			 			{
			 				var str = new StringConcatenation
			 				
			 				if(EClassName.equals("Agent"))
			 				{
			 					var a = 1;
			 					a=2;
			 				}
			 				print("attr.^val: ");println(attr.^val);
			 				val attributeValues = processEReferencePointerAttribute(attr.^val);
			 				if(attributeValues.size > 0)
			 				{
				 				for(t : 0 ..< attributeValues.size-1)
				 				{
				 					str.append(attributeValues.get(t))
				 					str.append(", ")
				 				}
				 				
				 				str.append(attributeValues.get(attributeValues.size-1))
				 				attributeValue = str.toString
			 				}
			 			}
			 			//Insert a new entry in the hash table
			 			persistenceModelHashTable.put(new String(EClassName + ":" + 
			 									 				 attr.name  + ":" + 
			 									 				 currentRow.toString), 
			 						 	 			  attributeValue);			 			
			 		}
			 	} 
			 }
		}
		
	}
	
	/**
	 * Check if an attribute (more precisely,an EStructuralFeature element in the metamodel) 
	 * if an EReference attribute.
	 */
	private def boolean isEReferenceAttribute(String EClassName, String AttributeName)
	{
		//Get the corresponding EClass object in the metamodel
		val eClassifier = getEClassByName(EClassName);
		
		//Get the feature list of the current EClass
		var eStructuralFeatureList = eClassifier.getElementsByTagName("eStructuralFeatures")
		 
		//Convert eStructuralFeatureList from NodeList to Arraylist<Node>
		var nodeList = new ArrayList<Node>() 
		for (k : 0 ..< eStructuralFeatureList.length)
			nodeList.add(eStructuralFeatureList.item(k))

		//Add to the feature list the features of all the parent EClasses
		nodeList.addAll(getParentEClassFeatures(eClassifier))
		 
		//Search for the EStructuralFeature which type must be checked
		for (i : 0 ..< nodeList.size) 
		{
		 	//get the i-th feature (EStructuralFeature)
		 	var esf = Element.cast(nodeList.get(i));
		 	
	 		if(esf.getAttribute("name").equals(AttributeName))
	 		{			
	 			//Get the attribute type
	 			var type = esf.getAttribute("xsi:type").substring(6);
	 			
	 			//Return true if the attribute type is EReference
	 			if(type.equals("EReference"))
	 				return true;
	 		}
		}
		
		return false;
	}
	
	/**
	 * Return a list containing all the features (EStructuralFeature) of an EClass and
	 * of all its parent EClasses.
	 */
	public static def List<Node> getParentEClassFeatures(Element eclassifier)
	{
		var nodeList 			= new ArrayList<Node>()
		var superTypeString 	= eclassifier.getAttribute("eSuperTypes")
		
		//if the current EClass doesn't contains an attribute "eSuperTypes",
		//return an empty list
		if(superTypeString.empty)
			return nodeList
	
		//parse the value of the attribute eSuperTypes
		var superTypesList = DocumentationBuilder.parseSuperTypesString(superTypeString)
		
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
				
				//Recursive call on super type 
				nodeList.addAll( getParentEClassFeatures(getEClassByName(superType)) )
			}
		}
	
		return nodeList
	}
	
	/**
	 * Given an attribute of EReference type, process the string of pointers
	 * (that is, the value of the attribute) and return a list containing 
	 * the names of the referenced tag in the model document, 
	 * in the same order as in the pointer list.
	 */
	def List<String> processEReferencePointerAttribute(String attributeVal)
	{
		var listString = new ArrayList<String>();
		
		//Parse the attribute string and obtain a list of all the pointers.
		var ids = getIdList(attributeVal);
		
		//loop over the IDs
		for(i : ids)
		{
			//Take the i-th element from the persistence model 
			var EClass 		= emptyElement.cast(modelElements.get(i))
			val EClassName 	= EClass.tagName.rightName
			
			//Loop every attribute in the current persistence model element
			for(Attribute attr : EClass.attributes)
			{
				//if attr is a key attribute, append it's value to the string 
				if(MetamodelKeyAttributes.isKeyAttribute(attr.name))
				{
					print("Eclass: ");println(EClassName);
						print("Attribute: ");println(attr.name);
					//if attr is an EReference attribute, then parse it's content.
					if(isEReferenceAttribute(EClassName, attr.name))
					{
						println("EReference attribute!");
						listString.addAll(processEReferencePointerAttribute(attr.^val));
					}
					else
					{
						//otherwise append it's value
						if(!attr.^val.empty)
							listString.add(attr.^val)
					}
				}
			}
		}
		
		return listString;
	}
	
	
	/**
	 * Given the namespace of the model, try to get the referencing metamodel
	 * absolute path.
	 * 
	 * @param nsName the namespace of the persistence model which documentation must be generated. This information
	 * is found in the persistence model prolog. For example:
	 * <br></br>
	 * 
	 * {@code
	 * <xmi:XMI ... xmlns:drd="http://drd/1.0">
	 * }
	 */
	def getMetamodelAbsolutePath(String nsName)
	{
		//Set the model namespace
		ModelNameSpace = nsName
		
		//Get the project resource
		var root = ResourcesPlugin.getWorkspace().getRoot();
		
		//Get the handle to the project
		var projectName = MetamodelsLoader.ProjectName;
		var project = root.getProject(projectName);
		
		//Get the metamodels folder 
		var metamodelsFolder = project.getFolder("Metamodels");
		
		
		//Get the referencing metamodel file name
		var metamodelFname = project.getPersistentProperty(new QualifiedName( MetamodelsLoader.ProjectName,
														    				  ModelNameSpace ));
		if(metamodelFname == null)
			return null
			
		//Get the complete path to the metamodel
		return root.getLocation().toFile().toString() +		//Absolute path to the project folder 
					   		  		 metamodelsFolder.getFullPath().toString() + 	//destination folder inside the project
					   		  		 File.separator + 								//separator
					   		  		 metamodelFname;
	}
	
	/**
	 * Given an element e representing an EClass tag from the metamodel,
	 * search for a feature contained in the specified EClass that has the same
	 * name as the [name] input attribute.
	 * 
	 * @return the eStructuralFeatures element that has the specified name. Null if no feature is found. 
	 */
	def Element getEStructuralFeature(Element e, String name)
	{
		//take the EClass features
		var eStructFeatList = e.getElementsByTagName("eStructuralFeatures");
		var numeStructFeatList = eStructFeatList.getLength();
		
		//loop the EClass attributes		
		for (i : 0 ..< numeStructFeatList) 
		{
			var node = Element.cast(eStructFeatList.item(i));
			
			//if the attribute name is equal to the specified input name
			if(node.getAttribute("name").equals(name))
			{
				//return the Feature node
				return node;
			}
		}
		
		return null
	}
	
	/**
	 * Given an element e representing an eClassifier tag from the metamodel,
	 * return the type of this element, without the string "ecore:".
	 */
	def String getEStructuralFeatureTypeAttribute(Element e)
	{
		return e.getAttribute("xsi:type").substring(6);
	}
	
	/**
	 * Given a tag name from the persistence model, that is, "Actor"  
	 * in the following example:
	 * <pre>
	 * {@code
	 * <passiseq:Actor name="NewActor1" List_RAMessagesOut="/3"/>
	 * }
	 * </pre>
	 * this method searches  the EClass "Actor" in the metamodel, and
	 * return the corresponding element if it is found.
	 * <br></br>
	 * @return the corresponding EClass element in the metamodel. If no EClass is found, return null.
	 */
	public static def Element getEClassByName(String tagName)
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
	 * Given a string formatted as "/0 /1 /2 ..." this function return a list
	 * containing the IDs of the referenced elements by the current parsed tag.
	 * <pre>
	 * For example, given the following string:
	 * </pre>
	 * <pre>
	 *  s = "/1 /34 /12 /7"
	 * </pre>
	 * the returned list is [1 34 12 7]
	 */
	def LinkedList<Integer> getIdList(String s)
	{
		//Initialize a new linked list object
		var l = new LinkedList<Integer>
		
		//specify the pattern that the string s must match
		var pattern = Pattern.compile("(/([0-9]+))+")
		
		//create a matcher object that match the string s with the pattern just created
		var matcher = pattern.matcher(s)
		
		//iterate every group of matched elements
		for (i : 0 ..< matcher.groupCount) 
		{
			//attempts to find the next subsequence of the input sequence that matches the pattern
			if(matcher.find)
			{
				//return the input subsequence matched by the previous match
				var st = matcher.group
				
				//remove the slash character
				st = st.substring(1)
				
				//add to the list
				l.add(Integer.parseInt(st))
    		}
		}
		
		return l
	}

}