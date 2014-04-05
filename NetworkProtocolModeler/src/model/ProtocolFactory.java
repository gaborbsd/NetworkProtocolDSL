/**
 */
package model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see model.ProtocolPackage
 * @generated
 */
public class ProtocolFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProtocolFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProtocolFactory init() {
		try {
			ProtocolFactory theProtocolFactory = (ProtocolFactory)EPackage.Registry.INSTANCE.getEFactory(ProtocolPackage.eNS_URI);
			if (theProtocolFactory != null) {
				return theProtocolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProtocolFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProtocolPackage.DATA_TYPE: return createDataType();
			case ProtocolPackage.INTEGER_FIELD: return createIntegerField();
			case ProtocolPackage.BINARY_FIELD: return createBinaryField();
			case ProtocolPackage.STRING_FIELD: return createStringField();
			case ProtocolPackage.BIT_FIELD_COMPONENT: return createBitFieldComponent();
			case ProtocolPackage.BIT_FIELD: return createBitField();
			case ProtocolPackage.LIST_FIELD: return createListField();
			case ProtocolPackage.COUNT_FIELD: return createCountField();
			case ProtocolPackage.PROTOCOL_MODEL: return createProtocolModel();
			case ProtocolPackage.FORMATTER: return createFormatter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataType dataType = new DataType();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerField createIntegerField() {
		IntegerField integerField = new IntegerField();
		return integerField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryField createBinaryField() {
		BinaryField binaryField = new BinaryField();
		return binaryField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringField createStringField() {
		StringField stringField = new StringField();
		return stringField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitFieldComponent createBitFieldComponent() {
		BitFieldComponent bitFieldComponent = new BitFieldComponent();
		return bitFieldComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitField createBitField() {
		BitField bitField = new BitField();
		return bitField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListField createListField() {
		ListField listField = new ListField();
		return listField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountField createCountField() {
		CountField countField = new CountField();
		return countField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolModel createProtocolModel() {
		ProtocolModel protocolModel = new ProtocolModel();
		return protocolModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formatter createFormatter() {
		Formatter formatter = new Formatter();
		return formatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolPackage getProtocolPackage() {
		return (ProtocolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProtocolPackage getPackage() {
		return ProtocolPackage.eINSTANCE;
	}

} //ProtocolFactory
