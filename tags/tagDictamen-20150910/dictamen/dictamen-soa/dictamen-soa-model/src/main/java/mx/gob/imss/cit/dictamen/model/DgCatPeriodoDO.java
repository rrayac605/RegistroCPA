package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DG_CAT_PERIODO database table.
 * 
 */
@Entity
@Table(name="DG_CAT_PERIODO")
@NamedQuery(name="DgCatPeriodoDO.findAll", query="SELECT d FROM DgCatPeriodoDO d")
public class DgCatPeriodoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_PERIODO")
	private long cvePeriodo;

	private String descripcion;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	//bi-directional many-to-one association to DgCatLocalidadDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatPeriodo")
	private List<DgCatLocalidadDO> dgCatLocalidads;

	public DgCatPeriodoDO() {
	}

	public long getCvePeriodo() {
		return this.cvePeriodo;
	}

	public void setCvePeriodo(long cvePeriodo) {
		this.cvePeriodo = cvePeriodo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<DgCatLocalidadDO> getDgCatLocalidads() {
		return this.dgCatLocalidads;
	}

	public void setDgCatLocalidads(List<DgCatLocalidadDO> dgCatLocalidads) {
		this.dgCatLocalidads = dgCatLocalidads;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cvePeriodo ^ (cvePeriodo >>> 32));
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((dgCatLocalidads == null) ? 0 : dgCatLocalidads.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
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
		DgCatPeriodoDO other = (DgCatPeriodoDO) obj;
		if (cvePeriodo != other.cvePeriodo)
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (dgCatLocalidads == null) {
			if (other.dgCatLocalidads != null)
				return false;
		} else if (!dgCatLocalidads.equals(other.dgCatLocalidads))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		return true;
	}
	
	

}