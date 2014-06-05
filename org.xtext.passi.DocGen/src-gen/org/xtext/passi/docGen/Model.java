/**
 */
package org.xtext.passi.docGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.passi.docGen.Model#getProlog <em>Prolog</em>}</li>
 *   <li>{@link org.xtext.passi.docGen.Model#getXmldoc <em>Xmldoc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.passi.docGen.DocGenPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Prolog</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prolog</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prolog</em>' containment reference.
   * @see #setProlog(prologTag)
   * @see org.xtext.passi.docGen.DocGenPackage#getModel_Prolog()
   * @model containment="true"
   * @generated
   */
  prologTag getProlog();

  /**
   * Sets the value of the '{@link org.xtext.passi.docGen.Model#getProlog <em>Prolog</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prolog</em>' containment reference.
   * @see #getProlog()
   * @generated
   */
  void setProlog(prologTag value);

  /**
   * Returns the value of the '<em><b>Xmldoc</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.passi.docGen.element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xmldoc</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xmldoc</em>' containment reference list.
   * @see org.xtext.passi.docGen.DocGenPackage#getModel_Xmldoc()
   * @model containment="true"
   * @generated
   */
  EList<element> getXmldoc();

} // Model
