package org.xtext.passi.ui.contentassist;

import java.util.HashMap;
import java.util.Map;

public class TableData
{
	public static final String EXCLUDED_FEATURE 	= "excludeFeature";
	public static final String FEATURE_ORDER 		= "featuresOrder";
	public static final String FONT_NAME 			= "fontName";
	public static final String FONT_SIZE			= "fontSize";
	public static final String FONT_ITALIC			= "italic";
	public static final String FONT_BOLD			= "bold";
	public static final String FONT_UNDERLINE		= "underline";
	public static final String HEADER_FIELD 		= "headerField";
	
	public static final Map<String, String> tableData_map;
	public static final Map<String, String> tableData_hints;
	
	static
	{
		tableData_map 	= new HashMap<String, String>();
		tableData_hints = new HashMap<String, String>();
		
		tableData_map.put(EXCLUDED_FEATURE,		TemplateKeywords.STRING_DATA_TYPE);
		tableData_hints.put(EXCLUDED_FEATURE,	"The name of an excluded EStructuralFeature. This feature will not be inserted in the final documentation");
		
		tableData_map.put(FEATURE_ORDER,		TemplateKeywords.STRING_DATA_TYPE);
		tableData_hints.put(FEATURE_ORDER,		"The order in which the data will be presented.");
		
		tableData_map.put(HEADER_FIELD,			TemplateKeywords.STRING_DATA_TYPE);
		tableData_hints.put(HEADER_FIELD,		"");
		
		tableData_map.put(FONT_NAME,			TemplateKeywords.STRING_DATA_TYPE);
		tableData_hints.put(FONT_NAME,			"The font name for this table");
		
		tableData_map.put(FONT_SIZE,			TemplateKeywords.INTEGER_DATA_TYPE);
		tableData_hints.put(FONT_SIZE,			"The size of the font for this table.");
		
		tableData_map.put(FONT_ITALIC,			TemplateKeywords.BOOLEAN_DATA_TYPE);		
		tableData_map.put(FONT_BOLD,			TemplateKeywords.BOOLEAN_DATA_TYPE);		
		tableData_map.put(FONT_UNDERLINE,		TemplateKeywords.BOOLEAN_DATA_TYPE);
	}
}