package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the NDT_R1_DOM_FISCAL database table.
 * 
 */
@Entity
@Table(name="NDT_R1_DOM_FISCAL")
@NamedQuery(name="NdtR1DomFiscalDO.findAll", query="SELECT n FROM NdtR1DomFiscalDO n")
public class NdtR1DomFiscalDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_R1_DOM_FISCAL")
	private long cveIdR1DomFiscal;

	@Column(name="CEDULA_PROFESIONAL")
	private String cedulaProfesional;

	private String curp;

	@Column(name="CVE_ID_CPA")
	private BigDecimal cveIdCpa;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Column(name="DES_TITULO_EXPEDIDO_POR")
	private String desTituloExpedidoPor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_EXPEDICION_CEDPROF")
	private Date fecExpedicionCedprof;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_SOLICITUD_R1")
	private Date fecSolicitudR1;

	//bi-directional many-to-one association to DgDomicilioGeograficoDO
	@ManyToOne
	@JoinColumn(name="DOMICILIO_ID")
	private DgDomicilioGeograficoDO dgDomicilioGeografico;

	//bi-directional many-to-one association to DicSubdelegacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_SUBDELEGACION")
	private DicSubdelegacionDO dicSubdelegacion;

	//bi-directional many-to-one association to DitTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TRAMITE")
	private DitTramiteDO ditTramite;

	public NdtR1DomFiscalDO() {
	}

	public long getCveIdR1DomFiscal() {
		return this.cveIdR1DomFiscal;
	}

	public void setCveIdR1DomFiscal(long cveIdR1DomFiscal) {
		this.cveIdR1DomFiscal = cveIdR1DomFiscal;
	}

	public String getCedulaProfesional() {
		return this.cedulaProfesional;
	}

	public void setCedulaProfesional(String cedulaProfesional) {
		this.cedulaProfesional = cedulaProfesional;
	}

	public String getCurp() {
		return this.curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public BigDecimal getCveIdCpa() {
		return this.cveIdCpa;
	}

	public void setCveIdCpa(BigDecimal cveIdCpa) {
		this.cveIdCpa = cveIdCpa;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesTituloExpedidoPor() {
		return this.desTituloExpedidoPor;
	}

	public void setDesTituloExpedidoPor(String desTituloExpedidoPor) {
		this.desTituloExpedidoPor = desTituloExpedidoPor;
	}

	public Date getFecExpedicionCedprof() {
		return this.fecExpedicionCedprof;
	}

	public void setFecExpedicionCedprof(Date fecExpedicionCedprof) {
		this.fecExpedicionCedprof = fecExpedicionCedprof;
	}

	public Date getFecRegistroActualizado() {
		return this.fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return this.fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return this.fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public Date getFecSolicitudR1() {
		return this.fecSolicitudR1;
	}

	public void setFecSolicitudR1(Date fecSolicitudR1) {
		this.fecSolicitudR1 = fecSolicitudR1;
	}

	public DgDomicilioGeograficoDO getDgDomicilioGeografico() {
		return this.dgDomicilioGeografico;
	}

	public void setDgDomicilioGeografico(DgDomicilioGeograficoDO dgDomicilioGeografico) {
		this.dgDomicilioGeografico = dgDomicilioGeografico;
	}

	public DicSubdelegacionDO getDicSubdelegacion() {
		return this.dicSubdelegacion;
	}

	public void setDicSubdelegacion(DicSubdelegacionDO dicSubdelegacion) {
		this.dicSubdelegacion = dicSubdelegacion;
	}

	public DitTramiteDO getDitTramite() {
		return this.ditTramite;
	}

	public void setDitTramite(DitTramiteDO ditTramite) {
		this.ditTramite = ditTramite;
	}

}