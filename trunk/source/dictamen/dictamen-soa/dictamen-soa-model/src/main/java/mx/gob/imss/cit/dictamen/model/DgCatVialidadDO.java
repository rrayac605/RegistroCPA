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

}