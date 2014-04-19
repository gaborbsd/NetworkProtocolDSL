/**
 */
package model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.DataType#getFields <em>Fields</em>}</li>
 *   <li>{@link model.DataType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link model.DataType#getHasIdentityField <em>Has Identity Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ProtocolPackage#getDataType()
 * @model kind="class"
 * @generated
 */
public class DataType extends Field {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHasIdentityField() <em>Has Identity Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIdentityField()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_IDENTITY_FIELD_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getHasIdentityField() <em>Has Identity Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasIdentityField()
	 * @generated
	 * @ordered
	 */
	protected Boolean hasIdentityField = HAS_IDENTITY_FIELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataType() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.DATA_TYPE;
	}

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link model.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see model.ProtocolPackage#getDataType_Fields()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new BasicInternalEList<Field>(Field.class);
		}
		return fields;
	}

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see model.ProtocolPackage#getDataType_TypeName()
	 * @model
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * Sets the value of the '{@link model.DataType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		typeName = newTypeName;
	}

	/**
	 * Returns the value of the '<em><b>Has Identity Field</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Identity Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Identity Field</em>' attribute.
	 * @see #setHasIdentityField(Boolean)
	 * @see model.ProtocolPackage#getDataType_HasIdentityField()
	 * @model default="false"
	 * @generated
	 */
	public Boolean getHasIdentityField() {
		return hasIdentityField;
	}

	/**
	 * Sets the value of the '{@link model.DataType#getHasIdentityField <em>Has Identity Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Identity Field</em>' attribute.
	 * @see #getHasIdentityField()
	 * @generated
	 */
	public void setHasIdentityField(Boolean newHasIdentityField) {
		hasIdentityField = newHasIdentityField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.DATA_TYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case ProtocolPackage.DATA_TYPE__FIELDS:
				return getFields();
			case ProtocolPackage.DATA_TYPE__TYPE_NAME:
				return getTypeName();
			case ProtocolPackage.DATA_TYPE__HAS_IDENTITY_FIELD:
				return getHasIdentityField();
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
			case ProtocolPackage.DATA_TYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case ProtocolPackage.DATA_TYPE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case ProtocolPackage.DATA_TYPE__HAS_IDENTITY_FIELD:
				setHasIdentityField((Boolean)newValue);
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
			case ProtocolPackage.DATA_TYPE__FIELDS:
				getFields().clear();
				return;
			case ProtocolPackage.DATA_TYPE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case ProtocolPackage.DATA_TYPE__HAS_IDENTITY_FIELD:
				setHasIdentityField(HAS_IDENTITY_FIELD_EDEFAULT);
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
			case ProtocolPackage.DATA_TYPE__FIELDS:
				return fields != null && !fields.isEmpty();
			case ProtocolPackage.DATA_TYPE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case ProtocolPackage.DATA_TYPE__HAS_IDENTITY_FIELD:
				return HAS_IDENTITY_FIELD_EDEFAULT == null ? hasIdentityField != null : !HAS_IDENTITY_FIELD_EDEFAULT.equals(hasIdentityField);
		}
		return super.eIsSet(featureID);
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
		result.append(" (typeName: ");
		result.append(typeName);
		result.append(", hasIdentityField: ");
		result.append(hasIdentityField);
		result.append(')');
		return result.toString();
	}

} // DataType
