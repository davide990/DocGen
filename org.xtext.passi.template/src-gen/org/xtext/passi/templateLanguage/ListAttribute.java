/**
 */
package org.xtext.passi.templateLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.passi.templateLanguage.ListAttribute#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.passi.templateLanguage.TemplateLanguagePackage#getListAttribute()
 * @model
 * @generated
 */
public interface ListAttribute extends TableDataAttribute
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see org.xtext.passi.templateLanguage.TemplateLanguagePackage#getListAttribute_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // ListAttribute
