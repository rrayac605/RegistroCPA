package mx.gob.imss.cit.dictamen.integration.impl;


import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.integration.api.RegistrarContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.services.RegistrarContadorPublicoService;

/**
 * @author ajfuentes
 *
 */
@Remote({RegistrarContadorPublicoIntegrator.class})
@Stateless
public class RegistrarContadorPublicoIntegratorImpl implements RegistrarContadorPublicoIntegrator{
	
	@EJB
	private RegistrarContadorPublicoService registrarContadorPublicoService;
	
	/**
	 * 
	 */
	public void executeRegistrarContador(ContadorPublicoDTO contadorPublicoDTO){
		registrarContadorPublicoService.executeRegistrarContador(null);
	}
	
}
