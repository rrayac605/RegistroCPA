package mx.gob.imss.cit.dictamen.contador.integration.api;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralBDTUDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;

public interface DictamenIntegrator {
	PersonaMoralBDTUDTO consultarPersonaMoralPorRFC(String rfc) throws DictamenContadorNegocioException ;
	
	
}
