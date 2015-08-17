/**
 * 
 */
package mx.gob.imss.cit.dictamen.integration.api;

import mx.gob.imss.cit.dictamen.integration.api.dto.ContadorPublicoDTO;

/**
 * @author ajfuentes
 *
 */

public interface RegistrarContadorPublicoIntegrator {
	
	void executeRegistrarContador(ContadorPublicoDTO contadorPublicoDTO);
	
}
