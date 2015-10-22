package mx.gob.imss.cit.dictamen.contador.services;

import gob.imss.webservice.sat.rfc.implementacion.ClienteWebserviceRfc;
import mx.gob.imss.cit.dictamen.contador.services.impl.SatServiceImpl;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.consultaspensiones.consultaspensionesservice.ConsultasPensionesService;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.consultaspensiones.consultaspensionesservice.ConsultasPensionesServiceWS;
import mx.gob.imss.ctirss.delta.framework.exceptions.ClienteWebserviceSatRfcException;
import mx.gob.imss.ctirss.delta.model.gestion.individuo.Fisica;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PensionWebServiceTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(SatServiceImpl.class);

	
	@Test
	public void TestConexion(){
		Fisica personaFisica = null;
   
		ConsultasPensionesService consultasPensionesService = new ConsultasPensionesService();
		LOGGER.info("cliente.creacion");
ConsultasPensionesServiceWS consultasPensionesServiceWS = consultasPensionesService.getConsultasPensionesServiceWSPort();



	}
}
