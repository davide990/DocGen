/**
 */
package org.xtext.passi.docGen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.passi.docGen.Attribute;
import org.xtext.passi.docGen.DocGenPackage;
import org.xtext.passi.docGen.TagName;
import org.xtext.passi.docGen.emptyElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>empty Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.passi.docGen.impl.emptyElementImpl#getTagName <em>Tag Name</em>}</li>
 *   <li>{@link org.xtext.passi.docGen.impl.emptyElementImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class emptyElementImpl extends elementImpl implements emptyElement
{
  /**
   * The cached value of the '{@link #getTagName() <em>Tag Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTagName()
   * @generated
   * @ordered
   */
  protected TagName tagName;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected emptyElementImpl()
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
    return DocGenPackage.Literals.EMPTY_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagName getTagName()
  {
    return tagName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTagName(TagName newTagName, NotificationChain msgs)
  {
    TagName oldTagName = tagName;
    tagName = newTagName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocGenPackage.EMPTY_ELEMENT__TAG_NAME, oldTagName, newTagName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTagName(TagName newTagName)
  {
    if (newTagName != tagName)
    {
      NotificationChain msgs = null;
      if (tagName != null)
        msgs = ((InternalEObject)tagName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocGenPackage.EMPTY_ELEMENT__TAG_NAME, null, msgs);
      if (newTagName != null)
        msgs = ((InternalEObject)newTagName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocGenPackage.EMPTY_ELEMENT__TAG_NAME, null, msgs);
      msgs = basicSetTagName(newTagName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.EMPTY_ELEMENT__TAG_NAME, newTagName, newTagName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, DocGenPackage.EMPTY_ELEMENT__ATTRIBUTES);
    }
    return attributes;
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
      case DocGenPackage.EMPTY_ELEMENT__TAG_NAME:
        return basicSetTagName(null, msgs);
      case DocGenPackage.EMPTY_ELEMENT__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case DocGenPackage.EMPTY_ELEMENT__TAG_NAME:
        return getTagName();
      case DocGenPackage.EMPTY_ELEMENT__ATTRIBUTES:
        return getAttributes();
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
      case DocGenPackage.EMPTY_ELEMENT__TAG_NAME:
        setTagName((TagName)newValue);
        return;
      case DocGenPackage.EMPTY_ELEMENT__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
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
      case DocGenPackage.EMPTY_ELEMENT__TAG_NAME:
        setTagName((TagName)null);
        return;
      case DocGenPackage.EMPTY_ELEMENT__ATTRIBUTES:
        getAttributes().clear();
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
      case DocGenPackage.EMPTY_ELEMENT__TAG_NAME:
        return tagName != null;
      case DocGenPackage.EMPTY_ELEMENT__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //emptyElementImpl
