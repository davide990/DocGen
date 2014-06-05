package org.xtext.passi.DocGen.ui.decorator;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.xtext.passi.DocGen.ui.decorator.images.decoratorImagesDescriptors;

public class DocGenDecorator extends LabelProvider  implements ILightweightLabelDecorator 
{
	public void decorate(Object element, IDecoration decoration) 
	{
		if(((IResource)element).getType() == IResource.FILE)
		{
			IFile file = (IFile) element;
			
			String extension = FilenameUtils.getExtension(file.getFullPath().toString());
			
			if(extension.equals("ai")  || 
			   extension.equals("drd") ||
			   extension.equals("passiseq"))
			{
				decoration.addOverlay(decoratorImagesDescriptors.persistenceModelDescriptor);
			}
			else
			if(extension.equals("template"))
			{
				decoration.addOverlay(decoratorImagesDescriptors.templateDescriptor);
			}	
			
			
		}
		
	}
}
