package org.xtext.passi.generator;

import com.google.common.base.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.text.passi.generationUi.DocGenAdvancedUI;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xtext.passi.docGen.TagName;
import org.xtext.passi.docGen.element;
import org.xtext.passi.docGen.emptyElement;
import org.xtext.passi.metamodels.MetamodelsLoader;

/**
 * Abstract class that define the behaviour of the documentation builder. It
 * also contains methods to help the user to build the documentation.
 */
@SuppressWarnings("all")
public abstract class DocumentationBuilder {
  /**
   * The document representing the metamodel.
   */
  protected Document metamodelDoc;
  
  /**
   * The set of current model's elements.
   */
  protected EList<element> modelElements;
  
  /**
   * The list of the EClasses that must not be included in the final documentation
   */
  protected List<String> excludedEClasses;
  
  /**
   * The list of the Features(of all EClasses) that must not be included in the final documentation
   */
  protected List<String> excludedEStructuralFeatures;
  
  /**
   * The output documentation file name, without the extension.
   */
  protected String outputFileName;
  
  /**
   * The absolute path to the diagram image file to include into the documentation
   */
  protected String pathToDiagramImageToInclude;
  
  protected String templateTitle;
  
  protected String supportedExtension;
  
  protected String documentationTitle;
  
  protected String diagramImageFile;
  
  protected DocGenAdvancedUI.DOCUMENTATION_STYLE documentationStyle;
  
  protected String keyEClass;
  
  protected boolean tableBorder;
  
  protected boolean titleSeparator;
  
  protected boolean includeDiagramImage;
  
  protected HashMap<String,List<String>> excludedFeatures;
  
  protected HashMap<String,String> featureOrder;
  
  protected HashMap<String,String> headerFields;
  
  protected Hashtable<String,String> persistenceModelHashTable;
  
  /**
   * Initialize a new DocBuilder object
   * 
   * @param outFolder the output folder where the document will be generated
   * @param outFileName the file name of the output documentation file
   * @param MetamodelDocument the metamodel xml document
   * @param ModelElementsList the set of elements in the model document
   * @param Hashtable the data structure needed to build the documentation
   */
  public DocumentationBuilder(final Document MetamodelDocument, final EList<element> ModelElementsList, final Hashtable<String,String> persistenceModelHashTable, final String OutputFileName) {
    this.metamodelDoc = MetamodelDocument;
    this.modelElements = ModelElementsList;
    this.persistenceModelHashTable = persistenceModelHashTable;
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.excludedEClasses = _arrayList;
    ArrayList<String> _arrayList_1 = new ArrayList<String>();
    this.excludedEStructuralFeatures = _arrayList_1;
    String _removeExtension = FilenameUtils.removeExtension(OutputFileName);
    this.outputFileName = _removeExtension;
    this.pathToDiagramImageToInclude = null;
    HashMap<String,String> _hashMap = new HashMap<String, String>();
    this.featureOrder = _hashMap;
    HashMap<String,String> _hashMap_1 = new HashMap<String, String>();
    this.headerFields = _hashMap_1;
    HashMap<String,List<String>> _hashMap_2 = new HashMap<String, List<String>>();
    this.excludedFeatures = _hashMap_2;
    this.documentationStyle = DocGenAdvancedUI.DOCUMENTATION_STYLE.STYLE_FULL;
  }
  
  public HashMap<String,String> setFeaturesOrder(final HashMap<String,String> s) {
    return this.featureOrder = s;
  }
  
  public HashMap<String,List<String>> setExcludedFeatures(final HashMap<String,List<String>> s) {
    return this.excludedFeatures = s;
  }
  
  public String setTemplateTitle(final String s) {
    return this.templateTitle = s;
  }
  
  public String setSupportedExtension(final String s) {
    return this.supportedExtension = s;
  }
  
  public String setDocumentationTitle(final String s) {
    return this.documentationTitle = s;
  }
  
  public boolean setTitleSeparator(final boolean v) {
    return this.titleSeparator = v;
  }
  
  public boolean setIncludeDiagramImage(final boolean v) {
    return this.includeDiagramImage = v;
  }
  
  public String setDiagramImageFile(final String s) {
    return this.diagramImageFile = s;
  }
  
  public DocGenAdvancedUI.DOCUMENTATION_STYLE setDocumentationStyle(final DocGenAdvancedUI.DOCUMENTATION_STYLE s) {
    return this.documentationStyle = s;
  }
  
  public String setKeyEClass(final String s) {
    return this.keyEClass = s;
  }
  
  public boolean setTableBorder(final boolean v) {
    return this.tableBorder = v;
  }
  
  public String AddFeatureOrderForEClass(final String EClass, final String FeatureOrder) {
    return this.featureOrder.put(EClass, FeatureOrder);
  }
  
  public void AddExcludedFeatureForEClass(final String EClass, final String FeatureName) {
    List<String> excludedFeaturesList = this.excludedFeatures.get(EClass);
    boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(excludedFeaturesList);
    if (_isNullOrEmpty) {
      ArrayList<String> _arrayList = new ArrayList<String>();
      excludedFeaturesList = _arrayList;
      excludedFeaturesList.add(FeatureName);
      this.excludedFeatures.put(EClass, excludedFeaturesList);
      return;
    }
    boolean _contains = excludedFeaturesList.contains(FeatureName);
    if (_contains) {
      return;
    }
    excludedFeaturesList.add(FeatureName);
    this.excludedFeatures.remove(EClass);
    this.excludedFeatures.put(EClass, excludedFeaturesList);
  }
  
  public String setHeaderFieldForEClass(final String EClass, final String featureName) {
    return this.headerFields.put(EClass, featureName);
  }
  
  /**
   * Set the list of EClass that must not be included in the final documentation.
   */
  public boolean SetExcludedEClasses(final List<String> c) {
    boolean _xblockexpression = false;
    {
      this.excludedEClasses.clear();
      _xblockexpression = this.excludedEClasses.addAll(c);
    }
    return _xblockexpression;
  }
  
  protected Node removeNodeFromNodeList(final List<Node> list, final String attributeName) {
    Node _xblockexpression = null;
    {
      int toRemoveID = (-1);
      int _length = ((Object[])Conversions.unwrapArray(list, Object.class)).length;
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final int id : _doubleDotLessThan) {
        Node _get = list.get(id);
        Element _cast = Element.class.cast(_get);
        String _attribute = _cast.getAttribute("name");
        boolean _equals = _attribute.equals(attributeName);
        if (_equals) {
          toRemoveID = id;
        }
      }
      Node _xifexpression = null;
      if ((toRemoveID != (-1))) {
        _xifexpression = list.remove(toRemoveID);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected String getHeaderFieldValue(final String currentEClassName, final String currentFeatureName, final int rowIndex) {
    String _string = Integer.valueOf(rowIndex).toString();
    String _plus = ((((currentEClassName + ":") + currentFeatureName) + ":") + _string);
    String key = new String(_plus);
    String value = this.persistenceModelHashTable.get(key);
    boolean _notEquals = (!Objects.equal(value, null));
    if (_notEquals) {
      return value.toString();
    }
    return null;
  }
  
  /**
   * Set the path to the diagram image file to include in the output documentation.
   */
  public String setPathToDiagramImageFileToInclude(final String path) {
    String _xifexpression = null;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(path, null));
    if (!_notEquals) {
      _and = false;
    } else {
      boolean _isEmpty = path.isEmpty();
      boolean _not = (!_isEmpty);
      _and = _not;
    }
    if (_and) {
      _xifexpression = this.pathToDiagramImageToInclude = path;
    }
    return _xifexpression;
  }
  
  /**
   * This method define the template for the documentation. Put into this method all
   * the necessary information (in form of string into a StringConcatenation object)
   * that make up the final documentation.
   */
  public abstract StringConcatenation BuildDocumentation();
  
  /**
   * An abstract method that handle the diagram image insertion
   * into the documentation. This task depends on the type of the
   * output documentation.
   */
  public abstract void insertDiagramImage();
  
  /**
   * Check if in the current model document exists an element corresponding
   * to the EClass specified by the EClassifierName string value
   */
  protected boolean existsElementInModel(final String EClassifierName) {
    int _length = ((Object[])Conversions.unwrapArray(this.modelElements, Object.class)).length;
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        element _get = this.modelElements.get((i).intValue());
        emptyElement ee = emptyElement.class.cast(_get);
        TagName _tagName = ee.getTagName();
        String _rightName = _tagName.getRightName();
        boolean _equals = _rightName.equals(EClassifierName);
        if (_equals) {
          return true;
        }
      }
    }
    return false;
  }
  
  /**
   * Return a list containing all the features of the input EClass and
   * of all the parents EClass.
   */
  protected List<Node> getSuperTypeFeatures(final Element eclassifier) {
    ArrayList<Node> nodeList = new ArrayList<Node>();
    String superTypeString = eclassifier.getAttribute("eSuperTypes");
    boolean _isEmpty = superTypeString.isEmpty();
    if (_isEmpty) {
      return nodeList;
    }
    LinkedList<String> superTypesList = DocumentationBuilder.parseSuperTypesString(superTypeString);
    for (final String superType : superTypesList) {
      {
        Element eClassifier = this.getEClassByName(superType);
        boolean _notEquals = (!Objects.equal(eClassifier, null));
        if (_notEquals) {
          NodeList eStructuralFeatureList = eClassifier.getElementsByTagName("eStructuralFeatures");
          int _length = eStructuralFeatureList.getLength();
          ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
          for (final Integer k : _doubleDotLessThan) {
            Node _item = eStructuralFeatureList.item((k).intValue());
            nodeList.add(_item);
          }
          Element _eClassByName = this.getEClassByName(superType);
          List<Node> _superTypeFeatures = this.getSuperTypeFeatures(_eClassByName);
          nodeList.addAll(_superTypeFeatures);
        }
      }
    }
    return nodeList;
  }
  
  /**
   * Given a tag name from the model, that is, "Actor" for the
   * following example:
   * <pre>
   * {@code
   * <passiseq:Actor name="NewActor1" List_RAMessagesOut="/3"/>
   * }
   * </pre>
   * search for an EClass in the metamodel that has the same name.
   * 
   * @return the corresponding EClass element in the metamodel. If no EClass is found, return null.
   */
  protected Element getEClassByName(final String tagName) {
    NodeList listEclassifier = this.metamodelDoc.getElementsByTagName("eClassifiers");
    int length = listEclassifier.getLength();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, length, true);
    for (final Integer i : _doubleDotLessThan) {
      {
        Node _item = listEclassifier.item((i).intValue());
        Element node = Element.class.cast(_item);
        String name = node.getAttribute("name");
        boolean _equals = name.equals(tagName);
        if (_equals) {
          return node;
        }
      }
    }
    return null;
  }
  
  /**
   * Given a string s that represents the super type value of the
   * attribute of a EClass, for example
   * 
   * <pre>
   * eSuperTypes="#//Partecipant/Actor/"
   * </pre>
   * 
   * Parse the string and return a list containing the parent Eclasses.
   * For the previous example, the returned list contains
   * "Partecipant" and "Actor" strings.
   */
  public static LinkedList<String> parseSuperTypesString(final String s) {
    LinkedList<String> l = new LinkedList<String>();
    String newString = s.substring(2);
    String[] SplittedString = newString.split("/");
    for (final String word : SplittedString) {
      boolean _isEmpty = word.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        l.add(word);
      }
    }
    return l;
  }
  
  /**
   * Get the absolute file system path to the folder where the temp output
   * documentation file will be saved.
   * <br></br>
   * The folder name is project root directory
   */
  public static String getTempFilePath() {
    IWorkspace _workspace = ResourcesPlugin.getWorkspace();
    IWorkspaceRoot root = _workspace.getRoot();
    IProject project = root.getProject(MetamodelsLoader.ProjectName);
    IPath _location = root.getLocation();
    File _file = _location.toFile();
    String _string = _file.toString();
    String _plus = (_string + 
      File.separator);
    String _name = project.getName();
    return (_plus + _name);
  }
}
