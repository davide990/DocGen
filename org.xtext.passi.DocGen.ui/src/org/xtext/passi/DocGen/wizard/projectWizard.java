package org.xtext.passi.DocGen.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.xtext.ui.XtextProjectHelper;

/**
 * This class handles the creation of the PASSI custom project.
 * 
 * @author Davide Guastella(davide.guastella90@gmail.com)
 */
public class projectWizard extends org.eclipse.jface.wizard.Wizard implements INewWizard 
{
	
	private WizardNewProjectCreationPage pageOne;
	
	public void init(IWorkbench workbench, IStructuredSelection selection) 
	{
		setWindowTitle("New PASSI project");
	}

	@Override
	public boolean performFinish()
	{
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(pageOne.getProjectName());
		IProjectDescription description;
		
		try 
		{
			//Create the project
			project.create(null);
			project.open(null);
			
			//Get the project description handle
			description = project.getDescription();
			
			//Add the xtext builder nature to the project
			description.setNatureIds(new String[] { XtextProjectHelper.NATURE_ID });
			
			//Set the new project description
			project.setDescription(description, null);
			
			//Add folders to the project
			project.getFolder("diagrams").create(true, false, null);
			project.getFolder("diagrams-template").create(true, false, null);
			project.getFolder("src-gen").create(true, false, null);
			
			
			
		} 
		catch (CoreException e) 
		{
			e.printStackTrace();
		}	 
		
		
		
		return true;
	}
	
	@Override
	public void addPages() 
	{
		super.addPages();
		
		pageOne = new WizardNewProjectCreationPage("New PASSI project");
		pageOne.setTitle("Create a new PASSI project");
		pageOne.setDescription("Enter a project name");
		
		addPage(pageOne);
	}

}
