package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class TipoFormaTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3163509235510968560L;

	private long cveIdTipoForma;

	private String desTipoForma;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<FormaMigratoriaTO> ditFormaMigratorias;

	/**
	 * @return the cveIdTipoForma
	 */
	public long getCveIdTipoForma() {
		return cveIdTipoForma;
	}

	/**
	 * @param cveIdTipoForma the cveIdTipoForma to set
	 */
	public void setCveIdTipoForma(long cveIdTipoForma) {
		this.cveIdTipoForma = cveIdTipoForma;
	}

	/**
	 * @return the desTipoForma
	 */
	public String getDesTipoForma() {
		return desTipoForma;
	}

	/**
	 * @param desTipoForma the desTipoForma to set
	 */
	public void setDesTipoForma(String desTipoForma) {
		this.desTipoForma = desTipoForma;
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
	 * @return the ditFormaMigratorias
	 */
	public List<FormaMigratoriaTO> getDitFormaMigratorias() {
		return ditFormaMigratorias;
	}

	/**
	 * @param ditFormaMigratorias the ditFormaMigratorias to set
	 */
	public void setDitFormaMigratorias(List<FormaMigratoriaTO> ditFormaMigratorias) {
		this.ditFormaMigratorias = ditFormaMigratorias;
	}

}
