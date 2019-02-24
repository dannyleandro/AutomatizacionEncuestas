/**
 */
package SistemaEncuestas;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SistemaEncuestas.SistemaEncuestasFactory
 * @model kind="package"
 * @generated
 */
public interface SistemaEncuestasPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SistemaEncuestas";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "EPF.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EPF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SistemaEncuestasPackage eINSTANCE = SistemaEncuestas.impl.SistemaEncuestasPackageImpl.init();

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.EncuestaImpl <em>Encuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.EncuestaImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getEncuesta()
	 * @generated
	 */
	int ENCUESTA = 0;

	/**
	 * The feature id for the '<em><b>Elemento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA__ELEMENTO = 0;

	/**
	 * The number of structural features of the '<em>Encuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Encuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCUESTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.ElementoImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getElemento()
	 * @generated
	 */
	int ELEMENTO = 1;

	/**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.NodoImpl <em>Nodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.NodoImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getNodo()
	 * @generated
	 */
	int NODO = 8;

	/**
	 * The number of structural features of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.ModuloImpl <em>Modulo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.ModuloImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getModulo()
	 * @generated
	 */
	int MODULO = 2;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__TITULO = NODO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Preguntas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__PREGUNTAS = NODO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inicio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__INICIO = NODO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO__FIN = NODO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_FEATURE_COUNT = NODO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Modulo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULO_OPERATION_COUNT = NODO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.FinImpl <em>Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.FinImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getFin()
	 * @generated
	 */
	int FIN = 3;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__TITULO = 0;

	/**
	 * The number of structural features of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.NavegacionImpl <em>Navegacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.NavegacionImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getNavegacion()
	 * @generated
	 */
	int NAVEGACION = 7;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGACION__TITULO = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navegacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGACION_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Navegacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVEGACION_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.SaltoRespuestaImpl <em>Salto Respuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.SaltoRespuestaImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getSaltoRespuesta()
	 * @generated
	 */
	int SALTO_RESPUESTA = 4;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_RESPUESTA__TITULO = NAVEGACION__TITULO;

	/**
	 * The feature id for the '<em><b>Defecto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_RESPUESTA__DEFECTO = NAVEGACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_RESPUESTA__DESTINO = NAVEGACION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_RESPUESTA__ORIGEN = NAVEGACION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Salto Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_RESPUESTA_FEATURE_COUNT = NAVEGACION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Salto Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_RESPUESTA_OPERATION_COUNT = NAVEGACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.PreguntaImpl <em>Pregunta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.PreguntaImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getPregunta()
	 * @generated
	 */
	int PREGUNTA = 5;

	/**
	 * The feature id for the '<em><b>Tipo Pregunta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__TIPO_PREGUNTA = NODO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__DESCRIPCION = NODO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Respuestas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA__RESPUESTAS = NODO_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_FEATURE_COUNT = NODO_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREGUNTA_OPERATION_COUNT = NODO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.RespuestaImpl <em>Respuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.RespuestaImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getRespuesta()
	 * @generated
	 */
	int RESPUESTA = 6;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA__VALOR = 0;

	/**
	 * The number of structural features of the '<em>Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPUESTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.InicioImpl <em>Inicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.InicioImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getInicio()
	 * @generated
	 */
	int INICIO = 9;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO__TITULO = 0;

	/**
	 * The number of structural features of the '<em>Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INICIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.SaltoInicioImpl <em>Salto Inicio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.SaltoInicioImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getSaltoInicio()
	 * @generated
	 */
	int SALTO_INICIO = 10;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_INICIO__TITULO = NAVEGACION__TITULO;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_INICIO__ORIGEN = NAVEGACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_INICIO__DESTINO = NAVEGACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Salto Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_INICIO_FEATURE_COUNT = NAVEGACION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Salto Inicio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_INICIO_OPERATION_COUNT = NAVEGACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.SaltoPreguntaImpl <em>Salto Pregunta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.SaltoPreguntaImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getSaltoPregunta()
	 * @generated
	 */
	int SALTO_PREGUNTA = 11;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_PREGUNTA__TITULO = NAVEGACION__TITULO;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_PREGUNTA__ORIGEN = NAVEGACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_PREGUNTA__DESTINO = NAVEGACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Salto Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_PREGUNTA_FEATURE_COUNT = NAVEGACION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Salto Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_PREGUNTA_OPERATION_COUNT = NAVEGACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.SaltoFinRespuestaImpl <em>Salto Fin Respuesta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.SaltoFinRespuestaImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getSaltoFinRespuesta()
	 * @generated
	 */
	int SALTO_FIN_RESPUESTA = 12;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FIN_RESPUESTA__TITULO = NAVEGACION__TITULO;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FIN_RESPUESTA__DESTINO = NAVEGACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FIN_RESPUESTA__ORIGEN = NAVEGACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Salto Fin Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FIN_RESPUESTA_FEATURE_COUNT = NAVEGACION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Salto Fin Respuesta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FIN_RESPUESTA_OPERATION_COUNT = NAVEGACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.impl.SaltoFinPreguntaImpl <em>Salto Fin Pregunta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.impl.SaltoFinPreguntaImpl
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getSaltoFinPregunta()
	 * @generated
	 */
	int SALTO_FIN_PREGUNTA = 13;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FIN_PREGUNTA__TITULO = NAVEGACION__TITULO;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FIN_PREGUNTA__DESTINO = NAVEGACION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FIN_PREGUNTA__ORIGEN = NAVEGACION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Salto Fin Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FIN_PREGUNTA_FEATURE_COUNT = NAVEGACION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Salto Fin Pregunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FIN_PREGUNTA_OPERATION_COUNT = NAVEGACION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SistemaEncuestas.ETipoPregunta <em>ETipo Pregunta</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SistemaEncuestas.ETipoPregunta
	 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getETipoPregunta()
	 * @generated
	 */
	int ETIPO_PREGUNTA = 14;


	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.Encuesta <em>Encuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encuesta</em>'.
	 * @see SistemaEncuestas.Encuesta
	 * @generated
	 */
	EClass getEncuesta();

	/**
	 * Returns the meta object for the containment reference list '{@link SistemaEncuestas.Encuesta#getElemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elemento</em>'.
	 * @see SistemaEncuestas.Encuesta#getElemento()
	 * @see #getEncuesta()
	 * @generated
	 */
	EReference getEncuesta_Elemento();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see SistemaEncuestas.Elemento
	 * @generated
	 */
	EClass getElemento();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.Modulo <em>Modulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modulo</em>'.
	 * @see SistemaEncuestas.Modulo
	 * @generated
	 */
	EClass getModulo();

	/**
	 * Returns the meta object for the attribute '{@link SistemaEncuestas.Modulo#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see SistemaEncuestas.Modulo#getTitulo()
	 * @see #getModulo()
	 * @generated
	 */
	EAttribute getModulo_Titulo();

	/**
	 * Returns the meta object for the containment reference list '{@link SistemaEncuestas.Modulo#getPreguntas <em>Preguntas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preguntas</em>'.
	 * @see SistemaEncuestas.Modulo#getPreguntas()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Preguntas();

	/**
	 * Returns the meta object for the containment reference '{@link SistemaEncuestas.Modulo#getInicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inicio</em>'.
	 * @see SistemaEncuestas.Modulo#getInicio()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Inicio();

	/**
	 * Returns the meta object for the containment reference '{@link SistemaEncuestas.Modulo#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fin</em>'.
	 * @see SistemaEncuestas.Modulo#getFin()
	 * @see #getModulo()
	 * @generated
	 */
	EReference getModulo_Fin();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin</em>'.
	 * @see SistemaEncuestas.Fin
	 * @generated
	 */
	EClass getFin();

	/**
	 * Returns the meta object for the attribute '{@link SistemaEncuestas.Fin#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see SistemaEncuestas.Fin#getTitulo()
	 * @see #getFin()
	 * @generated
	 */
	EAttribute getFin_Titulo();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.SaltoRespuesta <em>Salto Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salto Respuesta</em>'.
	 * @see SistemaEncuestas.SaltoRespuesta
	 * @generated
	 */
	EClass getSaltoRespuesta();

	/**
	 * Returns the meta object for the attribute '{@link SistemaEncuestas.SaltoRespuesta#isDefecto <em>Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defecto</em>'.
	 * @see SistemaEncuestas.SaltoRespuesta#isDefecto()
	 * @see #getSaltoRespuesta()
	 * @generated
	 */
	EAttribute getSaltoRespuesta_Defecto();

	/**
	 * Returns the meta object for the reference '{@link SistemaEncuestas.SaltoRespuesta#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see SistemaEncuestas.SaltoRespuesta#getDestino()
	 * @see #getSaltoRespuesta()
	 * @generated
	 */
	EReference getSaltoRespuesta_Destino();

	/**
	 * Returns the meta object for the reference '{@link SistemaEncuestas.SaltoRespuesta#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see SistemaEncuestas.SaltoRespuesta#getOrigen()
	 * @see #getSaltoRespuesta()
	 * @generated
	 */
	EReference getSaltoRespuesta_Origen();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.Pregunta <em>Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pregunta</em>'.
	 * @see SistemaEncuestas.Pregunta
	 * @generated
	 */
	EClass getPregunta();

	/**
	 * Returns the meta object for the attribute '{@link SistemaEncuestas.Pregunta#getTipoPregunta <em>Tipo Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo Pregunta</em>'.
	 * @see SistemaEncuestas.Pregunta#getTipoPregunta()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_TipoPregunta();

	/**
	 * Returns the meta object for the attribute '{@link SistemaEncuestas.Pregunta#getDescripcion <em>Descripcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descripcion</em>'.
	 * @see SistemaEncuestas.Pregunta#getDescripcion()
	 * @see #getPregunta()
	 * @generated
	 */
	EAttribute getPregunta_Descripcion();

	/**
	 * Returns the meta object for the containment reference list '{@link SistemaEncuestas.Pregunta#getRespuestas <em>Respuestas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Respuestas</em>'.
	 * @see SistemaEncuestas.Pregunta#getRespuestas()
	 * @see #getPregunta()
	 * @generated
	 */
	EReference getPregunta_Respuestas();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.Respuesta <em>Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Respuesta</em>'.
	 * @see SistemaEncuestas.Respuesta
	 * @generated
	 */
	EClass getRespuesta();

	/**
	 * Returns the meta object for the attribute '{@link SistemaEncuestas.Respuesta#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see SistemaEncuestas.Respuesta#getValor()
	 * @see #getRespuesta()
	 * @generated
	 */
	EAttribute getRespuesta_Valor();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.Navegacion <em>Navegacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navegacion</em>'.
	 * @see SistemaEncuestas.Navegacion
	 * @generated
	 */
	EClass getNavegacion();

	/**
	 * Returns the meta object for the attribute '{@link SistemaEncuestas.Navegacion#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see SistemaEncuestas.Navegacion#getTitulo()
	 * @see #getNavegacion()
	 * @generated
	 */
	EAttribute getNavegacion_Titulo();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.Nodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo</em>'.
	 * @see SistemaEncuestas.Nodo
	 * @generated
	 */
	EClass getNodo();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.Inicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inicio</em>'.
	 * @see SistemaEncuestas.Inicio
	 * @generated
	 */
	EClass getInicio();

	/**
	 * Returns the meta object for the attribute '{@link SistemaEncuestas.Inicio#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see SistemaEncuestas.Inicio#getTitulo()
	 * @see #getInicio()
	 * @generated
	 */
	EAttribute getInicio_Titulo();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.SaltoInicio <em>Salto Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salto Inicio</em>'.
	 * @see SistemaEncuestas.SaltoInicio
	 * @generated
	 */
	EClass getSaltoInicio();

	/**
	 * Returns the meta object for the reference '{@link SistemaEncuestas.SaltoInicio#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see SistemaEncuestas.SaltoInicio#getOrigen()
	 * @see #getSaltoInicio()
	 * @generated
	 */
	EReference getSaltoInicio_Origen();

	/**
	 * Returns the meta object for the reference '{@link SistemaEncuestas.SaltoInicio#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see SistemaEncuestas.SaltoInicio#getDestino()
	 * @see #getSaltoInicio()
	 * @generated
	 */
	EReference getSaltoInicio_Destino();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.SaltoPregunta <em>Salto Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salto Pregunta</em>'.
	 * @see SistemaEncuestas.SaltoPregunta
	 * @generated
	 */
	EClass getSaltoPregunta();

	/**
	 * Returns the meta object for the reference '{@link SistemaEncuestas.SaltoPregunta#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see SistemaEncuestas.SaltoPregunta#getOrigen()
	 * @see #getSaltoPregunta()
	 * @generated
	 */
	EReference getSaltoPregunta_Origen();

	/**
	 * Returns the meta object for the reference '{@link SistemaEncuestas.SaltoPregunta#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see SistemaEncuestas.SaltoPregunta#getDestino()
	 * @see #getSaltoPregunta()
	 * @generated
	 */
	EReference getSaltoPregunta_Destino();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.SaltoFinRespuesta <em>Salto Fin Respuesta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salto Fin Respuesta</em>'.
	 * @see SistemaEncuestas.SaltoFinRespuesta
	 * @generated
	 */
	EClass getSaltoFinRespuesta();

	/**
	 * Returns the meta object for the reference '{@link SistemaEncuestas.SaltoFinRespuesta#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see SistemaEncuestas.SaltoFinRespuesta#getDestino()
	 * @see #getSaltoFinRespuesta()
	 * @generated
	 */
	EReference getSaltoFinRespuesta_Destino();

	/**
	 * Returns the meta object for the reference '{@link SistemaEncuestas.SaltoFinRespuesta#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see SistemaEncuestas.SaltoFinRespuesta#getOrigen()
	 * @see #getSaltoFinRespuesta()
	 * @generated
	 */
	EReference getSaltoFinRespuesta_Origen();

	/**
	 * Returns the meta object for class '{@link SistemaEncuestas.SaltoFinPregunta <em>Salto Fin Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salto Fin Pregunta</em>'.
	 * @see SistemaEncuestas.SaltoFinPregunta
	 * @generated
	 */
	EClass getSaltoFinPregunta();

	/**
	 * Returns the meta object for the reference '{@link SistemaEncuestas.SaltoFinPregunta#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see SistemaEncuestas.SaltoFinPregunta#getDestino()
	 * @see #getSaltoFinPregunta()
	 * @generated
	 */
	EReference getSaltoFinPregunta_Destino();

	/**
	 * Returns the meta object for the reference '{@link SistemaEncuestas.SaltoFinPregunta#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see SistemaEncuestas.SaltoFinPregunta#getOrigen()
	 * @see #getSaltoFinPregunta()
	 * @generated
	 */
	EReference getSaltoFinPregunta_Origen();

	/**
	 * Returns the meta object for enum '{@link SistemaEncuestas.ETipoPregunta <em>ETipo Pregunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ETipo Pregunta</em>'.
	 * @see SistemaEncuestas.ETipoPregunta
	 * @generated
	 */
	EEnum getETipoPregunta();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SistemaEncuestasFactory getSistemaEncuestasFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.EncuestaImpl <em>Encuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.EncuestaImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getEncuesta()
		 * @generated
		 */
		EClass ENCUESTA = eINSTANCE.getEncuesta();

		/**
		 * The meta object literal for the '<em><b>Elemento</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCUESTA__ELEMENTO = eINSTANCE.getEncuesta_Elemento();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.ElementoImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getElemento()
		 * @generated
		 */
		EClass ELEMENTO = eINSTANCE.getElemento();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.ModuloImpl <em>Modulo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.ModuloImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getModulo()
		 * @generated
		 */
		EClass MODULO = eINSTANCE.getModulo();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULO__TITULO = eINSTANCE.getModulo_Titulo();

		/**
		 * The meta object literal for the '<em><b>Preguntas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULO__PREGUNTAS = eINSTANCE.getModulo_Preguntas();

		/**
		 * The meta object literal for the '<em><b>Inicio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULO__INICIO = eINSTANCE.getModulo_Inicio();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULO__FIN = eINSTANCE.getModulo_Fin();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.FinImpl <em>Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.FinImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getFin()
		 * @generated
		 */
		EClass FIN = eINSTANCE.getFin();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIN__TITULO = eINSTANCE.getFin_Titulo();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.SaltoRespuestaImpl <em>Salto Respuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.SaltoRespuestaImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getSaltoRespuesta()
		 * @generated
		 */
		EClass SALTO_RESPUESTA = eINSTANCE.getSaltoRespuesta();

		/**
		 * The meta object literal for the '<em><b>Defecto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SALTO_RESPUESTA__DEFECTO = eINSTANCE.getSaltoRespuesta_Defecto();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALTO_RESPUESTA__DESTINO = eINSTANCE.getSaltoRespuesta_Destino();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALTO_RESPUESTA__ORIGEN = eINSTANCE.getSaltoRespuesta_Origen();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.PreguntaImpl <em>Pregunta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.PreguntaImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getPregunta()
		 * @generated
		 */
		EClass PREGUNTA = eINSTANCE.getPregunta();

		/**
		 * The meta object literal for the '<em><b>Tipo Pregunta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__TIPO_PREGUNTA = eINSTANCE.getPregunta_TipoPregunta();

		/**
		 * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREGUNTA__DESCRIPCION = eINSTANCE.getPregunta_Descripcion();

		/**
		 * The meta object literal for the '<em><b>Respuestas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREGUNTA__RESPUESTAS = eINSTANCE.getPregunta_Respuestas();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.RespuestaImpl <em>Respuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.RespuestaImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getRespuesta()
		 * @generated
		 */
		EClass RESPUESTA = eINSTANCE.getRespuesta();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPUESTA__VALOR = eINSTANCE.getRespuesta_Valor();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.NavegacionImpl <em>Navegacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.NavegacionImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getNavegacion()
		 * @generated
		 */
		EClass NAVEGACION = eINSTANCE.getNavegacion();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVEGACION__TITULO = eINSTANCE.getNavegacion_Titulo();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.NodoImpl <em>Nodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.NodoImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getNodo()
		 * @generated
		 */
		EClass NODO = eINSTANCE.getNodo();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.InicioImpl <em>Inicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.InicioImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getInicio()
		 * @generated
		 */
		EClass INICIO = eINSTANCE.getInicio();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INICIO__TITULO = eINSTANCE.getInicio_Titulo();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.SaltoInicioImpl <em>Salto Inicio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.SaltoInicioImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getSaltoInicio()
		 * @generated
		 */
		EClass SALTO_INICIO = eINSTANCE.getSaltoInicio();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALTO_INICIO__ORIGEN = eINSTANCE.getSaltoInicio_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALTO_INICIO__DESTINO = eINSTANCE.getSaltoInicio_Destino();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.SaltoPreguntaImpl <em>Salto Pregunta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.SaltoPreguntaImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getSaltoPregunta()
		 * @generated
		 */
		EClass SALTO_PREGUNTA = eINSTANCE.getSaltoPregunta();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALTO_PREGUNTA__ORIGEN = eINSTANCE.getSaltoPregunta_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALTO_PREGUNTA__DESTINO = eINSTANCE.getSaltoPregunta_Destino();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.SaltoFinRespuestaImpl <em>Salto Fin Respuesta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.SaltoFinRespuestaImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getSaltoFinRespuesta()
		 * @generated
		 */
		EClass SALTO_FIN_RESPUESTA = eINSTANCE.getSaltoFinRespuesta();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALTO_FIN_RESPUESTA__DESTINO = eINSTANCE.getSaltoFinRespuesta_Destino();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALTO_FIN_RESPUESTA__ORIGEN = eINSTANCE.getSaltoFinRespuesta_Origen();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.impl.SaltoFinPreguntaImpl <em>Salto Fin Pregunta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.impl.SaltoFinPreguntaImpl
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getSaltoFinPregunta()
		 * @generated
		 */
		EClass SALTO_FIN_PREGUNTA = eINSTANCE.getSaltoFinPregunta();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALTO_FIN_PREGUNTA__DESTINO = eINSTANCE.getSaltoFinPregunta_Destino();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SALTO_FIN_PREGUNTA__ORIGEN = eINSTANCE.getSaltoFinPregunta_Origen();

		/**
		 * The meta object literal for the '{@link SistemaEncuestas.ETipoPregunta <em>ETipo Pregunta</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SistemaEncuestas.ETipoPregunta
		 * @see SistemaEncuestas.impl.SistemaEncuestasPackageImpl#getETipoPregunta()
		 * @generated
		 */
		EEnum ETIPO_PREGUNTA = eINSTANCE.getETipoPregunta();

	}

} //SistemaEncuestasPackage
