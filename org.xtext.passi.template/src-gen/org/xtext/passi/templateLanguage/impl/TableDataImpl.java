/**
 */
package org.xtext.passi.templateLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.passi.templateLanguage.TableData;
import org.xtext.passi.templateLanguage.TableDataAttribute;
import org.xtext.passi.templateLanguage.TableSection;
import org.xtext.passi.templateLanguage.TemplateLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.passi.templateLanguage.impl.TableDataImpl#getTableDataAttributes <em>Table Data Attributes</em>}</li>
 *   <li>{@link org.xtext.passi.templateLanguage.impl.TableDataImpl#getSections <em>Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableDataImpl extends FeatureImpl implements TableData
{
  /**
   * The cached value of the '{@link #getTableDataAttributes() <em>Table Data Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableDataAttributes()
   * @generated
   * @ordered
   */
  protected EList<TableDataAttribute> tableDataAttributes;

  /**
   * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSections()
   * @generated
   * @ordered
   */
  protected EList<TableSection> sections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableDataImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TemplateLanguagePackage.Literals.TABLE_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableDataAttribute> getTableDataAttributes()
  {
    if (tableDataAttributes == null)
    {
      tableDataAttributes = new EObjectContainmentEList<TableDataAttribute>(TableDataAttribute.class, this, TemplateLanguagePackage.TABLE_DATA__TABLE_DATA_ATTRIBUTES);
    }
    return tableDataAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TableSection> getSections()
  {
    if (sections == null)
    {
      sections = new EObjectContainmentEList<TableSection>(TableSection.class, this, TemplateLanguagePackage.TABLE_DATA__SECTIONS);
    }
    return sections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TemplateLanguagePackage.TABLE_DATA__TABLE_DATA_ATTRIBUTES:
        return ((InternalEList<?>)getTableDataAttributes()).basicRemove(otherEnd, msgs);
      case TemplateLanguagePackage.TABLE_DATA__SECTIONS:
        return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TemplateLanguagePackage.TABLE_DATA__TABLE_DATA_ATTRIBUTES:
        return getTableDataAttributes();
      case TemplateLanguagePackage.TABLE_DATA__SECTIONS:
        return getSections();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TemplateLanguagePackage.TABLE_DATA__TABLE_DATA_ATTRIBUTES:
        getTableDataAttributes().clear();
        getTableDataAttributes().addAll((Collection<? extends TableDataAttribute>)newValue);
        return;
      case TemplateLanguagePackage.TABLE_DATA__SECTIONS:
        getSections().clear();
        getSections().addAll((Collection<? extends TableSection>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TemplateLanguagePackage.TABLE_DATA__TABLE_DATA_ATTRIBUTES:
        getTableDataAttributes().clear();
        return;
      case TemplateLanguagePackage.TABLE_DATA__SECTIONS:
        getSections().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TemplateLanguagePackage.TABLE_DATA__TABLE_DATA_ATTRIBUTES:
        return tableDataAttributes != null && !tableDataAttributes.isEmpty();
      case TemplateLanguagePackage.TABLE_DATA__SECTIONS:
        return sections != null && !sections.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TableDataImpl
