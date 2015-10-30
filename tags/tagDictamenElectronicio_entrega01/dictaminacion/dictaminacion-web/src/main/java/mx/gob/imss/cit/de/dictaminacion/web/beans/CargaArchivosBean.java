package mx.gob.imss.cit.de.dictaminacion.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.integration.api.BitacoraErroresIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.CargaArchivosIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.AseveracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.CargaDocumentoDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.LayoutDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.BitacoraErroresDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.web.constants.DictamenWebConstants;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CargaArchivosPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DictamenPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.InformacionPatronalPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.base.BasePage;
import mx.gob.imss.cit.de.dictaminacion.web.util.CleanBeanUtil;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

@ManagedBean(name = "cargaArchivosBean")
@ViewScoped
public class CargaArchivosBean extends BasePage {

	private static final long serialVersionUID = 2825687007915597308L;
	
	private Logger LOG=Logger.getLogger(CargaArchivosBean.class) ;
	
	@EJB
	private CargaArchivosIntegrator cargaArchivosIntegrator;
	
	@EJB
	private BitacoraErroresIntegrator bitacoraErroresIntegrator;
	
	@ManagedProperty(value = "#{cargaArchivosPage}")
	private CargaArchivosPage cargaArchivosPage;
	
	@ManagedProperty(value = "#{dictamenPage}")
	private DictamenPage dictamenPage;
	
	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	@ManagedProperty(value = "#{informacionPatronalBean}")
	private InformacionPatronalBean informacionPatronalBean;

	@ManagedProperty(value = "#{informacionPatronalPage}")
	private InformacionPatronalPage informacionPatronalPage;
	
	public void init(){
		LOG.info("init sin cargar datos");
		CleanBeanUtil.cleanFields(cargaArchivosPage);
		cargaArchivosPage.setListaParentLayout(new ArrayList<ParentLayoutDTO>());
	}
	
	public String initDictamen(){
		try {
			CleanBeanUtil.cleanFields(cargaArchivosPage);
			LOG.info("init una vez cragado el dictamen");
			LOG.info("rfc patron "+ datosPatronalesPage.getDatosPatron().getRfc());
			LOG.info("rfc contador "+dictamenPage.getContadorPublicoAutDTO().getRfc());
			LOG.info("año "+datosPatronalesPage.getDatosPatron().getCveIdEjerFiscal().getDesEjerFiscal());
			
			cargaArchivosPage.setListaParentLayout(cargaArchivosIntegrator.findLayout(
					datosPatronalesPage.getDatosPatron(),
					dictamenPage.getContadorPublicoAutDTO().getRfc()));

			
			LOG.info("el numero de aseveraciones es:"+cargaArchivosPage.getListaParentLayout().size());
			informacionPatronalBean.init();
			LOG.info("el numero de aseveraciones cargadas es:"+informacionPatronalPage.getListadoAseveraciones().size());
			consolidarLayoutCargados();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_LAYOUTS.getCode());
		}
		return "";
	}
	
	public void monitorArchivos(){
		LOG.info("verificando nuevo estatus de archivos");
		this.initDictamen();
		
		FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_MONITOR_ARCHIVOS.getCode());
	}
	
	private void consolidarLayoutCargados(){

		boolean cargado=false;
		String estado="";
		for (ParentLayoutDTO parentLayoutDTO : cargaArchivosPage.getListaParentLayout()) {
			for (LayoutDTO 	layoutDTO : parentLayoutDTO.getListaLayout()) {
				cargado=false;
				estado="Sin Subir";
				for (CargaDocumentoDTO cargaDocumentoDTO : informacionPatronalPage.getListadoAseveraciones()) {
					if(cargaDocumentoDTO.getCveIdAseveracion().getCveIdAseveracion().equals(layoutDTO.getIdLayout())){
						estado=cargaDocumentoDTO.getCveIdEstadoCargoDoc().getDesStatusCargaAseveraciones();			
						if(DictamenWebConstants.ASEVERACION_VALIDADO.equals(cargaDocumentoDTO.getCveIdEstadoCargoDoc().getDesStatusCargaAseveraciones())){
							cargado=true;
						}	
						break;
			
					}									
				}

				layoutDTO.setDesEstado(estado);					
				layoutDTO.setCargado(cargado);													
			}
			
		}
		
	}
	



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
			FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_SUBIR_LAYOUT.getCode());
			
		} catch (Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_GUARDAR_ASEVERACION.getCode());
		}
	}

	
	public void verBitacora(Long idCarga){
		
		
		try {
			List<BitacoraErroresDTO> lista=bitacoraErroresIntegrator.findByIdCargaDocumento(idCarga);
			
			if(lista==null ){
				cargaArchivosPage.setListaBitacora(new ArrayList<BitacoraErroresDTO>());
			}else{
				cargaArchivosPage.setListaBitacora(lista);
			}
			
		} catch (Exception e) {

			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_CONSULTAR_BITACORA.getCode());
			
		}
		
	}

	
	
	/**
	 * @param cargaArchivosPage the cargaArchivosPage to set
	 */
	public void setCargaArchivosPage(CargaArchivosPage cargaArchivosPage) {
		this.cargaArchivosPage = cargaArchivosPage;
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

	public void setInformacionPatronalPage(InformacionPatronalPage informacionPatronalPage) {
		this.informacionPatronalPage = informacionPatronalPage;
	}


}
