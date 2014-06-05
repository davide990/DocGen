package org.xtext.passi.ui.contentassist;

import java.util.HashMap;
import java.util.Map;

public class TemplateKeywords 
{
	public static final String STRING_DATA_TYPE = "STRING";
	public static final String BOOLEAN_DATA_TYPE = "BOOLEAN";
	public static final String INTEGER_DATA_TYPE = "INT";
	
	public static final String SUPPORTED_MODEL_EXTENSION 	= "outputFileNameExtension";
	public static final String DOCUMENTATION_STYLE 			= "documentationStyle";
	public static final String KEY_ECLASS 					= "keyEClass";
	public static final String DOCUMENTATION_TITLE 			= "documentationTitle";
	public static final String TITLE_SEPARATOR 				= "titleSeparator";
	public static final String INCLUDE_DIAGRAM_IMAGE 		= "includeDiagramImage";
	public static final String DIAGRAM_IMAGE_FILE 			= "diagramImageFile";
	public static final String EXCLUDED_ECLASS 				= "excludedEClass";
	public static final String TABLE_BORDER 				= "tableBorder";
	
	
	public static final String FULL_DOCUMENTATION 				= "full";
	public static final String ORDERED_BY_ECLASS_DOCUMENTATION 	= "ordered";
	
	public static final Map<String, String> map;
	public static final Map<String, String> hints;
	
	static
	{
		map 	= new HashMap<String, String>();
		hints 	= new HashMap<String, String>();
		
		map.put(SUPPORTED_MODEL_EXTENSION,		STRING_DATA_TYPE);
		hints.put(SUPPORTED_MODEL_EXTENSION,	"");
		
		map.put(DOCUMENTATION_STYLE,		STRING_DATA_TYPE);
		hints.put(DOCUMENTATION_STYLE,		"The documentation type that this template will produce.");

		map.put(TABLE_BORDER,				BOOLEAN_DATA_TYPE);
		hints.put(TABLE_BORDER,				"If true, put the border in the data tables.");
		
		map.put(KEY_ECLASS,					STRING_DATA_TYPE);
		hints.put(KEY_ECLASS,				"If the choosen documentation style is ordered by EClass, this parameter set the key EClass to use.");
		
		map.put(DOCUMENTATION_TITLE,		STRING_DATA_TYPE);
		hints.put(DOCUMENTATION_TITLE,		"The string to insert in the documentation as title. If no title is set, the name of the diagram will be the documentation title.");
		
		map.put(TITLE_SEPARATOR,			BOOLEAN_DATA_TYPE);
		hints.put(TITLE_SEPARATOR,			"If true, a line separator will be placed after the documentation title");
		
		map.put(INCLUDE_DIAGRAM_IMAGE,		BOOLEAN_DATA_TYPE);
		hints.put(INCLUDE_DIAGRAM_IMAGE,	"If true, include a diagram image file in the documentation.");
		
		map.put(DIAGRAM_IMAGE_FILE,			STRING_DATA_TYPE);
		hints.put(DIAGRAM_IMAGE_FILE,		"The absolute path to the diagram image file to include in the documentation");
		
		map.put(EXCLUDED_ECLASS,			STRING_DATA_TYPE);
		hints.put(EXCLUDED_ECLASS,			"The name of an EClass that must not be included in the documentation.");
	}
	
}
