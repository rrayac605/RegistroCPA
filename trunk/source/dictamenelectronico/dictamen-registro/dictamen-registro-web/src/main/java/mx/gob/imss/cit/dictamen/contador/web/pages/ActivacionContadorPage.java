package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "activacionContadorPage")
@SessionScoped
public class ActivacionContadorPage implements Serializable {

	private static final long serialVersionUID = -8976265295241536809L;
	
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String curp;
	private String registroIMSS;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getRegistroIMSS() {
		return registroIMSS;
	}
	public void setRegistroIMSS(String registroIMSS) {
		this.registroIMSS = registroIMSS;
	}

	

}
