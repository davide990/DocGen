/*
* generated by Xtext
*/
package org.xtext.passi.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class DocGenGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPrologAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPrologPrologTagParserRuleCall_0_0 = (RuleCall)cPrologAssignment_0.eContents().get(0);
		private final Assignment cXmldocAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXmldocElementParserRuleCall_1_0 = (RuleCall)cXmldocAssignment_1.eContents().get(0);
		
		/// **
		// * This is the main grammar for DocGen plugin. It is a plain xml grammar, so it's model-indipendent.
		// * / Model:
		//	prolog=prologTag xmldoc+=element*;
		public ParserRule getRule() { return rule; }

		//prolog=prologTag xmldoc+=element*
		public Group getGroup() { return cGroup; }

		//prolog=prologTag
		public Assignment getPrologAssignment_0() { return cPrologAssignment_0; }

		//prologTag
		public RuleCall getPrologPrologTagParserRuleCall_0_0() { return cPrologPrologTagParserRuleCall_0_0; }

		//xmldoc+=element*
		public Assignment getXmldocAssignment_1() { return cXmldocAssignment_1; }

		//element
		public RuleCall getXmldocElementParserRuleCall_1_0() { return cXmldocElementParserRuleCall_1_0; }
	}

	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cStartAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cStartStartTagParserRuleCall_0_0_0 = (RuleCall)cStartAssignment_0_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final Assignment cInnerElementAssignment_0_1_0 = (Assignment)cAlternatives_0_1.eContents().get(0);
		private final RuleCall cInnerElementElementParserRuleCall_0_1_0_0 = (RuleCall)cInnerElementAssignment_0_1_0.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_1_1 = (RuleCall)cAlternatives_0_1.eContents().get(1);
		private final Assignment cEndAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cEndEndTagParserRuleCall_0_2_0 = (RuleCall)cEndAssignment_0_2.eContents().get(0);
		private final RuleCall cEmptyElementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//element:
		//	Start=startTag (innerElement+=element | ID)* End=endTag | emptyElement;
		public ParserRule getRule() { return rule; }

		//Start=startTag (innerElement+=element | ID)* End=endTag | emptyElement
		public Alternatives getAlternatives() { return cAlternatives; }

		//Start=startTag (innerElement+=element | ID)* End=endTag
		public Group getGroup_0() { return cGroup_0; }

		//Start=startTag
		public Assignment getStartAssignment_0_0() { return cStartAssignment_0_0; }

		//startTag
		public RuleCall getStartStartTagParserRuleCall_0_0_0() { return cStartStartTagParserRuleCall_0_0_0; }

		//(innerElement+=element | ID)*
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }

		//innerElement+=element
		public Assignment getInnerElementAssignment_0_1_0() { return cInnerElementAssignment_0_1_0; }

		//element
		public RuleCall getInnerElementElementParserRuleCall_0_1_0_0() { return cInnerElementElementParserRuleCall_0_1_0_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_0_1_1() { return cIDTerminalRuleCall_0_1_1; }

		//End=endTag
		public Assignment getEndAssignment_0_2() { return cEndAssignment_0_2; }

		//endTag
		public RuleCall getEndEndTagParserRuleCall_0_2_0() { return cEndEndTagParserRuleCall_0_2_0; }

		//emptyElement
		public RuleCall getEmptyElementParserRuleCall_1() { return cEmptyElementParserRuleCall_1; }
	}

	public class StartTagElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "startTag");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTAG_START_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cTagNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTagNameTagNameParserRuleCall_1_0 = (RuleCall)cTagNameAssignment_1.eContents().get(0);
		private final Assignment cAttributesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttributesAttributeParserRuleCall_2_0 = (RuleCall)cAttributesAssignment_2.eContents().get(0);
		private final RuleCall cTAG_CLOSETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//startTag:
		//	TAG_START_OPEN tagName=TagName Attributes+=Attribute* TAG_CLOSE;
		public ParserRule getRule() { return rule; }

		//TAG_START_OPEN tagName=TagName Attributes+=Attribute* TAG_CLOSE
		public Group getGroup() { return cGroup; }

		//TAG_START_OPEN
		public RuleCall getTAG_START_OPENTerminalRuleCall_0() { return cTAG_START_OPENTerminalRuleCall_0; }

		//tagName=TagName
		public Assignment getTagNameAssignment_1() { return cTagNameAssignment_1; }

		//TagName
		public RuleCall getTagNameTagNameParserRuleCall_1_0() { return cTagNameTagNameParserRuleCall_1_0; }

		//Attributes+=Attribute*
		public Assignment getAttributesAssignment_2() { return cAttributesAssignment_2; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_0() { return cAttributesAttributeParserRuleCall_2_0; }

		//TAG_CLOSE
		public RuleCall getTAG_CLOSETerminalRuleCall_3() { return cTAG_CLOSETerminalRuleCall_3; }
	}

	public class EndTagElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "endTag");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTAG_END_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cTagNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTagNameTagNameParserRuleCall_1_0 = (RuleCall)cTagNameAssignment_1.eContents().get(0);
		private final RuleCall cTAG_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//endTag:
		//	TAG_END_OPEN tagName=TagName TAG_CLOSE;
		public ParserRule getRule() { return rule; }

		//TAG_END_OPEN tagName=TagName TAG_CLOSE
		public Group getGroup() { return cGroup; }

		//TAG_END_OPEN
		public RuleCall getTAG_END_OPENTerminalRuleCall_0() { return cTAG_END_OPENTerminalRuleCall_0; }

		//tagName=TagName
		public Assignment getTagNameAssignment_1() { return cTagNameAssignment_1; }

		//TagName
		public RuleCall getTagNameTagNameParserRuleCall_1_0() { return cTagNameTagNameParserRuleCall_1_0; }

		//TAG_CLOSE
		public RuleCall getTAG_CLOSETerminalRuleCall_2() { return cTAG_CLOSETerminalRuleCall_2; }
	}

	public class EmptyElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "emptyElement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTAG_START_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cTagNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTagNameTagNameParserRuleCall_1_0 = (RuleCall)cTagNameAssignment_1.eContents().get(0);
		private final Assignment cAttributesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttributesAttributeParserRuleCall_2_0 = (RuleCall)cAttributesAssignment_2.eContents().get(0);
		private final RuleCall cTAG_EMPTY_CLOSETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//emptyElement:
		//	TAG_START_OPEN tagName=TagName Attributes+=Attribute* TAG_EMPTY_CLOSE;
		public ParserRule getRule() { return rule; }

		//TAG_START_OPEN tagName=TagName Attributes+=Attribute* TAG_EMPTY_CLOSE
		public Group getGroup() { return cGroup; }

		//TAG_START_OPEN
		public RuleCall getTAG_START_OPENTerminalRuleCall_0() { return cTAG_START_OPENTerminalRuleCall_0; }

		//tagName=TagName
		public Assignment getTagNameAssignment_1() { return cTagNameAssignment_1; }

		//TagName
		public RuleCall getTagNameTagNameParserRuleCall_1_0() { return cTagNameTagNameParserRuleCall_1_0; }

		//Attributes+=Attribute*
		public Assignment getAttributesAssignment_2() { return cAttributesAssignment_2; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_0() { return cAttributesAttributeParserRuleCall_2_0; }

		//TAG_EMPTY_CLOSE
		public RuleCall getTAG_EMPTY_CLOSETerminalRuleCall_3() { return cTAG_EMPTY_CLOSETerminalRuleCall_3; }
	}

	public class PrologTagElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "prologTag");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPROLOG_STARTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cNameXmlKeyword_1_0 = (Keyword)cNameAssignment_1.eContents().get(0);
		private final Assignment cAttributesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttributesAttributeParserRuleCall_2_0 = (RuleCall)cAttributesAssignment_2.eContents().get(0);
		private final RuleCall cPROLOG_ENDTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//prologTag:
		//	PROLOG_START name="xml" Attributes+=Attribute* PROLOG_END;
		public ParserRule getRule() { return rule; }

		//PROLOG_START name="xml" Attributes+=Attribute* PROLOG_END
		public Group getGroup() { return cGroup; }

		//PROLOG_START
		public RuleCall getPROLOG_STARTTerminalRuleCall_0() { return cPROLOG_STARTTerminalRuleCall_0; }

		//name="xml"
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//"xml"
		public Keyword getNameXmlKeyword_1_0() { return cNameXmlKeyword_1_0; }

		//Attributes+=Attribute*
		public Assignment getAttributesAssignment_2() { return cAttributesAssignment_2; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_2_0() { return cAttributesAttributeParserRuleCall_2_0; }

		//PROLOG_END
		public RuleCall getPROLOG_ENDTerminalRuleCall_3() { return cPROLOG_ENDTerminalRuleCall_3; }
	}

	public class TagNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TagName");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightNameAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightNameIDTerminalRuleCall_1_2_0 = (RuleCall)cRightNameAssignment_1_2.eContents().get(0);
		
		//TagName:
		//	name=ID | name=ID ":" rightName=ID;
		public ParserRule getRule() { return rule; }

		//name=ID | name=ID ":" rightName=ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//name=ID ":" rightName=ID
		public Group getGroup_1() { return cGroup_1; }

		//name=ID
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_0() { return cNameIDTerminalRuleCall_1_0_0; }

		//":"
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }

		//rightName=ID
		public Assignment getRightNameAssignment_1_2() { return cRightNameAssignment_1_2; }

		//ID
		public RuleCall getRightNameIDTerminalRuleCall_1_2_0() { return cRightNameIDTerminalRuleCall_1_2_0; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cValAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cValSTRINGTerminalRuleCall_0_2_0 = (RuleCall)cValAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cNameAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_1_0_0 = (RuleCall)cNameAssignment_1_0.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightNameAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightNameIDTerminalRuleCall_1_2_0 = (RuleCall)cRightNameAssignment_1_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Assignment cValAssignment_1_4 = (Assignment)cGroup_1.eContents().get(4);
		private final RuleCall cValSTRINGTerminalRuleCall_1_4_0 = (RuleCall)cValAssignment_1_4.eContents().get(0);
		
		//Attribute:
		//	name=ID "=" val=STRING | name=ID ":" rightName=ID "=" val=STRING;
		public ParserRule getRule() { return rule; }

		//name=ID "=" val=STRING | name=ID ":" rightName=ID "=" val=STRING
		public Alternatives getAlternatives() { return cAlternatives; }

		//name=ID "=" val=STRING
		public Group getGroup_0() { return cGroup_0; }

		//name=ID
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_0() { return cNameIDTerminalRuleCall_0_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_0_1() { return cEqualsSignKeyword_0_1; }

		//val=STRING
		public Assignment getValAssignment_0_2() { return cValAssignment_0_2; }

		//STRING
		public RuleCall getValSTRINGTerminalRuleCall_0_2_0() { return cValSTRINGTerminalRuleCall_0_2_0; }

		//name=ID ":" rightName=ID "=" val=STRING
		public Group getGroup_1() { return cGroup_1; }

		//name=ID
		public Assignment getNameAssignment_1_0() { return cNameAssignment_1_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0_0() { return cNameIDTerminalRuleCall_1_0_0; }

		//":"
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }

		//rightName=ID
		public Assignment getRightNameAssignment_1_2() { return cRightNameAssignment_1_2; }

		//ID
		public RuleCall getRightNameIDTerminalRuleCall_1_2_0() { return cRightNameIDTerminalRuleCall_1_2_0; }

		//"="
		public Keyword getEqualsSignKeyword_1_3() { return cEqualsSignKeyword_1_3; }

		//val=STRING
		public Assignment getValAssignment_1_4() { return cValAssignment_1_4; }

		//STRING
		public RuleCall getValSTRINGTerminalRuleCall_1_4_0() { return cValSTRINGTerminalRuleCall_1_4_0; }
	}
	
	
	private ModelElements pModel;
	private ElementElements pElement;
	private StartTagElements pStartTag;
	private EndTagElements pEndTag;
	private EmptyElementElements pEmptyElement;
	private PrologTagElements pPrologTag;
	private TagNameElements pTagName;
	private AttributeElements pAttribute;
	private TerminalRule tPROLOG_START;
	private TerminalRule tPROLOG_END;
	private TerminalRule tTAG_START_OPEN;
	private TerminalRule tTAG_END_OPEN;
	private TerminalRule tTAG_CLOSE;
	private TerminalRule tTAG_EMPTY_CLOSE;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public DocGenGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.passi.DocGen".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	/// **
	// * This is the main grammar for DocGen plugin. It is a plain xml grammar, so it's model-indipendent.
	// * / Model:
	//	prolog=prologTag xmldoc+=element*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//element:
	//	Start=startTag (innerElement+=element | ID)* End=endTag | emptyElement;
	public ElementElements getElementAccess() {
		return (pElement != null) ? pElement : (pElement = new ElementElements());
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}

	//startTag:
	//	TAG_START_OPEN tagName=TagName Attributes+=Attribute* TAG_CLOSE;
	public StartTagElements getStartTagAccess() {
		return (pStartTag != null) ? pStartTag : (pStartTag = new StartTagElements());
	}
	
	public ParserRule getStartTagRule() {
		return getStartTagAccess().getRule();
	}

	//endTag:
	//	TAG_END_OPEN tagName=TagName TAG_CLOSE;
	public EndTagElements getEndTagAccess() {
		return (pEndTag != null) ? pEndTag : (pEndTag = new EndTagElements());
	}
	
	public ParserRule getEndTagRule() {
		return getEndTagAccess().getRule();
	}

	//emptyElement:
	//	TAG_START_OPEN tagName=TagName Attributes+=Attribute* TAG_EMPTY_CLOSE;
	public EmptyElementElements getEmptyElementAccess() {
		return (pEmptyElement != null) ? pEmptyElement : (pEmptyElement = new EmptyElementElements());
	}
	
	public ParserRule getEmptyElementRule() {
		return getEmptyElementAccess().getRule();
	}

	//prologTag:
	//	PROLOG_START name="xml" Attributes+=Attribute* PROLOG_END;
	public PrologTagElements getPrologTagAccess() {
		return (pPrologTag != null) ? pPrologTag : (pPrologTag = new PrologTagElements());
	}
	
	public ParserRule getPrologTagRule() {
		return getPrologTagAccess().getRule();
	}

	//TagName:
	//	name=ID | name=ID ":" rightName=ID;
	public TagNameElements getTagNameAccess() {
		return (pTagName != null) ? pTagName : (pTagName = new TagNameElements());
	}
	
	public ParserRule getTagNameRule() {
		return getTagNameAccess().getRule();
	}

	//Attribute:
	//	name=ID "=" val=STRING | name=ID ":" rightName=ID "=" val=STRING;
	public AttributeElements getAttributeAccess() {
		return (pAttribute != null) ? pAttribute : (pAttribute = new AttributeElements());
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	/// ** 
	// ~~~~~~~~~~~~~~~~~
	// TERMINALS SECTION
	// ~~~~~~~~~~~~~~~~~
	// * / terminal PROLOG_START:
	//	"<?";
	public TerminalRule getPROLOG_STARTRule() {
		return (tPROLOG_START != null) ? tPROLOG_START : (tPROLOG_START = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "PROLOG_START"));
	} 

	//terminal PROLOG_END:
	//	"?>";
	public TerminalRule getPROLOG_ENDRule() {
		return (tPROLOG_END != null) ? tPROLOG_END : (tPROLOG_END = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "PROLOG_END"));
	} 

	//terminal TAG_START_OPEN:
	//	"<";
	public TerminalRule getTAG_START_OPENRule() {
		return (tTAG_START_OPEN != null) ? tTAG_START_OPEN : (tTAG_START_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TAG_START_OPEN"));
	} 

	//terminal TAG_END_OPEN:
	//	"</";
	public TerminalRule getTAG_END_OPENRule() {
		return (tTAG_END_OPEN != null) ? tTAG_END_OPEN : (tTAG_END_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TAG_END_OPEN"));
	} 

	//terminal TAG_CLOSE:
	//	">";
	public TerminalRule getTAG_CLOSERule() {
		return (tTAG_CLOSE != null) ? tTAG_CLOSE : (tTAG_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TAG_CLOSE"));
	} 

	//terminal TAG_EMPTY_CLOSE:
	//	"/>";
	public TerminalRule getTAG_EMPTY_CLOSERule() {
		return (tTAG_EMPTY_CLOSE != null) ? tTAG_EMPTY_CLOSE : (tTAG_EMPTY_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "TAG_EMPTY_CLOSE"));
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
