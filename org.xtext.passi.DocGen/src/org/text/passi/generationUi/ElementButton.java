package org.text.passi.generationUi;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * A custom swt radio button used in the DocGen configuration UI to easily handle 
 * EClass/Features inclusion or exclusion.
 * See the SWT documentation for reference (http://www.eclipse.org/swt/)
 * 
 * @author Davide Guastella(davide.guastella90@gmail.com)
 */
public class ElementButton extends Composite
{
	private Button button;
	private String eClassifier;
	private String eStructuralFeature;
	
	public ElementButton(Composite parent) 
	{
		super(parent, SWT.CHECK);
		setLayout(new FillLayout());
		
		button 				= new Button(parent, SWT.CHECK);
		eClassifier 		= "";
		eStructuralFeature 	= "";
	}
	
	
	/**
	 * Enable or disable the check boxes for the features related to the EClass
	 * controlled by this check box.
	 * <br></br>
	 * This method do nothing if called from a feature check box.
	 */
	public void setFeatureButtonsState(boolean enabled)
	{
		//This function should not be called from feature buttons.
		if(!eStructuralFeature.isEmpty())
			return;
			
		for (int i=0;i<getParent().getChildren().length; i++)
		{	
			Control ctl = getParent().getChildren()[i];
			
			if(ctl instanceof ElementButton)
			{
				if(!((ElementButton) ctl).getEStructuralFeature().isEmpty())
					((ElementButton)getParent().getChildren()[i]).button.setEnabled(enabled);
			}
		}
	}

	/**
	 * Return this control.
	 */
	public Button getButton()
	{
		return button;
	}
	
	/**
	 * Get the name of the EStructuralFeature referenced by this radio 
	 * @return
	 */
	public String getEStructuralFeature()
	{
		return eStructuralFeature;
	}
	
	/**
	 * Set the EStructuralFeature referenced by this radio 
	 * @param val
	 */
	public void setEStructuralFeature(String val)
	{
		eStructuralFeature = val;
	}
	
	/**
	 * Get the name of the EClass referenced by this radio 
	 * @return
	 */
	public String getEClassifier()
	{
		return eClassifier;
	}
	
	/**
	 * Set the EClass referenced by this radio 
	 * @param val
	 */
	public void setEClassifier(String val)
	{
		eClassifier = val;
	}

}
