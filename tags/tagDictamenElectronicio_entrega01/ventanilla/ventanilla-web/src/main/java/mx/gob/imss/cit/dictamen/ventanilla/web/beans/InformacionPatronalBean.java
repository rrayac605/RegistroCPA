package mx.gob.imss.cit.dictamen.ventanilla.web.beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;



import org.apache.log4j.Logger;


@ManagedBean(name = "informacionPatronalBean")
@ViewScoped
public class InformacionPatronalBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4609738385851814500L;
	
	private static final Logger LOG=Logger.getLogger(InformacionPatronalBean.class);
	

	
	@ManagedProperty(value = "#{informacionPatronalPage}")
	private String  informacionPatronalPage;
	
	public String init() {

		return "";
	}
	
	/**
	 * @return the informacionPatronalPage
	 */
	public String getInformacionPatronalPage() {
		return informacionPatronalPage;
	}
	
	/**
	 * @param informacionPatronalPage the informacionPatronalPage to set
	 */
	public void setInformacionPatronalPage(
			String informacionPatronalPage) {
		this.informacionPatronalPage = informacionPatronalPage;
	}
}