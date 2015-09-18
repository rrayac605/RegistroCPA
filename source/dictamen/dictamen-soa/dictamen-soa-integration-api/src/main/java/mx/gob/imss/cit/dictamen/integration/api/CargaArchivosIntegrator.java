package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

public interface CargaArchivosIntegrator {
	List<ParentLayoutDTO> findLayout()throws DictamenNegocioException;
}
