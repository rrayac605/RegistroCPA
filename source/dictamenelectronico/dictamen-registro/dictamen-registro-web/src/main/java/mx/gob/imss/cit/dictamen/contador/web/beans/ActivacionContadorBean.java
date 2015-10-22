package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActivacionContadorPage;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;

@ManagedBean(name = "activacionContadorBean")
@ViewScoped
public class ActivacionContadorBean extends BaseBean {
	
	private static final long serialVersionUID = 6140756713835351053L;

	private static final Logger LOGGER = Logger.getLogger(ActivacionContadorBean.class);

	
	@ManagedProperty(value = "#{activacionContadorPage}")
	private ActivacionContadorPage activacionContadorPage;


	@EJB(mappedName="contadorPublicoIntegrator", name="contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;
	
	
	@PostConstruct
    public void init() {
    	
    	LOGGER.info("activacionContadorBean.init(");
       	String rfc = activacionContadorPage.getPersonaDTO().getRfc();
    	DomicilioFiscalDTO domicilioDTO = contadorPublicoIntegrator.consultarDomicilioPorRFC(rfc);
    	activacionContadorPage.getPersonaDTO().getContadorPublicoAutDTO().setDomicilioFiscalDTO(domicilioDTO);
    
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
