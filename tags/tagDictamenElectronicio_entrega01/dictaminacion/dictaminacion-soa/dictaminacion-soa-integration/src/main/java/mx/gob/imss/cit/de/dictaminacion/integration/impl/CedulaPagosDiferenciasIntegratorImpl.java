package mx.gob.imss.cit.de.dictaminacion.integration.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.de.dictaminacion.integration.api.CedulaPagosDiferenciasIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaPagosDiferenciasDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;

@Remote({ CedulaPagosDiferenciasIntegrator.class })
@Stateless
public class CedulaPagosDiferenciasIntegratorImpl implements CedulaPagosDiferenciasIntegrator{

	@Override
	public CedulaPagosDiferenciasDTO obtenerCedulaPagosDiferencias()
			throws DictamenNegocioException {
		// TODO Auto-generated method stub
		return null;
	}

}
