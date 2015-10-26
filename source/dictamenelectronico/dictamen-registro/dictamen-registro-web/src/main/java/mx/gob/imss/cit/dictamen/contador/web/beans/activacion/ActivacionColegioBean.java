package mx.gob.imss.cit.dictamen.contador.web.beans.activacion;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.DictamenIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralBDTUDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.activacion.ActivacionColegioPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

@ManagedBean(name = "activacionColegioBean")
@ViewScoped
public class ActivacionColegioBean extends BaseBean{
	private static final Logger LOGGER = LoggerFactory.getLogger(ActivacionColegioBean.class);

	private static final long serialVersionUID = 8484045551757214944L;
	
	private boolean activarColegioValido=false;

	@ManagedProperty(value = "#{activacionColegioPage}")
	private ActivacionColegioPage activacionColegioPage;
	

	@EJB(mappedName="dictamenIntegrator", name="dictamenIntegrator")
	private DictamenIntegrator dictamenIntegrator;
	
	
	@EJB(mappedName="contadorPublicoIntegrator", name="contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;
	


	@PostConstruct
	public void init(){

        if(!this.getActivacionColegioPage().isValido()){
		PersonaMoralDTO personaMoralDTO = new PersonaMoralDTO();
		DomicilioFiscalDTO domicilioFiscalDTO = new DomicilioFiscalDTO();
		personaMoralDTO.setDomicilioFiscalDTO(domicilioFiscalDTO);
		activacionColegioPage.setPersonaMoralDTO(personaMoralDTO);
		}

	}
    
	public String accionAtras(){
	  this.getActivacionColegioPage().setValido(false);
	  return "activacion_despacho";
	}
	public void accionBuscarPersonaMoral(){
	       String rfc = activacionColegioPage.getPersonaMoralDTO().getRfc();
		   LOGGER.info("RFC="+activacionColegioPage.getPersonaMoralDTO().getRfc());
		   PersonaMoralDTO personaMoralDTO = contadorPublicoIntegrator.consultarPersonaMoralPorRFC(rfc);
		   
		   if(personaMoralDTO!=null){
			   try {
			   PersonaMoralBDTUDTO personaMoralBDTUDTO = dictamenIntegrator.consultarPersonaMoralPorRFC(rfc);
			   if(personaMoralBDTUDTO!=null){
				   activacionColegioPage.setPersonaMoralDTO(personaMoralDTO);
				   this.setActivarColegioValido(true);
				   
		    	   activacionColegioPage.setPersonaMoralBDTUDTO(personaMoralBDTUDTO);
			   }else{
				   FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activacion:"," No se encontraron coincidencias en BDTU con el RFC proporcionado:"+rfc+". Favor de verificarlo con el Despacho al que pertenece e intente nuevamente"));
				   this.setActivarColegioValido(false);

			   }
				} catch (DictamenContadorNegocioException e) {
					LOGGER.info(e.getMessage(),e);
				}
				   
	
		   }else{
			   FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activacion:"," No se encontraron coincidencias con el RFC proporcionado:"+rfc+". Favor de verificarlo con el Despacho al que pertenece e intente nuevamente"));
			   this.setActivarColegioValido(false);
		   }
		   
		}
	
	public ContadorPublicoIntegrator getContadorPublicoIntegrator() {
		return contadorPublicoIntegrator;
	}

	public void setContadorPublicoIntegrator(
			ContadorPublicoIntegrator contadorPublicoIntegrator) {
		this.contadorPublicoIntegrator = contadorPublicoIntegrator;
	}
	
	public String siguiente(){
		  LOGGER.info("Redirect=activacionContadorAceptacion");
		  this.activacionColegioPage.setValido(true);
		  return "activacion_acuse";
	}
	
	public ActivacionColegioPage getActivacionColegioPage() {
		return activacionColegioPage;
	}
	public void setActivacionColegioPage(ActivacionColegioPage activacionColegioPage) {
		this.activacionColegioPage = activacionColegioPage;
	}

	public boolean isActivarColegioValido() {
		return activarColegioValido;
	}

	public void setActivarColegioValido(boolean activarColegioValido) {
		this.activarColegioValido = activarColegioValido;
	}

	
	public DictamenIntegrator getDictamenIntegrator() {
		return dictamenIntegrator;
	}

	public void setDictamenIntegrator(DictamenIntegrator dictamenIntegrator) {
		this.dictamenIntegrator = dictamenIntegrator;
	}
}
