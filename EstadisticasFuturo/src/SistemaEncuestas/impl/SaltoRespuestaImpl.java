/**
 */
package SistemaEncuestas.impl;

import SistemaEncuestas.Nodo;
import SistemaEncuestas.Respuesta;
import SistemaEncuestas.SaltoRespuesta;
import SistemaEncuestas.SistemaEncuestasPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salto Respuesta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.impl.SaltoRespuestaImpl#isDefecto <em>Defecto</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.SaltoRespuestaImpl#getDestino <em>Destino</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.SaltoRespuestaImpl#getOrigen <em>Origen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SaltoRespuestaImpl extends NavegacionImpl implements SaltoRespuesta {
	/**
	 * The default value of the '{@link #isDefecto() <em>Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefecto()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFECTO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefecto() <em>Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefecto()
	 * @generated
	 * @ordered
	 */
	protected boolean defecto = DEFECTO_EDEFAULT;

	/**
	 * This is true if the Defecto attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defectoESet;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Nodo destino;

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
	protected SaltoRespuestaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SistemaEncuestasPackage.Literals.SALTO_RESPUESTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefecto() {
		return defecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefecto(boolean newDefecto) {
		boolean oldDefecto = defecto;
		defecto = newDefecto;
		boolean oldDefectoESet = defectoESet;
		defectoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.SALTO_RESPUESTA__DEFECTO, oldDefecto, defecto, !oldDefectoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefecto() {
		boolean oldDefecto = defecto;
		boolean oldDefectoESet = defectoESet;
		defecto = DEFECTO_EDEFAULT;
		defectoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SistemaEncuestasPackage.SALTO_RESPUESTA__DEFECTO, oldDefecto, DEFECTO_EDEFAULT, oldDefectoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefecto() {
		return defectoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject)destino;
			destino = (Nodo)eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SistemaEncuestasPackage.SALTO_RESPUESTA__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nodo basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Nodo newDestino) {
		Nodo oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.SALTO_RESPUESTA__DESTINO, oldDestino, destino));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SistemaEncuestasPackage.SALTO_RESPUESTA__ORIGEN, oldOrigen, origen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.SALTO_RESPUESTA__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SistemaEncuestasPackage.SALTO_RESPUESTA__DEFECTO:
				return isDefecto();
			case SistemaEncuestasPackage.SALTO_RESPUESTA__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
			case SistemaEncuestasPackage.SALTO_RESPUESTA__ORIGEN:
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
			case SistemaEncuestasPackage.SALTO_RESPUESTA__DEFECTO:
				setDefecto((Boolean)newValue);
				return;
			case SistemaEncuestasPackage.SALTO_RESPUESTA__DESTINO:
				setDestino((Nodo)newValue);
				return;
			case SistemaEncuestasPackage.SALTO_RESPUESTA__ORIGEN:
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
			case SistemaEncuestasPackage.SALTO_RESPUESTA__DEFECTO:
				unsetDefecto();
				return;
			case SistemaEncuestasPackage.SALTO_RESPUESTA__DESTINO:
				setDestino((Nodo)null);
				return;
			case SistemaEncuestasPackage.SALTO_RESPUESTA__ORIGEN:
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
			case SistemaEncuestasPackage.SALTO_RESPUESTA__DEFECTO:
				return isSetDefecto();
			case SistemaEncuestasPackage.SALTO_RESPUESTA__DESTINO:
				return destino != null;
			case SistemaEncuestasPackage.SALTO_RESPUESTA__ORIGEN:
				return origen != null;
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
		result.append(" (defecto: ");
		if (defectoESet) result.append(defecto); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SaltoRespuestaImpl
