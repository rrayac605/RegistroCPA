package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class ModuloTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6562086732244794878L;

	private long cveIdModulo;

	private String desModulo;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<TipoTramiteTO> dicTipoTramites;

	/**
	 * @return the cveIdModulo
	 */
	public long getCveIdModulo() {
		return cveIdModulo;
	}

	/**
	 * @param cveIdModulo the cveIdModulo to set
	 */
	public void setCveIdModulo(long cveIdModulo) {
		this.cveIdModulo = cveIdModulo;
	}

	/**
	 * @return the desModulo
	 */
	public String getDesModulo() {
		return desModulo;
	}

	/**
	 * @param desModulo the desModulo to set
	 */
	public void setDesModulo(String desModulo) {
		this.desModulo = desModulo;
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
	 * @return the dicTipoTramites
	 */
	public List<TipoTramiteTO> getDicTipoTramites() {
		return dicTipoTramites;
	}

	/**
	 * @param dicTipoTramites the dicTipoTramites to set
	 */
	public void setDicTipoTramites(List<TipoTramiteTO> dicTipoTramites) {
		this.dicTipoTramites = dicTipoTramites;
	}

}
