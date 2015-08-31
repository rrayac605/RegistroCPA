package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_ADMINISTRACION database table.
 * 
 */
@Entity
@Table(name="DG_CAT_ADMINISTRACION")
@NamedQuery(name="DgCatAdministracionDO.findAll", query="SELECT d FROM DgCatAdministracionDO d")
public class DgCatAdministracionDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_CAC")
	private long cveCac;

	private String nombre;

	//bi-directional many-to-one association to DgDomiciliosCarreterasDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatAdministracion")
	private List<DgDomiciliosCarreterasDO> dgDomiciliosCarreteras;

	public DgCatAdministracionDO() {
	}

	public long getCveCac() {
		return this.cveCac;
	}

	public void setCveCac(long cveCac) {
		this.cveCac = cveCac;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<DgDomiciliosCarreterasDO> getDgDomiciliosCarreteras() {
		return this.dgDomiciliosCarreteras;
	}

	public void setDgDomiciliosCarreteras(List<DgDomiciliosCarreterasDO> dgDomiciliosCarreteras) {
		this.dgDomiciliosCarreteras = dgDomiciliosCarreteras;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cveCac ^ (cveCac >>> 32));
		result = prime * result + ((dgDomiciliosCarreteras == null) ? 0 : dgDomiciliosCarreteras.hashCode());
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
		DgCatAdministracionDO other = (DgCatAdministracionDO) obj;
		if (cveCac != other.cveCac)
			return false;
		if (dgDomiciliosCarreteras == null) {
			if (other.dgDomiciliosCarreteras != null)
				return false;
		} else if (!dgDomiciliosCarreteras.equals(other.dgDomiciliosCarreteras))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	

}