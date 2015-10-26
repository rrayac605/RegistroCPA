package mx.gob.imss.cit.dictamen.contador.web.beans.reactivacion;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.commons.lang.StringUtils;
import org.primefaces.event.ToggleEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosPersonalesDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActivacionContadorPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActivacionSolicitudPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;

@ManagedBean(name = "activacionContadorBean")
@ViewScoped
public class ReactivacionContadorBean extends BaseBean {
	
	private static final long serialVersionUID = 6140756713835351053L;

	private static final Logger LOGGER = LoggerFactory.getLogger(ReactivacionContadorBean.class);

	
	@ManagedProperty(value = "#{activacionContadorPage}")
	private ActivacionContadorPage activacionContadorPage;

	@ManagedProperty(value = "#{activacionSolicitudPage}")
	private ActivacionSolicitudPage activacionSolicitudPage;
	



	@EJB(mappedName="contadorPublicoIntegrator", name="contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;
	
	
	@PostConstruct
    public void init() {
    	
    	LOGGER.info("activacionContadorBean.init(");
    	if(!activacionContadorPage.isValido()){
       	String rfc = activacionSolicitudPage.getPersonaDTO().getRfc();
       	Long idPersona = activacionSolicitudPage.getPersonaDTO().getIdPersona();

    	DomicilioFiscalDTO domicilioDTO = contadorPublicoIntegrator.consultarDomicilioPorRFC(rfc);
    	String folioSolicitud = activacionSolicitudPage.getPersonaDTO().getFolioSolicitud();
    	if(domicilioDTO!=null){
    		List<DatosPersonalesDTO> lstDatosPersonalesDTO =  contadorPublicoIntegrator.consultarDatosPersonales(idPersona);
    		LOGGER.info("lstDatosPersonalesDTO.size="+lstDatosPersonalesDTO.size());
    		FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Activación:","El folio de solicitud es:"+folioSolicitud));
    		activacionSolicitudPage.getPersonaDTO().getContadorPublicoAutDTO().setDomicilioFiscalDTO(domicilioDTO);
    	    if(!lstDatosPersonalesDTO.isEmpty()){
        	    activacionContadorPage.setDatosPersonalesDTO(lstDatosPersonalesDTO.get(0));
        	    LOGGER.info("cedula.getInstitucionCedula="+activacionContadorPage.getDatosPersonalesDTO().getInstitucionCedula());
        	    LOGGER.info("cedula.getNumeroCedula="+activacionContadorPage.getDatosPersonalesDTO().getNumeroCedula());
        	    LOGGER.info("cedula.getFechaExpedicionCedula="+activacionContadorPage.getDatosPersonalesDTO().getFechaExpedicionCedula());

    	    }
    	    ContactoDTO contactoDTO = new ContactoDTO();
    	    activacionContadorPage.setContactoDTO(contactoDTO);
    	}
    	}
    }
    
	public boolean validarCorreoElectronico(){
		  boolean validacion=true;
		 LOGGER.info("Redirect=accionGuardar");
		  String correo1 = this.getActivacionContadorPage().getContactoDTO().getCorreoElectronico2();
		  String ccorreo2 = this.getActivacionContadorPage().getContactoDTO().getCorreoElectronico2Conf();
		  
         if(StringUtils.trimToEmpty(correo1).compareTo(StringUtils.trimToEmpty(ccorreo2))!=0){
     		  FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activación:","Correo Electronico 2 debe Coincidir"));
     		  validacion =false;
         }
		  LOGGER.info("Redirect=correo1="+correo1);
		  LOGGER.info("Redirect=ccorreo2="+ccorreo2);

		  String correo3 = this.getActivacionContadorPage().getContactoDTO().getCorreoElectronico3();
		  String ccorreo4 = this.getActivacionContadorPage().getContactoDTO().getCorreoElectronico3Conf();
		  
	      if(StringUtils.trimToEmpty(correo3).compareTo(StringUtils.trimToEmpty(ccorreo4))!=0){
	      		FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activación:","Correo Electronico 3 debe Coincidir"));
	     		validacion =false;
	      }
		  LOGGER.info("Redirect=correo3="+correo3);
		  LOGGER.info("Redirect=ccorreo4="+ccorreo4);
		  return validacion;
	} 
	
	public String accionAtras(){
		    this.getActivacionContadorPage().setValido(false);
		    return "activacion_solicitud";
		 
	}
	
	public String accionSiguiente(){
		  if(validarCorreoElectronico()){
			    this.getActivacionContadorPage().setValido(true);

		     return "activacion_despacho";
		  } 
		  return "";
	}
	
    
	public void handleToggle(ToggleEvent event) {
		
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled", "Visibility:" + event.getVisibility());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	public ActivacionContadorPage getActivacionContadorPage() {
		return activacionContadorPage;
	}



	public void setActivacionContadorPage(
			ActivacionContadorPage activacionContadorPage) {
		this.activacionContadorPage = activacionContadorPage;
	}



	public ContadorPublicoIntegrator getContadorPublicoIntegrator() {
		return contadorPublicoIntegrator;
	}



	public void setContadorPublicoIntegrator(
			ContadorPublicoIntegrator contadorPublicoIntegrator) {
		this.contadorPublicoIntegrator = contadorPublicoIntegrator;
	}
	

	public ActivacionSolicitudPage getActivacionSolicitudPage() {
		return activacionSolicitudPage;
	}

	public void setActivacionSolicitudPage(
			ActivacionSolicitudPage activacionSolicitudPage) {
		this.activacionSolicitudPage = activacionSolicitudPage;
	}


}
