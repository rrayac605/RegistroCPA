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

}