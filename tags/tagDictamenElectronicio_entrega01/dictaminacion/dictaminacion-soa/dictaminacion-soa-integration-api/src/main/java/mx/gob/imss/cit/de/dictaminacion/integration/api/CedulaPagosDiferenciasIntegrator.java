package mx.gob.imss.cit.de.dictaminacion.integration.api;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaPagosDiferenciasDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

public interface CedulaPagosDiferenciasIntegrator {
	
	CedulaPagosDiferenciasDTO obtenerCedulaPagosDiferencias() throws DictamenNegocioException;
}
