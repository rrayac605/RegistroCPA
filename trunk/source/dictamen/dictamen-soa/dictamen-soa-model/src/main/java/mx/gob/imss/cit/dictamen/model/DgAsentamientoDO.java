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
	@OneToMany(fetch = FetchType.LAZY, mappedBy="dgAsentamiento" )
	private List<DgCodigosPostalesDO> dgCodigosPostales;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@OneToMany(fetch = FetchType.LAZY, mappedBy="dgAsentamiento")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agregado == null) ? 0 : agregado.hashCode());
		result = prime * result + ((dgCatMunicipio == null) ? 0 : dgCatMunicipio.hashCode());
		result = prime * result + ((dgCatTipoAsen == null) ? 0 : dgCatTipoAsen.hashCode());
		result = prime * result + ((dgCodigosPostales == null) ? 0 : dgCodigosPostales.hashCode());
		result = prime * result + ((dgDomicilioGeograficos == null) ? 0 : dgDomicilioGeograficos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomAsen == null) ? 0 : nomAsen.hashCode());
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
		DgAsentamientoDO other = (DgAsentamientoDO) obj;
		if (agregado == null) {
			if (other.agregado != null)
				return false;
		} else if (!agregado.equals(other.agregado))
			return false;
		if (dgCatMunicipio == null) {
			if (other.dgCatMunicipio != null)
				return false;
		} else if (!dgCatMunicipio.equals(other.dgCatMunicipio))
			return false;
		if (dgCatTipoAsen == null) {
			if (other.dgCatTipoAsen != null)
				return false;
		} else if (!dgCatTipoAsen.equals(other.dgCatTipoAsen))
			return false;
		if (dgCodigosPostales == null) {
			if (other.dgCodigosPostales != null)
				return false;
		} else if (!dgCodigosPostales.equals(other.dgCodigosPostales))
			return false;
		if (dgDomicilioGeograficos == null) {
			if (other.dgDomicilioGeograficos != null)
				return false;
		} else if (!dgDomicilioGeograficos.equals(other.dgDomicilioGeograficos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomAsen == null) {
			if (other.nomAsen != null)
				return false;
		} else if (!nomAsen.equals(other.nomAsen))
			return false;
		return true;
	}
	
	
	

}