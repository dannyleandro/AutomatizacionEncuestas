/**
 */
package SistemaEncuestas.impl;

import SistemaEncuestas.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SistemaEncuestasFactoryImpl extends EFactoryImpl implements SistemaEncuestasFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SistemaEncuestasFactory init() {
		try {
			SistemaEncuestasFactory theSistemaEncuestasFactory = (SistemaEncuestasFactory)EPackage.Registry.INSTANCE.getEFactory(SistemaEncuestasPackage.eNS_URI);
			if (theSistemaEncuestasFactory != null) {
				return theSistemaEncuestasFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SistemaEncuestasFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaEncuestasFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SistemaEncuestasPackage.ENCUESTA: return createEncuesta();
			case SistemaEncuestasPackage.MODULO: return createModulo();
			case SistemaEncuestasPackage.FIN: return createFin();
			case SistemaEncuestasPackage.SALTO_RESPUESTA: return createSaltoRespuesta();
			case SistemaEncuestasPackage.PREGUNTA: return createPregunta();
			case SistemaEncuestasPackage.RESPUESTA: return createRespuesta();
			case SistemaEncuestasPackage.INICIO: return createInicio();
			case SistemaEncuestasPackage.SALTO_INICIO: return createSaltoInicio();
			case SistemaEncuestasPackage.SALTO_PREGUNTA: return createSaltoPregunta();
			case SistemaEncuestasPackage.SALTO_FIN_RESPUESTA: return createSaltoFinRespuesta();
			case SistemaEncuestasPackage.SALTO_FIN_PREGUNTA: return createSaltoFinPregunta();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SistemaEncuestasPackage.ETIPO_PREGUNTA:
				return createETipoPreguntaFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SistemaEncuestasPackage.ETIPO_PREGUNTA:
				return convertETipoPreguntaToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encuesta createEncuesta() {
		EncuestaImpl encuesta = new EncuestaImpl();
		return encuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modulo createModulo() {
		ModuloImpl modulo = new ModuloImpl();
		return modulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fin createFin() {
		FinImpl fin = new FinImpl();
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaltoRespuesta createSaltoRespuesta() {
		SaltoRespuestaImpl saltoRespuesta = new SaltoRespuestaImpl();
		return saltoRespuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pregunta createPregunta() {
		PreguntaImpl pregunta = new PreguntaImpl();
		return pregunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Respuesta createRespuesta() {
		RespuestaImpl respuesta = new RespuestaImpl();
		return respuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inicio createInicio() {
		InicioImpl inicio = new InicioImpl();
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaltoInicio createSaltoInicio() {
		SaltoInicioImpl saltoInicio = new SaltoInicioImpl();
		return saltoInicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaltoPregunta createSaltoPregunta() {
		SaltoPreguntaImpl saltoPregunta = new SaltoPreguntaImpl();
		return saltoPregunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaltoFinRespuesta createSaltoFinRespuesta() {
		SaltoFinRespuestaImpl saltoFinRespuesta = new SaltoFinRespuestaImpl();
		return saltoFinRespuesta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaltoFinPregunta createSaltoFinPregunta() {
		SaltoFinPreguntaImpl saltoFinPregunta = new SaltoFinPreguntaImpl();
		return saltoFinPregunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETipoPregunta createETipoPreguntaFromString(EDataType eDataType, String initialValue) {
		ETipoPregunta result = ETipoPregunta.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETipoPreguntaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaEncuestasPackage getSistemaEncuestasPackage() {
		return (SistemaEncuestasPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SistemaEncuestasPackage getPackage() {
		return SistemaEncuestasPackage.eINSTANCE;
	}

} //SistemaEncuestasFactoryImpl
