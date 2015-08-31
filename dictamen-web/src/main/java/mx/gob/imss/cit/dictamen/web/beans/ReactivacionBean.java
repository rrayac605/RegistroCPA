package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.pages.ReactivacionPage;

import org.apache.log4j.Logger;

@ManagedBean(name = "reactivacionBean")
@ViewScoped
public class ReactivacionBean extends BaseBean {

	private static final Logger LOGGER = Logger.getLogger(ReactivacionBean.class);

	private static final long serialVersionUID = 7107693419877419759L;

	@ManagedProperty(value = "#{reactivacionPage}")
	private ReactivacionPage reactivacionPage;
	
	@ManagedProperty(value = "#{busquedaContadorBean}")
	private BusquedaContadorBean busquedaContadorBean;
	
	
	public String initReactivacion(){
		
		busquedaContadorBean.initBusquedaContador();
		
		return NavigationConstants.PAG_REACTIVACION_REGISTRO;
	}
	


	/**
	 * @return the busquedaContadorBean
	 */
	public BusquedaContadorBean getBusquedaContadorBean() {
		return busquedaContadorBean;
	}



	/**
	 * @param busquedaContadorBean the busquedaContadorBean to set
	 */
	public void setBusquedaContadorBean(BusquedaContadorBean busquedaContadorBean) {
		this.busquedaContadorBean = busquedaContadorBean;
	}



	/**
	 * @return the reactivacionPage
	 */
	public ReactivacionPage getReactivacionPage() {
		return reactivacionPage;
	}



	/**
	 * @param reactivacionPage the reactivacionPage to set
	 */
	public void setReactivacionPage(ReactivacionPage reactivacionPage) {
		this.reactivacionPage = reactivacionPage;
	}




}