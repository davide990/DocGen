package org.xtext.passi.generator

import org.w3c.dom.Document
import org.eclipse.emf.common.util.EList
import org.xtext.passi.docGen.element
import java.util.Hashtable
import org.docx4j.Docx4J
import org.eclipse.xtend2.lib.StringConcatenation
import java.io.FileOutputStream
import java.io.File

class HtmlBuilder extends DocxBuilder
{
	new(Document MetamodelDocument, EList<element> ModelElementsList, Hashtable<String,String> HashTable, String OutputFileName) 
	{
		super(MetamodelDocument, ModelElementsList, HashTable, OutputFileName)
	}
	
	/**Build the HTML documentation and save the temp .html file */
	override BuildDocumentation() 
	{
		//Call the Docx builder
		super.BuildDocumentation()
		
		//Create a setting object for html
		var htmlSettings = Docx4J.createHTMLSettings();
		htmlSettings.setWmlPackage(wordMLPackage);
		
		//TODO rivedere
    	htmlSettings.setImageDirPath(tempFilePath + "_files");
    	htmlSettings.setImageTargetUri(tempFilePath.substring(tempFilePath.lastIndexOf("/")+1) + "_files");
		
		//Create the temp documentation file
		var os = new FileOutputStream(tempFilePath  + File.separator + "temp.html");
		
		//Convert the generated docx to html
		Docx4J.toHTML(htmlSettings, os, Docx4J.FLAG_EXPORT_PREFER_NONXSL);
		
		return new StringConcatenation
	}
	
}