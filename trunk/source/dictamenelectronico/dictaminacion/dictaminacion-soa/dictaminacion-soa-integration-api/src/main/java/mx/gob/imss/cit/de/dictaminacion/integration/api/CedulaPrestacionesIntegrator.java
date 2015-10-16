package mx.gob.imss.cit.de.dictaminacion.integration.api;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaPrestacionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

public interface CedulaPrestacionesIntegrator {
	
	CedulaPrestacionesDTO obtenerCedulaPrestaciones() throws DictamenNegocioException;
}
