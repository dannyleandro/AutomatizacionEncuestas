/**
 */
package SistemaEncuestas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salto Respuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.SaltoRespuesta#isDefecto <em>Defecto</em>}</li>
 *   <li>{@link SistemaEncuestas.SaltoRespuesta#getDestino <em>Destino</em>}</li>
 *   <li>{@link SistemaEncuestas.SaltoRespuesta#getOrigen <em>Origen</em>}</li>
 * </ul>
 *
 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoRespuesta()
 * @model
 * @generated
 */
public interface SaltoRespuesta extends Navegacion {
	/**
	 * Returns the value of the '<em><b>Defecto</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defecto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defecto</em>' attribute.
	 * @see #isSetDefecto()
	 * @see #unsetDefecto()
	 * @see #setDefecto(boolean)
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoRespuesta_Defecto()
	 * @model default="false" unsettable="true"
	 * @generated
	 */
	boolean isDefecto();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoRespuesta#isDefecto <em>Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defecto</em>' attribute.
	 * @see #isSetDefecto()
	 * @see #unsetDefecto()
	 * @see #isDefecto()
	 * @generated
	 */
	void setDefecto(boolean value);

	/**
	 * Unsets the value of the '{@link SistemaEncuestas.SaltoRespuesta#isDefecto <em>Defecto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefecto()
	 * @see #isDefecto()
	 * @see #setDefecto(boolean)
	 * @generated
	 */
	void unsetDefecto();

	/**
	 * Returns whether the value of the '{@link SistemaEncuestas.SaltoRespuesta#isDefecto <em>Defecto</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defecto</em>' attribute is set.
	 * @see #unsetDefecto()
	 * @see #isDefecto()
	 * @see #setDefecto(boolean)
	 * @generated
	 */
	boolean isSetDefecto();

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
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoRespuesta_Destino()
	 * @model required="true"
	 * @generated
	 */
	Nodo getDestino();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoRespuesta#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Nodo value);

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
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getSaltoRespuesta_Origen()
	 * @model required="true"
	 * @generated
	 */
	Respuesta getOrigen();

	/**
	 * Sets the value of the '{@link SistemaEncuestas.SaltoRespuesta#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Respuesta value);

} // SaltoRespuesta
