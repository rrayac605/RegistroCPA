package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;
import java.util.List;

public class TipoSociedadTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5346982234906611790L;

	private long cveIdTipoSociedad;

	private String desTipoSociedad;

	private String desTipoSociedadAbrev;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private List<PersonaMoralTO> ditPersonaMorals;

	/**
	 * @return the cveIdTipoSociedad
	 */
	public long getCveIdTipoSociedad() {
		return cveIdTipoSociedad;
	}

	/**
	 * @param cveIdTipoSociedad the cveIdTipoSociedad to set
	 */
	public void setCveIdTipoSociedad(long cveIdTipoSociedad) {
		this.cveIdTipoSociedad = cveIdTipoSociedad;
	}

	/**
	 * @return the desTipoSociedad
	 */
	public String getDesTipoSociedad() {
		return desTipoSociedad;
	}

	/**
	 * @param desTipoSociedad the desTipoSociedad to set
	 */
	public void setDesTipoSociedad(String desTipoSociedad) {
		this.desTipoSociedad = desTipoSociedad;
	}

	/**
	 * @return the desTipoSociedadAbrev
	 */
	public String getDesTipoSociedadAbrev() {
		return desTipoSociedadAbrev;
	}

	/**
	 * @param desTipoSociedadAbrev the desTipoSociedadAbrev to set
	 */
	public void setDesTipoSociedadAbrev(String desTipoSociedadAbrev) {
		this.desTipoSociedadAbrev = desTipoSociedadAbrev;
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
	 * @return the ditPersonaMorals
	 */
	public List<PersonaMoralTO> getDitPersonaMorals() {
		return ditPersonaMorals;
	}

	/**
	 * @param ditPersonaMorals the ditPersonaMorals to set
	 */
	public void setDitPersonaMorals(List<PersonaMoralTO> ditPersonaMorals) {
		this.ditPersonaMorals = ditPersonaMorals;
	}
	
	
}
