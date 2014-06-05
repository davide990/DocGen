/**
 */
package org.xtext.passi.docGen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.passi.docGen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocGenFactoryImpl extends EFactoryImpl implements DocGenFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DocGenFactory init()
  {
    try
    {
      DocGenFactory theDocGenFactory = (DocGenFactory)EPackage.Registry.INSTANCE.getEFactory(DocGenPackage.eNS_URI);
      if (theDocGenFactory != null)
      {
        return theDocGenFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DocGenFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocGenFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DocGenPackage.MODEL: return createModel();
      case DocGenPackage.ELEMENT: return createelement();
      case DocGenPackage.START_TAG: return createstartTag();
      case DocGenPackage.END_TAG: return createendTag();
      case DocGenPackage.EMPTY_ELEMENT: return createemptyElement();
      case DocGenPackage.PROLOG_TAG: return createprologTag();
      case DocGenPackage.TAG_NAME: return createTagName();
      case DocGenPackage.ATTRIBUTE: return createAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element createelement()
  {
    elementImpl element = new elementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public startTag createstartTag()
  {
    startTagImpl startTag = new startTagImpl();
    return startTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public endTag createendTag()
  {
    endTagImpl endTag = new endTagImpl();
    return endTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public emptyElement createemptyElement()
  {
    emptyElementImpl emptyElement = new emptyElementImpl();
    return emptyElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public prologTag createprologTag()
  {
    prologTagImpl prologTag = new prologTagImpl();
    return prologTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TagName createTagName()
  {
    TagNameImpl tagName = new TagNameImpl();
    return tagName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocGenPackage getDocGenPackage()
  {
    return (DocGenPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DocGenPackage getPackage()
  {
    return DocGenPackage.eINSTANCE;
  }

} //DocGenFactoryImpl
