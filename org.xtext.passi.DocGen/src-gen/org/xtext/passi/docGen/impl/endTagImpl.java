/**
 */
package org.xtext.passi.docGen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.passi.docGen.DocGenPackage;
import org.xtext.passi.docGen.TagName;
import org.xtext.passi.docGen.endTag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>end Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.passi.docGen.impl.endTagImpl#getTagName <em>Tag Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class endTagImpl extends MinimalEObjectImpl.Container implements endTag
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected endTagImpl()
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
    return DocGenPackage.Literals.END_TAG;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocGenPackage.END_TAG__TAG_NAME, oldTagName, newTagName);
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
        msgs = ((InternalEObject)tagName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocGenPackage.END_TAG__TAG_NAME, null, msgs);
      if (newTagName != null)
        msgs = ((InternalEObject)newTagName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocGenPackage.END_TAG__TAG_NAME, null, msgs);
      msgs = basicSetTagName(newTagName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.END_TAG__TAG_NAME, newTagName, newTagName));
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
      case DocGenPackage.END_TAG__TAG_NAME:
        return basicSetTagName(null, msgs);
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
      case DocGenPackage.END_TAG__TAG_NAME:
        return getTagName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DocGenPackage.END_TAG__TAG_NAME:
        setTagName((TagName)newValue);
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
      case DocGenPackage.END_TAG__TAG_NAME:
        setTagName((TagName)null);
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
      case DocGenPackage.END_TAG__TAG_NAME:
        return tagName != null;
    }
    return super.eIsSet(featureID);
  }

} //endTagImpl
