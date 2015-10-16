package mx.gob.imss.cit.de.dictaminacion.web.beans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.integration.api.CargaArchivosIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.AseveracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.CargaDocumentoDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.LayoutDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CargaArchivosPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DictamenPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

@ManagedBean(name = "cargaArchivosBean")
@ViewScoped
public class CargaArchivosBean extends BasePage {

	private static final long serialVersionUID = 2825687007915597308L;
	
	private Logger LOG=Logger.getLogger(CargaArchivosBean.class) ;
	
	@EJB
	private CargaArchivosIntegrator cargaArchivosIntegrator;
	
	@ManagedProperty(value = "#{cargaArchivosPage}")
	private CargaArchivosPage cargaArchivosPage;
	
	@ManagedProperty(value = "#{dictamenPage}")
	private DictamenPage dictamenPage;
	
	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	@ManagedProperty(value = "#{informacionPatronalBean}")
	private InformacionPatronalBean informacionPatronalBean;
	
	@ManagedProperty(value = "#{cuestionarioBean}")
	private CuestionarioBean cuestionarioBean;
	
	public void init(){
		LOG.info("init sin cargar datos");
		cargaArchivosPage.setListaParentLayout(new ArrayList<ParentLayoutDTO>());
	}
	
	public String initDictamen(){
		try {

			LOG.info("init una vez cragado el dictamen");
			LOG.info("rfc patron "+ datosPatronalesPage.getDatosPatron().getRfc());
			LOG.info("rfc contador "+dictamenPage.getContadorPublicoAutDTO().getRfc());
			LOG.info("año "+datosPatronalesPage.getDatosPatron().getCveIdEjerFiscal().getDesEjerFiscal());
			
			cargaArchivosPage.setListaParentLayout(cargaArchivosIntegrator.findLayout(
					datosPatronalesPage.getDatosPatron(),
					dictamenPage.getContadorPublicoAutDTO().getRfc()));

			
			LOG.info("el numero de aseveraciones es:"+cargaArchivosPage.getListaParentLayout().size());
			
		} catch (DictamenNegocioException e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_LAYOUTS.getCode());
		}
		return "";
	}
	

	/**
	 * @param cargaArchivosPage the cargaArchivosPage to set
	 */
	public void setCargaArchivosPage(CargaArchivosPage cargaArchivosPage) {
		this.cargaArchivosPage = cargaArchivosPage;
	}

	/**
	 * 
	 */
	public void registrarEstatusCarga(LayoutDTO layoutDTO){
		PatronDictamenDTO patronDictamenDTO = new PatronDictamenDTO();
		patronDictamenDTO.setCveIdPatronDictamen(datosPatronalesPage.getDatosPatron().getCveIdPatronDictamen());
		
		CargaDocumentoDTO cargaAseveracionesDTO = new CargaDocumentoDTO();	
		AseveracionesDTO aseveracionesDTO=new AseveracionesDTO();
		aseveracionesDTO.setCveIdAseveracion(layoutDTO.getIdLayout());		
		
		cargaAseveracionesDTO.setCveIdAseveracion(aseveracionesDTO);
		cargaAseveracionesDTO.setCveIdPatronDictamen(datosPatronalesPage.getDatosPatron().getCveIdPatronDictamen());
		cargaAseveracionesDTO.setCveIdUsuario(datosPatronalesPage.getDatosPatron().getRfc());
		
		try {
			cargaArchivosIntegrator.registrarCargaAseveracion(cargaAseveracionesDTO);
			
			cuestionarioBean.init();
			informacionPatronalBean.init();
		} catch (DictamenNegocioException e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_GUARDAR_ASEVERACION.getCode());
		}
	}


	/**
	 * @param dictamenPage the dictamenPage to set
	 */
	public void setDictamenPage(DictamenPage dictamenPage) {
		this.dictamenPage = dictamenPage;
	}


	/**
	 * @param datosPatronalesPage the datosPatronalesPage to set
	 */
	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}

	public InformacionPatronalBean getInformacionPatronalBean() {
		return informacionPatronalBean;
	}

	public void setInformacionPatronalBean(InformacionPatronalBean informacionPatronalBean) {
		this.informacionPatronalBean = informacionPatronalBean;
	}

	public CuestionarioBean getCuestionarioBean() {
		return cuestionarioBean;
	}

	public void setCuestionarioBean(CuestionarioBean cuestionarioBean) {
		this.cuestionarioBean = cuestionarioBean;
	}


}
