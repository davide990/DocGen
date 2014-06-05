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
import org.xtext.passi.services.DocGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDocGenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TAG_START_OPEN", "RULE_TAG_CLOSE", "RULE_TAG_END_OPEN", "RULE_TAG_EMPTY_CLOSE", "RULE_PROLOG_START", "RULE_PROLOG_END", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'='", "'xml'"
    };
    public static final int RULE_PROLOG_START=9;
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=11;
    public static final int RULE_TAG_START_OPEN=5;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_PROLOG_END=10;
    public static final int RULE_INT=12;
    public static final int RULE_TAG_END_OPEN=7;
    public static final int RULE_WS=15;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int RULE_TAG_EMPTY_CLOSE=8;
    public static final int RULE_TAG_CLOSE=6;
    public static final int RULE_ML_COMMENT=13;

    // delegates
    // delegators


        public InternalDocGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDocGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDocGenParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g"; }


     
     	private DocGenGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DocGenGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:61:1: ( ruleModel EOF )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleelement"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:88:1: entryRuleelement : ruleelement EOF ;
    public final void entryRuleelement() throws RecognitionException {
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:89:1: ( ruleelement EOF )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:90:1: ruleelement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleelement_in_entryRuleelement121);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement128); 

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
    // $ANTLR end "entryRuleelement"


    // $ANTLR start "ruleelement"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:97:1: ruleelement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleelement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:104:1: ( rule__Element__Alternatives )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleelement154);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleelement"


    // $ANTLR start "entryRulestartTag"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:116:1: entryRulestartTag : rulestartTag EOF ;
    public final void entryRulestartTag() throws RecognitionException {
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:117:1: ( rulestartTag EOF )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:118:1: rulestartTag EOF
            {
             before(grammarAccess.getStartTagRule()); 
            pushFollow(FOLLOW_rulestartTag_in_entryRulestartTag181);
            rulestartTag();

            state._fsp--;

             after(grammarAccess.getStartTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulestartTag188); 

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
    // $ANTLR end "entryRulestartTag"


    // $ANTLR start "rulestartTag"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:125:1: rulestartTag : ( ( rule__StartTag__Group__0 ) ) ;
    public final void rulestartTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:129:2: ( ( ( rule__StartTag__Group__0 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:130:1: ( ( rule__StartTag__Group__0 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:130:1: ( ( rule__StartTag__Group__0 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:131:1: ( rule__StartTag__Group__0 )
            {
             before(grammarAccess.getStartTagAccess().getGroup()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:132:1: ( rule__StartTag__Group__0 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:132:2: rule__StartTag__Group__0
            {
            pushFollow(FOLLOW_rule__StartTag__Group__0_in_rulestartTag214);
            rule__StartTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartTagAccess().getGroup()); 

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
    // $ANTLR end "rulestartTag"


    // $ANTLR start "entryRuleendTag"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:144:1: entryRuleendTag : ruleendTag EOF ;
    public final void entryRuleendTag() throws RecognitionException {
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:145:1: ( ruleendTag EOF )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:146:1: ruleendTag EOF
            {
             before(grammarAccess.getEndTagRule()); 
            pushFollow(FOLLOW_ruleendTag_in_entryRuleendTag241);
            ruleendTag();

            state._fsp--;

             after(grammarAccess.getEndTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleendTag248); 

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
    // $ANTLR end "entryRuleendTag"


    // $ANTLR start "ruleendTag"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:153:1: ruleendTag : ( ( rule__EndTag__Group__0 ) ) ;
    public final void ruleendTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:157:2: ( ( ( rule__EndTag__Group__0 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:158:1: ( ( rule__EndTag__Group__0 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:158:1: ( ( rule__EndTag__Group__0 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:159:1: ( rule__EndTag__Group__0 )
            {
             before(grammarAccess.getEndTagAccess().getGroup()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:160:1: ( rule__EndTag__Group__0 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:160:2: rule__EndTag__Group__0
            {
            pushFollow(FOLLOW_rule__EndTag__Group__0_in_ruleendTag274);
            rule__EndTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEndTagAccess().getGroup()); 

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
    // $ANTLR end "ruleendTag"


    // $ANTLR start "entryRuleemptyElement"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:172:1: entryRuleemptyElement : ruleemptyElement EOF ;
    public final void entryRuleemptyElement() throws RecognitionException {
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:173:1: ( ruleemptyElement EOF )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:174:1: ruleemptyElement EOF
            {
             before(grammarAccess.getEmptyElementRule()); 
            pushFollow(FOLLOW_ruleemptyElement_in_entryRuleemptyElement301);
            ruleemptyElement();

            state._fsp--;

             after(grammarAccess.getEmptyElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleemptyElement308); 

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
    // $ANTLR end "entryRuleemptyElement"


    // $ANTLR start "ruleemptyElement"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:181:1: ruleemptyElement : ( ( rule__EmptyElement__Group__0 ) ) ;
    public final void ruleemptyElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:185:2: ( ( ( rule__EmptyElement__Group__0 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:186:1: ( ( rule__EmptyElement__Group__0 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:186:1: ( ( rule__EmptyElement__Group__0 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:187:1: ( rule__EmptyElement__Group__0 )
            {
             before(grammarAccess.getEmptyElementAccess().getGroup()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:188:1: ( rule__EmptyElement__Group__0 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:188:2: rule__EmptyElement__Group__0
            {
            pushFollow(FOLLOW_rule__EmptyElement__Group__0_in_ruleemptyElement334);
            rule__EmptyElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmptyElementAccess().getGroup()); 

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
    // $ANTLR end "ruleemptyElement"


    // $ANTLR start "entryRuleprologTag"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:200:1: entryRuleprologTag : ruleprologTag EOF ;
    public final void entryRuleprologTag() throws RecognitionException {
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:201:1: ( ruleprologTag EOF )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:202:1: ruleprologTag EOF
            {
             before(grammarAccess.getPrologTagRule()); 
            pushFollow(FOLLOW_ruleprologTag_in_entryRuleprologTag361);
            ruleprologTag();

            state._fsp--;

             after(grammarAccess.getPrologTagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprologTag368); 

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
    // $ANTLR end "entryRuleprologTag"


    // $ANTLR start "ruleprologTag"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:209:1: ruleprologTag : ( ( rule__PrologTag__Group__0 ) ) ;
    public final void ruleprologTag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:213:2: ( ( ( rule__PrologTag__Group__0 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:214:1: ( ( rule__PrologTag__Group__0 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:214:1: ( ( rule__PrologTag__Group__0 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:215:1: ( rule__PrologTag__Group__0 )
            {
             before(grammarAccess.getPrologTagAccess().getGroup()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:216:1: ( rule__PrologTag__Group__0 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:216:2: rule__PrologTag__Group__0
            {
            pushFollow(FOLLOW_rule__PrologTag__Group__0_in_ruleprologTag394);
            rule__PrologTag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrologTagAccess().getGroup()); 

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
    // $ANTLR end "ruleprologTag"


    // $ANTLR start "entryRuleTagName"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:228:1: entryRuleTagName : ruleTagName EOF ;
    public final void entryRuleTagName() throws RecognitionException {
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:229:1: ( ruleTagName EOF )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:230:1: ruleTagName EOF
            {
             before(grammarAccess.getTagNameRule()); 
            pushFollow(FOLLOW_ruleTagName_in_entryRuleTagName421);
            ruleTagName();

            state._fsp--;

             after(grammarAccess.getTagNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagName428); 

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
    // $ANTLR end "entryRuleTagName"


    // $ANTLR start "ruleTagName"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:237:1: ruleTagName : ( ( rule__TagName__Alternatives ) ) ;
    public final void ruleTagName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:241:2: ( ( ( rule__TagName__Alternatives ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:242:1: ( ( rule__TagName__Alternatives ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:242:1: ( ( rule__TagName__Alternatives ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:243:1: ( rule__TagName__Alternatives )
            {
             before(grammarAccess.getTagNameAccess().getAlternatives()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:244:1: ( rule__TagName__Alternatives )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:244:2: rule__TagName__Alternatives
            {
            pushFollow(FOLLOW_rule__TagName__Alternatives_in_ruleTagName454);
            rule__TagName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTagNameAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTagName"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:256:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:257:1: ( ruleAttribute EOF )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:258:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute481);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute488); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:265:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:269:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:270:1: ( ( rule__Attribute__Alternatives ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:270:1: ( ( rule__Attribute__Alternatives ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:271:1: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:272:1: ( rule__Attribute__Alternatives )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:272:2: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute514);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "rule__Element__Alternatives"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:284:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ruleemptyElement ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:288:1: ( ( ( rule__Element__Group_0__0 ) ) | ( ruleemptyElement ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:289:1: ( ( rule__Element__Group_0__0 ) )
                    {
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:289:1: ( ( rule__Element__Group_0__0 ) )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:290:1: ( rule__Element__Group_0__0 )
                    {
                     before(grammarAccess.getElementAccess().getGroup_0()); 
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:291:1: ( rule__Element__Group_0__0 )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:291:2: rule__Element__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Element__Group_0__0_in_rule__Element__Alternatives550);
                    rule__Element__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:295:6: ( ruleemptyElement )
                    {
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:295:6: ( ruleemptyElement )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:296:1: ruleemptyElement
                    {
                     before(grammarAccess.getElementAccess().getEmptyElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleemptyElement_in_rule__Element__Alternatives568);
                    ruleemptyElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEmptyElementParserRuleCall_1()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Element__Alternatives_0_1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:306:1: rule__Element__Alternatives_0_1 : ( ( ( rule__Element__InnerElementAssignment_0_1_0 ) ) | ( RULE_ID ) );
    public final void rule__Element__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:310:1: ( ( ( rule__Element__InnerElementAssignment_0_1_0 ) ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_TAG_START_OPEN) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:311:1: ( ( rule__Element__InnerElementAssignment_0_1_0 ) )
                    {
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:311:1: ( ( rule__Element__InnerElementAssignment_0_1_0 ) )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:312:1: ( rule__Element__InnerElementAssignment_0_1_0 )
                    {
                     before(grammarAccess.getElementAccess().getInnerElementAssignment_0_1_0()); 
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:313:1: ( rule__Element__InnerElementAssignment_0_1_0 )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:313:2: rule__Element__InnerElementAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_rule__Element__InnerElementAssignment_0_1_0_in_rule__Element__Alternatives_0_1600);
                    rule__Element__InnerElementAssignment_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getElementAccess().getInnerElementAssignment_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:317:6: ( RULE_ID )
                    {
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:317:6: ( RULE_ID )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:318:1: RULE_ID
                    {
                     before(grammarAccess.getElementAccess().getIDTerminalRuleCall_0_1_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Element__Alternatives_0_1618); 
                     after(grammarAccess.getElementAccess().getIDTerminalRuleCall_0_1_1()); 

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
    // $ANTLR end "rule__Element__Alternatives_0_1"


    // $ANTLR start "rule__TagName__Alternatives"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:328:1: rule__TagName__Alternatives : ( ( ( rule__TagName__NameAssignment_0 ) ) | ( ( rule__TagName__Group_1__0 ) ) );
    public final void rule__TagName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:332:1: ( ( ( rule__TagName__NameAssignment_0 ) ) | ( ( rule__TagName__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==17) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||LA3_1==RULE_ID||LA3_1==RULE_TAG_CLOSE||LA3_1==RULE_TAG_EMPTY_CLOSE) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:333:1: ( ( rule__TagName__NameAssignment_0 ) )
                    {
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:333:1: ( ( rule__TagName__NameAssignment_0 ) )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:334:1: ( rule__TagName__NameAssignment_0 )
                    {
                     before(grammarAccess.getTagNameAccess().getNameAssignment_0()); 
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:335:1: ( rule__TagName__NameAssignment_0 )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:335:2: rule__TagName__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__TagName__NameAssignment_0_in_rule__TagName__Alternatives650);
                    rule__TagName__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTagNameAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:339:6: ( ( rule__TagName__Group_1__0 ) )
                    {
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:339:6: ( ( rule__TagName__Group_1__0 ) )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:340:1: ( rule__TagName__Group_1__0 )
                    {
                     before(grammarAccess.getTagNameAccess().getGroup_1()); 
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:341:1: ( rule__TagName__Group_1__0 )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:341:2: rule__TagName__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TagName__Group_1__0_in_rule__TagName__Alternatives668);
                    rule__TagName__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTagNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TagName__Alternatives"


    // $ANTLR start "rule__Attribute__Alternatives"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:350:1: rule__Attribute__Alternatives : ( ( ( rule__Attribute__Group_0__0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:354:1: ( ( ( rule__Attribute__Group_0__0 ) ) | ( ( rule__Attribute__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    alt4=2;
                }
                else if ( (LA4_1==18) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:355:1: ( ( rule__Attribute__Group_0__0 ) )
                    {
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:355:1: ( ( rule__Attribute__Group_0__0 ) )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:356:1: ( rule__Attribute__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_0()); 
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:357:1: ( rule__Attribute__Group_0__0 )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:357:2: rule__Attribute__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_0__0_in_rule__Attribute__Alternatives701);
                    rule__Attribute__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:361:6: ( ( rule__Attribute__Group_1__0 ) )
                    {
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:361:6: ( ( rule__Attribute__Group_1__0 ) )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:362:1: ( rule__Attribute__Group_1__0 )
                    {
                     before(grammarAccess.getAttributeAccess().getGroup_1()); 
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:363:1: ( rule__Attribute__Group_1__0 )
                    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:363:2: rule__Attribute__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_1__0_in_rule__Attribute__Alternatives719);
                    rule__Attribute__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:374:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:378:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:379:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0750);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0753);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:386:1: rule__Model__Group__0__Impl : ( ( rule__Model__PrologAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:390:1: ( ( ( rule__Model__PrologAssignment_0 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:391:1: ( ( rule__Model__PrologAssignment_0 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:391:1: ( ( rule__Model__PrologAssignment_0 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:392:1: ( rule__Model__PrologAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getPrologAssignment_0()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:393:1: ( rule__Model__PrologAssignment_0 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:393:2: rule__Model__PrologAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__PrologAssignment_0_in_rule__Model__Group__0__Impl780);
            rule__Model__PrologAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPrologAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:403:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:407:1: ( rule__Model__Group__1__Impl )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:408:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1810);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:414:1: rule__Model__Group__1__Impl : ( ( rule__Model__XmldocAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:418:1: ( ( ( rule__Model__XmldocAssignment_1 )* ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:419:1: ( ( rule__Model__XmldocAssignment_1 )* )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:419:1: ( ( rule__Model__XmldocAssignment_1 )* )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:420:1: ( rule__Model__XmldocAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getXmldocAssignment_1()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:421:1: ( rule__Model__XmldocAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_TAG_START_OPEN) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:421:2: rule__Model__XmldocAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__XmldocAssignment_1_in_rule__Model__Group__1__Impl837);
            	    rule__Model__XmldocAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getXmldocAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Element__Group_0__0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:435:1: rule__Element__Group_0__0 : rule__Element__Group_0__0__Impl rule__Element__Group_0__1 ;
    public final void rule__Element__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:439:1: ( rule__Element__Group_0__0__Impl rule__Element__Group_0__1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:440:2: rule__Element__Group_0__0__Impl rule__Element__Group_0__1
            {
            pushFollow(FOLLOW_rule__Element__Group_0__0__Impl_in_rule__Element__Group_0__0872);
            rule__Element__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_0__1_in_rule__Element__Group_0__0875);
            rule__Element__Group_0__1();

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
    // $ANTLR end "rule__Element__Group_0__0"


    // $ANTLR start "rule__Element__Group_0__0__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:447:1: rule__Element__Group_0__0__Impl : ( ( rule__Element__StartAssignment_0_0 ) ) ;
    public final void rule__Element__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:451:1: ( ( ( rule__Element__StartAssignment_0_0 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:452:1: ( ( rule__Element__StartAssignment_0_0 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:452:1: ( ( rule__Element__StartAssignment_0_0 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:453:1: ( rule__Element__StartAssignment_0_0 )
            {
             before(grammarAccess.getElementAccess().getStartAssignment_0_0()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:454:1: ( rule__Element__StartAssignment_0_0 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:454:2: rule__Element__StartAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Element__StartAssignment_0_0_in_rule__Element__Group_0__0__Impl902);
            rule__Element__StartAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getStartAssignment_0_0()); 

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
    // $ANTLR end "rule__Element__Group_0__0__Impl"


    // $ANTLR start "rule__Element__Group_0__1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:464:1: rule__Element__Group_0__1 : rule__Element__Group_0__1__Impl rule__Element__Group_0__2 ;
    public final void rule__Element__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:468:1: ( rule__Element__Group_0__1__Impl rule__Element__Group_0__2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:469:2: rule__Element__Group_0__1__Impl rule__Element__Group_0__2
            {
            pushFollow(FOLLOW_rule__Element__Group_0__1__Impl_in_rule__Element__Group_0__1932);
            rule__Element__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Element__Group_0__2_in_rule__Element__Group_0__1935);
            rule__Element__Group_0__2();

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
    // $ANTLR end "rule__Element__Group_0__1"


    // $ANTLR start "rule__Element__Group_0__1__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:476:1: rule__Element__Group_0__1__Impl : ( ( rule__Element__Alternatives_0_1 )* ) ;
    public final void rule__Element__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:480:1: ( ( ( rule__Element__Alternatives_0_1 )* ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:481:1: ( ( rule__Element__Alternatives_0_1 )* )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:481:1: ( ( rule__Element__Alternatives_0_1 )* )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:482:1: ( rule__Element__Alternatives_0_1 )*
            {
             before(grammarAccess.getElementAccess().getAlternatives_0_1()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:483:1: ( rule__Element__Alternatives_0_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_TAG_START_OPEN)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:483:2: rule__Element__Alternatives_0_1
            	    {
            	    pushFollow(FOLLOW_rule__Element__Alternatives_0_1_in_rule__Element__Group_0__1__Impl962);
            	    rule__Element__Alternatives_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getElementAccess().getAlternatives_0_1()); 

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
    // $ANTLR end "rule__Element__Group_0__1__Impl"


    // $ANTLR start "rule__Element__Group_0__2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:493:1: rule__Element__Group_0__2 : rule__Element__Group_0__2__Impl ;
    public final void rule__Element__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:497:1: ( rule__Element__Group_0__2__Impl )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:498:2: rule__Element__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Element__Group_0__2__Impl_in_rule__Element__Group_0__2993);
            rule__Element__Group_0__2__Impl();

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
    // $ANTLR end "rule__Element__Group_0__2"


    // $ANTLR start "rule__Element__Group_0__2__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:504:1: rule__Element__Group_0__2__Impl : ( ( rule__Element__EndAssignment_0_2 ) ) ;
    public final void rule__Element__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:508:1: ( ( ( rule__Element__EndAssignment_0_2 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:509:1: ( ( rule__Element__EndAssignment_0_2 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:509:1: ( ( rule__Element__EndAssignment_0_2 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:510:1: ( rule__Element__EndAssignment_0_2 )
            {
             before(grammarAccess.getElementAccess().getEndAssignment_0_2()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:511:1: ( rule__Element__EndAssignment_0_2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:511:2: rule__Element__EndAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Element__EndAssignment_0_2_in_rule__Element__Group_0__2__Impl1020);
            rule__Element__EndAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getEndAssignment_0_2()); 

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
    // $ANTLR end "rule__Element__Group_0__2__Impl"


    // $ANTLR start "rule__StartTag__Group__0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:527:1: rule__StartTag__Group__0 : rule__StartTag__Group__0__Impl rule__StartTag__Group__1 ;
    public final void rule__StartTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:531:1: ( rule__StartTag__Group__0__Impl rule__StartTag__Group__1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:532:2: rule__StartTag__Group__0__Impl rule__StartTag__Group__1
            {
            pushFollow(FOLLOW_rule__StartTag__Group__0__Impl_in_rule__StartTag__Group__01056);
            rule__StartTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartTag__Group__1_in_rule__StartTag__Group__01059);
            rule__StartTag__Group__1();

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
    // $ANTLR end "rule__StartTag__Group__0"


    // $ANTLR start "rule__StartTag__Group__0__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:539:1: rule__StartTag__Group__0__Impl : ( RULE_TAG_START_OPEN ) ;
    public final void rule__StartTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:543:1: ( ( RULE_TAG_START_OPEN ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:544:1: ( RULE_TAG_START_OPEN )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:544:1: ( RULE_TAG_START_OPEN )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:545:1: RULE_TAG_START_OPEN
            {
             before(grammarAccess.getStartTagAccess().getTAG_START_OPENTerminalRuleCall_0()); 
            match(input,RULE_TAG_START_OPEN,FOLLOW_RULE_TAG_START_OPEN_in_rule__StartTag__Group__0__Impl1086); 
             after(grammarAccess.getStartTagAccess().getTAG_START_OPENTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StartTag__Group__0__Impl"


    // $ANTLR start "rule__StartTag__Group__1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:556:1: rule__StartTag__Group__1 : rule__StartTag__Group__1__Impl rule__StartTag__Group__2 ;
    public final void rule__StartTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:560:1: ( rule__StartTag__Group__1__Impl rule__StartTag__Group__2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:561:2: rule__StartTag__Group__1__Impl rule__StartTag__Group__2
            {
            pushFollow(FOLLOW_rule__StartTag__Group__1__Impl_in_rule__StartTag__Group__11115);
            rule__StartTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartTag__Group__2_in_rule__StartTag__Group__11118);
            rule__StartTag__Group__2();

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
    // $ANTLR end "rule__StartTag__Group__1"


    // $ANTLR start "rule__StartTag__Group__1__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:568:1: rule__StartTag__Group__1__Impl : ( ( rule__StartTag__TagNameAssignment_1 ) ) ;
    public final void rule__StartTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:572:1: ( ( ( rule__StartTag__TagNameAssignment_1 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:573:1: ( ( rule__StartTag__TagNameAssignment_1 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:573:1: ( ( rule__StartTag__TagNameAssignment_1 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:574:1: ( rule__StartTag__TagNameAssignment_1 )
            {
             before(grammarAccess.getStartTagAccess().getTagNameAssignment_1()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:575:1: ( rule__StartTag__TagNameAssignment_1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:575:2: rule__StartTag__TagNameAssignment_1
            {
            pushFollow(FOLLOW_rule__StartTag__TagNameAssignment_1_in_rule__StartTag__Group__1__Impl1145);
            rule__StartTag__TagNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStartTagAccess().getTagNameAssignment_1()); 

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
    // $ANTLR end "rule__StartTag__Group__1__Impl"


    // $ANTLR start "rule__StartTag__Group__2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:585:1: rule__StartTag__Group__2 : rule__StartTag__Group__2__Impl rule__StartTag__Group__3 ;
    public final void rule__StartTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:589:1: ( rule__StartTag__Group__2__Impl rule__StartTag__Group__3 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:590:2: rule__StartTag__Group__2__Impl rule__StartTag__Group__3
            {
            pushFollow(FOLLOW_rule__StartTag__Group__2__Impl_in_rule__StartTag__Group__21175);
            rule__StartTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StartTag__Group__3_in_rule__StartTag__Group__21178);
            rule__StartTag__Group__3();

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
    // $ANTLR end "rule__StartTag__Group__2"


    // $ANTLR start "rule__StartTag__Group__2__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:597:1: rule__StartTag__Group__2__Impl : ( ( rule__StartTag__AttributesAssignment_2 )* ) ;
    public final void rule__StartTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:601:1: ( ( ( rule__StartTag__AttributesAssignment_2 )* ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:602:1: ( ( rule__StartTag__AttributesAssignment_2 )* )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:602:1: ( ( rule__StartTag__AttributesAssignment_2 )* )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:603:1: ( rule__StartTag__AttributesAssignment_2 )*
            {
             before(grammarAccess.getStartTagAccess().getAttributesAssignment_2()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:604:1: ( rule__StartTag__AttributesAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:604:2: rule__StartTag__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__StartTag__AttributesAssignment_2_in_rule__StartTag__Group__2__Impl1205);
            	    rule__StartTag__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStartTagAccess().getAttributesAssignment_2()); 

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
    // $ANTLR end "rule__StartTag__Group__2__Impl"


    // $ANTLR start "rule__StartTag__Group__3"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:614:1: rule__StartTag__Group__3 : rule__StartTag__Group__3__Impl ;
    public final void rule__StartTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:618:1: ( rule__StartTag__Group__3__Impl )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:619:2: rule__StartTag__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StartTag__Group__3__Impl_in_rule__StartTag__Group__31236);
            rule__StartTag__Group__3__Impl();

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
    // $ANTLR end "rule__StartTag__Group__3"


    // $ANTLR start "rule__StartTag__Group__3__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:625:1: rule__StartTag__Group__3__Impl : ( RULE_TAG_CLOSE ) ;
    public final void rule__StartTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:629:1: ( ( RULE_TAG_CLOSE ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:630:1: ( RULE_TAG_CLOSE )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:630:1: ( RULE_TAG_CLOSE )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:631:1: RULE_TAG_CLOSE
            {
             before(grammarAccess.getStartTagAccess().getTAG_CLOSETerminalRuleCall_3()); 
            match(input,RULE_TAG_CLOSE,FOLLOW_RULE_TAG_CLOSE_in_rule__StartTag__Group__3__Impl1263); 
             after(grammarAccess.getStartTagAccess().getTAG_CLOSETerminalRuleCall_3()); 

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
    // $ANTLR end "rule__StartTag__Group__3__Impl"


    // $ANTLR start "rule__EndTag__Group__0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:650:1: rule__EndTag__Group__0 : rule__EndTag__Group__0__Impl rule__EndTag__Group__1 ;
    public final void rule__EndTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:654:1: ( rule__EndTag__Group__0__Impl rule__EndTag__Group__1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:655:2: rule__EndTag__Group__0__Impl rule__EndTag__Group__1
            {
            pushFollow(FOLLOW_rule__EndTag__Group__0__Impl_in_rule__EndTag__Group__01300);
            rule__EndTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EndTag__Group__1_in_rule__EndTag__Group__01303);
            rule__EndTag__Group__1();

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
    // $ANTLR end "rule__EndTag__Group__0"


    // $ANTLR start "rule__EndTag__Group__0__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:662:1: rule__EndTag__Group__0__Impl : ( RULE_TAG_END_OPEN ) ;
    public final void rule__EndTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:666:1: ( ( RULE_TAG_END_OPEN ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:667:1: ( RULE_TAG_END_OPEN )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:667:1: ( RULE_TAG_END_OPEN )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:668:1: RULE_TAG_END_OPEN
            {
             before(grammarAccess.getEndTagAccess().getTAG_END_OPENTerminalRuleCall_0()); 
            match(input,RULE_TAG_END_OPEN,FOLLOW_RULE_TAG_END_OPEN_in_rule__EndTag__Group__0__Impl1330); 
             after(grammarAccess.getEndTagAccess().getTAG_END_OPENTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EndTag__Group__0__Impl"


    // $ANTLR start "rule__EndTag__Group__1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:679:1: rule__EndTag__Group__1 : rule__EndTag__Group__1__Impl rule__EndTag__Group__2 ;
    public final void rule__EndTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:683:1: ( rule__EndTag__Group__1__Impl rule__EndTag__Group__2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:684:2: rule__EndTag__Group__1__Impl rule__EndTag__Group__2
            {
            pushFollow(FOLLOW_rule__EndTag__Group__1__Impl_in_rule__EndTag__Group__11359);
            rule__EndTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EndTag__Group__2_in_rule__EndTag__Group__11362);
            rule__EndTag__Group__2();

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
    // $ANTLR end "rule__EndTag__Group__1"


    // $ANTLR start "rule__EndTag__Group__1__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:691:1: rule__EndTag__Group__1__Impl : ( ( rule__EndTag__TagNameAssignment_1 ) ) ;
    public final void rule__EndTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:695:1: ( ( ( rule__EndTag__TagNameAssignment_1 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:696:1: ( ( rule__EndTag__TagNameAssignment_1 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:696:1: ( ( rule__EndTag__TagNameAssignment_1 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:697:1: ( rule__EndTag__TagNameAssignment_1 )
            {
             before(grammarAccess.getEndTagAccess().getTagNameAssignment_1()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:698:1: ( rule__EndTag__TagNameAssignment_1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:698:2: rule__EndTag__TagNameAssignment_1
            {
            pushFollow(FOLLOW_rule__EndTag__TagNameAssignment_1_in_rule__EndTag__Group__1__Impl1389);
            rule__EndTag__TagNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEndTagAccess().getTagNameAssignment_1()); 

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
    // $ANTLR end "rule__EndTag__Group__1__Impl"


    // $ANTLR start "rule__EndTag__Group__2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:708:1: rule__EndTag__Group__2 : rule__EndTag__Group__2__Impl ;
    public final void rule__EndTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:712:1: ( rule__EndTag__Group__2__Impl )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:713:2: rule__EndTag__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EndTag__Group__2__Impl_in_rule__EndTag__Group__21419);
            rule__EndTag__Group__2__Impl();

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
    // $ANTLR end "rule__EndTag__Group__2"


    // $ANTLR start "rule__EndTag__Group__2__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:719:1: rule__EndTag__Group__2__Impl : ( RULE_TAG_CLOSE ) ;
    public final void rule__EndTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:723:1: ( ( RULE_TAG_CLOSE ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:724:1: ( RULE_TAG_CLOSE )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:724:1: ( RULE_TAG_CLOSE )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:725:1: RULE_TAG_CLOSE
            {
             before(grammarAccess.getEndTagAccess().getTAG_CLOSETerminalRuleCall_2()); 
            match(input,RULE_TAG_CLOSE,FOLLOW_RULE_TAG_CLOSE_in_rule__EndTag__Group__2__Impl1446); 
             after(grammarAccess.getEndTagAccess().getTAG_CLOSETerminalRuleCall_2()); 

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
    // $ANTLR end "rule__EndTag__Group__2__Impl"


    // $ANTLR start "rule__EmptyElement__Group__0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:742:1: rule__EmptyElement__Group__0 : rule__EmptyElement__Group__0__Impl rule__EmptyElement__Group__1 ;
    public final void rule__EmptyElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:746:1: ( rule__EmptyElement__Group__0__Impl rule__EmptyElement__Group__1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:747:2: rule__EmptyElement__Group__0__Impl rule__EmptyElement__Group__1
            {
            pushFollow(FOLLOW_rule__EmptyElement__Group__0__Impl_in_rule__EmptyElement__Group__01481);
            rule__EmptyElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EmptyElement__Group__1_in_rule__EmptyElement__Group__01484);
            rule__EmptyElement__Group__1();

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
    // $ANTLR end "rule__EmptyElement__Group__0"


    // $ANTLR start "rule__EmptyElement__Group__0__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:754:1: rule__EmptyElement__Group__0__Impl : ( RULE_TAG_START_OPEN ) ;
    public final void rule__EmptyElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:758:1: ( ( RULE_TAG_START_OPEN ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:759:1: ( RULE_TAG_START_OPEN )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:759:1: ( RULE_TAG_START_OPEN )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:760:1: RULE_TAG_START_OPEN
            {
             before(grammarAccess.getEmptyElementAccess().getTAG_START_OPENTerminalRuleCall_0()); 
            match(input,RULE_TAG_START_OPEN,FOLLOW_RULE_TAG_START_OPEN_in_rule__EmptyElement__Group__0__Impl1511); 
             after(grammarAccess.getEmptyElementAccess().getTAG_START_OPENTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__EmptyElement__Group__0__Impl"


    // $ANTLR start "rule__EmptyElement__Group__1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:771:1: rule__EmptyElement__Group__1 : rule__EmptyElement__Group__1__Impl rule__EmptyElement__Group__2 ;
    public final void rule__EmptyElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:775:1: ( rule__EmptyElement__Group__1__Impl rule__EmptyElement__Group__2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:776:2: rule__EmptyElement__Group__1__Impl rule__EmptyElement__Group__2
            {
            pushFollow(FOLLOW_rule__EmptyElement__Group__1__Impl_in_rule__EmptyElement__Group__11540);
            rule__EmptyElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EmptyElement__Group__2_in_rule__EmptyElement__Group__11543);
            rule__EmptyElement__Group__2();

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
    // $ANTLR end "rule__EmptyElement__Group__1"


    // $ANTLR start "rule__EmptyElement__Group__1__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:783:1: rule__EmptyElement__Group__1__Impl : ( ( rule__EmptyElement__TagNameAssignment_1 ) ) ;
    public final void rule__EmptyElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:787:1: ( ( ( rule__EmptyElement__TagNameAssignment_1 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:788:1: ( ( rule__EmptyElement__TagNameAssignment_1 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:788:1: ( ( rule__EmptyElement__TagNameAssignment_1 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:789:1: ( rule__EmptyElement__TagNameAssignment_1 )
            {
             before(grammarAccess.getEmptyElementAccess().getTagNameAssignment_1()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:790:1: ( rule__EmptyElement__TagNameAssignment_1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:790:2: rule__EmptyElement__TagNameAssignment_1
            {
            pushFollow(FOLLOW_rule__EmptyElement__TagNameAssignment_1_in_rule__EmptyElement__Group__1__Impl1570);
            rule__EmptyElement__TagNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmptyElementAccess().getTagNameAssignment_1()); 

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
    // $ANTLR end "rule__EmptyElement__Group__1__Impl"


    // $ANTLR start "rule__EmptyElement__Group__2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:800:1: rule__EmptyElement__Group__2 : rule__EmptyElement__Group__2__Impl rule__EmptyElement__Group__3 ;
    public final void rule__EmptyElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:804:1: ( rule__EmptyElement__Group__2__Impl rule__EmptyElement__Group__3 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:805:2: rule__EmptyElement__Group__2__Impl rule__EmptyElement__Group__3
            {
            pushFollow(FOLLOW_rule__EmptyElement__Group__2__Impl_in_rule__EmptyElement__Group__21600);
            rule__EmptyElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EmptyElement__Group__3_in_rule__EmptyElement__Group__21603);
            rule__EmptyElement__Group__3();

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
    // $ANTLR end "rule__EmptyElement__Group__2"


    // $ANTLR start "rule__EmptyElement__Group__2__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:812:1: rule__EmptyElement__Group__2__Impl : ( ( rule__EmptyElement__AttributesAssignment_2 )* ) ;
    public final void rule__EmptyElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:816:1: ( ( ( rule__EmptyElement__AttributesAssignment_2 )* ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:817:1: ( ( rule__EmptyElement__AttributesAssignment_2 )* )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:817:1: ( ( rule__EmptyElement__AttributesAssignment_2 )* )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:818:1: ( rule__EmptyElement__AttributesAssignment_2 )*
            {
             before(grammarAccess.getEmptyElementAccess().getAttributesAssignment_2()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:819:1: ( rule__EmptyElement__AttributesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:819:2: rule__EmptyElement__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__EmptyElement__AttributesAssignment_2_in_rule__EmptyElement__Group__2__Impl1630);
            	    rule__EmptyElement__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEmptyElementAccess().getAttributesAssignment_2()); 

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
    // $ANTLR end "rule__EmptyElement__Group__2__Impl"


    // $ANTLR start "rule__EmptyElement__Group__3"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:829:1: rule__EmptyElement__Group__3 : rule__EmptyElement__Group__3__Impl ;
    public final void rule__EmptyElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:833:1: ( rule__EmptyElement__Group__3__Impl )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:834:2: rule__EmptyElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EmptyElement__Group__3__Impl_in_rule__EmptyElement__Group__31661);
            rule__EmptyElement__Group__3__Impl();

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
    // $ANTLR end "rule__EmptyElement__Group__3"


    // $ANTLR start "rule__EmptyElement__Group__3__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:840:1: rule__EmptyElement__Group__3__Impl : ( RULE_TAG_EMPTY_CLOSE ) ;
    public final void rule__EmptyElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:844:1: ( ( RULE_TAG_EMPTY_CLOSE ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:845:1: ( RULE_TAG_EMPTY_CLOSE )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:845:1: ( RULE_TAG_EMPTY_CLOSE )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:846:1: RULE_TAG_EMPTY_CLOSE
            {
             before(grammarAccess.getEmptyElementAccess().getTAG_EMPTY_CLOSETerminalRuleCall_3()); 
            match(input,RULE_TAG_EMPTY_CLOSE,FOLLOW_RULE_TAG_EMPTY_CLOSE_in_rule__EmptyElement__Group__3__Impl1688); 
             after(grammarAccess.getEmptyElementAccess().getTAG_EMPTY_CLOSETerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EmptyElement__Group__3__Impl"


    // $ANTLR start "rule__PrologTag__Group__0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:865:1: rule__PrologTag__Group__0 : rule__PrologTag__Group__0__Impl rule__PrologTag__Group__1 ;
    public final void rule__PrologTag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:869:1: ( rule__PrologTag__Group__0__Impl rule__PrologTag__Group__1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:870:2: rule__PrologTag__Group__0__Impl rule__PrologTag__Group__1
            {
            pushFollow(FOLLOW_rule__PrologTag__Group__0__Impl_in_rule__PrologTag__Group__01725);
            rule__PrologTag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrologTag__Group__1_in_rule__PrologTag__Group__01728);
            rule__PrologTag__Group__1();

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
    // $ANTLR end "rule__PrologTag__Group__0"


    // $ANTLR start "rule__PrologTag__Group__0__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:877:1: rule__PrologTag__Group__0__Impl : ( RULE_PROLOG_START ) ;
    public final void rule__PrologTag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:881:1: ( ( RULE_PROLOG_START ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:882:1: ( RULE_PROLOG_START )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:882:1: ( RULE_PROLOG_START )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:883:1: RULE_PROLOG_START
            {
             before(grammarAccess.getPrologTagAccess().getPROLOG_STARTTerminalRuleCall_0()); 
            match(input,RULE_PROLOG_START,FOLLOW_RULE_PROLOG_START_in_rule__PrologTag__Group__0__Impl1755); 
             after(grammarAccess.getPrologTagAccess().getPROLOG_STARTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__PrologTag__Group__0__Impl"


    // $ANTLR start "rule__PrologTag__Group__1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:894:1: rule__PrologTag__Group__1 : rule__PrologTag__Group__1__Impl rule__PrologTag__Group__2 ;
    public final void rule__PrologTag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:898:1: ( rule__PrologTag__Group__1__Impl rule__PrologTag__Group__2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:899:2: rule__PrologTag__Group__1__Impl rule__PrologTag__Group__2
            {
            pushFollow(FOLLOW_rule__PrologTag__Group__1__Impl_in_rule__PrologTag__Group__11784);
            rule__PrologTag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrologTag__Group__2_in_rule__PrologTag__Group__11787);
            rule__PrologTag__Group__2();

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
    // $ANTLR end "rule__PrologTag__Group__1"


    // $ANTLR start "rule__PrologTag__Group__1__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:906:1: rule__PrologTag__Group__1__Impl : ( ( rule__PrologTag__NameAssignment_1 ) ) ;
    public final void rule__PrologTag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:910:1: ( ( ( rule__PrologTag__NameAssignment_1 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:911:1: ( ( rule__PrologTag__NameAssignment_1 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:911:1: ( ( rule__PrologTag__NameAssignment_1 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:912:1: ( rule__PrologTag__NameAssignment_1 )
            {
             before(grammarAccess.getPrologTagAccess().getNameAssignment_1()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:913:1: ( rule__PrologTag__NameAssignment_1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:913:2: rule__PrologTag__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PrologTag__NameAssignment_1_in_rule__PrologTag__Group__1__Impl1814);
            rule__PrologTag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrologTagAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PrologTag__Group__1__Impl"


    // $ANTLR start "rule__PrologTag__Group__2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:923:1: rule__PrologTag__Group__2 : rule__PrologTag__Group__2__Impl rule__PrologTag__Group__3 ;
    public final void rule__PrologTag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:927:1: ( rule__PrologTag__Group__2__Impl rule__PrologTag__Group__3 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:928:2: rule__PrologTag__Group__2__Impl rule__PrologTag__Group__3
            {
            pushFollow(FOLLOW_rule__PrologTag__Group__2__Impl_in_rule__PrologTag__Group__21844);
            rule__PrologTag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PrologTag__Group__3_in_rule__PrologTag__Group__21847);
            rule__PrologTag__Group__3();

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
    // $ANTLR end "rule__PrologTag__Group__2"


    // $ANTLR start "rule__PrologTag__Group__2__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:935:1: rule__PrologTag__Group__2__Impl : ( ( rule__PrologTag__AttributesAssignment_2 )* ) ;
    public final void rule__PrologTag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:939:1: ( ( ( rule__PrologTag__AttributesAssignment_2 )* ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:940:1: ( ( rule__PrologTag__AttributesAssignment_2 )* )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:940:1: ( ( rule__PrologTag__AttributesAssignment_2 )* )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:941:1: ( rule__PrologTag__AttributesAssignment_2 )*
            {
             before(grammarAccess.getPrologTagAccess().getAttributesAssignment_2()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:942:1: ( rule__PrologTag__AttributesAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:942:2: rule__PrologTag__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__PrologTag__AttributesAssignment_2_in_rule__PrologTag__Group__2__Impl1874);
            	    rule__PrologTag__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getPrologTagAccess().getAttributesAssignment_2()); 

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
    // $ANTLR end "rule__PrologTag__Group__2__Impl"


    // $ANTLR start "rule__PrologTag__Group__3"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:952:1: rule__PrologTag__Group__3 : rule__PrologTag__Group__3__Impl ;
    public final void rule__PrologTag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:956:1: ( rule__PrologTag__Group__3__Impl )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:957:2: rule__PrologTag__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PrologTag__Group__3__Impl_in_rule__PrologTag__Group__31905);
            rule__PrologTag__Group__3__Impl();

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
    // $ANTLR end "rule__PrologTag__Group__3"


    // $ANTLR start "rule__PrologTag__Group__3__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:963:1: rule__PrologTag__Group__3__Impl : ( RULE_PROLOG_END ) ;
    public final void rule__PrologTag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:967:1: ( ( RULE_PROLOG_END ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:968:1: ( RULE_PROLOG_END )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:968:1: ( RULE_PROLOG_END )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:969:1: RULE_PROLOG_END
            {
             before(grammarAccess.getPrologTagAccess().getPROLOG_ENDTerminalRuleCall_3()); 
            match(input,RULE_PROLOG_END,FOLLOW_RULE_PROLOG_END_in_rule__PrologTag__Group__3__Impl1932); 
             after(grammarAccess.getPrologTagAccess().getPROLOG_ENDTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__PrologTag__Group__3__Impl"


    // $ANTLR start "rule__TagName__Group_1__0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:988:1: rule__TagName__Group_1__0 : rule__TagName__Group_1__0__Impl rule__TagName__Group_1__1 ;
    public final void rule__TagName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:992:1: ( rule__TagName__Group_1__0__Impl rule__TagName__Group_1__1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:993:2: rule__TagName__Group_1__0__Impl rule__TagName__Group_1__1
            {
            pushFollow(FOLLOW_rule__TagName__Group_1__0__Impl_in_rule__TagName__Group_1__01969);
            rule__TagName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagName__Group_1__1_in_rule__TagName__Group_1__01972);
            rule__TagName__Group_1__1();

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
    // $ANTLR end "rule__TagName__Group_1__0"


    // $ANTLR start "rule__TagName__Group_1__0__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1000:1: rule__TagName__Group_1__0__Impl : ( ( rule__TagName__NameAssignment_1_0 ) ) ;
    public final void rule__TagName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1004:1: ( ( ( rule__TagName__NameAssignment_1_0 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1005:1: ( ( rule__TagName__NameAssignment_1_0 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1005:1: ( ( rule__TagName__NameAssignment_1_0 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1006:1: ( rule__TagName__NameAssignment_1_0 )
            {
             before(grammarAccess.getTagNameAccess().getNameAssignment_1_0()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1007:1: ( rule__TagName__NameAssignment_1_0 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1007:2: rule__TagName__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__TagName__NameAssignment_1_0_in_rule__TagName__Group_1__0__Impl1999);
            rule__TagName__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTagNameAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__TagName__Group_1__0__Impl"


    // $ANTLR start "rule__TagName__Group_1__1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1017:1: rule__TagName__Group_1__1 : rule__TagName__Group_1__1__Impl rule__TagName__Group_1__2 ;
    public final void rule__TagName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1021:1: ( rule__TagName__Group_1__1__Impl rule__TagName__Group_1__2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1022:2: rule__TagName__Group_1__1__Impl rule__TagName__Group_1__2
            {
            pushFollow(FOLLOW_rule__TagName__Group_1__1__Impl_in_rule__TagName__Group_1__12029);
            rule__TagName__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TagName__Group_1__2_in_rule__TagName__Group_1__12032);
            rule__TagName__Group_1__2();

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
    // $ANTLR end "rule__TagName__Group_1__1"


    // $ANTLR start "rule__TagName__Group_1__1__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1029:1: rule__TagName__Group_1__1__Impl : ( ':' ) ;
    public final void rule__TagName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1033:1: ( ( ':' ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1034:1: ( ':' )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1034:1: ( ':' )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1035:1: ':'
            {
             before(grammarAccess.getTagNameAccess().getColonKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__TagName__Group_1__1__Impl2060); 
             after(grammarAccess.getTagNameAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__TagName__Group_1__1__Impl"


    // $ANTLR start "rule__TagName__Group_1__2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1048:1: rule__TagName__Group_1__2 : rule__TagName__Group_1__2__Impl ;
    public final void rule__TagName__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1052:1: ( rule__TagName__Group_1__2__Impl )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1053:2: rule__TagName__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TagName__Group_1__2__Impl_in_rule__TagName__Group_1__22091);
            rule__TagName__Group_1__2__Impl();

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
    // $ANTLR end "rule__TagName__Group_1__2"


    // $ANTLR start "rule__TagName__Group_1__2__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1059:1: rule__TagName__Group_1__2__Impl : ( ( rule__TagName__RightNameAssignment_1_2 ) ) ;
    public final void rule__TagName__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1063:1: ( ( ( rule__TagName__RightNameAssignment_1_2 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1064:1: ( ( rule__TagName__RightNameAssignment_1_2 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1064:1: ( ( rule__TagName__RightNameAssignment_1_2 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1065:1: ( rule__TagName__RightNameAssignment_1_2 )
            {
             before(grammarAccess.getTagNameAccess().getRightNameAssignment_1_2()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1066:1: ( rule__TagName__RightNameAssignment_1_2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1066:2: rule__TagName__RightNameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TagName__RightNameAssignment_1_2_in_rule__TagName__Group_1__2__Impl2118);
            rule__TagName__RightNameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTagNameAccess().getRightNameAssignment_1_2()); 

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
    // $ANTLR end "rule__TagName__Group_1__2__Impl"


    // $ANTLR start "rule__Attribute__Group_0__0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1082:1: rule__Attribute__Group_0__0 : rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1 ;
    public final void rule__Attribute__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1086:1: ( rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1087:2: rule__Attribute__Group_0__0__Impl rule__Attribute__Group_0__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_0__0__Impl_in_rule__Attribute__Group_0__02154);
            rule__Attribute__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_0__1_in_rule__Attribute__Group_0__02157);
            rule__Attribute__Group_0__1();

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
    // $ANTLR end "rule__Attribute__Group_0__0"


    // $ANTLR start "rule__Attribute__Group_0__0__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1094:1: rule__Attribute__Group_0__0__Impl : ( ( rule__Attribute__NameAssignment_0_0 ) ) ;
    public final void rule__Attribute__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1098:1: ( ( ( rule__Attribute__NameAssignment_0_0 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1099:1: ( ( rule__Attribute__NameAssignment_0_0 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1099:1: ( ( rule__Attribute__NameAssignment_0_0 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1100:1: ( rule__Attribute__NameAssignment_0_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0_0()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1101:1: ( rule__Attribute__NameAssignment_0_0 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1101:2: rule__Attribute__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_0_0_in_rule__Attribute__Group_0__0__Impl2184);
            rule__Attribute__NameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0_0()); 

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
    // $ANTLR end "rule__Attribute__Group_0__0__Impl"


    // $ANTLR start "rule__Attribute__Group_0__1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1111:1: rule__Attribute__Group_0__1 : rule__Attribute__Group_0__1__Impl rule__Attribute__Group_0__2 ;
    public final void rule__Attribute__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1115:1: ( rule__Attribute__Group_0__1__Impl rule__Attribute__Group_0__2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1116:2: rule__Attribute__Group_0__1__Impl rule__Attribute__Group_0__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_0__1__Impl_in_rule__Attribute__Group_0__12214);
            rule__Attribute__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_0__2_in_rule__Attribute__Group_0__12217);
            rule__Attribute__Group_0__2();

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
    // $ANTLR end "rule__Attribute__Group_0__1"


    // $ANTLR start "rule__Attribute__Group_0__1__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1123:1: rule__Attribute__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1127:1: ( ( '=' ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1128:1: ( '=' )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1128:1: ( '=' )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1129:1: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_0_1()); 
            match(input,18,FOLLOW_18_in_rule__Attribute__Group_0__1__Impl2245); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__Attribute__Group_0__1__Impl"


    // $ANTLR start "rule__Attribute__Group_0__2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1142:1: rule__Attribute__Group_0__2 : rule__Attribute__Group_0__2__Impl ;
    public final void rule__Attribute__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1146:1: ( rule__Attribute__Group_0__2__Impl )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1147:2: rule__Attribute__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_0__2__Impl_in_rule__Attribute__Group_0__22276);
            rule__Attribute__Group_0__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_0__2"


    // $ANTLR start "rule__Attribute__Group_0__2__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1153:1: rule__Attribute__Group_0__2__Impl : ( ( rule__Attribute__ValAssignment_0_2 ) ) ;
    public final void rule__Attribute__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1157:1: ( ( ( rule__Attribute__ValAssignment_0_2 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1158:1: ( ( rule__Attribute__ValAssignment_0_2 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1158:1: ( ( rule__Attribute__ValAssignment_0_2 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1159:1: ( rule__Attribute__ValAssignment_0_2 )
            {
             before(grammarAccess.getAttributeAccess().getValAssignment_0_2()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1160:1: ( rule__Attribute__ValAssignment_0_2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1160:2: rule__Attribute__ValAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Attribute__ValAssignment_0_2_in_rule__Attribute__Group_0__2__Impl2303);
            rule__Attribute__ValAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValAssignment_0_2()); 

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
    // $ANTLR end "rule__Attribute__Group_0__2__Impl"


    // $ANTLR start "rule__Attribute__Group_1__0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1176:1: rule__Attribute__Group_1__0 : rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 ;
    public final void rule__Attribute__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1180:1: ( rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1181:2: rule__Attribute__Group_1__0__Impl rule__Attribute__Group_1__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__0__Impl_in_rule__Attribute__Group_1__02339);
            rule__Attribute__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1__1_in_rule__Attribute__Group_1__02342);
            rule__Attribute__Group_1__1();

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
    // $ANTLR end "rule__Attribute__Group_1__0"


    // $ANTLR start "rule__Attribute__Group_1__0__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1188:1: rule__Attribute__Group_1__0__Impl : ( ( rule__Attribute__NameAssignment_1_0 ) ) ;
    public final void rule__Attribute__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1192:1: ( ( ( rule__Attribute__NameAssignment_1_0 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1193:1: ( ( rule__Attribute__NameAssignment_1_0 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1193:1: ( ( rule__Attribute__NameAssignment_1_0 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1194:1: ( rule__Attribute__NameAssignment_1_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1_0()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1195:1: ( rule__Attribute__NameAssignment_1_0 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1195:2: rule__Attribute__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_0_in_rule__Attribute__Group_1__0__Impl2369);
            rule__Attribute__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1_0()); 

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
    // $ANTLR end "rule__Attribute__Group_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_1__1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1205:1: rule__Attribute__Group_1__1 : rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 ;
    public final void rule__Attribute__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1209:1: ( rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1210:2: rule__Attribute__Group_1__1__Impl rule__Attribute__Group_1__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__1__Impl_in_rule__Attribute__Group_1__12399);
            rule__Attribute__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1__2_in_rule__Attribute__Group_1__12402);
            rule__Attribute__Group_1__2();

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
    // $ANTLR end "rule__Attribute__Group_1__1"


    // $ANTLR start "rule__Attribute__Group_1__1__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1217:1: rule__Attribute__Group_1__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1221:1: ( ( ':' ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1222:1: ( ':' )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1222:1: ( ':' )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1223:1: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_1_1()); 
            match(input,17,FOLLOW_17_in_rule__Attribute__Group_1__1__Impl2430); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_1_1()); 

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
    // $ANTLR end "rule__Attribute__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group_1__2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1236:1: rule__Attribute__Group_1__2 : rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 ;
    public final void rule__Attribute__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1240:1: ( rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1241:2: rule__Attribute__Group_1__2__Impl rule__Attribute__Group_1__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__2__Impl_in_rule__Attribute__Group_1__22461);
            rule__Attribute__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1__3_in_rule__Attribute__Group_1__22464);
            rule__Attribute__Group_1__3();

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
    // $ANTLR end "rule__Attribute__Group_1__2"


    // $ANTLR start "rule__Attribute__Group_1__2__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1248:1: rule__Attribute__Group_1__2__Impl : ( ( rule__Attribute__RightNameAssignment_1_2 ) ) ;
    public final void rule__Attribute__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1252:1: ( ( ( rule__Attribute__RightNameAssignment_1_2 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1253:1: ( ( rule__Attribute__RightNameAssignment_1_2 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1253:1: ( ( rule__Attribute__RightNameAssignment_1_2 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1254:1: ( rule__Attribute__RightNameAssignment_1_2 )
            {
             before(grammarAccess.getAttributeAccess().getRightNameAssignment_1_2()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1255:1: ( rule__Attribute__RightNameAssignment_1_2 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1255:2: rule__Attribute__RightNameAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Attribute__RightNameAssignment_1_2_in_rule__Attribute__Group_1__2__Impl2491);
            rule__Attribute__RightNameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getRightNameAssignment_1_2()); 

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
    // $ANTLR end "rule__Attribute__Group_1__2__Impl"


    // $ANTLR start "rule__Attribute__Group_1__3"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1265:1: rule__Attribute__Group_1__3 : rule__Attribute__Group_1__3__Impl rule__Attribute__Group_1__4 ;
    public final void rule__Attribute__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1269:1: ( rule__Attribute__Group_1__3__Impl rule__Attribute__Group_1__4 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1270:2: rule__Attribute__Group_1__3__Impl rule__Attribute__Group_1__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__3__Impl_in_rule__Attribute__Group_1__32521);
            rule__Attribute__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_1__4_in_rule__Attribute__Group_1__32524);
            rule__Attribute__Group_1__4();

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
    // $ANTLR end "rule__Attribute__Group_1__3"


    // $ANTLR start "rule__Attribute__Group_1__3__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1277:1: rule__Attribute__Group_1__3__Impl : ( '=' ) ;
    public final void rule__Attribute__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1281:1: ( ( '=' ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1282:1: ( '=' )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1282:1: ( '=' )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1283:1: '='
            {
             before(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_3()); 
            match(input,18,FOLLOW_18_in_rule__Attribute__Group_1__3__Impl2552); 
             after(grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_3()); 

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
    // $ANTLR end "rule__Attribute__Group_1__3__Impl"


    // $ANTLR start "rule__Attribute__Group_1__4"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1296:1: rule__Attribute__Group_1__4 : rule__Attribute__Group_1__4__Impl ;
    public final void rule__Attribute__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1300:1: ( rule__Attribute__Group_1__4__Impl )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1301:2: rule__Attribute__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_1__4__Impl_in_rule__Attribute__Group_1__42583);
            rule__Attribute__Group_1__4__Impl();

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
    // $ANTLR end "rule__Attribute__Group_1__4"


    // $ANTLR start "rule__Attribute__Group_1__4__Impl"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1307:1: rule__Attribute__Group_1__4__Impl : ( ( rule__Attribute__ValAssignment_1_4 ) ) ;
    public final void rule__Attribute__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1311:1: ( ( ( rule__Attribute__ValAssignment_1_4 ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1312:1: ( ( rule__Attribute__ValAssignment_1_4 ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1312:1: ( ( rule__Attribute__ValAssignment_1_4 ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1313:1: ( rule__Attribute__ValAssignment_1_4 )
            {
             before(grammarAccess.getAttributeAccess().getValAssignment_1_4()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1314:1: ( rule__Attribute__ValAssignment_1_4 )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1314:2: rule__Attribute__ValAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Attribute__ValAssignment_1_4_in_rule__Attribute__Group_1__4__Impl2610);
            rule__Attribute__ValAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValAssignment_1_4()); 

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
    // $ANTLR end "rule__Attribute__Group_1__4__Impl"


    // $ANTLR start "rule__Model__PrologAssignment_0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1335:1: rule__Model__PrologAssignment_0 : ( ruleprologTag ) ;
    public final void rule__Model__PrologAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1339:1: ( ( ruleprologTag ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1340:1: ( ruleprologTag )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1340:1: ( ruleprologTag )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1341:1: ruleprologTag
            {
             before(grammarAccess.getModelAccess().getPrologPrologTagParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleprologTag_in_rule__Model__PrologAssignment_02655);
            ruleprologTag();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPrologPrologTagParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__PrologAssignment_0"


    // $ANTLR start "rule__Model__XmldocAssignment_1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1350:1: rule__Model__XmldocAssignment_1 : ( ruleelement ) ;
    public final void rule__Model__XmldocAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1354:1: ( ( ruleelement ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1355:1: ( ruleelement )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1355:1: ( ruleelement )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1356:1: ruleelement
            {
             before(grammarAccess.getModelAccess().getXmldocElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleelement_in_rule__Model__XmldocAssignment_12686);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getXmldocElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__XmldocAssignment_1"


    // $ANTLR start "rule__Element__StartAssignment_0_0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1365:1: rule__Element__StartAssignment_0_0 : ( rulestartTag ) ;
    public final void rule__Element__StartAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1369:1: ( ( rulestartTag ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1370:1: ( rulestartTag )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1370:1: ( rulestartTag )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1371:1: rulestartTag
            {
             before(grammarAccess.getElementAccess().getStartStartTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_rulestartTag_in_rule__Element__StartAssignment_0_02717);
            rulestartTag();

            state._fsp--;

             after(grammarAccess.getElementAccess().getStartStartTagParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Element__StartAssignment_0_0"


    // $ANTLR start "rule__Element__InnerElementAssignment_0_1_0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1380:1: rule__Element__InnerElementAssignment_0_1_0 : ( ruleelement ) ;
    public final void rule__Element__InnerElementAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1384:1: ( ( ruleelement ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1385:1: ( ruleelement )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1385:1: ( ruleelement )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1386:1: ruleelement
            {
             before(grammarAccess.getElementAccess().getInnerElementElementParserRuleCall_0_1_0_0()); 
            pushFollow(FOLLOW_ruleelement_in_rule__Element__InnerElementAssignment_0_1_02748);
            ruleelement();

            state._fsp--;

             after(grammarAccess.getElementAccess().getInnerElementElementParserRuleCall_0_1_0_0()); 

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
    // $ANTLR end "rule__Element__InnerElementAssignment_0_1_0"


    // $ANTLR start "rule__Element__EndAssignment_0_2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1395:1: rule__Element__EndAssignment_0_2 : ( ruleendTag ) ;
    public final void rule__Element__EndAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1399:1: ( ( ruleendTag ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1400:1: ( ruleendTag )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1400:1: ( ruleendTag )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1401:1: ruleendTag
            {
             before(grammarAccess.getElementAccess().getEndEndTagParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleendTag_in_rule__Element__EndAssignment_0_22779);
            ruleendTag();

            state._fsp--;

             after(grammarAccess.getElementAccess().getEndEndTagParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Element__EndAssignment_0_2"


    // $ANTLR start "rule__StartTag__TagNameAssignment_1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1410:1: rule__StartTag__TagNameAssignment_1 : ( ruleTagName ) ;
    public final void rule__StartTag__TagNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1414:1: ( ( ruleTagName ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1415:1: ( ruleTagName )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1415:1: ( ruleTagName )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1416:1: ruleTagName
            {
             before(grammarAccess.getStartTagAccess().getTagNameTagNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTagName_in_rule__StartTag__TagNameAssignment_12810);
            ruleTagName();

            state._fsp--;

             after(grammarAccess.getStartTagAccess().getTagNameTagNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StartTag__TagNameAssignment_1"


    // $ANTLR start "rule__StartTag__AttributesAssignment_2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1425:1: rule__StartTag__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__StartTag__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1429:1: ( ( ruleAttribute ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1430:1: ( ruleAttribute )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1430:1: ( ruleAttribute )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1431:1: ruleAttribute
            {
             before(grammarAccess.getStartTagAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__StartTag__AttributesAssignment_22841);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getStartTagAccess().getAttributesAttributeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__StartTag__AttributesAssignment_2"


    // $ANTLR start "rule__EndTag__TagNameAssignment_1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1440:1: rule__EndTag__TagNameAssignment_1 : ( ruleTagName ) ;
    public final void rule__EndTag__TagNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1444:1: ( ( ruleTagName ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1445:1: ( ruleTagName )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1445:1: ( ruleTagName )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1446:1: ruleTagName
            {
             before(grammarAccess.getEndTagAccess().getTagNameTagNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTagName_in_rule__EndTag__TagNameAssignment_12872);
            ruleTagName();

            state._fsp--;

             after(grammarAccess.getEndTagAccess().getTagNameTagNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EndTag__TagNameAssignment_1"


    // $ANTLR start "rule__EmptyElement__TagNameAssignment_1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1455:1: rule__EmptyElement__TagNameAssignment_1 : ( ruleTagName ) ;
    public final void rule__EmptyElement__TagNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1459:1: ( ( ruleTagName ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1460:1: ( ruleTagName )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1460:1: ( ruleTagName )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1461:1: ruleTagName
            {
             before(grammarAccess.getEmptyElementAccess().getTagNameTagNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTagName_in_rule__EmptyElement__TagNameAssignment_12903);
            ruleTagName();

            state._fsp--;

             after(grammarAccess.getEmptyElementAccess().getTagNameTagNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EmptyElement__TagNameAssignment_1"


    // $ANTLR start "rule__EmptyElement__AttributesAssignment_2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1470:1: rule__EmptyElement__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__EmptyElement__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1474:1: ( ( ruleAttribute ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1475:1: ( ruleAttribute )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1475:1: ( ruleAttribute )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1476:1: ruleAttribute
            {
             before(grammarAccess.getEmptyElementAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__EmptyElement__AttributesAssignment_22934);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEmptyElementAccess().getAttributesAttributeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EmptyElement__AttributesAssignment_2"


    // $ANTLR start "rule__PrologTag__NameAssignment_1"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1485:1: rule__PrologTag__NameAssignment_1 : ( ( 'xml' ) ) ;
    public final void rule__PrologTag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1489:1: ( ( ( 'xml' ) ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1490:1: ( ( 'xml' ) )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1490:1: ( ( 'xml' ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1491:1: ( 'xml' )
            {
             before(grammarAccess.getPrologTagAccess().getNameXmlKeyword_1_0()); 
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1492:1: ( 'xml' )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1493:1: 'xml'
            {
             before(grammarAccess.getPrologTagAccess().getNameXmlKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__PrologTag__NameAssignment_12970); 
             after(grammarAccess.getPrologTagAccess().getNameXmlKeyword_1_0()); 

            }

             after(grammarAccess.getPrologTagAccess().getNameXmlKeyword_1_0()); 

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
    // $ANTLR end "rule__PrologTag__NameAssignment_1"


    // $ANTLR start "rule__PrologTag__AttributesAssignment_2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1508:1: rule__PrologTag__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__PrologTag__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1512:1: ( ( ruleAttribute ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1513:1: ( ruleAttribute )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1513:1: ( ruleAttribute )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1514:1: ruleAttribute
            {
             before(grammarAccess.getPrologTagAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__PrologTag__AttributesAssignment_23009);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getPrologTagAccess().getAttributesAttributeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PrologTag__AttributesAssignment_2"


    // $ANTLR start "rule__TagName__NameAssignment_0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1523:1: rule__TagName__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TagName__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1527:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1528:1: ( RULE_ID )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1528:1: ( RULE_ID )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1529:1: RULE_ID
            {
             before(grammarAccess.getTagNameAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TagName__NameAssignment_03040); 
             after(grammarAccess.getTagNameAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__TagName__NameAssignment_0"


    // $ANTLR start "rule__TagName__NameAssignment_1_0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1538:1: rule__TagName__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__TagName__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1542:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1543:1: ( RULE_ID )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1543:1: ( RULE_ID )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1544:1: RULE_ID
            {
             before(grammarAccess.getTagNameAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TagName__NameAssignment_1_03071); 
             after(grammarAccess.getTagNameAccess().getNameIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__TagName__NameAssignment_1_0"


    // $ANTLR start "rule__TagName__RightNameAssignment_1_2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1553:1: rule__TagName__RightNameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__TagName__RightNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1557:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1558:1: ( RULE_ID )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1558:1: ( RULE_ID )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1559:1: RULE_ID
            {
             before(grammarAccess.getTagNameAccess().getRightNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TagName__RightNameAssignment_1_23102); 
             after(grammarAccess.getTagNameAccess().getRightNameIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__TagName__RightNameAssignment_1_2"


    // $ANTLR start "rule__Attribute__NameAssignment_0_0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1568:1: rule__Attribute__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1572:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1573:1: ( RULE_ID )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1573:1: ( RULE_ID )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1574:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_0_03133); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_0_0"


    // $ANTLR start "rule__Attribute__ValAssignment_0_2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1583:1: rule__Attribute__ValAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1587:1: ( ( RULE_STRING ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1588:1: ( RULE_STRING )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1588:1: ( RULE_STRING )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1589:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ValAssignment_0_23164); 
             after(grammarAccess.getAttributeAccess().getValSTRINGTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Attribute__ValAssignment_0_2"


    // $ANTLR start "rule__Attribute__NameAssignment_1_0"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1598:1: rule__Attribute__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1602:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1603:1: ( RULE_ID )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1603:1: ( RULE_ID )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1604:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_1_03195); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1_0"


    // $ANTLR start "rule__Attribute__RightNameAssignment_1_2"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1613:1: rule__Attribute__RightNameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Attribute__RightNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1617:1: ( ( RULE_ID ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1618:1: ( RULE_ID )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1618:1: ( RULE_ID )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1619:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getRightNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__RightNameAssignment_1_23226); 
             after(grammarAccess.getAttributeAccess().getRightNameIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Attribute__RightNameAssignment_1_2"


    // $ANTLR start "rule__Attribute__ValAssignment_1_4"
    // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1628:1: rule__Attribute__ValAssignment_1_4 : ( RULE_STRING ) ;
    public final void rule__Attribute__ValAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1632:1: ( ( RULE_STRING ) )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1633:1: ( RULE_STRING )
            {
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1633:1: ( RULE_STRING )
            // ../org.xtext.passi.DocGen.ui/src-gen/org/xtext/passi/ui/contentassist/antlr/internal/InternalDocGen.g:1634:1: RULE_STRING
            {
             before(grammarAccess.getAttributeAccess().getValSTRINGTerminalRuleCall_1_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__ValAssignment_1_43257); 
             after(grammarAccess.getAttributeAccess().getValSTRINGTerminalRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__Attribute__ValAssignment_1_4"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\16\uffff";
    static final String DFA1_eofS =
        "\16\uffff";
    static final String DFA1_minS =
        "\1\5\2\4\1\21\1\uffff\1\4\1\uffff\1\4\1\13\1\4\1\22\1\4\1\13\1"+
        "\4";
    static final String DFA1_maxS =
        "\1\5\1\4\1\21\1\22\1\uffff\1\4\1\uffff\1\4\1\13\1\10\1\22\1\10"+
        "\1\13\1\10";
    static final String DFA1_acceptS =
        "\4\uffff\1\2\1\uffff\1\1\7\uffff";
    static final String DFA1_specialS =
        "\16\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\uffff\1\6\1\uffff\1\4\10\uffff\1\5",
            "\1\7\1\10",
            "",
            "\1\11",
            "",
            "\1\12",
            "\1\13",
            "\1\3\1\uffff\1\6\1\uffff\1\4",
            "\1\14",
            "\1\3\1\uffff\1\6\1\uffff\1\4",
            "\1\15",
            "\1\3\1\uffff\1\6\1\uffff\1\4"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "284:1: rule__Element__Alternatives : ( ( ( rule__Element__Group_0__0 ) ) | ( ruleemptyElement ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_in_entryRuleelement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleelement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestartTag_in_entryRulestartTag181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestartTag188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartTag__Group__0_in_rulestartTag214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendTag_in_entryRuleendTag241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendTag248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndTag__Group__0_in_ruleendTag274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleemptyElement_in_entryRuleemptyElement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleemptyElement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElement__Group__0_in_ruleemptyElement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprologTag_in_entryRuleprologTag361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprologTag368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologTag__Group__0_in_ruleprologTag394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagName_in_entryRuleTagName421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagName428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagName__Alternatives_in_ruleTagName454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_in_ruleAttribute514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_0__0_in_rule__Element__Alternatives550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleemptyElement_in_rule__Element__Alternatives568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__InnerElementAssignment_0_1_0_in_rule__Element__Alternatives_0_1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Element__Alternatives_0_1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagName__NameAssignment_0_in_rule__TagName__Alternatives650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagName__Group_1__0_in_rule__TagName__Alternatives668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_0__0_in_rule__Attribute__Alternatives701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__0_in_rule__Attribute__Alternatives719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PrologAssignment_0_in_rule__Model__Group__0__Impl780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__XmldocAssignment_1_in_rule__Model__Group__1__Impl837 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Element__Group_0__0__Impl_in_rule__Element__Group_0__0872 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_rule__Element__Group_0__1_in_rule__Element__Group_0__0875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__StartAssignment_0_0_in_rule__Element__Group_0__0__Impl902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Group_0__1__Impl_in_rule__Element__Group_0__1932 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_rule__Element__Group_0__2_in_rule__Element__Group_0__1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_0_1_in_rule__Element__Group_0__1__Impl962 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Element__Group_0__2__Impl_in_rule__Element__Group_0__2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__EndAssignment_0_2_in_rule__Element__Group_0__2__Impl1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartTag__Group__0__Impl_in_rule__StartTag__Group__01056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StartTag__Group__1_in_rule__StartTag__Group__01059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_START_OPEN_in_rule__StartTag__Group__0__Impl1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartTag__Group__1__Impl_in_rule__StartTag__Group__11115 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__StartTag__Group__2_in_rule__StartTag__Group__11118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartTag__TagNameAssignment_1_in_rule__StartTag__Group__1__Impl1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartTag__Group__2__Impl_in_rule__StartTag__Group__21175 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__StartTag__Group__3_in_rule__StartTag__Group__21178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StartTag__AttributesAssignment_2_in_rule__StartTag__Group__2__Impl1205 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__StartTag__Group__3__Impl_in_rule__StartTag__Group__31236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_in_rule__StartTag__Group__3__Impl1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndTag__Group__0__Impl_in_rule__EndTag__Group__01300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EndTag__Group__1_in_rule__EndTag__Group__01303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_OPEN_in_rule__EndTag__Group__0__Impl1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndTag__Group__1__Impl_in_rule__EndTag__Group__11359 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EndTag__Group__2_in_rule__EndTag__Group__11362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndTag__TagNameAssignment_1_in_rule__EndTag__Group__1__Impl1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndTag__Group__2__Impl_in_rule__EndTag__Group__21419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_in_rule__EndTag__Group__2__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElement__Group__0__Impl_in_rule__EmptyElement__Group__01481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__EmptyElement__Group__1_in_rule__EmptyElement__Group__01484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_START_OPEN_in_rule__EmptyElement__Group__0__Impl1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElement__Group__1__Impl_in_rule__EmptyElement__Group__11540 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_rule__EmptyElement__Group__2_in_rule__EmptyElement__Group__11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElement__TagNameAssignment_1_in_rule__EmptyElement__Group__1__Impl1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElement__Group__2__Impl_in_rule__EmptyElement__Group__21600 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_rule__EmptyElement__Group__3_in_rule__EmptyElement__Group__21603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EmptyElement__AttributesAssignment_2_in_rule__EmptyElement__Group__2__Impl1630 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__EmptyElement__Group__3__Impl_in_rule__EmptyElement__Group__31661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_EMPTY_CLOSE_in_rule__EmptyElement__Group__3__Impl1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologTag__Group__0__Impl_in_rule__PrologTag__Group__01725 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PrologTag__Group__1_in_rule__PrologTag__Group__01728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROLOG_START_in_rule__PrologTag__Group__0__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologTag__Group__1__Impl_in_rule__PrologTag__Group__11784 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__PrologTag__Group__2_in_rule__PrologTag__Group__11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologTag__NameAssignment_1_in_rule__PrologTag__Group__1__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologTag__Group__2__Impl_in_rule__PrologTag__Group__21844 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_rule__PrologTag__Group__3_in_rule__PrologTag__Group__21847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrologTag__AttributesAssignment_2_in_rule__PrologTag__Group__2__Impl1874 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__PrologTag__Group__3__Impl_in_rule__PrologTag__Group__31905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROLOG_END_in_rule__PrologTag__Group__3__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagName__Group_1__0__Impl_in_rule__TagName__Group_1__01969 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TagName__Group_1__1_in_rule__TagName__Group_1__01972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagName__NameAssignment_1_0_in_rule__TagName__Group_1__0__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagName__Group_1__1__Impl_in_rule__TagName__Group_1__12029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TagName__Group_1__2_in_rule__TagName__Group_1__12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TagName__Group_1__1__Impl2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagName__Group_1__2__Impl_in_rule__TagName__Group_1__22091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagName__RightNameAssignment_1_2_in_rule__TagName__Group_1__2__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_0__0__Impl_in_rule__Attribute__Group_0__02154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_0__1_in_rule__Attribute__Group_0__02157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_0_0_in_rule__Attribute__Group_0__0__Impl2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_0__1__Impl_in_rule__Attribute__Group_0__12214 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Attribute__Group_0__2_in_rule__Attribute__Group_0__12217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Attribute__Group_0__1__Impl2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_0__2__Impl_in_rule__Attribute__Group_0__22276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValAssignment_0_2_in_rule__Attribute__Group_0__2__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__0__Impl_in_rule__Attribute__Group_1__02339 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__1_in_rule__Attribute__Group_1__02342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_0_in_rule__Attribute__Group_1__0__Impl2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__1__Impl_in_rule__Attribute__Group_1__12399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__2_in_rule__Attribute__Group_1__12402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attribute__Group_1__1__Impl2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__2__Impl_in_rule__Attribute__Group_1__22461 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__3_in_rule__Attribute__Group_1__22464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__RightNameAssignment_1_2_in_rule__Attribute__Group_1__2__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__3__Impl_in_rule__Attribute__Group_1__32521 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__4_in_rule__Attribute__Group_1__32524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Attribute__Group_1__3__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_1__4__Impl_in_rule__Attribute__Group_1__42583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValAssignment_1_4_in_rule__Attribute__Group_1__4__Impl2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprologTag_in_rule__Model__PrologAssignment_02655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_in_rule__Model__XmldocAssignment_12686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestartTag_in_rule__Element__StartAssignment_0_02717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelement_in_rule__Element__InnerElementAssignment_0_1_02748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendTag_in_rule__Element__EndAssignment_0_22779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagName_in_rule__StartTag__TagNameAssignment_12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__StartTag__AttributesAssignment_22841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagName_in_rule__EndTag__TagNameAssignment_12872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagName_in_rule__EmptyElement__TagNameAssignment_12903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__EmptyElement__AttributesAssignment_22934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrologTag__NameAssignment_12970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__PrologTag__AttributesAssignment_23009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TagName__NameAssignment_03040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TagName__NameAssignment_1_03071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TagName__RightNameAssignment_1_23102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_0_03133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ValAssignment_0_23164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_1_03195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__RightNameAssignment_1_23226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__ValAssignment_1_43257 = new BitSet(new long[]{0x0000000000000002L});

}