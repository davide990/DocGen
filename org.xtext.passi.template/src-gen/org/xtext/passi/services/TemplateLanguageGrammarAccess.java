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
public class TemplateLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class TemplateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Template");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTemplateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFeaturesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFeaturesFeatureParserRuleCall_3_0 = (RuleCall)cFeaturesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Template:
		//	"template" name=ID "{" Features+=Feature* "}";
		public ParserRule getRule() { return rule; }

		//"template" name=ID "{" Features+=Feature* "}"
		public Group getGroup() { return cGroup; }

		//"template"
		public Keyword getTemplateKeyword_0() { return cTemplateKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//Features+=Feature*
		public Assignment getFeaturesAssignment_3() { return cFeaturesAssignment_3; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_3_0() { return cFeaturesFeatureParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cValueAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cValueAttributeValueParserRuleCall_0_2_0 = (RuleCall)cValueAssignment_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final RuleCall cTableDataParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Feature:
		//	name=ID ":" value=AttributeValue ";" | TableData;
		public ParserRule getRule() { return rule; }

		//name=ID ":" value=AttributeValue ";" | TableData
		public Alternatives getAlternatives() { return cAlternatives; }

		//name=ID ":" value=AttributeValue ";"
		public Group getGroup_0() { return cGroup_0; }

		//name=ID
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_0() { return cNameIDTerminalRuleCall_0_0_0; }

		//":"
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }

		//value=AttributeValue
		public Assignment getValueAssignment_0_2() { return cValueAssignment_0_2; }

		//AttributeValue
		public RuleCall getValueAttributeValueParserRuleCall_0_2_0() { return cValueAttributeValueParserRuleCall_0_2_0; }

		//";"
		public Keyword getSemicolonKeyword_0_3() { return cSemicolonKeyword_0_3; }

		//TableData
		public RuleCall getTableDataParserRuleCall_1() { return cTableDataParserRuleCall_1; }
	}

	public class TableDataElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TableData");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTableDataAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cTableDataKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cForKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Assignment cTableDataAttributesAssignment_5_0 = (Assignment)cAlternatives_5.eContents().get(0);
		private final RuleCall cTableDataAttributesTableDataAttributeParserRuleCall_5_0_0 = (RuleCall)cTableDataAttributesAssignment_5_0.eContents().get(0);
		private final Assignment cSectionsAssignment_5_1 = (Assignment)cAlternatives_5.eContents().get(1);
		private final RuleCall cSectionsTableSectionParserRuleCall_5_1_0 = (RuleCall)cSectionsAssignment_5_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//TableData:
		//	{TableData} "tableData" "for" name=ID "{" (tableDataAttributes+=TableDataAttribute | sections+=TableSection)* "}";
		public ParserRule getRule() { return rule; }

		//{TableData} "tableData" "for" name=ID "{" (tableDataAttributes+=TableDataAttribute | sections+=TableSection)* "}"
		public Group getGroup() { return cGroup; }

		//{TableData}
		public Action getTableDataAction_0() { return cTableDataAction_0; }

		//"tableData"
		public Keyword getTableDataKeyword_1() { return cTableDataKeyword_1; }

		//"for"
		public Keyword getForKeyword_2() { return cForKeyword_2; }

		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//(tableDataAttributes+=TableDataAttribute | sections+=TableSection)*
		public Alternatives getAlternatives_5() { return cAlternatives_5; }

		//tableDataAttributes+=TableDataAttribute
		public Assignment getTableDataAttributesAssignment_5_0() { return cTableDataAttributesAssignment_5_0; }

		//TableDataAttribute
		public RuleCall getTableDataAttributesTableDataAttributeParserRuleCall_5_0_0() { return cTableDataAttributesTableDataAttributeParserRuleCall_5_0_0; }

		//sections+=TableSection
		public Assignment getSectionsAssignment_5_1() { return cSectionsAssignment_5_1; }

		//TableSection
		public RuleCall getSectionsTableSectionParserRuleCall_5_1_0() { return cSectionsTableSectionParserRuleCall_5_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class TableSectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TableSection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cNameAlternatives_1_0 = (Alternatives)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameSECTION_HEADERTerminalRuleCall_1_0_0 = (RuleCall)cNameAlternatives_1_0.eContents().get(0);
		private final RuleCall cNameSECTION_VALUESTerminalRuleCall_1_0_1 = (RuleCall)cNameAlternatives_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesTableDataAttributeParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//TableSection:
		//	"section" name=(SECTION_HEADER | SECTION_VALUES) "{" attributes+=TableDataAttribute* "}";
		public ParserRule getRule() { return rule; }

		//"section" name=(SECTION_HEADER | SECTION_VALUES) "{" attributes+=TableDataAttribute* "}"
		public Group getGroup() { return cGroup; }

		//"section"
		public Keyword getSectionKeyword_0() { return cSectionKeyword_0; }

		//name=(SECTION_HEADER | SECTION_VALUES)
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//SECTION_HEADER | SECTION_VALUES
		public Alternatives getNameAlternatives_1_0() { return cNameAlternatives_1_0; }

		//SECTION_HEADER
		public RuleCall getNameSECTION_HEADERTerminalRuleCall_1_0_0() { return cNameSECTION_HEADERTerminalRuleCall_1_0_0; }

		//SECTION_VALUES
		public RuleCall getNameSECTION_VALUESTerminalRuleCall_1_0_1() { return cNameSECTION_VALUESTerminalRuleCall_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//attributes+=TableDataAttribute*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }

		//TableDataAttribute
		public RuleCall getAttributesTableDataAttributeParserRuleCall_3_0() { return cAttributesTableDataAttributeParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class TableDataAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TableDataAttribute");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameQualifiedNameParserRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cValueAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cValueAttributeValueParserRuleCall_0_2_0 = (RuleCall)cValueAssignment_0_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final RuleCall cListAttributeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TableDataAttribute:
		//	name=QualifiedName ":" value=AttributeValue ";" | ListAttribute;
		public ParserRule getRule() { return rule; }

		//name=QualifiedName ":" value=AttributeValue ";" | ListAttribute
		public Alternatives getAlternatives() { return cAlternatives; }

		//name=QualifiedName ":" value=AttributeValue ";"
		public Group getGroup_0() { return cGroup_0; }

		//name=QualifiedName
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0_0_0() { return cNameQualifiedNameParserRuleCall_0_0_0; }

		//":"
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }

		//value=AttributeValue
		public Assignment getValueAssignment_0_2() { return cValueAssignment_0_2; }

		//AttributeValue
		public RuleCall getValueAttributeValueParserRuleCall_0_2_0() { return cValueAttributeValueParserRuleCall_0_2_0; }

		//";"
		public Keyword getSemicolonKeyword_0_3() { return cSemicolonKeyword_0_3; }

		//ListAttribute
		public RuleCall getListAttributeParserRuleCall_1() { return cListAttributeParserRuleCall_1; }
	}

	public class ListAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ListAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameQualifiedNameParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cValuesAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cValuesSTRINGTerminalRuleCall_3_0_0 = (RuleCall)cValuesAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cValuesAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cValuesSTRINGTerminalRuleCall_3_1_1_0 = (RuleCall)cValuesAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//ListAttribute:
		//	name=QualifiedName ":" "{" (values+=STRING ("," values+=STRING)*)? "}" ";";
		public ParserRule getRule() { return rule; }

		//name=QualifiedName ":" "{" (values+=STRING ("," values+=STRING)*)? "}" ";"
		public Group getGroup() { return cGroup; }

		//name=QualifiedName
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_0_0() { return cNameQualifiedNameParserRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//(values+=STRING ("," values+=STRING)*)?
		public Group getGroup_3() { return cGroup_3; }

		//values+=STRING
		public Assignment getValuesAssignment_3_0() { return cValuesAssignment_3_0; }

		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_3_0_0() { return cValuesSTRINGTerminalRuleCall_3_0_0; }

		//("," values+=STRING)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//values+=STRING
		public Assignment getValuesAssignment_3_1_1() { return cValuesAssignment_3_1_1; }

		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_3_1_1_0() { return cValuesSTRINGTerminalRuleCall_3_1_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class AttributeListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AttributeList");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Keyword cCommaKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1_1_1 = (RuleCall)cGroup_1_1.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//AttributeList:
		//	"{" (STRING ("," STRING)*)? "}";
		public ParserRule getRule() { return rule; }

		//"{" (STRING ("," STRING)*)? "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//(STRING ("," STRING)*)?
		public Group getGroup_1() { return cGroup_1; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1_0() { return cSTRINGTerminalRuleCall_1_0; }

		//("," STRING)*
		public Group getGroup_1_1() { return cGroup_1_1; }

		//","
		public Keyword getCommaKeyword_1_1_0() { return cCommaKeyword_1_1_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1_1_1() { return cSTRINGTerminalRuleCall_1_1_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class AttributeValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AttributeValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final Keyword cTrueKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cFalseKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//AttributeValue:
		//	STRING | INT | "true" | "false";
		public ParserRule getRule() { return rule; }

		//STRING | INT | "true" | "false"
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }

		//"true"
		public Keyword getTrueKeyword_2() { return cTrueKeyword_2; }

		//"false"
		public Keyword getFalseKeyword_3() { return cFalseKeyword_3; }
	}
	
	
	private TemplateElements pTemplate;
	private FeatureElements pFeature;
	private TableDataElements pTableData;
	private TableSectionElements pTableSection;
	private TableDataAttributeElements pTableDataAttribute;
	private ListAttributeElements pListAttribute;
	private AttributeListElements pAttributeList;
	private QualifiedNameElements pQualifiedName;
	private TerminalRule tSECTION_HEADER;
	private TerminalRule tSECTION_VALUES;
	private AttributeValueElements pAttributeValue;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public TemplateLanguageGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.passi.TemplateLanguage".equals(grammar.getName())) {
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

	
	//Template:
	//	"template" name=ID "{" Features+=Feature* "}";
	public TemplateElements getTemplateAccess() {
		return (pTemplate != null) ? pTemplate : (pTemplate = new TemplateElements());
	}
	
	public ParserRule getTemplateRule() {
		return getTemplateAccess().getRule();
	}

	//Feature:
	//	name=ID ":" value=AttributeValue ";" | TableData;
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//TableData:
	//	{TableData} "tableData" "for" name=ID "{" (tableDataAttributes+=TableDataAttribute | sections+=TableSection)* "}";
	public TableDataElements getTableDataAccess() {
		return (pTableData != null) ? pTableData : (pTableData = new TableDataElements());
	}
	
	public ParserRule getTableDataRule() {
		return getTableDataAccess().getRule();
	}

	//TableSection:
	//	"section" name=(SECTION_HEADER | SECTION_VALUES) "{" attributes+=TableDataAttribute* "}";
	public TableSectionElements getTableSectionAccess() {
		return (pTableSection != null) ? pTableSection : (pTableSection = new TableSectionElements());
	}
	
	public ParserRule getTableSectionRule() {
		return getTableSectionAccess().getRule();
	}

	//TableDataAttribute:
	//	name=QualifiedName ":" value=AttributeValue ";" | ListAttribute;
	public TableDataAttributeElements getTableDataAttributeAccess() {
		return (pTableDataAttribute != null) ? pTableDataAttribute : (pTableDataAttribute = new TableDataAttributeElements());
	}
	
	public ParserRule getTableDataAttributeRule() {
		return getTableDataAttributeAccess().getRule();
	}

	//ListAttribute:
	//	name=QualifiedName ":" "{" (values+=STRING ("," values+=STRING)*)? "}" ";";
	public ListAttributeElements getListAttributeAccess() {
		return (pListAttribute != null) ? pListAttribute : (pListAttribute = new ListAttributeElements());
	}
	
	public ParserRule getListAttributeRule() {
		return getListAttributeAccess().getRule();
	}

	//AttributeList:
	//	"{" (STRING ("," STRING)*)? "}";
	public AttributeListElements getAttributeListAccess() {
		return (pAttributeList != null) ? pAttributeList : (pAttributeList = new AttributeListElements());
	}
	
	public ParserRule getAttributeListRule() {
		return getAttributeListAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal SECTION_HEADER:
	//	"header";
	public TerminalRule getSECTION_HEADERRule() {
		return (tSECTION_HEADER != null) ? tSECTION_HEADER : (tSECTION_HEADER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SECTION_HEADER"));
	} 

	//terminal SECTION_VALUES:
	//	"values";
	public TerminalRule getSECTION_VALUESRule() {
		return (tSECTION_VALUES != null) ? tSECTION_VALUES : (tSECTION_VALUES = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SECTION_VALUES"));
	} 

	//AttributeValue:
	//	STRING | INT | "true" | "false";
	public AttributeValueElements getAttributeValueAccess() {
		return (pAttributeValue != null) ? pAttributeValue : (pAttributeValue = new AttributeValueElements());
	}
	
	public ParserRule getAttributeValueRule() {
		return getAttributeValueAccess().getRule();
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
