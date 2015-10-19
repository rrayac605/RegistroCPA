package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActivacionContadorPage;

@ManagedBean(name = "activacionContadorBean")
@ViewScoped
public class ActivacionContadorBean extends BaseBean {

	private static final long serialVersionUID = -6717550265551435161L;
	private static final Logger LOGGER=Logger.getLogger(ActivacionContadorBean.class);

	
	@ManagedProperty(value = "#{activacionContadorPage}")
	private ActivacionContadorPage activacionContadorPage;

	
	public String aceptacion(){
		LOGGER.info("Redirect=activacionContadorAceptacion");
	  return "activacionContadorAceptacion";
	}
	public ActivacionContadorPage getActivacionContadorPage() {
		return activacionContadorPage;
	}

	public void setActivacionContadorPage(
			ActivacionContadorPage activacionContadorPage) {
		this.activacionContadorPage = activacionContadorPage;
	}
	

}
