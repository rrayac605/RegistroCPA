package mx.gob.imss.cit.dictamen.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.InformacionPatronalDTO;


public interface InformacionPatronalIntegrator {
		
	List<InformacionPatronalDTO> findListaAseveraciones();

}
