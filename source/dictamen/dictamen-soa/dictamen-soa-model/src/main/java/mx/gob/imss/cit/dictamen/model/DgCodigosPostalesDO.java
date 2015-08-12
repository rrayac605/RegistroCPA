package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DG_CODIGOS_POSTALES database table.
 * 
 */
@Entity
@Table(name="DG_CODIGOS_POSTALES")
@NamedQuery(name="DgCodigosPostalesDO.findAll", query="SELECT d FROM DgCodigosPostalesDO d")
public class DgCodigosPostalesDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DgCodigosPostalesDOPK id;

	private String agregado;

	//bi-directional many-to-one association to DgAsentamientoDO
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CVE_ASEN", referencedColumnName="CVE_ASEN"),
		@JoinColumn(name="CVE_ENT", referencedColumnName="CVE_ENT"),
		@JoinColumn(name="CVE_MUN", referencedColumnName="CVE_MUN")
		})
	private DgAsentamientoDO dgAsentamiento;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="dgCodigosPostale")
	private List<DgDomicilioGeograficoDO> dgDomicilioGeograficos;

	public DgCodigosPostalesDO() {
	}

	public DgCodigosPostalesDOPK getId() {
		return this.id;
	}

	public void setId(DgCodigosPostalesDOPK id) {
		this.id = id;
	}

	public String getAgregado() {
		return this.agregado;
	}

	public void setAgregado(String agregado) {
		this.agregado = agregado;
	}

	public DgAsentamientoDO getDgAsentamiento() {
		return this.dgAsentamiento;
	}

	public void setDgAsentamiento(DgAsentamientoDO dgAsentamiento) {
		this.dgAsentamiento = dgAsentamiento;
	}

	public List<DgDomicilioGeograficoDO> getDgDomicilioGeograficos() {
		return this.dgDomicilioGeograficos;
	}

	public void setDgDomicilioGeograficos(List<DgDomicilioGeograficoDO> dgDomicilioGeograficos) {
		this.dgDomicilioGeograficos = dgDomicilioGeograficos;
	}
	
}