package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.integration.api.ExamenIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.domain.AtestiguamientoDictamenDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.dictamen.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.dictamen.web.pages.ExamenPage;
import mx.gob.imss.cit.dictamen.web.util.CleanBeanUtil;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;


@ManagedBean(name = "examenBean")
@ViewScoped
public class ExamenBean extends BaseBean {
	

	private Logger LOG=Logger.getLogger(ExamenBean.class) ;

	private static final long serialVersionUID = 8959012133116263535L;
	@EJB
	private ExamenIntegrator examenIntegration;
	
	@ManagedProperty(value = "#{examenPage}")
	private ExamenPage  examenPage;
	
	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	
	public	String init(AtestiguamientoDictamenDTO examenDTO) {
		CleanBeanUtil.cleanFields(examenPage);
		try {
			examenPage.setAtestiguamientoDTO(examenIntegration.getDetalleExamenByAtestiguamiento(examenDTO.getCveIdAtestiguamiento().getCveIdAtestiguamiento()));
		} catch (Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_DET_EXAMEN.getCode());
		}
		return "";
	}

	public String regresar(){	
		return NavigationConstants.PAGE_EXAMEN_REGRESAR;
	}
	
	public void guardar(AtestiguamientoDTO atestiguamientoDTO){	
		try {
			examenIntegration.getSaveExamenAtestiguamiento(atestiguamientoDTO, datosPatronalesPage.getDatosPatron());
			LOG.info("Atestiguamiento guardado"+ atestiguamientoDTO.getDesAtestiguamiento() );
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_GUARDAR_EL_ATESTIGUAMIENTO.getCode());
		}
	}

	public ExamenPage getExamenPage() {
		return examenPage;
	}

	public void setExamenPage(ExamenPage examenPage) {
		this.examenPage = examenPage;
	}
	
	public DatosPatronalesPage getDatosPatronalesPage() {
		return datosPatronalesPage;
	}

	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}
	
}
