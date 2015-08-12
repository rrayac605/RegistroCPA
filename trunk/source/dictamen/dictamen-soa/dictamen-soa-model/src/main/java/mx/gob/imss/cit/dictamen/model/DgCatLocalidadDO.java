package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_LOCALIDAD database table.
 * 
 */
@Entity
@Table(name="DG_CAT_LOCALIDAD")
@NamedQuery(name="DgCatLocalidadDO.findAll", query="SELECT d FROM DgCatLocalidadDO d")
public class DgCatLocalidadDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DgCatLocalidadDOPK id;

	private String agregada;

	@Column(name="NOM_LOC")
	private String nomLoc;

	//bi-directional many-to-one association to DgCatAmbitoDO
	@ManyToOne
	@JoinColumn(name="AMBITO")
	private DgCatAmbitoDO dgCatAmbito;

	//bi-directional many-to-one association to DgCatMunicipioDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN")
		})
	private DgCatMunicipioDO dgCatMunicipio;

	//bi-directional many-to-one association to DgCatPeriodoDO
	@ManyToOne
	@JoinColumn(name="CVE_PERIODO")
	private DgCatPeriodoDO dgCatPeriodo;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatLocalidad")
	private List<DgDomicilioGeograficoDO> dgDomicilioGeograficos;

	//bi-directional many-to-one association to DgVialidadDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatLocalidad")
	private List<DgVialidadDO> dgVialidads;

	public DgCatLocalidadDO() {
	}

	public DgCatLocalidadDOPK getId() {
		return this.id;
	}

	public void setId(DgCatLocalidadDOPK id) {
		this.id = id;
	}

	public String getAgregada() {
		return this.agregada;
	}

	public void setAgregada(String agregada) {
		this.agregada = agregada;
	}

	public String getNomLoc() {
		return this.nomLoc;
	}

	public void setNomLoc(String nomLoc) {
		this.nomLoc = nomLoc;
	}

	public DgCatAmbitoDO getDgCatAmbito() {
		return this.dgCatAmbito;
	}

	public void setDgCatAmbito(DgCatAmbitoDO dgCatAmbito) {
		this.dgCatAmbito = dgCatAmbito;
	}

	public DgCatMunicipioDO getDgCatMunicipio() {
		return this.dgCatMunicipio;
	}

	public void setDgCatMunicipio(DgCatMunicipioDO dgCatMunicipio) {
		this.dgCatMunicipio = dgCatMunicipio;
	}

	public DgCatPeriodoDO getDgCatPeriodo() {
		return this.dgCatPeriodo;
	}

	public void setDgCatPeriodo(DgCatPeriodoDO dgCatPeriodo) {
		this.dgCatPeriodo = dgCatPeriodo;
	}

	public List<DgDomicilioGeograficoDO> getDgDomicilioGeograficos() {
		return this.dgDomicilioGeograficos;
	}

	public void setDgDomicilioGeograficos(List<DgDomicilioGeograficoDO> dgDomicilioGeograficos) {
		this.dgDomicilioGeograficos = dgDomicilioGeograficos;
	}

	public List<DgVialidadDO> getDgVialidads() {
		return this.dgVialidads;
	}

	public void setDgVialidads(List<DgVialidadDO> dgVialidads) {
		this.dgVialidads = dgVialidads;
	}

}