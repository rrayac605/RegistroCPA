package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;
import java.util.Date;

public class DatosPersonalesDTO implements Serializable {

	private static final long serialVersionUID = 2009177760699640353L;
   
	private Date fechaExpedicionCedula;

	private String institucionCedula;
	private String numeroCedula;
	

	public String getInstitucionCedula() {
		return institucionCedula;
	}
	public void setInstitucionCedula(String institucionCedula) {
		this.institucionCedula = institucionCedula;
	}
	public String getNumeroCedula() {
		return numeroCedula;
	}
	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	public Date getFechaExpedicionCedula() {
		return fechaExpedicionCedula;
	}
	public void setFechaExpedicionCedula(Date fechaExpedicionCedula) {
		this.fechaExpedicionCedula = fechaExpedicionCedula;
	}
}
