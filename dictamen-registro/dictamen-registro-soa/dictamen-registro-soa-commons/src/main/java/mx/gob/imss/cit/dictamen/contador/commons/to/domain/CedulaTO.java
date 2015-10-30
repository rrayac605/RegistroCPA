package mx.gob.imss.cit.dictamen.contador.commons.to.domain;

import java.io.Serializable;
import java.util.Date;

public class CedulaTO implements Serializable{

	private static final long serialVersionUID = -8885801172560815813L;

	
	private Date fechaExpedicionCedula;
	private String institucionCedula;
	private String numeroCedula;

	public Date getFechaExpedicionCedula() {
		return fechaExpedicionCedula;
	}
	public void setFechaExpedicionCedula(Date fechaExpedicionCedula) {
		this.fechaExpedicionCedula = fechaExpedicionCedula;
	}
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
}
