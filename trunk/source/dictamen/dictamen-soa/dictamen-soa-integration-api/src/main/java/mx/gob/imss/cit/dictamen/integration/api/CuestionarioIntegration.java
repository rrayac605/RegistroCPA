package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import javax.ejb.Remote;

import mx.gob.imss.cit.dictamen.integration.api.dto.CuestionarioDTO;

@Remote
public interface CuestionarioIntegration {
	
	public List<CuestionarioDTO> findCuestionarios();
}
