package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActivacionContadorPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name = "activacionSolicitudBean")
@ViewScoped
public class ActivacionSolicitudBean extends BaseBean {

	private static final long serialVersionUID = -6717550265551435161L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ActivacionSolicitudBean.class);

	
	@ManagedProperty(value = "#{activacionContadorPage}")
	private ActivacionContadorPage activacionContadorPage;

	@EJB(mappedName="contadorPublicoIntegrator", name="contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;
	


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
	   activacionContadorPage.setPersonaDTO(personaDTO);
	   
	   Long idPersona = activacionContadorPage.getPersonaDTO().getIdPersona();
       ContadorPublicoDTO contadorPublicoDTO = contadorPublicoIntegrator.consultarContadorPublicAut(idPersona);
        
       if(contadorPublicoDTO!=null){
           activacionContadorPage.getPersonaDTO().setContadorPublicoAutDTO(contadorPublicoDTO);
       }
       
       FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"X","abcdde"));

        
    	
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
	  return "activacionContadorAceptacion";
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
}
