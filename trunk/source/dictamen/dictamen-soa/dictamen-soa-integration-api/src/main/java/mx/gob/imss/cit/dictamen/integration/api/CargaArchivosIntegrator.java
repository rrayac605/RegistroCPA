package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.CargaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

public interface CargaArchivosIntegrator {
	List<ParentLayoutDTO> findLayout(String anioEjercicio, String rfcUsuario, String rfcPatron)throws DictamenNegocioException;
	boolean registrarCargaAseveracion(CargaDocumentoDTO cargaAseveracionesDTO)throws DictamenNegocioException;
}
