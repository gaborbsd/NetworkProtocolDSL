/**
 */
package model;

import generator.FieldGenerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see model.ProtocolFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public class ProtocolPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "https://github.com/gaborbsd/NetworkProtocolDSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "proto";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProtocolPackage eINSTANCE = model.ProtocolPackage.init();

	/**
	 * The meta object id for the '{@link model.Field <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Field
	 * @see model.ProtocolPackage#getField()
	 * @generated
	 */
	public static final int FIELD = 1;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD__BYTE_LEN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD__UNBOUNDED = 3;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD__IDENTITY_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD__TRANSIENT_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD__FORMATTER = 6;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Definition Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD___GET_DEFINITION_TEMPLATE = 0;

	/**
	 * The operation id for the '<em>Get Init Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD___GET_INIT_TEMPLATE = 1;

	/**
	 * The operation id for the '<em>Get Accessor Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD___GET_ACCESSOR_TEMPLATE = 2;

	/**
	 * The operation id for the '<em>Get Equals Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD___GET_EQUALS_TEMPLATE = 3;

	/**
	 * The operation id for the '<em>Get Hashcode Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD___GET_HASHCODE_TEMPLATE = 4;

	/**
	 * The operation id for the '<em>Get Clone Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD___GET_CLONE_TEMPLATE = 5;

	/**
	 * The operation id for the '<em>Get Java Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD___GET_JAVA_TYPE = 6;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link model.DataType <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.DataType
	 * @see model.ProtocolPackage#getDataType()
	 * @generated
	 */
	public static final int DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE__PACKAGE = FIELD__PACKAGE;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE__FORMATTER = FIELD__FORMATTER;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE__FIELDS = FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE__TYPE_NAME = FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE__HAS_IDENTITY_FIELD = FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Definition Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE___GET_DEFINITION_TEMPLATE = FIELD___GET_DEFINITION_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Init Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE___GET_INIT_TEMPLATE = FIELD___GET_INIT_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Accessor Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE___GET_ACCESSOR_TEMPLATE = FIELD___GET_ACCESSOR_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Equals Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE___GET_EQUALS_TEMPLATE = FIELD___GET_EQUALS_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Hashcode Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE___GET_HASHCODE_TEMPLATE = FIELD___GET_HASHCODE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Clone Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE___GET_CLONE_TEMPLATE = FIELD___GET_CLONE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Java Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE___GET_JAVA_TYPE = FIELD___GET_JAVA_TYPE;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DATA_TYPE_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.IntegerField <em>Integer Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.IntegerField
	 * @see model.ProtocolPackage#getIntegerField()
	 * @generated
	 */
	public static final int INTEGER_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD__PACKAGE = FIELD__PACKAGE;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The number of structural features of the '<em>Integer Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Definition Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD___GET_DEFINITION_TEMPLATE = FIELD___GET_DEFINITION_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Init Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD___GET_INIT_TEMPLATE = FIELD___GET_INIT_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Accessor Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD___GET_ACCESSOR_TEMPLATE = FIELD___GET_ACCESSOR_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Equals Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD___GET_EQUALS_TEMPLATE = FIELD___GET_EQUALS_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Hashcode Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD___GET_HASHCODE_TEMPLATE = FIELD___GET_HASHCODE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Clone Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD___GET_CLONE_TEMPLATE = FIELD___GET_CLONE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Java Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD___GET_JAVA_TYPE = FIELD___GET_JAVA_TYPE;

	/**
	 * The number of operations of the '<em>Integer Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.BinaryField <em>Binary Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BinaryField
	 * @see model.ProtocolPackage#getBinaryField()
	 * @generated
	 */
	public static final int BINARY_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD__PACKAGE = FIELD__PACKAGE;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The number of structural features of the '<em>Binary Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Definition Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD___GET_DEFINITION_TEMPLATE = FIELD___GET_DEFINITION_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Init Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD___GET_INIT_TEMPLATE = FIELD___GET_INIT_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Accessor Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD___GET_ACCESSOR_TEMPLATE = FIELD___GET_ACCESSOR_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Equals Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD___GET_EQUALS_TEMPLATE = FIELD___GET_EQUALS_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Hashcode Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD___GET_HASHCODE_TEMPLATE = FIELD___GET_HASHCODE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Clone Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD___GET_CLONE_TEMPLATE = FIELD___GET_CLONE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Java Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD___GET_JAVA_TYPE = FIELD___GET_JAVA_TYPE;

	/**
	 * The number of operations of the '<em>Binary Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.StringField <em>String Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.StringField
	 * @see model.ProtocolPackage#getStringField()
	 * @generated
	 */
	public static final int STRING_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD__PACKAGE = FIELD__PACKAGE;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The number of structural features of the '<em>String Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Definition Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD___GET_DEFINITION_TEMPLATE = FIELD___GET_DEFINITION_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Init Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD___GET_INIT_TEMPLATE = FIELD___GET_INIT_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Accessor Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD___GET_ACCESSOR_TEMPLATE = FIELD___GET_ACCESSOR_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Equals Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD___GET_EQUALS_TEMPLATE = FIELD___GET_EQUALS_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Hashcode Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD___GET_HASHCODE_TEMPLATE = FIELD___GET_HASHCODE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Clone Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD___GET_CLONE_TEMPLATE = FIELD___GET_CLONE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Java Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD___GET_JAVA_TYPE = FIELD___GET_JAVA_TYPE;

	/**
	 * The number of operations of the '<em>String Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRING_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.BitFieldComponent <em>Bit Field Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BitFieldComponent
	 * @see model.ProtocolPackage#getBitFieldComponent()
	 * @generated
	 */
	public static final int BIT_FIELD_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD_COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bit Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD_COMPONENT__BIT_LENGTH = 1;

	/**
	 * The number of structural features of the '<em>Bit Field Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bit Field Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.BitField <em>Bit Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.BitField
	 * @see model.ProtocolPackage#getBitField()
	 * @generated
	 */
	public static final int BIT_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD__PACKAGE = FIELD__PACKAGE;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD__COMPONENTS = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Definition Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD___GET_DEFINITION_TEMPLATE = FIELD___GET_DEFINITION_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Init Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD___GET_INIT_TEMPLATE = FIELD___GET_INIT_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Accessor Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD___GET_ACCESSOR_TEMPLATE = FIELD___GET_ACCESSOR_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Equals Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD___GET_EQUALS_TEMPLATE = FIELD___GET_EQUALS_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Hashcode Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD___GET_HASHCODE_TEMPLATE = FIELD___GET_HASHCODE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Clone Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD___GET_CLONE_TEMPLATE = FIELD___GET_CLONE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Java Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD___GET_JAVA_TYPE = FIELD___GET_JAVA_TYPE;

	/**
	 * The number of operations of the '<em>Bit Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int BIT_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.ListField <em>List Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ListField
	 * @see model.ProtocolPackage#getListField()
	 * @generated
	 */
	public static final int LIST_FIELD = 7;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD__PACKAGE = FIELD__PACKAGE;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD__ELEMENT_TYPE = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Definition Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD___GET_DEFINITION_TEMPLATE = FIELD___GET_DEFINITION_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Init Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD___GET_INIT_TEMPLATE = FIELD___GET_INIT_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Accessor Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD___GET_ACCESSOR_TEMPLATE = FIELD___GET_ACCESSOR_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Equals Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD___GET_EQUALS_TEMPLATE = FIELD___GET_EQUALS_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Hashcode Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD___GET_HASHCODE_TEMPLATE = FIELD___GET_HASHCODE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Clone Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD___GET_CLONE_TEMPLATE = FIELD___GET_CLONE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Java Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD___GET_JAVA_TYPE = FIELD___GET_JAVA_TYPE;

	/**
	 * The number of operations of the '<em>List Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LIST_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.CountField <em>Count Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.CountField
	 * @see model.ProtocolPackage#getCountField()
	 * @generated
	 */
	public static final int COUNT_FIELD = 8;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD__PACKAGE = FIELD__PACKAGE;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD__REF = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Count Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Definition Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD___GET_DEFINITION_TEMPLATE = FIELD___GET_DEFINITION_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Init Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD___GET_INIT_TEMPLATE = FIELD___GET_INIT_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Accessor Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD___GET_ACCESSOR_TEMPLATE = FIELD___GET_ACCESSOR_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Equals Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD___GET_EQUALS_TEMPLATE = FIELD___GET_EQUALS_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Hashcode Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD___GET_HASHCODE_TEMPLATE = FIELD___GET_HASHCODE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Clone Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD___GET_CLONE_TEMPLATE = FIELD___GET_CLONE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Java Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD___GET_JAVA_TYPE = FIELD___GET_JAVA_TYPE;

	/**
	 * The number of operations of the '<em>Count Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.LengthField <em>Length Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.LengthField
	 * @see model.ProtocolPackage#getLengthField()
	 * @generated
	 */
	public static final int LENGTH_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Byte Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD__BYTE_LEN = FIELD__BYTE_LEN;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD__PACKAGE = FIELD__PACKAGE;

	/**
	 * The feature id for the '<em><b>Unbounded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD__UNBOUNDED = FIELD__UNBOUNDED;

	/**
	 * The feature id for the '<em><b>Identity Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD__IDENTITY_FIELD = FIELD__IDENTITY_FIELD;

	/**
	 * The feature id for the '<em><b>Transient Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD__TRANSIENT_FIELD = FIELD__TRANSIENT_FIELD;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD__FORMATTER = FIELD__FORMATTER;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD__REF = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Length Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Definition Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD___GET_DEFINITION_TEMPLATE = FIELD___GET_DEFINITION_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Init Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD___GET_INIT_TEMPLATE = FIELD___GET_INIT_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Accessor Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD___GET_ACCESSOR_TEMPLATE = FIELD___GET_ACCESSOR_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Equals Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD___GET_EQUALS_TEMPLATE = FIELD___GET_EQUALS_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Hashcode Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD___GET_HASHCODE_TEMPLATE = FIELD___GET_HASHCODE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Clone Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD___GET_CLONE_TEMPLATE = FIELD___GET_CLONE_TEMPLATE;

	/**
	 * The operation id for the '<em>Get Java Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD___GET_JAVA_TYPE = FIELD___GET_JAVA_TYPE;

	/**
	 * The number of operations of the '<em>Length Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LENGTH_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link model.ProtocolModel <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.ProtocolModel
	 * @see model.ProtocolPackage#getProtocolModel()
	 * @generated
	 */
	public static final int PROTOCOL_MODEL = 10;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_MODEL__PROTOCOLS = 0;

	/**
	 * The feature id for the '<em><b>Formatters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_MODEL__FORMATTERS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link model.Formatter <em>Formatter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see model.Formatter
	 * @see model.ProtocolPackage#getFormatter()
	 * @generated
	 */
	public static final int FORMATTER = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FORMATTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FORMATTER__PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Formatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FORMATTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Formatter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int FORMATTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Field Generator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see generator.FieldGenerator
	 * @see model.ProtocolPackage#getFieldGenerator()
	 * @generated
	 */
	public static final int FIELD_GENERATOR = 12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitFieldComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lengthFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fieldGeneratorEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see model.ProtocolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProtocolPackage() {
		super(eNS_URI, ProtocolFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProtocolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProtocolPackage init() {
		if (isInited) return (ProtocolPackage)EPackage.Registry.INSTANCE.getEPackage(ProtocolPackage.eNS_URI);

		// Obtain or create and register package
		ProtocolPackage theProtocolPackage = (ProtocolPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProtocolPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProtocolPackage());

		isInited = true;

		// Create package meta-data objects
		theProtocolPackage.createPackageContents();

		// Initialize created meta-data
		theProtocolPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProtocolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProtocolPackage.eNS_URI, theProtocolPackage);
		return theProtocolPackage;
	}


	/**
	 * Returns the meta object for class '{@link model.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see model.DataType
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link model.DataType#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see model.DataType#getFields()
	 * @see #getDataType()
	 * @generated
	 */
	public EReference getDataType_Fields() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.DataType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see model.DataType#getTypeName()
	 * @see #getDataType()
	 * @generated
	 */
	public EAttribute getDataType_TypeName() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.DataType#getHasIdentityField <em>Has Identity Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Identity Field</em>'.
	 * @see model.DataType#getHasIdentityField()
	 * @see #getDataType()
	 * @generated
	 */
	public EAttribute getDataType_HasIdentityField() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
	}


	/**
	 * Returns the meta object for class '{@link model.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see model.Field
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Field#getByteLen <em>Byte Len</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Len</em>'.
	 * @see model.Field#getByteLen()
	 * @see #getField()
	 * @generated
	 */
	public EAttribute getField_ByteLen() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Field#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see model.Field#getPackage()
	 * @see #getField()
	 * @generated
	 */
	public EAttribute getField_Package() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link model.Field#getUnbounded <em>Unbounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unbounded</em>'.
	 * @see model.Field#getUnbounded()
	 * @see #getField()
	 * @generated
	 */
	public EAttribute getField_Unbounded() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(3);
	}


	/**
	 * Returns the meta object for the attribute '{@link model.Field#getIdentityField <em>Identity Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity Field</em>'.
	 * @see model.Field#getIdentityField()
	 * @see #getField()
	 * @generated
	 */
	public EAttribute getField_IdentityField() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(4);
	}


	/**
	 * Returns the meta object for the attribute '{@link model.Field#getTransientField <em>Transient Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient Field</em>'.
	 * @see model.Field#getTransientField()
	 * @see #getField()
	 * @generated
	 */
	public EAttribute getField_TransientField() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(5);
	}


	/**
	 * Returns the meta object for the reference '{@link model.Field#getFormatter <em>Formatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formatter</em>'.
	 * @see model.Field#getFormatter()
	 * @see #getField()
	 * @generated
	 */
	public EReference getField_Formatter() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for the '{@link model.Field#getDefinitionTemplate() <em>Get Definition Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Definition Template</em>' operation.
	 * @see model.Field#getDefinitionTemplate()
	 * @generated
	 */
	public EOperation getField__GetDefinitionTemplate() {
		return fieldEClass.getEOperations().get(0);
	}


	/**
	 * Returns the meta object for the '{@link model.Field#getInitTemplate() <em>Get Init Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Init Template</em>' operation.
	 * @see model.Field#getInitTemplate()
	 * @generated
	 */
	public EOperation getField__GetInitTemplate() {
		return fieldEClass.getEOperations().get(1);
	}


	/**
	 * Returns the meta object for the '{@link model.Field#getAccessorTemplate() <em>Get Accessor Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accessor Template</em>' operation.
	 * @see model.Field#getAccessorTemplate()
	 * @generated
	 */
	public EOperation getField__GetAccessorTemplate() {
		return fieldEClass.getEOperations().get(2);
	}


	/**
	 * Returns the meta object for the '{@link model.Field#getEqualsTemplate() <em>Get Equals Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Equals Template</em>' operation.
	 * @see model.Field#getEqualsTemplate()
	 * @generated
	 */
	public EOperation getField__GetEqualsTemplate() {
		return fieldEClass.getEOperations().get(3);
	}


	/**
	 * Returns the meta object for the '{@link model.Field#getHashcodeTemplate() <em>Get Hashcode Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hashcode Template</em>' operation.
	 * @see model.Field#getHashcodeTemplate()
	 * @generated
	 */
	public EOperation getField__GetHashcodeTemplate() {
		return fieldEClass.getEOperations().get(4);
	}


	/**
	 * Returns the meta object for the '{@link model.Field#getCloneTemplate() <em>Get Clone Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Clone Template</em>' operation.
	 * @see model.Field#getCloneTemplate()
	 * @generated
	 */
	public EOperation getField__GetCloneTemplate() {
		return fieldEClass.getEOperations().get(5);
	}


	/**
	 * Returns the meta object for the '{@link model.Field#getJavaType() <em>Get Java Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Java Type</em>' operation.
	 * @see model.Field#getJavaType()
	 * @generated
	 */
	public EOperation getField__GetJavaType() {
		return fieldEClass.getEOperations().get(6);
	}


	/**
	 * Returns the meta object for class '{@link model.IntegerField <em>Integer Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Field</em>'.
	 * @see model.IntegerField
	 * @generated
	 */
	public EClass getIntegerField() {
		return integerFieldEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.BinaryField <em>Binary Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Field</em>'.
	 * @see model.BinaryField
	 * @generated
	 */
	public EClass getBinaryField() {
		return binaryFieldEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.StringField <em>String Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Field</em>'.
	 * @see model.StringField
	 * @generated
	 */
	public EClass getStringField() {
		return stringFieldEClass;
	}

	/**
	 * Returns the meta object for class '{@link model.BitFieldComponent <em>Bit Field Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field Component</em>'.
	 * @see model.BitFieldComponent
	 * @generated
	 */
	public EClass getBitFieldComponent() {
		return bitFieldComponentEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link model.BitFieldComponent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.BitFieldComponent#getName()
	 * @see #getBitFieldComponent()
	 * @generated
	 */
	public EAttribute getBitFieldComponent_Name() {
		return (EAttribute)bitFieldComponentEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link model.BitFieldComponent#getBitLength <em>Bit Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bit Length</em>'.
	 * @see model.BitFieldComponent#getBitLength()
	 * @see #getBitFieldComponent()
	 * @generated
	 */
	public EAttribute getBitFieldComponent_BitLength() {
		return (EAttribute)bitFieldComponentEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link model.BitField <em>Bit Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit Field</em>'.
	 * @see model.BitField
	 * @generated
	 */
	public EClass getBitField() {
		return bitFieldEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link model.BitField#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see model.BitField#getComponents()
	 * @see #getBitField()
	 * @generated
	 */
	public EReference getBitField_Components() {
		return (EReference)bitFieldEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link model.ListField <em>List Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Field</em>'.
	 * @see model.ListField
	 * @generated
	 */
	public EClass getListField() {
		return listFieldEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link model.ListField#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see model.ListField#getElementType()
	 * @see #getListField()
	 * @generated
	 */
	public EReference getListField_ElementType() {
		return (EReference)listFieldEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link model.CountField <em>Count Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Field</em>'.
	 * @see model.CountField
	 * @generated
	 */
	public EClass getCountField() {
		return countFieldEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link model.CountField#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see model.CountField#getRef()
	 * @see #getCountField()
	 * @generated
	 */
	public EReference getCountField_Ref() {
		return (EReference)countFieldEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link model.LengthField <em>Length Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Field</em>'.
	 * @see model.LengthField
	 * @generated
	 */
	public EClass getLengthField() {
		return lengthFieldEClass;
	}


	/**
	 * Returns the meta object for the reference '{@link model.LengthField#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see model.LengthField#getRef()
	 * @see #getLengthField()
	 * @generated
	 */
	public EReference getLengthField_Ref() {
		return (EReference)lengthFieldEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for class '{@link model.ProtocolModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see model.ProtocolModel
	 * @generated
	 */
	public EClass getProtocolModel() {
		return protocolModelEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link model.ProtocolModel#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocols</em>'.
	 * @see model.ProtocolModel#getProtocols()
	 * @see #getProtocolModel()
	 * @generated
	 */
	public EReference getProtocolModel_Protocols() {
		return (EReference)protocolModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link model.ProtocolModel#getFormatters <em>Formatters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formatters</em>'.
	 * @see model.ProtocolModel#getFormatters()
	 * @see #getProtocolModel()
	 * @generated
	 */
	public EReference getProtocolModel_Formatters() {
		return (EReference)protocolModelEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for class '{@link model.Formatter <em>Formatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formatter</em>'.
	 * @see model.Formatter
	 * @generated
	 */
	public EClass getFormatter() {
		return formatterEClass;
	}


	/**
	 * Returns the meta object for the attribute '{@link model.Formatter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see model.Formatter#getName()
	 * @see #getFormatter()
	 * @generated
	 */
	public EAttribute getFormatter_Name() {
		return (EAttribute)formatterEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for the attribute '{@link model.Formatter#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see model.Formatter#getPackage()
	 * @see #getFormatter()
	 * @generated
	 */
	public EAttribute getFormatter_Package() {
		return (EAttribute)formatterEClass.getEStructuralFeatures().get(1);
	}


	/**
	 * Returns the meta object for data type '{@link generator.FieldGenerator <em>Field Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Field Generator</em>'.
	 * @see generator.FieldGenerator
	 * @model instanceClass="generator.FieldGenerator" serializeable="false"
	 * @generated
	 */
	public EDataType getFieldGenerator() {
		return fieldGeneratorEDataType;
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ProtocolFactory getProtocolFactory() {
		return (ProtocolFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__FIELDS);
		createEAttribute(dataTypeEClass, DATA_TYPE__TYPE_NAME);
		createEAttribute(dataTypeEClass, DATA_TYPE__HAS_IDENTITY_FIELD);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__BYTE_LEN);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEAttribute(fieldEClass, FIELD__PACKAGE);
		createEAttribute(fieldEClass, FIELD__UNBOUNDED);
		createEAttribute(fieldEClass, FIELD__IDENTITY_FIELD);
		createEAttribute(fieldEClass, FIELD__TRANSIENT_FIELD);
		createEReference(fieldEClass, FIELD__FORMATTER);
		createEOperation(fieldEClass, FIELD___GET_DEFINITION_TEMPLATE);
		createEOperation(fieldEClass, FIELD___GET_INIT_TEMPLATE);
		createEOperation(fieldEClass, FIELD___GET_ACCESSOR_TEMPLATE);
		createEOperation(fieldEClass, FIELD___GET_EQUALS_TEMPLATE);
		createEOperation(fieldEClass, FIELD___GET_HASHCODE_TEMPLATE);
		createEOperation(fieldEClass, FIELD___GET_CLONE_TEMPLATE);
		createEOperation(fieldEClass, FIELD___GET_JAVA_TYPE);

		integerFieldEClass = createEClass(INTEGER_FIELD);

		binaryFieldEClass = createEClass(BINARY_FIELD);

		stringFieldEClass = createEClass(STRING_FIELD);

		bitFieldComponentEClass = createEClass(BIT_FIELD_COMPONENT);
		createEAttribute(bitFieldComponentEClass, BIT_FIELD_COMPONENT__NAME);
		createEAttribute(bitFieldComponentEClass, BIT_FIELD_COMPONENT__BIT_LENGTH);

		bitFieldEClass = createEClass(BIT_FIELD);
		createEReference(bitFieldEClass, BIT_FIELD__COMPONENTS);

		listFieldEClass = createEClass(LIST_FIELD);
		createEReference(listFieldEClass, LIST_FIELD__ELEMENT_TYPE);

		countFieldEClass = createEClass(COUNT_FIELD);
		createEReference(countFieldEClass, COUNT_FIELD__REF);

		lengthFieldEClass = createEClass(LENGTH_FIELD);
		createEReference(lengthFieldEClass, LENGTH_FIELD__REF);

		protocolModelEClass = createEClass(PROTOCOL_MODEL);
		createEReference(protocolModelEClass, PROTOCOL_MODEL__PROTOCOLS);
		createEReference(protocolModelEClass, PROTOCOL_MODEL__FORMATTERS);

		formatterEClass = createEClass(FORMATTER);
		createEAttribute(formatterEClass, FORMATTER__NAME);
		createEAttribute(formatterEClass, FORMATTER__PACKAGE);

		// Create data types
		fieldGeneratorEDataType = createEDataType(FIELD_GENERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataTypeEClass.getESuperTypes().add(this.getField());
		integerFieldEClass.getESuperTypes().add(this.getField());
		binaryFieldEClass.getESuperTypes().add(this.getField());
		stringFieldEClass.getESuperTypes().add(this.getField());
		bitFieldEClass.getESuperTypes().add(this.getField());
		listFieldEClass.getESuperTypes().add(this.getField());
		countFieldEClass.getESuperTypes().add(this.getField());
		lengthFieldEClass.getESuperTypes().add(this.getField());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_Fields(), this.getField(), null, "fields", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_HasIdentityField(), ecorePackage.getEBooleanObject(), "hasIdentityField", "false", 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_ByteLen(), ecorePackage.getELongObject(), "byteLen", "0", 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", "", 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Package(), ecorePackage.getEString(), "package", "", 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Unbounded(), ecorePackage.getEBooleanObject(), "unbounded", "false", 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_IdentityField(), ecorePackage.getEBooleanObject(), "identityField", "false", 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_TransientField(), ecorePackage.getEBooleanObject(), "transientField", "false", 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getField_Formatter(), this.getFormatter(), null, "formatter", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getField__GetDefinitionTemplate(), this.getFieldGenerator(), "getDefinitionTemplate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getField__GetInitTemplate(), this.getFieldGenerator(), "getInitTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getField__GetAccessorTemplate(), this.getFieldGenerator(), "getAccessorTemplate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getField__GetEqualsTemplate(), this.getFieldGenerator(), "getEqualsTemplate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getField__GetHashcodeTemplate(), this.getFieldGenerator(), "getHashcodeTemplate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getField__GetCloneTemplate(), this.getFieldGenerator(), "getCloneTemplate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getField__GetJavaType(), ecorePackage.getEString(), "getJavaType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(integerFieldEClass, IntegerField.class, "IntegerField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryFieldEClass, BinaryField.class, "BinaryField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringFieldEClass, StringField.class, "StringField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bitFieldComponentEClass, BitFieldComponent.class, "BitFieldComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitFieldComponent_Name(), ecorePackage.getEString(), "name", "", 0, 1, BitFieldComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitFieldComponent_BitLength(), ecorePackage.getELongObject(), "bitLength", "0", 0, 1, BitFieldComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitFieldEClass, BitField.class, "BitField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBitField_Components(), this.getBitFieldComponent(), null, "components", null, 0, -1, BitField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listFieldEClass, ListField.class, "ListField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListField_ElementType(), this.getField(), null, "elementType", null, 1, 1, ListField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countFieldEClass, CountField.class, "CountField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCountField_Ref(), this.getListField(), null, "ref", null, 1, 1, CountField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lengthFieldEClass, LengthField.class, "LengthField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLengthField_Ref(), this.getBinaryField(), null, "ref", null, 1, 1, LengthField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolModelEClass, ProtocolModel.class, "ProtocolModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolModel_Protocols(), this.getDataType(), null, "protocols", null, 0, -1, ProtocolModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolModel_Formatters(), this.getFormatter(), null, "formatters", null, 0, -1, ProtocolModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formatterEClass, Formatter.class, "Formatter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormatter_Name(), ecorePackage.getEString(), "name", "", 0, 1, Formatter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormatter_Package(), ecorePackage.getEString(), "package", "", 0, 1, Formatter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(fieldGeneratorEDataType, FieldGenerator.class, "FieldGenerator", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}


	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";	
		addAnnotation
		  (getBitFieldComponent_Name(), 
		   source, 
		   new String[] {
			 "body", "BitField",
			 "unique", "false",
			 "upper", "*"
		   });
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link model.DataType <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.DataType
		 * @see model.ProtocolPackage#getDataType()
		 * @generated
		 */
		public static final EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DATA_TYPE__FIELDS = eINSTANCE.getDataType_Fields();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DATA_TYPE__TYPE_NAME = eINSTANCE.getDataType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Has Identity Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute DATA_TYPE__HAS_IDENTITY_FIELD = eINSTANCE.getDataType_HasIdentityField();

		/**
		 * The meta object literal for the '{@link model.Field <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Field
		 * @see model.ProtocolPackage#getField()
		 * @generated
		 */
		public static final EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Byte Len</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FIELD__BYTE_LEN = eINSTANCE.getField_ByteLen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FIELD__PACKAGE = eINSTANCE.getField_Package();

		/**
		 * The meta object literal for the '<em><b>Unbounded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FIELD__UNBOUNDED = eINSTANCE.getField_Unbounded();

		/**
		 * The meta object literal for the '<em><b>Identity Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FIELD__IDENTITY_FIELD = eINSTANCE.getField_IdentityField();

		/**
		 * The meta object literal for the '<em><b>Transient Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FIELD__TRANSIENT_FIELD = eINSTANCE.getField_TransientField();

		/**
		 * The meta object literal for the '<em><b>Formatter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference FIELD__FORMATTER = eINSTANCE.getField_Formatter();

		/**
		 * The meta object literal for the '<em><b>Get Definition Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation FIELD___GET_DEFINITION_TEMPLATE = eINSTANCE.getField__GetDefinitionTemplate();

		/**
		 * The meta object literal for the '<em><b>Get Init Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation FIELD___GET_INIT_TEMPLATE = eINSTANCE.getField__GetInitTemplate();

		/**
		 * The meta object literal for the '<em><b>Get Accessor Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation FIELD___GET_ACCESSOR_TEMPLATE = eINSTANCE.getField__GetAccessorTemplate();

		/**
		 * The meta object literal for the '<em><b>Get Equals Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation FIELD___GET_EQUALS_TEMPLATE = eINSTANCE.getField__GetEqualsTemplate();

		/**
		 * The meta object literal for the '<em><b>Get Hashcode Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation FIELD___GET_HASHCODE_TEMPLATE = eINSTANCE.getField__GetHashcodeTemplate();

		/**
		 * The meta object literal for the '<em><b>Get Clone Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation FIELD___GET_CLONE_TEMPLATE = eINSTANCE.getField__GetCloneTemplate();

		/**
		 * The meta object literal for the '<em><b>Get Java Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EOperation FIELD___GET_JAVA_TYPE = eINSTANCE.getField__GetJavaType();

		/**
		 * The meta object literal for the '{@link model.IntegerField <em>Integer Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.IntegerField
		 * @see model.ProtocolPackage#getIntegerField()
		 * @generated
		 */
		public static final EClass INTEGER_FIELD = eINSTANCE.getIntegerField();

		/**
		 * The meta object literal for the '{@link model.BinaryField <em>Binary Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BinaryField
		 * @see model.ProtocolPackage#getBinaryField()
		 * @generated
		 */
		public static final EClass BINARY_FIELD = eINSTANCE.getBinaryField();

		/**
		 * The meta object literal for the '{@link model.StringField <em>String Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.StringField
		 * @see model.ProtocolPackage#getStringField()
		 * @generated
		 */
		public static final EClass STRING_FIELD = eINSTANCE.getStringField();

		/**
		 * The meta object literal for the '{@link model.BitFieldComponent <em>Bit Field Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BitFieldComponent
		 * @see model.ProtocolPackage#getBitFieldComponent()
		 * @generated
		 */
		public static final EClass BIT_FIELD_COMPONENT = eINSTANCE.getBitFieldComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BIT_FIELD_COMPONENT__NAME = eINSTANCE.getBitFieldComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Bit Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute BIT_FIELD_COMPONENT__BIT_LENGTH = eINSTANCE.getBitFieldComponent_BitLength();

		/**
		 * The meta object literal for the '{@link model.BitField <em>Bit Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.BitField
		 * @see model.ProtocolPackage#getBitField()
		 * @generated
		 */
		public static final EClass BIT_FIELD = eINSTANCE.getBitField();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference BIT_FIELD__COMPONENTS = eINSTANCE.getBitField_Components();

		/**
		 * The meta object literal for the '{@link model.ListField <em>List Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.ListField
		 * @see model.ProtocolPackage#getListField()
		 * @generated
		 */
		public static final EClass LIST_FIELD = eINSTANCE.getListField();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LIST_FIELD__ELEMENT_TYPE = eINSTANCE.getListField_ElementType();

		/**
		 * The meta object literal for the '{@link model.CountField <em>Count Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.CountField
		 * @see model.ProtocolPackage#getCountField()
		 * @generated
		 */
		public static final EClass COUNT_FIELD = eINSTANCE.getCountField();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference COUNT_FIELD__REF = eINSTANCE.getCountField_Ref();

		/**
		 * The meta object literal for the '{@link model.LengthField <em>Length Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.LengthField
		 * @see model.ProtocolPackage#getLengthField()
		 * @generated
		 */
		public static final EClass LENGTH_FIELD = eINSTANCE.getLengthField();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference LENGTH_FIELD__REF = eINSTANCE.getLengthField_Ref();

		/**
		 * The meta object literal for the '{@link model.ProtocolModel <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.ProtocolModel
		 * @see model.ProtocolPackage#getProtocolModel()
		 * @generated
		 */
		public static final EClass PROTOCOL_MODEL = eINSTANCE.getProtocolModel();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROTOCOL_MODEL__PROTOCOLS = eINSTANCE.getProtocolModel_Protocols();

		/**
		 * The meta object literal for the '<em><b>Formatters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PROTOCOL_MODEL__FORMATTERS = eINSTANCE.getProtocolModel_Formatters();

		/**
		 * The meta object literal for the '{@link model.Formatter <em>Formatter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see model.Formatter
		 * @see model.ProtocolPackage#getFormatter()
		 * @generated
		 */
		public static final EClass FORMATTER = eINSTANCE.getFormatter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FORMATTER__NAME = eINSTANCE.getFormatter_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute FORMATTER__PACKAGE = eINSTANCE.getFormatter_Package();

		/**
		 * The meta object literal for the '<em>Field Generator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see generator.FieldGenerator
		 * @see model.ProtocolPackage#getFieldGenerator()
		 * @generated
		 */
		public static final EDataType FIELD_GENERATOR = eINSTANCE.getFieldGenerator();

	}

} //ProtocolPackage
