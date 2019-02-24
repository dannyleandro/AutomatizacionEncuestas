/**
 */
package SistemaEncuestas.impl;

import SistemaEncuestas.ETipoPregunta;
import SistemaEncuestas.Pregunta;
import SistemaEncuestas.Respuesta;
import SistemaEncuestas.SistemaEncuestasPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pregunta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.impl.PreguntaImpl#getTipoPregunta <em>Tipo Pregunta</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.PreguntaImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.PreguntaImpl#getRespuestas <em>Respuestas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreguntaImpl extends NodoImpl implements Pregunta {
	/**
	 * The default value of the '{@link #getTipoPregunta() <em>Tipo Pregunta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoPregunta()
	 * @generated
	 * @ordered
	 */
	protected static final ETipoPregunta TIPO_PREGUNTA_EDEFAULT = ETipoPregunta.A;

	/**
	 * The cached value of the '{@link #getTipoPregunta() <em>Tipo Pregunta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipoPregunta()
	 * @generated
	 * @ordered
	 */
	protected ETipoPregunta tipoPregunta = TIPO_PREGUNTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripcion()
	 * @generated
	 * @ordered
	 */
	protected String descripcion = DESCRIPCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRespuestas() <em>Respuestas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespuestas()
	 * @generated
	 * @ordered
	 */
	protected EList<Respuesta> respuestas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreguntaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SistemaEncuestasPackage.Literals.PREGUNTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETipoPregunta getTipoPregunta() {
		return tipoPregunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipoPregunta(ETipoPregunta newTipoPregunta) {
		ETipoPregunta oldTipoPregunta = tipoPregunta;
		tipoPregunta = newTipoPregunta == null ? TIPO_PREGUNTA_EDEFAULT : newTipoPregunta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.PREGUNTA__TIPO_PREGUNTA, oldTipoPregunta, tipoPregunta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescripcion(String newDescripcion) {
		String oldDescripcion = descripcion;
		descripcion = newDescripcion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.PREGUNTA__DESCRIPCION, oldDescripcion, descripcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Respuesta> getRespuestas() {
		if (respuestas == null) {
			respuestas = new EObjectContainmentEList<Respuesta>(Respuesta.class, this, SistemaEncuestasPackage.PREGUNTA__RESPUESTAS);
		}
		return respuestas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SistemaEncuestasPackage.PREGUNTA__RESPUESTAS:
				return ((InternalEList<?>)getRespuestas()).basicRemove(otherEnd, msgs);
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
			case SistemaEncuestasPackage.PREGUNTA__TIPO_PREGUNTA:
				return getTipoPregunta();
			case SistemaEncuestasPackage.PREGUNTA__DESCRIPCION:
				return getDescripcion();
			case SistemaEncuestasPackage.PREGUNTA__RESPUESTAS:
				return getRespuestas();
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
			case SistemaEncuestasPackage.PREGUNTA__TIPO_PREGUNTA:
				setTipoPregunta((ETipoPregunta)newValue);
				return;
			case SistemaEncuestasPackage.PREGUNTA__DESCRIPCION:
				setDescripcion((String)newValue);
				return;
			case SistemaEncuestasPackage.PREGUNTA__RESPUESTAS:
				getRespuestas().clear();
				getRespuestas().addAll((Collection<? extends Respuesta>)newValue);
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
			case SistemaEncuestasPackage.PREGUNTA__TIPO_PREGUNTA:
				setTipoPregunta(TIPO_PREGUNTA_EDEFAULT);
				return;
			case SistemaEncuestasPackage.PREGUNTA__DESCRIPCION:
				setDescripcion(DESCRIPCION_EDEFAULT);
				return;
			case SistemaEncuestasPackage.PREGUNTA__RESPUESTAS:
				getRespuestas().clear();
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
			case SistemaEncuestasPackage.PREGUNTA__TIPO_PREGUNTA:
				return tipoPregunta != TIPO_PREGUNTA_EDEFAULT;
			case SistemaEncuestasPackage.PREGUNTA__DESCRIPCION:
				return DESCRIPCION_EDEFAULT == null ? descripcion != null : !DESCRIPCION_EDEFAULT.equals(descripcion);
			case SistemaEncuestasPackage.PREGUNTA__RESPUESTAS:
				return respuestas != null && !respuestas.isEmpty();
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
		result.append(" (tipoPregunta: ");
		result.append(tipoPregunta);
		result.append(", descripcion: ");
		result.append(descripcion);
		result.append(')');
		return result.toString();
	}

} //PreguntaImpl
