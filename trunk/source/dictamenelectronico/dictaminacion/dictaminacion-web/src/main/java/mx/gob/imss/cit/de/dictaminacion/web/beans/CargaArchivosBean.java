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
import mx.gob.imss.cit.de.dictaminacion.web.constants.DictamenWebConstants;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CargaArchivosPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DictamenPage;
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
	
	@ManagedProperty(value = "#{cargaArchivosPage}")
	private CargaArchivosPage cargaArchivosPage;
	
	@ManagedProperty(value = "#{dictamenPage}")
	private DictamenPage dictamenPage;
	
	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	@ManagedProperty(value = "#{informacionPatronalBean}")
	private InformacionPatronalBean informacionPatronalBean;

	
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
			consolidarLayoutCargados();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_LAYOUTS.getCode());
		}
		return "";
	}
	
	private void consolidarLayoutCargados(){

		boolean encontrado=false;
		for (ParentLayoutDTO parentLayoutDTO : cargaArchivosPage.getListaParentLayout()) {
			for (LayoutDTO layoutDTO : parentLayoutDTO.getListaLayout()) {
				encontrado=false;
				for (CargaDocumentoDTO cargaDocumentoDTO : informacionPatronalBean.getInformacionPatronalPage().getListadoAseveraciones()) {
					System.out.println(cargaDocumentoDTO.getCveIdAseveracion().getCveIdAseveracion()+"="+layoutDTO.getIdLayout());
					if(cargaDocumentoDTO.getCveIdAseveracion().getCveIdAseveracion().equals(layoutDTO.getIdLayout())){
						encontrado=true;
						layoutDTO.setDesEstado(cargaDocumentoDTO.getCveIdEstadoCargoDoc().getDesStatusCargaAseveraciones());
						System.out.println(layoutDTO.getDesEstado());
						
						if(layoutDTO.getDesEstado().equals(DictamenWebConstants.ASEVERACION_VALIDADO)){
							layoutDTO.setCargado(true);
						}else{
							layoutDTO.setCargado(false);
						}
						break;
					}
									
				}
				System.out.println("encontrado:"+encontrado);
				if(!encontrado){
					layoutDTO.setDesEstado("Sin cargar");
					layoutDTO.setCargado(false);
				}
				
					
			}
			
		}
		

		
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


}
