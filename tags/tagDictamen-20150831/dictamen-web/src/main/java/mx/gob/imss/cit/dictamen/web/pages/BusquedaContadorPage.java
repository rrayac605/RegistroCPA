package mx.gob.imss.cit.dictamen.web.pages;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;



@ManagedBean(name = "busquedaContadorPage")
@SessionScoped
public class BusquedaContadorPage extends BasePage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String curp;
	private String nombre;
	private String paterno;
	private String materno;
	private String numRegistro;
	
	
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getNumRegistro() {
		return numRegistro;
	}
	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
