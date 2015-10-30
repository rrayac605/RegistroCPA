package mx.gob.imss.cit.dictamen.contador.services;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import gob.imss.webservice.sat.rfc.implementacion.ClienteWebserviceRfc;
import mx.gob.imss.cit.dictamen.contador.services.impl.SatServiceImpl;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaFisica;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaFisicaInput;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ConsultaMediosDeContactoInput;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ServiciosBDTU_Service;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PensionWebServiceTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(SatServiceImpl.class);

	
	@Test
	public void TestConexion() throws MalformedURLException{
	    URL url = new URL("http://11.254.20.226:8011/ServiciosBDTU/Proxies/ProxyServiceBDTU?wsdl" );
		ServiciosBDTU_Service service = new ServiciosBDTU_Service(url, new QName("http://serviciosNegocio.solicitudPension.cit.imss.gob.mx/ws/ServiciosBDTU/", "ServiciosBDTU"));
		ConsultaMediosDeContactoInput consultaMediosDeContactoInput= new ConsultaMediosDeContactoInput();
		consultaMediosDeContactoInput.setIdPersona(37472955L);
		service.getServiciosBDTUSOAP().consultaMediosDeContacto(consultaMediosDeContactoInput);
	
   


	}
}
