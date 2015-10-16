package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtA51PersonalProporcionadDTO implements Serializable {

	private static final long serialVersionUID = 4384000180769111094L;

	private Long cveIdA51Listadopersonal;
	private String curpTrab;
	private String cveIdUsuario;
	private String desFolioSipress;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String nomNombreTrab;
	private String nomPrimerApellidoTrab;
	private String nomSegundoApellidoTrab;
	private String numNssTrab;
	private String regPatronal;
	private String rfcTrab;

	public Long getCveIdA51Listadopersonal() {
		return cveIdA51Listadopersonal;
	}

	public void setCveIdA51Listadopersonal(Long cveIdA51Listadopersonal) {
		this.cveIdA51Listadopersonal = cveIdA51Listadopersonal;
	}

	public String getCurpTrab() {
		return curpTrab;
	}

	public void setCurpTrab(String curpTrab) {
		this.curpTrab = curpTrab;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesFolioSipress() {
		return desFolioSipress;
	}

	public void setDesFolioSipress(String desFolioSipress) {
		this.desFolioSipress = desFolioSipress;
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

	public String getNomNombreTrab() {
		return nomNombreTrab;
	}

	public void setNomNombreTrab(String nomNombreTrab) {
		this.nomNombreTrab = nomNombreTrab;
	}

	public String getNomPrimerApellidoTrab() {
		return nomPrimerApellidoTrab;
	}

	public void setNomPrimerApellidoTrab(String nomPrimerApellidoTrab) {
		this.nomPrimerApellidoTrab = nomPrimerApellidoTrab;
	}

	public String getNomSegundoApellidoTrab() {
		return nomSegundoApellidoTrab;
	}

	public void setNomSegundoApellidoTrab(String nomSegundoApellidoTrab) {
		this.nomSegundoApellidoTrab = nomSegundoApellidoTrab;
	}

	public String getNumNssTrab() {
		return numNssTrab;
	}

	public void setNumNssTrab(String numNssTrab) {
		this.numNssTrab = numNssTrab;
	}

	public String getRegPatronal() {
		return regPatronal;
	}

	public void setRegPatronal(String regPatronal) {
		this.regPatronal = regPatronal;
	}

	public String getRfcTrab() {
		return rfcTrab;
	}

	public void setRfcTrab(String rfcTrab) {
		this.rfcTrab = rfcTrab;
	}

}
