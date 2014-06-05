/**
 */
package org.xtext.passi.docGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.passi.docGen.TagName#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.passi.docGen.TagName#getRightName <em>Right Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.passi.docGen.DocGenPackage#getTagName()
 * @model
 * @generated
 */
public interface TagName extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.passi.docGen.DocGenPackage#getTagName_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.passi.docGen.TagName#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Right Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Name</em>' attribute.
   * @see #setRightName(String)
   * @see org.xtext.passi.docGen.DocGenPackage#getTagName_RightName()
   * @model
   * @generated
   */
  String getRightName();

  /**
   * Sets the value of the '{@link org.xtext.passi.docGen.TagName#getRightName <em>Right Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Name</em>' attribute.
   * @see #getRightName()
   * @generated
   */
  void setRightName(String value);

} // TagName
