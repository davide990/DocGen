/**
 */
package org.xtext.passi.docGen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>end Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.passi.docGen.endTag#getTagName <em>Tag Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.passi.docGen.DocGenPackage#getendTag()
 * @model
 * @generated
 */
public interface endTag extends EObject
{
  /**
   * Returns the value of the '<em><b>Tag Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag Name</em>' containment reference.
   * @see #setTagName(TagName)
   * @see org.xtext.passi.docGen.DocGenPackage#getendTag_TagName()
   * @model containment="true"
   * @generated
   */
  TagName getTagName();

  /**
   * Sets the value of the '{@link org.xtext.passi.docGen.endTag#getTagName <em>Tag Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag Name</em>' containment reference.
   * @see #getTagName()
   * @generated
   */
  void setTagName(TagName value);

} // endTag
