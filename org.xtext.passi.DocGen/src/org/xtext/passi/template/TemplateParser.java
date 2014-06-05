package org.xtext.passi.template;

import java.io.File;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.xtext.passi.TemplateLanguageStandaloneSetup;
import org.xtext.passi.templateLanguage.Feature;
import org.xtext.passi.templateLanguage.ListAttribute;
import org.xtext.passi.templateLanguage.TableDataAttribute;
import org.xtext.passi.templateLanguage.TableSection;
import org.xtext.passi.templateLanguage.Template;
import org.xtext.passi.templateLanguage.impl.ListAttributeImpl;
import org.xtext.passi.templateLanguage.impl.TableDataImpl;
import org.xtext.passi.ui.contentassist.TableData;
import org.xtext.passi.ui.contentassist.TemplateKeywords;

import com.google.inject.Injector;

public class TemplateParser 
{
	private String templatePath;
	
	private Template template;
	
	private EList<Feature> templateFeatures;
	
	//E' la struttura contenente le informazioni del template su cui effettuare
	//il parsing. Le informazioni sono del tipo
	// [NomeFeature, valore]
	//oppure
	// [ECLASS:NomeFeature, valore]
	//ove necessario
	private HashMap<String, String> templateData;
	
	
	public TemplateParser(String templatePath)
	{
		this.templatePath = templatePath;
		
		System.out.println("path to templates");
		
		templateData = new HashMap<String, String>();
	}
	
	/**
	 * Parse a template and store the data into an hash table.
	 */
	public void parseTemplate()
	{
		Injector injector = new TemplateLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		ResourceSet resourceSet 	= injector.getInstance(XtextResourceSet.class);
		((XtextResourceSet) resourceSet).addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		
		if(StringExtensions.isNullOrEmpty(templatePath))
			return;
		
		if(!(new File(templatePath).exists()))
			return;
		
		Resource res = resourceSet.getResource(URI.createFileURI(templatePath),true);
		
		template = null;
		EObject eobj = res.getContents().get(0);
		
		try
		{
			template = (Template)eobj;
		}
		catch(ClassCastException e)
		{
			System.out.println("[TemplateParser Class] ClassCastException\n");
		}
		
		templateFeatures = template.getFeatures();
		
		//Iterate over the template features
		for(int i=0;i < templateFeatures.size(); i++)
		{
			Feature feature = templateFeatures.get(i);
			
			//Parse the attribute
			if(feature instanceof TableDataImpl)
			{
				org.xtext.passi.templateLanguage.TableData tableData = (org.xtext.passi.templateLanguage.TableData) feature;
				
				//get the tableData reference EClass
				String EClassName = tableData.getName();
				
				//Parse header and value sections in this tableData
				for(TableSection ts : tableData.getSections())
					parseTableDataSection(ts);
				
				//Parse every attribute in the table data
				for(TableDataAttribute tb : tableData.getTableDataAttributes())
					parseTableDataAttribute(tb, EClassName);
			}
			else
				parseAttribute(feature);
		}
	}
	
	
	public String getTemplateName()
	{
		return template.getName();
	}
	
	public HashMap<String, String> getTemplateData()
	{
		return templateData;
	}
	
	/**
	 * Parse an attribute in the template file and set the value of the
	 * corresponding control in this window as the value of the given attribute.
	 * 
	 * @param feature
	 */
	private void parseAttribute(Feature feature)
	{
		//---------------------------
		//SUPPORTED MODEL EXTENSION
		if(feature.getName().equals(TemplateKeywords.SUPPORTED_MODEL_EXTENSION))
		{
			templateData.put(feature.getName(), getAttributeValueWithoutQuotes(feature.getValue()));
			return;
		}
		
		if(feature.getName().equals(TemplateKeywords.TABLE_BORDER))
		{	
			templateData.put(feature.getName(), getAttributeValueWithoutQuotes(feature.getValue()));
		}
		
		//---------------------------
		//DOCUMENTATION STYLE FEATURE
		if(feature.getName().equals(TemplateKeywords.DOCUMENTATION_STYLE))
		{
			String docStyle = feature.getValue().toLowerCase(); 
			
			templateData.put(feature.getName(), getAttributeValueWithoutQuotes(docStyle));
			return;
		}
		
		//---------------------------
		//KEY ECLASS FEATURE
		if(feature.getName().equals(TemplateKeywords.KEY_ECLASS))
		{
			String val = getAttributeValueWithoutQuotes(feature.getValue());
			
			templateData.put(feature.getName(), getAttributeValueWithoutQuotes(val));
			return;
		}
		//---------------------------
		//DOCUMENTATION TITLE FEATURE
		if(feature.getName().equals(TemplateKeywords.DOCUMENTATION_TITLE))
		{
			templateData.put(feature.getName(), getAttributeValueWithoutQuotes(feature.getValue()));
			return;
		}
		
		//---------------------------
		//LINE SEPARATOR FEATURE
		if(feature.getName().equals(TemplateKeywords.TITLE_SEPARATOR))
		{			
			templateData.put(feature.getName(), getAttributeValueWithoutQuotes(feature.getValue()));		
			return;
		}
		
		//---------------------------
		//INCLUDE DIAGRAM IMAGE FEATURE
		if(feature.getName().equals(TemplateKeywords.INCLUDE_DIAGRAM_IMAGE))
		{
			templateData.put(feature.getName(), getAttributeValueWithoutQuotes(feature.getValue()));
			return;
		}
		
		//---------------------------
		//DIAGRAM IMAGE FILE FEATURE
		if(feature.getName().equals(TemplateKeywords.DIAGRAM_IMAGE_FILE))
		{
			templateData.put(feature.getName(), getAttributeValueWithoutQuotes(feature.getValue()));
			return;
		}
		
		//---------------------------
		//EXCLUDE ECLASS FEATURE
		if(feature.getName().equals(TemplateKeywords.EXCLUDED_ECLASS))
		{
			String excludedEClasses = templateData.get(feature.getName());
			
			System.out.println("EXCLUDED ECLASS: " + excludedEClasses);
			
			//The entry was already put in the hash table, so skip this step 
			if(StringExtensions.isNullOrEmpty(excludedEClasses))
			{
				templateData.put(feature.getName(), getAttributeValueWithoutQuotes(feature.getValue()));
				return;
			}
			
			StringBuilder sb = new StringBuilder();
			
			sb.append(excludedEClasses);
			sb.append(",");
			sb.append(getAttributeValueWithoutQuotes(feature.getValue()));
			
			templateData.remove(feature.getName());
			//templateData.put(feature.getName(), feature.getValue());
			templateData.put(feature.getName(), sb.toString());
			return;
		}
	}
	

	public static String getAttributeValueWithoutQuotes(String s)
	{
		if(s.startsWith("\""))
			s = s.substring(1);
		
		if(s.endsWith("\""))
			s = s.substring(0, s.length()-1);
		
		return s;
	}
	
	private void parseTableDataAttribute(TableDataAttribute feature, String EClassName)
	{
		//EXCLUDE ESTRCUTURALFEATURE FEATURE
		if(feature.getName().equals(TableData.EXCLUDED_FEATURE))
		{
			String key = EClassName + ":" + feature.getName();
			templateData.put(key, getAttributeValueWithoutQuotes(feature.getValue()));
			return;
		}
		
		if(feature.getName().equals(TableData.HEADER_FIELD))
		{
			String key = EClassName + ":" + feature.getName();
			templateData.put(key, getAttributeValueWithoutQuotes(feature.getValue()));
			return;
		}
		
		if(feature.getName().equals(TableData.FEATURE_ORDER))
		{
			if(!(feature instanceof ListAttributeImpl))
			{
				//Aggiungo [nomeEClass, nomeFeature]. In questo caso [nomeFeature] sarà la prima 
				//ad essere messa nella tabella della documentazione finale, poi le altre saranno 
				//messe nell'ordine in cui sono presenti nel metamodello.
				//featureOrder.put(EClassName, feature.getValue());
				String key = EClassName + ":" + feature.getName();
				templateData.put(key, getAttributeValueWithoutQuotes(feature.getValue()));
				return;
			}
			
			//Get the ListAttribute Element
			ListAttribute listAttribute = (ListAttribute) feature;
			
			//Get the number of elements in the ListAttribute
			int numFeatures = listAttribute.getValues().size();
			
			if(numFeatures > 1)
			{
				StringConcatenation features = new StringConcatenation();
				
				int i=0;
				for(i=0; i<numFeatures-1; i++)
				{
					features.append(listAttribute.getValues().get(i));
					features.append(",");
				}
				features.append(listAttribute.getValues().get(i));
				
				String key = EClassName + ":" + feature.getName();
				templateData.put(key, getAttributeValueWithoutQuotes(features.toString()));
			}
			//else
				//featureOrder.put(EClassName, listAttribute.getValues().get(0));
			
		}
		
	}
	
	
	/**
	 * 
	 * @param ts
	 */
	private void parseTableDataSection(TableSection ts)
	{
		/*
		String sectionName = ts.getName();
		
		for(TableDataAttribute tda : ts.getAttributes())
		{
			if(tda.getName().equals(TableData.FONT_BOLD))
			{
				templateData.put(key, getStringWithoutQuotes(features.toString()));
				/*
				boolean val = tda.getName().toLowerCase().equals("true") ? true : false;
				
				//TODO non va la stringa cosi
				if(sectionName.equals("header"))
					tableHeaderBoldCheckBox.setSelection(val);
				else
					tableValuesBoldCheckBox.setSelection(val);
				
			}
			
			if(tda.getName().equals(TableData.FONT_ITALIC))
			{
				boolean val = tda.getName().toLowerCase().equals("true") ? true : false;
				
				//TODO non va la stringa cosi
				if(sectionName.equals("header"))
					tableHeaderItalicCheckBox.setSelection(val);
				else
					tableValuesItalicCheckBox.setSelection(val);
			}
			
			if(tda.getName().equals(TableData.FONT_UNDERLINE))
			{
				boolean val = tda.getName().toLowerCase().equals("true") ? true : false;
				
				//TODO non va la stringa cosi
				if(sectionName.equals("header"))
					tableHeaderUnderlineCheckBox.setSelection(val);
				else
					tableValuesUnderlineCheckBox.setSelection(val);
			}
			
			if(tda.getName().equals(TableData.FONT_NAME))
			{
				
			}
			
			if(tda.getName().equals(TableData.FONT_SIZE))
			{
				if(sectionName.equals("header"))
					tableHeaderFontSizeSpinner.setSelection(Integer.parseInt(tda.getValue()));
				else
					tableValuesFontSizeSpinner.setSelection(Integer.parseInt(tda.getValue()));
			}
		}*/
	}
	
	
}
