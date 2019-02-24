/**
 */
package SistemaEncuestas;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pregunta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.Pregunta#getTipoPregunta <em>Tipo Pregunta</em>}</li>
 *   <li>{@link SistemaEncuestas.Pregunta#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link SistemaEncuestas.Pregunta#getRespuestas <em>Respuestas</em>}</li>
 * </ul>
 *
 * @see SistemaEncuestas.SistemaEncuestasPackage#getPregunta()
 * @model
 * @generated
 */
public interface Pregunta extends Nodo {
	/**
	 * Returns the value of the '<em><b>Tipo Pregunta</b></em>' attribute.
	 * The literals are from the enumeration {@link SistemaEncuestas.ETipoPregunta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo Pregunta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo Pregunta</em>' attribute.
	 * @see SistemaEncuestas.ETipoPregunta
	 * @see #setTipoPregunta(ETipoPregunta)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getPregunta_TipoPregunta()
	 * @model unique="false"
	 * @generated
	 */
	ETipoPregunta getTipoPregunta();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.Pregunta#getTipoPregunta <em>Tipo Pregunta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo Pregunta</em>' attribute.
	 * @see SistemaEncuestas.ETipoPregunta
	 * @see #getTipoPregunta()
	 * @generated
	 */
	void setTipoPregunta(ETipoPregunta value);

	/**
	 * Returns the value of the '<em><b>Descripcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descripcion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descripcion</em>' attribute.
	 * @see #setDescripcion(String)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getPregunta_Descripcion()
	 * @model
	 * @generated
	 */
	String getDescripcion();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.Pregunta#getDescripcion <em>Descripcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descripcion</em>' attribute.
	 * @see #getDescripcion()
	 * @generated
	 */
	void setDescripcion(String value);

	/**
	 * Returns the value of the '<em><b>Respuestas</b></em>' containment reference list.
	 * The list contents are of type {@link SistemaEncuestas.Respuesta}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Respuestas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Respuestas</em>' containment reference list.
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getPregunta_Respuestas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Respuesta> getRespuestas();

} // Pregunta
