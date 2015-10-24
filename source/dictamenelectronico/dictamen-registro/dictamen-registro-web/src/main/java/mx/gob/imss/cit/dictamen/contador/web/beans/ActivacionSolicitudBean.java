package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActivacionContadorPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActivacionSolicitudPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

import org.primefaces.event.ToggleEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name = "activacionSolicitudBean")
@ViewScoped
public class ActivacionSolicitudBean extends BaseBean {

	private static final long serialVersionUID = -6717550265551435161L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ActivacionSolicitudBean.class);

	
	@ManagedProperty(value = "#{activacionSolicitudPage}")
	private ActivacionSolicitudPage activacionSolicitudPage;

	@EJB(mappedName="contadorPublicoIntegrator", name="contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;
	
    private boolean activarContadorAutorizado = false;
	private boolean activarContadorNoAutorizado = false;
    private boolean activarValidarRegistroIMSS = false;
    
    private String registroIMSS;
    private boolean activarSiguienteRegIMSS = true;

	public void handleToggle(ToggleEvent event) {
		
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled", "Visibility:" + event.getVisibility());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	@PostConstruct
    public void init() {
		LOGGER.info("Cargar datos de sesion");
		//Datos Session
	   PersonaDTO personaDTO = new PersonaDTO();
	   personaDTO.setNombre("LUCIO");
	   personaDTO.setApellidoMaterno("DURAN");
	   personaDTO.setApellidoPaterno("SILVA");
	   personaDTO.setRfc("DUSL821218LN8");
	   personaDTO.setCurp("DUSL821218HDFRLC09");
	   personaDTO.setIdPersona(37472955L);
	   personaDTO.setNombreCompleto("LUCIO SILVA DURAN");
	   personaDTO.setFolioSolicitud("123456789123456789123");
	   
	   activacionSolicitudPage.setPersonaDTO(personaDTO);
	   
	   Long idPersona = activacionSolicitudPage.getPersonaDTO().getIdPersona();
       ContadorPublicoDTO contadorPublicoDTO = contadorPublicoIntegrator.consultarContadorPublicAut(idPersona);
        
       if(contadorPublicoDTO!=null){
    	   
    	   if(contadorPublicoDTO.getCveIdEstadoCPA() == 14){
    		   FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activacion:","Su Registro IMSS:"+contadorPublicoDTO.getNumRegistroCPA()+" se encuentra Cancelado"));
    	   }else{
    		   FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Activacion:","Su Registro IMSS:"+contadorPublicoDTO.getNumRegistroCPA()+" valido"));
    	   }
    	   
    	   activacionSolicitudPage.getPersonaDTO().setContadorPublicoAutDTO(contadorPublicoDTO);
           this.setActivarContadorNoAutorizado(false);
           this.setActivarContadorAutorizado(true);
           

       }else{
           this.setActivarContadorNoAutorizado(true);
           this.setActivarContadorAutorizado(false);

       }
       
       //FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"X","abcdde"));

        
    	
	  // ContadorPublicoDTO contadorPublicoDTO =contadorPublicoIntegrator.consultarContadorPublicAut(personaDTO.getIdPersona());
	   
	   
	   /*
      String curp = (String) FacesUtils.getSessionMap().get("curp");
      String rfc = (String) FacesUtils.getSessionMap().get("rfc");
      if(curp==null && rfc ==null){
			FacesUtils.messageError(1,"Debe Iniciar Sesion");
      
      }else{
      
      LOGGER.info("CURP="+curp);
      LOGGER.info("rfc="+rfc);
      LOGGER.info("conexion.contadorPublicoIntegrator");
      contadorPublicoIntegrator.consultarFisicaPorRFC(rfc);
      
     // PersonaDTO contadorPublicoDTOintegrator = contadorPublicoIntegrator.verificarContadorPublico(curp, rfc);
   
      if(contadorPublicoDTOintegrator!=null){
	    activacionContadorPage.setContadorPublicoDTO(contadorPublicoDTOintegrator);
        LOGGER.info("Nombre="+contadorPublicoDTOintegrator.getNombre());
        LOGGER.info("idPersona="+contadorPublicoDTOintegrator.getIdPersona());

        ContadorPublicoDTO contadorPublicoDTO = contadorPublicoIntegrator.consultarContadorPublicAut(contadorPublicoDTOintegrator.getIdPersona());
        if(contadorPublicoDTO!=null){
        	activacionContadorPage.getContadorPublicoDTO().getContadorPublicoAutDTO().setNumRegistroCPA(contadorPublicoDTO.getNumRegistroCPA());
        }
        
      }
      }*/
      LOGGER.info("FIN INIT ");
	}
	
	public String aceptacion(){
	  LOGGER.info("Redirect=activacionContadorAceptacion");
	  return "activacion_contador";
	}
	
	public void accionValidarRegistroImss(){
		LOGGER.info("registroimss.accionValidarRegistroImss");
        this.setActivarValidarRegistroIMSS(true);
        this.setActivarContadorNoAutorizado(false);
        this.setActivarContadorAutorizado(false);      
	
	}
	public void accionAtrasRegistroIMSS(){
        this.setActivarValidarRegistroIMSS(false);
        this.setActivarContadorNoAutorizado(false);
        this.setActivarContadorAutorizado(true); 
	}
	public void accionBuscarRegistroIMSS(){
		
	   LOGGER.info("registroIMSS="+registroIMSS);
	   FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Activación:","No se encontró registro IMSS:"+registroIMSS));

	}
	
	
	public boolean isActivarValidarRegistroIMSS() {
		return activarValidarRegistroIMSS;
	}



	public void setActivarValidarRegistroIMSS(boolean activarValidarRegistroIMSS) {
		this.activarValidarRegistroIMSS = activarValidarRegistroIMSS;
	}

	public String actionContadorNoAutorizado(){
		  return "ventanillaunica";
	}


	public boolean isActivarSiguienteRegIMSS() {
		return activarSiguienteRegIMSS;
	}

	public void setActivarSiguienteRegIMSS(boolean activarSiguienteRegIMSS) {
		this.activarSiguienteRegIMSS = activarSiguienteRegIMSS;
	}
	public ContadorPublicoIntegrator getContadorPublicoIntegrator() {
		return contadorPublicoIntegrator;
	}

	public void setContadorPublicoIntegrator(
			ContadorPublicoIntegrator contadorPublicoIntegrator) {
		this.contadorPublicoIntegrator = contadorPublicoIntegrator;
	}
	

	public boolean isActivarContadorNoAutorizado() {
		return activarContadorNoAutorizado;
	}


    public boolean isActivarContadorAutorizado() {
		return activarContadorAutorizado;
	}

	public void setActivarContadorAutorizado(boolean activarContadorAutorizado) {
		this.activarContadorAutorizado = activarContadorAutorizado;
	}
	
	public void setActivarContadorNoAutorizado(boolean activarContadorNoAutorizado) {
		this.activarContadorNoAutorizado = activarContadorNoAutorizado;
	}
	



	public ActivacionSolicitudPage getActivacionSolicitudPage() {
		return activacionSolicitudPage;
	}

	public void setActivacionSolicitudPage(
			ActivacionSolicitudPage activacionSolicitudPage) {
		this.activacionSolicitudPage = activacionSolicitudPage;
	}


	public String getRegistroIMSS() {
		return registroIMSS;
	}

	public void setRegistroIMSS(String registroIMSS) {
		this.registroIMSS = registroIMSS;
	}
}
