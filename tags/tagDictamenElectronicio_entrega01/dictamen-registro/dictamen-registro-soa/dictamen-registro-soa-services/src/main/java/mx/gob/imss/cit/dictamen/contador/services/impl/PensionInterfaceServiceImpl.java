package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.net.MalformedURLException;
import java.net.URL;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.GeneracionTramiteSolicitudTO;
import mx.gob.imss.cit.dictamen.contador.commons.to.domain.TramiteSolicitudTO;
import mx.gob.imss.cit.dictamen.contador.services.PensionInterfaceService;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.CrearTramiteSolicitudInput;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.CrearTramiteSolicitudOutput;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ServiciosBDTU;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.ServiciosBDTU_Service;
import mx.gob.imss.cit.solicitudPension.serviciosNegocio.ws.serviciosbdtu.tramitesolicitudschema.DatosSolicitud;


@Stateless(name  = "pensionInterfaceService", mappedName = "pensionInterfaceService")
public class PensionInterfaceServiceImpl implements PensionInterfaceService{

	private static final Logger LOGGER = LoggerFactory.getLogger(PensionInterfaceServiceImpl.class);


	private URL wsdl;
	private QName name;
	private ServiciosBDTU port;
	

	@PostConstruct
	public void init() {

		try {
			wsdl = new URL("http://11.254.20.226:8011/DictamenEJB/Proxies/ServiciosBDTU_Dictamen?wsdl");
			name = new QName("http://servicios.dictamen.cit.imss.gob.mx/ws/ServiciosBDTU/", "ServiciosBDTU");
			port = new ServiciosBDTU_Service(wsdl, name).getServiciosBDTUSOAP();
			
		} catch (MalformedURLException malformedURLException) {
			LOGGER.info(malformedURLException.getMessage(),malformedURLException);
		}
	}
	
      
	public GeneracionTramiteSolicitudTO crearTramiteSolicitud(TramiteSolicitudTO tramiteSolicitudTO){
		CrearTramiteSolicitudInput  crearTramiteSolicitudInput  = new CrearTramiteSolicitudInput ();
		DatosSolicitud datosSolicitud = new DatosSolicitud();
		datosSolicitud.setIdAsignacionNss(tramiteSolicitudTO.getIdAsignacionNss());
		datosSolicitud.setIdTipoSolicitud(tramiteSolicitudTO.getIdTipoSolicitud());
		datosSolicitud.setNss(tramiteSolicitudTO.getNss());
		datosSolicitud.setIdTipoTramite(tramiteSolicitudTO.getIdTipoTramite());
		crearTramiteSolicitudInput.setDatosSolicitud(datosSolicitud);
		
		GeneracionTramiteSolicitudTO generacionTramiteSolicitudTO = null;
		CrearTramiteSolicitudOutput crearTramiteSolicitudOutput =  port.crearTramiteSolicitud(crearTramiteSolicitudInput);
	    
		if(crearTramiteSolicitudOutput!=null){
			generacionTramiteSolicitudTO =  new GeneracionTramiteSolicitudTO();
			generacionTramiteSolicitudTO.setIdSolicitud(crearTramiteSolicitudOutput.getIdSolicitud());
			generacionTramiteSolicitudTO.setIdTramite(crearTramiteSolicitudOutput.getIdTramite());
		}
		return generacionTramiteSolicitudTO;
	}
	
	
	public URL getWsdl() {
		return wsdl;
	}


	public void setWsdl(URL wsdl) {
		this.wsdl = wsdl;
	}


	public QName getName() {
		return name;
	}


	public void setName(QName name) {
		this.name = name;
	}


	public ServiciosBDTU getPort() {
		return port;
	}


	public void setPort(ServiciosBDTU port) {
		this.port = port;
	}

	
}
