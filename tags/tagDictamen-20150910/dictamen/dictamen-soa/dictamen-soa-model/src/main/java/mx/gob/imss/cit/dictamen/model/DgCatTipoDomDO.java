package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_TIPO_DOM database table.
 * 
 */
@Entity
@Table(name="DG_CAT_TIPO_DOM")
@NamedQuery(name="DgCatTipoDomDO.findAll", query="SELECT d FROM DgCatTipoDomDO d")
public class DgCatTipoDomDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_TIPO_DOM")
	private long cveTipoDom;

	@Column(name="COMP_ESPAC")
	private String compEspac;

	private String descripcion;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatTipoDom")
	private List<DgDomicilioGeograficoDO> dgDomicilioGeograficos;

	public DgCatTipoDomDO() {
	}

	public long getCveTipoDom() {
		return this.cveTipoDom;
	}

	public void setCveTipoDom(long cveTipoDom) {
		this.cveTipoDom = cveTipoDom;
	}

	public String getCompEspac() {
		return this.compEspac;
	}

	public void setCompEspac(String compEspac) {
		this.compEspac = compEspac;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
		result = prime * result + ((compEspac == null) ? 0 : compEspac.hashCode());
		result = prime * result + (int) (cveTipoDom ^ (cveTipoDom >>> 32));
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((dgDomicilioGeograficos == null) ? 0 : dgDomicilioGeograficos.hashCode());
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
		DgCatTipoDomDO other = (DgCatTipoDomDO) obj;
		if (compEspac == null) {
			if (other.compEspac != null)
				return false;
		} else if (!compEspac.equals(other.compEspac))
			return false;
		if (cveTipoDom != other.cveTipoDom)
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (dgDomicilioGeograficos == null) {
			if (other.dgDomicilioGeograficos != null)
				return false;
		} else if (!dgDomicilioGeograficos.equals(other.dgDomicilioGeograficos))
			return false;
		return true;
	}
	
	
}