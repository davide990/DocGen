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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemplateLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SECTION_HEADER", "RULE_SECTION_VALUES", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'template'", "'{'", "'}'", "':'", "';'", "'tableData'", "'for'", "'section'", "','", "'.'"
    };
    public static final int RULE_ID=8;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_SECTION_VALUES=5;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SECTION_HEADER=4;
    public static final int RULE_INT=7;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalTemplateLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTemplateLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTemplateLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g"; }


     
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




    // $ANTLR start "entryRuleTemplate"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:60:1: entryRuleTemplate : ruleTemplate EOF ;
    public final void entryRuleTemplate() throws RecognitionException {
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:61:1: ( ruleTemplate EOF )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:62:1: ruleTemplate EOF
            {
             before(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate61);
            ruleTemplate();

            state._fsp--;

             after(grammarAccess.getTemplateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:69:1: ruleTemplate : ( ( rule__Template__Group__0 ) ) ;
    public final void ruleTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:73:2: ( ( ( rule__Template__Group__0 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:74:1: ( ( rule__Template__Group__0 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:74:1: ( ( rule__Template__Group__0 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:75:1: ( rule__Template__Group__0 )
            {
             before(grammarAccess.getTemplateAccess().getGroup()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:76:1: ( rule__Template__Group__0 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:76:2: rule__Template__Group__0
            {
            pushFollow(FOLLOW_rule__Template__Group__0_in_ruleTemplate94);
            rule__Template__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleFeature"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:88:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:89:1: ( ruleFeature EOF )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:90:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature121);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:97:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:101:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:102:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:102:1: ( ( rule__Feature__Alternatives ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:103:1: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:104:1: ( rule__Feature__Alternatives )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:104:2: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_rule__Feature__Alternatives_in_ruleFeature154);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleTableData"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:116:1: entryRuleTableData : ruleTableData EOF ;
    public final void entryRuleTableData() throws RecognitionException {
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:117:1: ( ruleTableData EOF )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:118:1: ruleTableData EOF
            {
             before(grammarAccess.getTableDataRule()); 
            pushFollow(FOLLOW_ruleTableData_in_entryRuleTableData181);
            ruleTableData();

            state._fsp--;

             after(grammarAccess.getTableDataRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableData188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableData"


    // $ANTLR start "ruleTableData"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:125:1: ruleTableData : ( ( rule__TableData__Group__0 ) ) ;
    public final void ruleTableData() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:129:2: ( ( ( rule__TableData__Group__0 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:130:1: ( ( rule__TableData__Group__0 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:130:1: ( ( rule__TableData__Group__0 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:131:1: ( rule__TableData__Group__0 )
            {
             before(grammarAccess.getTableDataAccess().getGroup()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:132:1: ( rule__TableData__Group__0 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:132:2: rule__TableData__Group__0
            {
            pushFollow(FOLLOW_rule__TableData__Group__0_in_ruleTableData214);
            rule__TableData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableData"


    // $ANTLR start "entryRuleTableSection"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:144:1: entryRuleTableSection : ruleTableSection EOF ;
    public final void entryRuleTableSection() throws RecognitionException {
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:145:1: ( ruleTableSection EOF )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:146:1: ruleTableSection EOF
            {
             before(grammarAccess.getTableSectionRule()); 
            pushFollow(FOLLOW_ruleTableSection_in_entryRuleTableSection241);
            ruleTableSection();

            state._fsp--;

             after(grammarAccess.getTableSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableSection248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableSection"


    // $ANTLR start "ruleTableSection"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:153:1: ruleTableSection : ( ( rule__TableSection__Group__0 ) ) ;
    public final void ruleTableSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:157:2: ( ( ( rule__TableSection__Group__0 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:158:1: ( ( rule__TableSection__Group__0 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:158:1: ( ( rule__TableSection__Group__0 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:159:1: ( rule__TableSection__Group__0 )
            {
             before(grammarAccess.getTableSectionAccess().getGroup()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:160:1: ( rule__TableSection__Group__0 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:160:2: rule__TableSection__Group__0
            {
            pushFollow(FOLLOW_rule__TableSection__Group__0_in_ruleTableSection274);
            rule__TableSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableSection"


    // $ANTLR start "entryRuleTableDataAttribute"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:172:1: entryRuleTableDataAttribute : ruleTableDataAttribute EOF ;
    public final void entryRuleTableDataAttribute() throws RecognitionException {
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:173:1: ( ruleTableDataAttribute EOF )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:174:1: ruleTableDataAttribute EOF
            {
             before(grammarAccess.getTableDataAttributeRule()); 
            pushFollow(FOLLOW_ruleTableDataAttribute_in_entryRuleTableDataAttribute301);
            ruleTableDataAttribute();

            state._fsp--;

             after(grammarAccess.getTableDataAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDataAttribute308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTableDataAttribute"


    // $ANTLR start "ruleTableDataAttribute"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:181:1: ruleTableDataAttribute : ( ( rule__TableDataAttribute__Alternatives ) ) ;
    public final void ruleTableDataAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:185:2: ( ( ( rule__TableDataAttribute__Alternatives ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:186:1: ( ( rule__TableDataAttribute__Alternatives ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:186:1: ( ( rule__TableDataAttribute__Alternatives ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:187:1: ( rule__TableDataAttribute__Alternatives )
            {
             before(grammarAccess.getTableDataAttributeAccess().getAlternatives()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:188:1: ( rule__TableDataAttribute__Alternatives )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:188:2: rule__TableDataAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__TableDataAttribute__Alternatives_in_ruleTableDataAttribute334);
            rule__TableDataAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTableDataAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableDataAttribute"


    // $ANTLR start "entryRuleListAttribute"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:200:1: entryRuleListAttribute : ruleListAttribute EOF ;
    public final void entryRuleListAttribute() throws RecognitionException {
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:201:1: ( ruleListAttribute EOF )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:202:1: ruleListAttribute EOF
            {
             before(grammarAccess.getListAttributeRule()); 
            pushFollow(FOLLOW_ruleListAttribute_in_entryRuleListAttribute361);
            ruleListAttribute();

            state._fsp--;

             after(grammarAccess.getListAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListAttribute368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListAttribute"


    // $ANTLR start "ruleListAttribute"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:209:1: ruleListAttribute : ( ( rule__ListAttribute__Group__0 ) ) ;
    public final void ruleListAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:213:2: ( ( ( rule__ListAttribute__Group__0 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:214:1: ( ( rule__ListAttribute__Group__0 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:214:1: ( ( rule__ListAttribute__Group__0 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:215:1: ( rule__ListAttribute__Group__0 )
            {
             before(grammarAccess.getListAttributeAccess().getGroup()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:216:1: ( rule__ListAttribute__Group__0 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:216:2: rule__ListAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group__0_in_ruleListAttribute394);
            rule__ListAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:230:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:231:1: ( ruleQualifiedName EOF )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:232:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName423);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:239:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:243:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:244:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:244:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:245:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:246:1: ( rule__QualifiedName__Group__0 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:246:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName456);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleAttributeValue"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:258:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:259:1: ( ruleAttributeValue EOF )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:260:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue483);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:267:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:271:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:272:1: ( ( rule__AttributeValue__Alternatives ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:272:1: ( ( rule__AttributeValue__Alternatives ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:273:1: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:274:1: ( rule__AttributeValue__Alternatives )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:274:2: rule__AttributeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue516);
            rule__AttributeValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:286:1: rule__Feature__Alternatives : ( ( ( rule__Feature__Group_0__0 ) ) | ( ruleTableData ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:290:1: ( ( ( rule__Feature__Group_0__0 ) ) | ( ruleTableData ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:291:1: ( ( rule__Feature__Group_0__0 ) )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:291:1: ( ( rule__Feature__Group_0__0 ) )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:292:1: ( rule__Feature__Group_0__0 )
                    {
                     before(grammarAccess.getFeatureAccess().getGroup_0()); 
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:293:1: ( rule__Feature__Group_0__0 )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:293:2: rule__Feature__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Feature__Group_0__0_in_rule__Feature__Alternatives552);
                    rule__Feature__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:297:6: ( ruleTableData )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:297:6: ( ruleTableData )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:298:1: ruleTableData
                    {
                     before(grammarAccess.getFeatureAccess().getTableDataParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTableData_in_rule__Feature__Alternatives570);
                    ruleTableData();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getTableDataParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__TableData__Alternatives_5"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:308:1: rule__TableData__Alternatives_5 : ( ( ( rule__TableData__TableDataAttributesAssignment_5_0 ) ) | ( ( rule__TableData__SectionsAssignment_5_1 ) ) );
    public final void rule__TableData__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:312:1: ( ( ( rule__TableData__TableDataAttributesAssignment_5_0 ) ) | ( ( rule__TableData__SectionsAssignment_5_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==22) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:313:1: ( ( rule__TableData__TableDataAttributesAssignment_5_0 ) )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:313:1: ( ( rule__TableData__TableDataAttributesAssignment_5_0 ) )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:314:1: ( rule__TableData__TableDataAttributesAssignment_5_0 )
                    {
                     before(grammarAccess.getTableDataAccess().getTableDataAttributesAssignment_5_0()); 
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:315:1: ( rule__TableData__TableDataAttributesAssignment_5_0 )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:315:2: rule__TableData__TableDataAttributesAssignment_5_0
                    {
                    pushFollow(FOLLOW_rule__TableData__TableDataAttributesAssignment_5_0_in_rule__TableData__Alternatives_5602);
                    rule__TableData__TableDataAttributesAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTableDataAccess().getTableDataAttributesAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:319:6: ( ( rule__TableData__SectionsAssignment_5_1 ) )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:319:6: ( ( rule__TableData__SectionsAssignment_5_1 ) )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:320:1: ( rule__TableData__SectionsAssignment_5_1 )
                    {
                     before(grammarAccess.getTableDataAccess().getSectionsAssignment_5_1()); 
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:321:1: ( rule__TableData__SectionsAssignment_5_1 )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:321:2: rule__TableData__SectionsAssignment_5_1
                    {
                    pushFollow(FOLLOW_rule__TableData__SectionsAssignment_5_1_in_rule__TableData__Alternatives_5620);
                    rule__TableData__SectionsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTableDataAccess().getSectionsAssignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Alternatives_5"


    // $ANTLR start "rule__TableSection__NameAlternatives_1_0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:330:1: rule__TableSection__NameAlternatives_1_0 : ( ( RULE_SECTION_HEADER ) | ( RULE_SECTION_VALUES ) );
    public final void rule__TableSection__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:334:1: ( ( RULE_SECTION_HEADER ) | ( RULE_SECTION_VALUES ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SECTION_HEADER) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_SECTION_VALUES) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:335:1: ( RULE_SECTION_HEADER )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:335:1: ( RULE_SECTION_HEADER )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:336:1: RULE_SECTION_HEADER
                    {
                     before(grammarAccess.getTableSectionAccess().getNameSECTION_HEADERTerminalRuleCall_1_0_0()); 
                    match(input,RULE_SECTION_HEADER,FOLLOW_RULE_SECTION_HEADER_in_rule__TableSection__NameAlternatives_1_0653); 
                     after(grammarAccess.getTableSectionAccess().getNameSECTION_HEADERTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:341:6: ( RULE_SECTION_VALUES )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:341:6: ( RULE_SECTION_VALUES )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:342:1: RULE_SECTION_VALUES
                    {
                     before(grammarAccess.getTableSectionAccess().getNameSECTION_VALUESTerminalRuleCall_1_0_1()); 
                    match(input,RULE_SECTION_VALUES,FOLLOW_RULE_SECTION_VALUES_in_rule__TableSection__NameAlternatives_1_0670); 
                     after(grammarAccess.getTableSectionAccess().getNameSECTION_VALUESTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__NameAlternatives_1_0"


    // $ANTLR start "rule__TableDataAttribute__Alternatives"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:352:1: rule__TableDataAttribute__Alternatives : ( ( ( rule__TableDataAttribute__Group_0__0 ) ) | ( ruleListAttribute ) );
    public final void rule__TableDataAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:356:1: ( ( ( rule__TableDataAttribute__Group_0__0 ) ) | ( ruleListAttribute ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:357:1: ( ( rule__TableDataAttribute__Group_0__0 ) )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:357:1: ( ( rule__TableDataAttribute__Group_0__0 ) )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:358:1: ( rule__TableDataAttribute__Group_0__0 )
                    {
                     before(grammarAccess.getTableDataAttributeAccess().getGroup_0()); 
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:359:1: ( rule__TableDataAttribute__Group_0__0 )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:359:2: rule__TableDataAttribute__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TableDataAttribute__Group_0__0_in_rule__TableDataAttribute__Alternatives702);
                    rule__TableDataAttribute__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTableDataAttributeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:363:6: ( ruleListAttribute )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:363:6: ( ruleListAttribute )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:364:1: ruleListAttribute
                    {
                     before(grammarAccess.getTableDataAttributeAccess().getListAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListAttribute_in_rule__TableDataAttribute__Alternatives720);
                    ruleListAttribute();

                    state._fsp--;

                     after(grammarAccess.getTableDataAttributeAccess().getListAttributeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__Alternatives"


    // $ANTLR start "rule__AttributeValue__Alternatives"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:374:1: rule__AttributeValue__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( 'true' ) | ( 'false' ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:378:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( 'true' ) | ( 'false' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:379:1: ( RULE_STRING )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:379:1: ( RULE_STRING )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:380:1: RULE_STRING
                    {
                     before(grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__AttributeValue__Alternatives752); 
                     after(grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:385:6: ( RULE_INT )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:385:6: ( RULE_INT )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:386:1: RULE_INT
                    {
                     before(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__AttributeValue__Alternatives769); 
                     after(grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:391:6: ( 'true' )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:391:6: ( 'true' )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:392:1: 'true'
                    {
                     before(grammarAccess.getAttributeValueAccess().getTrueKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__AttributeValue__Alternatives787); 
                     after(grammarAccess.getAttributeValueAccess().getTrueKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:399:6: ( 'false' )
                    {
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:399:6: ( 'false' )
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:400:1: 'false'
                    {
                     before(grammarAccess.getAttributeValueAccess().getFalseKeyword_3()); 
                    match(input,14,FOLLOW_14_in_rule__AttributeValue__Alternatives807); 
                     after(grammarAccess.getAttributeValueAccess().getFalseKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Alternatives"


    // $ANTLR start "rule__Template__Group__0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:414:1: rule__Template__Group__0 : rule__Template__Group__0__Impl rule__Template__Group__1 ;
    public final void rule__Template__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:418:1: ( rule__Template__Group__0__Impl rule__Template__Group__1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:419:2: rule__Template__Group__0__Impl rule__Template__Group__1
            {
            pushFollow(FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__0839);
            rule__Template__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__1_in_rule__Template__Group__0842);
            rule__Template__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__0"


    // $ANTLR start "rule__Template__Group__0__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:426:1: rule__Template__Group__0__Impl : ( 'template' ) ;
    public final void rule__Template__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:430:1: ( ( 'template' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:431:1: ( 'template' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:431:1: ( 'template' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:432:1: 'template'
            {
             before(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Template__Group__0__Impl870); 
             after(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__0__Impl"


    // $ANTLR start "rule__Template__Group__1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:445:1: rule__Template__Group__1 : rule__Template__Group__1__Impl rule__Template__Group__2 ;
    public final void rule__Template__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:449:1: ( rule__Template__Group__1__Impl rule__Template__Group__2 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:450:2: rule__Template__Group__1__Impl rule__Template__Group__2
            {
            pushFollow(FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__1901);
            rule__Template__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__2_in_rule__Template__Group__1904);
            rule__Template__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__1"


    // $ANTLR start "rule__Template__Group__1__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:457:1: rule__Template__Group__1__Impl : ( ( rule__Template__NameAssignment_1 ) ) ;
    public final void rule__Template__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:461:1: ( ( ( rule__Template__NameAssignment_1 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:462:1: ( ( rule__Template__NameAssignment_1 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:462:1: ( ( rule__Template__NameAssignment_1 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:463:1: ( rule__Template__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateAccess().getNameAssignment_1()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:464:1: ( rule__Template__NameAssignment_1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:464:2: rule__Template__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Template__NameAssignment_1_in_rule__Template__Group__1__Impl931);
            rule__Template__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__1__Impl"


    // $ANTLR start "rule__Template__Group__2"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:474:1: rule__Template__Group__2 : rule__Template__Group__2__Impl rule__Template__Group__3 ;
    public final void rule__Template__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:478:1: ( rule__Template__Group__2__Impl rule__Template__Group__3 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:479:2: rule__Template__Group__2__Impl rule__Template__Group__3
            {
            pushFollow(FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__2961);
            rule__Template__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__3_in_rule__Template__Group__2964);
            rule__Template__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__2"


    // $ANTLR start "rule__Template__Group__2__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:486:1: rule__Template__Group__2__Impl : ( '{' ) ;
    public final void rule__Template__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:490:1: ( ( '{' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:491:1: ( '{' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:491:1: ( '{' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:492:1: '{'
            {
             before(grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Template__Group__2__Impl992); 
             after(grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__2__Impl"


    // $ANTLR start "rule__Template__Group__3"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:505:1: rule__Template__Group__3 : rule__Template__Group__3__Impl rule__Template__Group__4 ;
    public final void rule__Template__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:509:1: ( rule__Template__Group__3__Impl rule__Template__Group__4 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:510:2: rule__Template__Group__3__Impl rule__Template__Group__4
            {
            pushFollow(FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__31023);
            rule__Template__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Template__Group__4_in_rule__Template__Group__31026);
            rule__Template__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__3"


    // $ANTLR start "rule__Template__Group__3__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:517:1: rule__Template__Group__3__Impl : ( ( rule__Template__FeaturesAssignment_3 )* ) ;
    public final void rule__Template__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:521:1: ( ( ( rule__Template__FeaturesAssignment_3 )* ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:522:1: ( ( rule__Template__FeaturesAssignment_3 )* )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:522:1: ( ( rule__Template__FeaturesAssignment_3 )* )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:523:1: ( rule__Template__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getTemplateAccess().getFeaturesAssignment_3()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:524:1: ( rule__Template__FeaturesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:524:2: rule__Template__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Template__FeaturesAssignment_3_in_rule__Template__Group__3__Impl1053);
            	    rule__Template__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTemplateAccess().getFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__3__Impl"


    // $ANTLR start "rule__Template__Group__4"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:534:1: rule__Template__Group__4 : rule__Template__Group__4__Impl ;
    public final void rule__Template__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:538:1: ( rule__Template__Group__4__Impl )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:539:2: rule__Template__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Template__Group__4__Impl_in_rule__Template__Group__41084);
            rule__Template__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__4"


    // $ANTLR start "rule__Template__Group__4__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:545:1: rule__Template__Group__4__Impl : ( '}' ) ;
    public final void rule__Template__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:549:1: ( ( '}' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:550:1: ( '}' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:550:1: ( '}' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:551:1: '}'
            {
             before(grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Template__Group__4__Impl1112); 
             after(grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group_0__0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:574:1: rule__Feature__Group_0__0 : rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 ;
    public final void rule__Feature__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:578:1: ( rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:579:2: rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1
            {
            pushFollow(FOLLOW_rule__Feature__Group_0__0__Impl_in_rule__Feature__Group_0__01153);
            rule__Feature__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_0__1_in_rule__Feature__Group_0__01156);
            rule__Feature__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__0"


    // $ANTLR start "rule__Feature__Group_0__0__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:586:1: rule__Feature__Group_0__0__Impl : ( ( rule__Feature__NameAssignment_0_0 ) ) ;
    public final void rule__Feature__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:590:1: ( ( ( rule__Feature__NameAssignment_0_0 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:591:1: ( ( rule__Feature__NameAssignment_0_0 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:591:1: ( ( rule__Feature__NameAssignment_0_0 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:592:1: ( rule__Feature__NameAssignment_0_0 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_0_0()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:593:1: ( rule__Feature__NameAssignment_0_0 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:593:2: rule__Feature__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_0_0_in_rule__Feature__Group_0__0__Impl1183);
            rule__Feature__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__0__Impl"


    // $ANTLR start "rule__Feature__Group_0__1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:603:1: rule__Feature__Group_0__1 : rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2 ;
    public final void rule__Feature__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:607:1: ( rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:608:2: rule__Feature__Group_0__1__Impl rule__Feature__Group_0__2
            {
            pushFollow(FOLLOW_rule__Feature__Group_0__1__Impl_in_rule__Feature__Group_0__11213);
            rule__Feature__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_0__2_in_rule__Feature__Group_0__11216);
            rule__Feature__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__1"


    // $ANTLR start "rule__Feature__Group_0__1__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:615:1: rule__Feature__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Feature__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:619:1: ( ( ':' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:620:1: ( ':' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:620:1: ( ':' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:621:1: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__Feature__Group_0__1__Impl1244); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__1__Impl"


    // $ANTLR start "rule__Feature__Group_0__2"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:634:1: rule__Feature__Group_0__2 : rule__Feature__Group_0__2__Impl rule__Feature__Group_0__3 ;
    public final void rule__Feature__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:638:1: ( rule__Feature__Group_0__2__Impl rule__Feature__Group_0__3 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:639:2: rule__Feature__Group_0__2__Impl rule__Feature__Group_0__3
            {
            pushFollow(FOLLOW_rule__Feature__Group_0__2__Impl_in_rule__Feature__Group_0__21275);
            rule__Feature__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Feature__Group_0__3_in_rule__Feature__Group_0__21278);
            rule__Feature__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__2"


    // $ANTLR start "rule__Feature__Group_0__2__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:646:1: rule__Feature__Group_0__2__Impl : ( ( rule__Feature__ValueAssignment_0_2 ) ) ;
    public final void rule__Feature__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:650:1: ( ( ( rule__Feature__ValueAssignment_0_2 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:651:1: ( ( rule__Feature__ValueAssignment_0_2 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:651:1: ( ( rule__Feature__ValueAssignment_0_2 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:652:1: ( rule__Feature__ValueAssignment_0_2 )
            {
             before(grammarAccess.getFeatureAccess().getValueAssignment_0_2()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:653:1: ( rule__Feature__ValueAssignment_0_2 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:653:2: rule__Feature__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Feature__ValueAssignment_0_2_in_rule__Feature__Group_0__2__Impl1305);
            rule__Feature__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__2__Impl"


    // $ANTLR start "rule__Feature__Group_0__3"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:663:1: rule__Feature__Group_0__3 : rule__Feature__Group_0__3__Impl ;
    public final void rule__Feature__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:667:1: ( rule__Feature__Group_0__3__Impl )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:668:2: rule__Feature__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group_0__3__Impl_in_rule__Feature__Group_0__31335);
            rule__Feature__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__3"


    // $ANTLR start "rule__Feature__Group_0__3__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:674:1: rule__Feature__Group_0__3__Impl : ( ';' ) ;
    public final void rule__Feature__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:678:1: ( ( ';' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:679:1: ( ';' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:679:1: ( ';' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:680:1: ';'
            {
             before(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_3()); 
            match(input,19,FOLLOW_19_in_rule__Feature__Group_0__3__Impl1363); 
             after(grammarAccess.getFeatureAccess().getSemicolonKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__3__Impl"


    // $ANTLR start "rule__TableData__Group__0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:701:1: rule__TableData__Group__0 : rule__TableData__Group__0__Impl rule__TableData__Group__1 ;
    public final void rule__TableData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:705:1: ( rule__TableData__Group__0__Impl rule__TableData__Group__1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:706:2: rule__TableData__Group__0__Impl rule__TableData__Group__1
            {
            pushFollow(FOLLOW_rule__TableData__Group__0__Impl_in_rule__TableData__Group__01402);
            rule__TableData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableData__Group__1_in_rule__TableData__Group__01405);
            rule__TableData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__0"


    // $ANTLR start "rule__TableData__Group__0__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:713:1: rule__TableData__Group__0__Impl : ( () ) ;
    public final void rule__TableData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:717:1: ( ( () ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:718:1: ( () )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:718:1: ( () )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:719:1: ()
            {
             before(grammarAccess.getTableDataAccess().getTableDataAction_0()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:720:1: ()
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:722:1: 
            {
            }

             after(grammarAccess.getTableDataAccess().getTableDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__0__Impl"


    // $ANTLR start "rule__TableData__Group__1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:732:1: rule__TableData__Group__1 : rule__TableData__Group__1__Impl rule__TableData__Group__2 ;
    public final void rule__TableData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:736:1: ( rule__TableData__Group__1__Impl rule__TableData__Group__2 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:737:2: rule__TableData__Group__1__Impl rule__TableData__Group__2
            {
            pushFollow(FOLLOW_rule__TableData__Group__1__Impl_in_rule__TableData__Group__11463);
            rule__TableData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableData__Group__2_in_rule__TableData__Group__11466);
            rule__TableData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__1"


    // $ANTLR start "rule__TableData__Group__1__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:744:1: rule__TableData__Group__1__Impl : ( 'tableData' ) ;
    public final void rule__TableData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:748:1: ( ( 'tableData' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:749:1: ( 'tableData' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:749:1: ( 'tableData' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:750:1: 'tableData'
            {
             before(grammarAccess.getTableDataAccess().getTableDataKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__TableData__Group__1__Impl1494); 
             after(grammarAccess.getTableDataAccess().getTableDataKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__1__Impl"


    // $ANTLR start "rule__TableData__Group__2"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:763:1: rule__TableData__Group__2 : rule__TableData__Group__2__Impl rule__TableData__Group__3 ;
    public final void rule__TableData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:767:1: ( rule__TableData__Group__2__Impl rule__TableData__Group__3 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:768:2: rule__TableData__Group__2__Impl rule__TableData__Group__3
            {
            pushFollow(FOLLOW_rule__TableData__Group__2__Impl_in_rule__TableData__Group__21525);
            rule__TableData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableData__Group__3_in_rule__TableData__Group__21528);
            rule__TableData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__2"


    // $ANTLR start "rule__TableData__Group__2__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:775:1: rule__TableData__Group__2__Impl : ( 'for' ) ;
    public final void rule__TableData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:779:1: ( ( 'for' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:780:1: ( 'for' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:780:1: ( 'for' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:781:1: 'for'
            {
             before(grammarAccess.getTableDataAccess().getForKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__TableData__Group__2__Impl1556); 
             after(grammarAccess.getTableDataAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__2__Impl"


    // $ANTLR start "rule__TableData__Group__3"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:794:1: rule__TableData__Group__3 : rule__TableData__Group__3__Impl rule__TableData__Group__4 ;
    public final void rule__TableData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:798:1: ( rule__TableData__Group__3__Impl rule__TableData__Group__4 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:799:2: rule__TableData__Group__3__Impl rule__TableData__Group__4
            {
            pushFollow(FOLLOW_rule__TableData__Group__3__Impl_in_rule__TableData__Group__31587);
            rule__TableData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableData__Group__4_in_rule__TableData__Group__31590);
            rule__TableData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__3"


    // $ANTLR start "rule__TableData__Group__3__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:806:1: rule__TableData__Group__3__Impl : ( ( rule__TableData__NameAssignment_3 ) ) ;
    public final void rule__TableData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:810:1: ( ( ( rule__TableData__NameAssignment_3 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:811:1: ( ( rule__TableData__NameAssignment_3 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:811:1: ( ( rule__TableData__NameAssignment_3 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:812:1: ( rule__TableData__NameAssignment_3 )
            {
             before(grammarAccess.getTableDataAccess().getNameAssignment_3()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:813:1: ( rule__TableData__NameAssignment_3 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:813:2: rule__TableData__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__TableData__NameAssignment_3_in_rule__TableData__Group__3__Impl1617);
            rule__TableData__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableDataAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__3__Impl"


    // $ANTLR start "rule__TableData__Group__4"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:823:1: rule__TableData__Group__4 : rule__TableData__Group__4__Impl rule__TableData__Group__5 ;
    public final void rule__TableData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:827:1: ( rule__TableData__Group__4__Impl rule__TableData__Group__5 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:828:2: rule__TableData__Group__4__Impl rule__TableData__Group__5
            {
            pushFollow(FOLLOW_rule__TableData__Group__4__Impl_in_rule__TableData__Group__41647);
            rule__TableData__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableData__Group__5_in_rule__TableData__Group__41650);
            rule__TableData__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__4"


    // $ANTLR start "rule__TableData__Group__4__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:835:1: rule__TableData__Group__4__Impl : ( '{' ) ;
    public final void rule__TableData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:839:1: ( ( '{' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:840:1: ( '{' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:840:1: ( '{' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:841:1: '{'
            {
             before(grammarAccess.getTableDataAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__TableData__Group__4__Impl1678); 
             after(grammarAccess.getTableDataAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__4__Impl"


    // $ANTLR start "rule__TableData__Group__5"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:854:1: rule__TableData__Group__5 : rule__TableData__Group__5__Impl rule__TableData__Group__6 ;
    public final void rule__TableData__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:858:1: ( rule__TableData__Group__5__Impl rule__TableData__Group__6 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:859:2: rule__TableData__Group__5__Impl rule__TableData__Group__6
            {
            pushFollow(FOLLOW_rule__TableData__Group__5__Impl_in_rule__TableData__Group__51709);
            rule__TableData__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableData__Group__6_in_rule__TableData__Group__51712);
            rule__TableData__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__5"


    // $ANTLR start "rule__TableData__Group__5__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:866:1: rule__TableData__Group__5__Impl : ( ( rule__TableData__Alternatives_5 )* ) ;
    public final void rule__TableData__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:870:1: ( ( ( rule__TableData__Alternatives_5 )* ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:871:1: ( ( rule__TableData__Alternatives_5 )* )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:871:1: ( ( rule__TableData__Alternatives_5 )* )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:872:1: ( rule__TableData__Alternatives_5 )*
            {
             before(grammarAccess.getTableDataAccess().getAlternatives_5()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:873:1: ( rule__TableData__Alternatives_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:873:2: rule__TableData__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__TableData__Alternatives_5_in_rule__TableData__Group__5__Impl1739);
            	    rule__TableData__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTableDataAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__5__Impl"


    // $ANTLR start "rule__TableData__Group__6"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:883:1: rule__TableData__Group__6 : rule__TableData__Group__6__Impl ;
    public final void rule__TableData__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:887:1: ( rule__TableData__Group__6__Impl )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:888:2: rule__TableData__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TableData__Group__6__Impl_in_rule__TableData__Group__61770);
            rule__TableData__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__6"


    // $ANTLR start "rule__TableData__Group__6__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:894:1: rule__TableData__Group__6__Impl : ( '}' ) ;
    public final void rule__TableData__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:898:1: ( ( '}' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:899:1: ( '}' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:899:1: ( '}' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:900:1: '}'
            {
             before(grammarAccess.getTableDataAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__TableData__Group__6__Impl1798); 
             after(grammarAccess.getTableDataAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__Group__6__Impl"


    // $ANTLR start "rule__TableSection__Group__0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:927:1: rule__TableSection__Group__0 : rule__TableSection__Group__0__Impl rule__TableSection__Group__1 ;
    public final void rule__TableSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:931:1: ( rule__TableSection__Group__0__Impl rule__TableSection__Group__1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:932:2: rule__TableSection__Group__0__Impl rule__TableSection__Group__1
            {
            pushFollow(FOLLOW_rule__TableSection__Group__0__Impl_in_rule__TableSection__Group__01843);
            rule__TableSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableSection__Group__1_in_rule__TableSection__Group__01846);
            rule__TableSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__Group__0"


    // $ANTLR start "rule__TableSection__Group__0__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:939:1: rule__TableSection__Group__0__Impl : ( 'section' ) ;
    public final void rule__TableSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:943:1: ( ( 'section' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:944:1: ( 'section' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:944:1: ( 'section' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:945:1: 'section'
            {
             before(grammarAccess.getTableSectionAccess().getSectionKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__TableSection__Group__0__Impl1874); 
             after(grammarAccess.getTableSectionAccess().getSectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__Group__0__Impl"


    // $ANTLR start "rule__TableSection__Group__1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:958:1: rule__TableSection__Group__1 : rule__TableSection__Group__1__Impl rule__TableSection__Group__2 ;
    public final void rule__TableSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:962:1: ( rule__TableSection__Group__1__Impl rule__TableSection__Group__2 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:963:2: rule__TableSection__Group__1__Impl rule__TableSection__Group__2
            {
            pushFollow(FOLLOW_rule__TableSection__Group__1__Impl_in_rule__TableSection__Group__11905);
            rule__TableSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableSection__Group__2_in_rule__TableSection__Group__11908);
            rule__TableSection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__Group__1"


    // $ANTLR start "rule__TableSection__Group__1__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:970:1: rule__TableSection__Group__1__Impl : ( ( rule__TableSection__NameAssignment_1 ) ) ;
    public final void rule__TableSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:974:1: ( ( ( rule__TableSection__NameAssignment_1 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:975:1: ( ( rule__TableSection__NameAssignment_1 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:975:1: ( ( rule__TableSection__NameAssignment_1 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:976:1: ( rule__TableSection__NameAssignment_1 )
            {
             before(grammarAccess.getTableSectionAccess().getNameAssignment_1()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:977:1: ( rule__TableSection__NameAssignment_1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:977:2: rule__TableSection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TableSection__NameAssignment_1_in_rule__TableSection__Group__1__Impl1935);
            rule__TableSection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableSectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__Group__1__Impl"


    // $ANTLR start "rule__TableSection__Group__2"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:987:1: rule__TableSection__Group__2 : rule__TableSection__Group__2__Impl rule__TableSection__Group__3 ;
    public final void rule__TableSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:991:1: ( rule__TableSection__Group__2__Impl rule__TableSection__Group__3 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:992:2: rule__TableSection__Group__2__Impl rule__TableSection__Group__3
            {
            pushFollow(FOLLOW_rule__TableSection__Group__2__Impl_in_rule__TableSection__Group__21965);
            rule__TableSection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableSection__Group__3_in_rule__TableSection__Group__21968);
            rule__TableSection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__Group__2"


    // $ANTLR start "rule__TableSection__Group__2__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:999:1: rule__TableSection__Group__2__Impl : ( '{' ) ;
    public final void rule__TableSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1003:1: ( ( '{' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1004:1: ( '{' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1004:1: ( '{' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1005:1: '{'
            {
             before(grammarAccess.getTableSectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__TableSection__Group__2__Impl1996); 
             after(grammarAccess.getTableSectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__Group__2__Impl"


    // $ANTLR start "rule__TableSection__Group__3"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1018:1: rule__TableSection__Group__3 : rule__TableSection__Group__3__Impl rule__TableSection__Group__4 ;
    public final void rule__TableSection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1022:1: ( rule__TableSection__Group__3__Impl rule__TableSection__Group__4 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1023:2: rule__TableSection__Group__3__Impl rule__TableSection__Group__4
            {
            pushFollow(FOLLOW_rule__TableSection__Group__3__Impl_in_rule__TableSection__Group__32027);
            rule__TableSection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableSection__Group__4_in_rule__TableSection__Group__32030);
            rule__TableSection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__Group__3"


    // $ANTLR start "rule__TableSection__Group__3__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1030:1: rule__TableSection__Group__3__Impl : ( ( rule__TableSection__AttributesAssignment_3 )* ) ;
    public final void rule__TableSection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1034:1: ( ( ( rule__TableSection__AttributesAssignment_3 )* ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1035:1: ( ( rule__TableSection__AttributesAssignment_3 )* )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1035:1: ( ( rule__TableSection__AttributesAssignment_3 )* )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1036:1: ( rule__TableSection__AttributesAssignment_3 )*
            {
             before(grammarAccess.getTableSectionAccess().getAttributesAssignment_3()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1037:1: ( rule__TableSection__AttributesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1037:2: rule__TableSection__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__TableSection__AttributesAssignment_3_in_rule__TableSection__Group__3__Impl2057);
            	    rule__TableSection__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTableSectionAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__Group__3__Impl"


    // $ANTLR start "rule__TableSection__Group__4"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1047:1: rule__TableSection__Group__4 : rule__TableSection__Group__4__Impl ;
    public final void rule__TableSection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1051:1: ( rule__TableSection__Group__4__Impl )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1052:2: rule__TableSection__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TableSection__Group__4__Impl_in_rule__TableSection__Group__42088);
            rule__TableSection__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__Group__4"


    // $ANTLR start "rule__TableSection__Group__4__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1058:1: rule__TableSection__Group__4__Impl : ( '}' ) ;
    public final void rule__TableSection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1062:1: ( ( '}' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1063:1: ( '}' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1063:1: ( '}' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1064:1: '}'
            {
             before(grammarAccess.getTableSectionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__TableSection__Group__4__Impl2116); 
             after(grammarAccess.getTableSectionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__Group__4__Impl"


    // $ANTLR start "rule__TableDataAttribute__Group_0__0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1087:1: rule__TableDataAttribute__Group_0__0 : rule__TableDataAttribute__Group_0__0__Impl rule__TableDataAttribute__Group_0__1 ;
    public final void rule__TableDataAttribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1091:1: ( rule__TableDataAttribute__Group_0__0__Impl rule__TableDataAttribute__Group_0__1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1092:2: rule__TableDataAttribute__Group_0__0__Impl rule__TableDataAttribute__Group_0__1
            {
            pushFollow(FOLLOW_rule__TableDataAttribute__Group_0__0__Impl_in_rule__TableDataAttribute__Group_0__02157);
            rule__TableDataAttribute__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDataAttribute__Group_0__1_in_rule__TableDataAttribute__Group_0__02160);
            rule__TableDataAttribute__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__Group_0__0"


    // $ANTLR start "rule__TableDataAttribute__Group_0__0__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1099:1: rule__TableDataAttribute__Group_0__0__Impl : ( ( rule__TableDataAttribute__NameAssignment_0_0 ) ) ;
    public final void rule__TableDataAttribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1103:1: ( ( ( rule__TableDataAttribute__NameAssignment_0_0 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1104:1: ( ( rule__TableDataAttribute__NameAssignment_0_0 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1104:1: ( ( rule__TableDataAttribute__NameAssignment_0_0 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1105:1: ( rule__TableDataAttribute__NameAssignment_0_0 )
            {
             before(grammarAccess.getTableDataAttributeAccess().getNameAssignment_0_0()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1106:1: ( rule__TableDataAttribute__NameAssignment_0_0 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1106:2: rule__TableDataAttribute__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__TableDataAttribute__NameAssignment_0_0_in_rule__TableDataAttribute__Group_0__0__Impl2187);
            rule__TableDataAttribute__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTableDataAttributeAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__Group_0__0__Impl"


    // $ANTLR start "rule__TableDataAttribute__Group_0__1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1116:1: rule__TableDataAttribute__Group_0__1 : rule__TableDataAttribute__Group_0__1__Impl rule__TableDataAttribute__Group_0__2 ;
    public final void rule__TableDataAttribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1120:1: ( rule__TableDataAttribute__Group_0__1__Impl rule__TableDataAttribute__Group_0__2 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1121:2: rule__TableDataAttribute__Group_0__1__Impl rule__TableDataAttribute__Group_0__2
            {
            pushFollow(FOLLOW_rule__TableDataAttribute__Group_0__1__Impl_in_rule__TableDataAttribute__Group_0__12217);
            rule__TableDataAttribute__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDataAttribute__Group_0__2_in_rule__TableDataAttribute__Group_0__12220);
            rule__TableDataAttribute__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__Group_0__1"


    // $ANTLR start "rule__TableDataAttribute__Group_0__1__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1128:1: rule__TableDataAttribute__Group_0__1__Impl : ( ':' ) ;
    public final void rule__TableDataAttribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1132:1: ( ( ':' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1133:1: ( ':' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1133:1: ( ':' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1134:1: ':'
            {
             before(grammarAccess.getTableDataAttributeAccess().getColonKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__TableDataAttribute__Group_0__1__Impl2248); 
             after(grammarAccess.getTableDataAttributeAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__Group_0__1__Impl"


    // $ANTLR start "rule__TableDataAttribute__Group_0__2"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1147:1: rule__TableDataAttribute__Group_0__2 : rule__TableDataAttribute__Group_0__2__Impl rule__TableDataAttribute__Group_0__3 ;
    public final void rule__TableDataAttribute__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1151:1: ( rule__TableDataAttribute__Group_0__2__Impl rule__TableDataAttribute__Group_0__3 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1152:2: rule__TableDataAttribute__Group_0__2__Impl rule__TableDataAttribute__Group_0__3
            {
            pushFollow(FOLLOW_rule__TableDataAttribute__Group_0__2__Impl_in_rule__TableDataAttribute__Group_0__22279);
            rule__TableDataAttribute__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TableDataAttribute__Group_0__3_in_rule__TableDataAttribute__Group_0__22282);
            rule__TableDataAttribute__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__Group_0__2"


    // $ANTLR start "rule__TableDataAttribute__Group_0__2__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1159:1: rule__TableDataAttribute__Group_0__2__Impl : ( ( rule__TableDataAttribute__ValueAssignment_0_2 ) ) ;
    public final void rule__TableDataAttribute__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1163:1: ( ( ( rule__TableDataAttribute__ValueAssignment_0_2 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1164:1: ( ( rule__TableDataAttribute__ValueAssignment_0_2 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1164:1: ( ( rule__TableDataAttribute__ValueAssignment_0_2 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1165:1: ( rule__TableDataAttribute__ValueAssignment_0_2 )
            {
             before(grammarAccess.getTableDataAttributeAccess().getValueAssignment_0_2()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1166:1: ( rule__TableDataAttribute__ValueAssignment_0_2 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1166:2: rule__TableDataAttribute__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_rule__TableDataAttribute__ValueAssignment_0_2_in_rule__TableDataAttribute__Group_0__2__Impl2309);
            rule__TableDataAttribute__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getTableDataAttributeAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__Group_0__2__Impl"


    // $ANTLR start "rule__TableDataAttribute__Group_0__3"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1176:1: rule__TableDataAttribute__Group_0__3 : rule__TableDataAttribute__Group_0__3__Impl ;
    public final void rule__TableDataAttribute__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1180:1: ( rule__TableDataAttribute__Group_0__3__Impl )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1181:2: rule__TableDataAttribute__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__TableDataAttribute__Group_0__3__Impl_in_rule__TableDataAttribute__Group_0__32339);
            rule__TableDataAttribute__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__Group_0__3"


    // $ANTLR start "rule__TableDataAttribute__Group_0__3__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1187:1: rule__TableDataAttribute__Group_0__3__Impl : ( ';' ) ;
    public final void rule__TableDataAttribute__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1191:1: ( ( ';' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1192:1: ( ';' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1192:1: ( ';' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1193:1: ';'
            {
             before(grammarAccess.getTableDataAttributeAccess().getSemicolonKeyword_0_3()); 
            match(input,19,FOLLOW_19_in_rule__TableDataAttribute__Group_0__3__Impl2367); 
             after(grammarAccess.getTableDataAttributeAccess().getSemicolonKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__Group_0__3__Impl"


    // $ANTLR start "rule__ListAttribute__Group__0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1214:1: rule__ListAttribute__Group__0 : rule__ListAttribute__Group__0__Impl rule__ListAttribute__Group__1 ;
    public final void rule__ListAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1218:1: ( rule__ListAttribute__Group__0__Impl rule__ListAttribute__Group__1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1219:2: rule__ListAttribute__Group__0__Impl rule__ListAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group__0__Impl_in_rule__ListAttribute__Group__02406);
            rule__ListAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListAttribute__Group__1_in_rule__ListAttribute__Group__02409);
            rule__ListAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__0"


    // $ANTLR start "rule__ListAttribute__Group__0__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1226:1: rule__ListAttribute__Group__0__Impl : ( ( rule__ListAttribute__NameAssignment_0 ) ) ;
    public final void rule__ListAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1230:1: ( ( ( rule__ListAttribute__NameAssignment_0 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1231:1: ( ( rule__ListAttribute__NameAssignment_0 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1231:1: ( ( rule__ListAttribute__NameAssignment_0 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1232:1: ( rule__ListAttribute__NameAssignment_0 )
            {
             before(grammarAccess.getListAttributeAccess().getNameAssignment_0()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1233:1: ( rule__ListAttribute__NameAssignment_0 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1233:2: rule__ListAttribute__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__ListAttribute__NameAssignment_0_in_rule__ListAttribute__Group__0__Impl2436);
            rule__ListAttribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListAttributeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__0__Impl"


    // $ANTLR start "rule__ListAttribute__Group__1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1243:1: rule__ListAttribute__Group__1 : rule__ListAttribute__Group__1__Impl rule__ListAttribute__Group__2 ;
    public final void rule__ListAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1247:1: ( rule__ListAttribute__Group__1__Impl rule__ListAttribute__Group__2 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1248:2: rule__ListAttribute__Group__1__Impl rule__ListAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group__1__Impl_in_rule__ListAttribute__Group__12466);
            rule__ListAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListAttribute__Group__2_in_rule__ListAttribute__Group__12469);
            rule__ListAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__1"


    // $ANTLR start "rule__ListAttribute__Group__1__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1255:1: rule__ListAttribute__Group__1__Impl : ( ':' ) ;
    public final void rule__ListAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1259:1: ( ( ':' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1260:1: ( ':' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1260:1: ( ':' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1261:1: ':'
            {
             before(grammarAccess.getListAttributeAccess().getColonKeyword_1()); 
            match(input,18,FOLLOW_18_in_rule__ListAttribute__Group__1__Impl2497); 
             after(grammarAccess.getListAttributeAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__1__Impl"


    // $ANTLR start "rule__ListAttribute__Group__2"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1274:1: rule__ListAttribute__Group__2 : rule__ListAttribute__Group__2__Impl rule__ListAttribute__Group__3 ;
    public final void rule__ListAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1278:1: ( rule__ListAttribute__Group__2__Impl rule__ListAttribute__Group__3 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1279:2: rule__ListAttribute__Group__2__Impl rule__ListAttribute__Group__3
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group__2__Impl_in_rule__ListAttribute__Group__22528);
            rule__ListAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListAttribute__Group__3_in_rule__ListAttribute__Group__22531);
            rule__ListAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__2"


    // $ANTLR start "rule__ListAttribute__Group__2__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1286:1: rule__ListAttribute__Group__2__Impl : ( '{' ) ;
    public final void rule__ListAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1290:1: ( ( '{' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1291:1: ( '{' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1291:1: ( '{' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1292:1: '{'
            {
             before(grammarAccess.getListAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__ListAttribute__Group__2__Impl2559); 
             after(grammarAccess.getListAttributeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__2__Impl"


    // $ANTLR start "rule__ListAttribute__Group__3"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1305:1: rule__ListAttribute__Group__3 : rule__ListAttribute__Group__3__Impl rule__ListAttribute__Group__4 ;
    public final void rule__ListAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1309:1: ( rule__ListAttribute__Group__3__Impl rule__ListAttribute__Group__4 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1310:2: rule__ListAttribute__Group__3__Impl rule__ListAttribute__Group__4
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group__3__Impl_in_rule__ListAttribute__Group__32590);
            rule__ListAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListAttribute__Group__4_in_rule__ListAttribute__Group__32593);
            rule__ListAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__3"


    // $ANTLR start "rule__ListAttribute__Group__3__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1317:1: rule__ListAttribute__Group__3__Impl : ( ( rule__ListAttribute__Group_3__0 )? ) ;
    public final void rule__ListAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1321:1: ( ( ( rule__ListAttribute__Group_3__0 )? ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1322:1: ( ( rule__ListAttribute__Group_3__0 )? )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1322:1: ( ( rule__ListAttribute__Group_3__0 )? )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1323:1: ( rule__ListAttribute__Group_3__0 )?
            {
             before(grammarAccess.getListAttributeAccess().getGroup_3()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1324:1: ( rule__ListAttribute__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1324:2: rule__ListAttribute__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ListAttribute__Group_3__0_in_rule__ListAttribute__Group__3__Impl2620);
                    rule__ListAttribute__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListAttributeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__3__Impl"


    // $ANTLR start "rule__ListAttribute__Group__4"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1334:1: rule__ListAttribute__Group__4 : rule__ListAttribute__Group__4__Impl rule__ListAttribute__Group__5 ;
    public final void rule__ListAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1338:1: ( rule__ListAttribute__Group__4__Impl rule__ListAttribute__Group__5 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1339:2: rule__ListAttribute__Group__4__Impl rule__ListAttribute__Group__5
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group__4__Impl_in_rule__ListAttribute__Group__42651);
            rule__ListAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListAttribute__Group__5_in_rule__ListAttribute__Group__42654);
            rule__ListAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__4"


    // $ANTLR start "rule__ListAttribute__Group__4__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1346:1: rule__ListAttribute__Group__4__Impl : ( '}' ) ;
    public final void rule__ListAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1350:1: ( ( '}' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1351:1: ( '}' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1351:1: ( '}' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1352:1: '}'
            {
             before(grammarAccess.getListAttributeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__ListAttribute__Group__4__Impl2682); 
             after(grammarAccess.getListAttributeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__4__Impl"


    // $ANTLR start "rule__ListAttribute__Group__5"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1365:1: rule__ListAttribute__Group__5 : rule__ListAttribute__Group__5__Impl ;
    public final void rule__ListAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1369:1: ( rule__ListAttribute__Group__5__Impl )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1370:2: rule__ListAttribute__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group__5__Impl_in_rule__ListAttribute__Group__52713);
            rule__ListAttribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__5"


    // $ANTLR start "rule__ListAttribute__Group__5__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1376:1: rule__ListAttribute__Group__5__Impl : ( ';' ) ;
    public final void rule__ListAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1380:1: ( ( ';' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1381:1: ( ';' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1381:1: ( ';' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1382:1: ';'
            {
             before(grammarAccess.getListAttributeAccess().getSemicolonKeyword_5()); 
            match(input,19,FOLLOW_19_in_rule__ListAttribute__Group__5__Impl2741); 
             after(grammarAccess.getListAttributeAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group__5__Impl"


    // $ANTLR start "rule__ListAttribute__Group_3__0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1407:1: rule__ListAttribute__Group_3__0 : rule__ListAttribute__Group_3__0__Impl rule__ListAttribute__Group_3__1 ;
    public final void rule__ListAttribute__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1411:1: ( rule__ListAttribute__Group_3__0__Impl rule__ListAttribute__Group_3__1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1412:2: rule__ListAttribute__Group_3__0__Impl rule__ListAttribute__Group_3__1
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group_3__0__Impl_in_rule__ListAttribute__Group_3__02784);
            rule__ListAttribute__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListAttribute__Group_3__1_in_rule__ListAttribute__Group_3__02787);
            rule__ListAttribute__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group_3__0"


    // $ANTLR start "rule__ListAttribute__Group_3__0__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1419:1: rule__ListAttribute__Group_3__0__Impl : ( ( rule__ListAttribute__ValuesAssignment_3_0 ) ) ;
    public final void rule__ListAttribute__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1423:1: ( ( ( rule__ListAttribute__ValuesAssignment_3_0 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1424:1: ( ( rule__ListAttribute__ValuesAssignment_3_0 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1424:1: ( ( rule__ListAttribute__ValuesAssignment_3_0 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1425:1: ( rule__ListAttribute__ValuesAssignment_3_0 )
            {
             before(grammarAccess.getListAttributeAccess().getValuesAssignment_3_0()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1426:1: ( rule__ListAttribute__ValuesAssignment_3_0 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1426:2: rule__ListAttribute__ValuesAssignment_3_0
            {
            pushFollow(FOLLOW_rule__ListAttribute__ValuesAssignment_3_0_in_rule__ListAttribute__Group_3__0__Impl2814);
            rule__ListAttribute__ValuesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getListAttributeAccess().getValuesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group_3__0__Impl"


    // $ANTLR start "rule__ListAttribute__Group_3__1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1436:1: rule__ListAttribute__Group_3__1 : rule__ListAttribute__Group_3__1__Impl ;
    public final void rule__ListAttribute__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1440:1: ( rule__ListAttribute__Group_3__1__Impl )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1441:2: rule__ListAttribute__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group_3__1__Impl_in_rule__ListAttribute__Group_3__12844);
            rule__ListAttribute__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group_3__1"


    // $ANTLR start "rule__ListAttribute__Group_3__1__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1447:1: rule__ListAttribute__Group_3__1__Impl : ( ( rule__ListAttribute__Group_3_1__0 )* ) ;
    public final void rule__ListAttribute__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1451:1: ( ( ( rule__ListAttribute__Group_3_1__0 )* ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1452:1: ( ( rule__ListAttribute__Group_3_1__0 )* )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1452:1: ( ( rule__ListAttribute__Group_3_1__0 )* )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1453:1: ( rule__ListAttribute__Group_3_1__0 )*
            {
             before(grammarAccess.getListAttributeAccess().getGroup_3_1()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1454:1: ( rule__ListAttribute__Group_3_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1454:2: rule__ListAttribute__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ListAttribute__Group_3_1__0_in_rule__ListAttribute__Group_3__1__Impl2871);
            	    rule__ListAttribute__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getListAttributeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group_3__1__Impl"


    // $ANTLR start "rule__ListAttribute__Group_3_1__0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1468:1: rule__ListAttribute__Group_3_1__0 : rule__ListAttribute__Group_3_1__0__Impl rule__ListAttribute__Group_3_1__1 ;
    public final void rule__ListAttribute__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1472:1: ( rule__ListAttribute__Group_3_1__0__Impl rule__ListAttribute__Group_3_1__1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1473:2: rule__ListAttribute__Group_3_1__0__Impl rule__ListAttribute__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group_3_1__0__Impl_in_rule__ListAttribute__Group_3_1__02906);
            rule__ListAttribute__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListAttribute__Group_3_1__1_in_rule__ListAttribute__Group_3_1__02909);
            rule__ListAttribute__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group_3_1__0"


    // $ANTLR start "rule__ListAttribute__Group_3_1__0__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1480:1: rule__ListAttribute__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__ListAttribute__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1484:1: ( ( ',' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1485:1: ( ',' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1485:1: ( ',' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1486:1: ','
            {
             before(grammarAccess.getListAttributeAccess().getCommaKeyword_3_1_0()); 
            match(input,23,FOLLOW_23_in_rule__ListAttribute__Group_3_1__0__Impl2937); 
             after(grammarAccess.getListAttributeAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group_3_1__0__Impl"


    // $ANTLR start "rule__ListAttribute__Group_3_1__1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1499:1: rule__ListAttribute__Group_3_1__1 : rule__ListAttribute__Group_3_1__1__Impl ;
    public final void rule__ListAttribute__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1503:1: ( rule__ListAttribute__Group_3_1__1__Impl )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1504:2: rule__ListAttribute__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ListAttribute__Group_3_1__1__Impl_in_rule__ListAttribute__Group_3_1__12968);
            rule__ListAttribute__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group_3_1__1"


    // $ANTLR start "rule__ListAttribute__Group_3_1__1__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1510:1: rule__ListAttribute__Group_3_1__1__Impl : ( ( rule__ListAttribute__ValuesAssignment_3_1_1 ) ) ;
    public final void rule__ListAttribute__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1514:1: ( ( ( rule__ListAttribute__ValuesAssignment_3_1_1 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1515:1: ( ( rule__ListAttribute__ValuesAssignment_3_1_1 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1515:1: ( ( rule__ListAttribute__ValuesAssignment_3_1_1 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1516:1: ( rule__ListAttribute__ValuesAssignment_3_1_1 )
            {
             before(grammarAccess.getListAttributeAccess().getValuesAssignment_3_1_1()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1517:1: ( rule__ListAttribute__ValuesAssignment_3_1_1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1517:2: rule__ListAttribute__ValuesAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__ListAttribute__ValuesAssignment_3_1_1_in_rule__ListAttribute__Group_3_1__1__Impl2995);
            rule__ListAttribute__ValuesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getListAttributeAccess().getValuesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__Group_3_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1534:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1538:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1539:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03032);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03035);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1546:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1550:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1551:1: ( RULE_ID )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1551:1: ( RULE_ID )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1552:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3062); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1563:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1567:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1568:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13091);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1574:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1578:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1579:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1579:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1580:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1581:1: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1581:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3118);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1595:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1599:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1600:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03153);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03156);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1607:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1611:1: ( ( '.' ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1612:1: ( '.' )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1612:1: ( '.' )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1613:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_24_in_rule__QualifiedName__Group_1__0__Impl3184); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1626:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1630:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1631:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13215);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1637:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1641:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1642:1: ( RULE_ID )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1642:1: ( RULE_ID )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1643:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3242); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Template__NameAssignment_1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1659:1: rule__Template__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Template__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1663:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1664:1: ( RULE_ID )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1664:1: ( RULE_ID )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1665:1: RULE_ID
            {
             before(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Template__NameAssignment_13280); 
             after(grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__NameAssignment_1"


    // $ANTLR start "rule__Template__FeaturesAssignment_3"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1674:1: rule__Template__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Template__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1678:1: ( ( ruleFeature ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1679:1: ( ruleFeature )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1679:1: ( ruleFeature )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1680:1: ruleFeature
            {
             before(grammarAccess.getTemplateAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Template__FeaturesAssignment_33311);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getTemplateAccess().getFeaturesFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Template__FeaturesAssignment_3"


    // $ANTLR start "rule__Feature__NameAssignment_0_0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1689:1: rule__Feature__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1693:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1694:1: ( RULE_ID )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1694:1: ( RULE_ID )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1695:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_0_03342); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_0_0"


    // $ANTLR start "rule__Feature__ValueAssignment_0_2"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1704:1: rule__Feature__ValueAssignment_0_2 : ( ruleAttributeValue ) ;
    public final void rule__Feature__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1708:1: ( ( ruleAttributeValue ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1709:1: ( ruleAttributeValue )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1709:1: ( ruleAttributeValue )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1710:1: ruleAttributeValue
            {
             before(grammarAccess.getFeatureAccess().getValueAttributeValueParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__Feature__ValueAssignment_0_23373);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getValueAttributeValueParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__ValueAssignment_0_2"


    // $ANTLR start "rule__TableData__NameAssignment_3"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1719:1: rule__TableData__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__TableData__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1723:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1724:1: ( RULE_ID )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1724:1: ( RULE_ID )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1725:1: RULE_ID
            {
             before(grammarAccess.getTableDataAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TableData__NameAssignment_33404); 
             after(grammarAccess.getTableDataAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__NameAssignment_3"


    // $ANTLR start "rule__TableData__TableDataAttributesAssignment_5_0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1734:1: rule__TableData__TableDataAttributesAssignment_5_0 : ( ruleTableDataAttribute ) ;
    public final void rule__TableData__TableDataAttributesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1738:1: ( ( ruleTableDataAttribute ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1739:1: ( ruleTableDataAttribute )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1739:1: ( ruleTableDataAttribute )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1740:1: ruleTableDataAttribute
            {
             before(grammarAccess.getTableDataAccess().getTableDataAttributesTableDataAttributeParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleTableDataAttribute_in_rule__TableData__TableDataAttributesAssignment_5_03435);
            ruleTableDataAttribute();

            state._fsp--;

             after(grammarAccess.getTableDataAccess().getTableDataAttributesTableDataAttributeParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__TableDataAttributesAssignment_5_0"


    // $ANTLR start "rule__TableData__SectionsAssignment_5_1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1749:1: rule__TableData__SectionsAssignment_5_1 : ( ruleTableSection ) ;
    public final void rule__TableData__SectionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1753:1: ( ( ruleTableSection ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1754:1: ( ruleTableSection )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1754:1: ( ruleTableSection )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1755:1: ruleTableSection
            {
             before(grammarAccess.getTableDataAccess().getSectionsTableSectionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTableSection_in_rule__TableData__SectionsAssignment_5_13466);
            ruleTableSection();

            state._fsp--;

             after(grammarAccess.getTableDataAccess().getSectionsTableSectionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableData__SectionsAssignment_5_1"


    // $ANTLR start "rule__TableSection__NameAssignment_1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1764:1: rule__TableSection__NameAssignment_1 : ( ( rule__TableSection__NameAlternatives_1_0 ) ) ;
    public final void rule__TableSection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1768:1: ( ( ( rule__TableSection__NameAlternatives_1_0 ) ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1769:1: ( ( rule__TableSection__NameAlternatives_1_0 ) )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1769:1: ( ( rule__TableSection__NameAlternatives_1_0 ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1770:1: ( rule__TableSection__NameAlternatives_1_0 )
            {
             before(grammarAccess.getTableSectionAccess().getNameAlternatives_1_0()); 
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1771:1: ( rule__TableSection__NameAlternatives_1_0 )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1771:2: rule__TableSection__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__TableSection__NameAlternatives_1_0_in_rule__TableSection__NameAssignment_13497);
            rule__TableSection__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTableSectionAccess().getNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__NameAssignment_1"


    // $ANTLR start "rule__TableSection__AttributesAssignment_3"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1780:1: rule__TableSection__AttributesAssignment_3 : ( ruleTableDataAttribute ) ;
    public final void rule__TableSection__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1784:1: ( ( ruleTableDataAttribute ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1785:1: ( ruleTableDataAttribute )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1785:1: ( ruleTableDataAttribute )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1786:1: ruleTableDataAttribute
            {
             before(grammarAccess.getTableSectionAccess().getAttributesTableDataAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTableDataAttribute_in_rule__TableSection__AttributesAssignment_33530);
            ruleTableDataAttribute();

            state._fsp--;

             after(grammarAccess.getTableSectionAccess().getAttributesTableDataAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableSection__AttributesAssignment_3"


    // $ANTLR start "rule__TableDataAttribute__NameAssignment_0_0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1795:1: rule__TableDataAttribute__NameAssignment_0_0 : ( ruleQualifiedName ) ;
    public final void rule__TableDataAttribute__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1799:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1800:1: ( ruleQualifiedName )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1800:1: ( ruleQualifiedName )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1801:1: ruleQualifiedName
            {
             before(grammarAccess.getTableDataAttributeAccess().getNameQualifiedNameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TableDataAttribute__NameAssignment_0_03561);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTableDataAttributeAccess().getNameQualifiedNameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__NameAssignment_0_0"


    // $ANTLR start "rule__TableDataAttribute__ValueAssignment_0_2"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1810:1: rule__TableDataAttribute__ValueAssignment_0_2 : ( ruleAttributeValue ) ;
    public final void rule__TableDataAttribute__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1814:1: ( ( ruleAttributeValue ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1815:1: ( ruleAttributeValue )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1815:1: ( ruleAttributeValue )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1816:1: ruleAttributeValue
            {
             before(grammarAccess.getTableDataAttributeAccess().getValueAttributeValueParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__TableDataAttribute__ValueAssignment_0_23592);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getTableDataAttributeAccess().getValueAttributeValueParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableDataAttribute__ValueAssignment_0_2"


    // $ANTLR start "rule__ListAttribute__NameAssignment_0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1825:1: rule__ListAttribute__NameAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__ListAttribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1829:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1830:1: ( ruleQualifiedName )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1830:1: ( ruleQualifiedName )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1831:1: ruleQualifiedName
            {
             before(grammarAccess.getListAttributeAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ListAttribute__NameAssignment_03623);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getListAttributeAccess().getNameQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__NameAssignment_0"


    // $ANTLR start "rule__ListAttribute__ValuesAssignment_3_0"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1840:1: rule__ListAttribute__ValuesAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__ListAttribute__ValuesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1844:1: ( ( RULE_STRING ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1845:1: ( RULE_STRING )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1845:1: ( RULE_STRING )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1846:1: RULE_STRING
            {
             before(grammarAccess.getListAttributeAccess().getValuesSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListAttribute__ValuesAssignment_3_03654); 
             after(grammarAccess.getListAttributeAccess().getValuesSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__ValuesAssignment_3_0"


    // $ANTLR start "rule__ListAttribute__ValuesAssignment_3_1_1"
    // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1855:1: rule__ListAttribute__ValuesAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__ListAttribute__ValuesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1859:1: ( ( RULE_STRING ) )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1860:1: ( RULE_STRING )
            {
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1860:1: ( RULE_STRING )
            // ../org.xtext.passi.template.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalTemplateLanguage.g:1861:1: RULE_STRING
            {
             before(grammarAccess.getListAttributeAccess().getValuesSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ListAttribute__ValuesAssignment_3_1_13685); 
             after(grammarAccess.getListAttributeAccess().getValuesSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListAttribute__ValuesAssignment_3_1_1"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\7\uffff";
    static final String DFA4_eofS =
        "\7\uffff";
    static final String DFA4_minS =
        "\1\10\1\22\1\10\1\6\1\22\2\uffff";
    static final String DFA4_maxS =
        "\1\10\1\30\1\10\1\20\1\30\2\uffff";
    static final String DFA4_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\7\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1",
            "\1\3\5\uffff\1\2",
            "\1\4",
            "\2\6\5\uffff\2\6\1\uffff\1\5",
            "\1\3\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "352:1: rule__TableDataAttribute__Alternatives : ( ( ( rule__TableDataAttribute__Group_0__0 ) ) | ( ruleListAttribute ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0_in_ruleTemplate94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableData_in_entryRuleTableData181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableData188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__Group__0_in_ruleTableData214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableSection_in_entryRuleTableSection241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableSection248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableSection__Group__0_in_ruleTableSection274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDataAttribute_in_entryRuleTableDataAttribute301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDataAttribute308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__Alternatives_in_ruleTableDataAttribute334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListAttribute_in_entryRuleListAttribute361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListAttribute368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__0_in_ruleListAttribute394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__0_in_rule__Feature__Alternatives552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableData_in_rule__Feature__Alternatives570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__TableDataAttributesAssignment_5_0_in_rule__TableData__Alternatives_5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__SectionsAssignment_5_1_in_rule__TableData__Alternatives_5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SECTION_HEADER_in_rule__TableSection__NameAlternatives_1_0653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SECTION_VALUES_in_rule__TableSection__NameAlternatives_1_0670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__Group_0__0_in_rule__TableDataAttribute__Alternatives702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListAttribute_in_rule__TableDataAttribute__Alternatives720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__AttributeValue__Alternatives752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__AttributeValue__Alternatives769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AttributeValue__Alternatives787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AttributeValue__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__0__Impl_in_rule__Template__Group__0839 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Template__Group__1_in_rule__Template__Group__0842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Template__Group__0__Impl870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__1__Impl_in_rule__Template__Group__1901 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Template__Group__2_in_rule__Template__Group__1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__NameAssignment_1_in_rule__Template__Group__1__Impl931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__2__Impl_in_rule__Template__Group__2961 = new BitSet(new long[]{0x0000000000120100L});
    public static final BitSet FOLLOW_rule__Template__Group__3_in_rule__Template__Group__2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Template__Group__2__Impl992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__Group__3__Impl_in_rule__Template__Group__31023 = new BitSet(new long[]{0x0000000000120100L});
    public static final BitSet FOLLOW_rule__Template__Group__4_in_rule__Template__Group__31026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Template__FeaturesAssignment_3_in_rule__Template__Group__3__Impl1053 = new BitSet(new long[]{0x0000000000100102L});
    public static final BitSet FOLLOW_rule__Template__Group__4__Impl_in_rule__Template__Group__41084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Template__Group__4__Impl1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__0__Impl_in_rule__Feature__Group_0__01153 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__1_in_rule__Feature__Group_0__01156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_0_0_in_rule__Feature__Group_0__0__Impl1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__1__Impl_in_rule__Feature__Group_0__11213 = new BitSet(new long[]{0x00000000000060C0L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__2_in_rule__Feature__Group_0__11216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Feature__Group_0__1__Impl1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__2__Impl_in_rule__Feature__Group_0__21275 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__3_in_rule__Feature__Group_0__21278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__ValueAssignment_0_2_in_rule__Feature__Group_0__2__Impl1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group_0__3__Impl_in_rule__Feature__Group_0__31335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Feature__Group_0__3__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__Group__0__Impl_in_rule__TableData__Group__01402 = new BitSet(new long[]{0x0000000000100100L});
    public static final BitSet FOLLOW_rule__TableData__Group__1_in_rule__TableData__Group__01405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__Group__1__Impl_in_rule__TableData__Group__11463 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__TableData__Group__2_in_rule__TableData__Group__11466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TableData__Group__1__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__Group__2__Impl_in_rule__TableData__Group__21525 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TableData__Group__3_in_rule__TableData__Group__21528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TableData__Group__2__Impl1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__Group__3__Impl_in_rule__TableData__Group__31587 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TableData__Group__4_in_rule__TableData__Group__31590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__NameAssignment_3_in_rule__TableData__Group__3__Impl1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__Group__4__Impl_in_rule__TableData__Group__41647 = new BitSet(new long[]{0x0000000000420100L});
    public static final BitSet FOLLOW_rule__TableData__Group__5_in_rule__TableData__Group__41650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TableData__Group__4__Impl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__Group__5__Impl_in_rule__TableData__Group__51709 = new BitSet(new long[]{0x0000000000420100L});
    public static final BitSet FOLLOW_rule__TableData__Group__6_in_rule__TableData__Group__51712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableData__Alternatives_5_in_rule__TableData__Group__5__Impl1739 = new BitSet(new long[]{0x0000000000400102L});
    public static final BitSet FOLLOW_rule__TableData__Group__6__Impl_in_rule__TableData__Group__61770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TableData__Group__6__Impl1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableSection__Group__0__Impl_in_rule__TableSection__Group__01843 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TableSection__Group__1_in_rule__TableSection__Group__01846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TableSection__Group__0__Impl1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableSection__Group__1__Impl_in_rule__TableSection__Group__11905 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TableSection__Group__2_in_rule__TableSection__Group__11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableSection__NameAssignment_1_in_rule__TableSection__Group__1__Impl1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableSection__Group__2__Impl_in_rule__TableSection__Group__21965 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__TableSection__Group__3_in_rule__TableSection__Group__21968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TableSection__Group__2__Impl1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableSection__Group__3__Impl_in_rule__TableSection__Group__32027 = new BitSet(new long[]{0x0000000000020100L});
    public static final BitSet FOLLOW_rule__TableSection__Group__4_in_rule__TableSection__Group__32030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableSection__AttributesAssignment_3_in_rule__TableSection__Group__3__Impl2057 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__TableSection__Group__4__Impl_in_rule__TableSection__Group__42088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TableSection__Group__4__Impl2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__Group_0__0__Impl_in_rule__TableDataAttribute__Group_0__02157 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__Group_0__1_in_rule__TableDataAttribute__Group_0__02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__NameAssignment_0_0_in_rule__TableDataAttribute__Group_0__0__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__Group_0__1__Impl_in_rule__TableDataAttribute__Group_0__12217 = new BitSet(new long[]{0x00000000000060C0L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__Group_0__2_in_rule__TableDataAttribute__Group_0__12220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TableDataAttribute__Group_0__1__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__Group_0__2__Impl_in_rule__TableDataAttribute__Group_0__22279 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__Group_0__3_in_rule__TableDataAttribute__Group_0__22282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__ValueAssignment_0_2_in_rule__TableDataAttribute__Group_0__2__Impl2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableDataAttribute__Group_0__3__Impl_in_rule__TableDataAttribute__Group_0__32339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TableDataAttribute__Group_0__3__Impl2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__0__Impl_in_rule__ListAttribute__Group__02406 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__1_in_rule__ListAttribute__Group__02409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__NameAssignment_0_in_rule__ListAttribute__Group__0__Impl2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__1__Impl_in_rule__ListAttribute__Group__12466 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__2_in_rule__ListAttribute__Group__12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ListAttribute__Group__1__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__2__Impl_in_rule__ListAttribute__Group__22528 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__3_in_rule__ListAttribute__Group__22531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ListAttribute__Group__2__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__3__Impl_in_rule__ListAttribute__Group__32590 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__4_in_rule__ListAttribute__Group__32593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group_3__0_in_rule__ListAttribute__Group__3__Impl2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__4__Impl_in_rule__ListAttribute__Group__42651 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__5_in_rule__ListAttribute__Group__42654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ListAttribute__Group__4__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group__5__Impl_in_rule__ListAttribute__Group__52713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ListAttribute__Group__5__Impl2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group_3__0__Impl_in_rule__ListAttribute__Group_3__02784 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group_3__1_in_rule__ListAttribute__Group_3__02787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__ValuesAssignment_3_0_in_rule__ListAttribute__Group_3__0__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group_3__1__Impl_in_rule__ListAttribute__Group_3__12844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group_3_1__0_in_rule__ListAttribute__Group_3__1__Impl2871 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group_3_1__0__Impl_in_rule__ListAttribute__Group_3_1__02906 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group_3_1__1_in_rule__ListAttribute__Group_3_1__02909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ListAttribute__Group_3_1__0__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__Group_3_1__1__Impl_in_rule__ListAttribute__Group_3_1__12968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListAttribute__ValuesAssignment_3_1_1_in_rule__ListAttribute__Group_3_1__1__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03032 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3118 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03153 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__QualifiedName__Group_1__0__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Template__NameAssignment_13280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Template__FeaturesAssignment_33311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_0_03342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__Feature__ValueAssignment_0_23373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TableData__NameAssignment_33404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDataAttribute_in_rule__TableData__TableDataAttributesAssignment_5_03435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableSection_in_rule__TableData__SectionsAssignment_5_13466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TableSection__NameAlternatives_1_0_in_rule__TableSection__NameAssignment_13497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDataAttribute_in_rule__TableSection__AttributesAssignment_33530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TableDataAttribute__NameAssignment_0_03561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__TableDataAttribute__ValueAssignment_0_23592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ListAttribute__NameAssignment_03623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListAttribute__ValuesAssignment_3_03654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ListAttribute__ValuesAssignment_3_1_13685 = new BitSet(new long[]{0x0000000000000002L});

}