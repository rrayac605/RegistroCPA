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

	

}