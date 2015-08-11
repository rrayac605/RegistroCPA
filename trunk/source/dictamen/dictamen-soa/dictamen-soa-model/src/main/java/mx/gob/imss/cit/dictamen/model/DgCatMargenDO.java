package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_MARGEN database table.
 * 
 */
@Entity
@Table(name="DG_CAT_MARGEN")
@NamedQuery(name="DgCatMargenDO.findAll", query="SELECT d FROM DgCatMargenDO d")
public class DgCatMargenDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_MARGEN")
	private long cveMargen;

	private String descripcion;

	//bi-directional many-to-one association to DgDomiciliosCaminosDO
	@OneToMany(mappedBy="dgCatMargen")
	private List<DgDomiciliosCaminosDO> dgDomiciliosCaminos;

	public DgCatMargenDO() {
	}

	public long getCveMargen() {
		return this.cveMargen;
	}

	public void setCveMargen(long cveMargen) {
		this.cveMargen = cveMargen;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<DgDomiciliosCaminosDO> getDgDomiciliosCaminos() {
		return this.dgDomiciliosCaminos;
	}

	public void setDgDomiciliosCaminos(List<DgDomiciliosCaminosDO> dgDomiciliosCaminos) {
		this.dgDomiciliosCaminos = dgDomiciliosCaminos;
	}

}