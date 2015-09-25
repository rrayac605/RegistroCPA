package mx.gob.imss.cit.dictamen.integration.api;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;


public interface PatronDictamenIntegrator {

	PatronDictamenDTO getDatosPatron(String rfc)throws DictamenNegocioException;
	
	void executeRegistrar(PatronDictamenDTO datosDTO)throws DictamenNegocioException;
	
}