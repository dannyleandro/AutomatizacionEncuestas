/**
 */
package SistemaEncuestas.impl;

import SistemaEncuestas.Inicio;
import SistemaEncuestas.Pregunta;
import SistemaEncuestas.SaltoInicio;
import SistemaEncuestas.SistemaEncuestasPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salto Inicio</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.impl.SaltoInicioImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.SaltoInicioImpl#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaltoInicioImpl extends NavegacionImpl implements SaltoInicio {
	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected Inicio origen;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Pregunta destino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaltoInicioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SistemaEncuestasPackage.Literals.SALTO_INICIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inicio getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject)origen;
			origen = (Inicio)eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SistemaEncuestasPackage.SALTO_INICIO__ORIGEN, oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inicio basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(Inicio newOrigen) {
		Inicio oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.SALTO_INICIO__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject)destino;
			destino = (Pregunta)eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SistemaEncuestasPackage.SALTO_INICIO__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Pregunta newDestino) {
		Pregunta oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.SALTO_INICIO__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SistemaEncuestasPackage.SALTO_INICIO__ORIGEN:
				if (resolve) return getOrigen();
				return basicGetOrigen();
			case SistemaEncuestasPackage.SALTO_INICIO__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
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
			case SistemaEncuestasPackage.SALTO_INICIO__ORIGEN:
				setOrigen((Inicio)newValue);
				return;
			case SistemaEncuestasPackage.SALTO_INICIO__DESTINO:
				setDestino((Pregunta)newValue);
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
			case SistemaEncuestasPackage.SALTO_INICIO__ORIGEN:
				setOrigen((Inicio)null);
				return;
			case SistemaEncuestasPackage.SALTO_INICIO__DESTINO:
				setDestino((Pregunta)null);
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
			case SistemaEncuestasPackage.SALTO_INICIO__ORIGEN:
				return origen != null;
			case SistemaEncuestasPackage.SALTO_INICIO__DESTINO:
				return destino != null;
		}
		return super.eIsSet(featureID);
	}

} //SaltoInicioImpl
