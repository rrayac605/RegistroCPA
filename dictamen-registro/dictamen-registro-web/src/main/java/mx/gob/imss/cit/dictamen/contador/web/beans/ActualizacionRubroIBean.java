package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.web.pages.ActualizacionRegistroPage;

import org.apache.log4j.Logger;

@ManagedBean(name = "actualizacionRubroIBean")
@ViewScoped
public class ActualizacionRubroIBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5931964711174511229L;
	private static final Logger LOG = Logger.getLogger(ActualizacionRubroIBean.class);
	
	@ManagedProperty(value="#{actualizacionRegistroPage}")
	private ActualizacionRegistroPage actualizacionRegistroPage;
	
	public ActualizacionRubroIBean(){		
		
		
	}
	
	public void habilitaPanelPersonales(){
		LOG.info("Entrando al  método habilitar panel");
		actualizacionRegistroPage.setHabilitaDatosPersonales(Boolean.TRUE);
	}

	public void habilitaEdicionDatos(){
		LOG.info("Entrando al método de habilitar botones de accion");
		this.actualizacionRegistroPage.setHabiliatrBotonesAccion(Boolean.TRUE);
	}
	
	public void salirEdicionDatos(){
		LOG.info("Entrando al método de cancelación de edición de datos");
		this.actualizacionRegistroPage.setHabiliatrBotonesAccion(Boolean.FALSE);
	}
	
	/**
	 * @return the actualizacionRegistroPage
	 */
	public ActualizacionRegistroPage getActualizacionRegistroPage() {
		return actualizacionRegistroPage;
	}

	/**
	 * @param actualizacionRegistroPage the actualizacionRegistroPage to set
	 */
	public void setActualizacionRegistroPage(
			ActualizacionRegistroPage actualizacionRegistroPage) {
		this.actualizacionRegistroPage = actualizacionRegistroPage;
	}
}
