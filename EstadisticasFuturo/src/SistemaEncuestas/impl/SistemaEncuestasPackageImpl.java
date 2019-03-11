/**
 */
package SistemaEncuestas.impl;

import SistemaEncuestas.ETipoPregunta;
import SistemaEncuestas.Elemento;
import SistemaEncuestas.Encuesta;
import SistemaEncuestas.Fin;
import SistemaEncuestas.Inicio;
import SistemaEncuestas.Modulo;
import SistemaEncuestas.Navegacion;
import SistemaEncuestas.Nodo;
import SistemaEncuestas.Pregunta;
import SistemaEncuestas.Respuesta;
import SistemaEncuestas.SaltoFinPregunta;
import SistemaEncuestas.SaltoFinRespuesta;
import SistemaEncuestas.SaltoInicio;
import SistemaEncuestas.SaltoPregunta;
import SistemaEncuestas.SaltoRespuesta;
import SistemaEncuestas.SistemaEncuestasFactory;
import SistemaEncuestas.SistemaEncuestasPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SistemaEncuestasPackageImpl extends EPackageImpl implements SistemaEncuestasPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saltoRespuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preguntaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navegacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saltoInicioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saltoPreguntaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saltoFinRespuestaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saltoFinPreguntaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eTipoPreguntaEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see SistemaEncuestas.SistemaEncuestasPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SistemaEncuestasPackageImpl() {
		super(eNS_URI, SistemaEncuestasFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SistemaEncuestasPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SistemaEncuestasPackage init() {
		if (isInited) return (SistemaEncuestasPackage)EPackage.Registry.INSTANCE.getEPackage(SistemaEncuestasPackage.eNS_URI);

		// Obtain or create and register package
		SistemaEncuestasPackageImpl theSistemaEncuestasPackage = (SistemaEncuestasPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SistemaEncuestasPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SistemaEncuestasPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSistemaEncuestasPackage.createPackageContents();

		// Initialize created meta-data
		theSistemaEncuestasPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSistemaEncuestasPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SistemaEncuestasPackage.eNS_URI, theSistemaEncuestasPackage);
		return theSistemaEncuestasPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncuesta() {
		return encuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncuesta_Elemento() {
		return (EReference)encuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncuesta_Titulo() {
		return (EAttribute)encuestaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElemento() {
		return elementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModulo() {
		return moduloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulo_Titulo() {
		return (EAttribute)moduloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Preguntas() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Inicio() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModulo_Fin() {
		return (EReference)moduloEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulo_IdModulo() {
		return (EAttribute)moduloEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModulo_EsInicial() {
		return (EAttribute)moduloEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFin() {
		return finEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFin_Titulo() {
		return (EAttribute)finEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaltoRespuesta() {
		return saltoRespuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSaltoRespuesta_Defecto() {
		return (EAttribute)saltoRespuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaltoRespuesta_Destino() {
		return (EReference)saltoRespuestaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaltoRespuesta_Origen() {
		return (EReference)saltoRespuestaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPregunta() {
		return preguntaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPregunta_TipoPregunta() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPregunta_Descripcion() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPregunta_Respuestas() {
		return (EReference)preguntaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPregunta_IdPregunta() {
		return (EAttribute)preguntaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespuesta() {
		return respuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespuesta_Valor() {
		return (EAttribute)respuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRespuesta_IdRespuesta() {
		return (EAttribute)respuestaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavegacion() {
		return navegacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavegacion_Titulo() {
		return (EAttribute)navegacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNodo() {
		return nodoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInicio() {
		return inicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInicio_Titulo() {
		return (EAttribute)inicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaltoInicio() {
		return saltoInicioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaltoInicio_Origen() {
		return (EReference)saltoInicioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaltoInicio_Destino() {
		return (EReference)saltoInicioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaltoPregunta() {
		return saltoPreguntaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaltoPregunta_Origen() {
		return (EReference)saltoPreguntaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaltoPregunta_Destino() {
		return (EReference)saltoPreguntaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaltoFinRespuesta() {
		return saltoFinRespuestaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaltoFinRespuesta_Destino() {
		return (EReference)saltoFinRespuestaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaltoFinRespuesta_Origen() {
		return (EReference)saltoFinRespuestaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaltoFinPregunta() {
		return saltoFinPreguntaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaltoFinPregunta_Destino() {
		return (EReference)saltoFinPreguntaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSaltoFinPregunta_Origen() {
		return (EReference)saltoFinPreguntaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getETipoPregunta() {
		return eTipoPreguntaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SistemaEncuestasFactory getSistemaEncuestasFactory() {
		return (SistemaEncuestasFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		encuestaEClass = createEClass(ENCUESTA);
		createEReference(encuestaEClass, ENCUESTA__ELEMENTO);
		createEAttribute(encuestaEClass, ENCUESTA__TITULO);

		elementoEClass = createEClass(ELEMENTO);

		moduloEClass = createEClass(MODULO);
		createEAttribute(moduloEClass, MODULO__TITULO);
		createEReference(moduloEClass, MODULO__PREGUNTAS);
		createEReference(moduloEClass, MODULO__INICIO);
		createEReference(moduloEClass, MODULO__FIN);
		createEAttribute(moduloEClass, MODULO__ID_MODULO);
		createEAttribute(moduloEClass, MODULO__ES_INICIAL);

		finEClass = createEClass(FIN);
		createEAttribute(finEClass, FIN__TITULO);

		saltoRespuestaEClass = createEClass(SALTO_RESPUESTA);
		createEAttribute(saltoRespuestaEClass, SALTO_RESPUESTA__DEFECTO);
		createEReference(saltoRespuestaEClass, SALTO_RESPUESTA__DESTINO);
		createEReference(saltoRespuestaEClass, SALTO_RESPUESTA__ORIGEN);

		preguntaEClass = createEClass(PREGUNTA);
		createEAttribute(preguntaEClass, PREGUNTA__TIPO_PREGUNTA);
		createEAttribute(preguntaEClass, PREGUNTA__DESCRIPCION);
		createEReference(preguntaEClass, PREGUNTA__RESPUESTAS);
		createEAttribute(preguntaEClass, PREGUNTA__ID_PREGUNTA);

		respuestaEClass = createEClass(RESPUESTA);
		createEAttribute(respuestaEClass, RESPUESTA__VALOR);
		createEAttribute(respuestaEClass, RESPUESTA__ID_RESPUESTA);

		navegacionEClass = createEClass(NAVEGACION);
		createEAttribute(navegacionEClass, NAVEGACION__TITULO);

		nodoEClass = createEClass(NODO);

		inicioEClass = createEClass(INICIO);
		createEAttribute(inicioEClass, INICIO__TITULO);

		saltoInicioEClass = createEClass(SALTO_INICIO);
		createEReference(saltoInicioEClass, SALTO_INICIO__ORIGEN);
		createEReference(saltoInicioEClass, SALTO_INICIO__DESTINO);

		saltoPreguntaEClass = createEClass(SALTO_PREGUNTA);
		createEReference(saltoPreguntaEClass, SALTO_PREGUNTA__ORIGEN);
		createEReference(saltoPreguntaEClass, SALTO_PREGUNTA__DESTINO);

		saltoFinRespuestaEClass = createEClass(SALTO_FIN_RESPUESTA);
		createEReference(saltoFinRespuestaEClass, SALTO_FIN_RESPUESTA__DESTINO);
		createEReference(saltoFinRespuestaEClass, SALTO_FIN_RESPUESTA__ORIGEN);

		saltoFinPreguntaEClass = createEClass(SALTO_FIN_PREGUNTA);
		createEReference(saltoFinPreguntaEClass, SALTO_FIN_PREGUNTA__DESTINO);
		createEReference(saltoFinPreguntaEClass, SALTO_FIN_PREGUNTA__ORIGEN);

		// Create enums
		eTipoPreguntaEEnum = createEEnum(ETIPO_PREGUNTA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moduloEClass.getESuperTypes().add(this.getNodo());
		saltoRespuestaEClass.getESuperTypes().add(this.getNavegacion());
		preguntaEClass.getESuperTypes().add(this.getNodo());
		navegacionEClass.getESuperTypes().add(this.getElemento());
		nodoEClass.getESuperTypes().add(this.getElemento());
		saltoInicioEClass.getESuperTypes().add(this.getNavegacion());
		saltoPreguntaEClass.getESuperTypes().add(this.getNavegacion());
		saltoFinRespuestaEClass.getESuperTypes().add(this.getNavegacion());
		saltoFinPreguntaEClass.getESuperTypes().add(this.getNavegacion());

		// Initialize classes, features, and operations; add parameters
		initEClass(encuestaEClass, Encuesta.class, "Encuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncuesta_Elemento(), this.getElemento(), null, "elemento", null, 0, -1, Encuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncuesta_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Encuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementoEClass, Elemento.class, "Elemento", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduloEClass, Modulo.class, "Modulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModulo_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Preguntas(), this.getPregunta(), null, "preguntas", null, 1, -1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Inicio(), this.getInicio(), null, "inicio", null, 1, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModulo_Fin(), this.getFin(), null, "fin", null, 0, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulo_IdModulo(), ecorePackage.getEInt(), "idModulo", null, 0, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModulo_EsInicial(), ecorePackage.getEInt(), "esInicial", null, 0, 1, Modulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finEClass, Fin.class, "Fin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFin_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Fin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saltoRespuestaEClass, SaltoRespuesta.class, "SaltoRespuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSaltoRespuesta_Defecto(), ecorePackage.getEBoolean(), "defecto", "false", 0, 1, SaltoRespuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaltoRespuesta_Destino(), this.getNodo(), null, "destino", null, 1, 1, SaltoRespuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaltoRespuesta_Origen(), this.getRespuesta(), null, "origen", null, 1, 1, SaltoRespuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preguntaEClass, Pregunta.class, "Pregunta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPregunta_TipoPregunta(), this.getETipoPregunta(), "tipoPregunta", "A", 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_Descripcion(), ecorePackage.getEString(), "descripcion", null, 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPregunta_Respuestas(), this.getRespuesta(), null, "respuestas", null, 0, -1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPregunta_IdPregunta(), ecorePackage.getEInt(), "idPregunta", null, 0, 1, Pregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respuestaEClass, Respuesta.class, "Respuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRespuesta_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRespuesta_IdRespuesta(), ecorePackage.getEInt(), "idRespuesta", null, 0, 1, Respuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navegacionEClass, Navegacion.class, "Navegacion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavegacion_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Navegacion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodoEClass, Nodo.class, "Nodo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inicioEClass, Inicio.class, "Inicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInicio_Titulo(), ecorePackage.getEString(), "titulo", null, 0, 1, Inicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saltoInicioEClass, SaltoInicio.class, "SaltoInicio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSaltoInicio_Origen(), this.getInicio(), null, "origen", null, 1, 1, SaltoInicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaltoInicio_Destino(), this.getPregunta(), null, "destino", null, 1, 1, SaltoInicio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saltoPreguntaEClass, SaltoPregunta.class, "SaltoPregunta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSaltoPregunta_Origen(), this.getPregunta(), null, "origen", null, 1, 1, SaltoPregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaltoPregunta_Destino(), this.getNodo(), null, "destino", null, 1, 1, SaltoPregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saltoFinRespuestaEClass, SaltoFinRespuesta.class, "SaltoFinRespuesta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSaltoFinRespuesta_Destino(), this.getFin(), null, "destino", null, 1, 1, SaltoFinRespuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaltoFinRespuesta_Origen(), this.getRespuesta(), null, "origen", null, 1, 1, SaltoFinRespuesta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(saltoFinPreguntaEClass, SaltoFinPregunta.class, "SaltoFinPregunta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSaltoFinPregunta_Destino(), this.getFin(), null, "destino", null, 1, 1, SaltoFinPregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSaltoFinPregunta_Origen(), this.getPregunta(), null, "origen", null, 1, 1, SaltoFinPregunta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eTipoPreguntaEEnum, ETipoPregunta.class, "ETipoPregunta");
		addEEnumLiteral(eTipoPreguntaEEnum, ETipoPregunta.A);
		addEEnumLiteral(eTipoPreguntaEEnum, ETipoPregunta.UR);
		addEEnumLiteral(eTipoPreguntaEEnum, ETipoPregunta.MR);

		// Create resource
		createResource(eNS_URI);
	}

} //SistemaEncuestasPackageImpl
