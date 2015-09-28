package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.ConsultaSATIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.EjercicioFiscalIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.PatronDictamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.TipoDictamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.ContadorPublicoAutDTO;
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
	
	public void init(Long idContador){
		
	
		try {
			//se obtienen catalogos
			datosPatronalesPage.setListaTipoDictamen(tipoDictamenIntegrator.findAll());
			datosPatronalesPage.setListaEjercicioFiscal(ejercicioFiscalIntegrator.findAll());
						
			CleanBeanUtil.cleanFields(datosPatronalesPage);
			inicializarPatron();
			
			datosPatronalesPage.setContadorPublicoAutDTO(new ContadorPublicoAutDTO());
			datosPatronalesPage.getContadorPublicoAutDTO().setCveIdCpa(idContador);

		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_DATOS_PATRONALES.getCode());
		}
	}



	/**
	 * 
	 */
	private void inicializarPatron() {
		datosPatronalesPage.setDatosPatron(new PatronDictamenDTO());
		datosPatronalesPage.getDatosPatron().setEmpresaValuada(false);
		datosPatronalesPage.getDatosPatron().setIndustriaConstruccion(false);
		datosPatronalesPage.getDatosPatron().setActConstruccionOregObra(false);
	}
	
	

	public void buscar(){			
		//primero se intenta buscar si el dictamen ya fue dado de alta
		PatronDictamenDTO dictamenDTO=busquedaInterna();
		if(dictamenDTO==null){
			 busquedaSat();
		}else{
			datosPatronalesPage.setDatosPatron(dictamenDTO);
		}	  
	}

	
	private PatronDictamenDTO busquedaInterna(){
		PatronDictamenDTO dictamenDTO=null;
		try {
			dictamenDTO=patronIntegration.getDatosPatron(datosPatronalesPage.getDatosPatron(), datosPatronalesPage.getContadorPublicoAutDTO());
	
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			inicializarPatron();
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_DATOS_PATRONALES_GET.getCode());
		}
		
		return dictamenDTO;
	}


	/**
	 * 
	 */
	private void busquedaSat() {
		try {	
			
			if(!"".equals(datosPatronalesPage.getDatosPatron().getRfc())){
				String razonSocial=consultaSATIntegrator.getPatron(datosPatronalesPage.getDatosPatron().getRfc());
				
				if(razonSocial==null ||"".equals(razonSocial)){
					FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_SAT_NO_ENCONTRADO.getCode(),datosPatronalesPage.getDatosPatron().getRfc());
					inicializarPatron();
				}else{
					LOG.info("la razon social es: "+razonSocial);
					datosPatronalesPage.getDatosPatron().setRazonSocialNombre(razonSocial);
				}
			}
			
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			inicializarPatron();
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_SAT_EXCEPCION.getCode());
		}
	}
	
	public void limpiar(){
		CleanBeanUtil.cleanFields(datosPatronalesPage);
		
	}
	
	public void guardar(){
		
		LOG.info("los datos a guardar son: ");
		try {
			if(datosPatronalesPage.getDatosPatron().getCveIdPatronDictamen()==null){
				patronIntegration.executeRegistrar(datosPatronalesPage.getDatosPatron(),datosPatronalesPage.getContadorPublicoAutDTO());
			}else{
				patronIntegration.executeActualizar(datosPatronalesPage.getDatosPatron(),datosPatronalesPage.getContadorPublicoAutDTO());
			}
			
			FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_DATOS_PATRONALES.getCode());
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_DATOS_PATRONALES.getCode());
		}
						
	}
		
	/**
	 * @param datosPatronPage the datosPatronPage to set
	 */
	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}



}
