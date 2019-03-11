/**
 */
package SistemaEncuestas;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Respuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.Respuesta#getValor <em>Valor</em>}</li>
 *   <li>{@link SistemaEncuestas.Respuesta#getIdRespuesta <em>Id Respuesta</em>}</li>
 * </ul>
 *
 * @see SistemaEncuestas.SistemaEncuestasPackage#getRespuesta()
 * @model
 * @generated
 */
public interface Respuesta extends EObject {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getRespuesta_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.Respuesta#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

	/**
	 * Returns the value of the '<em><b>Id Respuesta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Respuesta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Respuesta</em>' attribute.
	 * @see #setIdRespuesta(int)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getRespuesta_IdRespuesta()
	 * @model
	 * @generated
	 */
	int getIdRespuesta();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.Respuesta#getIdRespuesta <em>Id Respuesta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Respuesta</em>' attribute.
	 * @see #getIdRespuesta()
	 * @generated
	 */
	void setIdRespuesta(int value);

} // Respuesta
