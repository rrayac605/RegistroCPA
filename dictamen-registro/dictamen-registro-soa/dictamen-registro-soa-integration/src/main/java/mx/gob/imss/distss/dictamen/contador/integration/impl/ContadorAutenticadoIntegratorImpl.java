package mx.gob.imss.distss.dictamen.contador.integration.impl;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorAutenticadoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.services.ContadorAutenticadoService;

@Remote({mx.gob.imss.cit.dictamen.contador.integration.api.ContadorAutenticadoIntegrator.class})
@Stateless(mappedName = "contadorAutenticadoIntegrator", name = "contadorAutenticadoIntegrator")
public class ContadorAutenticadoIntegratorImpl implements
		ContadorAutenticadoIntegrator {
	
	@EJB
	private ContadorAutenticadoService contadorAutenticadoService;

	@Override
	public boolean validarSesionContador(String rfc, String curp) {
		return contadorAutenticadoService.validarSesionContador(rfc, curp);
	}

	@Override
	public int validarContadorAutenticado(ContadorPublicoDTO contadorAut) {
		return contadorAutenticadoService.validarContadorAutenticado(contadorAut);
	}

}
