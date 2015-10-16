package mx.gob.imss.cit.dictamen.integration.api;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaPrestacionesDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

public interface CedulaPrestacionesIntegrator {
	
	CedulaPrestacionesDTO obtenerCedulaPrestaciones() throws DictamenNegocioException;
}
