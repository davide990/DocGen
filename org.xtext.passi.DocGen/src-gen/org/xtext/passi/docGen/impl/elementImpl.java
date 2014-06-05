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
import org.xtext.passi.docGen.element;
import org.xtext.passi.docGen.endTag;
import org.xtext.passi.docGen.startTag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.passi.docGen.impl.elementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.passi.docGen.impl.elementImpl#getInnerElement <em>Inner Element</em>}</li>
 *   <li>{@link org.xtext.passi.docGen.impl.elementImpl#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class elementImpl extends MinimalEObjectImpl.Container implements element
{
  /**
   * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStart()
   * @generated
   * @ordered
   */
  protected startTag start;

  /**
   * The cached value of the '{@link #getInnerElement() <em>Inner Element</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerElement()
   * @generated
   * @ordered
   */
  protected EList<element> innerElement;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected endTag end;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected elementImpl()
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
    return DocGenPackage.Literals.ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public startTag getStart()
  {
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStart(startTag newStart, NotificationChain msgs)
  {
    startTag oldStart = start;
    start = newStart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocGenPackage.ELEMENT__START, oldStart, newStart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStart(startTag newStart)
  {
    if (newStart != start)
    {
      NotificationChain msgs = null;
      if (start != null)
        msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocGenPackage.ELEMENT__START, null, msgs);
      if (newStart != null)
        msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocGenPackage.ELEMENT__START, null, msgs);
      msgs = basicSetStart(newStart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.ELEMENT__START, newStart, newStart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<element> getInnerElement()
  {
    if (innerElement == null)
    {
      innerElement = new EObjectContainmentEList<element>(element.class, this, DocGenPackage.ELEMENT__INNER_ELEMENT);
    }
    return innerElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public endTag getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnd(endTag newEnd, NotificationChain msgs)
  {
    endTag oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocGenPackage.ELEMENT__END, oldEnd, newEnd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(endTag newEnd)
  {
    if (newEnd != end)
    {
      NotificationChain msgs = null;
      if (end != null)
        msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocGenPackage.ELEMENT__END, null, msgs);
      if (newEnd != null)
        msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocGenPackage.ELEMENT__END, null, msgs);
      msgs = basicSetEnd(newEnd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.ELEMENT__END, newEnd, newEnd));
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
      case DocGenPackage.ELEMENT__START:
        return basicSetStart(null, msgs);
      case DocGenPackage.ELEMENT__INNER_ELEMENT:
        return ((InternalEList<?>)getInnerElement()).basicRemove(otherEnd, msgs);
      case DocGenPackage.ELEMENT__END:
        return basicSetEnd(null, msgs);
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
      case DocGenPackage.ELEMENT__START:
        return getStart();
      case DocGenPackage.ELEMENT__INNER_ELEMENT:
        return getInnerElement();
      case DocGenPackage.ELEMENT__END:
        return getEnd();
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
      case DocGenPackage.ELEMENT__START:
        setStart((startTag)newValue);
        return;
      case DocGenPackage.ELEMENT__INNER_ELEMENT:
        getInnerElement().clear();
        getInnerElement().addAll((Collection<? extends element>)newValue);
        return;
      case DocGenPackage.ELEMENT__END:
        setEnd((endTag)newValue);
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
      case DocGenPackage.ELEMENT__START:
        setStart((startTag)null);
        return;
      case DocGenPackage.ELEMENT__INNER_ELEMENT:
        getInnerElement().clear();
        return;
      case DocGenPackage.ELEMENT__END:
        setEnd((endTag)null);
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
      case DocGenPackage.ELEMENT__START:
        return start != null;
      case DocGenPackage.ELEMENT__INNER_ELEMENT:
        return innerElement != null && !innerElement.isEmpty();
      case DocGenPackage.ELEMENT__END:
        return end != null;
    }
    return super.eIsSet(featureID);
  }

} //elementImpl
