package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CAT_TIPO_DOM database table.
 * 
 */
@Entity
@Table(name="DG_CAT_TIPO_DOM")
@NamedQuery(name="DgCatTipoDomDO.findAll", query="SELECT d FROM DgCatTipoDomDO d")
public class DgCatTipoDomDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_TIPO_DOM")
	private long cveTipoDom;

	@Column(name="COMP_ESPAC")
	private String compEspac;

	private String descripcion;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCatTipoDom")
	private List<DgDomicilioGeograficoDO> dgDomicilioGeograficos;

	public DgCatTipoDomDO() {
	}

	public long getCveTipoDom() {
		return this.cveTipoDom;
	}

	public void setCveTipoDom(long cveTipoDom) {
		this.cveTipoDom = cveTipoDom;
	}

	public String getCompEspac() {
		return this.compEspac;
	}

	public void setCompEspac(String compEspac) {
		this.compEspac = compEspac;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<DgDomicilioGeograficoDO> getDgDomicilioGeograficos() {
		return this.dgDomicilioGeograficos;
	}

	public void setDgDomicilioGeograficos(List<DgDomicilioGeograficoDO> dgDomicilioGeograficos) {
		this.dgDomicilioGeograficos = dgDomicilioGeograficos;
	}
}