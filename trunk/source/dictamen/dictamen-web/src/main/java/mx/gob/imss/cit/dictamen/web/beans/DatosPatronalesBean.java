package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.PatronIntegration;
import mx.gob.imss.cit.dictamen.integration.api.dto.DatosPatronDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.dictamen.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;

@ManagedBean(name = "datosPatronalesBean")
@ViewScoped
public class DatosPatronalesBean extends BaseBean {

	/**
	 * 
	 */
	
	@EJB
	private PatronIntegration  patronIntegration;
	
	private static final long serialVersionUID = 2825687007915597308L;

	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	public void init(){
		datosPatronalesPage.setDatosPatron(new DatosPatronDTO());
		datosPatronalesPage.setListaTipoDictamen(patronIntegration.findAllTipoDictamen());
	}
	
	

	public void buscar(){
		FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_EJEMPLO.getCode());
		FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_EJEMPLO2.getCode());
		FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_EJEMPLO3.getCode(),"uno");
		FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_EJEMPLO4.getCode()," hola","hola2");
	}
		
	/**
	 * @param datosPatronPage the datosPatronPage to set
	 */
	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}



}
