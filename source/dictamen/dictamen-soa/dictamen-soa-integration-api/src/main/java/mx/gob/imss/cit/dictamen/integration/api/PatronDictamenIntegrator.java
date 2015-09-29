package mx.gob.imss.cit.dictamen.integration.api;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;


public interface PatronDictamenIntegrator {

	PatronDictamenDTO getDatosPatron(PatronDictamenDTO datosDTO,ContadorPublicoAutDTO contador)throws DictamenNegocioException;
	
	void executeRegistrar(PatronDictamenDTO datosDTO,ContadorPublicoAutDTO contador)throws DictamenNegocioException;
	
	void executeActualizar(PatronDictamenDTO datosDTO)throws DictamenNegocioException;
	
}
