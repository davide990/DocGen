package org.xtext.passi.DocGen.wizard.diagrams;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

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

public class AIdiagramWizard extends org.eclipse.jface.wizard.Wizard implements INewWizard 
{
	private diagramWizardPageOne pageOne;
	
	//These strings represents the content of a new diagram
	private String AIdiagramContent1 = "<?xml version=\"1.0\" encoding=\"ASCII\"?>\n<pi:Diagram xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:al=\"http://eclipse.org/graphiti/mm/algorithms\" xmlns:pi=\"http://eclipse.org/graphiti/mm/pictograms\" visible=\"true\" gridUnit=\"10\" diagramTypeId=\"AIDiagram\" name=\"";
	private String AIdiagramContent2 = "\" snapToGrid=\"true\" version=\"0.10.0\">\n<graphicsAlgorithm xsi:type=\"al:Rectangle\" background=\"//@colors.1\" foreground=\"//@colors.0\" lineWidth=\"1\" transparency=\"0.0\" width=\"1000\" height=\"1000\"/>\n<colors red=\"227\" green=\"238\" blue=\"249\"/>\n<colors red=\"255\" green=\"255\" blue=\"255\"/>\n</pi:Diagram>";
	
	
	@Override
	public void addPages() 
	{
		pageOne = new diagramWizardPageOne("Create new template","new_AI_Diagram");
		addPage(pageOne);
	}
	
	@Override
	public boolean performFinish() 
	{
		IProject project = null;
		
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
			String fname = pageOne.getDiagramFileName();  
			
			if(!folder.exists())
				folder.create(true, false, null);
			
			if( !fname.endsWith(".diagram") )
				fname = fname + ".diagram";
			
			IFile diagramFile = project.getFile("diagrams/" + fname);
			
			if(!diagramFile.exists())
			{
				//Create the diagram file and put the content into it.
				byte[] bytes = (AIdiagramContent1 + fname + AIdiagramContent2).getBytes();
				InputStream source = new ByteArrayInputStream(bytes);
				diagramFile.create(source, IResource.NONE, null);
			}			
		} 
		catch (CoreException e) 
		{
			System.out.println("[DOCGEN ERROR] Error creating the AI diagram file.\n");
			e.printStackTrace();
		}
		
		return true;
	}

	
	

	public void init(IWorkbench workbench, IStructuredSelection selection) 
	{
		
		
	}
}
