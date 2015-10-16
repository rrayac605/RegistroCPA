package mx.gob.imss.cit.de.dictaminacion.integration.api;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

public interface CedulaRemuneracionesIntegrator {
	
	CedulaRemuneracionesDTO obtenerCedulaRemuneraciones() throws DictamenNegocioException;
}