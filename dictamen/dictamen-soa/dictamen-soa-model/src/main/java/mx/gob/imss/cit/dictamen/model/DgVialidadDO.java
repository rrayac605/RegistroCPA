package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DG_VIALIDAD database table.
 * 
 */
@Entity
@Table(name="DG_VIALIDAD")
@NamedQuery(name="DgVialidadDO.findAll", query="SELECT d FROM DgVialidadDO d")
public class DgVialidadDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_VIA")
	private long cveVia;

	private String agregada;

	@Column(name="NOM_VIA")
	private String nomVia;

	//bi-directional many-to-one association to DgCatAmbitoDO
	@ManyToOne
	@JoinColumn(name="AMBITO")
	private DgCatAmbitoDO dgCatAmbito;

	//bi-directional many-to-one association to DgCatLocalidadDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_LOC", referencedColumnName="CVE_LOC"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN"),
		@JoinColumn(name="CVE_PERIODO", referencedColumnName="CVE_PERIODO")
		})
	private DgCatLocalidadDO dgCatLocalidad;

	//bi-directional many-to-one association to DgCatVialidadDO
	@ManyToOne
	@JoinColumn(name="CVE_TIPO_VIAL")
	private DgCatVialidadDO dgCatVialidad;

	public DgVialidadDO() {
	}

	public long getCveVia() {
		return this.cveVia;
	}

	public void setCveVia(long cveVia) {
		this.cveVia = cveVia;
	}

	public String getAgregada() {
		return this.agregada;
	}

	public void setAgregada(String agregada) {
		this.agregada = agregada;
	}

	public String getNomVia() {
		return this.nomVia;
	}

	public void setNomVia(String nomVia) {
		this.nomVia = nomVia;
	}

	public DgCatAmbitoDO getDgCatAmbito() {
		return this.dgCatAmbito;
	}

	public void setDgCatAmbito(DgCatAmbitoDO dgCatAmbito) {
		this.dgCatAmbito = dgCatAmbito;
	}

	public DgCatLocalidadDO getDgCatLocalidad() {
		return this.dgCatLocalidad;
	}

	public void setDgCatLocalidad(DgCatLocalidadDO dgCatLocalidad) {
		this.dgCatLocalidad = dgCatLocalidad;
	}

	public DgCatVialidadDO getDgCatVialidad() {
		return this.dgCatVialidad;
	}

	public void setDgCatVialidad(DgCatVialidadDO dgCatVialidad) {
		this.dgCatVialidad = dgCatVialidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agregada == null) ? 0 : agregada.hashCode());
		result = prime * result + (int) (cveVia ^ (cveVia >>> 32));
		result = prime * result + ((dgCatAmbito == null) ? 0 : dgCatAmbito.hashCode());
		result = prime * result + ((dgCatLocalidad == null) ? 0 : dgCatLocalidad.hashCode());
		result = prime * result + ((dgCatVialidad == null) ? 0 : dgCatVialidad.hashCode());
		result = prime * result + ((nomVia == null) ? 0 : nomVia.hashCode());
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
		DgVialidadDO other = (DgVialidadDO) obj;
		if (agregada == null) {
			if (other.agregada != null)
				return false;
		} else if (!agregada.equals(other.agregada))
			return false;
		if (cveVia != other.cveVia)
			return false;
		if (dgCatAmbito == null) {
			if (other.dgCatAmbito != null)
				return false;
		} else if (!dgCatAmbito.equals(other.dgCatAmbito))
			return false;
		if (dgCatLocalidad == null) {
			if (other.dgCatLocalidad != null)
				return false;
		} else if (!dgCatLocalidad.equals(other.dgCatLocalidad))
			return false;
		if (dgCatVialidad == null) {
			if (other.dgCatVialidad != null)
				return false;
		} else if (!dgCatVialidad.equals(other.dgCatVialidad))
			return false;
		if (nomVia == null) {
			if (other.nomVia != null)
				return false;
		} else if (!nomVia.equals(other.nomVia))
			return false;
		return true;
	}

}