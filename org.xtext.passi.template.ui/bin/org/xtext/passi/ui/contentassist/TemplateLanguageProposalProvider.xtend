/*
 * generated by Xtext
 */
package org.xtext.passi.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.StyledString
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.widgets.Display
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.xtext.passi.templateLanguage.Feature
import org.xtext.passi.templateLanguage.TableDataAttribute

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class TemplateLanguageProposalProvider extends AbstractTemplateLanguageProposalProvider 
{
	
	/**
	 * Custom content assist behavior for features of Template main section
	 */
	override completeFeature_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
	{
		super.completeFeature_Name(model, assignment, context, acceptor)
		
		for(String key : TemplateKeywords.map.keySet)
		{
			var proposal = super.doCreateProposal(key, new StyledString(key),null,1,context);
			
			if(TemplateKeywords.hints.get(key) != null)
				proposal.setAdditionalProposalInfo(new StyledString(TemplateKeywords.hints.get(key)))
			
			var is = class.classLoader.getResourceAsStream("/icons/property.png")
			
			proposal.setImage(new Image(Display.^default,is));
			
			acceptor.accept(proposal)
		}
	}
	
	
	override completeFeature_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
	{
		super.completeFeature_Value(model, assignment, context, acceptor)
		
		if(model instanceof Feature)
		{
			val featureName = Feature.cast(model).name;
			
			val dataType = TemplateKeywords.map.get(featureName);
			
			var proposalHint = TemplateKeywords.hints.get(featureName);
			
			if(proposalHint == null)
				proposalHint = ""
			
			completeArgument(dataType,acceptor,context)
		}
		
	}
	//-------------------------------------
	//-------------------------------------
/*	
	override completeTableData_TableDataHeaderAttributes(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
	{
		super.completeTableData_TableDataHeaderAttributes(model, assignment, context, acceptor)
		
		
		for(String key : TableData.tableData_map.keySet)
		{
			var proposal = super.doCreateProposal(key, new StyledString(key),null,1,context);
			
			if(TableData.tableData_hints.get(key) != null)
				proposal.setAdditionalProposalInfo(new StyledString(TableData.tableData_hints.get(key)))
			
			var is = class.classLoader.getResourceAsStream("/icons/property.png")
			
			proposal.setImage(new Image(Display.^default,is));
			
			acceptor.accept(proposal)
		}
		
	}
	
	override completeTableData_TableDataValuesAttributes(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
	{
		super.completeTableData_TableDataValuesAttributes(model, assignment, context, acceptor)
		completeTableData_TableDataHeaderAttributes(model, assignment, context, acceptor)
	}
	 */
	
	override completeTableDataAttribute_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) 
	{
		super.completeTableDataAttribute_Value(model, assignment, context, acceptor)
		
		val TableAttribute 	= TableDataAttribute.cast(model).name;		
		val dataType 		= TableData.tableData_map.get(TableAttribute);
		var proposalHint 	= TableData.tableData_hints.get(TableAttribute);
		
		if(proposalHint == null)
			proposalHint = ""
		
		completeArgument(dataType,acceptor,context)
	}
	
	
	
	private def completeArgument(String dataType, ICompletionProposalAcceptor acceptor, ContentAssistContext context)
	{
		if(dataType.equals("STRING"))
		{
			var proposal = super.doCreateProposal("\"\"",new StyledString("\"\""),null,1,context);
			
			var is = class.getResourceAsStream("/icons/ui-text-field.png")
			proposal.setImage(new Image(Display.^default,is));
			
			acceptor.accept(proposal)
		}
		else if(dataType.equals("BOOLEAN"))
		{
			var proposal = super.doCreateProposal("true",new StyledString("true"),null,1,context)
			var is = class.classLoader.getResourceAsStream("/icons/status.png")
			proposal.setImage(new Image(Display.^default,is));
			
			acceptor.accept(proposal)
			
			proposal = super.doCreateProposal("false",new StyledString("false"),null,1,context);
			is = class.classLoader.getResourceAsStream("/icons/status-busy.png")

			proposal.setImage(new Image(Display.^default,is));
			
			acceptor.accept(proposal)
		}
		else if (dataType.equals("INT"))
		{
			var proposal = super.doCreateProposal("123",new StyledString("123"),null,1,context)
			var is = class.classLoader.getResourceAsStream("/icons/abacus.png")
			proposal.setImage(new Image(Display.^default,is));
			
			acceptor.accept(proposal)
		}
	}
	
	
}
