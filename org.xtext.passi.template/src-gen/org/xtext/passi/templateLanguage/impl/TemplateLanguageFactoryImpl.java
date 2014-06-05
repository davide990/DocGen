/**
 */
package org.xtext.passi.templateLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.passi.templateLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemplateLanguageFactoryImpl extends EFactoryImpl implements TemplateLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TemplateLanguageFactory init()
  {
    try
    {
      TemplateLanguageFactory theTemplateLanguageFactory = (TemplateLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(TemplateLanguagePackage.eNS_URI);
      if (theTemplateLanguageFactory != null)
      {
        return theTemplateLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TemplateLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TemplateLanguagePackage.TEMPLATE: return createTemplate();
      case TemplateLanguagePackage.FEATURE: return createFeature();
      case TemplateLanguagePackage.TABLE_DATA: return createTableData();
      case TemplateLanguagePackage.TABLE_SECTION: return createTableSection();
      case TemplateLanguagePackage.TABLE_DATA_ATTRIBUTE: return createTableDataAttribute();
      case TemplateLanguagePackage.LIST_ATTRIBUTE: return createListAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template createTemplate()
  {
    TemplateImpl template = new TemplateImpl();
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableData createTableData()
  {
    TableDataImpl tableData = new TableDataImpl();
    return tableData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableSection createTableSection()
  {
    TableSectionImpl tableSection = new TableSectionImpl();
    return tableSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TableDataAttribute createTableDataAttribute()
  {
    TableDataAttributeImpl tableDataAttribute = new TableDataAttributeImpl();
    return tableDataAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListAttribute createListAttribute()
  {
    ListAttributeImpl listAttribute = new ListAttributeImpl();
    return listAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateLanguagePackage getTemplateLanguagePackage()
  {
    return (TemplateLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TemplateLanguagePackage getPackage()
  {
    return TemplateLanguagePackage.eINSTANCE;
  }

} //TemplateLanguageFactoryImpl
