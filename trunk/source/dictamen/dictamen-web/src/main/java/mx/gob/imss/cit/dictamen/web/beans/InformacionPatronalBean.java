package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.CargaArchivosIntegrator;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.dictamen.web.pages.InformacionPatronalPage;
import mx.gob.imss.cit.dictamen.web.util.CleanBeanUtil;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;

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
	
	public String init() {
		CleanBeanUtil.cleanFields(informacionPatronalPage);
		try {
			informacionPatronalPage.setListadoAseveraciones(cargaArchivosIntegrator.findCvePatronEstadoAseveracion(63L, 778L, "CIT970206HB6"));
			
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
}