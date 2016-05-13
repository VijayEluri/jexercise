/**
 */
package no.hal.emfs.impl;

import java.util.Collection;
import no.hal.emfs.AbstractStringContentProvider;
import no.hal.emfs.AbstractStringContents;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.Property;
import no.hal.emfs.PropertyOwner;
import no.hal.emfs.TagsOwner;
import no.hal.emfs.util.StringAccumulator;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract String Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.impl.AbstractStringContentProviderImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link no.hal.emfs.impl.AbstractStringContentProviderImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link no.hal.emfs.impl.AbstractStringContentProviderImpl#isWriteable <em>Writeable</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractStringContentProviderImpl extends AbstractBytesContentProviderImpl implements AbstractStringContentProvider {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;
	/**
	 * The default value of the '{@link #isWriteable() <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITEABLE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isWriteable() <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteable()
	 * @generated
	 * @ordered
	 */
	protected boolean writeable = WRITEABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractStringContentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.ABSTRACT_STRING_CONTENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWriteable() {
		return writeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteable(boolean newWriteable) {
		boolean oldWriteable = writeable;
		writeable = newWriteable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__WRITEABLE, oldWriteable, writeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringContent() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringContent(String contents) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <A> A accumulate(StringAccumulator<A> accumulator, A initialValue) {
		return accumulator.accumulate(initialValue, getStringContent(), this);
	}

	@Override
	public byte[] getByteContents() {
		return getStringContent().getBytes();
	}

	@Override
	public void setByteContents(byte[] contents) {
		setStringContent(new String(contents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__TAGS:
				return getTags();
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__PROPERTIES:
				return getProperties();
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__WRITEABLE:
				return isWriteable();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__WRITEABLE:
				setWriteable((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__TAGS:
				getTags().clear();
				return;
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__PROPERTIES:
				getProperties().clear();
				return;
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__WRITEABLE:
				setWriteable(WRITEABLE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__TAGS:
				return tags != null && !tags.isEmpty();
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__WRITEABLE:
				return writeable != WRITEABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TagsOwner.class) {
			switch (derivedFeatureID) {
				case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__TAGS: return EmfsPackage.TAGS_OWNER__TAGS;
				default: return -1;
			}
		}
		if (baseClass == PropertyOwner.class) {
			switch (derivedFeatureID) {
				case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__PROPERTIES: return EmfsPackage.PROPERTY_OWNER__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == AbstractStringContents.class) {
			switch (derivedFeatureID) {
				case EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__WRITEABLE: return EmfsPackage.ABSTRACT_STRING_CONTENTS__WRITEABLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TagsOwner.class) {
			switch (baseFeatureID) {
				case EmfsPackage.TAGS_OWNER__TAGS: return EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__TAGS;
				default: return -1;
			}
		}
		if (baseClass == PropertyOwner.class) {
			switch (baseFeatureID) {
				case EmfsPackage.PROPERTY_OWNER__PROPERTIES: return EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == AbstractStringContents.class) {
			switch (baseFeatureID) {
				case EmfsPackage.ABSTRACT_STRING_CONTENTS__WRITEABLE: return EmfsPackage.ABSTRACT_STRING_CONTENT_PROVIDER__WRITEABLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tags: ");
		result.append(tags);
		result.append(", writeable: ");
		result.append(writeable);
		result.append(')');
		return result.toString();
	}

	//
	
} //AbstractStringContentProviderImpl
