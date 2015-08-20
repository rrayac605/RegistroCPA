package mx.gob.imss.cit.dictamen.web.pages;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.imss.cit.dictamen.web.pages.base.BasePage;

@ManagedBean(name = "capturaBajaPage")
@SessionScoped
public class CapturaBajaPage extends BasePage{

	private static final long serialVersionUID = 1L;
	private String rfc;
	private String curp;
	private String nombre;
	private String registroIMSS;
	private String estadoSolicitud;
	private String delegacion;
	private String subdelegacion;
	private String correo;
	private String telefono;
	private String calle;
	private String numeroExterior;
	private String numeroInterior;
	private String letraInterior;
	private String letraExterior;
	private String calle1;
	private String calle2;
	private String colonia;
	private String localidad;
	private String municipio;
	private String codigoPostal;
	private String entidadFederativa;
	private String motivoBaja;
	
	@PostConstruct
	public void init() {
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

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

	public String getRegistroIMSS() {
		return registroIMSS;
	}

	public void setRegistroIMSS(String registroIMSS) {
		this.registroIMSS = registroIMSS;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public String getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	public String getSubdelegacion() {
		return subdelegacion;
	}

	public void setSubdelegacion(String subdelegacion) {
		this.subdelegacion = subdelegacion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumeroExterior() {
		return numeroExterior;
	}

	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	public String getNumeroInterior() {
		return numeroInterior;
	}

	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	public String getLetraInterior() {
		return letraInterior;
	}

	public void setLetraInterior(String letraInterior) {
		this.letraInterior = letraInterior;
	}

	public String getLetraExterior() {
		return letraExterior;
	}

	public void setLetraExterior(String letraExterior) {
		this.letraExterior = letraExterior;
	}

	public String getCalle1() {
		return calle1;
	}

	public void setCalle1(String calle1) {
		this.calle1 = calle1;
	}

	public String getCalle2() {
		return calle2;
	}

	public void setCalle2(String calle2) {
		this.calle2 = calle2;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getEntidadFederativa() {
		return entidadFederativa;
	}

	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}

	public String getMotivoBaja() {
		return motivoBaja;
	}

	public void setMotivoBaja(String motivoBaja) {
		this.motivoBaja = motivoBaja;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
