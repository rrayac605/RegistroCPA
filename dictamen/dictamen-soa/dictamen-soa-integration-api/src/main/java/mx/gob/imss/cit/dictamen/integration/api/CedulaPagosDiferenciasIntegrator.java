package mx.gob.imss.cit.dictamen.integration.api;

import mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaPagosDiferenciasDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

public interface CedulaPagosDiferenciasIntegrator {
	
	CedulaPagosDiferenciasDTO obtenerCedulaPagosDiferencias() throws DictamenNegocioException;
}
