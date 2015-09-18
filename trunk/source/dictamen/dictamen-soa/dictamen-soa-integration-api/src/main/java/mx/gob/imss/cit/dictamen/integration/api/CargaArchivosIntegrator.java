package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;

public interface CargaArchivosIntegrator {
	List<ParentLayoutDTO> findLayout();
}
