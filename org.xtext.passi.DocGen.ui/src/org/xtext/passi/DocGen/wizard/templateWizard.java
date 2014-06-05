package org.xtext.passi.DocGen.wizard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class templateWizard extends org.eclipse.jface.wizard.Wizard implements INewWizard
{
	private templateWizardPageOne pageOne;
	
	
	public templateWizard()
	{
		super();
		setNeedsProgressMonitor(true);
	}
	
	
	@Override
	public void addPages() 
	{
		pageOne = new templateWizardPageOne("Create new template");
		addPage(pageOne);
	}
	
	@Override
	public boolean performFinish() 
	{
		IProject project = null;
		String templateFname = pageOne.getTemplateFileName();
		
		IWorkbench wb = PlatformUI.getWorkbench();
		
		// get workbench window
		IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
		
		// set selection service
		ISelectionService service = window.getSelectionService();
		
		// set structured selection
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		
		if(structured.getFirstElement() instanceof IProject)
			project = (IProject)structured.getFirstElement();
		else if (structured.getFirstElement() instanceof IFile)
			project = ((IFile) structured.getFirstElement()).getProject();
		else if (structured.getFirstElement() instanceof IFolder)
			project = ((IFolder) structured.getFirstElement()).getProject();
		else
			return false;
				
		try 
		{
			IFolder folder = project.getFolder("diagrams-template");
			
			if(!folder.exists())
				folder.create(true, false, null);
			
			IFile template = project.getFile("diagrams-template/" + templateFname);
			
			if(!template.exists())
			{
				byte[] bytes = ("template " + FilenameUtils.removeExtension(templateFname) + "\n{\n\n}").getBytes();
				InputStream source = new ByteArrayInputStream(bytes);
				template.create(source, IResource.NONE, null);
			}
			else
			{
				//...
			}
			
		} 
		catch (CoreException e) 
		{
			System.out.println("[DOCGEN ERROR] Error creating the template file.\n");
			e.printStackTrace();
		}
		
		
		return true;
	}


	public void init(IWorkbench workbench, IStructuredSelection selection) 
	{
		
		
	}

}
