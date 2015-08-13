package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DG_DOMICILIOS_CAMINOS database table.
 * 
 */
@Entity
@Table(name="DG_DOMICILIOS_CAMINOS")
@NamedQuery(name="DgDomiciliosCaminosDO.findAll", query="SELECT d FROM DgDomiciliosCaminosDO d")
public class DgDomiciliosCaminosDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DOMICILIO_ID")
	private long domicilioId;

	private String cadenamiento;

	private String destino;

	private String nomvial;

	private String origen;

	//bi-directional many-to-one association to DgCatMargenDO
	@ManyToOne
	@JoinColumn(name="CVE_MARGEN")
	private DgCatMargenDO dgCatMargen;

	//bi-directional many-to-one association to DgCatTermGenDO
	@ManyToOne
	@JoinColumn(name="CVE_TER")
	private DgCatTermGenDO dgCatTermGen;

	//bi-directional one-to-one association to DgDomicilioGeograficoDO
	@OneToOne
	@JoinColumn(name="DOMICILIO_ID", insertable=false, updatable=false)
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	public DgDomiciliosCaminosDO() {
	}

	public long getDomicilioId() {
		return this.domicilioId;
	}

	public void setDomicilioId(long domicilioId) {
		this.domicilioId = domicilioId;
	}

	public String getCadenamiento() {
		return this.cadenamiento;
	}

	public void setCadenamiento(String cadenamiento) {
		this.cadenamiento = cadenamiento;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getNomvial() {
		return this.nomvial;
	}

	public void setNomvial(String nomvial) {
		this.nomvial = nomvial;
	}

	public String getOrigen() {
		return this.origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public DgCatMargenDO getDgCatMargen() {
		return this.dgCatMargen;
	}

	public void setDgCatMargen(DgCatMargenDO dgCatMargen) {
		this.dgCatMargen = dgCatMargen;
	}

	public DgCatTermGenDO getDgCatTermGen() {
		return this.dgCatTermGen;
	}

	public void setDgCatTermGen(DgCatTermGenDO dgCatTermGen) {
		this.dgCatTermGen = dgCatTermGen;
	}

	public DgDomicilioGeograficoDO getDgDomicilioGeografico() {
		return this.dgDomicilioGeografico;
	}

	public void setDgDomicilioGeografico(DgDomicilioGeograficoDO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

}