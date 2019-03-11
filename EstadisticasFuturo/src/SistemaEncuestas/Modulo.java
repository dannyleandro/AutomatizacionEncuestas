/**
 */
package SistemaEncuestas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modulo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.Modulo#getTitulo <em>Titulo</em>}</li>
 *   <li>{@link SistemaEncuestas.Modulo#getPreguntas <em>Preguntas</em>}</li>
 *   <li>{@link SistemaEncuestas.Modulo#getInicio <em>Inicio</em>}</li>
 *   <li>{@link SistemaEncuestas.Modulo#getFin <em>Fin</em>}</li>
 *   <li>{@link SistemaEncuestas.Modulo#getIdModulo <em>Id Modulo</em>}</li>
 *   <li>{@link SistemaEncuestas.Modulo#getEsInicial <em>Es Inicial</em>}</li>
 * </ul>
 *
 * @see SistemaEncuestas.SistemaEncuestasPackage#getModulo()
 * @model
 * @generated
 */
public interface Modulo extends Nodo {
	/**
	 * Returns the value of the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titulo</em>' attribute.
	 * @see #setTitulo(String)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getModulo_Titulo()
	 * @model
	 * @generated
	 */
	String getTitulo();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.Modulo#getTitulo <em>Titulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titulo</em>' attribute.
	 * @see #getTitulo()
	 * @generated
	 */
	void setTitulo(String value);

	/**
	 * Returns the value of the '<em><b>Preguntas</b></em>' containment reference list.
	 * The list contents are of type {@link SistemaEncuestas.Pregunta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preguntas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preguntas</em>' containment reference list.
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getModulo_Preguntas()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pregunta> getPreguntas();

	/**
	 * Returns the value of the '<em><b>Inicio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inicio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inicio</em>' containment reference.
	 * @see #setInicio(Inicio)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getModulo_Inicio()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Inicio getInicio();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.Modulo#getInicio <em>Inicio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inicio</em>' containment reference.
	 * @see #getInicio()
	 * @generated
	 */
	void setInicio(Inicio value);

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' containment reference.
	 * @see #setFin(Fin)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getModulo_Fin()
	 * @model containment="true"
	 * @generated
	 */
	Fin getFin();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.Modulo#getFin <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' containment reference.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(Fin value);

	/**
	 * Returns the value of the '<em><b>Id Modulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Modulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Modulo</em>' attribute.
	 * @see #setIdModulo(int)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getModulo_IdModulo()
	 * @model
	 * @generated
	 */
	int getIdModulo();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.Modulo#getIdModulo <em>Id Modulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Modulo</em>' attribute.
	 * @see #getIdModulo()
	 * @generated
	 */
	void setIdModulo(int value);

	/**
	 * Returns the value of the '<em><b>Es Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Inicial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Inicial</em>' attribute.
	 * @see #setEsInicial(int)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getModulo_EsInicial()
	 * @model
	 * @generated
	 */
	int getEsInicial();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.Modulo#getEsInicial <em>Es Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Inicial</em>' attribute.
	 * @see #getEsInicial()
	 * @generated
	 */
	void setEsInicial(int value);

} // Modulo
