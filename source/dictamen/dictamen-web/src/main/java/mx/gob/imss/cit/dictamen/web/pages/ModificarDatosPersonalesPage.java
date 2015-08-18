package mx.gob.imss.cit.dictamen.web.pages;

import javax.annotation.PostConstruct;

public class ModificarDatosPersonalesPage extends SolicitudRegistroPage {

	private static final long serialVersionUID = 1L;

	private String registroIMSS;
	private String estadoSolicitud;
	private String email;
	private String telefono;
	private String letraInterior;
	private String letraExterior;
	private String calle1;
	private String calle2;
	private String institucion;
	private String cedula;
	
	
	public ModificarDatosPersonalesPage() {
		super();
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
