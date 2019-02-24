/**
 *
 * $Id$
 */
package SistemaEncuestas.validation;

import SistemaEncuestas.ETipoPregunta;
import SistemaEncuestas.Respuesta;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link SistemaEncuestas.Pregunta}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PreguntaValidator {
	boolean validate();

	boolean validateTipoPregunta(ETipoPregunta value);
	boolean validateDescripcion(String value);
	boolean validateRespuestas(EList<Respuesta> value);
}
