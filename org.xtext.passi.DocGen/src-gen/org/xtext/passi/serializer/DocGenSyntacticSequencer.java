package org.xtext.passi.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.passi.services.DocGenGrammarAccess;

@SuppressWarnings("all")
public class DocGenSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DocGenGrammarAccess grammarAccess;
	protected AbstractElementAlias match_element_IDTerminalRuleCall_0_1_1_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DocGenGrammarAccess) access;
		match_element_IDTerminalRuleCall_0_1_1_a = new TokenAlias(true, true, grammarAccess.getElementAccess().getIDTerminalRuleCall_0_1_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPROLOG_ENDRule())
			return getPROLOG_ENDToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPROLOG_STARTRule())
			return getPROLOG_STARTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_CLOSERule())
			return getTAG_CLOSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_EMPTY_CLOSERule())
			return getTAG_EMPTY_CLOSEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_END_OPENRule())
			return getTAG_END_OPENToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTAG_START_OPENRule())
			return getTAG_START_OPENToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal PROLOG_END:
	 * 	'?>'	
	 * ;
	 */
	protected String getPROLOG_ENDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "?>";
	}
	
	/**
	 * terminal PROLOG_START:
	 * 	'<?'
	 * ;
	 */
	protected String getPROLOG_STARTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<?";
	}
	
	/**
	 * terminal TAG_CLOSE : 
	 * 	'>'
	 * ;
	 */
	protected String getTAG_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * terminal TAG_EMPTY_CLOSE : 
	 * 	'/>'
	 * ;
	 */
	protected String getTAG_EMPTY_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "/>";
	}
	
	/**
	 * terminal TAG_END_OPEN : 
	 * 	'</'
	 * ;
	 */
	protected String getTAG_END_OPENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "</";
	}
	
	/**
	 * terminal TAG_START_OPEN : 
	 * 	'<' 
	 * ;
	 */
	protected String getTAG_START_OPENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_element_IDTerminalRuleCall_0_1_1_a.equals(syntax))
				emit_element_IDTerminalRuleCall_0_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ID*
	 */
	protected void emit_element_IDTerminalRuleCall_0_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
