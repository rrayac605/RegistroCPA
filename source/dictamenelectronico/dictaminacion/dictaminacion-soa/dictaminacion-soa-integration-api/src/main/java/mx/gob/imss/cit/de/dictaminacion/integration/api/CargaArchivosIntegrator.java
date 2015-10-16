package mx.gob.imss.cit.de.dictaminacion.integration.api;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.CargaDocumentoDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

public interface CargaArchivosIntegrator {
	List<ParentLayoutDTO> findLayout(PatronDictamenDTO patronDictamenDTO,String rfcContador)throws DictamenNegocioException;
	boolean registrarCargaAseveracion(CargaDocumentoDTO cargaAseveracionesDTO)throws DictamenNegocioException;
	
	List<CargaDocumentoDTO> findCvePatronEstadoAseveracion(Long cveIdPatronDictamen, Long cveIdCpa, String desRfc) throws DictamenNegocioException;

}
