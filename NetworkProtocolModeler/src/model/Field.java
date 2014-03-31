/**
 */
package model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.Field#getByteLen <em>Byte Len</em>}</li>
 *   <li>{@link model.Field#getName <em>Name</em>}</li>
 *   <li>{@link model.Field#getPackage <em>Package</em>}</li>
 *   <li>{@link model.Field#getUnbounded <em>Unbounded</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ProtocolPackage#getField()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class Field extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getByteLen() <em>Byte Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteLen()
	 * @generated
	 * @ordered
	 */
	protected static final Long BYTE_LEN_EDEFAULT = new Long(0L);

	/**
	 * The cached value of the '{@link #getByteLen() <em>Byte Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteLen()
	 * @generated
	 * @ordered
	 */
	protected Long byteLen = BYTE_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected String package_ = PACKAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnbounded() <em>Unbounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbounded()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNBOUNDED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getUnbounded() <em>Unbounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnbounded()
	 * @generated
	 * @ordered
	 */
	protected Boolean unbounded = UNBOUNDED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Field() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.FIELD;
	}

	/**
	 * Returns the value of the '<em><b>Byte Len</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Len</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Len</em>' attribute.
	 * @see #setByteLen(Long)
	 * @see model.ProtocolPackage#getField_ByteLen()
	 * @model default="0"
	 * @generated
	 */
	public Long getByteLen() {
		return byteLen;
	}

	/**
	 * Sets the value of the '{@link model.Field#getByteLen <em>Byte Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Len</em>' attribute.
	 * @see #getByteLen()
	 * @generated
	 */
	public void setByteLen(Long newByteLen) {
		byteLen = newByteLen;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see model.ProtocolPackage#getField_Name()
	 * @model default=""
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link model.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see model.ProtocolPackage#getField_Package()
	 * @model default=""
	 * @generated
	 */
	public String getPackage() {
		return package_;
	}

	/**
	 * Sets the value of the '{@link model.Field#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	public void setPackage(String newPackage) {
		package_ = newPackage;
	}

	/**
	 * Returns the value of the '<em><b>Unbounded</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unbounded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unbounded</em>' attribute.
	 * @see #setUnbounded(Boolean)
	 * @see model.ProtocolPackage#getField_Unbounded()
	 * @model default="false"
	 * @generated
	 */
	public Boolean getUnbounded() {
		return unbounded;
	}

	/**
	 * Sets the value of the '{@link model.Field#getUnbounded <em>Unbounded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unbounded</em>' attribute.
	 * @see #getUnbounded()
	 * @generated
	 */
	public void setUnbounded(Boolean newUnbounded) {
		unbounded = newUnbounded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtocolPackage.FIELD__BYTE_LEN:
				return getByteLen();
			case ProtocolPackage.FIELD__NAME:
				return getName();
			case ProtocolPackage.FIELD__PACKAGE:
				return getPackage();
			case ProtocolPackage.FIELD__UNBOUNDED:
				return getUnbounded();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProtocolPackage.FIELD__BYTE_LEN:
				setByteLen((Long)newValue);
				return;
			case ProtocolPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case ProtocolPackage.FIELD__PACKAGE:
				setPackage((String)newValue);
				return;
			case ProtocolPackage.FIELD__UNBOUNDED:
				setUnbounded((Boolean)newValue);
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
			case ProtocolPackage.FIELD__BYTE_LEN:
				setByteLen(BYTE_LEN_EDEFAULT);
				return;
			case ProtocolPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProtocolPackage.FIELD__PACKAGE:
				setPackage(PACKAGE_EDEFAULT);
				return;
			case ProtocolPackage.FIELD__UNBOUNDED:
				setUnbounded(UNBOUNDED_EDEFAULT);
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
			case ProtocolPackage.FIELD__BYTE_LEN:
				return BYTE_LEN_EDEFAULT == null ? byteLen != null : !BYTE_LEN_EDEFAULT.equals(byteLen);
			case ProtocolPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProtocolPackage.FIELD__PACKAGE:
				return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
			case ProtocolPackage.FIELD__UNBOUNDED:
				return UNBOUNDED_EDEFAULT == null ? unbounded != null : !UNBOUNDED_EDEFAULT.equals(unbounded);
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
		result.append(" (byteLen: ");
		result.append(byteLen);
		result.append(", name: ");
		result.append(name);
		result.append(", package: ");
		result.append(package_);
		result.append(", unbounded: ");
		result.append(unbounded);
		result.append(')');
		return result.toString();
	}

} // Field
