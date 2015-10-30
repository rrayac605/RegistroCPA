package mx.gob.imss.cit.dictamen.contador.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.AcreditacionMembresiaPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.DatosPatronalesPage;


@ManagedBean(name = "acreditacionMembresiaBean")
@ViewScoped
public class AcreditacionMembresiaBean extends BaseBean {

	private static final long serialVersionUID = 5947288603317584630L;
	
	
	@ManagedProperty(value = "#{acreditacionMembresiaPage}")
	private AcreditacionMembresiaPage acreditacionMembresiaPage;

 
	
	
	
	public AcreditacionMembresiaPage getAcreditacionMembresiaPage() {
		return acreditacionMembresiaPage;
	}


	public void setAcreditacionMembresiaPage(
			AcreditacionMembresiaPage acreditacionMembresiaPage) {
		this.acreditacionMembresiaPage = acreditacionMembresiaPage;
	}
	
}
