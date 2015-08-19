package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.BusquedaColegioPage;


@ManagedBean(name = "busquedaContadorBean")
@ViewScoped
public class BusquedaColegioBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{busquedaContadorPage}")
	private BusquedaColegioPage  BusquedaColegioPage;

	public void enviarRegistro(){
		
	}

}
