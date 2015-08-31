package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class ColegioContactoTO extends BaseTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8736440080067070120L;

	private long cveIdColegioContacto;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private FormaContactoTO ditFormaContacto;

	private ColegioTO ndcColegio;

	/**
	 * @return the cveIdColegioContacto
	 */
	public long getCveIdColegioContacto() {
		return cveIdColegioContacto;
	}

	/**
	 * @param cveIdColegioContacto the cveIdColegioContacto to set
	 */
	public void setCveIdColegioContacto(long cveIdColegioContacto) {
		this.cveIdColegioContacto = cveIdColegioContacto;
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
	 * @return the ditFormaContacto
	 */
	public FormaContactoTO getDitFormaContacto() {
		return ditFormaContacto;
	}

	/**
	 * @param ditFormaContacto the ditFormaContacto to set
	 */
	public void setDitFormaContacto(FormaContactoTO ditFormaContacto) {
		this.ditFormaContacto = ditFormaContacto;
	}

	/**
	 * @return the ndcColegio
	 */
	public ColegioTO getNdcColegio() {
		return ndcColegio;
	}

	/**
	 * @param ndcColegio the ndcColegio to set
	 */
	public void setNdcColegio(ColegioTO ndcColegio) {
		this.ndcColegio = ndcColegio;
	}
	
	
	
}
