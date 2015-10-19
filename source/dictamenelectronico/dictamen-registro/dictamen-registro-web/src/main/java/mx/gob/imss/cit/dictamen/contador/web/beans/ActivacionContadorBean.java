package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorPublicoIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActivacionContadorPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

@ManagedBean(name = "activacionContadorBean")
@ViewScoped
public class ActivacionContadorBean extends BaseBean {

	private static final long serialVersionUID = -6717550265551435161L;
	private static final Logger LOGGER=Logger.getLogger(ActivacionContadorBean.class);

	
	@ManagedProperty(value = "#{activacionContadorPage}")
	private ActivacionContadorPage activacionContadorPage;

	@EJB(mappedName="contadorPublicoIntegrator", name="contadorPublicoIntegrator")
	private ContadorPublicoIntegrator contadorPublicoIntegrator;
	
	


	public void init() {
	  
      String curp = (String) FacesUtils.getSessionMap().get("curp");
      String rfc = (String) FacesUtils.getSessionMap().get("rfc");

      LOGGER.info("CURP="+curp);
      LOGGER.info("rfc="+rfc);
      LOGGER.info("conexion.contadorPublicoIntegrator");
      PersonaDTO contadorPublicoDTOintegrator = contadorPublicoIntegrator.verificarContadorPublico(curp, rfc);
      if(contadorPublicoDTOintegrator!=null){
	    activacionContadorPage.setContadorPublicoDTO(contadorPublicoDTOintegrator);
        LOGGER.info("Nombre="+contadorPublicoDTOintegrator.getNombre());
      }
      
      
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
