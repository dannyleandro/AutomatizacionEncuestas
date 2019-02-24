/**
 */
package SistemaEncuestas.impl;

import SistemaEncuestas.Fin;
import SistemaEncuestas.Inicio;
import SistemaEncuestas.Modulo;
import SistemaEncuestas.Pregunta;
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
 * An implementation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.impl.ModuloImpl#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.ModuloImpl#getPreguntas <em>Preguntas</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.ModuloImpl#getInicio <em>Inicio</em>}</li>
 *   <li>{@link SistemaEncuestas.impl.ModuloImpl#getFin <em>Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuloImpl extends NodoImpl implements Modulo {
	/**
	 * The default value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected static final String TITULO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitulo() <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitulo()
	 * @generated
	 * @ordered
	 */
	protected String titulo = TITULO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPreguntas() <em>Preguntas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreguntas()
	 * @generated
	 * @ordered
	 */
	protected EList<Pregunta> preguntas;

	/**
	 * The cached value of the '{@link #getInicio() <em>Inicio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInicio()
	 * @generated
	 * @ordered
	 */
	protected Inicio inicio;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected Fin fin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SistemaEncuestasPackage.Literals.MODULO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitulo(String newTitulo) {
		String oldTitulo = titulo;
		titulo = newTitulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.MODULO__TITULO, oldTitulo, titulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pregunta> getPreguntas() {
		if (preguntas == null) {
			preguntas = new EObjectContainmentEList<Pregunta>(Pregunta.class, this, SistemaEncuestasPackage.MODULO__PREGUNTAS);
		}
		return preguntas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inicio getInicio() {
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInicio(Inicio newInicio, NotificationChain msgs) {
		Inicio oldInicio = inicio;
		inicio = newInicio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.MODULO__INICIO, oldInicio, newInicio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInicio(Inicio newInicio) {
		if (newInicio != inicio) {
			NotificationChain msgs = null;
			if (inicio != null)
				msgs = ((InternalEObject)inicio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SistemaEncuestasPackage.MODULO__INICIO, null, msgs);
			if (newInicio != null)
				msgs = ((InternalEObject)newInicio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SistemaEncuestasPackage.MODULO__INICIO, null, msgs);
			msgs = basicSetInicio(newInicio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.MODULO__INICIO, newInicio, newInicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fin getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFin(Fin newFin, NotificationChain msgs) {
		Fin oldFin = fin;
		fin = newFin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.MODULO__FIN, oldFin, newFin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFin(Fin newFin) {
		if (newFin != fin) {
			NotificationChain msgs = null;
			if (fin != null)
				msgs = ((InternalEObject)fin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SistemaEncuestasPackage.MODULO__FIN, null, msgs);
			if (newFin != null)
				msgs = ((InternalEObject)newFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SistemaEncuestasPackage.MODULO__FIN, null, msgs);
			msgs = basicSetFin(newFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SistemaEncuestasPackage.MODULO__FIN, newFin, newFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SistemaEncuestasPackage.MODULO__PREGUNTAS:
				return ((InternalEList<?>)getPreguntas()).basicRemove(otherEnd, msgs);
			case SistemaEncuestasPackage.MODULO__INICIO:
				return basicSetInicio(null, msgs);
			case SistemaEncuestasPackage.MODULO__FIN:
				return basicSetFin(null, msgs);
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
			case SistemaEncuestasPackage.MODULO__TITULO:
				return getTitulo();
			case SistemaEncuestasPackage.MODULO__PREGUNTAS:
				return getPreguntas();
			case SistemaEncuestasPackage.MODULO__INICIO:
				return getInicio();
			case SistemaEncuestasPackage.MODULO__FIN:
				return getFin();
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
			case SistemaEncuestasPackage.MODULO__TITULO:
				setTitulo((String)newValue);
				return;
			case SistemaEncuestasPackage.MODULO__PREGUNTAS:
				getPreguntas().clear();
				getPreguntas().addAll((Collection<? extends Pregunta>)newValue);
				return;
			case SistemaEncuestasPackage.MODULO__INICIO:
				setInicio((Inicio)newValue);
				return;
			case SistemaEncuestasPackage.MODULO__FIN:
				setFin((Fin)newValue);
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
			case SistemaEncuestasPackage.MODULO__TITULO:
				setTitulo(TITULO_EDEFAULT);
				return;
			case SistemaEncuestasPackage.MODULO__PREGUNTAS:
				getPreguntas().clear();
				return;
			case SistemaEncuestasPackage.MODULO__INICIO:
				setInicio((Inicio)null);
				return;
			case SistemaEncuestasPackage.MODULO__FIN:
				setFin((Fin)null);
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
			case SistemaEncuestasPackage.MODULO__TITULO:
				return TITULO_EDEFAULT == null ? titulo != null : !TITULO_EDEFAULT.equals(titulo);
			case SistemaEncuestasPackage.MODULO__PREGUNTAS:
				return preguntas != null && !preguntas.isEmpty();
			case SistemaEncuestasPackage.MODULO__INICIO:
				return inicio != null;
			case SistemaEncuestasPackage.MODULO__FIN:
				return fin != null;
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
		result.append(" (titulo: ");
		result.append(titulo);
		result.append(')');
		return result.toString();
	}

} //ModuloImpl
