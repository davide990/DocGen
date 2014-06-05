/**
 */
package org.xtext.passi.docGen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.passi.docGen.DocGenFactory
 * @model kind="package"
 * @generated
 */
public interface DocGenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "docGen";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/passi/DocGen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "docGen";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DocGenPackage eINSTANCE = org.xtext.passi.docGen.impl.DocGenPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.passi.docGen.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.docGen.impl.ModelImpl
   * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Prolog</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PROLOG = 0;

  /**
   * The feature id for the '<em><b>Xmldoc</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__XMLDOC = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.passi.docGen.impl.elementImpl <em>element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.docGen.impl.elementImpl
   * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getelement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__START = 0;

  /**
   * The feature id for the '<em><b>Inner Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__INNER_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__END = 2;

  /**
   * The number of structural features of the '<em>element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.passi.docGen.impl.startTagImpl <em>start Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.docGen.impl.startTagImpl
   * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getstartTag()
   * @generated
   */
  int START_TAG = 2;

  /**
   * The feature id for the '<em><b>Tag Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_TAG__TAG_NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_TAG__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>start Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_TAG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.passi.docGen.impl.endTagImpl <em>end Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.docGen.impl.endTagImpl
   * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getendTag()
   * @generated
   */
  int END_TAG = 3;

  /**
   * The feature id for the '<em><b>Tag Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_TAG__TAG_NAME = 0;

  /**
   * The number of structural features of the '<em>end Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_TAG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.passi.docGen.impl.emptyElementImpl <em>empty Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.docGen.impl.emptyElementImpl
   * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getemptyElement()
   * @generated
   */
  int EMPTY_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Start</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ELEMENT__START = ELEMENT__START;

  /**
   * The feature id for the '<em><b>Inner Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ELEMENT__INNER_ELEMENT = ELEMENT__INNER_ELEMENT;

  /**
   * The feature id for the '<em><b>End</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ELEMENT__END = ELEMENT__END;

  /**
   * The feature id for the '<em><b>Tag Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ELEMENT__TAG_NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ELEMENT__ATTRIBUTES = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>empty Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.passi.docGen.impl.prologTagImpl <em>prolog Tag</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.docGen.impl.prologTagImpl
   * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getprologTag()
   * @generated
   */
  int PROLOG_TAG = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_TAG__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_TAG__ATTRIBUTES = 1;

  /**
   * The number of structural features of the '<em>prolog Tag</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROLOG_TAG_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.passi.docGen.impl.TagNameImpl <em>Tag Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.docGen.impl.TagNameImpl
   * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getTagName()
   * @generated
   */
  int TAG_NAME = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_NAME__NAME = 0;

  /**
   * The feature id for the '<em><b>Right Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_NAME__RIGHT_NAME = 1;

  /**
   * The number of structural features of the '<em>Tag Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TAG_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.passi.docGen.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.passi.docGen.impl.AttributeImpl
   * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VAL = 1;

  /**
   * The feature id for the '<em><b>Right Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__RIGHT_NAME = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.passi.docGen.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.passi.docGen.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.passi.docGen.Model#getProlog <em>Prolog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Prolog</em>'.
   * @see org.xtext.passi.docGen.Model#getProlog()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Prolog();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.passi.docGen.Model#getXmldoc <em>Xmldoc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Xmldoc</em>'.
   * @see org.xtext.passi.docGen.Model#getXmldoc()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Xmldoc();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.docGen.element <em>element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>element</em>'.
   * @see org.xtext.passi.docGen.element
   * @generated
   */
  EClass getelement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.passi.docGen.element#getStart <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start</em>'.
   * @see org.xtext.passi.docGen.element#getStart()
   * @see #getelement()
   * @generated
   */
  EReference getelement_Start();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.passi.docGen.element#getInnerElement <em>Inner Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner Element</em>'.
   * @see org.xtext.passi.docGen.element#getInnerElement()
   * @see #getelement()
   * @generated
   */
  EReference getelement_InnerElement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.passi.docGen.element#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End</em>'.
   * @see org.xtext.passi.docGen.element#getEnd()
   * @see #getelement()
   * @generated
   */
  EReference getelement_End();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.docGen.startTag <em>start Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>start Tag</em>'.
   * @see org.xtext.passi.docGen.startTag
   * @generated
   */
  EClass getstartTag();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.passi.docGen.startTag#getTagName <em>Tag Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag Name</em>'.
   * @see org.xtext.passi.docGen.startTag#getTagName()
   * @see #getstartTag()
   * @generated
   */
  EReference getstartTag_TagName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.passi.docGen.startTag#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.passi.docGen.startTag#getAttributes()
   * @see #getstartTag()
   * @generated
   */
  EReference getstartTag_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.docGen.endTag <em>end Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>end Tag</em>'.
   * @see org.xtext.passi.docGen.endTag
   * @generated
   */
  EClass getendTag();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.passi.docGen.endTag#getTagName <em>Tag Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag Name</em>'.
   * @see org.xtext.passi.docGen.endTag#getTagName()
   * @see #getendTag()
   * @generated
   */
  EReference getendTag_TagName();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.docGen.emptyElement <em>empty Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>empty Element</em>'.
   * @see org.xtext.passi.docGen.emptyElement
   * @generated
   */
  EClass getemptyElement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.passi.docGen.emptyElement#getTagName <em>Tag Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tag Name</em>'.
   * @see org.xtext.passi.docGen.emptyElement#getTagName()
   * @see #getemptyElement()
   * @generated
   */
  EReference getemptyElement_TagName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.passi.docGen.emptyElement#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.passi.docGen.emptyElement#getAttributes()
   * @see #getemptyElement()
   * @generated
   */
  EReference getemptyElement_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.docGen.prologTag <em>prolog Tag</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>prolog Tag</em>'.
   * @see org.xtext.passi.docGen.prologTag
   * @generated
   */
  EClass getprologTag();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.docGen.prologTag#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.passi.docGen.prologTag#getName()
   * @see #getprologTag()
   * @generated
   */
  EAttribute getprologTag_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.passi.docGen.prologTag#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.xtext.passi.docGen.prologTag#getAttributes()
   * @see #getprologTag()
   * @generated
   */
  EReference getprologTag_Attributes();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.docGen.TagName <em>Tag Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tag Name</em>'.
   * @see org.xtext.passi.docGen.TagName
   * @generated
   */
  EClass getTagName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.docGen.TagName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.passi.docGen.TagName#getName()
   * @see #getTagName()
   * @generated
   */
  EAttribute getTagName_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.docGen.TagName#getRightName <em>Right Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Name</em>'.
   * @see org.xtext.passi.docGen.TagName#getRightName()
   * @see #getTagName()
   * @generated
   */
  EAttribute getTagName_RightName();

  /**
   * Returns the meta object for class '{@link org.xtext.passi.docGen.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.xtext.passi.docGen.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.docGen.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.passi.docGen.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.docGen.Attribute#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.passi.docGen.Attribute#getVal()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Val();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.passi.docGen.Attribute#getRightName <em>Right Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Name</em>'.
   * @see org.xtext.passi.docGen.Attribute#getRightName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_RightName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DocGenFactory getDocGenFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.passi.docGen.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.docGen.impl.ModelImpl
     * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Prolog</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PROLOG = eINSTANCE.getModel_Prolog();

    /**
     * The meta object literal for the '<em><b>Xmldoc</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__XMLDOC = eINSTANCE.getModel_Xmldoc();

    /**
     * The meta object literal for the '{@link org.xtext.passi.docGen.impl.elementImpl <em>element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.docGen.impl.elementImpl
     * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getelement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getelement();

    /**
     * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__START = eINSTANCE.getelement_Start();

    /**
     * The meta object literal for the '<em><b>Inner Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__INNER_ELEMENT = eINSTANCE.getelement_InnerElement();

    /**
     * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__END = eINSTANCE.getelement_End();

    /**
     * The meta object literal for the '{@link org.xtext.passi.docGen.impl.startTagImpl <em>start Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.docGen.impl.startTagImpl
     * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getstartTag()
     * @generated
     */
    EClass START_TAG = eINSTANCE.getstartTag();

    /**
     * The meta object literal for the '<em><b>Tag Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_TAG__TAG_NAME = eINSTANCE.getstartTag_TagName();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_TAG__ATTRIBUTES = eINSTANCE.getstartTag_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.passi.docGen.impl.endTagImpl <em>end Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.docGen.impl.endTagImpl
     * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getendTag()
     * @generated
     */
    EClass END_TAG = eINSTANCE.getendTag();

    /**
     * The meta object literal for the '<em><b>Tag Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference END_TAG__TAG_NAME = eINSTANCE.getendTag_TagName();

    /**
     * The meta object literal for the '{@link org.xtext.passi.docGen.impl.emptyElementImpl <em>empty Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.docGen.impl.emptyElementImpl
     * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getemptyElement()
     * @generated
     */
    EClass EMPTY_ELEMENT = eINSTANCE.getemptyElement();

    /**
     * The meta object literal for the '<em><b>Tag Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMPTY_ELEMENT__TAG_NAME = eINSTANCE.getemptyElement_TagName();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMPTY_ELEMENT__ATTRIBUTES = eINSTANCE.getemptyElement_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.passi.docGen.impl.prologTagImpl <em>prolog Tag</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.docGen.impl.prologTagImpl
     * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getprologTag()
     * @generated
     */
    EClass PROLOG_TAG = eINSTANCE.getprologTag();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROLOG_TAG__NAME = eINSTANCE.getprologTag_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROLOG_TAG__ATTRIBUTES = eINSTANCE.getprologTag_Attributes();

    /**
     * The meta object literal for the '{@link org.xtext.passi.docGen.impl.TagNameImpl <em>Tag Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.docGen.impl.TagNameImpl
     * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getTagName()
     * @generated
     */
    EClass TAG_NAME = eINSTANCE.getTagName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG_NAME__NAME = eINSTANCE.getTagName_Name();

    /**
     * The meta object literal for the '<em><b>Right Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TAG_NAME__RIGHT_NAME = eINSTANCE.getTagName_RightName();

    /**
     * The meta object literal for the '{@link org.xtext.passi.docGen.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.passi.docGen.impl.AttributeImpl
     * @see org.xtext.passi.docGen.impl.DocGenPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__VAL = eINSTANCE.getAttribute_Val();

    /**
     * The meta object literal for the '<em><b>Right Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__RIGHT_NAME = eINSTANCE.getAttribute_RightName();

  }

} //DocGenPackage
