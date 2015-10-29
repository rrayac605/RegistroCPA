package mx.gob.imss.cit.de.dictaminacion.web.beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.integration.api.CedulaRemuneracionesIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.CedulaRemuneracionesDTO;
import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.constants.NavigationConstants;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CedulaRemuneracionesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.ExamenPage;
import mx.gob.imss.cit.de.dictaminacion.web.util.CleanBeanUtil;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

@ManagedBean(name = "cedulaRemuneracionesBean")
@ViewScoped
public class CedulaRemuneracionesBean extends BaseBean{

	
	private static final long serialVersionUID = -289451842600132698L;
	
	/**
	 * El logger de la clase
	 */
	private Logger LOG = Logger.getLogger(CedulaRemuneracionesBean.class);
	
	@EJB
	CedulaRemuneracionesIntegrator cedulaRemuneracionesIntegrator;
	
	@ManagedProperty(value = "#{cedulaRemuneracionesPage}")
	private CedulaRemuneracionesPage cedulaRemuneracionesPage;
	
	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	
	public String init() {
		CleanBeanUtil.cleanFields(cedulaRemuneracionesPage);
		try {
			
			Map<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>> cedulasDTO=new HashMap<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>>();
			System.out.println("DatosPatronales: "+ datosPatronalesPage.getDatosPatron().getCveIdPatronDictamen());
			
//			cedulasDTO=cedulaRemuneracionesIntegrator.obtenerCedulaRemuneraciones(datosPatronalesPage.getDatosPatron());
//			if(cedulasDTO.size()>0){
//				cedulaRemuneracionesPage.setCedulasDTO(cedulasDTO);
//			}else{
				cedulasDTO=cedulaRemuneracionesIntegrator.generarCedulaRemuneraciones(datosPatronalesPage.getDatosPatron());
								
				cedulaRemuneracionesPage.setCedulasDTO(cedulasDTO);
			//}
			
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_DET_CEDULA.getCode());
		}
		return "";
	}
	
	/**
	 * Metodo que se encargara del guardado de las cedulas
	 */
	public void guardar(){
		Map<CedulaRemuneracionesDTO, List<CedulaRemuneracionesDTO>> cedulasRemuneraciones=cedulaRemuneracionesPage.getCedulasDTO();
		//System.out.println("cedulasREmuneracion a guardar"+cedulasRemuneraciones.size());
		try{
			cedulaRemuneracionesIntegrator.saveCedulaRemuneraciones(cedulasRemuneraciones);
			
			FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_GUARDAR_CEDULAS_REMUNERACION.getCode());
		}catch (Exception e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_GUARDAR_CEDULAS_REMUNERACION.getCode());
		}
		
	}
	/**
	 * Metodo para cancelar
	 * @return
	 */
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

	public DatosPatronalesPage getDatosPatronalesPage() {
		return datosPatronalesPage;
	}

	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}
	
	
	
}
