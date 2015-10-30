package mx.gob.imss.cit.dictamen.contador.web.beans.reactivacion;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.DictamenIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralBDTUDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.reactivacion.ReactivacionColegioPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

@ManagedBean(name = "reactivacionColegioBean")
@ViewScoped
public class ReactivacionColegioBean extends BaseBean{
	private static final Logger LOGGER = Logger.getLogger(ReactivacionColegioBean.class);

	private static final long serialVersionUID = 8484045551757214944L;
	
	private boolean activarColegioValido=false;

	@ManagedProperty(value = "#{reactivacionColegioPage}")
	private ReactivacionColegioPage reactivacionColegioPage;
	


	@EJB(mappedName="dictamenIntegrator", name="dictamenIntegrator")
	private DictamenIntegrator dictamenIntegrator;
	
	
	@EJB(mappedName="contadorPublicoIntegrator", name="contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;
	


	@PostConstruct
	public void init(){

        if(!this.reactivacionColegioPage.isValido()){
		PersonaMoralDTO personaMoralDTO = new PersonaMoralDTO();
		DomicilioFiscalDTO domicilioFiscalDTO = new DomicilioFiscalDTO();
		personaMoralDTO.setDomicilioFiscalDTO(domicilioFiscalDTO);
		reactivacionColegioPage.setPersonaMoralDTO(personaMoralDTO);
		}

	}
    
	public String accionAtras(){
	  this.reactivacionColegioPage.setValido(false);
	  return "reactivacion_despacho";
	}
	public void accionBuscarPersonaMoral(){
	       String rfc = reactivacionColegioPage.getPersonaMoralDTO().getRfc();
		   LOGGER.info("RFC="+reactivacionColegioPage.getPersonaMoralDTO().getRfc());
		   PersonaMoralDTO personaMoralDTO = contadorPublicoIntegrator.consultarPersonaMoralPorRFC(rfc);
		   
		   if(personaMoralDTO!=null){
			   try {
			   PersonaMoralBDTUDTO personaMoralBDTUDTO = dictamenIntegrator.consultarPersonaMoralPorRFC(rfc);
			   if(personaMoralBDTUDTO!=null){
				   reactivacionColegioPage.setPersonaMoralDTO(personaMoralDTO);
				   this.setActivarColegioValido(true);
				   
				   reactivacionColegioPage.setPersonaMoralBDTUDTO(personaMoralBDTUDTO);
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
		  this.reactivacionColegioPage.setValido(true);
		  return "reactivacion_acuse";
	}
	


	public ReactivacionColegioPage getReactivacionColegioPage() {
		return reactivacionColegioPage;
	}

	public void setReactivacionColegioPage(
			ReactivacionColegioPage reactivacionColegioPage) {
		this.reactivacionColegioPage = reactivacionColegioPage;
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
