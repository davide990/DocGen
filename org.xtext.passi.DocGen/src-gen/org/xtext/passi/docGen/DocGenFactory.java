/**
 */
package org.xtext.passi.docGen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.passi.docGen.DocGenPackage
 * @generated
 */
public interface DocGenFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DocGenFactory eINSTANCE = org.xtext.passi.docGen.impl.DocGenFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>element</em>'.
   * @generated
   */
  element createelement();

  /**
   * Returns a new object of class '<em>start Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>start Tag</em>'.
   * @generated
   */
  startTag createstartTag();

  /**
   * Returns a new object of class '<em>end Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>end Tag</em>'.
   * @generated
   */
  endTag createendTag();

  /**
   * Returns a new object of class '<em>empty Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>empty Element</em>'.
   * @generated
   */
  emptyElement createemptyElement();

  /**
   * Returns a new object of class '<em>prolog Tag</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>prolog Tag</em>'.
   * @generated
   */
  prologTag createprologTag();

  /**
   * Returns a new object of class '<em>Tag Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tag Name</em>'.
   * @generated
   */
  TagName createTagName();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DocGenPackage getDocGenPackage();

} //DocGenFactory
