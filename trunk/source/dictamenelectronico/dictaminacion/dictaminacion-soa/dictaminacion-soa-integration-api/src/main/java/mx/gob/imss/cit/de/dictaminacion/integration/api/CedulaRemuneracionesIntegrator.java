package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

public interface CedulaRemuneracionesIntegrator {
	
	List<CedulaRemuneracionesDTO> obtenerCedulaRemuneraciones() throws DictamenNegocioException;
}