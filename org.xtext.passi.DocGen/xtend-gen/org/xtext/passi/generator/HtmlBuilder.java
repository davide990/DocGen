package org.xtext.passi.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Hashtable;
import org.docx4j.Docx4J;
import org.docx4j.convert.out.HTMLSettings;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.w3c.dom.Document;
import org.xtext.passi.docGen.element;
import org.xtext.passi.generator.DocumentationBuilder;
import org.xtext.passi.generator.DocxBuilder;

@SuppressWarnings("all")
public class HtmlBuilder extends DocxBuilder {
  public HtmlBuilder(final Document MetamodelDocument, final EList<element> ModelElementsList, final Hashtable<String,String> HashTable, final String OutputFileName) {
    super(MetamodelDocument, ModelElementsList, HashTable, OutputFileName);
  }
  
  /**
   * Build the HTML documentation and save the temp .html file
   */
  public StringConcatenation BuildDocumentation() {
    try {
      super.BuildDocumentation();
      HTMLSettings htmlSettings = Docx4J.createHTMLSettings();
      htmlSettings.setWmlPackage(this.wordMLPackage);
      String _tempFilePath = DocumentationBuilder.getTempFilePath();
      String _plus = (_tempFilePath + "_files");
      htmlSettings.setImageDirPath(_plus);
      String _tempFilePath_1 = DocumentationBuilder.getTempFilePath();
      String _tempFilePath_2 = DocumentationBuilder.getTempFilePath();
      int _lastIndexOf = _tempFilePath_2.lastIndexOf("/");
      int _plus_1 = (_lastIndexOf + 1);
      String _substring = _tempFilePath_1.substring(_plus_1);
      String _plus_2 = (_substring + "_files");
      htmlSettings.setImageTargetUri(_plus_2);
      String _tempFilePath_3 = DocumentationBuilder.getTempFilePath();
      String _plus_3 = (_tempFilePath_3 + File.separator);
      String _plus_4 = (_plus_3 + "temp.html");
      FileOutputStream os = new FileOutputStream(_plus_4);
      Docx4J.toHTML(htmlSettings, os, Docx4J.FLAG_EXPORT_PREFER_NONXSL);
      return new StringConcatenation();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
