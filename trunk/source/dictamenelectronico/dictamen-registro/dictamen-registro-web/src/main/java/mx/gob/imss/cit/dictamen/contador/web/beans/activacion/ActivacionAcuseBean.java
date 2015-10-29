package mx.gob.imss.cit.dictamen.contador.web.beans.activacion;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaMoralDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.navigation.ActivacionNavigation;
import mx.gob.imss.cit.dictamen.contador.web.pages.activacion.ActivacionColegioPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.activacion.ActivacionDespachoPage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name = "activacionAcuseBean")
@ViewScoped
public class ActivacionAcuseBean extends BaseBean{

	private static final long serialVersionUID = -7431536406907320285L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ActivacionAcuseBean.class);
    
	private boolean activarFirmaElectronicaDialog=false;
	
	@ManagedProperty(value = "#{activacionColegioPage}")
	private ActivacionColegioPage activacionColegioPage;
	
	
	@PostConstruct
	public void init(){
		this.setVentanaInicio(ActivacionNavigation.ACTIVACION_SOLICITUD);
        if(this.activacionColegioPage.isValido()){
		  PersonaMoralDTO personaMoralDTO = new PersonaMoralDTO();
		  DomicilioFiscalDTO domicilioFiscalDTO = new DomicilioFiscalDTO();
		  personaMoralDTO.setDomicilioFiscalDTO(domicilioFiscalDTO);
		  activacionColegioPage.setPersonaMoralDTO(personaMoralDTO);
		}
	}
	
	public String firma;
	
	
	public String accionInicio(){
		
		  this.activacionColegioPage.setValido(false);
		  return this.getVentanaInicio();
	
	}
	
	
	
 	public void accionFirmar(){
		LOGGER.info("FIRMA="+firma);
	}
 	public void accionFirmaElectronica(){
 	    this.setActivarFirmaElectronicaDialog(true);
 	}
	public String getFirma() {
		return firma;
	}

 
	public void setFirma(String firma) {
		this.firma = firma;
	}



	

	public String accionSiguiente(){
	      return "activacion_firma";
	}

	public String accionAtras(){
		  return "activacion_colegio";
	}
	

	public boolean isActivarFirmaElectronicaDialog() {
		return activarFirmaElectronicaDialog;
	}

	public void setActivarFirmaElectronicaDialog(
			boolean activarFirmaElectronicaDialog) {
		this.activarFirmaElectronicaDialog = activarFirmaElectronicaDialog;
	}
	

    public ActivacionColegioPage getActivacionColegioPage() {
		return activacionColegioPage;
	}
	public void setActivacionColegioPage(ActivacionColegioPage activacionColegioPage) {
		this.activacionColegioPage = activacionColegioPage;
	}


}
