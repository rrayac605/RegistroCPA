package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.BienvenidaPage;

@ManagedBean(name = "bienvenidaBean")
@ViewScoped
public class BienvenidaBean extends BaseBean{

	private static final long serialVersionUID = 7107693419877419759L;
	
	
	@ManagedProperty(value = "#{bienvenidaPage}")
	private  BienvenidaPage  bienvenidaPage;

	public void enviarRegistro(){
		
	}

}