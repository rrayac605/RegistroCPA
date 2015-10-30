package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.ContadorPublicoAutDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronAsociadoDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;


public interface PatronDictamenIntegrator {

	PatronDictamenDTO getDatosPatron(PatronDictamenDTO datosDTO,ContadorPublicoAutDTO contador)throws DictamenNegocioException;
	
	void executeRegistrar(PatronDictamenDTO datosDTO,ContadorPublicoAutDTO contador)throws DictamenNegocioException;
	
	void executeActualizar(PatronDictamenDTO datosDTO)throws DictamenNegocioException;
	
	List<PatronAsociadoDTO> savePatronesAsociados(List<PatronAsociadoDTO> listPatronAsociadoDTO) throws DictamenNegocioException;
	
	List<PatronAsociadoDTO> findPatronesAsociados(PatronDictamenDTO patronDictamenDTO) throws DictamenNegocioException;

	
}
