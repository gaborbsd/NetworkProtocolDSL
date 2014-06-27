/**
 */
package model;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Field</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ProtocolPackage#getStringField()
 * @model kind="class"
 * @generated
 */
public class StringField extends Field {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringField() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.STRING_FIELD;
	}
	
	@Override
	public String getJavaType() {
		return "String";
	}
} // StringField
