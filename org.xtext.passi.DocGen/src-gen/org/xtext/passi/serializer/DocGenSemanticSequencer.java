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
import org.xtext.passi.docGen.Attribute;
import org.xtext.passi.docGen.DocGenPackage;
import org.xtext.passi.docGen.Model;
import org.xtext.passi.docGen.TagName;
import org.xtext.passi.docGen.element;
import org.xtext.passi.docGen.emptyElement;
import org.xtext.passi.docGen.endTag;
import org.xtext.passi.docGen.prologTag;
import org.xtext.passi.docGen.startTag;
import org.xtext.passi.services.DocGenGrammarAccess;

@SuppressWarnings("all")
public class DocGenSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DocGenGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DocGenPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DocGenPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case DocGenPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case DocGenPackage.TAG_NAME:
				if(context == grammarAccess.getTagNameRule()) {
					sequence_TagName(context, (TagName) semanticObject); 
					return; 
				}
				else break;
			case DocGenPackage.ELEMENT:
				if(context == grammarAccess.getElementRule()) {
					sequence_element(context, (element) semanticObject); 
					return; 
				}
				else break;
			case DocGenPackage.EMPTY_ELEMENT:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEmptyElementRule()) {
					sequence_emptyElement(context, (emptyElement) semanticObject); 
					return; 
				}
				else break;
			case DocGenPackage.END_TAG:
				if(context == grammarAccess.getEndTagRule()) {
					sequence_endTag(context, (endTag) semanticObject); 
					return; 
				}
				else break;
			case DocGenPackage.PROLOG_TAG:
				if(context == grammarAccess.getPrologTagRule()) {
					sequence_prologTag(context, (prologTag) semanticObject); 
					return; 
				}
				else break;
			case DocGenPackage.START_TAG:
				if(context == grammarAccess.getStartTagRule()) {
					sequence_startTag(context, (startTag) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((name=ID val=STRING) | (name=ID rightName=ID val=STRING))
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (prolog=prologTag xmldoc+=element*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID | (name=ID rightName=ID))
	 */
	protected void sequence_TagName(EObject context, TagName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Start=startTag innerElement+=element* End=endTag)
	 */
	protected void sequence_element(EObject context, element semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tagName=TagName Attributes+=Attribute*)
	 */
	protected void sequence_emptyElement(EObject context, emptyElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     tagName=TagName
	 */
	protected void sequence_endTag(EObject context, endTag semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DocGenPackage.Literals.END_TAG__TAG_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DocGenPackage.Literals.END_TAG__TAG_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEndTagAccess().getTagNameTagNameParserRuleCall_1_0(), semanticObject.getTagName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='xml' Attributes+=Attribute*)
	 */
	protected void sequence_prologTag(EObject context, prologTag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tagName=TagName Attributes+=Attribute*)
	 */
	protected void sequence_startTag(EObject context, startTag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
