package org.xtext.passi.generator;

import com.google.common.base.Objects;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.text.passi.generationUi.DocGenAdvancedUI;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xtext.passi.docGen.TagName;
import org.xtext.passi.docGen.element;
import org.xtext.passi.docGen.emptyElement;
import org.xtext.passi.generator.DocumentationBuilder;

@SuppressWarnings("all")
public class PdfBuilder extends DocumentationBuilder {
  private final Font titleFont = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD, new BaseColor(23, 54, 93));
  
  private final Font subtitleFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.ITALIC, new BaseColor(79, 129, 189));
  
  private final Font tableHeaderFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
  
  private final Font tableHeaderFont2 = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.ITALIC, BaseColor.LIGHT_GRAY);
  
  private Document document;
  
  public PdfBuilder(final org.w3c.dom.Document MetamodelDocument, final EList<element> ModelElementsList, final Hashtable HashTable, final String OutputFileName) {
    super(MetamodelDocument, ModelElementsList, HashTable, OutputFileName);
  }
  
  public StringConcatenation BuildDocumentation() {
    try {
      Document _document = new Document();
      this.document = _document;
      String _tempFilePath = DocumentationBuilder.getTempFilePath();
      String _plus = (_tempFilePath + File.separator);
      String _plus_1 = (_plus + "temp.pdf");
      FileOutputStream _fileOutputStream = new FileOutputStream(_plus_1);
      PdfWriter.getInstance(this.document, _fileOutputStream);
      this.document.open();
      Paragraph p = new Paragraph();
      Paragraph _paragraph = new Paragraph(" ");
      p.add(_paragraph);
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(this.documentationTitle);
      if (_isNullOrEmpty) {
        Paragraph _paragraph_1 = new Paragraph(this.outputFileName, this.titleFont);
        p.add(_paragraph_1);
      } else {
        Paragraph _paragraph_2 = new Paragraph(this.documentationTitle, this.titleFont);
        p.add(_paragraph_2);
      }
      if (this.titleSeparator) {
        LineSeparator _lineSeparator = new LineSeparator();
        Chunk _chunk = new Chunk(_lineSeparator);
        p.add(_chunk);
      }
      Paragraph _paragraph_3 = new Paragraph(" ");
      p.add(_paragraph_3);
      this.document.add(p);
      if (this.includeDiagramImage) {
        boolean _notEquals = (!Objects.equal(this.pathToDiagramImageToInclude, null));
        if (_notEquals) {
          this.insertDiagramImage();
        }
      }
      boolean _equals = Objects.equal(this.documentationStyle, DocGenAdvancedUI.DOCUMENTATION_STYLE.STYLE_BY_ECLASS);
      if (_equals) {
        this.BuildByEClassDocumentation(this.keyEClass);
      } else {
        this.BuildFullDocumentation();
      }
      this.document.close();
      return new StringConcatenation();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Build the documentation using the "Full documentation" style. Using this style, the documentation
   * will be composed by many tables, each one for a different EClass.
   */
  private void BuildFullDocumentation() {
    try {
      NodeList eClassifiers = this.metamodelDoc.getElementsByTagName("eClassifiers");
      int _length = eClassifiers.getLength();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer i : _doubleDotLessThan) {
        {
          Node _item = eClassifiers.item((i).intValue());
          Element currentEClassifier = Element.class.cast(_item);
          final String currentEClassName = currentEClassifier.getAttribute("name");
          boolean _contains = this.excludedEClasses.contains(currentEClassName);
          boolean _not = (!_contains);
          if (_not) {
            boolean _existsElementInModel = this.existsElementInModel(currentEClassName);
            if (_existsElementInModel) {
              NodeList eStructuralFeatureList = currentEClassifier.getElementsByTagName("eStructuralFeatures");
              ArrayList<Node> nodeList = new ArrayList<Node>();
              int _length_1 = eStructuralFeatureList.getLength();
              ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _length_1, true);
              for (final Integer k : _doubleDotLessThan_1) {
                Node _item_1 = eStructuralFeatureList.item((k).intValue());
                nodeList.add(_item_1);
              }
              List<Node> _superTypeFeatures = this.getSuperTypeFeatures(currentEClassifier);
              nodeList.addAll(_superTypeFeatures);
              Paragraph _paragraph = new Paragraph(currentEClassName, this.subtitleFont);
              this.document.add(_paragraph);
              Paragraph _paragraph_1 = new Paragraph(" ");
              this.document.add(_paragraph_1);
              int _size = nodeList.size();
              PdfPTable table = new PdfPTable(_size);
              this.buildTableHeaderForFullDocumentationStyle(currentEClassName, nodeList, table);
              this.buildTableForFullDocumentationStyle(currentEClassifier, nodeList, table);
              this.document.add(table);
              Paragraph _paragraph_2 = new Paragraph(" ");
              this.document.add(_paragraph_2);
              Paragraph _paragraph_3 = new Paragraph(" ");
              this.document.add(_paragraph_3);
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Add the header to a table, containing in each column the name of the EStructuralFeature of an EClass.
   * 
   * @param currentEClassName the name of the current EClass whose header must be created.
   * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
   * @param table the destination table.
   */
  private void buildTableHeaderForFullDocumentationStyle(final String currentEClassName, final ArrayList<Node> nodeList, final PdfPTable table) {
    int _size = nodeList.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer k : _doubleDotLessThan) {
      {
        Node _get = nodeList.get((k).intValue());
        Element currentEStructuralFeature = Element.class.cast(_get);
        StringBuilder _stringBuilder = new StringBuilder();
        StringBuilder _append = _stringBuilder.append(currentEClassName);
        StringBuilder _append_1 = _append.append("=>");
        String _attribute = currentEStructuralFeature.getAttribute("name");
        StringBuilder _append_2 = _append_1.append(_attribute);
        final String s = _append_2.toString();
        boolean _contains = this.excludedEStructuralFeatures.contains(s);
        boolean _not = (!_contains);
        if (_not) {
          String featName = currentEStructuralFeature.getAttribute("name");
          Phrase _phrase = new Phrase(featName, this.tableHeaderFont);
          PdfPCell tableCell = new PdfPCell(_phrase);
          tableCell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
          table.addCell(tableCell);
        }
      }
    }
  }
  
  /**
   * Build the table for the "Full documentation" style.
   * 
   * @param currentEClassifier the current EClass whose table must be created.
   * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
   * @param table the destination table.
   */
  private void buildTableForFullDocumentationStyle(final Element currentEClassifier, final ArrayList<Node> nodeList, final PdfPTable table) {
    int _length = ((Object[])Conversions.unwrapArray(this.modelElements, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer r : _doubleDotLessThan) {
      {
        boolean atLeastOneValueFound = false;
        ArrayList<PdfPCell> cellList = new ArrayList<PdfPCell>();
        int _size = nodeList.size();
        ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _size, true);
        for (final Integer k : _doubleDotLessThan_1) {
          {
            Node _get = nodeList.get((k).intValue());
            Element currentEStructuralFeature = Element.class.cast(_get);
            StringBuilder _stringBuilder = new StringBuilder();
            String _attribute = currentEClassifier.getAttribute("name");
            StringBuilder _append = _stringBuilder.append(_attribute);
            StringBuilder _append_1 = _append.append("=>");
            String _attribute_1 = currentEStructuralFeature.getAttribute("name");
            StringBuilder _append_2 = _append_1.append(_attribute_1);
            final String s = _append_2.toString();
            boolean _contains = this.excludedEStructuralFeatures.contains(s);
            boolean _not = (!_contains);
            if (_not) {
              String _attribute_2 = currentEClassifier.getAttribute("name");
              String _plus = (_attribute_2 + ":");
              String _attribute_3 = currentEStructuralFeature.getAttribute("name");
              String _plus_1 = (_plus + _attribute_3);
              String _plus_2 = (_plus_1 + ":");
              String _string = r.toString();
              String _plus_3 = (_plus_2 + _string);
              String key = new String(_plus_3);
              String tableVal = this.persistenceModelHashTable.get(key);
              boolean _notEquals = (!Objects.equal(tableVal, null));
              if (_notEquals) {
                atLeastOneValueFound = true;
                String _string_1 = tableVal.toString();
                Phrase _phrase = new Phrase(_string_1);
                PdfPCell tableCell = new PdfPCell(_phrase);
                tableCell.setHorizontalAlignment(com.itextpdf.text.Element.ALIGN_CENTER);
                cellList.add(tableCell);
              } else {
                PdfPCell _pdfPCell = new PdfPCell();
                cellList.add(_pdfPCell);
              }
            }
          }
        }
        if (atLeastOneValueFound) {
          for (final PdfPCell cell : cellList) {
            table.addCell(cell);
          }
        }
      }
    }
  }
  
  /**
   * Build the documentation using the "Ordered by EClass documentation" style.
   */
  private void BuildByEClassDocumentation(final String keyEClass) {
    NodeList eClassifiers = this.metamodelDoc.getElementsByTagName("eClassifiers");
    int _length = eClassifiers.getLength();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        Node _item = eClassifiers.item((i).intValue());
        Element currentEClassifier = Element.class.cast(_item);
        final String currentEClassName = currentEClassifier.getAttribute("name");
        boolean _equals = currentEClassName.equals(keyEClass);
        if (_equals) {
          NodeList eStructuralFeatureList = currentEClassifier.getElementsByTagName("eStructuralFeatures");
          ArrayList<Node> nodeList = new ArrayList<Node>();
          int _length_1 = eStructuralFeatureList.getLength();
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _length_1, true);
          for (final Integer k : _doubleDotLessThan_1) {
            Node _item_1 = eStructuralFeatureList.item((k).intValue());
            nodeList.add(_item_1);
          }
          List<Node> _superTypeFeatures = this.getSuperTypeFeatures(currentEClassifier);
          nodeList.addAll(_superTypeFeatures);
          String headerFieldName = this.headerFields.get(keyEClass);
          boolean _notEquals = (!Objects.equal(headerFieldName, null));
          if (_notEquals) {
            this.removeNodeFromNodeList(nodeList, headerFieldName);
          }
          this.buildTableForEClassOrderedDocumentation(currentEClassName, headerFieldName, nodeList);
          return;
        }
      }
    }
  }
  
  /**
   * Build the tables for the "ordered by EClass" documentation style.
   * 
   * @param currentEClassName the name of the current EClass whose header must be created.
   * @param headerFieldName the name of the feature whose value must be placed before the table.
   * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
   */
  private void buildTableForEClassOrderedDocumentation(final String currentEClassName, final String headerFieldName, final ArrayList<Node> nodeList) {
    try {
      int _length = ((Object[])Conversions.unwrapArray(this.modelElements, Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final Integer row : _doubleDotLessThan) {
        {
          PdfPTable table = new PdfPTable(2);
          boolean atLeastOneAttribute = false;
          element _get = this.modelElements.get((row).intValue());
          emptyElement ee = emptyElement.class.cast(_get);
          TagName _tagName = ee.getTagName();
          String tagName = _tagName.getRightName();
          boolean _equals = tagName.equals(this.keyEClass);
          if (_equals) {
            String feature_order = this.featureOrder.get(this.keyEClass);
            List<String> excludedFeature = this.excludedFeatures.get(this.keyEClass);
            boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(feature_order);
            boolean _not = (!_isNullOrEmpty);
            if (_not) {
              String[] _split = feature_order.split(",");
              for (final String f : _split) {
                boolean _or = false;
                boolean _isNullOrEmpty_1 = IterableExtensions.isNullOrEmpty(excludedFeature);
                if (_isNullOrEmpty_1) {
                  _or = true;
                } else {
                  boolean _contains = excludedFeature.contains(f);
                  boolean _not_1 = (!_contains);
                  _or = _not_1;
                }
                if (_or) {
                  boolean _equals_1 = headerFieldName.equals(f);
                  boolean _not_2 = (!_equals_1);
                  if (_not_2) {
                    boolean _addTableRow = this.addTableRow(table, currentEClassName, f, (row).intValue());
                    if (_addTableRow) {
                      atLeastOneAttribute = true;
                    }
                    this.removeNodeFromNodeList(nodeList, f);
                  }
                }
              }
            }
            int _length_1 = ((Object[])Conversions.unwrapArray(nodeList, Object.class)).length;
            ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _length_1, true);
            for (final Integer k : _doubleDotLessThan_1) {
              {
                Node _get_1 = nodeList.get((k).intValue());
                Element _cast = Element.class.cast(_get_1);
                final String currentFeatureName = _cast.getAttribute("name");
                boolean _or_1 = false;
                boolean _isNullOrEmpty_2 = IterableExtensions.isNullOrEmpty(excludedFeature);
                if (_isNullOrEmpty_2) {
                  _or_1 = true;
                } else {
                  boolean _contains_1 = excludedFeature.contains(currentFeatureName);
                  boolean _not_3 = (!_contains_1);
                  _or_1 = _not_3;
                }
                if (_or_1) {
                  boolean _addTableRow_1 = this.addTableRow(table, currentEClassName, currentFeatureName, (row).intValue());
                  if (_addTableRow_1) {
                    atLeastOneAttribute = true;
                  }
                }
              }
            }
          }
          if (atLeastOneAttribute) {
            Paragraph _paragraph = new Paragraph(currentEClassName, this.subtitleFont);
            this.document.add(_paragraph);
            Paragraph _paragraph_1 = new Paragraph(" ");
            this.document.add(_paragraph_1);
            this.addHeaderField((row).intValue());
            Paragraph _paragraph_2 = new Paragraph(" ");
            this.document.add(_paragraph_2);
            this.document.add(table);
            Paragraph _paragraph_3 = new Paragraph(" ");
            this.document.add(_paragraph_3);
            Paragraph _paragraph_4 = new Paragraph(" ");
            this.document.add(_paragraph_4);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Add the header field for a table.
   * 
   * @param rowIndex a row index in the persistence model.
   */
  private boolean addHeaderField(final int rowIndex) {
    try {
      boolean _xblockexpression = false;
      {
        String headerField = this.headerFields.get(this.keyEClass);
        boolean _xifexpression = false;
        boolean _notEquals = (!Objects.equal(headerField, null));
        if (_notEquals) {
          boolean _xblockexpression_1 = false;
          {
            String content = this.getHeaderFieldValue(this.keyEClass, headerField, rowIndex);
            boolean _xifexpression_1 = false;
            boolean _notEquals_1 = (!Objects.equal(content, null));
            if (_notEquals_1) {
              Paragraph _paragraph = new Paragraph(content, this.tableHeaderFont2);
              _xifexpression_1 = this.document.add(_paragraph);
            }
            _xblockexpression_1 = _xifexpression_1;
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private boolean addTableRow(final PdfPTable table, final String currentEClassName, final String currentFeatureName, final int rowIndex) {
    boolean atLeastOneAttribute = false;
    Phrase _phrase = new Phrase(currentFeatureName, this.tableHeaderFont);
    PdfPCell tableCell = new PdfPCell(_phrase);
    table.addCell(tableCell);
    String _string = Integer.valueOf(rowIndex).toString();
    String _plus = ((((currentEClassName + ":") + currentFeatureName) + ":") + _string);
    String key = new String(_plus);
    String tableVal = this.persistenceModelHashTable.get(key);
    boolean _notEquals = (!Objects.equal(tableVal, null));
    if (_notEquals) {
      String _string_1 = tableVal.toString();
      Phrase _phrase_1 = new Phrase(_string_1);
      PdfPCell _pdfPCell = new PdfPCell(_phrase_1);
      tableCell = _pdfPCell;
      table.addCell(tableCell);
      atLeastOneAttribute = true;
    } else {
      PdfPCell _pdfPCell_1 = new PdfPCell();
      table.addCell(_pdfPCell_1);
    }
    return atLeastOneAttribute;
  }
  
  public void insertDiagramImage() {
    try {
      Image image = Image.getInstance(this.pathToDiagramImageToInclude);
      Rectangle _pageSize = this.document.getPageSize();
      float _width = _pageSize.getWidth();
      float _leftMargin = this.document.leftMargin();
      float _minus = (_width - _leftMargin);
      float _rightMargin = this.document.rightMargin();
      float _minus_1 = (_minus - _rightMargin);
      float _width_1 = image.getWidth();
      float _divide = (_minus_1 / _width_1);
      float scaler = (_divide * 100);
      image.scalePercent(scaler);
      this.document.add(image);
      this.document.newPage();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
