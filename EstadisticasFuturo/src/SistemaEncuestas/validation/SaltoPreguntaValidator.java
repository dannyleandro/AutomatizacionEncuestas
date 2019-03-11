/**
 *
 * $Id$
 */
package SistemaEncuestas.validation;

import SistemaEncuestas.Nodo;
import SistemaEncuestas.Pregunta;

/**
 * A sample validator interface for {@link SistemaEncuestas.SaltoPregunta}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SaltoPreguntaValidator {
	boolean validate();

	boolean validateOrigen(Pregunta value);
	boolean validateDestino(Nodo value);
}