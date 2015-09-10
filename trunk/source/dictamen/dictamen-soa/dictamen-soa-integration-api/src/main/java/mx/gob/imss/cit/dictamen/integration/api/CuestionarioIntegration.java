package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.CuestionarioDTO;

public interface CuestionarioIntegration {
	
	public List<CuestionarioDTO> findCuestionarios();
}
