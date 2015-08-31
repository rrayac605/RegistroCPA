package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.BusquedaColegioPage;


@ManagedBean(name = "busquedaColegioBean")
@ViewScoped
public class BusquedaColegioBean extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{busquedaColegioPage}")
	private BusquedaColegioPage  busquedaColegioPage;

	public void enviarRegistro(){
		
	}

	/**
	 * @return the busquedaColegioPage
	 */
	public BusquedaColegioPage getBusquedaColegioPage() {
		return busquedaColegioPage;
	}

	/**
	 * @param busquedaColegioPage the busquedaColegioPage to set
	 */
	public void setBusquedaColegioPage(BusquedaColegioPage busquedaColegioPage) {
		this.busquedaColegioPage = busquedaColegioPage;
	}

}
