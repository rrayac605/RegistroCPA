package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class TipoAfiliacionTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1678238765052157887L;


	private long cveIdTipoAfiliacion;


	private String desTipoAfiliacion;


	private Date fecRegistroActualizado;


	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<PatronDictamenTO> ndtPatronDictamens;

	/**
	 * @return the cveIdTipoAfiliacion
	 */
	public long getCveIdTipoAfiliacion() {
		return cveIdTipoAfiliacion;
	}

	/**
	 * @param cveIdTipoAfiliacion the cveIdTipoAfiliacion to set
	 */
	public void setCveIdTipoAfiliacion(long cveIdTipoAfiliacion) {
		this.cveIdTipoAfiliacion = cveIdTipoAfiliacion;
	}

	/**
	 * @return the desTipoAfiliacion
	 */
	public String getDesTipoAfiliacion() {
		return desTipoAfiliacion;
	}

	/**
	 * @param desTipoAfiliacion the desTipoAfiliacion to set
	 */
	public void setDesTipoAfiliacion(String desTipoAfiliacion) {
		this.desTipoAfiliacion = desTipoAfiliacion;
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
