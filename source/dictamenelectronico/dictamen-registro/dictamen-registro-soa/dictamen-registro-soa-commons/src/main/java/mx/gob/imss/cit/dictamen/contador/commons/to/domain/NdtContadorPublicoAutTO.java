package mx.gob.imss.cit.dictamen.contador.commons.to.domain;

import java.io.Serializable;

public class NdtContadorPublicoAutTO implements Serializable {

	private static final long serialVersionUID = 7252086442470397786L;

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

	public DomicilioTO getDomicilioTO() {
		return domicilioTO;
	}

	public void setDomicilioTO(DomicilioTO domicilioTO) {
		this.domicilioTO = domicilioTO;
	}

	public Integer getNumRegistroCpa() {
		return numRegistroCpa;
	}

	public void setNumRegistroCpa(Integer numRegistroCpa) {
		this.numRegistroCpa = numRegistroCpa;
	}

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
	public String getNumeroCedulaProfesional() {
		return numeroCedulaProfesional;
	}

	public void setNumeroCedulaProfesional(String numeroCedulaProfesional) {
		this.numeroCedulaProfesional = numeroCedulaProfesional;
	}


	public String getSelloDigitalIMSS() {
		return selloDigitalIMSS;
	}

	public void setSelloDigitalIMSS(String selloDigitalIMSS) {
		this.selloDigitalIMSS = selloDigitalIMSS;
	}

	public String getCadenaOriginal() {
		return cadenaOriginal;
	}

	public void setCadenaOriginal(String cadenaOriginal) {
		this.cadenaOriginal = cadenaOriginal;
	}
	
	private String numTramiteNotaria;
	private String fecha;
	private Integer numRegistroCpa;
	private String rfc;
	private String curp;
	private String nombreCompleto;
	private String numeroCedulaProfesional;
	private String cadenaOriginal;


	private String selloDigitalIMSS;
	private DomicilioTO domicilioTO;
}
