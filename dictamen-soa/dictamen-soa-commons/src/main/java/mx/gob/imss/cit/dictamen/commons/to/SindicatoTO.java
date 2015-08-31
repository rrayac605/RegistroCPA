package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class SindicatoTO extends BaseTO {

	private long cveIdSindicato;

	private String desAutLab;

	private Date fecDocRegistro;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private String numRefRegistro;

	private PersonaMoralTO ditPersonaMoral;

	/**
	 * @return the cveIdSindicato
	 */
	public long getCveIdSindicato() {
		return cveIdSindicato;
	}

	/**
	 * @param cveIdSindicato the cveIdSindicato to set
	 */
	public void setCveIdSindicato(long cveIdSindicato) {
		this.cveIdSindicato = cveIdSindicato;
	}

	/**
	 * @return the desAutLab
	 */
	public String getDesAutLab() {
		return desAutLab;
	}

	/**
	 * @param desAutLab the desAutLab to set
	 */
	public void setDesAutLab(String desAutLab) {
		this.desAutLab = desAutLab;
	}

	/**
	 * @return the fecDocRegistro
	 */
	public Date getFecDocRegistro() {
		return fecDocRegistro != null ? (Date) fecDocRegistro.clone() : null;
	}

	/**
	 * @param fecDocRegistro the fecDocRegistro to set
	 */
	public void setFecDocRegistro(Date fecDocRegistro) {
		this.fecDocRegistro = fecDocRegistro;
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
	 * @return the numRefRegistro
	 */
	public String getNumRefRegistro() {
		return numRefRegistro;
	}

	/**
	 * @param numRefRegistro the numRefRegistro to set
	 */
	public void setNumRefRegistro(String numRefRegistro) {
		this.numRefRegistro = numRefRegistro;
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
