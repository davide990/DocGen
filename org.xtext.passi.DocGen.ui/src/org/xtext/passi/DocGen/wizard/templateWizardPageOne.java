package org.xtext.passi.DocGen.wizard;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class templateWizardPageOne extends WizardPage
{
	private Composite container;
	private Text text1;

	protected templateWizardPageOne(String pageName) 
	{
		super(pageName);
	    setTitle(pageName);
	    setDescription("Create a new template definition file for the PASSI projects.");
	}
	
	public void createControl(Composite parent) 
	{
		container = new Composite(parent, SWT.NONE);
	    GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 2;
	    Label label1 = new Label(container, SWT.NONE);
	    label1.setText("Insert the template file name");

	    text1 = new Text(container, SWT.BORDER | SWT.SINGLE);
	    text1.setText("newTemplate.template");
	    text1.addKeyListener(new KeyListener() 
	    {
	      public void keyPressed(KeyEvent e) 
	      {}

	      public void keyReleased(KeyEvent e) 
	      {
	        if (!text1.getText().isEmpty()) 
	          setPageComplete(true);
	      }

	    });
	    
	    GridData gd = new GridData(GridData.FILL_HORIZONTAL);
	    text1.setLayoutData(gd);
	    
	    // Required to avoid an error in the system
	    setControl(container);
	    setPageComplete(true);
	}
	
	
	public String getTemplateFileName()
	{
		return text1.getText();
	}

}
