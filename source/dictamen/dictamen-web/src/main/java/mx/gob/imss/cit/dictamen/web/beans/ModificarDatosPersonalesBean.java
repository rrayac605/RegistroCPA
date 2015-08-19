package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.ModificarDatosPersonalesPage;

@ManagedBean(name = "modificarDatosPersonalesBean")
@ViewScoped
public class ModificarDatosPersonalesBean extends BaseBean {


	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{modificarDatosPersonalesPage}")
	private  ModificarDatosPersonalesPage  modificarDatosPersonalesPage;

	public void enviarRegistro(){
		
	}


}
