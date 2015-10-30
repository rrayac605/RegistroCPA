package mx.gob.imss.cit.dictamen.contador.web.beans.reactivacion;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.primefaces.event.ToggleEvent;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContactoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DatosPersonalesDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.activacion.ActivacionContadorPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.activacion.ActivacionSolicitudPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.reactivacion.ReactivacionContadorPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.reactivacion.ReactivacionSolicitudPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;

@ManagedBean(name = "reactivacionContadorBean")
@ViewScoped
public class ReactivacionContadorBean extends BaseBean {
	
	private static final long serialVersionUID = 6140756713835351053L;

	private static final Logger LOGGER = Logger.getLogger(ReactivacionContadorBean.class);

	



	@ManagedProperty(value = "#{reactivacionContadorPage}")
	private ReactivacionContadorPage reactivacionContadorPage;

	@ManagedProperty(value = "#{reactivacionSolicitudPage}")
	private ReactivacionSolicitudPage reactivacionSolicitudPage;
	



	@EJB(mappedName="contadorPublicoIntegrator", name="contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;
	
	
	@PostConstruct
    public void init() {
    	
    	LOGGER.info("activacionContadorBean.init(");
    	if(!reactivacionContadorPage.isValido()){
       	String rfc = reactivacionSolicitudPage.getPersonaDTO().getRfc();
       	Long idPersona = reactivacionSolicitudPage.getPersonaDTO().getIdPersona();

    	DomicilioFiscalDTO domicilioDTO = contadorPublicoIntegrator.consultarDomicilioPorRFC(rfc);
    	String folioSolicitud = reactivacionSolicitudPage.getPersonaDTO().getFolioSolicitud();
    	if(domicilioDTO!=null){
    		List<DatosPersonalesDTO> lstDatosPersonalesDTO =  contadorPublicoIntegrator.consultarCedulaPorIdPersona(idPersona);
    		LOGGER.info("lstDatosPersonalesDTO.size="+lstDatosPersonalesDTO.size());
    		FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Activación:","El folio de solicitud es:"+folioSolicitud));
    		reactivacionSolicitudPage.getPersonaDTO().getContadorPublicoAutDTO().setDomicilioFiscalDTO(domicilioDTO);
    	    if(!lstDatosPersonalesDTO.isEmpty()){
        	    reactivacionContadorPage.setDatosPersonalesDTO(lstDatosPersonalesDTO.get(0));
        	    LOGGER.info("cedula.getInstitucionCedula="+reactivacionContadorPage.getDatosPersonalesDTO().getInstitucionCedula());
        	    LOGGER.info("cedula.getNumeroCedula="+reactivacionContadorPage.getDatosPersonalesDTO().getNumeroCedula());
        	    LOGGER.info("cedula.getFechaExpedicionCedula="+reactivacionContadorPage.getDatosPersonalesDTO().getFechaExpedicionCedula());

    	    }
    	    ContactoDTO contactoDTO = new ContactoDTO();
    	    reactivacionContadorPage.setContactoDTO(contactoDTO);
    	}
    	}
    }
    
	public boolean validarCorreoElectronico(){
		  boolean validacion=true;
		 LOGGER.info("Redirect=accionGuardar");
		  String correo1 = this.getReactivacionContadorPage().getContactoDTO().getCorreoElectronico2();
		  String ccorreo2 = this.getReactivacionContadorPage().getContactoDTO().getCorreoElectronico2Conf();
		  
         if(StringUtils.trimToEmpty(correo1).compareTo(StringUtils.trimToEmpty(ccorreo2))!=0){
     		  FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activación:","Correo Electronico 2 debe Coincidir"));
     		  validacion =false;
         }
		  LOGGER.info("Redirect=correo1="+correo1);
		  LOGGER.info("Redirect=ccorreo2="+ccorreo2);

		  String correo3 = this.getReactivacionContadorPage().getContactoDTO().getCorreoElectronico3();
		  String ccorreo4 = this.getReactivacionContadorPage().getContactoDTO().getCorreoElectronico3Conf();
		  
	      if(StringUtils.trimToEmpty(correo3).compareTo(StringUtils.trimToEmpty(ccorreo4))!=0){
	      		FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activación:","Correo Electronico 3 debe Coincidir"));
	     		validacion =false;
	      }
		  LOGGER.info("Redirect=correo3="+correo3);
		  LOGGER.info("Redirect=ccorreo4="+ccorreo4);
		  return validacion;
	} 
	
	public String accionAtras(){
		    this.getReactivacionContadorPage().setValido(false);
		    return "reactivacion_solicitud";
		 
	}
	
	public String accionSiguiente(){
		  if(validarCorreoElectronico()){
			    this.getReactivacionContadorPage().setValido(true);

		     return "reactivacion_despacho";
		  } 
		  return "";
	}
	
    
	public void handleToggle(ToggleEvent event) {
		
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled", "Visibility:" + event.getVisibility());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	



	public ContadorPublicoIntegrator getContadorPublicoIntegrator() {
		return contadorPublicoIntegrator;
	}



	public void setContadorPublicoIntegrator(
			ContadorPublicoIntegrator contadorPublicoIntegrator) {
		this.contadorPublicoIntegrator = contadorPublicoIntegrator;
	}
	


	public ReactivacionContadorPage getReactivacionContadorPage() {
		return reactivacionContadorPage;
	}

	public void setReactivacionContadorPage(
			ReactivacionContadorPage reactivacionContadorPage) {
		this.reactivacionContadorPage = reactivacionContadorPage;
	}


	public ReactivacionSolicitudPage getReactivacionSolicitudPage() {
		return reactivacionSolicitudPage;
	}

	public void setReactivacionSolicitudPage(
			ReactivacionSolicitudPage reactivacionSolicitudPage) {
		this.reactivacionSolicitudPage = reactivacionSolicitudPage;
	}


}
