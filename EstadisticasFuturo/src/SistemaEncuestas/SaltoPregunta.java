/**
 */
package SistemaEncuestas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salto Pregunta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.SaltoPregunta#getOrigen <em>Origen</em>}</li>
 *   <li>{@link SistemaEncuestas.SaltoPregunta#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoPregunta()
 * @model
 * @generated
 */
public interface SaltoPregunta extends Navegacion {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Pregunta)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoPregunta_Origen()
	 * @model required="true"
	 * @generated
	 */
	Pregunta getOrigen();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoPregunta#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Pregunta value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Nodo)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoPregunta_Destino()
	 * @model required="true"
	 * @generated
	 */
	Nodo getDestino();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoPregunta#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Nodo value);

} // SaltoPregunta
