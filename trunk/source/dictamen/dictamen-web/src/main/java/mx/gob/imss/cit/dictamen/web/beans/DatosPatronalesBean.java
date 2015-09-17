package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.PatronIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.DatosPatronDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.dictamen.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.dictamen.web.util.CleanBeanUtil;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;

import org.apache.log4j.Logger;

@ManagedBean(name = "datosPatronalesBean")
@ViewScoped
public class DatosPatronalesBean extends BaseBean {

	private Logger LOG=Logger.getLogger(DatosPatronalesBean.class) ;
	
	@EJB
	private PatronIntegrator  patronIntegration;
	
	private static final long serialVersionUID = 2825687007915597308L;

	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	public void init(){
		CleanBeanUtil.cleanFields(datosPatronalesPage);
		datosPatronalesPage.setDatosPatron(new DatosPatronDTO());
		datosPatronalesPage.setListaTipoDictamen(patronIntegration.findAllTipoDictamen());
	}
	
	

	public void buscar(){
		FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_EJEMPLO2.getCode());


	}
	
	public void limpiar(){
		CleanBeanUtil.cleanFields(datosPatronalesPage);
		
	}
	
	public void guardar(){
		
		LOG.info("los datos a guardar son: ");
		LOG.info(datosPatronalesPage.getDatosPatron().getRazonSocialNombre());
		FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_DATOS_PATRONALES.getCode());

		
	}
		
	/**
	 * @param datosPatronPage the datosPatronPage to set
	 */
	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}



}
