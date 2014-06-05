/**
 */
package org.xtext.passi.templateLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.passi.templateLanguage.TableData#getTableDataAttributes <em>Table Data Attributes</em>}</li>
 *   <li>{@link org.xtext.passi.templateLanguage.TableData#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.passi.templateLanguage.TemplateLanguagePackage#getTableData()
 * @model
 * @generated
 */
public interface TableData extends Feature
{
  /**
   * Returns the value of the '<em><b>Table Data Attributes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.passi.templateLanguage.TableDataAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Data Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Data Attributes</em>' containment reference list.
   * @see org.xtext.passi.templateLanguage.TemplateLanguagePackage#getTableData_TableDataAttributes()
   * @model containment="true"
   * @generated
   */
  EList<TableDataAttribute> getTableDataAttributes();

  /**
   * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.passi.templateLanguage.TableSection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sections</em>' containment reference list.
   * @see org.xtext.passi.templateLanguage.TemplateLanguagePackage#getTableData_Sections()
   * @model containment="true"
   * @generated
   */
  EList<TableSection> getSections();

} // TableData
