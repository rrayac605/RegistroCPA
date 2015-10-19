package mx.gob.imss.distss.dictamen.contador.integration.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicointegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.NdvContadorPublicoAutDTO;
/**
 * Session Bean implementation class ContadorPublicoServiceBusiness
 */
@Stateless(name = "contadorPublicoService", mappedName = "contadorPublicoService")
@Remote(ContadorPublicointegrator.class)
public class ContadorPublicoServiceIntegrator implements ContadorPublicointegrator {



	public ContadorPublicoServiceIntegrator() {
	}

	@Override
	public boolean consultarRegistroContador(String curp) {
		// TODO Auto-generated method stub
		return false;
	}



}
