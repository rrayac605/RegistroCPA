package mx.gob.imss.cit.dictamen.ventanilla.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;




import mx.gob.imss.cit.dictamen.ventanilla.web.pages.SolicitudPage;

@ManagedBean(name = "dictamenBean")
@ViewScoped
public class DictamenBean  {
	
	private static final long serialVersionUID = -614637897623862471L;
		
	public String getSolicitudPage() {
		return solicitudPage;
	}


	public void setSolicitudPage(String solicitudPage) {
		this.solicitudPage = solicitudPage;
	}


	public String getDatosPatronalesPage() {
		return datosPatronalesPage;
	}


	public void setDatosPatronalesPage(String datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}


	@ManagedProperty(value = "#{dictamenPage}")
	private String solicitudPage;
	
	@ManagedProperty(value = "#{datosPatronalesBean}")
	private String datosPatronalesPage;

	
	public String init(){
		
		return null;
	}


}
