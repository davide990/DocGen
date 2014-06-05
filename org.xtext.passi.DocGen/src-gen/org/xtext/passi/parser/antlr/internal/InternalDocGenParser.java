package org.xtext.passi.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.passi.services.DocGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDocGenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_TAG_START_OPEN", "RULE_TAG_CLOSE", "RULE_TAG_END_OPEN", "RULE_TAG_EMPTY_CLOSE", "RULE_PROLOG_START", "RULE_PROLOG_END", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'xml'", "':'", "'='"
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
    public String getGrammarFileName() { return "../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g"; }



     	private DocGenGrammarAccess grammarAccess;
     	
        public InternalDocGenParser(TokenStream input, DocGenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected DocGenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_prolog_0_0= ruleprologTag ) ) ( (lv_xmldoc_1_0= ruleelement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_prolog_0_0 = null;

        EObject lv_xmldoc_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:79:28: ( ( ( (lv_prolog_0_0= ruleprologTag ) ) ( (lv_xmldoc_1_0= ruleelement ) )* ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:80:1: ( ( (lv_prolog_0_0= ruleprologTag ) ) ( (lv_xmldoc_1_0= ruleelement ) )* )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:80:1: ( ( (lv_prolog_0_0= ruleprologTag ) ) ( (lv_xmldoc_1_0= ruleelement ) )* )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:80:2: ( (lv_prolog_0_0= ruleprologTag ) ) ( (lv_xmldoc_1_0= ruleelement ) )*
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:80:2: ( (lv_prolog_0_0= ruleprologTag ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:81:1: (lv_prolog_0_0= ruleprologTag )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:81:1: (lv_prolog_0_0= ruleprologTag )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:82:3: lv_prolog_0_0= ruleprologTag
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getPrologPrologTagParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleprologTag_in_ruleModel131);
            lv_prolog_0_0=ruleprologTag();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"prolog",
                    		lv_prolog_0_0, 
                    		"prologTag");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:98:2: ( (lv_xmldoc_1_0= ruleelement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TAG_START_OPEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:99:1: (lv_xmldoc_1_0= ruleelement )
            	    {
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:99:1: (lv_xmldoc_1_0= ruleelement )
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:100:3: lv_xmldoc_1_0= ruleelement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getXmldocElementParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleelement_in_ruleModel152);
            	    lv_xmldoc_1_0=ruleelement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"xmldoc",
            	            		lv_xmldoc_1_0, 
            	            		"element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleelement"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:124:1: entryRuleelement returns [EObject current=null] : iv_ruleelement= ruleelement EOF ;
    public final EObject entryRuleelement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleelement = null;


        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:125:2: (iv_ruleelement= ruleelement EOF )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:126:2: iv_ruleelement= ruleelement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleelement_in_entryRuleelement189);
            iv_ruleelement=ruleelement();

            state._fsp--;

             current =iv_ruleelement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelement199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleelement"


    // $ANTLR start "ruleelement"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:133:1: ruleelement returns [EObject current=null] : ( ( ( (lv_Start_0_0= rulestartTag ) ) ( ( (lv_innerElement_1_0= ruleelement ) ) | this_ID_2= RULE_ID )* ( (lv_End_3_0= ruleendTag ) ) ) | this_emptyElement_4= ruleemptyElement ) ;
    public final EObject ruleelement() throws RecognitionException {
        EObject current = null;

        Token this_ID_2=null;
        EObject lv_Start_0_0 = null;

        EObject lv_innerElement_1_0 = null;

        EObject lv_End_3_0 = null;

        EObject this_emptyElement_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:136:28: ( ( ( ( (lv_Start_0_0= rulestartTag ) ) ( ( (lv_innerElement_1_0= ruleelement ) ) | this_ID_2= RULE_ID )* ( (lv_End_3_0= ruleendTag ) ) ) | this_emptyElement_4= ruleemptyElement ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:137:1: ( ( ( (lv_Start_0_0= rulestartTag ) ) ( ( (lv_innerElement_1_0= ruleelement ) ) | this_ID_2= RULE_ID )* ( (lv_End_3_0= ruleendTag ) ) ) | this_emptyElement_4= ruleemptyElement )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:137:1: ( ( ( (lv_Start_0_0= rulestartTag ) ) ( ( (lv_innerElement_1_0= ruleelement ) ) | this_ID_2= RULE_ID )* ( (lv_End_3_0= ruleendTag ) ) ) | this_emptyElement_4= ruleemptyElement )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:137:2: ( ( (lv_Start_0_0= rulestartTag ) ) ( ( (lv_innerElement_1_0= ruleelement ) ) | this_ID_2= RULE_ID )* ( (lv_End_3_0= ruleendTag ) ) )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:137:2: ( ( (lv_Start_0_0= rulestartTag ) ) ( ( (lv_innerElement_1_0= ruleelement ) ) | this_ID_2= RULE_ID )* ( (lv_End_3_0= ruleendTag ) ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:137:3: ( (lv_Start_0_0= rulestartTag ) ) ( ( (lv_innerElement_1_0= ruleelement ) ) | this_ID_2= RULE_ID )* ( (lv_End_3_0= ruleendTag ) )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:137:3: ( (lv_Start_0_0= rulestartTag ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:138:1: (lv_Start_0_0= rulestartTag )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:138:1: (lv_Start_0_0= rulestartTag )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:139:3: lv_Start_0_0= rulestartTag
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getStartStartTagParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulestartTag_in_ruleelement246);
                    lv_Start_0_0=rulestartTag();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	        }
                           		set(
                           			current, 
                           			"Start",
                            		lv_Start_0_0, 
                            		"startTag");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:155:2: ( ( (lv_innerElement_1_0= ruleelement ) ) | this_ID_2= RULE_ID )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_TAG_START_OPEN) ) {
                            alt2=1;
                        }
                        else if ( (LA2_0==RULE_ID) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:155:3: ( (lv_innerElement_1_0= ruleelement ) )
                    	    {
                    	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:155:3: ( (lv_innerElement_1_0= ruleelement ) )
                    	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:156:1: (lv_innerElement_1_0= ruleelement )
                    	    {
                    	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:156:1: (lv_innerElement_1_0= ruleelement )
                    	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:157:3: lv_innerElement_1_0= ruleelement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementAccess().getInnerElementElementParserRuleCall_0_1_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleelement_in_ruleelement268);
                    	    lv_innerElement_1_0=ruleelement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"innerElement",
                    	            		lv_innerElement_1_0, 
                    	            		"element");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:174:6: this_ID_2= RULE_ID
                    	    {
                    	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleelement285); 
                    	     
                    	        newLeafNode(this_ID_2, grammarAccess.getElementAccess().getIDTerminalRuleCall_0_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:178:3: ( (lv_End_3_0= ruleendTag ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:179:1: (lv_End_3_0= ruleendTag )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:179:1: (lv_End_3_0= ruleendTag )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:180:3: lv_End_3_0= ruleendTag
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementAccess().getEndEndTagParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleendTag_in_ruleelement307);
                    lv_End_3_0=ruleendTag();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementRule());
                    	        }
                           		set(
                           			current, 
                           			"End",
                            		lv_End_3_0, 
                            		"endTag");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:198:5: this_emptyElement_4= ruleemptyElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getEmptyElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleemptyElement_in_ruleelement336);
                    this_emptyElement_4=ruleemptyElement();

                    state._fsp--;

                     
                            current = this_emptyElement_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleelement"


    // $ANTLR start "entryRulestartTag"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:214:1: entryRulestartTag returns [EObject current=null] : iv_rulestartTag= rulestartTag EOF ;
    public final EObject entryRulestartTag() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestartTag = null;


        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:215:2: (iv_rulestartTag= rulestartTag EOF )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:216:2: iv_rulestartTag= rulestartTag EOF
            {
             newCompositeNode(grammarAccess.getStartTagRule()); 
            pushFollow(FOLLOW_rulestartTag_in_entryRulestartTag371);
            iv_rulestartTag=rulestartTag();

            state._fsp--;

             current =iv_rulestartTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRulestartTag381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestartTag"


    // $ANTLR start "rulestartTag"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:223:1: rulestartTag returns [EObject current=null] : (this_TAG_START_OPEN_0= RULE_TAG_START_OPEN ( (lv_tagName_1_0= ruleTagName ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_TAG_CLOSE_3= RULE_TAG_CLOSE ) ;
    public final EObject rulestartTag() throws RecognitionException {
        EObject current = null;

        Token this_TAG_START_OPEN_0=null;
        Token this_TAG_CLOSE_3=null;
        EObject lv_tagName_1_0 = null;

        EObject lv_Attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:226:28: ( (this_TAG_START_OPEN_0= RULE_TAG_START_OPEN ( (lv_tagName_1_0= ruleTagName ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_TAG_CLOSE_3= RULE_TAG_CLOSE ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:227:1: (this_TAG_START_OPEN_0= RULE_TAG_START_OPEN ( (lv_tagName_1_0= ruleTagName ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_TAG_CLOSE_3= RULE_TAG_CLOSE )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:227:1: (this_TAG_START_OPEN_0= RULE_TAG_START_OPEN ( (lv_tagName_1_0= ruleTagName ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_TAG_CLOSE_3= RULE_TAG_CLOSE )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:227:2: this_TAG_START_OPEN_0= RULE_TAG_START_OPEN ( (lv_tagName_1_0= ruleTagName ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_TAG_CLOSE_3= RULE_TAG_CLOSE
            {
            this_TAG_START_OPEN_0=(Token)match(input,RULE_TAG_START_OPEN,FOLLOW_RULE_TAG_START_OPEN_in_rulestartTag417); 
             
                newLeafNode(this_TAG_START_OPEN_0, grammarAccess.getStartTagAccess().getTAG_START_OPENTerminalRuleCall_0()); 
                
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:231:1: ( (lv_tagName_1_0= ruleTagName ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:232:1: (lv_tagName_1_0= ruleTagName )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:232:1: (lv_tagName_1_0= ruleTagName )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:233:3: lv_tagName_1_0= ruleTagName
            {
             
            	        newCompositeNode(grammarAccess.getStartTagAccess().getTagNameTagNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTagName_in_rulestartTag437);
            lv_tagName_1_0=ruleTagName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStartTagRule());
            	        }
                   		set(
                   			current, 
                   			"tagName",
                    		lv_tagName_1_0, 
                    		"TagName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:249:2: ( (lv_Attributes_2_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:250:1: (lv_Attributes_2_0= ruleAttribute )
            	    {
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:250:1: (lv_Attributes_2_0= ruleAttribute )
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:251:3: lv_Attributes_2_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStartTagAccess().getAttributesAttributeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_rulestartTag458);
            	    lv_Attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStartTagRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Attributes",
            	            		lv_Attributes_2_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            this_TAG_CLOSE_3=(Token)match(input,RULE_TAG_CLOSE,FOLLOW_RULE_TAG_CLOSE_in_rulestartTag470); 
             
                newLeafNode(this_TAG_CLOSE_3, grammarAccess.getStartTagAccess().getTAG_CLOSETerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestartTag"


    // $ANTLR start "entryRuleendTag"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:279:1: entryRuleendTag returns [EObject current=null] : iv_ruleendTag= ruleendTag EOF ;
    public final EObject entryRuleendTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleendTag = null;


        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:280:2: (iv_ruleendTag= ruleendTag EOF )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:281:2: iv_ruleendTag= ruleendTag EOF
            {
             newCompositeNode(grammarAccess.getEndTagRule()); 
            pushFollow(FOLLOW_ruleendTag_in_entryRuleendTag505);
            iv_ruleendTag=ruleendTag();

            state._fsp--;

             current =iv_ruleendTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleendTag515); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleendTag"


    // $ANTLR start "ruleendTag"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:288:1: ruleendTag returns [EObject current=null] : (this_TAG_END_OPEN_0= RULE_TAG_END_OPEN ( (lv_tagName_1_0= ruleTagName ) ) this_TAG_CLOSE_2= RULE_TAG_CLOSE ) ;
    public final EObject ruleendTag() throws RecognitionException {
        EObject current = null;

        Token this_TAG_END_OPEN_0=null;
        Token this_TAG_CLOSE_2=null;
        EObject lv_tagName_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:291:28: ( (this_TAG_END_OPEN_0= RULE_TAG_END_OPEN ( (lv_tagName_1_0= ruleTagName ) ) this_TAG_CLOSE_2= RULE_TAG_CLOSE ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:292:1: (this_TAG_END_OPEN_0= RULE_TAG_END_OPEN ( (lv_tagName_1_0= ruleTagName ) ) this_TAG_CLOSE_2= RULE_TAG_CLOSE )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:292:1: (this_TAG_END_OPEN_0= RULE_TAG_END_OPEN ( (lv_tagName_1_0= ruleTagName ) ) this_TAG_CLOSE_2= RULE_TAG_CLOSE )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:292:2: this_TAG_END_OPEN_0= RULE_TAG_END_OPEN ( (lv_tagName_1_0= ruleTagName ) ) this_TAG_CLOSE_2= RULE_TAG_CLOSE
            {
            this_TAG_END_OPEN_0=(Token)match(input,RULE_TAG_END_OPEN,FOLLOW_RULE_TAG_END_OPEN_in_ruleendTag551); 
             
                newLeafNode(this_TAG_END_OPEN_0, grammarAccess.getEndTagAccess().getTAG_END_OPENTerminalRuleCall_0()); 
                
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:296:1: ( (lv_tagName_1_0= ruleTagName ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:297:1: (lv_tagName_1_0= ruleTagName )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:297:1: (lv_tagName_1_0= ruleTagName )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:298:3: lv_tagName_1_0= ruleTagName
            {
             
            	        newCompositeNode(grammarAccess.getEndTagAccess().getTagNameTagNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTagName_in_ruleendTag571);
            lv_tagName_1_0=ruleTagName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEndTagRule());
            	        }
                   		set(
                   			current, 
                   			"tagName",
                    		lv_tagName_1_0, 
                    		"TagName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            this_TAG_CLOSE_2=(Token)match(input,RULE_TAG_CLOSE,FOLLOW_RULE_TAG_CLOSE_in_ruleendTag582); 
             
                newLeafNode(this_TAG_CLOSE_2, grammarAccess.getEndTagAccess().getTAG_CLOSETerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleendTag"


    // $ANTLR start "entryRuleemptyElement"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:326:1: entryRuleemptyElement returns [EObject current=null] : iv_ruleemptyElement= ruleemptyElement EOF ;
    public final EObject entryRuleemptyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleemptyElement = null;


        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:327:2: (iv_ruleemptyElement= ruleemptyElement EOF )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:328:2: iv_ruleemptyElement= ruleemptyElement EOF
            {
             newCompositeNode(grammarAccess.getEmptyElementRule()); 
            pushFollow(FOLLOW_ruleemptyElement_in_entryRuleemptyElement617);
            iv_ruleemptyElement=ruleemptyElement();

            state._fsp--;

             current =iv_ruleemptyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleemptyElement627); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleemptyElement"


    // $ANTLR start "ruleemptyElement"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:335:1: ruleemptyElement returns [EObject current=null] : (this_TAG_START_OPEN_0= RULE_TAG_START_OPEN ( (lv_tagName_1_0= ruleTagName ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_TAG_EMPTY_CLOSE_3= RULE_TAG_EMPTY_CLOSE ) ;
    public final EObject ruleemptyElement() throws RecognitionException {
        EObject current = null;

        Token this_TAG_START_OPEN_0=null;
        Token this_TAG_EMPTY_CLOSE_3=null;
        EObject lv_tagName_1_0 = null;

        EObject lv_Attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:338:28: ( (this_TAG_START_OPEN_0= RULE_TAG_START_OPEN ( (lv_tagName_1_0= ruleTagName ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_TAG_EMPTY_CLOSE_3= RULE_TAG_EMPTY_CLOSE ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:339:1: (this_TAG_START_OPEN_0= RULE_TAG_START_OPEN ( (lv_tagName_1_0= ruleTagName ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_TAG_EMPTY_CLOSE_3= RULE_TAG_EMPTY_CLOSE )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:339:1: (this_TAG_START_OPEN_0= RULE_TAG_START_OPEN ( (lv_tagName_1_0= ruleTagName ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_TAG_EMPTY_CLOSE_3= RULE_TAG_EMPTY_CLOSE )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:339:2: this_TAG_START_OPEN_0= RULE_TAG_START_OPEN ( (lv_tagName_1_0= ruleTagName ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_TAG_EMPTY_CLOSE_3= RULE_TAG_EMPTY_CLOSE
            {
            this_TAG_START_OPEN_0=(Token)match(input,RULE_TAG_START_OPEN,FOLLOW_RULE_TAG_START_OPEN_in_ruleemptyElement663); 
             
                newLeafNode(this_TAG_START_OPEN_0, grammarAccess.getEmptyElementAccess().getTAG_START_OPENTerminalRuleCall_0()); 
                
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:343:1: ( (lv_tagName_1_0= ruleTagName ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:344:1: (lv_tagName_1_0= ruleTagName )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:344:1: (lv_tagName_1_0= ruleTagName )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:345:3: lv_tagName_1_0= ruleTagName
            {
             
            	        newCompositeNode(grammarAccess.getEmptyElementAccess().getTagNameTagNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTagName_in_ruleemptyElement683);
            lv_tagName_1_0=ruleTagName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEmptyElementRule());
            	        }
                   		set(
                   			current, 
                   			"tagName",
                    		lv_tagName_1_0, 
                    		"TagName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:361:2: ( (lv_Attributes_2_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:362:1: (lv_Attributes_2_0= ruleAttribute )
            	    {
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:362:1: (lv_Attributes_2_0= ruleAttribute )
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:363:3: lv_Attributes_2_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEmptyElementAccess().getAttributesAttributeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleemptyElement704);
            	    lv_Attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEmptyElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Attributes",
            	            		lv_Attributes_2_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_TAG_EMPTY_CLOSE_3=(Token)match(input,RULE_TAG_EMPTY_CLOSE,FOLLOW_RULE_TAG_EMPTY_CLOSE_in_ruleemptyElement716); 
             
                newLeafNode(this_TAG_EMPTY_CLOSE_3, grammarAccess.getEmptyElementAccess().getTAG_EMPTY_CLOSETerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleemptyElement"


    // $ANTLR start "entryRuleprologTag"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:391:1: entryRuleprologTag returns [EObject current=null] : iv_ruleprologTag= ruleprologTag EOF ;
    public final EObject entryRuleprologTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleprologTag = null;


        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:392:2: (iv_ruleprologTag= ruleprologTag EOF )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:393:2: iv_ruleprologTag= ruleprologTag EOF
            {
             newCompositeNode(grammarAccess.getPrologTagRule()); 
            pushFollow(FOLLOW_ruleprologTag_in_entryRuleprologTag751);
            iv_ruleprologTag=ruleprologTag();

            state._fsp--;

             current =iv_ruleprologTag; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleprologTag761); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleprologTag"


    // $ANTLR start "ruleprologTag"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:400:1: ruleprologTag returns [EObject current=null] : (this_PROLOG_START_0= RULE_PROLOG_START ( (lv_name_1_0= 'xml' ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_PROLOG_END_3= RULE_PROLOG_END ) ;
    public final EObject ruleprologTag() throws RecognitionException {
        EObject current = null;

        Token this_PROLOG_START_0=null;
        Token lv_name_1_0=null;
        Token this_PROLOG_END_3=null;
        EObject lv_Attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:403:28: ( (this_PROLOG_START_0= RULE_PROLOG_START ( (lv_name_1_0= 'xml' ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_PROLOG_END_3= RULE_PROLOG_END ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:404:1: (this_PROLOG_START_0= RULE_PROLOG_START ( (lv_name_1_0= 'xml' ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_PROLOG_END_3= RULE_PROLOG_END )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:404:1: (this_PROLOG_START_0= RULE_PROLOG_START ( (lv_name_1_0= 'xml' ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_PROLOG_END_3= RULE_PROLOG_END )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:404:2: this_PROLOG_START_0= RULE_PROLOG_START ( (lv_name_1_0= 'xml' ) ) ( (lv_Attributes_2_0= ruleAttribute ) )* this_PROLOG_END_3= RULE_PROLOG_END
            {
            this_PROLOG_START_0=(Token)match(input,RULE_PROLOG_START,FOLLOW_RULE_PROLOG_START_in_ruleprologTag797); 
             
                newLeafNode(this_PROLOG_START_0, grammarAccess.getPrologTagAccess().getPROLOG_STARTTerminalRuleCall_0()); 
                
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:408:1: ( (lv_name_1_0= 'xml' ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:409:1: (lv_name_1_0= 'xml' )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:409:1: (lv_name_1_0= 'xml' )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:410:3: lv_name_1_0= 'xml'
            {
            lv_name_1_0=(Token)match(input,17,FOLLOW_17_in_ruleprologTag814); 

                    newLeafNode(lv_name_1_0, grammarAccess.getPrologTagAccess().getNameXmlKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPrologTagRule());
            	        }
                   		setWithLastConsumed(current, "name", lv_name_1_0, "xml");
            	    

            }


            }

            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:423:2: ( (lv_Attributes_2_0= ruleAttribute ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:424:1: (lv_Attributes_2_0= ruleAttribute )
            	    {
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:424:1: (lv_Attributes_2_0= ruleAttribute )
            	    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:425:3: lv_Attributes_2_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPrologTagAccess().getAttributesAttributeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleprologTag848);
            	    lv_Attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPrologTagRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Attributes",
            	            		lv_Attributes_2_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            this_PROLOG_END_3=(Token)match(input,RULE_PROLOG_END,FOLLOW_RULE_PROLOG_END_in_ruleprologTag860); 
             
                newLeafNode(this_PROLOG_END_3, grammarAccess.getPrologTagAccess().getPROLOG_ENDTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleprologTag"


    // $ANTLR start "entryRuleTagName"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:453:1: entryRuleTagName returns [EObject current=null] : iv_ruleTagName= ruleTagName EOF ;
    public final EObject entryRuleTagName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTagName = null;


        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:454:2: (iv_ruleTagName= ruleTagName EOF )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:455:2: iv_ruleTagName= ruleTagName EOF
            {
             newCompositeNode(grammarAccess.getTagNameRule()); 
            pushFollow(FOLLOW_ruleTagName_in_entryRuleTagName895);
            iv_ruleTagName=ruleTagName();

            state._fsp--;

             current =iv_ruleTagName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagName905); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTagName"


    // $ANTLR start "ruleTagName"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:462:1: ruleTagName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rightName_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleTagName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_rightName_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:465:28: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rightName_3_0= RULE_ID ) ) ) ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:466:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rightName_3_0= RULE_ID ) ) ) )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:466:1: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rightName_3_0= RULE_ID ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==18) ) {
                    alt7=2;
                }
                else if ( (LA7_1==EOF||LA7_1==RULE_ID||LA7_1==RULE_TAG_CLOSE||LA7_1==RULE_TAG_EMPTY_CLOSE) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:466:2: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:466:2: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:467:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:467:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:468:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTagName947); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getTagNameAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTagNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:485:6: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rightName_3_0= RULE_ID ) ) )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:485:6: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rightName_3_0= RULE_ID ) ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:485:7: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_rightName_3_0= RULE_ID ) )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:485:7: ( (lv_name_1_0= RULE_ID ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:486:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:486:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:487:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTagName976); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getTagNameAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTagNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleTagName993); 

                        	newLeafNode(otherlv_2, grammarAccess.getTagNameAccess().getColonKeyword_1_1());
                        
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:507:1: ( (lv_rightName_3_0= RULE_ID ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:508:1: (lv_rightName_3_0= RULE_ID )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:508:1: (lv_rightName_3_0= RULE_ID )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:509:3: lv_rightName_3_0= RULE_ID
                    {
                    lv_rightName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTagName1010); 

                    			newLeafNode(lv_rightName_3_0, grammarAccess.getTagNameAccess().getRightNameIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTagNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rightName",
                            		lv_rightName_3_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTagName"


    // $ANTLR start "entryRuleAttribute"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:533:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:534:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:535:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1052);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1062); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:542:1: ruleAttribute returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= RULE_STRING ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_rightName_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_val_7_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_val_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_rightName_5_0=null;
        Token otherlv_6=null;
        Token lv_val_7_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:545:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= RULE_STRING ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_rightName_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_val_7_0= RULE_STRING ) ) ) ) )
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:546:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= RULE_STRING ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_rightName_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_val_7_0= RULE_STRING ) ) ) )
            {
            // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:546:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= RULE_STRING ) ) ) | ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_rightName_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_val_7_0= RULE_STRING ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==19) ) {
                    alt8=1;
                }
                else if ( (LA8_1==18) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:546:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= RULE_STRING ) ) )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:546:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= RULE_STRING ) ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:546:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_val_2_0= RULE_STRING ) )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:546:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:547:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:547:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:548:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1105); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleAttribute1122); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_0_1());
                        
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:568:1: ( (lv_val_2_0= RULE_STRING ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:569:1: (lv_val_2_0= RULE_STRING )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:569:1: (lv_val_2_0= RULE_STRING )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:570:3: lv_val_2_0= RULE_STRING
                    {
                    lv_val_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute1139); 

                    			newLeafNode(lv_val_2_0, grammarAccess.getAttributeAccess().getValSTRINGTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:587:6: ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_rightName_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_val_7_0= RULE_STRING ) ) )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:587:6: ( ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_rightName_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_val_7_0= RULE_STRING ) ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:587:7: ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_rightName_5_0= RULE_ID ) ) otherlv_6= '=' ( (lv_val_7_0= RULE_STRING ) )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:587:7: ( (lv_name_3_0= RULE_ID ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:588:1: (lv_name_3_0= RULE_ID )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:588:1: (lv_name_3_0= RULE_ID )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:589:3: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1169); 

                    			newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAttribute1186); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_1_1());
                        
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:609:1: ( (lv_rightName_5_0= RULE_ID ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:610:1: (lv_rightName_5_0= RULE_ID )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:610:1: (lv_rightName_5_0= RULE_ID )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:611:3: lv_rightName_5_0= RULE_ID
                    {
                    lv_rightName_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1203); 

                    			newLeafNode(lv_rightName_5_0, grammarAccess.getAttributeAccess().getRightNameIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rightName",
                            		lv_rightName_5_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleAttribute1220); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1_3());
                        
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:631:1: ( (lv_val_7_0= RULE_STRING ) )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:632:1: (lv_val_7_0= RULE_STRING )
                    {
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:632:1: (lv_val_7_0= RULE_STRING )
                    // ../org.xtext.passi.DocGen/src-gen/org/xtext/passi/parser/antlr/internal/InternalDocGen.g:633:3: lv_val_7_0= RULE_STRING
                    {
                    lv_val_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute1237); 

                    			newLeafNode(lv_val_7_0, grammarAccess.getAttributeAccess().getValSTRINGTerminalRuleCall_1_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\16\uffff";
    static final String DFA3_eofS =
        "\16\uffff";
    static final String DFA3_minS =
        "\1\5\3\4\1\22\2\uffff\2\4\1\13\1\23\1\4\1\13\1\4";
    static final String DFA3_maxS =
        "\1\5\1\4\1\22\1\4\1\23\2\uffff\1\10\1\4\1\13\1\23\1\10\1\13\1\10";
    static final String DFA3_acceptS =
        "\5\uffff\1\1\1\2\7\uffff";
    static final String DFA3_specialS =
        "\16\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\4\1\uffff\1\5\1\uffff\1\6\11\uffff\1\3",
            "\1\7",
            "\1\10\1\11",
            "",
            "",
            "\1\4\1\uffff\1\5\1\uffff\1\6",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\4\1\uffff\1\5\1\uffff\1\6",
            "\1\15",
            "\1\4\1\uffff\1\5\1\uffff\1\6"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "137:1: ( ( ( (lv_Start_0_0= rulestartTag ) ) ( ( (lv_innerElement_1_0= ruleelement ) ) | this_ID_2= RULE_ID )* ( (lv_End_3_0= ruleendTag ) ) ) | this_emptyElement_4= ruleemptyElement )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprologTag_in_ruleModel131 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleelement_in_ruleModel152 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleelement_in_entryRuleelement189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelement199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestartTag_in_ruleelement246 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_ruleelement_in_ruleelement268 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleelement285 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_ruleendTag_in_ruleelement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleemptyElement_in_ruleelement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestartTag_in_entryRulestartTag371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestartTag381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_START_OPEN_in_rulestartTag417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagName_in_rulestartTag437 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleAttribute_in_rulestartTag458 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_in_rulestartTag470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendTag_in_entryRuleendTag505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendTag515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_END_OPEN_in_ruleendTag551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagName_in_ruleendTag571 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_TAG_CLOSE_in_ruleendTag582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleemptyElement_in_entryRuleemptyElement617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleemptyElement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TAG_START_OPEN_in_ruleemptyElement663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTagName_in_ruleemptyElement683 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleemptyElement704 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_RULE_TAG_EMPTY_CLOSE_in_ruleemptyElement716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleprologTag_in_entryRuleprologTag751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleprologTag761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PROLOG_START_in_ruleprologTag797 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleprologTag814 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleprologTag848 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_RULE_PROLOG_END_in_ruleprologTag860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagName_in_entryRuleTagName895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagName905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTagName947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTagName976 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTagName993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTagName1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1105 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAttribute1122 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1169 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAttribute1186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1203 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAttribute1220 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute1237 = new BitSet(new long[]{0x0000000000000002L});

}