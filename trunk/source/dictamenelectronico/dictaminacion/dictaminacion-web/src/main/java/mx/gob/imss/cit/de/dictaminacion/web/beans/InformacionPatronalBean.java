package mx.gob.imss.cit.de.dictaminacion.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.de.dictaminacion.integration.api.CargaArchivosIntegrator;
import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DictamenPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.InformacionPatronalPage;
import mx.gob.imss.cit.de.dictaminacion.web.util.CleanBeanUtil;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

import org.apache.log4j.Logger;


@ManagedBean(name = "informacionPatronalBean")
@ViewScoped
public class InformacionPatronalBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4609738385851814500L;
	
	private static final Logger LOG=Logger.getLogger(InformacionPatronalBean.class);
	
	@EJB
	private CargaArchivosIntegrator cargaArchivosIntegrator;
	
	@ManagedProperty(value = "#{informacionPatronalPage}")
	private InformacionPatronalPage  informacionPatronalPage;
	
	@ManagedProperty(value = "#{dictamenPage}")
	private DictamenPage dictamenPage;

	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	public String init() {
		CleanBeanUtil.cleanFields(informacionPatronalPage);
		try {
			informacionPatronalPage.setListadoAseveraciones(cargaArchivosIntegrator.findCvePatronEstadoAseveracion(datosPatronalesPage.getDatosPatron().getCveIdPatronDictamen(), dictamenPage.getContadorPublicoAutDTO().getCveIdCpa(), datosPatronalesPage.getDatosPatron().getRfc()));

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_OBTENER_LAYOUTS.getCode());
		}
		return "";
	}
	

	/**
	 * @return the informacionPatronalPage
	 */
	public InformacionPatronalPage getInformacionPatronalPage() {
		return informacionPatronalPage;
	}
	
	/**
	 * @param informacionPatronalPage the informacionPatronalPage to set
	 */
	public void setInformacionPatronalPage(
			InformacionPatronalPage informacionPatronalPage) {
		this.informacionPatronalPage = informacionPatronalPage;
	}

	/**
	 * @return the datosPatronalesPage
	 */
	public DatosPatronalesPage getDatosPatronalesPage() {
		return datosPatronalesPage;
	}

	/**
	 * @param datosPatronalesPage the datosPatronalesPage to set
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



}