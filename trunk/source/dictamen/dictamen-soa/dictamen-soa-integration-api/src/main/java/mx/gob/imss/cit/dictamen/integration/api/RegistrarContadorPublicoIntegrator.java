/**
 * 
 */
package mx.gob.imss.cit.dictamen.integration.api;

import javax.ejb.Remote;

import mx.gob.imss.cit.dictamen.integration.api.dto.ContadorPublicoDTO;

/**
 * @author ajfuentes
 *
 */
@Remote
public interface RegistrarContadorPublicoIntegrator {
	
	void executeRegistrarContador(ContadorPublicoDTO contadorPublicoDTO);
	
}
