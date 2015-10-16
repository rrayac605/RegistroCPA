package mx.gob.imss.cit.dictamen.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.integration.api.CedulaRemuneracionesIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.services.CedulaRemuneracionesService;

import org.apache.log4j.Logger;

@Remote({ CedulaRemuneracionesIntegrator.class })
@Stateless
public class CedulaRemuneracionesIntegratorImpl implements CedulaRemuneracionesIntegrator{

	private static final Logger LOG=Logger.getLogger(CedulaRemuneracionesIntegratorImpl.class);

	@EJB
	private CedulaRemuneracionesService cedulaRemuneracionesService;
	@Override
	public CedulaRemuneracionesDTO obtenerCedulaRemuneraciones() throws DictamenNegocioException {
		
		return null;
	}

}
