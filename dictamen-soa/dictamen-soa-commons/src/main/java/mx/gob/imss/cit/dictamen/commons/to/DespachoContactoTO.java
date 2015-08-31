package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class DespachoContactoTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 431811835220881359L;

	private long cveIdDespachoContacto;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private FormaContactoTO ditFormaContacto;

	private DespachoTO ndcDespacho;

	/**
	 * @return the cveIdDespachoContacto
	 */
	public long getCveIdDespachoContacto() {
		return cveIdDespachoContacto;
	}

	/**
	 * @param cveIdDespachoContacto the cveIdDespachoContacto to set
	 */
	public void setCveIdDespachoContacto(long cveIdDespachoContacto) {
		this.cveIdDespachoContacto = cveIdDespachoContacto;
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
	 * @return the ndcDespacho
	 */
	public DespachoTO getNdcDespacho() {
		return ndcDespacho;
	}

	/**
	 * @param ndcDespacho the ndcDespacho to set
	 */
	public void setNdcDespacho(DespachoTO ndcDespacho) {
		this.ndcDespacho = ndcDespacho;
	}



}
