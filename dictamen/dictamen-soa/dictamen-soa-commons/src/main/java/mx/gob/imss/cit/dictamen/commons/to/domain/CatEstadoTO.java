package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class CatEstadoTO extends BaseTO  {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1254842174422947170L;

	private String cveEnt;

	private Date fecRegistroBaja;

	private String nomEnt;

	private PaisTO dicPai;

	private CatEstadoCpTO dgCatEstadoCp;

	private List<CatMunicipioTO> dgCatMunicipios;

	private List<PersonaTO> ditPersonas;

	private List<SocioTO> ditSocios;

	/**
	 * @return the cveEnt
	 */
	public String getCveEnt() {
		return cveEnt;
	}

	/**
	 * @param cveEnt the cveEnt to set
	 */
	public void setCveEnt(String cveEnt) {
		this.cveEnt = cveEnt;
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
	 * @return the nomEnt
	 */
	public String getNomEnt() {
		return nomEnt;
	}

	/**
	 * @param nomEnt the nomEnt to set
	 */
	public void setNomEnt(String nomEnt) {
		this.nomEnt = nomEnt;
	}

	/**
	 * @return the dicPai
	 */
	public PaisTO getDicPai() {
		return dicPai;
	}

	/**
	 * @param dicPai the dicPai to set
	 */
	public void setDicPai(PaisTO dicPai) {
		this.dicPai = dicPai;
	}

	/**
	 * @return the dgCatEstadoCp
	 */
	public CatEstadoCpTO getDgCatEstadoCp() {
		return dgCatEstadoCp;
	}

	/**
	 * @param dgCatEstadoCp the dgCatEstadoCp to set
	 */
	public void setDgCatEstadoCp(CatEstadoCpTO dgCatEstadoCp) {
		this.dgCatEstadoCp = dgCatEstadoCp;
	}

	/**
	 * @return the dgCatMunicipios
	 */
	public List<CatMunicipioTO> getDgCatMunicipios() {
		return dgCatMunicipios;
	}

	/**
	 * @param dgCatMunicipios the dgCatMunicipios to set
	 */
	public void setDgCatMunicipios(List<CatMunicipioTO> dgCatMunicipios) {
		this.dgCatMunicipios = dgCatMunicipios;
	}

	/**
	 * @return the ditPersonas
	 */
	public List<PersonaTO> getDitPersonas() {
		return ditPersonas;
	}

	/**
	 * @param ditPersonas the ditPersonas to set
	 */
	public void setDitPersonas(List<PersonaTO> ditPersonas) {
		this.ditPersonas = ditPersonas;
	}

	/**
	 * @return the ditSocios
	 */
	public List<SocioTO> getDitSocios() {
		return ditSocios;
	}

	/**
	 * @param ditSocios the ditSocios to set
	 */
	public void setDitSocios(List<SocioTO> ditSocios) {
		this.ditSocios = ditSocios;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CatEstadoTO [cveEnt=" + cveEnt + ", fecRegistroBaja="
				+ fecRegistroBaja + ", nomEnt=" + nomEnt + ", dicPai=" + dicPai
				+ ", dgCatEstadoCp=" + dgCatEstadoCp + ", dgCatMunicipios="
				+ dgCatMunicipios + ", ditPersonas=" + ditPersonas
				+ ", ditSocios=" + ditSocios + "]";
	}	
	
}
