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
	@OneToMany(mappedBy="dgCatDerechosTransito")
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


}