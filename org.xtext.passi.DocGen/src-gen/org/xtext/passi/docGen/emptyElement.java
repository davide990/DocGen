/**
 */
package org.xtext.passi.docGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>empty Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.passi.docGen.emptyElement#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link org.xtext.passi.docGen.emptyElement#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.passi.docGen.DocGenPackage#getemptyElement()
 * @model
 * @generated
 */
public interface emptyElement extends element
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
   * @see org.xtext.passi.docGen.DocGenPackage#getemptyElement_TagName()
   * @model containment="true"
   * @generated
   */
  TagName getTagName();

  /**
   * Sets the value of the '{@link org.xtext.passi.docGen.emptyElement#getTagName <em>Tag Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag Name</em>' containment reference.
   * @see #getTagName()
   * @generated
   */
  void setTagName(TagName value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.passi.docGen.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see org.xtext.passi.docGen.DocGenPackage#getemptyElement_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // emptyElement
