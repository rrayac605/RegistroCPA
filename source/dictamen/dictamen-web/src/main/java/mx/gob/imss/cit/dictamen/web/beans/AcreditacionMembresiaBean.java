package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.constants.NavigationConstants;
import mx.gob.imss.cit.dictamen.web.pages.AcreditacionMembresiaPage;

import org.apache.log4j.Logger;

@ManagedBean(name = "acreditacionMembresiaBean")
@ViewScoped
public class AcreditacionMembresiaBean extends BaseBean {

	private static final Logger LOGGER = Logger.getLogger(AcreditacionMembresiaBean.class);

	private static final long serialVersionUID = 7107693419877419759L;

	@ManagedProperty(value = "#{acreditacionMembresiaPage}")
	private AcreditacionMembresiaPage acreditacionMembresiaPage;
	
	
	public String initAcreditacionMembresia(){
		
		
		
		return NavigationConstants.PAG_ACREDITACION_MEMBRESIA;
	}


	/**
	 * @return the acreditacionMembresiaPage
	 */
	public AcreditacionMembresiaPage getAcreditacionMembresiaPage() {
		return acreditacionMembresiaPage;
	}


	/**
	 * @param acreditacionMembresiaPage the acreditacionMembresiaPage to set
	 */
	public void setAcreditacionMembresiaPage(
			AcreditacionMembresiaPage acreditacionMembresiaPage) {
		this.acreditacionMembresiaPage = acreditacionMembresiaPage;
	}
	



}