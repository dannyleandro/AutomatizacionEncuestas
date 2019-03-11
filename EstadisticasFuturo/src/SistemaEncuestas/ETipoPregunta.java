/**
 */
package SistemaEncuestas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ETipo Pregunta</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see SistemaEncuestas.SistemaEncuestasPackage#getETipoPregunta()
 * @model
 * @generated
 */
public enum ETipoPregunta implements Enumerator {
	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(1, "A", "A"),

	/**
	 * The '<em><b>UR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UR_VALUE
	 * @generated
	 * @ordered
	 */
	UR(2, "UR", "UR"),

	/**
	 * The '<em><b>MR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MR_VALUE
	 * @generated
	 * @ordered
	 */
	MR(3, "MR", "MR");

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 1;

	/**
	 * The '<em><b>UR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UR_VALUE = 2;

	/**
	 * The '<em><b>MR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MR_VALUE = 3;

	/**
	 * An array of all the '<em><b>ETipo Pregunta</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ETipoPregunta[] VALUES_ARRAY =
		new ETipoPregunta[] {
			A,
			UR,
			MR,
		};

	/**
	 * A public read-only list of all the '<em><b>ETipo Pregunta</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ETipoPregunta> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ETipo Pregunta</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETipoPregunta get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETipoPregunta result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETipo Pregunta</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETipoPregunta getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETipoPregunta result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETipo Pregunta</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ETipoPregunta get(int value) {
		switch (value) {
			case A_VALUE: return A;
			case UR_VALUE: return UR;
			case MR_VALUE: return MR;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ETipoPregunta(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ETipoPregunta
