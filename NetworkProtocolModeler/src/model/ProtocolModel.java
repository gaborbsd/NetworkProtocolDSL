/**
 */
package model;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link model.ProtocolModel#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link model.ProtocolModel#getFormatters <em>Formatters</em>}</li>
 * </ul>
 * </p>
 *
 * @see model.ProtocolPackage#getProtocolModel()
 * @model kind="class"
 * @generated
 */
public class ProtocolModel extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> protocols;

	/**
	 * The cached value of the '{@link #getFormatters() <em>Formatters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatters()
	 * @generated
	 * @ordered
	 */
	protected EList<Formatter> formatters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolModel() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProtocolPackage.Literals.PROTOCOL_MODEL;
	}

	/**
	 * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
	 * The list contents are of type {@link model.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocols</em>' containment reference list.
	 * @see model.ProtocolPackage#getProtocolModel_Protocols()
	 * @model containment="true"
	 * @generated
	 */
	public EList<DataType> getProtocols() {
		if (protocols == null) {
			protocols = new BasicInternalEList<DataType>(DataType.class);
		}
		return protocols;
	}

	/**
	 * Returns the value of the '<em><b>Formatters</b></em>' containment reference list.
	 * The list contents are of type {@link model.Formatter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formatters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formatters</em>' containment reference list.
	 * @see model.ProtocolPackage#getProtocolModel_Formatters()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Formatter> getFormatters() {
		if (formatters == null) {
			formatters = new BasicInternalEList<Formatter>(Formatter.class);
		}
		return formatters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProtocolPackage.PROTOCOL_MODEL__PROTOCOLS:
				return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
			case ProtocolPackage.PROTOCOL_MODEL__FORMATTERS:
				return ((InternalEList<?>)getFormatters()).basicRemove(otherEnd, msgs);
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
			case ProtocolPackage.PROTOCOL_MODEL__PROTOCOLS:
				return getProtocols();
			case ProtocolPackage.PROTOCOL_MODEL__FORMATTERS:
				return getFormatters();
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
			case ProtocolPackage.PROTOCOL_MODEL__PROTOCOLS:
				getProtocols().clear();
				getProtocols().addAll((Collection<? extends DataType>)newValue);
				return;
			case ProtocolPackage.PROTOCOL_MODEL__FORMATTERS:
				getFormatters().clear();
				getFormatters().addAll((Collection<? extends Formatter>)newValue);
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
			case ProtocolPackage.PROTOCOL_MODEL__PROTOCOLS:
				getProtocols().clear();
				return;
			case ProtocolPackage.PROTOCOL_MODEL__FORMATTERS:
				getFormatters().clear();
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
			case ProtocolPackage.PROTOCOL_MODEL__PROTOCOLS:
				return protocols != null && !protocols.isEmpty();
			case ProtocolPackage.PROTOCOL_MODEL__FORMATTERS:
				return formatters != null && !formatters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ProtocolModel
