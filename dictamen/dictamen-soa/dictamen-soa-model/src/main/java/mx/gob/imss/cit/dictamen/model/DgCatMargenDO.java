package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_MARGEN database table.
 * 
 */
@Entity
@Table(name="DG_CAT_MARGEN")
@NamedQuery(name="DgCatMargenDO.findAll", query="SELECT d FROM DgCatMargenDO d")
public class DgCatMargenDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_MARGEN")
	private long cveMargen;

	private String descripcion;

	//bi-directional many-to-one association to DgDomiciliosCaminosDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatMargen")
	private List<DgDomiciliosCaminosDO> dgDomiciliosCaminos;

	public DgCatMargenDO() {
	}

	public long getCveMargen() {
		return this.cveMargen;
	}

	public void setCveMargen(long cveMargen) {
		this.cveMargen = cveMargen;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<DgDomiciliosCaminosDO> getDgDomiciliosCaminos() {
		return this.dgDomiciliosCaminos;
	}

	public void setDgDomiciliosCaminos(List<DgDomiciliosCaminosDO> dgDomiciliosCaminos) {
		this.dgDomiciliosCaminos = dgDomiciliosCaminos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveMargen ^ (cveMargen >>> 32));
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((dgDomiciliosCaminos == null) ? 0 : dgDomiciliosCaminos.hashCode());
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
		DgCatMargenDO other = (DgCatMargenDO) obj;
		if (cveMargen != other.cveMargen)
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (dgDomiciliosCaminos == null) {
			if (other.dgDomiciliosCaminos != null)
				return false;
		} else if (!dgDomiciliosCaminos.equals(other.dgDomiciliosCaminos))
			return false;
		return true;
	}
	
	

}