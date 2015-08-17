package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.MedioContactoPage;

@ManagedBean(name = "menuContadorPublicoBean")
@ViewScoped
public class MedioContactoBean extends BaseBean{

	private static final long serialVersionUID = 7107693419877419759L;
	
	
	@ManagedProperty(value = "#{medioContactoPage}")
	private  MedioContactoPage  medioContactoPage;

	public void enviarRegistro(){
		
	}

}