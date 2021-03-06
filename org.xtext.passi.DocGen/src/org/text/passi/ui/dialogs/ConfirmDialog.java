package org.text.passi.ui.dialogs;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class ConfirmDialog 
{
	Display display = new Display();
	Shell shell = new Shell(display);

	Button button;
	public ConfirmDialog(String dialogTitle, String dialogMessage) 
	{
	    button = new Button(shell, SWT.PUSH);
	    
	    button.addListener(SWT.Selection, new Listener() 
    	{
    		public void handleEvent(Event event) 
    		{
    			MessageBox messageBox = new MessageBox(shell, SWT.ICON_WARNING | SWT.ABORT | SWT.RETRY | SWT.IGNORE);
        
    		//	messageBox.setText(dialogTitle);
    			//messageBox.setMessage(dialogMessage);
    			int buttonID = messageBox.open();
    			switch(buttonID) 
    			{
				  case SWT.YES:
				    // saves changes ...
				  case SWT.NO:
				    // exits here ...
				    break;
				  case SWT.CANCEL:
				    // does nothing ...
				    }
				    System.out.println(buttonID);
    			}
    		});
	
		button.setText("Click me!");
		
		button.setBounds(0, 0, 100, 30);
		
		shell.pack();
		shell.open();
		//textUser.forceFocus();
	
		// Set up the event loop.
		while (!shell.isDisposed()) 
		{
		  if (!display.readAndDispatch())
		  {
			  // If no more entries in event queue
			  display.sleep();
		  }
		}
	
	    display.dispose();
  }

}
