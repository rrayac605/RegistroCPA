package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.CargaArchivosIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.CargaDocumentoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.LayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.PatronDictamenDTO;
import mx.gob.imss.cit.dictamen.integration.api.exception.DictamenNegocioException;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.dictamen.web.pages.CargaArchivosPage;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;

@ManagedBean(name = "cargaArchivosBean")
@ViewScoped
public class CargaArchivosBean extends BaseBean {

	private static final long serialVersionUID = 2825687007915597308L;
	
	@EJB
	CargaArchivosIntegrator cargaArchivosIntegrator;
	
	@ManagedProperty(value = "#{cargaArchivosPage}")
	private CargaArchivosPage cargaArchivosPage;
	
	public void init(String anioEjercicio, String rfcUsuario, String rfcPatron){
		try {
			cargaArchivosPage.setListaParentLayout(cargaArchivosIntegrator.findLayout(anioEjercicio, rfcUsuario, rfcPatron));
		} catch (DictamenNegocioException e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_LAYOUTS.getCode());
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



}
