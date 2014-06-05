package org.xtext.passi.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.passi.metamodels.MetamodelsLoader;

public class DocumentationFileSaver 
{
	/**
	 * This method save the generated documentation file into an Eclipse project. 
	 * <br></br>
	 * More precisely, it copies the content of the temp documentation file
	 * into the generated output file (inside the project tree). In this way, the generated documentation 
	 * file will be showed into the package explorer of the eclipse project.
	 *
	 * @param tempFilePath the absolute file system path to the temp output file
	 * @param outputFname the output documentation file name
	 * @param outFolder the project-relative path to the output folder 
	 */
	public static void save(String tempFilePath, String outputFname, String outFolder)
	{
		//Get the handle to the runtime eclipse workspace
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(MetamodelsLoader.ProjectName);
		
		//Create the (sub)folders in the project tree
		String path = createOutputFolder(outFolder, project, root);
		
		// If file already exists, ask the user if it must be overwritten.
		while( new File(path + File.separator +  outputFname).exists() )
		{	
			//If output file must not be overwritten, show an input dialog
			//repeately, until the file name is valid.
			if(showOverwriteDocumentationDialog(outputFname) == SWT.NO)
			{
				InputDialog diag = new InputDialog(Display.getCurrent().getActiveShell(), "Output documentation file name", "Please enter a new name for the output documentation file name", "", null);
				if (diag.open() == Window.OK)
					outputFname = diag.getValue();
				else
				{
					MessageDialog.openInformation(new Shell(), "DocGen", "Operation aborted.");
					return;
				}
			}
			else
			{
				//User selected Yes, so delete the existing file
				new File(path + File.separator +  outputFname).delete();
			}
		}
		
		//Create a new input stream for the output temp file
		FileInputStream is = null;
		
		try 
		{
			//noo
			is = new FileInputStream(tempFilePath);
			//is = new FileInputStream(relPath + outputFname);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}

		//get the handle to the output file
		//IFile f = project.getFile(relPath + outputFname);
		IFile f = project.getFile(outFolder + outputFname);
		
		try 
		{
			//Create the output empty file
			f.create(is, true, null);
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}

		//get the temp documentation file path
		Path orig = Paths.get(tempFilePath);
		
		//get the absolute destination output path
		Path dest = Paths.get(path + File.separator +  outputFname);

		try 
		{
			//Copy the content of the temp file into the project output file.
			Files.copy(orig, dest, StandardCopyOption.REPLACE_EXISTING);
		} 
		catch (IOException e) 
		{
			System.out.println("\nIOException occurred!\n\n\n");
			e.printStackTrace();
		}
		
		//Delete the temp file
		File tempFile = new File(tempFilePath);
		tempFile.delete();
		
		try 
		{
			//Refresh the project outline
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Create the output folder inside the project where the documentation will be saved.
	 * 
	 * @param outputFolderPath The project-relative path to the output folder
	 * @param project The project resource
	 * @param root A root resource represents the top of the resource hierarchy in a workspace
	 * @return The relative path to the output folder.
	 */
	private static String createRelativePathToOutputFolder(String outputFolderPath, IProject project, IWorkspaceRoot root)
	{
		StringConcatenation _relativePath = new StringConcatenation();
		
		for(String s : outputFolderPath.split("/"))
		{
			_relativePath.append(s);
			CreateFolder(project, _relativePath.toString());
			_relativePath.append(File.separator);
		}
		
		//Get the path to the output folder
		return _relativePath.toString();
	}
	
	/**
	 * Create the output folder where the documentation will be saved.
	 * 
	 * @param outFolder the project-relative path to the output folder
	 * @param project
	 * @param root
	 * @return 
	 */
	private static String createOutputFolder(String outFolder, IProject project, IWorkspaceRoot root)
	{
		//Create the output folder into the project
		String relPath = createRelativePathToOutputFolder(outFolder, project, root);
		
		//Get the complete path to the destination output folder
		String path = root.getLocation().toFile().toString() + 
					  File.separator +
					  project.getName() + 
					  File.separator +
					  relPath;
		
		//Create the output directory in the file system
		File dir = new File(path);
		dir.mkdirs();
		
		return path;
	}
	
	
	
	
	
	/**
	 * Create a folder inside the project tree.
	 */
	private static void CreateFolder(IProject project, String folderName)
	{
		//If the output folder does not exists, create it.
		if(project.getFolder(folderName).exists())
			return;
	
		try 
		{
			project.getFolder(folderName).create(true, false, null);
		} 
		catch (CoreException e1) 
		{
			e1.printStackTrace();
		}
	}
		
	/**
	 * Show a dialog that ask the user if he wants to overwrite [outputFname] documentation
	 * file.
	 * 
	 * @return SWT.YES if user select Yes, or SWT.NO otherwise.
	 */
	private static int showOverwriteDocumentationDialog(String outputFname)
	{
		Display display = Display.getDefault();
	    Shell shell = new Shell(display);
	    
	    MessageBox messageBox = new MessageBox(shell, SWT.ICON_QUESTION |SWT.YES | SWT.NO);
	    messageBox.setMessage("Overwrite '" + outputFname + "'?");
	    
	    return messageBox.open();
	}

}
