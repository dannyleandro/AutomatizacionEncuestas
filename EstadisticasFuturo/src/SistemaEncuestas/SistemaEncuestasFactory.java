/**
 */
package SistemaEncuestas;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SistemaEncuestas.SistemaEncuestasPackage
 * @generated
 */
public interface SistemaEncuestasFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SistemaEncuestasFactory eINSTANCE = SistemaEncuestas.impl.SistemaEncuestasFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Encuesta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encuesta</em>'.
	 * @generated
	 */
	Encuesta createEncuesta();

	/**
	 * Returns a new object of class '<em>Modulo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modulo</em>'.
	 * @generated
	 */
	Modulo createModulo();

	/**
	 * Returns a new object of class '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin</em>'.
	 * @generated
	 */
	Fin createFin();

	/**
	 * Returns a new object of class '<em>Salto Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salto Respuesta</em>'.
	 * @generated
	 */
	SaltoRespuesta createSaltoRespuesta();

	/**
	 * Returns a new object of class '<em>Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pregunta</em>'.
	 * @generated
	 */
	Pregunta createPregunta();

	/**
	 * Returns a new object of class '<em>Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Respuesta</em>'.
	 * @generated
	 */
	Respuesta createRespuesta();

	/**
	 * Returns a new object of class '<em>Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inicio</em>'.
	 * @generated
	 */
	Inicio createInicio();

	/**
	 * Returns a new object of class '<em>Salto Inicio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salto Inicio</em>'.
	 * @generated
	 */
	SaltoInicio createSaltoInicio();

	/**
	 * Returns a new object of class '<em>Salto Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salto Pregunta</em>'.
	 * @generated
	 */
	SaltoPregunta createSaltoPregunta();

	/**
	 * Returns a new object of class '<em>Salto Fin Respuesta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salto Fin Respuesta</em>'.
	 * @generated
	 */
	SaltoFinRespuesta createSaltoFinRespuesta();

	/**
	 * Returns a new object of class '<em>Salto Fin Pregunta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Salto Fin Pregunta</em>'.
	 * @generated
	 */
	SaltoFinPregunta createSaltoFinPregunta();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SistemaEncuestasPackage getSistemaEncuestasPackage();

} //SistemaEncuestasFactory
