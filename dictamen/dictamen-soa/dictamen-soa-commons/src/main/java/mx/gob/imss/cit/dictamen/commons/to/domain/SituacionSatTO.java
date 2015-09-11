package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class SituacionSatTO extends BaseTO {

	private long cveSituacionSat;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Date fecSituacion;

	private String refDescripcion;

	private PersonaFisicaTO ditPersonaFisica;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveSituacionSat
	 */
	public long getCveSituacionSat() {
		return cveSituacionSat;
	}

	/**
	 * @param cveSituacionSat the cveSituacionSat to set
	 */
	public void setCveSituacionSat(long cveSituacionSat) {
		this.cveSituacionSat = cveSituacionSat;
	}



	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	/**
	 * @param fecRegistroActualizado the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	/**
	 * @return the fecSituacion
	 */
	public Date getFecSituacion() {
		return fecSituacion != null ? (Date) fecSituacion.clone() : null;
	}

	/**
	 * @param fecSituacion the fecSituacion to set
	 */
	public void setFecSituacion(Date fecSituacion) {
		this.fecSituacion = fecSituacion;
	}

	/**
	 * @return the refDescripcion
	 */
	public String getRefDescripcion() {
		return refDescripcion;
	}

	/**
	 * @param refDescripcion the refDescripcion to set
	 */
	public void setRefDescripcion(String refDescripcion) {
		this.refDescripcion = refDescripcion;
	}

	/**
	 * @return the ditPersonaFisica
	 */
	public PersonaFisicaTO getDitPersonaFisica() {
		return ditPersonaFisica;
	}

	/**
	 * @param ditPersonaFisica the ditPersonaFisica to set
	 */
	public void setDitPersonaFisica(PersonaFisicaTO ditPersonaFisica) {
		this.ditPersonaFisica = ditPersonaFisica;
	}

	/**
	 * @return the ditPersonaMoral
	 */
	public PersonaMoralTO getDitPersonaMoral() {
		return ditPersonaMoral;
	}

	/**
	 * @param ditPersonaMoral the ditPersonaMoral to set
	 */
	public void setDitPersonaMoral(PersonaMoralTO ditPersonaMoral) {
		this.ditPersonaMoral = ditPersonaMoral;
	}
	
	
}
