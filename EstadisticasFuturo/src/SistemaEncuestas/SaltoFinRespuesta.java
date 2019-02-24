/**
 */
package SistemaEncuestas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salto Fin Respuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.SaltoFinRespuesta#getDestino <em>Destino</em>}</li>
 *   <li>{@link SistemaEncuestas.SaltoFinRespuesta#getOrigen <em>Origen</em>}</li>
 * </ul>
 *
 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoFinRespuesta()
 * @model
 * @generated
 */
public interface SaltoFinRespuesta extends Navegacion {
	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Fin)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoFinRespuesta_Destino()
	 * @model required="true"
	 * @generated
	 */
	Fin getDestino();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoFinRespuesta#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Fin value);

	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Respuesta)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoFinRespuesta_Origen()
	 * @model required="true"
	 * @generated
	 */
	Respuesta getOrigen();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoFinRespuesta#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Respuesta value);

} // SaltoFinRespuesta
