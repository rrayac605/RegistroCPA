package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.pages.ActivacionPage;

import org.apache.log4j.Logger;

@ManagedBean(name = "activacionBean")
@ViewScoped
public class ActivacionBean extends BaseBean {

	private static final Logger LOGGER = Logger.getLogger(ActivacionBean.class);

	private static final long serialVersionUID = 7107693419877419759L;

	@ManagedProperty(value = "#{activacionPage}")
	private ActivacionPage activacionPage;
	
	@ManagedProperty(value = "#{busquedaContadorBean}")
	private BusquedaContadorBean busquedaContadorBean;
	
	
	public String initActivacion(){
		
		busquedaContadorBean.initBusquedaContador();
		
		return NavigationConstants.PAG_ACTIVACION_REGISTRO;
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
	 * @return the activacionPage
	 */
	public ActivacionPage getActivacionPage() {
		return activacionPage;
	}



	/**
	 * @param activacionPage the activacionPage to set
	 */
	public void setActivacionPage(ActivacionPage activacionPage) {
		this.activacionPage = activacionPage;
	}

}