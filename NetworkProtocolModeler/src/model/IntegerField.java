/**
 */
package model;

import generator.DummyCloneFieldGenerator;
import generator.FieldGenerator;
import generator.NumeralHashcodeFieldGenerator;
import generator.RefEqualityFieldGenerator;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Integer Field</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see model.ProtocolPackage#getIntegerField()
 * @model kind="class"
 * @generated
 */
public class IntegerField extends Field {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerField() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.INTEGER_FIELD;
	}

	@Override
	public FieldGenerator getEqualsTemplate() {
		return RefEqualityFieldGenerator.getInstance();
	}

	@Override
	public FieldGenerator getHashcodeTemplate() {
		return NumeralHashcodeFieldGenerator.getInstance();
	}

	@Override
	public FieldGenerator getCloneTemplate() {
		return DummyCloneFieldGenerator.getInstance();
	}

} // IntegerField
