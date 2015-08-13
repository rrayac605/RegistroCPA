package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DG_CAT_ESTADO_CP database table.
 * 
 */
@Entity
@Table(name="DG_CAT_ESTADO_CP")
@NamedQuery(name="DgCatEstadoCpDO.findAll", query="SELECT d FROM DgCatEstadoCpDO d")
public class DgCatEstadoCpDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ENT")
	private String cveEnt;

	@Column(name="CP_FINAL")
	private String cpFinal;

	@Column(name="CP_INICIAL")
	private String cpInicial;

	//bi-directional one-to-one association to DgCatEstadoDO
	@OneToOne
	@JoinColumn(name="CVE_ENT", insertable=false, updatable=false)
	private DgCatEstadoDO dgCatEstado;

	public DgCatEstadoCpDO() {
	}

	public String getCveEnt() {
		return this.cveEnt;
	}

	public void setCveEnt(String cveEnt) {
		this.cveEnt = cveEnt;
	}

	public String getCpFinal() {
		return this.cpFinal;
	}

	public void setCpFinal(String cpFinal) {
		this.cpFinal = cpFinal;
	}

	public String getCpInicial() {
		return this.cpInicial;
	}

	public void setCpInicial(String cpInicial) {
		this.cpInicial = cpInicial;
	}

	public DgCatEstadoDO getDgCatEstado() {
		return this.dgCatEstado;
	}

	public void setDgCatEstado(DgCatEstadoDO dgCatEstado) {
		this.dgCatEstado = dgCatEstado;
	}

}