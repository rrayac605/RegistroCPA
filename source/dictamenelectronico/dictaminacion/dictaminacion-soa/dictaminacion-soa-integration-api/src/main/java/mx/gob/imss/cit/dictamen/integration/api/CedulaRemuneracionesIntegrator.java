package mx.gob.imss.cit.dictamen.integration.api;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

public interface CedulaRemuneracionesIntegrator {
	
	CedulaRemuneracionesDTO obtenerCedulaRemuneraciones() throws DictamenNegocioException;
}