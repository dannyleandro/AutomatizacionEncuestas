/**
 */
package SistemaEncuestas.util;

import SistemaEncuestas.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see SistemaEncuestas.SistemaEncuestasPackage
 * @generated
 */
public class SistemaEncuestasSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SistemaEncuestasPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaEncuestasSwitch() {
		if (modelPackage == null) {
			modelPackage = SistemaEncuestasPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SistemaEncuestasPackage.ENCUESTA: {
				Encuesta encuesta = (Encuesta)theEObject;
				T result = caseEncuesta(encuesta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.ELEMENTO: {
				Elemento elemento = (Elemento)theEObject;
				T result = caseElemento(elemento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.MODULO: {
				Modulo modulo = (Modulo)theEObject;
				T result = caseModulo(modulo);
				if (result == null) result = caseNodo(modulo);
				if (result == null) result = caseElemento(modulo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.FIN: {
				Fin fin = (Fin)theEObject;
				T result = caseFin(fin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.SALTO_RESPUESTA: {
				SaltoRespuesta saltoRespuesta = (SaltoRespuesta)theEObject;
				T result = caseSaltoRespuesta(saltoRespuesta);
				if (result == null) result = caseNavegacion(saltoRespuesta);
				if (result == null) result = caseElemento(saltoRespuesta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.PREGUNTA: {
				Pregunta pregunta = (Pregunta)theEObject;
				T result = casePregunta(pregunta);
				if (result == null) result = caseNodo(pregunta);
				if (result == null) result = caseElemento(pregunta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.RESPUESTA: {
				Respuesta respuesta = (Respuesta)theEObject;
				T result = caseRespuesta(respuesta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.NAVEGACION: {
				Navegacion navegacion = (Navegacion)theEObject;
				T result = caseNavegacion(navegacion);
				if (result == null) result = caseElemento(navegacion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.NODO: {
				Nodo nodo = (Nodo)theEObject;
				T result = caseNodo(nodo);
				if (result == null) result = caseElemento(nodo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.INICIO: {
				Inicio inicio = (Inicio)theEObject;
				T result = caseInicio(inicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.SALTO_INICIO: {
				SaltoInicio saltoInicio = (SaltoInicio)theEObject;
				T result = caseSaltoInicio(saltoInicio);
				if (result == null) result = caseNavegacion(saltoInicio);
				if (result == null) result = caseElemento(saltoInicio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.SALTO_PREGUNTA: {
				SaltoPregunta saltoPregunta = (SaltoPregunta)theEObject;
				T result = caseSaltoPregunta(saltoPregunta);
				if (result == null) result = caseNavegacion(saltoPregunta);
				if (result == null) result = caseElemento(saltoPregunta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.SALTO_FIN_RESPUESTA: {
				SaltoFinRespuesta saltoFinRespuesta = (SaltoFinRespuesta)theEObject;
				T result = caseSaltoFinRespuesta(saltoFinRespuesta);
				if (result == null) result = caseNavegacion(saltoFinRespuesta);
				if (result == null) result = caseElemento(saltoFinRespuesta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SistemaEncuestasPackage.SALTO_FIN_PREGUNTA: {
				SaltoFinPregunta saltoFinPregunta = (SaltoFinPregunta)theEObject;
				T result = caseSaltoFinPregunta(saltoFinPregunta);
				if (result == null) result = caseNavegacion(saltoFinPregunta);
				if (result == null) result = caseElemento(saltoFinPregunta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncuesta(Encuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElemento(Elemento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modulo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModulo(Modulo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFin(Fin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salto Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salto Respuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaltoRespuesta(SaltoRespuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pregunta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePregunta(Pregunta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Respuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespuesta(Respuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navegacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navegacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavegacion(Navegacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nodo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nodo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodo(Nodo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInicio(Inicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salto Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salto Inicio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaltoInicio(SaltoInicio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salto Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salto Pregunta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaltoPregunta(SaltoPregunta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salto Fin Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salto Fin Respuesta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaltoFinRespuesta(SaltoFinRespuesta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salto Fin Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salto Fin Pregunta</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaltoFinPregunta(SaltoFinPregunta object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SistemaEncuestasSwitch
