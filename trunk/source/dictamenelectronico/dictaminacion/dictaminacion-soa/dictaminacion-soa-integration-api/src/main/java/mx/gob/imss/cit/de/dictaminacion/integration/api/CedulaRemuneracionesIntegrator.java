package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;
import java.util.Map;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

public interface CedulaRemuneracionesIntegrator {
	
	/**
	 * 
	 * @return
	 * @throws DictamenNegocioException
	 */
	Map<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>> obtenerCedulaRemuneraciones(PatronDictamenDTO patronDictamenDTO) 
		throws DictamenNegocioException;
	
	/**
	 * 
	 * @param patronDictamenDTO
	 * @return
	 * @throws DictamenNegocioException
	 */
	Map<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>> generarCedulaRemuneraciones(PatronDictamenDTO patronDictamenDTO) 
		throws DictamenNegocioException;
	
	/**
	 * 
	 * @param cedulasRemuneraciones
	 * @throws DictamenNegocioException
	 */
	void saveCedulaRemuneraciones(Map<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>> cedulasRemuneraciones) throws DictamenNegocioException;
}