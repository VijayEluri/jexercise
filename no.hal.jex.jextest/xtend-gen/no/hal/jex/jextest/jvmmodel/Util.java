package no.hal.jex.jextest.jvmmodel;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import no.hal.jex.jextest.jexTest.Instance;
import no.hal.jex.jextest.jexTest.JexTestCase;
import no.hal.jex.jextest.jexTest.JexTestSuite;
import no.hal.jex.jextest.jexTest.JvmOperationRef;
import no.hal.jex.jextest.jexTest.ObjectTest;
import no.hal.jex.jextest.jexTest.PropertiesTestOwner;
import no.hal.jex.jextest.jexTest.StateFunction;
import no.hal.jex.jextest.jexTest.TestedClass;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class Util {
  public <T extends Object> String relativeName(final EObject eObject, final Class<T> c) {
    String name = "";
    EObject e = eObject;
    while ((!Objects.equal(e, null))) {
      {
        final EObject child = e;
        EObject _eContainer = e.eContainer();
        e = _eContainer;
        String childName = null;
        EClass _eClass = child.eClass();
        final EStructuralFeature nameFeature = _eClass.getEStructuralFeature("name");
        boolean _notEquals = (!Objects.equal(nameFeature, null));
        if (_notEquals) {
          Object _eGet = child.eGet(nameFeature);
          childName = ((String) _eGet);
        }
        boolean _equals = Objects.equal(childName, null);
        if (_equals) {
          final EStructuralFeature feature = child.eContainingFeature();
          boolean _and = false;
          boolean _notEquals_1 = (!Objects.equal(feature, null));
          if (!_notEquals_1) {
            _and = false;
          } else {
            boolean _notEquals_2 = (!Objects.equal(e, null));
            _and = _notEquals_2;
          }
          if (_and) {
            String _name = feature.getName();
            Object _xifexpression = null;
            boolean _isMany = feature.isMany();
            if (_isMany) {
              Object _eGet_1 = e.eGet(feature);
              _xifexpression = Integer.valueOf(((EList<?>) _eGet_1).indexOf(child));
            } else {
              _xifexpression = "";
            }
            String _plus = (_name + _xifexpression);
            childName = _plus;
          }
        }
        boolean _notEquals_3 = (!Objects.equal(childName, null));
        if (_notEquals_3) {
          name = (("_" + childName) + name);
        }
        boolean _isInstance = c.isInstance(child);
        if (_isInstance) {
          return name;
        }
      }
    }
    return null;
  }
  
  public <T extends Object> T ancestor(final EObject eObject, final Class<T> c) {
    Object _xblockexpression = null;
    {
      EObject e = eObject;
      while ((!Objects.equal(e, null))) {
        {
          boolean _isInstance = c.isInstance(e);
          if (_isInstance) {
            return ((T) e);
          }
          EObject _eContainer = e.eContainer();
          e = _eContainer;
        }
      }
      _xblockexpression = null;
    }
    return ((T)_xblockexpression);
  }
  
  public String prependPackageName(final String name, final EObject context) {
    String _xblockexpression = null;
    {
      int _lastIndexOf = name.lastIndexOf(".");
      boolean _lessThan = (_lastIndexOf < 0);
      if (_lessThan) {
        final JexTestSuite packOwner = this.<JexTestSuite>ancestor(context, JexTestSuite.class);
        boolean _and = false;
        boolean _and_1 = false;
        boolean _and_2 = false;
        boolean _notEquals = (!Objects.equal(packOwner, null));
        if (!_notEquals) {
          _and_2 = false;
        } else {
          String _suiteClassName = packOwner.getSuiteClassName();
          boolean _notEquals_1 = (!Objects.equal(_suiteClassName, null));
          _and_2 = _notEquals_1;
        }
        if (!_and_2) {
          _and_1 = false;
        } else {
          boolean _notEquals_2 = (!Objects.equal(name, null));
          _and_1 = _notEquals_2;
        }
        if (!_and_1) {
          _and = false;
        } else {
          int _lastIndexOf_1 = name.lastIndexOf(".");
          boolean _lessThan_1 = (_lastIndexOf_1 < 0);
          _and = _lessThan_1;
        }
        if (_and) {
          String _suiteClassName_1 = packOwner.getSuiteClassName();
          final int pos = _suiteClassName_1.lastIndexOf(".");
          if ((pos > 0)) {
            String _suiteClassName_2 = packOwner.getSuiteClassName();
            String _substring = _suiteClassName_2.substring(0, (pos + 1));
            return (_substring + name);
          }
        }
      }
      _xblockexpression = name;
    }
    return _xblockexpression;
  }
  
  public String testedClassName(final JexTestCase testCase) {
    String _elvis = null;
    JvmParameterizedTypeReference _testedClassRef = testCase.getTestedClassRef();
    String _qualifiedName = null;
    if (_testedClassRef!=null) {
      _qualifiedName=_testedClassRef.getQualifiedName();
    }
    if (_qualifiedName != null) {
      _elvis = _qualifiedName;
    } else {
      EList<TestedClass> _testedClasses = testCase.getTestedClasses();
      TestedClass _head = IterableExtensions.<TestedClass>head(_testedClasses);
      String _name = _head.getName();
      _elvis = _name;
    }
    return _elvis;
  }
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  public JvmTypeReference jvmType(final XExpression expr, final EObject context) {
    JvmTypeReference _xifexpression = null;
    if ((expr instanceof XAbstractFeatureCall)) {
      JvmTypeReference _xblockexpression = null;
      {
        final JvmIdentifiableElement feature = ((XAbstractFeatureCall)expr).getFeature();
        JvmTypeReference _switchResult = null;
        boolean _matched = false;
        if (!_matched) {
          if (feature instanceof JvmOperation) {
            _matched=true;
            _switchResult = ((JvmOperation)feature).getReturnType();
          }
        }
        if (!_matched) {
          if (feature instanceof JvmConstructor) {
            _matched=true;
            JvmDeclaredType _declaringType = ((JvmConstructor)feature).getDeclaringType();
            _switchResult = this._jvmTypesBuilder.newTypeRef(_declaringType);
          }
        }
        if (!_matched) {
          if (feature instanceof JvmField) {
            _matched=true;
            _switchResult = ((JvmField)feature).getType();
          }
        }
        if (!_matched) {
          _switchResult = null;
        }
        _xblockexpression = _switchResult;
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  @Inject
  @Extension
  private IJvmModelAssociations _iJvmModelAssociations;
  
  public JvmTypeReference testedJvmTypeRef(final JexTestCase testCase) {
    JvmTypeReference _elvis = null;
    JvmParameterizedTypeReference _testedClassRef = testCase.getTestedClassRef();
    if (_testedClassRef != null) {
      _elvis = _testedClassRef;
    } else {
      JvmTypeReference _xblockexpression = null;
      {
        EList<TestedClass> _testedClasses = testCase.getTestedClasses();
        final TestedClass testedClass = IterableExtensions.<TestedClass>head(_testedClasses);
        Set<EObject> _jvmElements = this._iJvmModelAssociations.getJvmElements(testedClass);
        EObject _head = IterableExtensions.<EObject>head(_jvmElements);
        _xblockexpression = this._jvmTypesBuilder.newTypeRef(((JvmType) _head));
      }
      _elvis = _xblockexpression;
    }
    return _elvis;
  }
  
  public boolean isDefaultInstanceTest(final EObject eObject) {
    JexTestCase _ancestor = this.<JexTestCase>ancestor(eObject, JexTestCase.class);
    EList<Instance> _instances = _ancestor.getInstances();
    return _instances.isEmpty();
  }
  
  public JvmTypeReference defaultInstanceType(final EObject eObject) {
    JvmTypeReference _xblockexpression = null;
    {
      final JexTestCase testCase = this.<JexTestCase>ancestor(eObject, JexTestCase.class);
      JvmTypeReference _testedJvmTypeRef = null;
      if (testCase!=null) {
        _testedJvmTypeRef=this.testedJvmTypeRef(testCase);
      }
      _xblockexpression = _testedJvmTypeRef;
    }
    return _xblockexpression;
  }
  
  public String defaultInstanceName(final EObject eObject) {
    JexTestCase _ancestor = this.<JexTestCase>ancestor(eObject, JexTestCase.class);
    JvmTypeReference _testedJvmTypeRef = this.testedJvmTypeRef(_ancestor);
    String _simpleName = _testedJvmTypeRef.getSimpleName();
    return StringExtensions.toFirstLower(_simpleName);
  }
  
  public String instanceName(final EObject eObject) {
    String _xblockexpression = null;
    {
      final PropertiesTestOwner propertiesTestOwner = this.<PropertiesTestOwner>ancestor(eObject, PropertiesTestOwner.class);
      if ((propertiesTestOwner instanceof StateFunction)) {
        return "it";
      } else {
        if ((propertiesTestOwner instanceof ObjectTest)) {
          final Instance instance = ((ObjectTest)propertiesTestOwner).getInstance();
          boolean _notEquals = (!Objects.equal(instance, null));
          if (_notEquals) {
            return instance.getName();
          }
        }
      }
      JexTestCase _ancestor = this.<JexTestCase>ancestor(eObject, JexTestCase.class);
      final EList<Instance> instances = _ancestor.getInstances();
      String _xifexpression = null;
      boolean _isEmpty = instances.isEmpty();
      if (_isEmpty) {
        _xifexpression = this.defaultInstanceName(eObject);
      } else {
        String _xifexpression_1 = null;
        int _size = instances.size();
        boolean _equals = (_size == 1);
        if (_equals) {
          Instance _head = IterableExtensions.<Instance>head(instances);
          _xifexpression_1 = _head.getName();
        } else {
          _xifexpression_1 = null;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public JvmTypeReference jvmType(final Instance instance) {
    JvmTypeReference _elvis = null;
    JvmTypeReference _type = instance.getType();
    if (_type != null) {
      _elvis = _type;
    } else {
      JvmTypeReference _defaultInstanceType = this.defaultInstanceType(instance);
      _elvis = _defaultInstanceType;
    }
    return _elvis;
  }
  
  public JvmTypeReference jvmInstanceType(final EObject eObject) {
    JvmTypeReference _xblockexpression = null;
    {
      final PropertiesTestOwner propertiesTestOwner = this.<PropertiesTestOwner>ancestor(eObject, PropertiesTestOwner.class);
      if ((propertiesTestOwner instanceof StateFunction)) {
        JvmTypeReference _elvis = null;
        JvmParameterizedTypeReference _type = ((StateFunction)propertiesTestOwner).getType();
        if (_type != null) {
          _elvis = _type;
        } else {
          JvmTypeReference _defaultInstanceType = this.defaultInstanceType(eObject);
          _elvis = _defaultInstanceType;
        }
        return _elvis;
      } else {
        if ((propertiesTestOwner instanceof ObjectTest)) {
          final Instance instance = ((ObjectTest)propertiesTestOwner).getInstance();
          boolean _notEquals = (!Objects.equal(instance, null));
          if (_notEquals) {
            return this.jvmType(instance);
          }
        }
      }
      JexTestCase _ancestor = this.<JexTestCase>ancestor(eObject, JexTestCase.class);
      final EList<Instance> instances = _ancestor.getInstances();
      JvmTypeReference _xifexpression = null;
      boolean _isEmpty = instances.isEmpty();
      if (_isEmpty) {
        _xifexpression = this.defaultInstanceType(eObject);
      } else {
        JvmTypeReference _xifexpression_1 = null;
        int _size = instances.size();
        boolean _equals = (_size == 1);
        if (_equals) {
          Instance _head = IterableExtensions.<Instance>head(instances);
          _xifexpression_1 = this.jvmType(_head);
        } else {
          _xifexpression_1 = null;
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String asSourceText(final EList<? extends EObject> eObjects, final String separator) {
    final Function1<EObject, CharSequence> _function = new Function1<EObject, CharSequence>() {
      @Override
      public CharSequence apply(final EObject it) {
        return Util.this.asSourceText(it);
      }
    };
    return IterableExtensions.join(eObjects, separator, _function);
  }
  
  public String asSourceText(final EObject eObject) {
    ICompositeNode _node = NodeModelUtils.getNode(eObject);
    return NodeModelUtils.getTokenText(_node);
  }
  
  public String quote(final String s, final String q) {
    return s.replace(q, ("\\" + q));
  }
  
  public StringBuilder appendMethodSignature(final StringBuilder buffer, final JvmExecutable op) {
    StringBuilder _xblockexpression = null;
    {
      if ((op instanceof JvmOperation)) {
        JvmTypeReference _returnType = ((JvmOperation)op).getReturnType();
        boolean _notEquals = (!Objects.equal(_returnType, null));
        if (_notEquals) {
          JvmTypeReference _returnType_1 = ((JvmOperation)op).getReturnType();
          this.appendSignatureType(buffer, _returnType_1);
          buffer.append(" ");
        }
      }
      String _simpleName = op.getSimpleName();
      buffer.append(_simpleName);
      buffer.append("(");
      final int size = buffer.length();
      EList<JvmFormalParameter> _parameters = op.getParameters();
      for (final JvmFormalParameter parameter : _parameters) {
        {
          int _length = buffer.length();
          boolean _greaterThan = (_length > size);
          if (_greaterThan) {
            buffer.append(",");
          }
          JvmTypeReference _parameterType = parameter.getParameterType();
          this.appendSignatureType(buffer, _parameterType);
        }
      }
      _xblockexpression = buffer.append(")");
    }
    return _xblockexpression;
  }
  
  public StringBuilder appendSignatureType(final StringBuilder buffer, final JvmTypeReference type) {
    String _identifier = type.getIdentifier();
    return buffer.append(_identifier);
  }
  
  public String removeJavaLang(final String s) {
    return s.replace("java.lang.", "");
  }
  
  public EObject getProblemObject(final Resource.Diagnostic diagnostic, final Resource resource) {
    Object _xblockexpression = null;
    {
      if ((diagnostic instanceof AbstractDiagnostic)) {
        final URI uri = ((AbstractDiagnostic)diagnostic).getUriToProblem();
        String _fragment = uri.fragment();
        return resource.getEObject(_fragment);
      }
      _xblockexpression = null;
    }
    return ((EObject)_xblockexpression);
  }
  
  public boolean hasDiagnostic(final EObject eObject) {
    boolean _xblockexpression = false;
    {
      final Resource resource = eObject.eResource();
      EList<Resource.Diagnostic> _errors = resource.getErrors();
      for (final Resource.Diagnostic diagnostic : _errors) {
        {
          EObject problemObject = this.getProblemObject(diagnostic, resource);
          while ((!Objects.equal(problemObject, null))) {
            {
              boolean _equals = Objects.equal(problemObject, eObject);
              if (_equals) {
                return true;
              }
              EObject _eContainer = problemObject.eContainer();
              problemObject = _eContainer;
            }
          }
        }
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public ITreeAppendable generateUnsupportedOperationException(final EObject problem, final ITreeAppendable appendable) {
    return appendable.append("throw new UnsupportedOperationException(\"Test wouldn\'t compile, due to missing or erroneous code.\");");
  }
  
  public Iterable<JvmOperation> resolveOperatorRefs(final Collection<JvmOperationRef> refs) {
    final Function1<JvmOperationRef, JvmOperation> _function = new Function1<JvmOperationRef, JvmOperation>() {
      @Override
      public JvmOperation apply(final JvmOperationRef it) {
        return Util.this.resolveOperatorRef(it);
      }
    };
    return IterableExtensions.<JvmOperationRef, JvmOperation>map(refs, _function);
  }
  
  public JvmOperation resolveOperatorRef(final JvmOperationRef opRef) {
    JvmOperation _xblockexpression = null;
    {
      final JvmTypeReference opOwner = this.defaultInstanceType(opRef);
      JvmType _type = opOwner.getType();
      EList<JvmMember> _members = ((JvmDeclaredType) _type).getMembers();
      Iterable<JvmOperation> _filter = Iterables.<JvmOperation>filter(_members, JvmOperation.class);
      final Function1<JvmOperation, Boolean> _function = new Function1<JvmOperation, Boolean>() {
        @Override
        public Boolean apply(final JvmOperation it) {
          boolean _and = false;
          String _simpleName = it.getSimpleName();
          String _methodName = opRef.getMethodName();
          boolean _equals = Objects.equal(_simpleName, _methodName);
          if (!_equals) {
            _and = false;
          } else {
            EList<JvmFormalParameter> _parameters = it.getParameters();
            EList<JvmParameterizedTypeReference> _parameterTypes = opRef.getParameterTypes();
            boolean _matchParameterTypes = Util.this.matchParameterTypes(_parameters, _parameterTypes);
            _and = _matchParameterTypes;
          }
          return Boolean.valueOf(_and);
        }
      };
      _xblockexpression = IterableExtensions.<JvmOperation>findFirst(_filter, _function);
    }
    return _xblockexpression;
  }
  
  public boolean matchParameterTypes(final Collection<JvmFormalParameter> formalParameters, final Collection<JvmParameterizedTypeReference> parameterTypes) {
    boolean _xblockexpression = false;
    {
      int _size = formalParameters.size();
      int _size_1 = parameterTypes.size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        return false;
      }
      final Iterator<JvmFormalParameter> it1 = formalParameters.iterator();
      final Iterator<JvmParameterizedTypeReference> it2 = parameterTypes.iterator();
      while ((it1.hasNext() && it2.hasNext())) {
        JvmFormalParameter _next = it1.next();
        JvmTypeReference _parameterType = _next.getParameterType();
        String _identifier = _parameterType.getIdentifier();
        JvmParameterizedTypeReference _next_1 = it2.next();
        String _identifier_1 = _next_1.getIdentifier();
        boolean _notEquals_1 = (!Objects.equal(_identifier, _identifier_1));
        if (_notEquals_1) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
}
