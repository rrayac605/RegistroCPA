package mx.gob.imss.cit.dictamen.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.InformacionPatronalIntegrator;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.InformacionPatronalPage;
import mx.gob.imss.cit.dictamen.web.util.CleanBeanUtil;


@ManagedBean(name = "informacionPatronalBean")
@ViewScoped
public class InformacionPatronalBean extends BaseBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4609738385851814500L;
	
	@EJB
	private InformacionPatronalIntegrator informacionPatronalIntegrator;
	
	@ManagedProperty(value = "#{informacionPatronalPage}")
	private InformacionPatronalPage  informacionPatronalPage;
	
	public String init() {
		CleanBeanUtil.cleanFields(informacionPatronalPage);
		informacionPatronalPage.setListadoAseveraciones(informacionPatronalIntegrator.findListaAseveraciones());
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