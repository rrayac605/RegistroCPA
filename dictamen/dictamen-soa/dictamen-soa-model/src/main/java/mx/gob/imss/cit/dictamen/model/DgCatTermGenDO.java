package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_TERM_GEN database table.
 * 
 */
@Entity
@Table(name="DG_CAT_TERM_GEN")
@NamedQuery(name="DgCatTermGenDO.findAll", query="SELECT d FROM DgCatTermGenDO d")
public class DgCatTermGenDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_TER")
	private long cveTer;

	private String nombre;

	//bi-directional many-to-one association to DgDomiciliosCaminosDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatTermGen")
	private List<DgDomiciliosCaminosDO> dgDomiciliosCaminos;

	//bi-directional many-to-one association to DgDomiciliosCarreterasDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatTermGen")
	private List<DgDomiciliosCarreterasDO> dgDomiciliosCarreteras;

	public DgCatTermGenDO() {
	}

	public long getCveTer() {
		return this.cveTer;
	}

	public void setCveTer(long cveTer) {
		this.cveTer = cveTer;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<DgDomiciliosCaminosDO> getDgDomiciliosCaminos() {
		return this.dgDomiciliosCaminos;
	}

	public void setDgDomiciliosCaminos(List<DgDomiciliosCaminosDO> dgDomiciliosCaminos) {
		this.dgDomiciliosCaminos = dgDomiciliosCaminos;
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
		result = prime * result + (int) (cveTer ^ (cveTer >>> 32));
		result = prime * result + ((dgDomiciliosCaminos == null) ? 0 : dgDomiciliosCaminos.hashCode());
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
		DgCatTermGenDO other = (DgCatTermGenDO) obj;
		if (cveTer != other.cveTer)
			return false;
		if (dgDomiciliosCaminos == null) {
			if (other.dgDomiciliosCaminos != null)
				return false;
		} else if (!dgDomiciliosCaminos.equals(other.dgDomiciliosCaminos))
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