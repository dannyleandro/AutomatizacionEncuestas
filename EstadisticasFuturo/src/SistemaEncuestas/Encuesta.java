/**
 */
package SistemaEncuestas;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encuesta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SistemaEncuestas.Encuesta#getElemento <em>Elemento</em>}</li>
 * </ul>
 *
 * @see SistemaEncuestas.SistemaEncuestasPackage#getEncuesta()
 * @model
 * @generated
 */
public interface Encuesta extends EObject {
	/**
	 * Returns the value of the '<em><b>Elemento</b></em>' containment reference list.
	 * The list contents are of type {@link SistemaEncuestas.Elemento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento</em>' containment reference list.
	 * @see SistemaEncuestas.SistemaEncuestasPackage#getEncuesta_Elemento()
	 * @model containment="true"
	 * @generated
	 */
	EList<Elemento> getElemento();

} // Encuesta
