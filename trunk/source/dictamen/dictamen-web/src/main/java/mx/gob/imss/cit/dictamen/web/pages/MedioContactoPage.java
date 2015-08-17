package mx.gob.imss.cit.dictamen.web.pages;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;

@ManagedBean(name = "medioContactoPage")
@SessionScoped
public class MedioContactoPage extends BasePage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String medioContacto;
	private String descripcion;
	private String institucion;
	private String cedula;
	
	@PostConstruct
	public void init() {
		medioContacto="CORREO ELECTRÓNICO";
	}
	
	public String getMedioContacto() {
		return medioContacto;
	}
	public void setMedioContacto(String medioContacto) {
		this.medioContacto = medioContacto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
		
}