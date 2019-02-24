/**
 */
package SistemaEncuestas.impl;

import SistemaEncuestas.Fin;
import SistemaEncuestas.Pregunta;
import SistemaEncuestas.SaltoFinPregunta;
import SistemaEncuestas.SistemaEncuestasPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salto Fin Pregunta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.impl.SaltoFinPreguntaImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.SaltoFinPreguntaImpl#getOrigen <em>Origen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaltoFinPreguntaImpl extends NavegacionImpl implements SaltoFinPregunta {
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
	protected Pregunta origen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaltoFinPreguntaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SistemaEncuestasPackage.Literals.SALTO_FIN_PREGUNTA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__DESTINO, oldDestino, destino));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject)origen;
			origen = (Pregunta)eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__ORIGEN, oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(Pregunta newOrigen) {
		Pregunta oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
			case SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__ORIGEN:
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
			case SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__DESTINO:
				setDestino((Fin)newValue);
				return;
			case SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__ORIGEN:
				setOrigen((Pregunta)newValue);
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
			case SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__DESTINO:
				setDestino((Fin)null);
				return;
			case SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__ORIGEN:
				setOrigen((Pregunta)null);
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
			case SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__DESTINO:
				return destino != null;
			case SistemaEncuestasPackage.SALTO_FIN_PREGUNTA__ORIGEN:
				return origen != null;
		}
		return super.eIsSet(featureID);
	}

} //SaltoFinPreguntaImpl
