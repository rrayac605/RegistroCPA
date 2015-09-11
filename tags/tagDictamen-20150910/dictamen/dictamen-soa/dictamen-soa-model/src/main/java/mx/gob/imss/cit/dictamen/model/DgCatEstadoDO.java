package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DG_CAT_ESTADO database table.
 * 
 */
@Entity
@Table(name="DG_CAT_ESTADO")
@NamedQuery(name="DgCatEstadoDO.findAll", query="SELECT d FROM DgCatEstadoDO d")
public class DgCatEstadoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ENT")
	private String cveEnt;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Column(name="NOM_ENT")
	private String nomEnt;

	//bi-directional many-to-one association to DicPaisDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PAIS")
	private DicPaisDO dicPai;

	//bi-directional one-to-one association to DgCatEstadoCpDO
	@OneToOne(mappedBy="dgCatEstado")
	private DgCatEstadoCpDO dgCatEstadoCp;

	//bi-directional many-to-one association to DgCatMunicipioDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatEstado")
	private List<DgCatMunicipioDO> dgCatMunicipios;

	//bi-directional many-to-one association to DitPersonaDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatEstado")
	private List<DitPersonaDO> ditPersonas;

	//bi-directional many-to-one association to DitSocioDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatEstado")
	private List<DitSocioDO> ditSocios;

	public DgCatEstadoDO() {
	}

	public String getCveEnt() {
		return this.cveEnt;
	}

	public void setCveEnt(String cveEnt) {
		this.cveEnt = cveEnt;
	}

	public Date getFecRegistroBaja() {
		return this.fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public String getNomEnt() {
		return this.nomEnt;
	}

	public void setNomEnt(String nomEnt) {
		this.nomEnt = nomEnt;
	}

	public DicPaisDO getDicPai() {
		return this.dicPai;
	}

	public void setDicPai(DicPaisDO dicPai) {
		this.dicPai = dicPai;
	}

	public DgCatEstadoCpDO getDgCatEstadoCp() {
		return this.dgCatEstadoCp;
	}

	public void setDgCatEstadoCp(DgCatEstadoCpDO dgCatEstadoCp) {
		this.dgCatEstadoCp = dgCatEstadoCp;
	}

	public List<DgCatMunicipioDO> getDgCatMunicipios() {
		return this.dgCatMunicipios;
	}

	public void setDgCatMunicipios(List<DgCatMunicipioDO> dgCatMunicipios) {
		this.dgCatMunicipios = dgCatMunicipios;
	}

	public List<DitPersonaDO> getDitPersonas() {
		return this.ditPersonas;
	}

	public void setDitPersonas(List<DitPersonaDO> ditPersonas) {
		this.ditPersonas = ditPersonas;
	}


	public List<DitSocioDO> getDitSocios() {
		return this.ditSocios;
	}

	public void setDitSocios(List<DitSocioDO> ditSocios) {
		this.ditSocios = ditSocios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveEnt == null) ? 0 : cveEnt.hashCode());
		result = prime * result + ((dgCatEstadoCp == null) ? 0 : dgCatEstadoCp.hashCode());
		result = prime * result + ((dgCatMunicipios == null) ? 0 : dgCatMunicipios.hashCode());
		result = prime * result + ((dicPai == null) ? 0 : dicPai.hashCode());
		result = prime * result + ((ditPersonas == null) ? 0 : ditPersonas.hashCode());
		result = prime * result + ((ditSocios == null) ? 0 : ditSocios.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((nomEnt == null) ? 0 : nomEnt.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DgCatEstadoDO other = (DgCatEstadoDO) obj;
		if (cveEnt == null) {
			if (other.cveEnt != null)
				return false;
		} else if (!cveEnt.equals(other.cveEnt))
			return false;
		if (dgCatEstadoCp == null) {
			if (other.dgCatEstadoCp != null)
				return false;
		} else if (!dgCatEstadoCp.equals(other.dgCatEstadoCp))
			return false;
		if (dgCatMunicipios == null) {
			if (other.dgCatMunicipios != null)
				return false;
		} else if (!dgCatMunicipios.equals(other.dgCatMunicipios))
			return false;
		if (dicPai == null) {
			if (other.dicPai != null)
				return false;
		} else if (!dicPai.equals(other.dicPai))
			return false;
		if (ditPersonas == null) {
			if (other.ditPersonas != null)
				return false;
		} else if (!ditPersonas.equals(other.ditPersonas))
			return false;
		if (ditSocios == null) {
			if (other.ditSocios != null)
				return false;
		} else if (!ditSocios.equals(other.ditSocios))
			return false;
		if (fecRegistroBaja == null) {
			if (other.fecRegistroBaja != null)
				return false;
		} else if (!fecRegistroBaja.equals(other.fecRegistroBaja))
			return false;
		if (nomEnt == null) {
			if (other.nomEnt != null)
				return false;
		} else if (!nomEnt.equals(other.nomEnt))
			return false;
		return true;
	}
	
	

}