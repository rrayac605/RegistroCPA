package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA4PagoPersonaFisicaDTO implements Serializable {

	private static final long serialVersionUID = 1298859779462968314L;

	private Long cveIdA4Pagospersonasfisicas;
	private String curpPf;
	private String cveIdUsuario;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private Long impMontoOperaciones;
	private String nomNombrePf;
	private String nomPrimerApellidoPf;
	private String nomSegundoApellidoPf;
	private Long numMesesOpero;
	private String rfcPf;

	public Long getCveIdA4Pagospersonasfisicas() {
		return cveIdA4Pagospersonasfisicas;
	}

	public void setCveIdA4Pagospersonasfisicas(Long cveIdA4Pagospersonasfisicas) {
		this.cveIdA4Pagospersonasfisicas = cveIdA4Pagospersonasfisicas;
	}

	public String getCurpPf() {
		return curpPf;
	}

	public void setCurpPf(String curpPf) {
		this.curpPf = curpPf;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public Long getImpMontoOperaciones() {
		return impMontoOperaciones;
	}

	public void setImpMontoOperaciones(Long impMontoOperaciones) {
		this.impMontoOperaciones = impMontoOperaciones;
	}

	public String getNomNombrePf() {
		return nomNombrePf;
	}

	public void setNomNombrePf(String nomNombrePf) {
		this.nomNombrePf = nomNombrePf;
	}

	public String getNomPrimerApellidoPf() {
		return nomPrimerApellidoPf;
	}

	public void setNomPrimerApellidoPf(String nomPrimerApellidoPf) {
		this.nomPrimerApellidoPf = nomPrimerApellidoPf;
	}

	public String getNomSegundoApellidoPf() {
		return nomSegundoApellidoPf;
	}

	public void setNomSegundoApellidoPf(String nomSegundoApellidoPf) {
		this.nomSegundoApellidoPf = nomSegundoApellidoPf;
	}

	public Long getNumMesesOpero() {
		return numMesesOpero;
	}

	public void setNumMesesOpero(Long numMesesOpero) {
		this.numMesesOpero = numMesesOpero;
	}

	public String getRfcPf() {
		return rfcPf;
	}

	public void setRfcPf(String rfcPf) {
		this.rfcPf = rfcPf;
	}

}
