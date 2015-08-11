package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_ASENTAMIENTO database table.
 * 
 */
@Entity
@Table(name="DG_ASENTAMIENTO")
@NamedQuery(name="DgAsentamientoDO.findAll", query="SELECT d FROM DgAsentamientoDO d")
public class DgAsentamientoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DgAsentamientoDOPK id;

	private String agregado;

	@Column(name="NOM_ASEN")
	private String nomAsen;

	//bi-directional many-to-one association to DgCatMunicipioDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN")
		})
	private DgCatMunicipioDO dgCatMunicipio;

	//bi-directional many-to-one association to DgCatTipoAsenDO
	@ManyToOne
	@JoinColumn(name="CVE_TIPO_ASEN")
	private DgCatTipoAsenDO dgCatTipoAsen;

	//bi-directional many-to-one association to DgCodigosPostalesDO
	@OneToMany(mappedBy="dgAsentamiento")
	private List<DgCodigosPostalesDO> dgCodigosPostales;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@OneToMany(mappedBy="dgAsentamiento")
	private List<DgDomicilioGeograficoDO> dgDomicilioGeograficos;

	public DgAsentamientoDO() {
	}

	public DgAsentamientoDOPK getId() {
		return this.id;
	}

	public void setId(DgAsentamientoDOPK id) {
		this.id = id;
	}

	public String getAgregado() {
		return this.agregado;
	}

	public void setAgregado(String agregado) {
		this.agregado = agregado;
	}

	public String getNomAsen() {
		return this.nomAsen;
	}

	public void setNomAsen(String nomAsen) {
		this.nomAsen = nomAsen;
	}

	public DgCatMunicipioDO getDgCatMunicipio() {
		return this.dgCatMunicipio;
	}

	public void setDgCatMunicipio(DgCatMunicipioDO dgCatMunicipio) {
		this.dgCatMunicipio = dgCatMunicipio;
	}

	public DgCatTipoAsenDO getDgCatTipoAsen() {
		return this.dgCatTipoAsen;
	}

	public void setDgCatTipoAsen(DgCatTipoAsenDO dgCatTipoAsen) {
		this.dgCatTipoAsen = dgCatTipoAsen;
	}

	public List<DgCodigosPostalesDO> getDgCodigosPostales() {
		return this.dgCodigosPostales;
	}

	public void setDgCodigosPostales(List<DgCodigosPostalesDO> dgCodigosPostales) {
		this.dgCodigosPostales = dgCodigosPostales;
	}

	public List<DgDomicilioGeograficoDO> getDgDomicilioGeograficos() {
		return this.dgDomicilioGeograficos;
	}

	public void setDgDomicilioGeograficos(List<DgDomicilioGeograficoDO> dgDomicilioGeograficos) {
		this.dgDomicilioGeograficos = dgDomicilioGeograficos;
	}
	

}