package mx.gob.imss.cit.de.dictaminacion.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.integration.api.ConsultaSATIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.EjercicioFiscalIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.PatronDictamenIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.TipoDictamenIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.EjercicioFiscalDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.TipoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DictamenPage;
import mx.gob.imss.cit.de.dictaminacion.web.util.CleanBeanUtil;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

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
	
	@ManagedProperty(value = "#{dictamenPage}")
	private DictamenPage dictamenPage;
	
	public void init(){
		
	
		try {
			
			
			
			CleanBeanUtil.cleanFields(datosPatronalesPage);
			
			//se obtienen catalogos
			datosPatronalesPage.setListaTipoDictamen(tipoDictamenIntegrator.findAll());
			datosPatronalesPage.setListaEjercicioFiscal(ejercicioFiscalIntegrator.findAll());
						
			inicializarPatron();
			inicializarEjercicioFiscal();
			
			dictamenPage.setIndexUltimoWizard(0);
			dictamenPage.setIndexWizard(0);
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			inhabilitaOpciones();
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_DATOS_PATRONALES.getCode());
		}
	}
	
	
	

	public void initExamen(){
		habilitaOpciones();
		calcularValuada();		
		dictamenPage.setIndexWizard(dictamenPage.getIndexUltimoWizard());
		
	}
	
	



	/**
	 * 
	 */
	private void inicializarPatron() {
		datosPatronalesPage.setDatosPatron(new PatronDictamenDTO());
	
		datosPatronalesPage.getDatosPatron().setCveIdTipoDictamen(new TipoDictamenDTO());
		datosPatronalesPage.getDatosPatron().setEmpresaValuada(false);
		datosPatronalesPage.getDatosPatron().setIndustriaConstruccion(false);
		datosPatronalesPage.getDatosPatron().setActConstruccionOregObra(false);			
		datosPatronalesPage.getDatosPatron().setCveIdEjerFiscal(new EjercicioFiscalDTO());
		datosPatronalesPage.setHabilitarEmpresaValuada(true);
	}
	
	private void inicializarEjercicioFiscal() throws DictamenNegocioException{
		EjercicioFiscalDTO ejerActual=ejercicioFiscalIntegrator.obtenerEjercicioFiscalActual(datosPatronalesPage.getListaEjercicioFiscal());
		datosPatronalesPage.getDatosPatron().setCveIdEjerFiscal(ejerActual);
		
	}
	
	public void calcularTipoDictamen(){
		int trabajadores=datosPatronalesPage.getDatosPatron().getNumTrabajadoresPromedio();
		TipoDictamenDTO tipoDictamenDTO=new TipoDictamenDTO();
		if(trabajadores<300){
			tipoDictamenDTO.setCveIdTipoDictamen(2L);
			datosPatronalesPage.getDatosPatron().setCveIdTipoDictamen(tipoDictamenDTO);
		}else{
			tipoDictamenDTO.setCveIdTipoDictamen(1L);
			datosPatronalesPage.getDatosPatron().setCveIdTipoDictamen(tipoDictamenDTO);

		}
		
	}
	
	public void calcularValuada(){
		boolean industria=datosPatronalesPage.getDatosPatron().getIndustriaConstruccion();
		
		if(industria){
			datosPatronalesPage.getDatosPatron().setEmpresaValuada(false);
			datosPatronalesPage.setHabilitarEmpresaValuada(false);
		}else{
			datosPatronalesPage.getDatosPatron().setEmpresaValuada(false);
			datosPatronalesPage.setHabilitarEmpresaValuada(true);
		}
		
	}
	
	

	public void buscar(){			
		//primero se intenta buscar si el dictamen ya fue dado de alta
		PatronDictamenDTO dictamenDTO=busquedaInterna();
		if(dictamenDTO==null){
			 busquedaSat();
		}else{
			
			datosPatronalesPage.setDatosPatron(dictamenDTO);
			habilitaOpciones();
			calcularValuada();		

		}	  
	}

	
	private PatronDictamenDTO busquedaInterna(){
		PatronDictamenDTO dictamenDTO=null;
		try {
			dictamenDTO=patronIntegration.getDatosPatron(datosPatronalesPage.getDatosPatron(), dictamenPage.getContadorPublicoAutDTO());
	
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			inicializarPatron();
			inhabilitaOpciones();
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
					FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_SAT.getCode(),datosPatronalesPage.getDatosPatron().getRfc());
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
		try {
			inicializarPatron();
			inhabilitaOpciones();
			inicializarEjercicioFiscal();
			dictamenPage.setIndexUltimoWizard(0);
			dictamenPage.setIndexWizard(0);
		} catch (DictamenNegocioException e) {
			LOG.error(e.getMessage(),e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_DATOS_PATRONALES_GET.getCode());		
		}				
	}
	

	
	private void inhabilitaOpciones(){
		dictamenPage.setBanderaOcultaTabs(true);
	}
	
	private void habilitaOpciones(){
		dictamenPage.setBanderaOcultaTabs(false);
	}
	

	public void guardar(){
		
		LOG.info("los datos a guardar son: ");
		try {
			if(datosPatronalesPage.getDatosPatron().getCveIdPatronDictamen()==null){
				LOG.info("nuevo registro ");
				patronIntegration.executeRegistrar(datosPatronalesPage.getDatosPatron(),dictamenPage.getContadorPublicoAutDTO());

			}else{
				LOG.info("se actualizara "+datosPatronalesPage.getDatosPatron().getCveIdPatronDictamen());
				patronIntegration.executeActualizar(datosPatronalesPage.getDatosPatron());

			}
			
			habilitaOpciones();
			FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_DATOS_PATRONALES.getCode());
		} catch (Exception e) {
			LOG.error(e.getMessage(),e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_DATOS_PATRONALES.getCode());
			inhabilitaOpciones();
		}
						
	}
		
	/**
	 * @param datosPatronPage the datosPatronPage to set
	 */
	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}



	/**
	 * @return the dictamenPage
	 */
	public DictamenPage getDictamenPage() {
		return dictamenPage;
	}



	/**
	 * @param dictamenPage the dictamenPage to set
	 */
	public void setDictamenPage(DictamenPage dictamenPage) {
		this.dictamenPage = dictamenPage;
	}



	/**
	 * @return the datosPatronalesPage
	 */
	public DatosPatronalesPage getDatosPatronalesPage() {
		return datosPatronalesPage;
	}




}
