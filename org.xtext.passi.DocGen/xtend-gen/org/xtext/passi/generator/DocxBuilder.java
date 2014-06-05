package org.xtext.passi.generator;

import com.google.common.base.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.docx4j.jaxb.Context;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.wml.BooleanDefaultTrue;
import org.docx4j.wml.Br;
import org.docx4j.wml.CTBorder;
import org.docx4j.wml.HpsMeasure;
import org.docx4j.wml.ObjectFactory;
import org.docx4j.wml.P;
import org.docx4j.wml.R;
import org.docx4j.wml.RPr;
import org.docx4j.wml.STBorder;
import org.docx4j.wml.STBrType;
import org.docx4j.wml.Tbl;
import org.docx4j.wml.TblBorders;
import org.docx4j.wml.TblPr;
import org.docx4j.wml.Tc;
import org.docx4j.wml.Text;
import org.docx4j.wml.Tr;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.text.passi.generationUi.DocGenAdvancedUI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xtext.passi.docGen.TagName;
import org.xtext.passi.docGen.element;
import org.xtext.passi.docGen.emptyElement;
import org.xtext.passi.generator.DocumentationBuilder;
import org.xtext.passi.generator.Docx4jImageHandler;

@SuppressWarnings("all")
public class DocxBuilder extends DocumentationBuilder {
  private static ObjectFactory factory;
  
  protected WordprocessingMLPackage wordMLPackage;
  
  public DocxBuilder(final Document MetamodelDocument, final EList<element> ModelElementsList, final Hashtable HashTable, final String OutputFileName) {
    super(MetamodelDocument, ModelElementsList, HashTable, OutputFileName);
    ObjectFactory _wmlObjectFactory = Context.getWmlObjectFactory();
    DocxBuilder.factory = _wmlObjectFactory;
  }
  
  public StringConcatenation BuildDocumentation() {
    try {
      WordprocessingMLPackage _createPackage = WordprocessingMLPackage.createPackage();
      this.wordMLPackage = _createPackage;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(this.documentationTitle);
      if (_isNullOrEmpty) {
        MainDocumentPart _mainDocumentPart = this.wordMLPackage.getMainDocumentPart();
        _mainDocumentPart.addStyledParagraphOfText("Title", this.outputFileName);
      } else {
        MainDocumentPart _mainDocumentPart_1 = this.wordMLPackage.getMainDocumentPart();
        _mainDocumentPart_1.addStyledParagraphOfText("Title", this.documentationTitle);
      }
      boolean _notEquals = (!Objects.equal(this.pathToDiagramImageToInclude, null));
      if (_notEquals) {
        this.insertDiagramImage();
      }
      boolean _equals = Objects.equal(this.documentationStyle, DocGenAdvancedUI.DOCUMENTATION_STYLE.STYLE_BY_ECLASS);
      if (_equals) {
        this.BuildByEClassDocumentation(this.keyEClass);
      } else {
        this.BuildFullDocumentation();
      }
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
    NodeList eClassifiers = this.metamodelDoc.getElementsByTagName("eClassifiers");
    int _length = eClassifiers.getLength();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        Node _item = eClassifiers.item((i).intValue());
        Element currentEClassifier = Element.class.cast(_item);
        String _attribute = currentEClassifier.getAttribute("name");
        boolean _contains = this.excludedEClasses.contains(_attribute);
        boolean _not = (!_contains);
        if (_not) {
          String _attribute_1 = currentEClassifier.getAttribute("name");
          boolean _existsElementInModel = this.existsElementInModel(_attribute_1);
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
            MainDocumentPart _mainDocumentPart = this.wordMLPackage.getMainDocumentPart();
            String _attribute_2 = currentEClassifier.getAttribute("name");
            _mainDocumentPart.addStyledParagraphOfText("Header1", _attribute_2);
            Tbl tbl = DocxBuilder.factory.createTbl();
            this.buildTableHeaderForFullDocumentationStyle(currentEClassifier, nodeList, tbl);
            this.buildTableForFullDocumentationStyle(currentEClassifier, nodeList, tbl);
            Tbl _addBordersToTable = this.addBordersToTable(tbl);
            tbl = _addBordersToTable;
            MainDocumentPart _mainDocumentPart_1 = this.wordMLPackage.getMainDocumentPart();
            _mainDocumentPart_1.addObject(tbl);
            MainDocumentPart _mainDocumentPart_2 = this.wordMLPackage.getMainDocumentPart();
            Br _createBr = DocxBuilder.factory.createBr();
            _mainDocumentPart_2.addObject(_createBr);
            MainDocumentPart _mainDocumentPart_3 = this.wordMLPackage.getMainDocumentPart();
            Br _createBr_1 = DocxBuilder.factory.createBr();
            _mainDocumentPart_3.addObject(_createBr_1);
          }
        }
      }
    }
  }
  
  /**
   * Add the header to a table, containing in each column the name of the EStructuralFeature of an EClass.
   * 
   * @param currentEClassifier the current EClass whose header must be created.
   * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
   * @param tbl the destination table.
   */
  private boolean buildTableHeaderForFullDocumentationStyle(final Element currentEClassifier, final ArrayList<Node> nodeList, final Tbl tbl) {
    boolean _xblockexpression = false;
    {
      Tr tr = DocxBuilder.factory.createTr();
      int _size = nodeList.size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for (final Integer k : _doubleDotLessThan) {
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
            String featName = currentEStructuralFeature.getAttribute("name");
            List<Object> _content = tr.getContent();
            Tc _addStyledTableCell = this.addStyledTableCell(featName, true, null);
            _content.add(_addStyledTableCell);
          }
        }
      }
      List<Object> _content = tbl.getContent();
      _xblockexpression = _content.add(tr);
    }
    return _xblockexpression;
  }
  
  /**
   * Build the table for the "Full documentation" style.
   * 
   * @param currentEClassifier the current EClass whose table must be created.
   * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
   * @param tbl the destination table.
   */
  private void buildTableForFullDocumentationStyle(final Element currentEClassifier, final ArrayList<Node> nodeList, final Tbl tbl) {
    int _length = ((Object[])Conversions.unwrapArray(this.modelElements, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer row : _doubleDotLessThan) {
      {
        boolean atLeastOneValueFound = false;
        Tr tr = DocxBuilder.factory.createTr();
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
              String _string = row.toString();
              String _plus_3 = (_plus_2 + _string);
              String key = new String(_plus_3);
              String tableVal = this.persistenceModelHashTable.get(key);
              boolean _notEquals = (!Objects.equal(tableVal, null));
              if (_notEquals) {
                atLeastOneValueFound = true;
                List<Object> _content = tr.getContent();
                String _cast = String.class.cast(tableVal);
                Tc _createTableCell = this.createTableCell(this.wordMLPackage, _cast);
                _content.add(_createTableCell);
              } else {
                List<Object> _content_1 = tr.getContent();
                Tc _createTableCell_1 = this.createTableCell(this.wordMLPackage, "");
                _content_1.add(_createTableCell_1);
              }
            }
          }
        }
        if (atLeastOneValueFound) {
          List<Object> _content = tbl.getContent();
          _content.add(tr);
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
          this.buildTableForEClassOrderedDocumentation(currentEClassifier, nodeList);
          return;
        }
      }
    }
    this.saveTempDocxFile();
  }
  
  /**
   * Build the tables for the "ordered by EClass" documentation style.
   * 
   * @param currentEClassifier the current EClass whose header must be created.
   * @param nodeList a data structure containing the EStructuralFeatures of the specified EClass.
   */
  private void buildTableForEClassOrderedDocumentation(final Element currentEClassifier, final ArrayList<Node> nodeList) {
    int _length = ((Object[])Conversions.unwrapArray(this.modelElements, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer row : _doubleDotLessThan) {
      {
        Tbl tbl = DocxBuilder.factory.createTbl();
        boolean atLeastOneAttribute = false;
        element _get = this.modelElements.get((row).intValue());
        emptyElement ee = emptyElement.class.cast(_get);
        TagName _tagName = ee.getTagName();
        String tagName = _tagName.getRightName();
        boolean _equals = tagName.equals(this.keyEClass);
        if (_equals) {
          int _length_1 = ((Object[])Conversions.unwrapArray(nodeList, Object.class)).length;
          ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, _length_1, true);
          for (final Integer k : _doubleDotLessThan_1) {
            {
              final String EClassName = currentEClassifier.getAttribute("name");
              Node _get_1 = nodeList.get((k).intValue());
              Element _cast = Element.class.cast(_get_1);
              final String currentFeatureName = _cast.getAttribute("name");
              final String headerFeature = this.headerFields.get(EClassName);
              boolean _or = false;
              boolean _equals_1 = Objects.equal(headerFeature, null);
              if (_equals_1) {
                _or = true;
              } else {
                boolean _equals_2 = headerFeature.equals(currentFeatureName);
                boolean _not = (!_equals_2);
                _or = _not;
              }
              if (_or) {
                Tr newRow = this.addTableRow(EClassName, currentFeatureName, (row).intValue());
                boolean _notEquals = (!Objects.equal(newRow, null));
                if (_notEquals) {
                  atLeastOneAttribute = true;
                  List<Object> _content = tbl.getContent();
                  _content.add(newRow);
                } else {
                  Tr _createTr = DocxBuilder.factory.createTr();
                  newRow = _createTr;
                  List<Object> _content_1 = newRow.getContent();
                  Tc _addStyledTableCell = this.addStyledTableCell(currentFeatureName, true, null);
                  _content_1.add(_addStyledTableCell);
                  List<Object> _content_2 = newRow.getContent();
                  Tc _createTableCell = this.createTableCell(this.wordMLPackage, "");
                  _content_2.add(_createTableCell);
                }
              }
            }
          }
          if (this.tableBorder) {
            Tbl _addBordersToTable = this.addBordersToTable(tbl);
            tbl = _addBordersToTable;
          }
        }
        if (atLeastOneAttribute) {
          MainDocumentPart _mainDocumentPart = this.wordMLPackage.getMainDocumentPart();
          String _attribute = currentEClassifier.getAttribute("name");
          _mainDocumentPart.addStyledParagraphOfText("Subtitle", _attribute);
          this.addHeaderField((row).intValue());
          MainDocumentPart _mainDocumentPart_1 = this.wordMLPackage.getMainDocumentPart();
          _mainDocumentPart_1.addObject(tbl);
          MainDocumentPart _mainDocumentPart_2 = this.wordMLPackage.getMainDocumentPart();
          Br _createBr = DocxBuilder.factory.createBr();
          _mainDocumentPart_2.addObject(_createBr);
          MainDocumentPart _mainDocumentPart_3 = this.wordMLPackage.getMainDocumentPart();
          Br _createBr_1 = DocxBuilder.factory.createBr();
          _mainDocumentPart_3.addObject(_createBr_1);
        }
      }
    }
  }
  
  /**
   * Add the header field for a table.
   * 
   * @param rowIndex a row index in the persistence model.
   */
  private P addHeaderField(final int rowIndex) {
    P _xblockexpression = null;
    {
      String headerField = this.headerFields.get(this.keyEClass);
      P _xifexpression = null;
      boolean _notEquals = (!Objects.equal(headerField, null));
      if (_notEquals) {
        P _xblockexpression_1 = null;
        {
          String content = this.getHeaderFieldValue(this.keyEClass, headerField, rowIndex);
          P _xifexpression_1 = null;
          boolean _notEquals_1 = (!Objects.equal(content, null));
          if (_notEquals_1) {
            MainDocumentPart _mainDocumentPart = this.wordMLPackage.getMainDocumentPart();
            _xifexpression_1 = _mainDocumentPart.addStyledParagraphOfText("Header2", content);
          }
          _xblockexpression_1 = _xifexpression_1;
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  private Tr addTableRow(final String currentEClassName, final String currentFeatureName, final int rowIndex) {
    Tr tr = DocxBuilder.factory.createTr();
    List<Object> _content = tr.getContent();
    Tc _addStyledTableCell = this.addStyledTableCell(currentFeatureName, true, null);
    _content.add(_addStyledTableCell);
    String _string = Integer.valueOf(rowIndex).toString();
    String _plus = ((((currentEClassName + ":") + currentFeatureName) + ":") + _string);
    String key = new String(_plus);
    String tableVal = this.persistenceModelHashTable.get(key);
    boolean _notEquals = (!Objects.equal(tableVal, null));
    if (_notEquals) {
      List<Object> _content_1 = tr.getContent();
      String _cast = String.class.cast(tableVal);
      Tc _createTableCell = this.createTableCell(this.wordMLPackage, _cast);
      _content_1.add(_createTableCell);
      return tr;
    } else {
      return null;
    }
  }
  
  public void insertDiagramImage() {
    try {
      Docx4jImageHandler.addImageToPackage(this.wordMLPackage, this.pathToDiagramImageToInclude);
      Br objBr = new Br();
      objBr.setType(STBrType.PAGE);
      MainDocumentPart _mainDocumentPart = this.wordMLPackage.getMainDocumentPart();
      _mainDocumentPart.addObject(objBr);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Save the documentation temp file into the project src-gen folder.
   * The saved file will be used to copy it's content into the final project documentation file,
   * that will be visible into the package explorer in Eclipse.
   */
  private void saveTempDocxFile() {
    try {
      String _tempFilePath = DocumentationBuilder.getTempFilePath();
      String _plus = (_tempFilePath + File.separator);
      String _plus_1 = (_plus + "temp.docx");
      File f = new File(_plus_1);
      this.wordMLPackage.save(f);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Thanks to lvdpal (http://blog.iprofs.nl/2012/09/06/creating-word-documents-with-docx4j/)
   */
  private Tbl addBordersToTable(final Tbl table) {
    TblPr _tblPr = new TblPr();
    table.setTblPr(_tblPr);
    CTBorder border = new CTBorder();
    border.setColor("auto");
    BigInteger _bigInteger = new BigInteger("4");
    border.setSz(_bigInteger);
    BigInteger _bigInteger_1 = new BigInteger("0");
    border.setSpace(_bigInteger_1);
    border.setVal(STBorder.SINGLE);
    TblBorders borders = new TblBorders();
    borders.setBottom(border);
    borders.setLeft(border);
    borders.setRight(border);
    borders.setTop(border);
    borders.setInsideH(border);
    borders.setInsideV(border);
    TblPr _tblPr_1 = table.getTblPr();
    _tblPr_1.setTblBorders(borders);
    return table;
  }
  
  /**
   * In this method, we once again create a regular cell, as in the previous
   *  examples.
   */
  private Tc createTableCell(final WordprocessingMLPackage pack, final String content) {
    Tc tableCell = DocxBuilder.factory.createTc();
    List<Object> _content = tableCell.getContent();
    MainDocumentPart _mainDocumentPart = pack.getMainDocumentPart();
    P _createParagraphOfText = _mainDocumentPart.createParagraphOfText(content);
    _content.add(_createParagraphOfText);
    return tableCell;
  }
  
  /**
   * Thanks to lvdpal (http://blog.iprofs.nl/2012/09/06/creating-word-documents-with-docx4j/)
   */
  private Tc addStyledTableCell(final String content, final boolean bold, final String fontSize) {
    Tc tableCell = DocxBuilder.factory.createTc();
    List<Object> _content = tableCell.getContent();
    P _addStyling = this.addStyling(tableCell, content, bold, fontSize);
    _content.add(_addStyling);
    return tableCell;
  }
  
  /**
   * Thanks to lvdpal (http://blog.iprofs.nl/2012/09/06/creating-word-documents-with-docx4j/)
   */
  private P addStyling(final Tc tableCell, final String content, final boolean bold, final String fontSize) {
    P paragraph = DocxBuilder.factory.createP();
    Text text = DocxBuilder.factory.createText();
    text.setValue(content);
    R run = DocxBuilder.factory.createR();
    List<Object> _content = run.getContent();
    _content.add(text);
    List<Object> _content_1 = paragraph.getContent();
    _content_1.add(run);
    RPr runProperties = DocxBuilder.factory.createRPr();
    if (bold) {
      RPr _addBoldStyle = this.addBoldStyle(runProperties);
      runProperties = _addBoldStyle;
    }
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(fontSize, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _isEmpty = fontSize.isEmpty();
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    if (_and) {
      RPr _setFontSize = this.setFontSize(runProperties, fontSize);
      runProperties = _setFontSize;
    }
    run.setRPr(runProperties);
    return paragraph;
  }
  
  /**
   * In this method we're going to add the font size information to the run
   *  properties. First we'll create a half-point measurement. Then we'll
   *  set the fontSize as the value of this measurement. Finally we'll set
   *  the non-complex and complex script font sizes, sz and szCs respectively.
   */
  private RPr setFontSize(final RPr runProperties, final String fontSize) {
    HpsMeasure size = new HpsMeasure();
    BigInteger _bigInteger = new BigInteger(fontSize);
    size.setVal(_bigInteger);
    runProperties.setSz(size);
    runProperties.setSzCs(size);
    return runProperties;
  }
  
  /**
   * In this method we'll add the bold property to the run properties.
   *  BooleanDefaultTrue is the Docx4j object for the b property.
   *  Technically we wouldn't have to set the value to true, as this is
   *  the default.
   */
  private RPr addBoldStyle(final RPr runProperties) {
    BooleanDefaultTrue b = new BooleanDefaultTrue();
    b.setVal(Boolean.valueOf(true));
    runProperties.setB(b);
    return runProperties;
  }
}
