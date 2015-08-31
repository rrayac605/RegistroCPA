package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_VIALIDAD database table.
 * 
 */
@Entity
@Table(name="DG_CAT_VIALIDAD")
@NamedQuery(name="DgCatVialidadDO.findAll", query="SELECT d FROM DgCatVialidadDO d")
public class DgCatVialidadDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_TIPO_VIAL")
	private long cveTipoVial;

	private String descripcion;

	//bi-directional many-to-one association to DgVialidadDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatVialidad")
	private List<DgVialidadDO> dgVialidads;

	public DgCatVialidadDO() {
	}

	public long getCveTipoVial() {
		return this.cveTipoVial;
	}

	public void setCveTipoVial(long cveTipoVial) {
		this.cveTipoVial = cveTipoVial;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<DgVialidadDO> getDgVialidads() {
		return this.dgVialidads;
	}

	public void setDgVialidads(List<DgVialidadDO> dgVialidads) {
		this.dgVialidads = dgVialidads;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveTipoVial ^ (cveTipoVial >>> 32));
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((dgVialidads == null) ? 0 : dgVialidads.hashCode());
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
		DgCatVialidadDO other = (DgCatVialidadDO) obj;
		if (cveTipoVial != other.cveTipoVial)
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (dgVialidads == null) {
			if (other.dgVialidads != null)
				return false;
		} else if (!dgVialidads.equals(other.dgVialidads))
			return false;
		return true;
	}
	
	

}