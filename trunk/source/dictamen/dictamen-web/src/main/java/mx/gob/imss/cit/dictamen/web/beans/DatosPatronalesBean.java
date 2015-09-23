package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.EjercicioFiscalIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.PatronDictamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
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
	private PatronDictamenIntegrator  patronIntegration;

	@EJB
	private EjercicioFiscalIntegrator ejercicioFiscalIntegrator;
	
	private static final long serialVersionUID = 2825687007915597308L;

	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	public void init(){
		CleanBeanUtil.cleanFields(datosPatronalesPage);
		datosPatronalesPage.setDatosPatron(new PatronDictamenDTO());
		try {
			datosPatronalesPage.setListaTipoDictamen(patronIntegration.findAllTipoDictamen());
			datosPatronalesPage.setListaEjercicioFiscal(ejercicioFiscalIntegrator.findAll());
		} catch (DictamenNegocioException e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_DATOS_PATRONALES.getCode());
		}
	}
	
	

	public void buscar(){
		FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_EJEMPLO2.getCode());


	}
	
	public void limpiar(){
		CleanBeanUtil.cleanFields(datosPatronalesPage);
		
	}
	
	public void guardar(){
		
		LOG.info("los datos a guardar son: ");
		try {
			patronIntegration.executeRegistrar(datosPatronalesPage.getDatosPatron());
		} catch (DictamenNegocioException e) {
			LOG.error(e.getMessage(),e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_DATOS_PATRONALES.getCode());
		}
		
		FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_DATOS_PATRONALES.getCode());
		
	}
		
	/**
	 * @param datosPatronPage the datosPatronPage to set
	 */
	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}



}
