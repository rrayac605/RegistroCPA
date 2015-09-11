package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class TipoSancionTO extends BaseTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2037581577134427986L;

	private long cveIdTiposancion;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private String sancion;

	private List<ContadorPublicoTO> ndtContadorPublicoAuts;

	/**
	 * @return the cveIdTiposancion
	 */
	public long getCveIdTiposancion() {
		return cveIdTiposancion;
	}

	/**
	 * @param cveIdTiposancion the cveIdTiposancion to set
	 */
	public void setCveIdTiposancion(long cveIdTiposancion) {
		this.cveIdTiposancion = cveIdTiposancion;
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
	 * @return the sancion
	 */
	public String getSancion() {
		return sancion;
	}

	/**
	 * @param sancion the sancion to set
	 */
	public void setSancion(String sancion) {
		this.sancion = sancion;
	}

	/**
	 * @return the ndtContadorPublicoAuts
	 */
	public List<ContadorPublicoTO> getNdtContadorPublicoAuts() {
		return ndtContadorPublicoAuts;
	}

	/**
	 * @param ndtContadorPublicoAuts the ndtContadorPublicoAuts to set
	 */
	public void setNdtContadorPublicoAuts(
			List<ContadorPublicoTO> ndtContadorPublicoAuts) {
		this.ndtContadorPublicoAuts = ndtContadorPublicoAuts;
	}
		
		
}
