package mx.gob.imss.cit.dictamen.web.pages;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;

@ManagedBean(name = "capturaDespachoContadorPage")
@SessionScoped
public class CapturaDespachoContadorPage extends BasePage{

	private static final long serialVersionUID = 1L;
	
	private String prgt3;
	private String telefono;
	private String rfc;
	private String rfcr;
	private String razonSocial;
	private String regPatronal;
	
	
	@PostConstruct
	public void init() {
		
	}
	
	
	public String getPrgt3() {
		return prgt3;
	}
	public void setPrgt3(String prgt3) {
		this.prgt3 = prgt3;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	public String getRegPatronal() {
		return regPatronal;
	}
	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
