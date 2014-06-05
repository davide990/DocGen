/*
 * generated by Xtext
 */
package org.xtext.passi.generator

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class TemplateLanguageGenerator implements IGenerator 
{
	private String templateTitle;
	private String supportedExtension;
	private String documentationTitle;
	private String diagramImageFile;
	private String documentationStyle;
	private String keyEClass;
	private boolean tableBorder;
	private boolean titleSeparator;
	private boolean includeDiagramImage;
	
	private HashMap<String, List<String>> excludedFeatures;
	private HashMap<String, String> featureOrder;
	private HashMap<String, String> headerFields;
	private List<String> excludedEClasses;
	
	new()
	{
		tableBorder 			= false;
		titleSeparator 			= false;
		includeDiagramImage 	= false;
	}
	
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) 
	{ }
	
	public def setExcludedEClasses(List<String> l)
	{
		excludedEClasses = l;	
	}
	
	public def setExcludedFeatures(HashMap<String, List<String>> s)
	{
		excludedFeatures = s;
	}
	
	public def setFeaturesOrder(HashMap<String, String> s)
	{
		featureOrder = s;	
	}
	
	
	public def setTemplateTitle(String s)
	{
		templateTitle = s;
	}
	
	public def setSupportedExtension(String s)
	{
		supportedExtension = s;	
	}
	
	public def setDocumentationTitle(String s)
	{
		documentationTitle = s;	
	}
	
	public def setTitleSeparator(boolean v)
	{
		titleSeparator = v;	
	}
	
	public def setIncludeDiagramImage(boolean v)
	{
		includeDiagramImage = v;	
	}
	
	public def setDiagramImageFile(String s)
	{
		diagramImageFile = s;	
	}
	
	public def setDocumentationStyle(String s)
	{
		
		documentationStyle = s;	
	}
	
	public def setKeyEClass(String s)
	{
		keyEClass = s;	
	}
	
	public def setHeaderFields(HashMap<String, String> s)
	{
		headerFields = s;
	}
	
	public def setTableBorder(boolean v)
	{
		tableBorder = v;
	}
	
	
	public def generateTemplate()
	'''
		template «templateTitle»
		{
			«IF (!supportedExtension.nullOrEmpty)»
			outputFileNameExtension:"«supportedExtension»";
			«ENDIF»
			«IF (!supportedExtension.nullOrEmpty)»
			documentationTitle:"«documentationTitle»";
			«ENDIF»
			titleSeparator:«titleSeparator.toString»;
			includeDiagramImage:«includeDiagramImage.toString»;
			«IF (!supportedExtension.nullOrEmpty)»
			diagramImageFile:"«diagramImageFile»";
			«ENDIF»
			«IF (!supportedExtension.nullOrEmpty)»
			documentationStyle:"«documentationStyle»";
			«ENDIF»
			«IF (!supportedExtension.nullOrEmpty)»
			keyEClass:"«keyEClass»";
			«ENDIF»
			«addExcludedEClasses»
			«addTableDataSections»
		}
	'''
	
	private def addExcludedEClasses()
	'''
		«FOR s : excludedEClasses»
		excludedEClass:"«s»";
		«ENDFOR»
	'''
	
	private def String addQuotes(String s)
	{
		var sb = new StringBuilder
		
		for(String v : s.split(","))
		{
			sb.append("\""+ v +"\"");
			sb.append(",");	
		}
		
		var st = sb.toString
		if(st.endsWith(","))
			st = st.substring(0,st.length-1)
		
		return st
	}
	
	private def List<String> getKeySetForDataSections()
	{
		var keySet = featureOrder.keySet;
		var excludedFeaturesKeySet = excludedFeatures.keySet;
		
		var merged = new ArrayList<String>()
		
		if(!keySet.nullOrEmpty)
		{
			for(String s : keySet)
			{
				if(!merged.contains(s))
					merged.add(s)
			}
		}
			
		if(!excludedFeaturesKeySet.nullOrEmpty)
		{
			for(String s : excludedFeaturesKeySet)
			{
				if(!merged.contains(s))
					merged.add(s)
			}
		}
		
		return merged
	}
	
	
	private def addTableDataSections()
	'''
		«var keySet = getKeySetForDataSections»
		«IF !keySet.nullOrEmpty»		
		«FOR String s: keySet»
		tableData for «s»
		{
			«var order = featureOrder.get(s)»
			«IF !order.nullOrEmpty»
			featuresOrder:{«addQuotes(order)»};
			«ENDIF»
			«var excludedFeature = excludedFeatures.get(s)»
			«IF !excludedFeature.nullOrEmpty»
			«FOR f : excludedFeature»
			excludeFeature:"«f»";
			«ENDFOR»
			«IF headerFields.containsKey(s)»
			headerField:«addQuotes(headerFields.get(s))»;
			«ENDIF»
			«ENDIF»
		}
		«ENDFOR»
		«ENDIF»
	'''

	
}
