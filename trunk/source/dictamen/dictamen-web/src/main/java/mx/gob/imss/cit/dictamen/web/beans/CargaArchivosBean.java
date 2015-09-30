package mx.gob.imss.cit.dictamen.web.beans;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.CargaArchivosIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.CargaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.LayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.dictamen.web.pages.CargaArchivosPage;
import mx.gob.imss.cit.dictamen.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.dictamen.web.pages.DictamenPage;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;

import org.apache.log4j.Logger;

@ManagedBean(name = "cargaArchivosBean")
@ViewScoped
public class CargaArchivosBean extends BaseBean {

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
	
	public void init(){
		LOG.info("init sin cargar datos");
		cargaArchivosPage.setListaParentLayout(new ArrayList<ParentLayoutDTO>());
	}
	
	public String initDictamen(){
		try {
			LOG.info("init una vez cragado el dictamen");
			LOG.info("rfc patron "+ datosPatronalesPage.getDatosPatron().getRfc());
			LOG.info("rfc contador "+dictamenPage.getContadorPublicoAutDTO().getRfc());
			LOG.info("año "+datosPatronalesPage.getDatosPatron().getEjercicioDictaminarDesc());
			
			if(!dictamenPage.isBanderaOcultaTabs()){
				cargaArchivosPage.setListaParentLayout(cargaArchivosIntegrator.findLayout(datosPatronalesPage.getDatosPatron().getEjercicioDictaminarDesc(),
						dictamenPage.getContadorPublicoAutDTO().getRfc(), datosPatronalesPage.getDatosPatron().getRfc()));
			}
			
		} catch (DictamenNegocioException e) {
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
		patronDictamenDTO.setCveIdPatronDictamen(63l);
		
		CargaDocumentoDTO cargaAseveracionesDTO = new CargaDocumentoDTO();		
		cargaAseveracionesDTO.setCveIdAseveracion(layoutDTO.getIdLayout().intValue());
		cargaAseveracionesDTO.setCveIdPatronDictamen(63l);
		cargaAseveracionesDTO.setCveIdUsuario("289435511");
		try {
			cargaArchivosIntegrator.registrarCargaAseveracion(cargaAseveracionesDTO);
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



}
