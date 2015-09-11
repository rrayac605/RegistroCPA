package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CODIGOS_POSTALES database table.
 * 
 */
@Entity
@Table(name="DG_CODIGOS_POSTALES")
@NamedQuery(name="DgCodigosPostalesDO.findAll", query="SELECT d FROM DgCodigosPostalesDO d")
public class DgCodigosPostalesDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DgCodigosPostalesDOPK id;

	private String agregado;

	//bi-directional many-to-one association to DgAsentamientoDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CVE_ASEN", referencedColumnName="CVE_ASEN"),
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN")
		})
	private DgAsentamientoDO dgAsentamiento;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCodigosPostale")
	private List<DgDomicilioGeograficoDO> dgDomicilioGeograficos;

	public DgCodigosPostalesDO() {
	}

	public DgCodigosPostalesDOPK getId() {
		return this.id;
	}

	public void setId(DgCodigosPostalesDOPK id) {
		this.id = id;
	}

	public String getAgregado() {
		return this.agregado;
	}

	public void setAgregado(String agregado) {
		this.agregado = agregado;
	}

	public DgAsentamientoDO getDgAsentamiento() {
		return this.dgAsentamiento;
	}

	public void setDgAsentamiento(DgAsentamientoDO dgAsentamiento) {
		this.dgAsentamiento = dgAsentamiento;
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
		result = prime * result + ((dgAsentamiento == null) ? 0 : dgAsentamiento.hashCode());
		result = prime * result + ((dgDomicilioGeograficos == null) ? 0 : dgDomicilioGeograficos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		DgCodigosPostalesDO other = (DgCodigosPostalesDO) obj;
		if (agregado == null) {
			if (other.agregado != null)
				return false;
		} else if (!agregado.equals(other.agregado))
			return false;
		if (dgAsentamiento == null) {
			if (other.dgAsentamiento != null)
				return false;
		} else if (!dgAsentamiento.equals(other.dgAsentamiento))
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
		return true;
	}
	
	
	
}