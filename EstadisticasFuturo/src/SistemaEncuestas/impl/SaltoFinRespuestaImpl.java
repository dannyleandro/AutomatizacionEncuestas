/**
 */
package SistemaEncuestas.impl;

import SistemaEncuestas.Fin;
import SistemaEncuestas.Respuesta;
import SistemaEncuestas.SaltoFinRespuesta;
import SistemaEncuestas.SistemaEncuestasPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salto Fin Respuesta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.impl.SaltoFinRespuestaImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.SaltoFinRespuestaImpl#getOrigen <em>Origen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaltoFinRespuestaImpl extends NavegacionImpl implements SaltoFinRespuesta {
	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Fin destino;

	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected Respuesta origen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaltoFinRespuestaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SistemaEncuestasPackage.Literals.SALTO_FIN_RESPUESTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fin getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject)destino;
			destino = (Fin)eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fin basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Fin newDestino) {
		Fin oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Respuesta getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject)origen;
			origen = (Respuesta)eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__ORIGEN, oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Respuesta basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(Respuesta newOrigen) {
		Respuesta oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
			case SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__ORIGEN:
				if (resolve) return getOrigen();
				return basicGetOrigen();
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
			case SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__DESTINO:
				setDestino((Fin)newValue);
				return;
			case SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__ORIGEN:
				setOrigen((Respuesta)newValue);
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
			case SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__DESTINO:
				setDestino((Fin)null);
				return;
			case SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__ORIGEN:
				setOrigen((Respuesta)null);
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
			case SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__DESTINO:
				return destino != null;
			case SistemaEncuestasPackage.SALTO_FIN_RESPUESTA__ORIGEN:
				return origen != null;
		}
		return super.eIsSet(featureID);
	}

} //SaltoFinRespuestaImpl
