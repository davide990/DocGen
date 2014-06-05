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
import org.xtext.passi.services.TemplateLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemplateLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SECTION_HEADER", "RULE_SECTION_VALUES", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'template'", "'{'", "'}'", "':'", "';'", "'tableData'", "'for'", "'section'", "','", "'.'", "'true'", "'false'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_SECTION_VALUES=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_SECTION_HEADER=5;
    public static final int RULE_INT=8;
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
    public String getGrammarFileName() { return "../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g"; }



     	private TemplateLanguageGrammarAccess grammarAccess;
     	
        public InternalTemplateLanguageParser(TokenStream input, TemplateLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Template";	
       	}
       	
       	@Override
       	protected TemplateLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTemplate"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:67:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:68:2: (iv_ruleTemplate= ruleTemplate EOF )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:69:2: iv_ruleTemplate= ruleTemplate EOF
            {
             newCompositeNode(grammarAccess.getTemplateRule()); 
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate75);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;

             current =iv_ruleTemplate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate85); 

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
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:76:1: ruleTemplate returns [EObject current=null] : (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Features_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:79:28: ( (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleFeature ) )* otherlv_4= '}' ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:80:1: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleFeature ) )* otherlv_4= '}' )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:80:1: (otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleFeature ) )* otherlv_4= '}' )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:80:3: otherlv_0= 'template' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_Features_3_0= ruleFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleTemplate122); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getTemplateKeyword_0());
                
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplate139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTemplateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTemplate156); 

                	newLeafNode(otherlv_2, grammarAccess.getTemplateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:106:1: ( (lv_Features_3_0= ruleFeature ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:107:1: (lv_Features_3_0= ruleFeature )
            	    {
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:107:1: (lv_Features_3_0= ruleFeature )
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:108:3: lv_Features_3_0= ruleFeature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTemplateAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleTemplate177);
            	    lv_Features_3_0=ruleFeature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"Features",
            	            		lv_Features_3_0, 
            	            		"Feature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTemplate190); 

                	newLeafNode(otherlv_4, grammarAccess.getTemplateAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleFeature"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:136:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:137:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:138:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature226);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature236); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:145:1: ruleFeature returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) | this_TableData_4= ruleTableData ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject this_TableData_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:148:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) | this_TableData_4= ruleTableData ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:149:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) | this_TableData_4= ruleTableData )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:149:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) | this_TableData_4= ruleTableData )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==18) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:149:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
                    {
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:149:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:149:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';'
                    {
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:149:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:150:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:150:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:151:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature279); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFeatureRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleFeature296); 

                        	newLeafNode(otherlv_1, grammarAccess.getFeatureAccess().getColonKeyword_0_1());
                        
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:171:1: ( (lv_value_2_0= ruleAttributeValue ) )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:172:1: (lv_value_2_0= ruleAttributeValue )
                    {
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:172:1: (lv_value_2_0= ruleAttributeValue )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:173:3: lv_value_2_0= ruleAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureAccess().getValueAttributeValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValue_in_ruleFeature317);
                    lv_value_2_0=ruleAttributeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"AttributeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFeature329); 

                        	newLeafNode(otherlv_3, grammarAccess.getFeatureAccess().getSemicolonKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:195:5: this_TableData_4= ruleTableData
                    {
                     
                            newCompositeNode(grammarAccess.getFeatureAccess().getTableDataParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTableData_in_ruleFeature358);
                    this_TableData_4=ruleTableData();

                    state._fsp--;

                     
                            current = this_TableData_4; 
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleTableData"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:211:1: entryRuleTableData returns [EObject current=null] : iv_ruleTableData= ruleTableData EOF ;
    public final EObject entryRuleTableData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableData = null;


        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:212:2: (iv_ruleTableData= ruleTableData EOF )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:213:2: iv_ruleTableData= ruleTableData EOF
            {
             newCompositeNode(grammarAccess.getTableDataRule()); 
            pushFollow(FOLLOW_ruleTableData_in_entryRuleTableData393);
            iv_ruleTableData=ruleTableData();

            state._fsp--;

             current =iv_ruleTableData; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableData403); 

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
    // $ANTLR end "entryRuleTableData"


    // $ANTLR start "ruleTableData"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:220:1: ruleTableData returns [EObject current=null] : ( () otherlv_1= 'tableData' otherlv_2= 'for' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( (lv_tableDataAttributes_5_0= ruleTableDataAttribute ) ) | ( (lv_sections_6_0= ruleTableSection ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleTableData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_tableDataAttributes_5_0 = null;

        EObject lv_sections_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:223:28: ( ( () otherlv_1= 'tableData' otherlv_2= 'for' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( (lv_tableDataAttributes_5_0= ruleTableDataAttribute ) ) | ( (lv_sections_6_0= ruleTableSection ) ) )* otherlv_7= '}' ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:224:1: ( () otherlv_1= 'tableData' otherlv_2= 'for' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( (lv_tableDataAttributes_5_0= ruleTableDataAttribute ) ) | ( (lv_sections_6_0= ruleTableSection ) ) )* otherlv_7= '}' )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:224:1: ( () otherlv_1= 'tableData' otherlv_2= 'for' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( (lv_tableDataAttributes_5_0= ruleTableDataAttribute ) ) | ( (lv_sections_6_0= ruleTableSection ) ) )* otherlv_7= '}' )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:224:2: () otherlv_1= 'tableData' otherlv_2= 'for' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( ( (lv_tableDataAttributes_5_0= ruleTableDataAttribute ) ) | ( (lv_sections_6_0= ruleTableSection ) ) )* otherlv_7= '}'
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:224:2: ()
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:225:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTableDataAccess().getTableDataAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTableData449); 

                	newLeafNode(otherlv_1, grammarAccess.getTableDataAccess().getTableDataKeyword_1());
                
            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTableData461); 

                	newLeafNode(otherlv_2, grammarAccess.getTableDataAccess().getForKeyword_2());
                
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:238:1: ( (lv_name_3_0= RULE_ID ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:239:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:239:1: (lv_name_3_0= RULE_ID )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:240:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTableData478); 

            			newLeafNode(lv_name_3_0, grammarAccess.getTableDataAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTableDataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTableData495); 

                	newLeafNode(otherlv_4, grammarAccess.getTableDataAccess().getLeftCurlyBracketKeyword_4());
                
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:260:1: ( ( (lv_tableDataAttributes_5_0= ruleTableDataAttribute ) ) | ( (lv_sections_6_0= ruleTableSection ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }
                else if ( (LA3_0==20) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:260:2: ( (lv_tableDataAttributes_5_0= ruleTableDataAttribute ) )
            	    {
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:260:2: ( (lv_tableDataAttributes_5_0= ruleTableDataAttribute ) )
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:261:1: (lv_tableDataAttributes_5_0= ruleTableDataAttribute )
            	    {
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:261:1: (lv_tableDataAttributes_5_0= ruleTableDataAttribute )
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:262:3: lv_tableDataAttributes_5_0= ruleTableDataAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableDataAccess().getTableDataAttributesTableDataAttributeParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableDataAttribute_in_ruleTableData517);
            	    lv_tableDataAttributes_5_0=ruleTableDataAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableDataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"tableDataAttributes",
            	            		lv_tableDataAttributes_5_0, 
            	            		"TableDataAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:279:6: ( (lv_sections_6_0= ruleTableSection ) )
            	    {
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:279:6: ( (lv_sections_6_0= ruleTableSection ) )
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:280:1: (lv_sections_6_0= ruleTableSection )
            	    {
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:280:1: (lv_sections_6_0= ruleTableSection )
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:281:3: lv_sections_6_0= ruleTableSection
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableDataAccess().getSectionsTableSectionParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableSection_in_ruleTableData544);
            	    lv_sections_6_0=ruleTableSection();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableDataRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"sections",
            	            		lv_sections_6_0, 
            	            		"TableSection");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleTableData558); 

                	newLeafNode(otherlv_7, grammarAccess.getTableDataAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleTableData"


    // $ANTLR start "entryRuleTableSection"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:309:1: entryRuleTableSection returns [EObject current=null] : iv_ruleTableSection= ruleTableSection EOF ;
    public final EObject entryRuleTableSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableSection = null;


        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:310:2: (iv_ruleTableSection= ruleTableSection EOF )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:311:2: iv_ruleTableSection= ruleTableSection EOF
            {
             newCompositeNode(grammarAccess.getTableSectionRule()); 
            pushFollow(FOLLOW_ruleTableSection_in_entryRuleTableSection594);
            iv_ruleTableSection=ruleTableSection();

            state._fsp--;

             current =iv_ruleTableSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableSection604); 

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
    // $ANTLR end "entryRuleTableSection"


    // $ANTLR start "ruleTableSection"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:318:1: ruleTableSection returns [EObject current=null] : (otherlv_0= 'section' ( ( (lv_name_1_1= RULE_SECTION_HEADER | lv_name_1_2= RULE_SECTION_VALUES ) ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleTableDataAttribute ) )* otherlv_4= '}' ) ;
    public final EObject ruleTableSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attributes_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:321:28: ( (otherlv_0= 'section' ( ( (lv_name_1_1= RULE_SECTION_HEADER | lv_name_1_2= RULE_SECTION_VALUES ) ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleTableDataAttribute ) )* otherlv_4= '}' ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:322:1: (otherlv_0= 'section' ( ( (lv_name_1_1= RULE_SECTION_HEADER | lv_name_1_2= RULE_SECTION_VALUES ) ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleTableDataAttribute ) )* otherlv_4= '}' )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:322:1: (otherlv_0= 'section' ( ( (lv_name_1_1= RULE_SECTION_HEADER | lv_name_1_2= RULE_SECTION_VALUES ) ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleTableDataAttribute ) )* otherlv_4= '}' )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:322:3: otherlv_0= 'section' ( ( (lv_name_1_1= RULE_SECTION_HEADER | lv_name_1_2= RULE_SECTION_VALUES ) ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleTableDataAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleTableSection641); 

                	newLeafNode(otherlv_0, grammarAccess.getTableSectionAccess().getSectionKeyword_0());
                
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:326:1: ( ( (lv_name_1_1= RULE_SECTION_HEADER | lv_name_1_2= RULE_SECTION_VALUES ) ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:327:1: ( (lv_name_1_1= RULE_SECTION_HEADER | lv_name_1_2= RULE_SECTION_VALUES ) )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:327:1: ( (lv_name_1_1= RULE_SECTION_HEADER | lv_name_1_2= RULE_SECTION_VALUES ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:328:1: (lv_name_1_1= RULE_SECTION_HEADER | lv_name_1_2= RULE_SECTION_VALUES )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:328:1: (lv_name_1_1= RULE_SECTION_HEADER | lv_name_1_2= RULE_SECTION_VALUES )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SECTION_HEADER) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_SECTION_VALUES) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:329:3: lv_name_1_1= RULE_SECTION_HEADER
                    {
                    lv_name_1_1=(Token)match(input,RULE_SECTION_HEADER,FOLLOW_RULE_SECTION_HEADER_in_ruleTableSection660); 

                    			newLeafNode(lv_name_1_1, grammarAccess.getTableSectionAccess().getNameSECTION_HEADERTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_1, 
                            		"SECTION_HEADER");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:344:8: lv_name_1_2= RULE_SECTION_VALUES
                    {
                    lv_name_1_2=(Token)match(input,RULE_SECTION_VALUES,FOLLOW_RULE_SECTION_VALUES_in_ruleTableSection680); 

                    			newLeafNode(lv_name_1_2, grammarAccess.getTableSectionAccess().getNameSECTION_VALUESTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTableSectionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_2, 
                            		"SECTION_VALUES");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTableSection700); 

                	newLeafNode(otherlv_2, grammarAccess.getTableSectionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:366:1: ( (lv_attributes_3_0= ruleTableDataAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:367:1: (lv_attributes_3_0= ruleTableDataAttribute )
            	    {
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:367:1: (lv_attributes_3_0= ruleTableDataAttribute )
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:368:3: lv_attributes_3_0= ruleTableDataAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTableSectionAccess().getAttributesTableDataAttributeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTableDataAttribute_in_ruleTableSection721);
            	    lv_attributes_3_0=ruleTableDataAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTableSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_3_0, 
            	            		"TableDataAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleTableSection734); 

                	newLeafNode(otherlv_4, grammarAccess.getTableSectionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleTableSection"


    // $ANTLR start "entryRuleTableDataAttribute"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:396:1: entryRuleTableDataAttribute returns [EObject current=null] : iv_ruleTableDataAttribute= ruleTableDataAttribute EOF ;
    public final EObject entryRuleTableDataAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTableDataAttribute = null;


        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:397:2: (iv_ruleTableDataAttribute= ruleTableDataAttribute EOF )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:398:2: iv_ruleTableDataAttribute= ruleTableDataAttribute EOF
            {
             newCompositeNode(grammarAccess.getTableDataAttributeRule()); 
            pushFollow(FOLLOW_ruleTableDataAttribute_in_entryRuleTableDataAttribute770);
            iv_ruleTableDataAttribute=ruleTableDataAttribute();

            state._fsp--;

             current =iv_ruleTableDataAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTableDataAttribute780); 

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
    // $ANTLR end "entryRuleTableDataAttribute"


    // $ANTLR start "ruleTableDataAttribute"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:405:1: ruleTableDataAttribute returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) | this_ListAttribute_4= ruleListAttribute ) ;
    public final EObject ruleTableDataAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject this_ListAttribute_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:408:28: ( ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) | this_ListAttribute_4= ruleListAttribute ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:409:1: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) | this_ListAttribute_4= ruleListAttribute )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:409:1: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) | this_ListAttribute_4= ruleListAttribute )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:409:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
                    {
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:409:2: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:409:3: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';'
                    {
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:409:3: ( (lv_name_0_0= ruleQualifiedName ) )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:410:1: (lv_name_0_0= ruleQualifiedName )
                    {
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:410:1: (lv_name_0_0= ruleQualifiedName )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:411:3: lv_name_0_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableDataAttributeAccess().getNameQualifiedNameParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTableDataAttribute827);
                    lv_name_0_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableDataAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTableDataAttribute839); 

                        	newLeafNode(otherlv_1, grammarAccess.getTableDataAttributeAccess().getColonKeyword_0_1());
                        
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:431:1: ( (lv_value_2_0= ruleAttributeValue ) )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:432:1: (lv_value_2_0= ruleAttributeValue )
                    {
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:432:1: (lv_value_2_0= ruleAttributeValue )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:433:3: lv_value_2_0= ruleAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getTableDataAttributeAccess().getValueAttributeValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValue_in_ruleTableDataAttribute860);
                    lv_value_2_0=ruleAttributeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTableDataAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"AttributeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTableDataAttribute872); 

                        	newLeafNode(otherlv_3, grammarAccess.getTableDataAttributeAccess().getSemicolonKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:455:5: this_ListAttribute_4= ruleListAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getTableDataAttributeAccess().getListAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleListAttribute_in_ruleTableDataAttribute901);
                    this_ListAttribute_4=ruleListAttribute();

                    state._fsp--;

                     
                            current = this_ListAttribute_4; 
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
    // $ANTLR end "ruleTableDataAttribute"


    // $ANTLR start "entryRuleListAttribute"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:471:1: entryRuleListAttribute returns [EObject current=null] : iv_ruleListAttribute= ruleListAttribute EOF ;
    public final EObject entryRuleListAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListAttribute = null;


        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:472:2: (iv_ruleListAttribute= ruleListAttribute EOF )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:473:2: iv_ruleListAttribute= ruleListAttribute EOF
            {
             newCompositeNode(grammarAccess.getListAttributeRule()); 
            pushFollow(FOLLOW_ruleListAttribute_in_entryRuleListAttribute936);
            iv_ruleListAttribute=ruleListAttribute();

            state._fsp--;

             current =iv_ruleListAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListAttribute946); 

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
    // $ANTLR end "entryRuleListAttribute"


    // $ANTLR start "ruleListAttribute"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:480:1: ruleListAttribute returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' otherlv_2= '{' ( ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* )? otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleListAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:483:28: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' otherlv_2= '{' ( ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* )? otherlv_6= '}' otherlv_7= ';' ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:484:1: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' otherlv_2= '{' ( ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* )? otherlv_6= '}' otherlv_7= ';' )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:484:1: ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' otherlv_2= '{' ( ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* )? otherlv_6= '}' otherlv_7= ';' )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:484:2: ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' otherlv_2= '{' ( ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* )? otherlv_6= '}' otherlv_7= ';'
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:484:2: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:485:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:485:1: (lv_name_0_0= ruleQualifiedName )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:486:3: lv_name_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getListAttributeAccess().getNameQualifiedNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleListAttribute992);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleListAttribute1004); 

                	newLeafNode(otherlv_1, grammarAccess.getListAttributeAccess().getColonKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleListAttribute1016); 

                	newLeafNode(otherlv_2, grammarAccess.getListAttributeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:510:1: ( ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:510:2: ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
                    {
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:510:2: ( (lv_values_3_0= RULE_STRING ) )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:511:1: (lv_values_3_0= RULE_STRING )
                    {
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:511:1: (lv_values_3_0= RULE_STRING )
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:512:3: lv_values_3_0= RULE_STRING
                    {
                    lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListAttribute1034); 

                    			newLeafNode(lv_values_3_0, grammarAccess.getListAttributeAccess().getValuesSTRINGTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getListAttributeRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"values",
                            		lv_values_3_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:528:2: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:528:4: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleListAttribute1052); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getListAttributeAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:532:1: ( (lv_values_5_0= RULE_STRING ) )
                    	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:533:1: (lv_values_5_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:533:1: (lv_values_5_0= RULE_STRING )
                    	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:534:3: lv_values_5_0= RULE_STRING
                    	    {
                    	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleListAttribute1069); 

                    	    			newLeafNode(lv_values_5_0, grammarAccess.getListAttributeAccess().getValuesSTRINGTerminalRuleCall_3_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getListAttributeRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"values",
                    	            		lv_values_5_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleListAttribute1090); 

                	newLeafNode(otherlv_6, grammarAccess.getListAttributeAccess().getRightCurlyBracketKeyword_4());
                
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleListAttribute1102); 

                	newLeafNode(otherlv_7, grammarAccess.getListAttributeAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleListAttribute"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:568:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:569:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:570:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1141);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1152); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:577:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:580:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:581:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:581:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:581:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1192); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:588:1: (kw= '.' this_ID_2= RULE_ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:589:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,22,FOLLOW_22_in_ruleQualifiedName1211); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1226); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleAttributeValue"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:609:1: entryRuleAttributeValue returns [String current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final String entryRuleAttributeValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeValue = null;


        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:610:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:611:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue1274);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue1285); 

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
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:618:1: ruleAttributeValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleAttributeValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:621:28: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' ) )
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:622:1: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' )
            {
            // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:622:1: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | kw= 'true' | kw= 'false' )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:622:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttributeValue1325); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getAttributeValueAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:630:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAttributeValue1351); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getAttributeValueAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:639:2: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleAttributeValue1375); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeValueAccess().getTrueKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.passi.template/src-gen/org/xtext/passi/parser/antlr/internal/InternalTemplateLanguage.g:646:2: kw= 'false'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleAttributeValue1394); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeValueAccess().getFalseKeyword_3()); 
                        

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
    // $ANTLR end "ruleAttributeValue"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\7\uffff";
    static final String DFA6_eofS =
        "\7\uffff";
    static final String DFA6_minS =
        "\1\4\1\20\1\4\1\7\1\20\2\uffff";
    static final String DFA6_maxS =
        "\1\4\1\26\1\4\1\30\1\26\2\uffff";
    static final String DFA6_acceptS =
        "\5\uffff\1\1\1\2";
    static final String DFA6_specialS =
        "\7\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\3\5\uffff\1\2",
            "\1\4",
            "\2\5\5\uffff\1\6\10\uffff\2\5",
            "\1\3\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "409:1: ( ( ( (lv_name_0_0= ruleQualifiedName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) otherlv_3= ';' ) | this_ListAttribute_4= ruleListAttribute )";
        }
    }
 

    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTemplate122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplate139 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTemplate156 = new BitSet(new long[]{0x0000000000048010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleTemplate177 = new BitSet(new long[]{0x0000000000048010L});
    public static final BitSet FOLLOW_15_in_ruleTemplate190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature279 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFeature296 = new BitSet(new long[]{0x0000000001800180L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleFeature317 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFeature329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableData_in_ruleFeature358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableData_in_entryRuleTableData393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableData403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTableData449 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTableData461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTableData478 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTableData495 = new BitSet(new long[]{0x0000000000108010L});
    public static final BitSet FOLLOW_ruleTableDataAttribute_in_ruleTableData517 = new BitSet(new long[]{0x0000000000108010L});
    public static final BitSet FOLLOW_ruleTableSection_in_ruleTableData544 = new BitSet(new long[]{0x0000000000108010L});
    public static final BitSet FOLLOW_15_in_ruleTableData558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableSection_in_entryRuleTableSection594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableSection604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTableSection641 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_RULE_SECTION_HEADER_in_ruleTableSection660 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_SECTION_VALUES_in_ruleTableSection680 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTableSection700 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleTableDataAttribute_in_ruleTableSection721 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleTableSection734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableDataAttribute_in_entryRuleTableDataAttribute770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTableDataAttribute780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTableDataAttribute827 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTableDataAttribute839 = new BitSet(new long[]{0x0000000001800180L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleTableDataAttribute860 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTableDataAttribute872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListAttribute_in_ruleTableDataAttribute901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListAttribute_in_entryRuleListAttribute936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListAttribute946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleListAttribute992 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleListAttribute1004 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleListAttribute1016 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListAttribute1034 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_21_in_ruleListAttribute1052 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleListAttribute1069 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_15_in_ruleListAttribute1090 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleListAttribute1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1192 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleQualifiedName1211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1226 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue1274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeValue1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAttributeValue1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleAttributeValue1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAttributeValue1394 = new BitSet(new long[]{0x0000000000000002L});

}