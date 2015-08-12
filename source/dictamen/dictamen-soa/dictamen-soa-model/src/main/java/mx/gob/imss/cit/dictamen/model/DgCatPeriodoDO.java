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

}