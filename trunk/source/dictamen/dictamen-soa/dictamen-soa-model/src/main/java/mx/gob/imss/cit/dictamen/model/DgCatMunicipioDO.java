package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_MUNICIPIO database table.
 * 
 */
@Entity
@Table(name="DG_CAT_MUNICIPIO")
@NamedQuery(name="DgCatMunicipioDO.findAll", query="SELECT d FROM DgCatMunicipioDO d")
public class DgCatMunicipioDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DgCatMunicipioDOPK id;

	@Column(name="NOM_MUN")
	private String nomMun;

	//bi-directional many-to-one association to DgAsentamientoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatMunicipio")
	private List<DgAsentamientoDO> dgAsentamientos;

	//bi-directional many-to-one association to DgCatLocalidadDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatMunicipio")
	private List<DgCatLocalidadDO> dgCatLocalidads;

	//bi-directional many-to-one association to DgCatEstadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ENT")
	private DgCatEstadoDO dgCatEstado;

	//bi-directional many-to-one association to DitActaConstitutivaDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatMunicipio")
	private List<DitActaConstitutivaDO> ditActaConstitutivas;

	//bi-directional many-to-one association to DitPersonaDefuncionDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatMunicipio")
	private List<DitPersonaDefuncionDO> ditPersonaDefuncions;

	public DgCatMunicipioDO() {
	}

	public DgCatMunicipioDOPK getId() {
		return this.id;
	}

	public void setId(DgCatMunicipioDOPK id) {
		this.id = id;
	}

	public String getNomMun() {
		return this.nomMun;
	}

	public void setNomMun(String nomMun) {
		this.nomMun = nomMun;
	}

	public List<DgAsentamientoDO> getDgAsentamientos() {
		return this.dgAsentamientos;
	}

	public void setDgAsentamientos(List<DgAsentamientoDO> dgAsentamientos) {
		this.dgAsentamientos = dgAsentamientos;
	}

	public List<DgCatLocalidadDO> getDgCatLocalidads() {
		return this.dgCatLocalidads;
	}

	public void setDgCatLocalidads(List<DgCatLocalidadDO> dgCatLocalidads) {
		this.dgCatLocalidads = dgCatLocalidads;
	}

	public DgCatEstadoDO getDgCatEstado() {
		return this.dgCatEstado;
	}

	public void setDgCatEstado(DgCatEstadoDO dgCatEstado) {
		this.dgCatEstado = dgCatEstado;
	}

	public List<DitActaConstitutivaDO> getDitActaConstitutivas() {
		return this.ditActaConstitutivas;
	}

	public void setDitActaConstitutivas(List<DitActaConstitutivaDO> ditActaConstitutivas) {
		this.ditActaConstitutivas = ditActaConstitutivas;
	}

	public List<DitPersonaDefuncionDO> getDitPersonaDefuncions() {
		return this.ditPersonaDefuncions;
	}

	public void setDitPersonaDefuncions(List<DitPersonaDefuncionDO> ditPersonaDefuncions) {
		this.ditPersonaDefuncions = ditPersonaDefuncions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dgAsentamientos == null) ? 0 : dgAsentamientos.hashCode());
		result = prime * result + ((dgCatEstado == null) ? 0 : dgCatEstado.hashCode());
		result = prime * result + ((dgCatLocalidads == null) ? 0 : dgCatLocalidads.hashCode());
		result = prime * result + ((ditActaConstitutivas == null) ? 0 : ditActaConstitutivas.hashCode());
		result = prime * result + ((ditPersonaDefuncions == null) ? 0 : ditPersonaDefuncions.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomMun == null) ? 0 : nomMun.hashCode());
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
		DgCatMunicipioDO other = (DgCatMunicipioDO) obj;
		if (dgAsentamientos == null) {
			if (other.dgAsentamientos != null)
				return false;
		} else if (!dgAsentamientos.equals(other.dgAsentamientos))
			return false;
		if (dgCatEstado == null) {
			if (other.dgCatEstado != null)
				return false;
		} else if (!dgCatEstado.equals(other.dgCatEstado))
			return false;
		if (dgCatLocalidads == null) {
			if (other.dgCatLocalidads != null)
				return false;
		} else if (!dgCatLocalidads.equals(other.dgCatLocalidads))
			return false;
		if (ditActaConstitutivas == null) {
			if (other.ditActaConstitutivas != null)
				return false;
		} else if (!ditActaConstitutivas.equals(other.ditActaConstitutivas))
			return false;
		if (ditPersonaDefuncions == null) {
			if (other.ditPersonaDefuncions != null)
				return false;
		} else if (!ditPersonaDefuncions.equals(other.ditPersonaDefuncions))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomMun == null) {
			if (other.nomMun != null)
				return false;
		} else if (!nomMun.equals(other.nomMun))
			return false;
		return true;
	}
	
	

}