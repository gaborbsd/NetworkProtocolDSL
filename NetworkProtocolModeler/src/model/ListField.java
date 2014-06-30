/**
 */
package model;

import generator.FieldGenerator;
import generator.accessor.ListFieldAccessorGenerator;
import generator.varinit.ListFieldInitGenerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.ListField#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ProtocolPackage#getListField()
 * @model kind="class"
 * @generated
 */
public class ListField extends Field {
	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected Field elementType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListField() {
		super();
	}

	@Override
	public FieldGenerator getInitTemplate() {
		return ListFieldInitGenerator.getInstance();
	}
	
	@Override
	public FieldGenerator getAccessorTemplate() {
		return ListFieldAccessorGenerator.getInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.LIST_FIELD;
	}

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(Field)
	 * @see model.ProtocolPackage#getListField_ElementType()
	 * @model required="true"
	 * @generated
	 */
	public Field getElementType() {
		if (elementType != null && elementType.eIsProxy()) {
			InternalEObject oldElementType = (InternalEObject)elementType;
			elementType = (Field)eResolveProxy(oldElementType);
			if (elementType != oldElementType) {
			}
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field basicGetElementType() {
		return elementType;
	}

	/**
	 * Sets the value of the '{@link model.ListField#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	public void setElementType(Field newElementType) {
		elementType = newElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProtocolPackage.LIST_FIELD__ELEMENT_TYPE:
				if (resolve) return getElementType();
				return basicGetElementType();
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
			case ProtocolPackage.LIST_FIELD__ELEMENT_TYPE:
				setElementType((Field)newValue);
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
			case ProtocolPackage.LIST_FIELD__ELEMENT_TYPE:
				setElementType((Field)null);
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
			case ProtocolPackage.LIST_FIELD__ELEMENT_TYPE:
				return elementType != null;
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String getJavaType() {
		return "List<" + elementType.getJavaType() + ">";
	}

} // ListField
