/**
 */
package SistemaEncuestas.impl;

import SistemaEncuestas.Respuesta;
import SistemaEncuestas.SistemaEncuestasPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Respuesta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.impl.RespuestaImpl#getValor <em>Valor</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.RespuestaImpl#getIdRespuesta <em>Id Respuesta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RespuestaImpl extends MinimalEObjectImpl.Container implements Respuesta {
	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected String valor = VALOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdRespuesta() <em>Id Respuesta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRespuesta()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_RESPUESTA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdRespuesta() <em>Id Respuesta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdRespuesta()
	 * @generated
	 * @ordered
	 */
	protected int idRespuesta = ID_RESPUESTA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RespuestaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SistemaEncuestasPackage.Literals.RESPUESTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(String newValor) {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.RESPUESTA__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdRespuesta() {
		return idRespuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdRespuesta(int newIdRespuesta) {
		int oldIdRespuesta = idRespuesta;
		idRespuesta = newIdRespuesta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.RESPUESTA__ID_RESPUESTA, oldIdRespuesta, idRespuesta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SistemaEncuestasPackage.RESPUESTA__VALOR:
				return getValor();
			case SistemaEncuestasPackage.RESPUESTA__ID_RESPUESTA:
				return getIdRespuesta();
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
			case SistemaEncuestasPackage.RESPUESTA__VALOR:
				setValor((String)newValue);
				return;
			case SistemaEncuestasPackage.RESPUESTA__ID_RESPUESTA:
				setIdRespuesta((Integer)newValue);
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
			case SistemaEncuestasPackage.RESPUESTA__VALOR:
				setValor(VALOR_EDEFAULT);
				return;
			case SistemaEncuestasPackage.RESPUESTA__ID_RESPUESTA:
				setIdRespuesta(ID_RESPUESTA_EDEFAULT);
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
			case SistemaEncuestasPackage.RESPUESTA__VALOR:
				return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
			case SistemaEncuestasPackage.RESPUESTA__ID_RESPUESTA:
				return idRespuesta != ID_RESPUESTA_EDEFAULT;
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
		result.append(" (valor: ");
		result.append(valor);
		result.append(", idRespuesta: ");
		result.append(idRespuesta);
		result.append(')');
		return result.toString();
	}

} //RespuestaImpl
