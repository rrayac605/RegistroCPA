package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_DERECHOS_TRANSITO database table.
 * 
 */
@Entity
@Table(name="DG_CAT_DERECHOS_TRANSITO")
@NamedQuery(name="DgCatDerechosTransitoDO.findAll", query="SELECT d FROM DgCatDerechosTransitoDO d")
public class DgCatDerechosTransitoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_CDT")
	private long cveCdt;

	private String nombre;

	//bi-directional many-to-one association to DgDomiciliosCarreterasDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatDerechosTransito")
	private List<DgDomiciliosCarreterasDO> dgDomiciliosCarreteras;

	public DgCatDerechosTransitoDO() {
	}

	public long getCveCdt() {
		return this.cveCdt;
	}

	public void setCveCdt(long cveCdt) {
		this.cveCdt = cveCdt;
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
		result = prime * result + (int) (cveCdt ^ (cveCdt >>> 32));
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
		DgCatDerechosTransitoDO other = (DgCatDerechosTransitoDO) obj;
		if (cveCdt != other.cveCdt)
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