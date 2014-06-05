package org.xtext.passi.metamodels;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

//TODO define!
/**
 * Called when "Load metamodels" is selected from the context menu for projects.
 * This class contains various methods used to load and register the metamodel into the project
 */
public class MetamodelsLoader extends AbstractHandler implements IHandler 
{
	
	private final static String METAMODEL_FILE_EXTENSION = "ecore";
	
	
	/***
	 * The absolute path to the folder that contains the metamodels. It's value is saved
	 * in a persistent property of the current project
	 */
	private static String metamodelsPath;
	
	/**
	 * The selected project name. 
	 */
	public static String ProjectName = new String();
	
	/***
	 * Method Triggered by the selection of the context menu "Load metamodels" entry
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		
		// get workbench window
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		// set selection service
		ISelectionService service = window.getSelectionService();
		
		// set structured selection
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
						
		//If the current element in the package explore is a project
		if (structured.getFirstElement() instanceof IProject)
		{
			//get the selected project name
			IProject pro = (IProject) structured.getFirstElement();
			ProjectName = pro.getName();
			
			try 
			{
				//get the metamodels path from the project properties
				metamodelsPath = pro.getPersistentProperty(new QualifiedName(ProjectName, "METAMODELS_PATH"));
				
				if(metamodelsPath != null)
				{
					System.out.println("[MAIN PROJECT] path: " + metamodelsPath + "\n");
					loadMetamodelsFiles(metamodelsPath);
				}
				else
					System.out.println("[MAIN PROJECT] no path set. Can't load metamodels.\n" + metamodelsPath);
			} 
			catch (CoreException e) 
			{
				e.printStackTrace();
			}
		}
		
		return null;
	}
	
	
	public static boolean ReloadMetamodels()
	{
		IWorkbench wb = PlatformUI.getWorkbench();
		
		// get workbench window
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		
		// set selection service
		ISelectionService service = window.getSelectionService();
		
		// set structured selection
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
			
		//If the current element in the package explore is a project
		if (structured.getFirstElement() instanceof IFile)
		{
			//get the selected project name
			IProject pro = ((IFile) structured.getFirstElement()).getProject();
			ProjectName = pro.getName();
			
			try 
			{
				//get the metamodels path from the project properties
				metamodelsPath = pro.getPersistentProperty(new QualifiedName(ProjectName, "METAMODELS_PATH"));
				
				if(!StringExtensions.isNullOrEmpty(metamodelsPath))
				{
					System.out.println("['" + ProjectName + "'] path: " + metamodelsPath + "\n");
					loadMetamodelsFiles(metamodelsPath);
				}
				else
				{
					System.out.println("DocGen Error:  no metamodel path set. Can't load metamodels.\n");
					return false;
				}
			} 
			catch (CoreException e) 
			{
				e.printStackTrace();
			}
		}
		return true;
	}
	
	
	/**
	 * Load the metamodels contained in the folder specified in the project property tab.
	 * @param path is the absolute path to the folder in the file system that contains the metamodels.
	 */
	private static void loadMetamodelsFiles(String path)
	{
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		//Add a project to the selected project where metamodels will be saves
    	try 
    	{
			addFolderToProject("Metamodels");
		} 
    	catch (FileNotFoundException e) 
    	{
			e.printStackTrace();
		}
		
		for (File file : listOfFiles) 
		{
		    if (!file.isFile())
		    	continue;
	    
		    //Get the index of the last dot in the file name string
	    	int i = file.getName().lastIndexOf('.');
	    	
	    	//Get the file extension
	    	String extension = file.getName().substring(i+1);
	    		
	    	//Do nothing if the files extension is not '*.ecore'
	    	if(!extension.equals(METAMODEL_FILE_EXTENSION))
	    		continue;
	    
	    	//System.out.println("metamodel -> " + file.getName() + "\n");
	    	//System.out.println("~~~~~~~~~~~~~");
	    	
	    	//first, create the file so that it can be visible on the project's package explorer. 
	    	//This step creates an empty file
	    	if(!createMetamodelFileInProject("Metamodels", file.getName()))
	    		continue;
	    	
	    	//Once created an empty metamodel file, it will be overwritten with the metamodel file's content
	    	copyMetamodelFileContent(file.getName(), metamodelsPath+File.separator, "Metamodels");
	    	
	    	//Finally, register the metamodel information into the project properties
	    	saveMetamodelInProjectProperties(file.getName());
	    	
	    	System.out.println("metamodel '" + file.getName() + "' registered correctly");
	    	System.out.println("-----------------------------\n\n\n\n");
		}	
	}
	
	/**
	 * Save the metamodel property into the project 
	 * <br></br>
	 * This function read the metamodel file indicated by [fname] and get it's namespace. After that,
	 * a project property, containing the project name, the metamodel namespace and the metamodel
	 * file name, will be saved.
	 * 
	 * @throws ParserConfigurationException 
	 */
	private static void saveMetamodelInProjectProperties(String fname)
	{
		//Get the project resource
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(ProjectName);
		
		//Get the destination folder resource
		IFolder metamodelsFolder = project.getFolder("Metamodels");
		
		String absolutePath = root.getLocation().toFile().toString() +		//Absolute path to the project folder 
					   		  metamodelsFolder.getFullPath().toString() + 	//destination folder inside the project
					   		  File.separator + 								//separator
					   		  fname;							 			//name of the file to add
		
		try
		{
			//Get the metamodel namespace
			DocumentBuilderFactory docBuildFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuildFactory.newDocumentBuilder();
			
			Document doc = docBuilder.parse(new File(absolutePath));
			doc.getDocumentElement().normalize();
			
			Element metamodelBodyTag = (Element) doc.getElementsByTagName("ecore:EPackage").item(0);
			String metamodelNameSpace = metamodelBodyTag.getAttribute("nsURI");
			
			//Set a property into the project. This property has the 
			//form [qualifiedName:projectName, metamodelNameSpace; value: MetamodelFileName]
			project.setPersistentProperty(new QualifiedName(project.getName(), metamodelNameSpace), fname);
		}
		catch (SAXParseException err) 
		{
	        System.out.println ("** Parsing error" + ", line " 
	             + err.getLineNumber () + ", uri " + err.getSystemId ());
	        System.out.println(" " + err.getMessage ());
        }
		catch (SAXException e) 
        {
	        Exception x = e.getException ();
	        ((x == null) ? e : x).printStackTrace ();
        }
		catch (Throwable t) 
		{
			t.printStackTrace ();
        }
	}
	
	/**
	 * Create a folder inside the project tree.  
	 * 
	 * @param folderName The name of the folder to create
	 * @throws FileNotFoundException 
	 */
	private static boolean addFolderToProject(String folderName) throws FileNotFoundException
	{
		//Get the project resource
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(ProjectName);
		
		try
		{
			//Create a new folder
	        IFolder metamodelsFolder = project.getFolder(folderName);
	        
	        if(!metamodelsFolder.exists())
	        {
	        	//If it doesn't exists, add to project
	        	metamodelsFolder.create(true, true, null);
	        	return true;
	        }
	        
		}
		catch(CoreException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
	/**
	 * Create a metamodel file into the specified project folder.
	 * <br></br>
	 * Given the name of the metamodel file to import into the project, this function creates
	 * a new empty file into the eclipse project, so that the metamodel file appears in the package
	 * explorer. 
	 * @param destinationFolderName the folder, inside the project, where the metamodel file will be saved
	 * @param MetamodelFilename the file name of the metamodel to import
	 * @return <b>true</b> if the metamodel file didn't exists in the project, otherwise return <b>false</b>.
	 */
	private static boolean createMetamodelFileInProject(String destinationFolderName, String MetamodelFilename)
	{
		//Get the project resource
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(ProjectName);
		
		//Get the destination folder resource
		IFolder metamodelsFolder = project.getFolder(destinationFolderName);
		
		//Get the absolute path to the metamodels in the project 
		String absolutePath = root.getLocation().toFile().toString() +		//Absolute path to the project folder 
					   		  metamodelsFolder.getFullPath().toString() + 	//destination folder inside the project
					   		  File.separator + 								//separator
					   		  MetamodelFilename;							//name of the file to add
        
        System.out.println("Absolute path: " + absolutePath);
        
		String relativePath = destinationFolderName +						//destination folder inside the project
				   			  File.separator + 								//separator
				   			  MetamodelFilename;							//name of the file to add
		
		System.out.println("Relative path: " + relativePath);
		
        IFile f = project.getFile(relativePath);
        
        if(f.exists())
        {
        	System.out.println("File \"" + MetamodelFilename + "\"already exists in project\n");
        	return false;
        }
        
		try 
		{
			//source: an input stream containing the initial contents
			//of the file, or null if the file should be marked as not local
			
			
			//forse dovrebbe essere null?

			//f.create(is, true, null);
			f.create(null, true, null);
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
	/***
	 * Copy the content of the specified metamodel file into the destination file. The destination file
	 * is assumed to be a file contained into an eclipse project.
	 * <br></br>
	 * After a empty metamodel file has been created, this function must be called to copy the content
	 * of the metamodel source file into the destination file.
	 * 
	 * @param Filename the name of the metamodel file to copy 
	 * @param sourceMetamodelPath the absolute path to the folder that contains the source metamodel file
	 * @param destinationFolder the project-relative path to the folder where the file will be copied
	 */
	private static boolean copyMetamodelFileContent(String Filename, String sourceMetamodelPath, String destinationFolder)
	{
		//Get the project resource
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(ProjectName);
				
		//Get the destination folder resource
		IFolder metamodelsFolder = project.getFolder(destinationFolder);

		//Get the absolute path to the destination file name
		String absoluteFilePath = root.getLocation().toFile().toString() +		//Absolute path to the project folder 
			   		  			  metamodelsFolder.getFullPath().toString() + 	//destination folder inside the project
			   		  			  File.separator +								//separator
			   		  			  Filename;										//destination file name
		
		Path orig = Paths.get(sourceMetamodelPath + File.separator + Filename);
		Path dest = Paths.get(absoluteFilePath);
		
		
		//QUESTO CONTROLLO NON HA SENSO. QUANDO IL PROGRAMMA SI TROVA IN QUESTO PUNTO,
		//HA GIA CREATO IL FILE DEL METAMODELLO.
		//Do not copy if file already exists
		//if(new File(absoluteFilePath).exists())
	//		return false;
		
		try 
		{
			Files.copy(orig, dest, StandardCopyOption.REPLACE_EXISTING);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return true;
	}
	
	@Override
	public boolean isEnabled()
	{
		return true;
	}

}
