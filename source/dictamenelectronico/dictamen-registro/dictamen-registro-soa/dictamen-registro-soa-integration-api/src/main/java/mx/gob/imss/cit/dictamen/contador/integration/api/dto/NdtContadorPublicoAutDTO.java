package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;


public class NdtContadorPublicoAutDTO implements Serializable{

	private static final long serialVersionUID = -4028808365466734688L;
	public String getNumTramiteNotaria() {
		return numTramiteNotaria;
	}
	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getNumRegistroCpa() {
		return numRegistroCpa;
	}
	public void setNumRegistroCpa(String numRegistroCpa) {
		this.numRegistroCpa = numRegistroCpa;
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
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getNumeroCedulaProfesional() {
		return numeroCedulaProfesional;
	}
	public void setNumeroCedulaProfesional(String numeroCedulaProfesional) {
		this.numeroCedulaProfesional = numeroCedulaProfesional;
	}
	public String getCadenaOriginal() {
		return cadenaOriginal;
	}
	public void setCadenaOriginal(String cadenaOriginal) {
		this.cadenaOriginal = cadenaOriginal;
	}
	public String getSelloDigitalIMSS() {
		return selloDigitalIMSS;
	}
	public void setSelloDigitalIMSS(String selloDigitalIMSS) {
		this.selloDigitalIMSS = selloDigitalIMSS;
	}
	public DomicilioFiscalDTO getDomicilioFiscalDTO() {
		return domicilioFiscalDTO;
	}
	public void setDomicilioFiscalDTO(DomicilioFiscalDTO domicilioFiscalDTO) {
		this.domicilioFiscalDTO = domicilioFiscalDTO;
	}
	private String numTramiteNotaria;
	private String fecha;
	private String numRegistroCpa;
	private String rfc;
	private String curp;
	private String nombreCompleto;
	private String numeroCedulaProfesional;
	private String cadenaOriginal;
	private String selloDigitalIMSS;
	private DomicilioFiscalDTO domicilioFiscalDTO;
	
}
