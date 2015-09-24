package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.ConsultaSATIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.EjercicioFiscalIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.PatronDictamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.TipoDictamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
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
	
	@EJB
	private TipoDictamenIntegrator tipoDictamenIntegrator;

	
	@EJB
	private ConsultaSATIntegrator consultaSATIntegrator;
	
	private static final long serialVersionUID = 2825687007915597308L;

	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	public void init(){
		CleanBeanUtil.cleanFields(datosPatronalesPage);
		datosPatronalesPage.setDatosPatron(new PatronDictamenDTO());
		try {
			datosPatronalesPage.setListaTipoDictamen(tipoDictamenIntegrator.findAll());
			datosPatronalesPage.setListaEjercicioFiscal(ejercicioFiscalIntegrator.findAll());
		} catch (Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_DATOS_PATRONALES.getCode());
		}
	}
	
	

	public void buscar(){
		
		try {
			
			String razonSocial=consultaSATIntegrator.getPatron(datosPatronalesPage.getDatosPatron().getRfc());
			
			if(razonSocial==null){
				FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_SAT_NO_ENCONTRADO.getCode(),datosPatronalesPage.getDatosPatron().getRfc());
			}else{
				datosPatronalesPage.getDatosPatron().setRazonSocialNombre(razonSocial);
			}
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			datosPatronalesPage.getDatosPatron().setRazonSocialNombre("");
			datosPatronalesPage.getDatosPatron().setRfc("");
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_SAT_EXCEPCION.getCode());
		}
		


	}
	
	public void limpiar(){
		CleanBeanUtil.cleanFields(datosPatronalesPage);
		
	}
	
	public void guardar(){
		
		LOG.info("los datos a guardar son: ");
		try {
			patronIntegration.executeRegistrar(datosPatronalesPage.getDatosPatron());
		} catch (Exception e) {
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
