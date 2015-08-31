package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class CalidadCaracMigratTO extends BaseTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2321607684233236947L;

	private long cveIdCalidadCaracMigrat;

	private String desCalidadMigratoria;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<FormaMigratoriaTO> ditFormaMigratorias;

	/**
	 * @return the cveIdCalidadCaracMigrat
	 */
	public long getCveIdCalidadCaracMigrat() {
		return cveIdCalidadCaracMigrat;
	}

	/**
	 * @param cveIdCalidadCaracMigrat the cveIdCalidadCaracMigrat to set
	 */
	public void setCveIdCalidadCaracMigrat(long cveIdCalidadCaracMigrat) {
		this.cveIdCalidadCaracMigrat = cveIdCalidadCaracMigrat;
	}

	/**
	 * @return the desCalidadMigratoria
	 */
	public String getDesCalidadMigratoria() {
		return desCalidadMigratoria;
	}

	/**
	 * @param desCalidadMigratoria the desCalidadMigratoria to set
	 */
	public void setDesCalidadMigratoria(String desCalidadMigratoria) {
		this.desCalidadMigratoria = desCalidadMigratoria;
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
