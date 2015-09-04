package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class DatosPersonaSatTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2282152156807639840L;

	private long cveIdDatosSat;

	private Date fecConstitucion;

	private Date fecInicioOperaciones;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private PersonaFisicaTO ditPersonaFisica;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveIdDatosSat
	 */
	public long getCveIdDatosSat() {
		return cveIdDatosSat;
	}

	/**
	 * @param cveIdDatosSat the cveIdDatosSat to set
	 */
	public void setCveIdDatosSat(long cveIdDatosSat) {
		this.cveIdDatosSat = cveIdDatosSat;
	}

	/**
	 * @return the fecConstitucion
	 */
	public Date getFecConstitucion() {
		return fecConstitucion != null ? (Date) fecConstitucion.clone() : null;
	}

	/**
	 * @param fecConstitucion the fecConstitucion to set
	 */
	public void setFecConstitucion(Date fecConstitucion) {
		this.fecConstitucion = fecConstitucion;
	}

	/**
	 * @return the fecInicioOperaciones
	 */
	public Date getFecInicioOperaciones() {
		return fecInicioOperaciones != null ? (Date) fecInicioOperaciones.clone() : null;
	}

	/**
	 * @param fecInicioOperaciones the fecInicioOperaciones to set
	 */
	public void setFecInicioOperaciones(Date fecInicioOperaciones) {
		this.fecInicioOperaciones = fecInicioOperaciones;
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
