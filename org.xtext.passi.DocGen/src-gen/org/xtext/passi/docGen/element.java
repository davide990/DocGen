/**
 */
package org.xtext.passi.docGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.passi.docGen.element#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.passi.docGen.element#getInnerElement <em>Inner Element</em>}</li>
 *   <li>{@link org.xtext.passi.docGen.element#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.passi.docGen.DocGenPackage#getelement()
 * @model
 * @generated
 */
public interface element extends EObject
{
  /**
   * Returns the value of the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start</em>' containment reference.
   * @see #setStart(startTag)
   * @see org.xtext.passi.docGen.DocGenPackage#getelement_Start()
   * @model containment="true"
   * @generated
   */
  startTag getStart();

  /**
   * Sets the value of the '{@link org.xtext.passi.docGen.element#getStart <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start</em>' containment reference.
   * @see #getStart()
   * @generated
   */
  void setStart(startTag value);

  /**
   * Returns the value of the '<em><b>Inner Element</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.passi.docGen.element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inner Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inner Element</em>' containment reference list.
   * @see org.xtext.passi.docGen.DocGenPackage#getelement_InnerElement()
   * @model containment="true"
   * @generated
   */
  EList<element> getInnerElement();

  /**
   * Returns the value of the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' containment reference.
   * @see #setEnd(endTag)
   * @see org.xtext.passi.docGen.DocGenPackage#getelement_End()
   * @model containment="true"
   * @generated
   */
  endTag getEnd();

  /**
   * Sets the value of the '{@link org.xtext.passi.docGen.element#getEnd <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' containment reference.
   * @see #getEnd()
   * @generated
   */
  void setEnd(endTag value);

} // element
