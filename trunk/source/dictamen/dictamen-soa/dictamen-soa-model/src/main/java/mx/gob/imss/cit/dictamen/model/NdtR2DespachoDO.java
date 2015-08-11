package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the NDT_R2_DESPACHO database table.
 * 
 */
@Entity
@Table(name="NDT_R2_DESPACHO")
@NamedQuery(name="NdtR2DespachoDO.findAll", query="SELECT n FROM NdtR2DespachoDO n")
public class NdtR2DespachoDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_CPA_DESPACHO")
	private long cveIdCpaDespacho;

	@Column(name="CARGO_QUE_DESEMPENA")
	private String cargoQueDesempena;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_SOLICITUD_R2")
	private Date fechaSolicitudR2;

	@Column(name="IND_TIPO_CPA")
	private BigDecimal indTipoCpa;

	@Column(name="NUM_TRABAJADORES_CONTRATADOS")
	private BigDecimal numTrabajadoresContratados;

	@Column(name="NUM_TRAMITE_NOTARIA")
	private String numTramiteNotaria;

	@Column(name="URL_ACUSE_NOTARIA")
	private String urlAcuseNotaria;

	//bi-directional many-to-one association to DitPatronSujetoObligadoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_PATRON_SUJETO_OBLIGADO")
	private DitPatronSujetoObligadoDO ditPatronSujetoObligado;

	//bi-directional many-to-one association to DitTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TRAMITE")
	private DitTramiteDO ditTramite;

	//bi-directional many-to-one association to NdcDespachoDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_DESPACHO")
	private NdcDespachoDO ndcDespacho;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAutDO ndtContadorPublicoAut;

	public NdtR2DespachoDO() {
	}

	public long getCveIdCpaDespacho() {
		return this.cveIdCpaDespacho;
	}

	public void setCveIdCpaDespacho(long cveIdCpaDespacho) {
		this.cveIdCpaDespacho = cveIdCpaDespacho;
	}

	public String getCargoQueDesempena() {
		return this.cargoQueDesempena;
	}

	public void setCargoQueDesempena(String cargoQueDesempena) {
		this.cargoQueDesempena = cargoQueDesempena;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
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

	public Date getFechaSolicitudR2() {
		return this.fechaSolicitudR2;
	}

	public void setFechaSolicitudR2(Date fechaSolicitudR2) {
		this.fechaSolicitudR2 = fechaSolicitudR2;
	}

	public BigDecimal getIndTipoCpa() {
		return this.indTipoCpa;
	}

	public void setIndTipoCpa(BigDecimal indTipoCpa) {
		this.indTipoCpa = indTipoCpa;
	}

	public BigDecimal getNumTrabajadoresContratados() {
		return this.numTrabajadoresContratados;
	}

	public void setNumTrabajadoresContratados(BigDecimal numTrabajadoresContratados) {
		this.numTrabajadoresContratados = numTrabajadoresContratados;
	}

	public String getNumTramiteNotaria() {
		return this.numTramiteNotaria;
	}

	public void setNumTramiteNotaria(String numTramiteNotaria) {
		this.numTramiteNotaria = numTramiteNotaria;
	}

	public String getUrlAcuseNotaria() {
		return this.urlAcuseNotaria;
	}

	public void setUrlAcuseNotaria(String urlAcuseNotaria) {
		this.urlAcuseNotaria = urlAcuseNotaria;
	}

	public DitPatronSujetoObligadoDO getDitPatronSujetoObligado() {
		return this.ditPatronSujetoObligado;
	}

	public void setDitPatronSujetoObligado(DitPatronSujetoObligadoDO ditPatronSujetoObligado) {
		this.ditPatronSujetoObligado = ditPatronSujetoObligado;
	}

	public DitTramiteDO getDitTramite() {
		return this.ditTramite;
	}

	public void setDitTramite(DitTramiteDO ditTramite) {
		this.ditTramite = ditTramite;
	}

	public NdcDespachoDO getNdcDespacho() {
		return this.ndcDespacho;
	}

	public void setNdcDespacho(NdcDespachoDO ndcDespacho) {
		this.ndcDespacho = ndcDespacho;
	}

	public NdtContadorPublicoAutDO getNdtContadorPublicoAut() {
		return this.ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAutDO ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

}