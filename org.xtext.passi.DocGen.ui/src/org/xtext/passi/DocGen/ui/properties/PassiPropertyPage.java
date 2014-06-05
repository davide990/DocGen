package org.xtext.passi.DocGen.ui.properties;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.xtext.xbase.lib.StringExtensions;

public class PassiPropertyPage extends PropertyPage 
{
	private static final String METAMODELS_PATH_PROPERTY 	= "METAMODELS_PATH";
	private static final String TEMPLATE_PATH_PROPERTY 		= "TEMPLATE_PATH";
	
	private Text metamodelsPathTextBox;
	private Text templatePathTextBox;
	
	/**
	 * Constructor for SamplePropertyPage.
	 * 
	 * @see #PropertyPage.PropertyPage()
	 */
	public PassiPropertyPage() 
	{
		super();
	}

	/**
	 * Add the UI controls to the properties page 
	 */
	private void addControls(Composite composite) 
	{
		//Label
		Label lblPathToPassi = new Label(composite, SWT.NONE);
		lblPathToPassi.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblPathToPassi.setText("Path to the folder containing the Passi ECore metamodel files");
		new Label(composite, SWT.NONE);
		
		//Text field
		metamodelsPathTextBox = new Text(composite, SWT.BORDER);
		metamodelsPathTextBox.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		
		//Get the metamodels path property
		String s = getMetamodelsPathProperty();
		if(!StringExtensions.isNullOrEmpty(s))
		{
			System.out.println(s);	//TODO da rimuovere...
			metamodelsPathTextBox.setText(s);
		}
		
		//Separator
		Label label = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1));
		
		//Load button
		Button loadButton = new Button(composite, SWT.NONE);
		loadButton.setToolTipText("Select a directory containing the PASSI Ecore metamodels");
		loadButton.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		loadButton.setText("Load");
		loadButton.addSelectionListener( new SelectionListener() 
			{
			
				public void widgetSelected(SelectionEvent e) 
				{
					metamodelsPathTextBox.setText(selectFolder("Select folder"));
				}
				
				public void widgetDefaultSelected(SelectionEvent event) 
				{
			    }
		});		
		
		Label lblPathToThe = new Label(composite, SWT.NONE);
		lblPathToThe.setText("Path to the folder containing the templates");
		
		templatePathTextBox = new Text(composite, SWT.BORDER);
		templatePathTextBox.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		//Get the template path property
		s = getTemplatePathProperty();
		if(!StringExtensions.isNullOrEmpty(s))
		{
			System.out.println(s);	//TODO da rimuovere...
			templatePathTextBox.setText(s);
		}
		
		Button loadTemplateButton = new Button(composite, SWT.NONE);
		loadTemplateButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		loadTemplateButton.setText("Load");
		loadTemplateButton.addSelectionListener(new SelectionListener() 
		{
			public void widgetSelected(SelectionEvent e) 
			{
				templatePathTextBox.setText(selectFolder("Select folder"));
			}
			
			public void widgetDefaultSelected(SelectionEvent e) 
			{}
		});
	}
	
	
	
	private String selectFolder(String dialogTitle)
	{
		//Create a new directory  dialog
		DirectoryDialog dialog = new DirectoryDialog(getShell());
		
		dialog.setText(dialogTitle);
		
		//set the initial folder to the user home folder
		dialog.setFilterPath(getUserHomePath());
		
		//open the dialog and return the selected directory path as string, otherwise
		//return null if Cancel is selected
		String selectedFolder = dialog.open();
		
		//if a directory has been selected
		if(selectedFolder != null)
		{
			//set the path string to the text control
			System.out.println(selectedFolder);
			//setPathText(selectedFolder);
		}
		else //otherwise, do nothing.
			System.out.println("Operation aborted");
		
		return selectedFolder;
	}
		
	/**
	 * Returns the path to the current user home folder in the file system.
	 * It is used when user open the dialog to select the metamodels folder, so that
	 * the folder showed at first is the user home folder.
	 */
	private String getUserHomePath()
	{
		return System.getProperty("user.dir");
	}
	
	/**
	 * Create the controls for this property page.
	 * 
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) 
	{
		//Create a new composite container
		Composite composite = new Composite(parent, SWT.NONE);
		
		//Set a grid layout 
		GridLayout layout = new GridLayout(1,false);
		composite.setLayout(layout);
		
		//Add the controls to the container
		addControls(composite);
		
		return composite;
	}


	protected void performDefaults() 
	{
		super.performDefaults();
	}
	
	/**
	 * If user already set a folder path for the metamodels, return the saved value.
	 * 
	 * @return The path to the folder containing the metamodels, or an empty string if 
	 * no value are set.
	 */
	private String getMetamodelsPathProperty()
	{
		try 
		{
			String projectName = ((IResource) getElement()).getProject().getName();
			
			return ((IResource) getElement()).getPersistentProperty(new QualifiedName(projectName, METAMODELS_PATH_PROPERTY));
		} 
		catch (CoreException e) 
		{
			return "";
		}
	}
	
	/**
	 * Return the saved path to the template path.
	 */
	private String getTemplatePathProperty()
	{
		try 
		{
			String projectName = ((IResource) getElement()).getProject().getName();
			
			return ((IResource) getElement()).getPersistentProperty(new QualifiedName(projectName, TEMPLATE_PATH_PROPERTY));
		} 
		catch (CoreException e) 
		{
			return null;
		}
	}
	
	/**
	 * Called when "Apply" button in the property window is selected.
	 * This method take the selected path where to find the metamodel files (into the
	 * text control in this page), and save it as a project persistent property.
	 */
	@Override
	protected void performApply() 
	{
		SaveProperties();
	}
	
	/**
	 * Called when "Ok" button in the property window is selected. Do the same things 
	 * on performApply() method.
	 * 
	 * @see #performApply()
	 */
	public boolean performOk() 
	{
		return SaveProperties();
	}

	
	/**
	 * Save the path to metamodels folder and template folder as project properties.
	 * 
	 * @return true is the operation successes, false otherwise.
	 */
	private boolean SaveProperties()
	{
	
		try 
		{
			String projectName = ((IResource) getElement()).getProject().getName();
			
			if(((IResource) getElement()).exists())
			{
				//Save the metamodel path property
				String s = metamodelsPathTextBox.getText();

				//Do nothing is the path is invalid
				//if(!s.isEmpty() && s != null)
			//	{
					//Finally, set the metamodels path as a project property
					((IResource) getElement()).setPersistentProperty(
						new QualifiedName(projectName, METAMODELS_PATH_PROPERTY),metamodelsPathTextBox.getText());
					//	}
				
				//---------------------------------
				
				//Save the template path property
				s = templatePathTextBox.getText();

				//Do nothing is the path is invalid
				//	if(!s.isEmpty() && s != null)
					//	{
					//Finally, set the metamodels path as a project property
					((IResource) getElement()).setPersistentProperty(
						new QualifiedName(projectName, TEMPLATE_PATH_PROPERTY),templatePathTextBox.getText());
					//	}
			}
		} 
		catch (CoreException e) 
		{
			return false;
		}		
		
		return true;
	}
	
	
	public IEclipsePreferences create(IEclipsePreferences parent, String name) 
	{
		return null;
	}

}