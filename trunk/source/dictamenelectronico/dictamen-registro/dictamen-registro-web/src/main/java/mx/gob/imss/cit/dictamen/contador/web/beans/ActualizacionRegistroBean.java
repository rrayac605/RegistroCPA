package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import mx.gob.imss.cit.dictamen.contador.web.pages.ActualizacionRegistroPage;

import org.apache.commons.lang.StringUtils;
import org.primefaces.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name="actualizacionRegistroBean")
@RequestScoped
public class ActualizacionRegistroBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -640194701499340530L;
	private static final Logger LOGGER = LoggerFactory.getLogger(ActualizacionRegistroBean.class);

	private static final String MENSAJE_ERROR_REGISTRO = "#{msg['message.actualizacion.registroinvalido']}";
	
	@ManagedProperty(value="#{actualizacionRegistroPage}")
	private ActualizacionRegistroPage actualizacionRegistroPage;
	
	public ActualizacionRegistroBean(){
		
	}
	
	public void habilitaPanelPersonales(){
		LOGGER.info("Entrando al  método habilitar panel");
		actualizacionRegistroPage.setHabilitaDatosPersonales(Boolean.TRUE);
	}

	public void habilitaEdicionDatos(){
		LOGGER.info("Entrando al método de habilitar botones de accion");
		this.actualizacionRegistroPage.setHabiliatrBotonesAccion(Boolean.TRUE);
	}
	
	public void salirEdicionDatos(){
		LOGGER.info("Entrando al método de cancelación de edición de datos");
		this.actualizacionRegistroPage.setHabiliatrBotonesAccion(Boolean.FALSE);
	}
	
	public void busquedaRegistroImss(ActionEvent event){
		LOGGER.info("Entrando a la búsqueda del registro IMSS");
		//TODO realizar busqueda del registro
		boolean registro = StringUtils.isNotEmpty(this.actualizacionRegistroPage.getRegImssBusqueda());
		this.actualizacionRegistroPage.setExisteRegistroImss(registro);
		if(!registro){
			RequestContext.getCurrentInstance().execute("dialogBusqueda.show();dialogMensajes.show();");
			FacesContext context = FacesContext.getCurrentInstance();
			this.actualizacionRegistroPage.setMensajesPrevios(context.getApplication().evaluateExpressionGet(context, MENSAJE_ERROR_REGISTRO, String.class));
		}
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
