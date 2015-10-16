package mx.gob.imss.cit.dictamen.integration.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.integration.api.CedulaPrestacionesIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaPrestacionesDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;

@Remote({ CedulaPrestacionesIntegrator.class })
@Stateless
public class CedulaPrestacionesIntegratorImpl implements CedulaPrestacionesIntegrator{

	@Override
	public CedulaPrestacionesDTO obtenerCedulaPrestaciones()
			throws DictamenNegocioException {
		// TODO Auto-generated method stub
		return null;
	}

}
