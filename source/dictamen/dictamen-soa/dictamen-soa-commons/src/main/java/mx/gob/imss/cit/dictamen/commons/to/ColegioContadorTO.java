package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class ColegioContadorTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -54703304255397555L;

	private long cveIdColegio;

	private String cveIdUsuario;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private PersonaMoralTO ditPersonaMoral;

	private AsociacionTO ndtAsociacion;

	/**
	 * @return the cveIdColegio
	 */
	public long getCveIdColegio() {
		return cveIdColegio;
	}

	/**
	 * @param cveIdColegio the cveIdColegio to set
	 */
	public void setCveIdColegio(long cveIdColegio) {
		this.cveIdColegio = cveIdColegio;
	}

	/**
	 * @return the cveIdUsuario
	 */
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	/**
	 * @param cveIdUsuario the cveIdUsuario to set
	 */
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	/**
	 * @return the ndtAsociacion
	 */
	public AsociacionTO getNdtAsociacion() {
		return ndtAsociacion;
	}

	/**
	 * @param ndtAsociacion the ndtAsociacion to set
	 */
	public void setNdtAsociacion(AsociacionTO ndtAsociacion) {
		this.ndtAsociacion = ndtAsociacion;
	}

	
	
}
