package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

public interface CedulaRemuneracionesIntegrator {
	
	/**
	 * 
	 * @return
	 * @throws DictamenNegocioException
	 */
	List<CedulaRemuneracionesDTO> obtenerCedulaRemuneraciones() throws DictamenNegocioException;
	
	/**
	 * 
	 * @param cedulasRemuneraciones
	 * @throws DictamenNegocioException
	 */
	void saveCedulaRemuneraciones(List<CedulaRemuneracionesDTO> cedulasRemuneraciones) throws DictamenNegocioException;
}