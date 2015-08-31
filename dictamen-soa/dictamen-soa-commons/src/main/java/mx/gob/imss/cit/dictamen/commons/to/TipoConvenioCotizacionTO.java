package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class TipoConvenioCotizacionTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1611822492194847360L;

	private long cveIdTipoConvenioCot;

	private String desTipoConvenioCot;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<PatronDictamenTO> ndtPatronDictamens;

	/**
	 * @return the cveIdTipoConvenioCot
	 */
	public long getCveIdTipoConvenioCot() {
		return cveIdTipoConvenioCot;
	}

	/**
	 * @param cveIdTipoConvenioCot the cveIdTipoConvenioCot to set
	 */
	public void setCveIdTipoConvenioCot(long cveIdTipoConvenioCot) {
		this.cveIdTipoConvenioCot = cveIdTipoConvenioCot;
	}

	/**
	 * @return the desTipoConvenioCot
	 */
	public String getDesTipoConvenioCot() {
		return desTipoConvenioCot;
	}

	/**
	 * @param desTipoConvenioCot the desTipoConvenioCot to set
	 */
	public void setDesTipoConvenioCot(String desTipoConvenioCot) {
		this.desTipoConvenioCot = desTipoConvenioCot;
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
	 * @return the ndtPatronDictamens
	 */
	public List<PatronDictamenTO> getNdtPatronDictamens() {
		return ndtPatronDictamens;
	}

	/**
	 * @param ndtPatronDictamens the ndtPatronDictamens to set
	 */
	public void setNdtPatronDictamens(List<PatronDictamenTO> ndtPatronDictamens) {
		this.ndtPatronDictamens = ndtPatronDictamens;
	}

	
	
}
