package mx.gob.imss.cit.dictamen.contador.web.pages;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;



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
	private DomicilioFiscalDTO domicilioFiscal;
	private String email;
	private String telefono;
	private String[] emailsOp;
	private boolean habilitaDatosDespacho;
	private int indiceTabActivo;
	private String tipoDespacho;
	private boolean habilitarTrabajadoresDespacho;
	private boolean habilitaNumeroTrabajadores;
	private String cuentaConTrabajadores;
	private String rfcDespacho;
	private String razonSocialDespacho;
	private String rfcColegio;
	private String razonSocialColegio;
	private boolean habilitaDatosColegio;
	
	public ActualizacionRegistroPage(){
		this.habilitaDatosPersonales = Boolean.FALSE;
		this.habiliatrBotonesAccion=Boolean.TRUE;
		this.modalBusquedaVisible = Boolean.TRUE;
//		this.tieneRegistro = Boolean.TRUE;
		this.existeRegistroImss = Boolean.FALSE;
		this.habilitaDatosDespacho = Boolean.FALSE;
		this.habilitarTrabajadoresDespacho = Boolean.FALSE;
		this.habilitaNumeroTrabajadores = Boolean.FALSE;
		this.habilitaDatosColegio = Boolean.FALSE;
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

	/**
	 * @return the domicilioFiscal
	 */
	public DomicilioFiscalDTO getDomicilioFiscal() {
		return domicilioFiscal;
	}

	/**
	 * @param domicilioFiscal the domicilioFiscal to set
	 */
	public void setDomicilioFiscal(DomicilioFiscalDTO domicilioFiscal) {
		this.domicilioFiscal = domicilioFiscal;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the emailsOp
	 */
	public String[] getEmailsOp() {
		if(emailsOp == null){
			emailsOp = new String[2];
		}
		return emailsOp;
	}

	/**
	 * @param emailsOp the emailsOp to set
	 */
	public void setEmailsOp(String[] emailsOp) {
		this.emailsOp = emailsOp;
	}

	/**
	 * @return the habilitaDatosDespacho
	 */
	public boolean isHabilitaDatosDespacho() {
		return habilitaDatosDespacho;
	}

	/**
	 * @param habilitaDatosDespacho the habilitaDatosDespacho to set
	 */
	public void setHabilitaDatosDespacho(boolean habilitaDatosDespacho) {
		this.habilitaDatosDespacho = habilitaDatosDespacho;
	}

	/**
	 * @return the indiceTabActivo
	 */
	public int getIndiceTabActivo() {
		return indiceTabActivo;
	}

	/**
	 * @param indiceTabActivo the indiceTabActivo to set
	 */
	public void setIndiceTabActivo(int indiceTabActivo) {
		this.indiceTabActivo = indiceTabActivo;
	}

	/**
	 * @return the tipoDespacho
	 */
	public String getTipoDespacho() {
		return tipoDespacho;
	}

	/**
	 * @param tipoDespacho the tipoDespacho to set
	 */
	public void setTipoDespacho(String tipoDespacho) {
		this.tipoDespacho = tipoDespacho;
	}

	/**
	 * @return the habilitarTrabajadoresDespacho
	 */
	public boolean isHabilitarTrabajadoresDespacho() {
		return habilitarTrabajadoresDespacho;
	}

	/**
	 * @param habilitarTrabajadoresDespacho the habilitarTrabajadoresDespacho to set
	 */
	public void setHabilitarTrabajadoresDespacho(
			boolean habilitarTrabajadoresDespacho) {
		this.habilitarTrabajadoresDespacho = habilitarTrabajadoresDespacho;
	}

	/**
	 * @return the habilitaNumeroTrabajadores
	 */
	public boolean isHabilitaNumeroTrabajadores() {
		return habilitaNumeroTrabajadores;
	}

	/**
	 * @param habilitaNumeroTrabajadores the habilitaNumeroTrabajadores to set
	 */
	public void setHabilitaNumeroTrabajadores(boolean habilitaNumeroTrabajadores) {
		this.habilitaNumeroTrabajadores = habilitaNumeroTrabajadores;
	}

	/**
	 * @return the cuentaConTrabajadores
	 */
	public String getCuentaConTrabajadores() {
		return cuentaConTrabajadores;
	}

	/**
	 * @param cuentaConTrabajadores the cuentaConTrabajadores to set
	 */
	public void setCuentaConTrabajadores(String cuentaConTrabajadores) {
		this.cuentaConTrabajadores = cuentaConTrabajadores;
	}

	/**
	 * @return the rfcDespacho
	 */
	public String getRfcDespacho() {
		return rfcDespacho;
	}

	/**
	 * @param rfcDespacho the rfcDespacho to set
	 */
	public void setRfcDespacho(String rfcDespacho) {
		this.rfcDespacho = rfcDespacho;
	}

	/**
	 * @return the razonSocialDespacho
	 */
	public String getRazonSocialDespacho() {
		return razonSocialDespacho;
	}

	/**
	 * @param razonSocialDespacho the razonSocialDespacho to set
	 */
	public void setRazonSocialDespacho(String razonSocialDespacho) {
		this.razonSocialDespacho = razonSocialDespacho;
	}

	/**
	 * @return the rfcColegio
	 */
	public String getRfcColegio() {
		return rfcColegio;
	}

	/**
	 * @param rfcColegio the rfcColegio to set
	 */
	public void setRfcColegio(String rfcColegio) {
		this.rfcColegio = rfcColegio;
	}

	/**
	 * @return the razonSocialColegio
	 */
	public String getRazonSocialColegio() {
		return razonSocialColegio;
	}

	/**
	 * @param razonSocialColegio the razonSocialColegio to set
	 */
	public void setRazonSocialColegio(String razonSocialColegio) {
		this.razonSocialColegio = razonSocialColegio;
	}

	/**
	 * @return the habilitaDatosColegio
	 */
	public boolean isHabilitaDatosColegio() {
		return habilitaDatosColegio;
	}

	/**
	 * @param habilitaDatosColegio the habilitaDatosColegio to set
	 */
	public void setHabilitaDatosColegio(boolean habilitaDatosColegio) {
		this.habilitaDatosColegio = habilitaDatosColegio;
	}
}
