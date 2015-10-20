package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name = "actualizacionRegistroPage")
@SessionScoped
public class ActualizacionRegistroPage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8517130890030075220L;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombre;
	private String curp;
	private String registroImss;
	private String rfc;
	private boolean tieneRegistro;
//	private NdvContadorPublicoAutDTO	 contadorPublicoAut;
	private boolean habilitaDatosPersonales;
	private boolean habiliatrBotonesAccion;
	private String regImssBusqueda;
	private boolean modalBusquedaVisible;
	private boolean existeRegistroImss;
	private String mensajesPrevios;
	
	public ActualizacionRegistroPage(){
		this.apellidoPaterno = "RAMIREZ";
		this.apellidoMaterno = "DE LA ROSA";
		this.nombre = "LUIS";
		this.curp = "RARL860522HDF00SS0";
		this.rfc = "RARL860522EDF";
		this.registroImss = "ABCD1234EFG5678";
		this.habilitaDatosPersonales = Boolean.FALSE;
		this.habiliatrBotonesAccion=Boolean.TRUE;
		this.modalBusquedaVisible = Boolean.TRUE;
		this.tieneRegistro = Boolean.TRUE;
		this.existeRegistroImss = Boolean.FALSE;
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
	
	/**
	 * @return the habilitaDatosPersonales
	 */
	public boolean isHabilitaDatosPersonales() {
		return habilitaDatosPersonales;
	}
	/**
	 * @param habilitaDatosPersonales the habilitaDatosPersonales to set
	 */
	public void setHabilitaDatosPersonales(boolean habilitaDatosPersonales) {
		this.habilitaDatosPersonales = habilitaDatosPersonales;
	}

	/**
	 * @return the habiliatrBotonesAccion
	 */
	public boolean isHabiliatrBotonesAccion() {
		return habiliatrBotonesAccion;
	}

	/**
	 * @param habiliatrBotonesAccion the habiliatrBotonesAccion to set
	 */
	public void setHabiliatrBotonesAccion(boolean habiliatrBotonesAccion) {
		this.habiliatrBotonesAccion = habiliatrBotonesAccion;
	}

	/**
	 * @return the regImssBusqueda
	 */
	public String getRegImssBusqueda() {
		return regImssBusqueda;
	}

	/**
	 * @param regImssBusqueda the regImssBusqueda to set
	 */
	public void setRegImssBusqueda(String regImssBusqueda) {
		this.regImssBusqueda = regImssBusqueda;
	}

	/**
	 * @return the isModalBusquedaVisible
	 */
	public boolean isModalBusquedaVisible() {
		return modalBusquedaVisible;
	}

	/**
	 * @param modalBusquedaVisible the modalBusquedaVisible to set
	 */
	public void setModalBusquedaVisible(boolean modalBusquedaVisible) {
		this.modalBusquedaVisible = modalBusquedaVisible;
	}

	/**
	 * @return the existeRegistroImss
	 */
	public boolean isExisteRegistroImss() {
		return existeRegistroImss;
	}

	/**
	 * @param existeRegistroImss the existeRegistroImss to set
	 */
	public void setExisteRegistroImss(boolean existeRegistroImss) {
		this.existeRegistroImss = existeRegistroImss;
	}

	/**
	 * @return the mensajesPrevios
	 */
	public String getMensajesPrevios() {
		return mensajesPrevios;
	}

	/**
	 * @param mensajesPrevios the mensajesPrevios to set
	 */
	public void setMensajesPrevios(String mensajesPrevios) {
		this.mensajesPrevios = mensajesPrevios;
	}
}
