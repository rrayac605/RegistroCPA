package mx.gob.imss.cit.dictamen.contador.services;

import java.net.MalformedURLException;
import java.net.URL;

import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaFisica;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaFisicaInput;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ServiciosBDTU_Service;

import javax.xml.namespace.QName;

import org.junit.Test;

public class DictamenWebServiceTest  {
	@Test
	public void testGetPatronDictamen() throws MalformedURLException{
	    URL url = new URL( "http://11.254.20.226:8011/DictamenEJB/Proxies/ServiciosBDTU_Dictamen?wsdl" );
		ServiciosBDTU_Service service = new ServiciosBDTU_Service(url, new QName("http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/", "ServiciosBDTU"));
		ConsultaPersonaFisica persona = new ConsultaPersonaFisica();
		ConsultaPersonaFisicaInput consultaPersonaFisicaInput =  new ConsultaPersonaFisicaInput();
		consultaPersonaFisicaInput.setRfc("DUSL821218LN8");
		persona.setArg0(consultaPersonaFisicaInput);
		service.getServiciosBDTUPort().consultaPersonaFisica(persona);
		
	}
}
