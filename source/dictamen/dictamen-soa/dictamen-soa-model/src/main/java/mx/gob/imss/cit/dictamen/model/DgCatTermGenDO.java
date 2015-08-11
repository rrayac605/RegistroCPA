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
	@OneToMany(mappedBy="dgCatTermGen")
	private List<DgDomiciliosCaminosDO> dgDomiciliosCaminos;

	//bi-directional many-to-one association to DgDomiciliosCarreterasDO
	@OneToMany(mappedBy="dgCatTermGen")
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

}