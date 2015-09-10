package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.dictamen.web.pages.DatosPatronPage;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;

@ManagedBean(name = "datosPatronBean")
@ViewScoped
public class DatosPatronBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2825687007915597308L;

	@ManagedProperty(value = "#{datosPatronPage}")
	private DatosPatronPage datosPatronPage;

	public void init(){

	}
	
	public void init(String rfc){
		
	}
	
	public void buscar(){
		FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_EJEMPLO.getCode());
		FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_EJEMPLO2.getCode());
		FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_EJEMPLO3.getCode(),"uno");
		FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_EJEMPLO4.getCode()," hola","hola2");
	}

	/**
	 * @return the datosPatronPage
	 */
	public DatosPatronPage getDatosPatronPage() {
		return datosPatronPage;
	}

	/**
	 * @param datosPatronPage the datosPatronPage to set
	 */
	public void setDatosPatronPage(DatosPatronPage datosPatronPage) {
		this.datosPatronPage = datosPatronPage;
	}
	
	
}
