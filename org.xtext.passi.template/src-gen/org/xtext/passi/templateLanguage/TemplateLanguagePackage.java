/**
 */
package org.xtext.passi.templateLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.passi.templateLanguage.TemplateLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface TemplateLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "templateLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/passi/TemplateLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "templateLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TemplateLanguagePackage eINSTANCE = org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.passi.templateLanguage.impl.TemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.templateLanguage.impl.TemplateImpl
   * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getTemplate()
   * @generated
   */
  int TEMPLATE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__FEATURES = 1;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.passi.templateLanguage.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.templateLanguage.impl.FeatureImpl
   * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.passi.templateLanguage.impl.TableDataImpl <em>Table Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.templateLanguage.impl.TableDataImpl
   * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getTableData()
   * @generated
   */
  int TABLE_DATA = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DATA__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DATA__VALUE = FEATURE__VALUE;

  /**
   * The feature id for the '<em><b>Table Data Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DATA__TABLE_DATA_ATTRIBUTES = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DATA__SECTIONS = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Table Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DATA_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.passi.templateLanguage.impl.TableSectionImpl <em>Table Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.templateLanguage.impl.TableSectionImpl
   * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getTableSection()
   * @generated
   */
  int TABLE_SECTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_SECTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_SECTION__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>Table Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_SECTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.passi.templateLanguage.impl.TableDataAttributeImpl <em>Table Data Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.templateLanguage.impl.TableDataAttributeImpl
   * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getTableDataAttribute()
   * @generated
   */
  int TABLE_DATA_ATTRIBUTE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DATA_ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DATA_ATTRIBUTE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Table Data Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_DATA_ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.passi.templateLanguage.impl.ListAttributeImpl <em>List Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.templateLanguage.impl.ListAttributeImpl
   * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getListAttribute()
   * @generated
   */
  int LIST_ATTRIBUTE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ATTRIBUTE__NAME = TABLE_DATA_ATTRIBUTE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ATTRIBUTE__VALUE = TABLE_DATA_ATTRIBUTE__VALUE;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ATTRIBUTE__VALUES = TABLE_DATA_ATTRIBUTE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ATTRIBUTE_FEATURE_COUNT = TABLE_DATA_ATTRIBUTE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.passi.templateLanguage.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see org.xtext.passi.templateLanguage.Template
   * @generated
   */
  EClass getTemplate();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.templateLanguage.Template#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.passi.templateLanguage.Template#getName()
   * @see #getTemplate()
   * @generated
   */
  EAttribute getTemplate_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.passi.templateLanguage.Template#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see org.xtext.passi.templateLanguage.Template#getFeatures()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_Features();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.templateLanguage.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see org.xtext.passi.templateLanguage.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.templateLanguage.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.passi.templateLanguage.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.templateLanguage.Feature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.passi.templateLanguage.Feature#getValue()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.templateLanguage.TableData <em>Table Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Data</em>'.
   * @see org.xtext.passi.templateLanguage.TableData
   * @generated
   */
  EClass getTableData();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.passi.templateLanguage.TableData#getTableDataAttributes <em>Table Data Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Table Data Attributes</em>'.
   * @see org.xtext.passi.templateLanguage.TableData#getTableDataAttributes()
   * @see #getTableData()
   * @generated
   */
  EReference getTableData_TableDataAttributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.passi.templateLanguage.TableData#getSections <em>Sections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sections</em>'.
   * @see org.xtext.passi.templateLanguage.TableData#getSections()
   * @see #getTableData()
   * @generated
   */
  EReference getTableData_Sections();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.templateLanguage.TableSection <em>Table Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Section</em>'.
   * @see org.xtext.passi.templateLanguage.TableSection
   * @generated
   */
  EClass getTableSection();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.templateLanguage.TableSection#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.passi.templateLanguage.TableSection#getName()
   * @see #getTableSection()
   * @generated
   */
  EAttribute getTableSection_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.passi.templateLanguage.TableSection#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.passi.templateLanguage.TableSection#getAttributes()
   * @see #getTableSection()
   * @generated
   */
  EReference getTableSection_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.templateLanguage.TableDataAttribute <em>Table Data Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Data Attribute</em>'.
   * @see org.xtext.passi.templateLanguage.TableDataAttribute
   * @generated
   */
  EClass getTableDataAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.templateLanguage.TableDataAttribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.passi.templateLanguage.TableDataAttribute#getName()
   * @see #getTableDataAttribute()
   * @generated
   */
  EAttribute getTableDataAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.templateLanguage.TableDataAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.passi.templateLanguage.TableDataAttribute#getValue()
   * @see #getTableDataAttribute()
   * @generated
   */
  EAttribute getTableDataAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.templateLanguage.ListAttribute <em>List Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Attribute</em>'.
   * @see org.xtext.passi.templateLanguage.ListAttribute
   * @generated
   */
  EClass getListAttribute();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.passi.templateLanguage.ListAttribute#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.xtext.passi.templateLanguage.ListAttribute#getValues()
   * @see #getListAttribute()
   * @generated
   */
  EAttribute getListAttribute_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TemplateLanguageFactory getTemplateLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.passi.templateLanguage.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.templateLanguage.impl.TemplateImpl
     * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getTemplate()
     * @generated
     */
    EClass TEMPLATE = eINSTANCE.getTemplate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE__NAME = eINSTANCE.getTemplate_Name();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__FEATURES = eINSTANCE.getTemplate_Features();

    /**
     * The meta object literal for the '{@link org.xtext.passi.templateLanguage.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.templateLanguage.impl.FeatureImpl
     * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__VALUE = eINSTANCE.getFeature_Value();

    /**
     * The meta object literal for the '{@link org.xtext.passi.templateLanguage.impl.TableDataImpl <em>Table Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.templateLanguage.impl.TableDataImpl
     * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getTableData()
     * @generated
     */
    EClass TABLE_DATA = eINSTANCE.getTableData();

    /**
     * The meta object literal for the '<em><b>Table Data Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_DATA__TABLE_DATA_ATTRIBUTES = eINSTANCE.getTableData_TableDataAttributes();

    /**
     * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_DATA__SECTIONS = eINSTANCE.getTableData_Sections();

    /**
     * The meta object literal for the '{@link org.xtext.passi.templateLanguage.impl.TableSectionImpl <em>Table Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.templateLanguage.impl.TableSectionImpl
     * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getTableSection()
     * @generated
     */
    EClass TABLE_SECTION = eINSTANCE.getTableSection();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_SECTION__NAME = eINSTANCE.getTableSection_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE_SECTION__ATTRIBUTES = eINSTANCE.getTableSection_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.passi.templateLanguage.impl.TableDataAttributeImpl <em>Table Data Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.templateLanguage.impl.TableDataAttributeImpl
     * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getTableDataAttribute()
     * @generated
     */
    EClass TABLE_DATA_ATTRIBUTE = eINSTANCE.getTableDataAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_DATA_ATTRIBUTE__NAME = eINSTANCE.getTableDataAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE_DATA_ATTRIBUTE__VALUE = eINSTANCE.getTableDataAttribute_Value();

    /**
     * The meta object literal for the '{@link org.xtext.passi.templateLanguage.impl.ListAttributeImpl <em>List Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.templateLanguage.impl.ListAttributeImpl
     * @see org.xtext.passi.templateLanguage.impl.TemplateLanguagePackageImpl#getListAttribute()
     * @generated
     */
    EClass LIST_ATTRIBUTE = eINSTANCE.getListAttribute();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_ATTRIBUTE__VALUES = eINSTANCE.getListAttribute_Values();

  }

} //TemplateLanguagePackage
