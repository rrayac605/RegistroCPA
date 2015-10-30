package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaPrestacionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

public interface CedulaPrestacionesIntegrator {
	
	List<CedulaPrestacionesDTO> obtenerCedulaPrestaciones(Long cveIdPatronDictamen, Long cveIdAtestiguamiento) throws DictamenNegocioException;

}

