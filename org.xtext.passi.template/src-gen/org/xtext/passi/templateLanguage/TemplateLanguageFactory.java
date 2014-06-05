/**
 */
package org.xtext.passi.templateLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.passi.templateLanguage.TemplateLanguagePackage
 * @generated
 */
public interface TemplateLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TemplateLanguageFactory eINSTANCE = org.xtext.passi.templateLanguage.impl.TemplateLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Template</em>'.
   * @generated
   */
  Template createTemplate();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Table Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Data</em>'.
   * @generated
   */
  TableData createTableData();

  /**
   * Returns a new object of class '<em>Table Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Section</em>'.
   * @generated
   */
  TableSection createTableSection();

  /**
   * Returns a new object of class '<em>Table Data Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table Data Attribute</em>'.
   * @generated
   */
  TableDataAttribute createTableDataAttribute();

  /**
   * Returns a new object of class '<em>List Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Attribute</em>'.
   * @generated
   */
  ListAttribute createListAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TemplateLanguagePackage getTemplateLanguagePackage();

} //TemplateLanguageFactory
