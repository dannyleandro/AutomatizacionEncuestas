/**
 */
package SistemaEncuestas.util;

import SistemaEncuestas.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SistemaEncuestas.SistemaEncuestasPackage
 * @generated
 */
public class SistemaEncuestasAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SistemaEncuestasPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaEncuestasAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SistemaEncuestasPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SistemaEncuestasSwitch<Adapter> modelSwitch =
		new SistemaEncuestasSwitch<Adapter>() {
			@Override
			public Adapter caseEncuesta(Encuesta object) {
				return createEncuestaAdapter();
			}
			@Override
			public Adapter caseElemento(Elemento object) {
				return createElementoAdapter();
			}
			@Override
			public Adapter caseModulo(Modulo object) {
				return createModuloAdapter();
			}
			@Override
			public Adapter caseFin(Fin object) {
				return createFinAdapter();
			}
			@Override
			public Adapter caseSaltoRespuesta(SaltoRespuesta object) {
				return createSaltoRespuestaAdapter();
			}
			@Override
			public Adapter casePregunta(Pregunta object) {
				return createPreguntaAdapter();
			}
			@Override
			public Adapter caseRespuesta(Respuesta object) {
				return createRespuestaAdapter();
			}
			@Override
			public Adapter caseNavegacion(Navegacion object) {
				return createNavegacionAdapter();
			}
			@Override
			public Adapter caseNodo(Nodo object) {
				return createNodoAdapter();
			}
			@Override
			public Adapter caseInicio(Inicio object) {
				return createInicioAdapter();
			}
			@Override
			public Adapter caseSaltoInicio(SaltoInicio object) {
				return createSaltoInicioAdapter();
			}
			@Override
			public Adapter caseSaltoPregunta(SaltoPregunta object) {
				return createSaltoPreguntaAdapter();
			}
			@Override
			public Adapter caseSaltoFinRespuesta(SaltoFinRespuesta object) {
				return createSaltoFinRespuestaAdapter();
			}
			@Override
			public Adapter caseSaltoFinPregunta(SaltoFinPregunta object) {
				return createSaltoFinPreguntaAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.Encuesta <em>Encuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.Encuesta
	 * @generated
	 */
	public Adapter createEncuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.Elemento
	 * @generated
	 */
	public Adapter createElementoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.Modulo
	 * @generated
	 */
	public Adapter createModuloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.Fin
	 * @generated
	 */
	public Adapter createFinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.SaltoRespuesta <em>Salto Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.SaltoRespuesta
	 * @generated
	 */
	public Adapter createSaltoRespuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.Pregunta <em>Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.Pregunta
	 * @generated
	 */
	public Adapter createPreguntaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.Respuesta <em>Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.Respuesta
	 * @generated
	 */
	public Adapter createRespuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.Navegacion <em>Navegacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.Navegacion
	 * @generated
	 */
	public Adapter createNavegacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.Nodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.Nodo
	 * @generated
	 */
	public Adapter createNodoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.Inicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.Inicio
	 * @generated
	 */
	public Adapter createInicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.SaltoInicio <em>Salto Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.SaltoInicio
	 * @generated
	 */
	public Adapter createSaltoInicioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.SaltoPregunta <em>Salto Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.SaltoPregunta
	 * @generated
	 */
	public Adapter createSaltoPreguntaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.SaltoFinRespuesta <em>Salto Fin Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.SaltoFinRespuesta
	 * @generated
	 */
	public Adapter createSaltoFinRespuestaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SistemaEncuestas.SaltoFinPregunta <em>Salto Fin Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SistemaEncuestas.SaltoFinPregunta
	 * @generated
	 */
	public Adapter createSaltoFinPreguntaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SistemaEncuestasAdapterFactory
