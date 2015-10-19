package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="actualizacionRegistroBean")
@RequestScoped
public class ActualizacionRegistroBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -640194701499340530L;
	
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombre;
	private String curp;
	private String registroImss;
	private String rfc;
	private boolean tieneRegistro;
	
	public ActualizacionRegistroBean(){
		this.apellidoPaterno = "RAMIREZ";
		this.apellidoMaterno = "DE LA ROSA";
		this.nombre = "LUIS";
		this.curp = "RARL860522HDF00SS0";
		this.rfc = "RARL860522EDF";
		this.registroImss = "ABCD1234EFG5678";
		// TODO validar CURP de inicio de sesión
		this.tieneRegistro = true;
		
	}
	
	
	
	/**
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	/**
	 * @param apellidoMaterno the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the curp
	 */
	public String getCurp() {
		return curp;
	}
	/**
	 * @param curp the curp to set
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}
	/**
	 * @return the registroImss
	 */
	public String getRegistroImss() {
		return registroImss;
	}
	/**
	 * @param registroImss the registroImss to set
	 */
	public void setRegistroImss(String registroImss) {
		this.registroImss = registroImss;
	}
	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return rfc;
	}
	/**
	 * @param rfc the rfc to set
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * @return the tieneRegistro
	 */
	public boolean isTieneRegistro() {
		return tieneRegistro;
	}

	/**
	 * @param tieneRegistro the tieneRegistro to set
	 */
	public void setTieneRegistro(boolean tieneRegistro) {
		this.tieneRegistro = tieneRegistro;
	}
	
}
