/**
 */
package no.hal.jex.jextest.jexTest.impl;

import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.JexTestFactory;
import no.hal.jex.jextest.jexTest.JexTestPackage;
import no.hal.jex.jextest.jexTest.JexTestSequence;
import no.hal.jex.jextest.jexTest.JexTestSuite;
import no.hal.jex.jextest.jexTest.JvmOperationRef;
import no.hal.jex.jextest.jexTest.Method;
import no.hal.jex.jextest.jexTest.ObjectTest;
import no.hal.jex.jextest.jexTest.Parameter;
import no.hal.jex.jextest.jexTest.ParameterList;
import no.hal.jex.jextest.jexTest.PropertiesTest;
import no.hal.jex.jextest.jexTest.PropertiesTestOwner;
import no.hal.jex.jextest.jexTest.State;
import no.hal.jex.jextest.jexTest.StateFunction;
import no.hal.jex.jextest.jexTest.StateTestContext;
import no.hal.jex.jextest.jexTest.TestMemberContext;
import no.hal.jex.jextest.jexTest.TestedClass;
import no.hal.jex.jextest.jexTest.TestedConstructor;
import no.hal.jex.jextest.jexTest.TestedMethod;
import no.hal.jex.jextest.jexTest.TestedOperation;
import no.hal.jex.jextest.jexTest.Transition;
import no.hal.jex.jextest.jexTest.TransitionAction;
import no.hal.jex.jextest.jexTest.TransitionCallbackEffect;
import no.hal.jex.jextest.jexTest.TransitionEffect;
import no.hal.jex.jextest.jexTest.TransitionEffect2;
import no.hal.jex.jextest.jexTest.TransitionExceptionEffect;
import no.hal.jex.jextest.jexTest.TransitionExpressionAction;
import no.hal.jex.jextest.jexTest.TransitionInputAction;
import no.hal.jex.jextest.jexTest.TransitionOutputEffect;
import no.hal.jex.jextest.jexTest.TransitionSource;
import no.hal.jex.jextest.jexTest.TransitionTargetEffect;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JexTestPackageImpl extends EPackageImpl implements JexTestPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jexTestSuiteEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jexTestCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instanceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testMemberContextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateTestContextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertiesTestOwnerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jexTestSequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jvmOperationRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectTestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionExpressionActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionInputActionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionEffect2EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionTargetEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionExceptionEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionOutputEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitionCallbackEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testedClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testedOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testedConstructorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass testedMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertiesTestEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see no.hal.jex.jextest.jexTest.JexTestPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JexTestPackageImpl()
  {
    super(eNS_URI, JexTestFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link JexTestPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JexTestPackage init()
  {
    if (isInited) return (JexTestPackage)EPackage.Registry.INSTANCE.getEPackage(JexTestPackage.eNS_URI);

    // Obtain or create and register package
    JexTestPackageImpl theJexTestPackage = (JexTestPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JexTestPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JexTestPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();
    XtypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theJexTestPackage.createPackageContents();

    // Initialize created meta-data
    theJexTestPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJexTestPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(JexTestPackage.eNS_URI, theJexTestPackage);
    return theJexTestPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJexTestSuite()
  {
    return jexTestSuiteEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJexTestSuite_SuiteClassName()
  {
    return (EAttribute)jexTestSuiteEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestSuite_TestCases()
  {
    return (EReference)jexTestSuiteEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJexTestCase()
  {
    return jexTestCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestCase_TestedClasses()
  {
    return (EReference)jexTestCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestCase_TestedClassRef()
  {
    return (EReference)jexTestCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJexTestCase_TestClassName()
  {
    return (EAttribute)jexTestCaseEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJexTestCase_Description()
  {
    return (EAttribute)jexTestCaseEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJexTestCase_Url()
  {
    return (EAttribute)jexTestCaseEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestCase_TestSequences()
  {
    return (EReference)jexTestCaseEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstance()
  {
    return instanceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Type()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInstance_Name()
  {
    return (EAttribute)instanceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstance_Expr()
  {
    return (EReference)instanceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestMemberContext()
  {
    return testMemberContextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestMemberContext_ImportSection()
  {
    return (EReference)testMemberContextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestMemberContext_Instances()
  {
    return (EReference)testMemberContextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestMemberContext_StateFunctions()
  {
    return (EReference)testMemberContextEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestMemberContext_Methods()
  {
    return (EReference)testMemberContextEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateTestContext()
  {
    return stateTestContextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateTestContext_Name()
  {
    return (EAttribute)stateTestContextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStateTestContext_Description()
  {
    return (EAttribute)stateTestContextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertiesTestOwner()
  {
    return propertiesTestOwnerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertiesTestOwner_Test()
  {
    return (EReference)propertiesTestOwnerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStateFunction()
  {
    return stateFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateFunction_Type()
  {
    return (EReference)stateFunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStateFunction_Parameters()
  {
    return (EReference)stateFunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJexTestSequence()
  {
    return jexTestSequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestSequence_Tested()
  {
    return (EReference)jexTestSequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestSequence_Instances()
  {
    return (EReference)jexTestSequenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJexTestSequence_Transitions()
  {
    return (EReference)jexTestSequenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJvmOperationRef()
  {
    return jvmOperationRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJvmOperationRef_MethodName()
  {
    return (EAttribute)jvmOperationRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJvmOperationRef_ParameterTypes()
  {
    return (EReference)jvmOperationRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getState()
  {
    return stateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Name()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getState_Description()
  {
    return (EAttribute)stateEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getState_ObjectTests()
  {
    return (EReference)stateEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectTest()
  {
    return objectTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectTest_Instance()
  {
    return (EReference)objectTestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransition()
  {
    return transitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Source()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransition_Description()
  {
    return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Actions()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransition_Effects()
  {
    return (EReference)transitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionSource()
  {
    return transitionSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionSource_State()
  {
    return (EReference)transitionSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionSource_StateRef()
  {
    return (EReference)transitionSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionAction()
  {
    return transitionActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionExpressionAction()
  {
    return transitionExpressionActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionExpressionAction_Expr()
  {
    return (EReference)transitionExpressionActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionExpressionAction_Times()
  {
    return (EReference)transitionExpressionActionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionInputAction()
  {
    return transitionInputActionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionInputAction_Input()
  {
    return (EAttribute)transitionInputActionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionEffect()
  {
    return transitionEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionEffect2()
  {
    return transitionEffect2EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionTargetEffect()
  {
    return transitionTargetEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionTargetEffect_State()
  {
    return (EReference)transitionTargetEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionTargetEffect_StateRef()
  {
    return (EReference)transitionTargetEffectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionExceptionEffect()
  {
    return transitionExceptionEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionExceptionEffect_ExceptionClass()
  {
    return (EReference)transitionExceptionEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionOutputEffect()
  {
    return transitionOutputEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionOutputEffect_Pattern()
  {
    return (EAttribute)transitionOutputEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitionCallbackEffect()
  {
    return transitionCallbackEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionCallbackEffect_Instance()
  {
    return (EReference)transitionCallbackEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionCallbackEffect_CallbackClass()
  {
    return (EReference)transitionCallbackEffectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTransitionCallbackEffect_MethodName()
  {
    return (EAttribute)transitionCallbackEffectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionCallbackEffect_Parameters()
  {
    return (EReference)transitionCallbackEffectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitionCallbackEffect_Arguments()
  {
    return (EReference)transitionCallbackEffectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod()
  {
    return methodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_ReturnType()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_Name()
  {
    return (EAttribute)methodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Parameters()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_Body()
  {
    return (EReference)methodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterList()
  {
    return parameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterList_Parameters()
  {
    return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Vararg()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestedClass()
  {
    return testedClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestedClass_Interface()
  {
    return (EAttribute)testedClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestedClass_Abstract()
  {
    return (EAttribute)testedClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestedClass_Name()
  {
    return (EAttribute)testedClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestedClass_SuperClass()
  {
    return (EReference)testedClassEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestedClass_SuperInterfaces()
  {
    return (EReference)testedClassEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestedClass_Description()
  {
    return (EAttribute)testedClassEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestedClass_Invariant()
  {
    return (EReference)testedClassEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestedClass_Methods()
  {
    return (EReference)testedClassEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestedOperation()
  {
    return testedOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestedOperation_Parameters()
  {
    return (EReference)testedOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestedOperation_Description()
  {
    return (EAttribute)testedOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestedOperation_PreExpression()
  {
    return (EReference)testedOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestedOperation_PostExpression()
  {
    return (EReference)testedOperationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestedConstructor()
  {
    return testedConstructorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTestedMethod()
  {
    return testedMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestedMethod_Abstract()
  {
    return (EAttribute)testedMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTestedMethod_ReturnType()
  {
    return (EReference)testedMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTestedMethod_Name()
  {
    return (EAttribute)testedMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertiesTest()
  {
    return propertiesTestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JexTestFactory getJexTestFactory()
  {
    return (JexTestFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    jexTestSuiteEClass = createEClass(JEX_TEST_SUITE);
    createEAttribute(jexTestSuiteEClass, JEX_TEST_SUITE__SUITE_CLASS_NAME);
    createEReference(jexTestSuiteEClass, JEX_TEST_SUITE__TEST_CASES);

    jexTestCaseEClass = createEClass(JEX_TEST_CASE);
    createEReference(jexTestCaseEClass, JEX_TEST_CASE__TESTED_CLASSES);
    createEReference(jexTestCaseEClass, JEX_TEST_CASE__TESTED_CLASS_REF);
    createEAttribute(jexTestCaseEClass, JEX_TEST_CASE__TEST_CLASS_NAME);
    createEAttribute(jexTestCaseEClass, JEX_TEST_CASE__DESCRIPTION);
    createEAttribute(jexTestCaseEClass, JEX_TEST_CASE__URL);
    createEReference(jexTestCaseEClass, JEX_TEST_CASE__TEST_SEQUENCES);

    instanceEClass = createEClass(INSTANCE);
    createEReference(instanceEClass, INSTANCE__TYPE);
    createEAttribute(instanceEClass, INSTANCE__NAME);
    createEReference(instanceEClass, INSTANCE__EXPR);

    testMemberContextEClass = createEClass(TEST_MEMBER_CONTEXT);
    createEReference(testMemberContextEClass, TEST_MEMBER_CONTEXT__IMPORT_SECTION);
    createEReference(testMemberContextEClass, TEST_MEMBER_CONTEXT__INSTANCES);
    createEReference(testMemberContextEClass, TEST_MEMBER_CONTEXT__STATE_FUNCTIONS);
    createEReference(testMemberContextEClass, TEST_MEMBER_CONTEXT__METHODS);

    stateTestContextEClass = createEClass(STATE_TEST_CONTEXT);
    createEAttribute(stateTestContextEClass, STATE_TEST_CONTEXT__NAME);
    createEAttribute(stateTestContextEClass, STATE_TEST_CONTEXT__DESCRIPTION);

    propertiesTestOwnerEClass = createEClass(PROPERTIES_TEST_OWNER);
    createEReference(propertiesTestOwnerEClass, PROPERTIES_TEST_OWNER__TEST);

    stateFunctionEClass = createEClass(STATE_FUNCTION);
    createEReference(stateFunctionEClass, STATE_FUNCTION__TYPE);
    createEReference(stateFunctionEClass, STATE_FUNCTION__PARAMETERS);

    jexTestSequenceEClass = createEClass(JEX_TEST_SEQUENCE);
    createEReference(jexTestSequenceEClass, JEX_TEST_SEQUENCE__TESTED);
    createEReference(jexTestSequenceEClass, JEX_TEST_SEQUENCE__INSTANCES);
    createEReference(jexTestSequenceEClass, JEX_TEST_SEQUENCE__TRANSITIONS);

    jvmOperationRefEClass = createEClass(JVM_OPERATION_REF);
    createEAttribute(jvmOperationRefEClass, JVM_OPERATION_REF__METHOD_NAME);
    createEReference(jvmOperationRefEClass, JVM_OPERATION_REF__PARAMETER_TYPES);

    stateEClass = createEClass(STATE);
    createEAttribute(stateEClass, STATE__NAME);
    createEAttribute(stateEClass, STATE__DESCRIPTION);
    createEReference(stateEClass, STATE__OBJECT_TESTS);

    objectTestEClass = createEClass(OBJECT_TEST);
    createEReference(objectTestEClass, OBJECT_TEST__INSTANCE);

    transitionEClass = createEClass(TRANSITION);
    createEReference(transitionEClass, TRANSITION__SOURCE);
    createEAttribute(transitionEClass, TRANSITION__DESCRIPTION);
    createEReference(transitionEClass, TRANSITION__ACTIONS);
    createEReference(transitionEClass, TRANSITION__EFFECTS);

    transitionSourceEClass = createEClass(TRANSITION_SOURCE);
    createEReference(transitionSourceEClass, TRANSITION_SOURCE__STATE);
    createEReference(transitionSourceEClass, TRANSITION_SOURCE__STATE_REF);

    transitionActionEClass = createEClass(TRANSITION_ACTION);

    transitionExpressionActionEClass = createEClass(TRANSITION_EXPRESSION_ACTION);
    createEReference(transitionExpressionActionEClass, TRANSITION_EXPRESSION_ACTION__EXPR);
    createEReference(transitionExpressionActionEClass, TRANSITION_EXPRESSION_ACTION__TIMES);

    transitionInputActionEClass = createEClass(TRANSITION_INPUT_ACTION);
    createEAttribute(transitionInputActionEClass, TRANSITION_INPUT_ACTION__INPUT);

    transitionEffectEClass = createEClass(TRANSITION_EFFECT);

    transitionEffect2EClass = createEClass(TRANSITION_EFFECT2);

    transitionTargetEffectEClass = createEClass(TRANSITION_TARGET_EFFECT);
    createEReference(transitionTargetEffectEClass, TRANSITION_TARGET_EFFECT__STATE);
    createEReference(transitionTargetEffectEClass, TRANSITION_TARGET_EFFECT__STATE_REF);

    transitionExceptionEffectEClass = createEClass(TRANSITION_EXCEPTION_EFFECT);
    createEReference(transitionExceptionEffectEClass, TRANSITION_EXCEPTION_EFFECT__EXCEPTION_CLASS);

    transitionOutputEffectEClass = createEClass(TRANSITION_OUTPUT_EFFECT);
    createEAttribute(transitionOutputEffectEClass, TRANSITION_OUTPUT_EFFECT__PATTERN);

    transitionCallbackEffectEClass = createEClass(TRANSITION_CALLBACK_EFFECT);
    createEReference(transitionCallbackEffectEClass, TRANSITION_CALLBACK_EFFECT__INSTANCE);
    createEReference(transitionCallbackEffectEClass, TRANSITION_CALLBACK_EFFECT__CALLBACK_CLASS);
    createEAttribute(transitionCallbackEffectEClass, TRANSITION_CALLBACK_EFFECT__METHOD_NAME);
    createEReference(transitionCallbackEffectEClass, TRANSITION_CALLBACK_EFFECT__PARAMETERS);
    createEReference(transitionCallbackEffectEClass, TRANSITION_CALLBACK_EFFECT__ARGUMENTS);

    methodEClass = createEClass(METHOD);
    createEReference(methodEClass, METHOD__RETURN_TYPE);
    createEAttribute(methodEClass, METHOD__NAME);
    createEReference(methodEClass, METHOD__PARAMETERS);
    createEReference(methodEClass, METHOD__BODY);

    parameterListEClass = createEClass(PARAMETER_LIST);
    createEReference(parameterListEClass, PARAMETER_LIST__PARAMETERS);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TYPE);
    createEAttribute(parameterEClass, PARAMETER__VARARG);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    testedClassEClass = createEClass(TESTED_CLASS);
    createEAttribute(testedClassEClass, TESTED_CLASS__INTERFACE);
    createEAttribute(testedClassEClass, TESTED_CLASS__ABSTRACT);
    createEAttribute(testedClassEClass, TESTED_CLASS__NAME);
    createEReference(testedClassEClass, TESTED_CLASS__SUPER_CLASS);
    createEReference(testedClassEClass, TESTED_CLASS__SUPER_INTERFACES);
    createEAttribute(testedClassEClass, TESTED_CLASS__DESCRIPTION);
    createEReference(testedClassEClass, TESTED_CLASS__INVARIANT);
    createEReference(testedClassEClass, TESTED_CLASS__METHODS);

    testedOperationEClass = createEClass(TESTED_OPERATION);
    createEReference(testedOperationEClass, TESTED_OPERATION__PARAMETERS);
    createEAttribute(testedOperationEClass, TESTED_OPERATION__DESCRIPTION);
    createEReference(testedOperationEClass, TESTED_OPERATION__PRE_EXPRESSION);
    createEReference(testedOperationEClass, TESTED_OPERATION__POST_EXPRESSION);

    testedConstructorEClass = createEClass(TESTED_CONSTRUCTOR);

    testedMethodEClass = createEClass(TESTED_METHOD);
    createEAttribute(testedMethodEClass, TESTED_METHOD__ABSTRACT);
    createEReference(testedMethodEClass, TESTED_METHOD__RETURN_TYPE);
    createEAttribute(testedMethodEClass, TESTED_METHOD__NAME);

    propertiesTestEClass = createEClass(PROPERTIES_TEST);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);
    XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    jexTestSuiteEClass.getESuperTypes().add(this.getTestMemberContext());
    jexTestCaseEClass.getESuperTypes().add(this.getTestMemberContext());
    stateFunctionEClass.getESuperTypes().add(this.getStateTestContext());
    stateFunctionEClass.getESuperTypes().add(this.getPropertiesTestOwner());
    jexTestSequenceEClass.getESuperTypes().add(this.getStateTestContext());
    objectTestEClass.getESuperTypes().add(this.getPropertiesTestOwner());
    transitionExpressionActionEClass.getESuperTypes().add(this.getTransitionAction());
    transitionEffect2EClass.getESuperTypes().add(this.getTransitionEffect());
    transitionTargetEffectEClass.getESuperTypes().add(this.getTransitionEffect());
    transitionExceptionEffectEClass.getESuperTypes().add(this.getTransitionEffect2());
    transitionCallbackEffectEClass.getESuperTypes().add(this.getTransitionEffect2());
    testedConstructorEClass.getESuperTypes().add(this.getTestedOperation());
    testedMethodEClass.getESuperTypes().add(this.getTestedOperation());
    propertiesTestEClass.getESuperTypes().add(theXbasePackage.getXBlockExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(jexTestSuiteEClass, JexTestSuite.class, "JexTestSuite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJexTestSuite_SuiteClassName(), ecorePackage.getEString(), "suiteClassName", null, 0, 1, JexTestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestSuite_TestCases(), this.getJexTestCase(), null, "testCases", null, 0, -1, JexTestSuite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jexTestCaseEClass, JexTestCase.class, "JexTestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJexTestCase_TestedClasses(), this.getTestedClass(), null, "testedClasses", null, 0, -1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestCase_TestedClassRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "testedClassRef", null, 0, 1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJexTestCase_TestClassName(), ecorePackage.getEString(), "testClassName", null, 0, 1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJexTestCase_Description(), ecorePackage.getEString(), "description", null, 0, 1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJexTestCase_Url(), ecorePackage.getEString(), "url", null, 0, 1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestCase_TestSequences(), this.getJexTestSequence(), null, "testSequences", null, 0, -1, JexTestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstance_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstance_Expr(), theXbasePackage.getXExpression(), null, "expr", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testMemberContextEClass, TestMemberContext.class, "TestMemberContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTestMemberContext_ImportSection(), theXtypePackage.getXImportSection(), null, "importSection", null, 0, 1, TestMemberContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestMemberContext_Instances(), this.getInstance(), null, "instances", null, 0, -1, TestMemberContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestMemberContext_StateFunctions(), this.getStateFunction(), null, "stateFunctions", null, 0, -1, TestMemberContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestMemberContext_Methods(), this.getMethod(), null, "methods", null, 0, -1, TestMemberContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateTestContextEClass, StateTestContext.class, "StateTestContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStateTestContext_Name(), ecorePackage.getEString(), "name", null, 0, 1, StateTestContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStateTestContext_Description(), ecorePackage.getEString(), "description", null, 0, 1, StateTestContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertiesTestOwnerEClass, PropertiesTestOwner.class, "PropertiesTestOwner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertiesTestOwner_Test(), theXbasePackage.getXBlockExpression(), null, "test", null, 0, 1, PropertiesTestOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateFunctionEClass, StateFunction.class, "StateFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStateFunction_Type(), theTypesPackage.getJvmParameterizedTypeReference(), null, "type", null, 0, 1, StateFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStateFunction_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, StateFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jexTestSequenceEClass, JexTestSequence.class, "JexTestSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJexTestSequence_Tested(), this.getJvmOperationRef(), null, "tested", null, 0, -1, JexTestSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestSequence_Instances(), this.getInstance(), null, "instances", null, 0, -1, JexTestSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJexTestSequence_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, JexTestSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jvmOperationRefEClass, JvmOperationRef.class, "JvmOperationRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJvmOperationRef_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, JvmOperationRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJvmOperationRef_ParameterTypes(), theTypesPackage.getJvmParameterizedTypeReference(), null, "parameterTypes", null, 0, -1, JvmOperationRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getState_Name(), ecorePackage.getEString(), "name", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getState_Description(), ecorePackage.getEString(), "description", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getState_ObjectTests(), this.getObjectTest(), null, "objectTests", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectTestEClass, ObjectTest.class, "ObjectTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectTest_Instance(), this.getInstance(), null, "instance", null, 0, 1, ObjectTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransition_Source(), this.getTransitionSource(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransition_Description(), ecorePackage.getEString(), "description", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Actions(), this.getTransitionAction(), null, "actions", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransition_Effects(), this.getTransitionEffect(), null, "effects", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionSourceEClass, TransitionSource.class, "TransitionSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionSource_State(), this.getState(), null, "state", null, 0, 1, TransitionSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionSource_StateRef(), this.getState(), null, "stateRef", null, 0, 1, TransitionSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionActionEClass, TransitionAction.class, "TransitionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionExpressionActionEClass, TransitionExpressionAction.class, "TransitionExpressionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionExpressionAction_Expr(), theXbasePackage.getXExpression(), null, "expr", null, 0, 1, TransitionExpressionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionExpressionAction_Times(), theXbasePackage.getXExpression(), null, "times", null, 0, 1, TransitionExpressionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionInputActionEClass, TransitionInputAction.class, "TransitionInputAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionInputAction_Input(), ecorePackage.getEString(), "input", null, 0, 1, TransitionInputAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionEffectEClass, TransitionEffect.class, "TransitionEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionEffect2EClass, TransitionEffect2.class, "TransitionEffect2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitionTargetEffectEClass, TransitionTargetEffect.class, "TransitionTargetEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionTargetEffect_State(), this.getState(), null, "state", null, 0, 1, TransitionTargetEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionTargetEffect_StateRef(), this.getState(), null, "stateRef", null, 0, 1, TransitionTargetEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionExceptionEffectEClass, TransitionExceptionEffect.class, "TransitionExceptionEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionExceptionEffect_ExceptionClass(), theTypesPackage.getJvmParameterizedTypeReference(), null, "exceptionClass", null, 0, 1, TransitionExceptionEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionOutputEffectEClass, TransitionOutputEffect.class, "TransitionOutputEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTransitionOutputEffect_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, TransitionOutputEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(transitionCallbackEffectEClass, TransitionCallbackEffect.class, "TransitionCallbackEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitionCallbackEffect_Instance(), this.getInstance(), null, "instance", null, 0, 1, TransitionCallbackEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionCallbackEffect_CallbackClass(), theTypesPackage.getJvmParameterizedTypeReference(), null, "callbackClass", null, 0, 1, TransitionCallbackEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTransitionCallbackEffect_MethodName(), ecorePackage.getEString(), "methodName", null, 0, 1, TransitionCallbackEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionCallbackEffect_Parameters(), this.getParameterList(), null, "parameters", null, 0, 1, TransitionCallbackEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTransitionCallbackEffect_Arguments(), theXbasePackage.getXBlockExpression(), null, "arguments", null, 0, 1, TransitionCallbackEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodEClass, Method.class, "Method", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethod_ReturnType(), theTypesPackage.getJvmTypeReference(), null, "returnType", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Parameters(), this.getParameterList(), null, "parameters", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_Body(), theXbasePackage.getXExpression(), null, "body", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterList_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Vararg(), ecorePackage.getEBoolean(), "vararg", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testedClassEClass, TestedClass.class, "TestedClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTestedClass_Interface(), ecorePackage.getEBoolean(), "interface", null, 0, 1, TestedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestedClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, TestedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestedClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestedClass_SuperClass(), theTypesPackage.getJvmParameterizedTypeReference(), null, "superClass", null, 0, 1, TestedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestedClass_SuperInterfaces(), theTypesPackage.getJvmParameterizedTypeReference(), null, "superInterfaces", null, 0, -1, TestedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestedClass_Description(), ecorePackage.getEString(), "description", null, 0, 1, TestedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestedClass_Invariant(), theXbasePackage.getXExpression(), null, "invariant", null, 0, 1, TestedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestedClass_Methods(), this.getTestedOperation(), null, "methods", null, 0, -1, TestedClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testedOperationEClass, TestedOperation.class, "TestedOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTestedOperation_Parameters(), this.getParameterList(), null, "parameters", null, 0, 1, TestedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestedOperation_Description(), ecorePackage.getEString(), "description", null, 0, 1, TestedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestedOperation_PreExpression(), theXbasePackage.getXExpression(), null, "preExpression", null, 0, 1, TestedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestedOperation_PostExpression(), theXbasePackage.getXExpression(), null, "postExpression", null, 0, 1, TestedOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(testedConstructorEClass, TestedConstructor.class, "TestedConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(testedMethodEClass, TestedMethod.class, "TestedMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTestedMethod_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, TestedMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTestedMethod_ReturnType(), theTypesPackage.getJvmParameterizedTypeReference(), null, "returnType", null, 0, 1, TestedMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTestedMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, TestedMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertiesTestEClass, PropertiesTest.class, "PropertiesTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //JexTestPackageImpl
