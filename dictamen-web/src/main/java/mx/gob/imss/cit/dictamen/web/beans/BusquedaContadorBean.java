package mx.gob.imss.cit.dictamen.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.BusquedaContadorPage;


@ManagedBean(name = "busquedaContadorBean")
@ViewScoped
public class BusquedaContadorBean extends BaseBean {


	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{busquedaContadorPage}")
	private BusquedaContadorPage  busquedaContadorPage;
	
	@ManagedProperty(value = "#{solicitudRegistroBean}")
	private SolicitudRegistroBean solicitudRegistroBean;

	public void initBusquedaContador(){
		
	}
	
	public String nextActivacionRegistro(){
		return solicitudRegistroBean.initActivacionSolicitudRegistro();
	}

	/**
	 * @return the busquedaContadorPage
	 */
	public BusquedaContadorPage getBusquedaContadorPage() {
		return busquedaContadorPage;
	}

	/**
	 * @param busquedaContadorPage the busquedaContadorPage to set
	 */
	public void setBusquedaContadorPage(BusquedaContadorPage busquedaContadorPage) {
		this.busquedaContadorPage = busquedaContadorPage;
	}

	/**
	 * @return the solicitudRegistroBean
	 */
	public SolicitudRegistroBean getSolicitudRegistroBean() {
		return solicitudRegistroBean;
	}

	/**
	 * @param solicitudRegistroBean the solicitudRegistroBean to set
	 */
	public void setSolicitudRegistroBean(SolicitudRegistroBean solicitudRegistroBean) {
		this.solicitudRegistroBean = solicitudRegistroBean;
	}


}