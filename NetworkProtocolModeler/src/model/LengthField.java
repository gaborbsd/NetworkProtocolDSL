/**
 */
package model;

import generator.FieldGenerator;
import generator.accessor.LengthFieldAccessorGenerator;
import generator.clone.DummyCloneFieldGenerator;
import generator.vardef.DummyFieldDefinitionGenerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Length Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.LengthField#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ProtocolPackage#getLengthField()
 * @model kind="class"
 * @generated
 */
public class LengthField extends Field {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected BinaryField ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LengthField() {
		super();
	}
	
	@Override
	public FieldGenerator getDefinitionTemplate() {
		return DummyFieldDefinitionGenerator.getInstance();
	}
	
	@Override
	public FieldGenerator getAccessorTemplate() {
		return LengthFieldAccessorGenerator.getInstance();
	}
	
	@Override
	public FieldGenerator getCloneTemplate() {
		return DummyCloneFieldGenerator.getInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.LENGTH_FIELD;
	}

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(BinaryField)
	 * @see model.ProtocolPackage#getLengthField_Ref()
	 * @model required="true"
	 * @generated
	 */
	public BinaryField getRef() {
		if (ref != null && ref.eIsProxy()) {
			InternalEObject oldRef = (InternalEObject)ref;
			ref = (BinaryField)eResolveProxy(oldRef);
			if (ref != oldRef) {
			}
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryField basicGetRef() {
		return ref;
	}

	/**
	 * Sets the value of the '{@link model.LengthField#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	public void setRef(BinaryField newRef) {
		ref = newRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtocolPackage.LENGTH_FIELD__REF:
				if (resolve) return getRef();
				return basicGetRef();
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
			case ProtocolPackage.LENGTH_FIELD__REF:
				setRef((BinaryField)newValue);
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
			case ProtocolPackage.LENGTH_FIELD__REF:
				setRef((BinaryField)null);
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
			case ProtocolPackage.LENGTH_FIELD__REF:
				return ref != null;
		}
		return super.eIsSet(featureID);
	}

} // LengthField
