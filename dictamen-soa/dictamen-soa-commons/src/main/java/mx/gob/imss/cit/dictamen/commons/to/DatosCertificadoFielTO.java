package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class DatosCertificadoFielTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4198464366141230198L;

	private long cveIdDatosCertFiel;

	private Date fecFinVigencia;

	private Date fecIniVigencia;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private String numSerial;

	private PersonaFisicaTO ditPersonaFisica;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveIdDatosCertFiel
	 */
	public long getCveIdDatosCertFiel() {
		return cveIdDatosCertFiel;
	}

	/**
	 * @param cveIdDatosCertFiel the cveIdDatosCertFiel to set
	 */
	public void setCveIdDatosCertFiel(long cveIdDatosCertFiel) {
		this.cveIdDatosCertFiel = cveIdDatosCertFiel;
	}

	/**
	 * @return the fecFinVigencia
	 */
	public Date getFecFinVigencia() {
		return fecFinVigencia != null ? (Date) fecFinVigencia.clone() : null;
	}

	/**
	 * @param fecFinVigencia the fecFinVigencia to set
	 */
	public void setFecFinVigencia(Date fecFinVigencia) {
		this.fecFinVigencia = fecFinVigencia;
	}

	/**
	 * @return the fecIniVigencia
	 */
	public Date getFecIniVigencia() {
		return fecIniVigencia != null ? (Date) fecIniVigencia.clone() : null;
	}

	/**
	 * @param fecIniVigencia the fecIniVigencia to set
	 */
	public void setFecIniVigencia(Date fecIniVigencia) {
		this.fecIniVigencia = fecIniVigencia;
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
	 * @return the numSerial
	 */
	public String getNumSerial() {
		return numSerial;
	}

	/**
	 * @param numSerial the numSerial to set
	 */
	public void setNumSerial(String numSerial) {
		this.numSerial = numSerial;
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
