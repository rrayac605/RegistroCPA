package mx.gob.imss.cit.dictamen.contador.services;

import gob.imss.webservice.sat.rfc.implementacion.ClienteWebserviceRfc;
import mx.gob.imss.cit.dictamen.contador.services.impl.SatServiceImpl;
import mx.gob.imss.ctirss.delta.framework.exceptions.ClienteWebserviceSatRfcException;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClienteWebserviceTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(SatServiceImpl.class);

	
	@Test
	public void TestConexion(){
		Fisica personaFisica = null;
   
		ClienteWebserviceRfc clienteWebserviceRfc = new ClienteWebserviceRfc();
		LOGGER.info("cliente.creacion");
		try {
			personaFisica = clienteWebserviceRfc.buscarPersonaFisicaPorRfcEnSat("SAHO871027S99");
		} catch (ClienteWebserviceSatRfcException ex) {
			LOGGER.info("ERROR: Al intentar obtener a una Persona Fisica por RFC, del Servicio Web del SAT.", ex);
			throw new RuntimeException("ERROR: Al intentar obtener a una Persona Fisica por RFC, del Servicio Web del SAT.", ex);
		}
	}
}
