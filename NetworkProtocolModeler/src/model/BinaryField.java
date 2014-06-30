/**
 */
package model;

import generator.FieldGenerator;
import generator.varinit.ByteArrayInitGenerator;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Field</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see model.ProtocolPackage#getBinaryField()
 * @model kind="class"
 * @generated
 */
public class BinaryField extends Field {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryField() {
		super();
	}
	
	@Override
	public FieldGenerator getInitTemplate() {
		return ByteArrayInitGenerator.getInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.BINARY_FIELD;
	}

	@Override
	public String getJavaType() {
		return "byte[]";
	}
} // BinaryField
