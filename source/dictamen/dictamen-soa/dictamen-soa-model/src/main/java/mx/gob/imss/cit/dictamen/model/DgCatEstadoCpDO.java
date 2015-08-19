package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DG_CAT_ESTADO_CP database table.
 * 
 */
@Entity
@Table(name="DG_CAT_ESTADO_CP")
@NamedQuery(name="DgCatEstadoCpDO.findAll", query="SELECT d FROM DgCatEstadoCpDO d")
public class DgCatEstadoCpDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ENT")
	private String cveEnt;

	@Column(name="CP_FINAL")
	private String cpFinal;

	@Column(name="CP_INICIAL")
	private String cpInicial;

	//bi-directional one-to-one association to DgCatEstadoDO
	@OneToOne
	@JoinColumn(name="CVE_ENT", insertable=false, updatable=false)
	private DgCatEstadoDO dgCatEstado;

	public DgCatEstadoCpDO() {
	}

	public String getCveEnt() {
		return this.cveEnt;
	}

	public void setCveEnt(String cveEnt) {
		this.cveEnt = cveEnt;
	}

	public String getCpFinal() {
		return this.cpFinal;
	}

	public void setCpFinal(String cpFinal) {
		this.cpFinal = cpFinal;
	}

	public String getCpInicial() {
		return this.cpInicial;
	}

	public void setCpInicial(String cpInicial) {
		this.cpInicial = cpInicial;
	}

	public DgCatEstadoDO getDgCatEstado() {
		return this.dgCatEstado;
	}

	public void setDgCatEstado(DgCatEstadoDO dgCatEstado) {
		this.dgCatEstado = dgCatEstado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpFinal == null) ? 0 : cpFinal.hashCode());
		result = prime * result + ((cpInicial == null) ? 0 : cpInicial.hashCode());
		result = prime * result + ((cveEnt == null) ? 0 : cveEnt.hashCode());
		result = prime * result + ((dgCatEstado == null) ? 0 : dgCatEstado.hashCode());
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
		DgCatEstadoCpDO other = (DgCatEstadoCpDO) obj;
		if (cpFinal == null) {
			if (other.cpFinal != null)
				return false;
		} else if (!cpFinal.equals(other.cpFinal))
			return false;
		if (cpInicial == null) {
			if (other.cpInicial != null)
				return false;
		} else if (!cpInicial.equals(other.cpInicial))
			return false;
		if (cveEnt == null) {
			if (other.cveEnt != null)
				return false;
		} else if (!cveEnt.equals(other.cveEnt))
			return false;
		if (dgCatEstado == null) {
			if (other.dgCatEstado != null)
				return false;
		} else if (!dgCatEstado.equals(other.dgCatEstado))
			return false;
		return true;
	}

}