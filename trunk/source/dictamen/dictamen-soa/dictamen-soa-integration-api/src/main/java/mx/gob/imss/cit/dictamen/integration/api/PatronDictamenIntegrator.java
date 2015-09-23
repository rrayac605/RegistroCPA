package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.TipoDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;


public interface PatronDictamenIntegrator {

	PatronDictamenDTO getDatosPatron(String rfc)throws DictamenNegocioException;
	
	List<TipoDictamenDTO> findAllTipoDictamen()throws DictamenNegocioException;
	
	void executeRegistrar(PatronDictamenDTO datosDTO)throws DictamenNegocioException;
	
}
