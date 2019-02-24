/**
 */
package SistemaEncuestas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salto Inicio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.SaltoInicio#getOrigen <em>Origen</em>}</li>
 *   <li>{@link SistemaEncuestas.SaltoInicio#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoInicio()
 * @model
 * @generated
 */
public interface SaltoInicio extends Navegacion {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Inicio)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoInicio_Origen()
	 * @model required="true"
	 * @generated
	 */
	Inicio getOrigen();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoInicio#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Inicio value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Pregunta)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoInicio_Destino()
	 * @model required="true"
	 * @generated
	 */
	Pregunta getDestino();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoInicio#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Pregunta value);

} // SaltoInicio
