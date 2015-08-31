package mx.gob.imss.cit.dictamen.web.pages;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;


@ManagedBean(name = "busquedaColegioPage")
@SessionScoped
public class BusquedaColegioPage extends BasePage {
	
	private static final long serialVersionUID = 1L;
	
	private String rfc;
	private String rfcr;
	private String razonSocial;
	
	
	@PostConstruct
	public void init() {
		
	}
	
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getRfcr() {
		return rfcr;
	}
	public void setRfcr(String rfcr) {
		this.rfcr = rfcr;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
