package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.net.MalformedURLException;
import java.net.URL;

import javax.ejb.Stateless;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.commons.exception.DictamenContadorWebServiceException;
import mx.gob.imss.cit.dictamen.contador.services.DictamenInterfaceService;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaMoral;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaMoralInput;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ConsultaPersonaMoralResponse;
import mx.gob.imss.cit.dictamen.servicios.ws.serviciosbdtu.ServiciosBDTU_Service;

@Stateless(name  = "dictamenInterfaceService", mappedName = "dictamenInterfaceService")
public class DictamenInterfaceServiceImpl implements DictamenInterfaceService {
	private static final Logger LOGGER = LoggerFactory.getLogger(DictamenInterfaceServiceImpl.class);

	public static final String QNAME="http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/";
	public static final String QNAME_SERVICE="ServiciosBDTU";
    public static final String SERVICE_URL= "http://11.254.20.226:8011/DictamenEJB/Proxies/ServiciosBDTU_Dictamen?wsdl";
	@Override
	public ConsultaPersonaMoralResponse consultarPersonalMoral(String rfc) throws DictamenContadorWebServiceException{
	    URL url=null;
	    ConsultaPersonaMoralResponse consultaPersonaMoralResponse = null;
		try {
			LOGGER.info("SERVICE_URL="+SERVICE_URL);
			url = new URL( SERVICE_URL );
			ServiciosBDTU_Service service = new ServiciosBDTU_Service(url, new QName(QNAME, QNAME_SERVICE));
			ConsultaPersonaMoral consultaPersonaMoral  = new ConsultaPersonaMoral ();
			ConsultaPersonaMoralInput consultaPersonaMoralInput = new ConsultaPersonaMoralInput();
			consultaPersonaMoralInput.setRfc(rfc);
			consultaPersonaMoral.setArg0(consultaPersonaMoralInput);
			consultaPersonaMoralResponse= service.getServiciosBDTUPort().consultaPersonaMoral(consultaPersonaMoral);
			if(consultaPersonaMoralResponse!=null){
LOGGER.info("DictamenInterfaceServiceImpl.idpersona="+consultaPersonaMoralResponse.getReturn().getPersonaMoral().getIdPersona());
			}
		} catch (MalformedURLException e) {
			LOGGER.info("CONSULTA SERVICIO WEB="+e.getMessage(),e);
			throw new DictamenContadorWebServiceException("IMSS:ERROR CONSULTA SERVICIO WEB="+e.getMessage(),e);
		}
		return consultaPersonaMoralResponse;
	}

}
