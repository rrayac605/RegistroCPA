package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class AsociacionContactoTO extends BaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8799109181023238493L;

	private long cveIdAsociacionContacto;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private FormaContactoTO ditFormaContacto;

	private AsociacionTO ndcAsociacion;

	/**
	 * @return the cveIdAsociacionContacto
	 */
	public long getCveIdAsociacionContacto() {
		return cveIdAsociacionContacto;
	}

	/**
	 * @param cveIdAsociacionContacto the cveIdAsociacionContacto to set
	 */
	public void setCveIdAsociacionContacto(long cveIdAsociacionContacto) {
		this.cveIdAsociacionContacto = cveIdAsociacionContacto;
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
	 * @return the ndcAsociacion
	 */
	public AsociacionTO getNdcAsociacion() {
		return ndcAsociacion;
	}

	/**
	 * @param ndcAsociacion the ndcAsociacion to set
	 */
	public void setNdcAsociacion(AsociacionTO ndcAsociacion) {
		this.ndcAsociacion = ndcAsociacion;
	}
	
	
}
