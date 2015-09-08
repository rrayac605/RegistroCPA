package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.DatosPatronPage;

@ManagedBean(name = "datosPatronBean")
@ViewScoped
public class DatosPatronBean extends BaseBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2825687007915597308L;

	@ManagedProperty(value = "#{datosPatronPage}")
	private DatosPatronPage datosPatronPage;

	public void init(){
		
	}
	
	public void init(String rfc){
		
	}
}
