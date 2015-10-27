package mx.gob.imss.cit.de.dictaminacion.web.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.CedulaRemuneracionesIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.constants.NavigationConstants;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CedulaRemuneracionesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.ExamenPage;
import mx.gob.imss.cit.de.dictaminacion.web.util.CleanBeanUtil;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

@ManagedBean(name = "cedulaRemuneracionesBean")
@ViewScoped
public class CedulaRemuneracionesBean extends BaseBean{

	
	private static final long serialVersionUID = -289451842600132698L;
	
	@EJB
	CedulaRemuneracionesIntegrator cedulaRemuneracionesIntegrator;
	
	@ManagedProperty(value = "#{cedulaRemuneracionesPage}")
	private CedulaRemuneracionesPage cedulaRemuneracionesPage;
	
	public String init() {
		CleanBeanUtil.cleanFields(cedulaRemuneracionesPage);
		try {
			
			List<CedulaRemuneracionesDTO> cedulasDTO;
			cedulasDTO=cedulaRemuneracionesIntegrator.obtenerCedulaRemuneraciones();
			System.out.println("CedulasDTO: "+cedulasDTO.size()
					+"\n-----Cedula1: \nTotal: "+cedulasDTO.get(0).getImpImportePagado()
			+"\nDescripcion: "+cedulasDTO.get(0).getCveIdRemuneraciones().getCveIdRemuneraciones());
			
			cedulaRemuneracionesPage.setCedulasDTO(cedulasDTO);
		} catch (Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_DET_CEDULA.getCode());
		}
		return "";
	}
	
	public String cancelar() {
		return NavigationConstants.PAGE_DICTAMINACION;
	}

	public CedulaRemuneracionesPage getCedulaRemuneracionesPage() {
		return cedulaRemuneracionesPage;
	}

	public void setCedulaRemuneracionesPage(
			CedulaRemuneracionesPage cedulaRemuneracionesPage) {
		this.cedulaRemuneracionesPage = cedulaRemuneracionesPage;
	}
	
	
	
}
