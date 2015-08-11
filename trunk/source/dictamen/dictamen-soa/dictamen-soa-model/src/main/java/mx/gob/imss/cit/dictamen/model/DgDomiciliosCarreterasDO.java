package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DG_DOMICILIOS_CARRETERAS database table.
 * 
 */
@Entity
@Table(name="DG_DOMICILIOS_CARRETERAS")
@NamedQuery(name="DgDomiciliosCarreterasDO.findAll", query="SELECT d FROM DgDomiciliosCarreterasDO d")
public class DgDomiciliosCarreterasDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DOMICILIO_ID")
	private long domicilioId;

	private String cadenamiento;

	private BigDecimal codigo;

	private String destino;

	private String nomvial;

	private String origen;

	//bi-directional many-to-one association to DgCatAdministracionDO
	@ManyToOne
	@JoinColumn(name="CVE_CAC")
	private DgCatAdministracionDO dgCatAdministracion;

	//bi-directional many-to-one association to DgCatDerechosTransitoDO
	@ManyToOne
	@JoinColumn(name="CVE_CDT")
	private DgCatDerechosTransitoDO dgCatDerechosTransito;

	//bi-directional many-to-one association to DgCatTermGenDO
	@ManyToOne
	@JoinColumn(name="CVE_TER")
	private DgCatTermGenDO dgCatTermGen;

	//bi-directional one-to-one association to DgDomicilioGeograficoDO
	@OneToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	public DgDomiciliosCarreterasDO() {
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

	public BigDecimal getCodigo() {
		return this.codigo;
	}

	public void setCodigo(BigDecimal codigo) {
		this.codigo = codigo;
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

	public DgCatAdministracionDO getDgCatAdministracion() {
		return this.dgCatAdministracion;
	}

	public void setDgCatAdministracion(DgCatAdministracionDO dgCatAdministracion) {
		this.dgCatAdministracion = dgCatAdministracion;
	}

	public DgCatDerechosTransitoDO getDgCatDerechosTransito() {
		return this.dgCatDerechosTransito;
	}

	public void setDgCatDerechosTransito(DgCatDerechosTransitoDO dgCatDerechosTransito) {
		this.dgCatDerechosTransito = dgCatDerechosTransito;
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