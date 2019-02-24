/**
 */
package SistemaEncuestas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salto Fin Pregunta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.SaltoFinPregunta#getDestino <em>Destino</em>}</li>
 *   <li>{@link SistemaEncuestas.SaltoFinPregunta#getOrigen <em>Origen</em>}</li>
 * </ul>
 *
 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoFinPregunta()
 * @model
 * @generated
 */
public interface SaltoFinPregunta extends Navegacion {
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
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoFinPregunta_Destino()
	 * @model required="true"
	 * @generated
	 */
	Fin getDestino();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoFinPregunta#getDestino <em>Destino</em>}' reference.
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
	 * @see #setOrigen(Pregunta)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoFinPregunta_Origen()
	 * @model required="true"
	 * @generated
	 */
	Pregunta getOrigen();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoFinPregunta#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Pregunta value);

} // SaltoFinPregunta
