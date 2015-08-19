package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_TIPO_ASEN database table.
 * 
 */
@Entity
@Table(name="DG_CAT_TIPO_ASEN")
@NamedQuery(name="DgCatTipoAsenDO.findAll", query="SELECT d FROM DgCatTipoAsenDO d")
public class DgCatTipoAsenDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_TIPO_ASEN")
	private long cveTipoAsen;

	private String nombre;

	//bi-directional many-to-one association to DgAsentamientoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatTipoAsen")
	private List<DgAsentamientoDO> dgAsentamientos;

	public DgCatTipoAsenDO() {
	}

	public long getCveTipoAsen() {
		return this.cveTipoAsen;
	}

	public void setCveTipoAsen(long cveTipoAsen) {
		this.cveTipoAsen = cveTipoAsen;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<DgAsentamientoDO> getDgAsentamientos() {
		return this.dgAsentamientos;
	}

	public void setDgAsentamientos(List<DgAsentamientoDO> dgAsentamientos) {
		this.dgAsentamientos = dgAsentamientos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveTipoAsen ^ (cveTipoAsen >>> 32));
		result = prime * result + ((dgAsentamientos == null) ? 0 : dgAsentamientos.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		DgCatTipoAsenDO other = (DgCatTipoAsenDO) obj;
		if (cveTipoAsen != other.cveTipoAsen)
			return false;
		if (dgAsentamientos == null) {
			if (other.dgAsentamientos != null)
				return false;
		} else if (!dgAsentamientos.equals(other.dgAsentamientos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
}