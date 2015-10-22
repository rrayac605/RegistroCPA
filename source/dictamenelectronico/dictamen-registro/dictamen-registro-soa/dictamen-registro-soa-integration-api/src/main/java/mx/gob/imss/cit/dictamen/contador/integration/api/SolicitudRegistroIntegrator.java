package mx.gob.imss.cit.dictamen.contador.integration.api;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;

/**
 * 
 * @author ariverav
 *
 */
public interface SolicitudRegistroIntegrator {
	/**
	 * Método que consulta los datos de un contador
	 * @param curp
	 * @param rfc
	 * @return
	 * @throws DictamenContadorNegocioException
	 */
	ContadorPublicoAutDTO obtenerContadorPublicoAutDTO(String curp, String rfc) throws DictamenContadorNegocioException;

}
