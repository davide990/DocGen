/*
* generated by Xtext
*/
grammar InternalTemplateLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.xtext.passi.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.passi.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.passi.services.TemplateLanguageGrammarAccess;

}

@parser::members {
 
 	private TemplateLanguageGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(TemplateLanguageGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleTemplate
entryRuleTemplate 
:
{ before(grammarAccess.getTemplateRule()); }
	 ruleTemplate
{ after(grammarAccess.getTemplateRule()); } 
	 EOF 
;

// Rule Template
ruleTemplate
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTemplateAccess().getGroup()); }
(rule__Template__Group__0)
{ after(grammarAccess.getTemplateAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFeature
entryRuleFeature 
:
{ before(grammarAccess.getFeatureRule()); }
	 ruleFeature
{ after(grammarAccess.getFeatureRule()); } 
	 EOF 
;

// Rule Feature
ruleFeature
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFeatureAccess().getAlternatives()); }
(rule__Feature__Alternatives)
{ after(grammarAccess.getFeatureAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTableData
entryRuleTableData 
:
{ before(grammarAccess.getTableDataRule()); }
	 ruleTableData
{ after(grammarAccess.getTableDataRule()); } 
	 EOF 
;

// Rule TableData
ruleTableData
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTableDataAccess().getGroup()); }
(rule__TableData__Group__0)
{ after(grammarAccess.getTableDataAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTableSection
entryRuleTableSection 
:
{ before(grammarAccess.getTableSectionRule()); }
	 ruleTableSection
{ after(grammarAccess.getTableSectionRule()); } 
	 EOF 
;

// Rule TableSection
ruleTableSection
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTableSectionAccess().getGroup()); }
(rule__TableSection__Group__0)
{ after(grammarAccess.getTableSectionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTableDataAttribute
entryRuleTableDataAttribute 
:
{ before(grammarAccess.getTableDataAttributeRule()); }
	 ruleTableDataAttribute
{ after(grammarAccess.getTableDataAttributeRule()); } 
	 EOF 
;

// Rule TableDataAttribute
ruleTableDataAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTableDataAttributeAccess().getAlternatives()); }
(rule__TableDataAttribute__Alternatives)
{ after(grammarAccess.getTableDataAttributeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleListAttribute
entryRuleListAttribute 
:
{ before(grammarAccess.getListAttributeRule()); }
	 ruleListAttribute
{ after(grammarAccess.getListAttributeRule()); } 
	 EOF 
;

// Rule ListAttribute
ruleListAttribute
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getListAttributeAccess().getGroup()); }
(rule__ListAttribute__Group__0)
{ after(grammarAccess.getListAttributeAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttributeValue
entryRuleAttributeValue 
:
{ before(grammarAccess.getAttributeValueRule()); }
	 ruleAttributeValue
{ after(grammarAccess.getAttributeValueRule()); } 
	 EOF 
;

// Rule AttributeValue
ruleAttributeValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttributeValueAccess().getAlternatives()); }
(rule__AttributeValue__Alternatives)
{ after(grammarAccess.getAttributeValueAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__Feature__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getGroup_0()); }
(rule__Feature__Group_0__0)
{ after(grammarAccess.getFeatureAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getFeatureAccess().getTableDataParserRuleCall_1()); }
	ruleTableData
{ after(grammarAccess.getFeatureAccess().getTableDataParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__Alternatives_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getTableDataAttributesAssignment_5_0()); }
(rule__TableData__TableDataAttributesAssignment_5_0)
{ after(grammarAccess.getTableDataAccess().getTableDataAttributesAssignment_5_0()); }
)

    |(
{ before(grammarAccess.getTableDataAccess().getSectionsAssignment_5_1()); }
(rule__TableData__SectionsAssignment_5_1)
{ after(grammarAccess.getTableDataAccess().getSectionsAssignment_5_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TableSection__NameAlternatives_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableSectionAccess().getNameSECTION_HEADERTerminalRuleCall_1_0_0()); }
	RULE_SECTION_HEADER
{ after(grammarAccess.getTableSectionAccess().getNameSECTION_HEADERTerminalRuleCall_1_0_0()); }
)

    |(
{ before(grammarAccess.getTableSectionAccess().getNameSECTION_VALUESTerminalRuleCall_1_0_1()); }
	RULE_SECTION_VALUES
{ after(grammarAccess.getTableSectionAccess().getNameSECTION_VALUESTerminalRuleCall_1_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TableDataAttribute__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAttributeAccess().getGroup_0()); }
(rule__TableDataAttribute__Group_0__0)
{ after(grammarAccess.getTableDataAttributeAccess().getGroup_0()); }
)

    |(
{ before(grammarAccess.getTableDataAttributeAccess().getListAttributeParserRuleCall_1()); }
	ruleListAttribute
{ after(grammarAccess.getTableDataAttributeAccess().getListAttributeParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeValue__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_0()); }
	RULE_STRING
{ after(grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_1()); }
	RULE_INT
{ after(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_1()); }
)

    |(
{ before(grammarAccess.getAttributeValueAccess().getTrueKeyword_2()); }

	'true' 

{ after(grammarAccess.getAttributeValueAccess().getTrueKeyword_2()); }
)

    |(
{ before(grammarAccess.getAttributeValueAccess().getFalseKeyword_3()); }

	'false' 

{ after(grammarAccess.getAttributeValueAccess().getFalseKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Template__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Template__Group__0__Impl
	rule__Template__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Template__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); }

	'template' 

{ after(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Template__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Template__Group__1__Impl
	rule__Template__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Template__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTemplateAccess().getNameAssignment_1()); }
(rule__Template__NameAssignment_1)
{ after(grammarAccess.getTemplateAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Template__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Template__Group__2__Impl
	rule__Template__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Template__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Template__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Template__Group__3__Impl
	rule__Template__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Template__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTemplateAccess().getFeaturesAssignment_3()); }
(rule__Template__FeaturesAssignment_3)*
{ after(grammarAccess.getTemplateAccess().getFeaturesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Template__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Template__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Template__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Feature__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_0__0__Impl
	rule__Feature__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameAssignment_0_0()); }
(rule__Feature__NameAssignment_0_0)
{ after(grammarAccess.getFeatureAccess().getNameAssignment_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_0__1__Impl
	rule__Feature__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getColonKeyword_0_1()); }

	':' 

{ after(grammarAccess.getFeatureAccess().getColonKeyword_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_0__2__Impl
	rule__Feature__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getValueAssignment_0_2()); }
(rule__Feature__ValueAssignment_0_2)
{ after(grammarAccess.getFeatureAccess().getValueAssignment_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Feature__Group_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Feature__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__Group_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_3()); }

	';' 

{ after(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__TableData__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableData__Group__0__Impl
	rule__TableData__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getTableDataAction_0()); }
(

)
{ after(grammarAccess.getTableDataAccess().getTableDataAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableData__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableData__Group__1__Impl
	rule__TableData__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getTableDataKeyword_1()); }

	'tableData' 

{ after(grammarAccess.getTableDataAccess().getTableDataKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableData__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableData__Group__2__Impl
	rule__TableData__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getForKeyword_2()); }

	'for' 

{ after(grammarAccess.getTableDataAccess().getForKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableData__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableData__Group__3__Impl
	rule__TableData__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getNameAssignment_3()); }
(rule__TableData__NameAssignment_3)
{ after(grammarAccess.getTableDataAccess().getNameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableData__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableData__Group__4__Impl
	rule__TableData__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getTableDataAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableData__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableData__Group__5__Impl
	rule__TableData__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getAlternatives_5()); }
(rule__TableData__Alternatives_5)*
{ after(grammarAccess.getTableDataAccess().getAlternatives_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableData__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableData__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getTableDataAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__TableSection__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableSection__Group__0__Impl
	rule__TableSection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TableSection__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableSectionAccess().getSectionKeyword_0()); }

	'section' 

{ after(grammarAccess.getTableSectionAccess().getSectionKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableSection__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableSection__Group__1__Impl
	rule__TableSection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TableSection__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableSectionAccess().getNameAssignment_1()); }
(rule__TableSection__NameAssignment_1)
{ after(grammarAccess.getTableSectionAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableSection__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableSection__Group__2__Impl
	rule__TableSection__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TableSection__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableSectionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getTableSectionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableSection__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableSection__Group__3__Impl
	rule__TableSection__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TableSection__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableSectionAccess().getAttributesAssignment_3()); }
(rule__TableSection__AttributesAssignment_3)*
{ after(grammarAccess.getTableSectionAccess().getAttributesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableSection__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableSection__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TableSection__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableSectionAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getTableSectionAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__TableDataAttribute__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableDataAttribute__Group_0__0__Impl
	rule__TableDataAttribute__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TableDataAttribute__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAttributeAccess().getNameAssignment_0_0()); }
(rule__TableDataAttribute__NameAssignment_0_0)
{ after(grammarAccess.getTableDataAttributeAccess().getNameAssignment_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableDataAttribute__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableDataAttribute__Group_0__1__Impl
	rule__TableDataAttribute__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TableDataAttribute__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAttributeAccess().getColonKeyword_0_1()); }

	':' 

{ after(grammarAccess.getTableDataAttributeAccess().getColonKeyword_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableDataAttribute__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableDataAttribute__Group_0__2__Impl
	rule__TableDataAttribute__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TableDataAttribute__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAttributeAccess().getValueAssignment_0_2()); }
(rule__TableDataAttribute__ValueAssignment_0_2)
{ after(grammarAccess.getTableDataAttributeAccess().getValueAssignment_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__TableDataAttribute__Group_0__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__TableDataAttribute__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TableDataAttribute__Group_0__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAttributeAccess().getSemicolonKeyword_0_3()); }

	';' 

{ after(grammarAccess.getTableDataAttributeAccess().getSemicolonKeyword_0_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__ListAttribute__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListAttribute__Group__0__Impl
	rule__ListAttribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getNameAssignment_0()); }
(rule__ListAttribute__NameAssignment_0)
{ after(grammarAccess.getListAttributeAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListAttribute__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListAttribute__Group__1__Impl
	rule__ListAttribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getColonKeyword_1()); }

	':' 

{ after(grammarAccess.getListAttributeAccess().getColonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListAttribute__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListAttribute__Group__2__Impl
	rule__ListAttribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getListAttributeAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListAttribute__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListAttribute__Group__3__Impl
	rule__ListAttribute__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getGroup_3()); }
(rule__ListAttribute__Group_3__0)?
{ after(grammarAccess.getListAttributeAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListAttribute__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListAttribute__Group__4__Impl
	rule__ListAttribute__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getListAttributeAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListAttribute__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListAttribute__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getSemicolonKeyword_5()); }

	';' 

{ after(grammarAccess.getListAttributeAccess().getSemicolonKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}














rule__ListAttribute__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListAttribute__Group_3__0__Impl
	rule__ListAttribute__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getValuesAssignment_3_0()); }
(rule__ListAttribute__ValuesAssignment_3_0)
{ after(grammarAccess.getListAttributeAccess().getValuesAssignment_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListAttribute__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListAttribute__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getGroup_3_1()); }
(rule__ListAttribute__Group_3_1__0)*
{ after(grammarAccess.getListAttributeAccess().getGroup_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ListAttribute__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListAttribute__Group_3_1__0__Impl
	rule__ListAttribute__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getCommaKeyword_3_1_0()); }

	',' 

{ after(grammarAccess.getListAttributeAccess().getCommaKeyword_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ListAttribute__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ListAttribute__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getValuesAssignment_3_1_1()); }
(rule__ListAttribute__ValuesAssignment_3_1_1)
{ after(grammarAccess.getListAttributeAccess().getValuesAssignment_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}









rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Template__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Template__FeaturesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTemplateAccess().getFeaturesFeatureParserRuleCall_3_0()); }
	ruleFeature{ after(grammarAccess.getTemplateAccess().getFeaturesFeatureParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__NameAssignment_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0_0()); }
	RULE_ID{ after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Feature__ValueAssignment_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFeatureAccess().getValueAttributeValueParserRuleCall_0_2_0()); }
	ruleAttributeValue{ after(grammarAccess.getFeatureAccess().getValueAttributeValueParserRuleCall_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__NameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getNameIDTerminalRuleCall_3_0()); }
	RULE_ID{ after(grammarAccess.getTableDataAccess().getNameIDTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__TableDataAttributesAssignment_5_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getTableDataAttributesTableDataAttributeParserRuleCall_5_0_0()); }
	ruleTableDataAttribute{ after(grammarAccess.getTableDataAccess().getTableDataAttributesTableDataAttributeParserRuleCall_5_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TableData__SectionsAssignment_5_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAccess().getSectionsTableSectionParserRuleCall_5_1_0()); }
	ruleTableSection{ after(grammarAccess.getTableDataAccess().getSectionsTableSectionParserRuleCall_5_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TableSection__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableSectionAccess().getNameAlternatives_1_0()); }
(rule__TableSection__NameAlternatives_1_0)
{ after(grammarAccess.getTableSectionAccess().getNameAlternatives_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TableSection__AttributesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableSectionAccess().getAttributesTableDataAttributeParserRuleCall_3_0()); }
	ruleTableDataAttribute{ after(grammarAccess.getTableSectionAccess().getAttributesTableDataAttributeParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TableDataAttribute__NameAssignment_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAttributeAccess().getNameQualifiedNameParserRuleCall_0_0_0()); }
	ruleQualifiedName{ after(grammarAccess.getTableDataAttributeAccess().getNameQualifiedNameParserRuleCall_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__TableDataAttribute__ValueAssignment_0_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTableDataAttributeAccess().getValueAttributeValueParserRuleCall_0_2_0()); }
	ruleAttributeValue{ after(grammarAccess.getTableDataAttributeAccess().getValueAttributeValueParserRuleCall_0_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getNameQualifiedNameParserRuleCall_0_0()); }
	ruleQualifiedName{ after(grammarAccess.getListAttributeAccess().getNameQualifiedNameParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__ValuesAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getValuesSTRINGTerminalRuleCall_3_0_0()); }
	RULE_STRING{ after(grammarAccess.getListAttributeAccess().getValuesSTRINGTerminalRuleCall_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ListAttribute__ValuesAssignment_3_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getListAttributeAccess().getValuesSTRINGTerminalRuleCall_3_1_1_0()); }
	RULE_STRING{ after(grammarAccess.getListAttributeAccess().getValuesSTRINGTerminalRuleCall_3_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_SECTION_HEADER : 'header';

RULE_SECTION_VALUES : 'values';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


