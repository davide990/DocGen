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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.passi.docGen.DocGenPackage;
import org.xtext.passi.docGen.Model;
import org.xtext.passi.docGen.element;
import org.xtext.passi.docGen.prologTag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.passi.docGen.impl.ModelImpl#getProlog <em>Prolog</em>}</li>
 *   <li>{@link org.xtext.passi.docGen.impl.ModelImpl#getXmldoc <em>Xmldoc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getProlog() <em>Prolog</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProlog()
   * @generated
   * @ordered
   */
  protected prologTag prolog;

  /**
   * The cached value of the '{@link #getXmldoc() <em>Xmldoc</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXmldoc()
   * @generated
   * @ordered
   */
  protected EList<element> xmldoc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return DocGenPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public prologTag getProlog()
  {
    return prolog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProlog(prologTag newProlog, NotificationChain msgs)
  {
    prologTag oldProlog = prolog;
    prolog = newProlog;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocGenPackage.MODEL__PROLOG, oldProlog, newProlog);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProlog(prologTag newProlog)
  {
    if (newProlog != prolog)
    {
      NotificationChain msgs = null;
      if (prolog != null)
        msgs = ((InternalEObject)prolog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocGenPackage.MODEL__PROLOG, null, msgs);
      if (newProlog != null)
        msgs = ((InternalEObject)newProlog).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocGenPackage.MODEL__PROLOG, null, msgs);
      msgs = basicSetProlog(newProlog, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.MODEL__PROLOG, newProlog, newProlog));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<element> getXmldoc()
  {
    if (xmldoc == null)
    {
      xmldoc = new EObjectContainmentEList<element>(element.class, this, DocGenPackage.MODEL__XMLDOC);
    }
    return xmldoc;
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
      case DocGenPackage.MODEL__PROLOG:
        return basicSetProlog(null, msgs);
      case DocGenPackage.MODEL__XMLDOC:
        return ((InternalEList<?>)getXmldoc()).basicRemove(otherEnd, msgs);
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
      case DocGenPackage.MODEL__PROLOG:
        return getProlog();
      case DocGenPackage.MODEL__XMLDOC:
        return getXmldoc();
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
      case DocGenPackage.MODEL__PROLOG:
        setProlog((prologTag)newValue);
        return;
      case DocGenPackage.MODEL__XMLDOC:
        getXmldoc().clear();
        getXmldoc().addAll((Collection<? extends element>)newValue);
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
      case DocGenPackage.MODEL__PROLOG:
        setProlog((prologTag)null);
        return;
      case DocGenPackage.MODEL__XMLDOC:
        getXmldoc().clear();
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
      case DocGenPackage.MODEL__PROLOG:
        return prolog != null;
      case DocGenPackage.MODEL__XMLDOC:
        return xmldoc != null && !xmldoc.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
