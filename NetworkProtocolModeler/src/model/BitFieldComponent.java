/**
 */
package model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Field Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.BitFieldComponent#getName <em>Name</em>}</li>
 *   <li>{@link model.BitFieldComponent#getBitLength <em>Bit Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ProtocolPackage#getBitFieldComponent()
 * @model kind="class"
 * @generated
 */
public class BitFieldComponent extends MinimalEObjectImpl.Container implements EObject {
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
	 * The default value of the '{@link #getBitLength() <em>Bit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitLength()
	 * @generated
	 * @ordered
	 */
	protected static final Long BIT_LENGTH_EDEFAULT = new Long(0L);

	/**
	 * The cached value of the '{@link #getBitLength() <em>Bit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitLength()
	 * @generated
	 * @ordered
	 */
	protected Long bitLength = BIT_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitFieldComponent() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.BIT_FIELD_COMPONENT;
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
	 * @see model.ProtocolPackage#getBitFieldComponent_Name()
	 * @model default=""
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='BitField' unique='false' upper='*'"
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link model.BitFieldComponent#getName <em>Name</em>}' attribute.
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
	 * Returns the value of the '<em><b>Bit Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bit Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Length</em>' attribute.
	 * @see #setBitLength(Long)
	 * @see model.ProtocolPackage#getBitFieldComponent_BitLength()
	 * @model default="0"
	 * @generated
	 */
	public Long getBitLength() {
		return bitLength;
	}

	/**
	 * Sets the value of the '{@link model.BitFieldComponent#getBitLength <em>Bit Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Length</em>' attribute.
	 * @see #getBitLength()
	 * @generated
	 */
	public void setBitLength(Long newBitLength) {
		bitLength = newBitLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtocolPackage.BIT_FIELD_COMPONENT__NAME:
				return getName();
			case ProtocolPackage.BIT_FIELD_COMPONENT__BIT_LENGTH:
				return getBitLength();
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
			case ProtocolPackage.BIT_FIELD_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case ProtocolPackage.BIT_FIELD_COMPONENT__BIT_LENGTH:
				setBitLength((Long)newValue);
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
			case ProtocolPackage.BIT_FIELD_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProtocolPackage.BIT_FIELD_COMPONENT__BIT_LENGTH:
				setBitLength(BIT_LENGTH_EDEFAULT);
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
			case ProtocolPackage.BIT_FIELD_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProtocolPackage.BIT_FIELD_COMPONENT__BIT_LENGTH:
				return BIT_LENGTH_EDEFAULT == null ? bitLength != null : !BIT_LENGTH_EDEFAULT.equals(bitLength);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", bitLength: ");
		result.append(bitLength);
		result.append(')');
		return result.toString();
	}

} // BitFieldComponent
