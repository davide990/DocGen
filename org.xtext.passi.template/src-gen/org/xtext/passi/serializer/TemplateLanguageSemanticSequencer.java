package org.xtext.passi.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.passi.services.TemplateLanguageGrammarAccess;
import org.xtext.passi.templateLanguage.Feature;
import org.xtext.passi.templateLanguage.ListAttribute;
import org.xtext.passi.templateLanguage.TableData;
import org.xtext.passi.templateLanguage.TableDataAttribute;
import org.xtext.passi.templateLanguage.TableSection;
import org.xtext.passi.templateLanguage.Template;
import org.xtext.passi.templateLanguage.TemplateLanguagePackage;

@SuppressWarnings("all")
public class TemplateLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TemplateLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TemplateLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TemplateLanguagePackage.FEATURE:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case TemplateLanguagePackage.LIST_ATTRIBUTE:
				if(context == grammarAccess.getListAttributeRule() ||
				   context == grammarAccess.getTableDataAttributeRule()) {
					sequence_ListAttribute(context, (ListAttribute) semanticObject); 
					return; 
				}
				else break;
			case TemplateLanguagePackage.TABLE_DATA:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getTableDataRule()) {
					sequence_TableData(context, (TableData) semanticObject); 
					return; 
				}
				else break;
			case TemplateLanguagePackage.TABLE_DATA_ATTRIBUTE:
				if(context == grammarAccess.getTableDataAttributeRule()) {
					sequence_TableDataAttribute(context, (TableDataAttribute) semanticObject); 
					return; 
				}
				else break;
			case TemplateLanguagePackage.TABLE_SECTION:
				if(context == grammarAccess.getTableSectionRule()) {
					sequence_TableSection(context, (TableSection) semanticObject); 
					return; 
				}
				else break;
			case TemplateLanguagePackage.TEMPLATE:
				if(context == grammarAccess.getTemplateRule()) {
					sequence_Template(context, (Template) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID value=AttributeValue)
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TemplateLanguagePackage.Literals.FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TemplateLanguagePackage.Literals.FEATURE__NAME));
			if(transientValues.isValueTransient(semanticObject, TemplateLanguagePackage.Literals.FEATURE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TemplateLanguagePackage.Literals.FEATURE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFeatureAccess().getValueAttributeValueParserRuleCall_0_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName (values+=STRING values+=STRING*)?)
	 */
	protected void sequence_ListAttribute(EObject context, ListAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName value=AttributeValue)
	 */
	protected void sequence_TableDataAttribute(EObject context, TableDataAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TemplateLanguagePackage.Literals.TABLE_DATA_ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TemplateLanguagePackage.Literals.TABLE_DATA_ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, TemplateLanguagePackage.Literals.TABLE_DATA_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TemplateLanguagePackage.Literals.TABLE_DATA_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTableDataAttributeAccess().getNameQualifiedNameParserRuleCall_0_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTableDataAttributeAccess().getValueAttributeValueParserRuleCall_0_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (tableDataAttributes+=TableDataAttribute | sections+=TableSection)*)
	 */
	protected void sequence_TableData(EObject context, TableData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=SECTION_HEADER | name=SECTION_VALUES) attributes+=TableDataAttribute*)
	 */
	protected void sequence_TableSection(EObject context, TableSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Features+=Feature*)
	 */
	protected void sequence_Template(EObject context, Template semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
