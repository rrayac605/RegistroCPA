package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_AMBITO database table.
 * 
 */
@Entity
@Table(name="DG_CAT_AMBITO")
@NamedQuery(name="DgCatAmbitoDO.findAll", query="SELECT d FROM DgCatAmbitoDO d")
public class DgCatAmbitoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long ambito;

	private String nombre;

	//bi-directional many-to-one association to DgCatLocalidadDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatAmbito")
	private List<DgCatLocalidadDO> dgCatLocalidads;

	//bi-directional many-to-one association to DgVialidadDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatAmbito")
	private List<DgVialidadDO> dgVialidads;

	public DgCatAmbitoDO() {
	}

	public long getAmbito() {
		return this.ambito;
	}

	public void setAmbito(long ambito) {
		this.ambito = ambito;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<DgCatLocalidadDO> getDgCatLocalidads() {
		return this.dgCatLocalidads;
	}

	public void setDgCatLocalidads(List<DgCatLocalidadDO> dgCatLocalidads) {
		this.dgCatLocalidads = dgCatLocalidads;
	}

	

	public List<DgVialidadDO> getDgVialidads() {
		return this.dgVialidads;
	}

	public void setDgVialidads(List<DgVialidadDO> dgVialidads) {
		this.dgVialidads = dgVialidads;
	}

}