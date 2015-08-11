package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the NDT_REG_BAJA_REACTIV database table.
 * 
 */
@Entity
@Table(name="NDT_REG_BAJA_REACTIV")
@NamedQuery(name="NdtRegBajaReactivDO.findAll", query="SELECT n FROM NdtRegBajaReactivDO n")
public class NdtRegBajaReactivDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_CPA_REGISTRO")
	private long cveIdCpaRegistro;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Column(name="DES_COMENTARIOS")
	private String desComentarios;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_AUTORIZACION_MOVIMIENTO")
	private Date fecAutorizacionMovimiento;

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
	@Column(name="FEC_SOLICITUD_MOVIMIENTO")
	private Date fecSolicitudMovimiento;

	//bi-directional many-to-one association to NdtDoctosProbCpaDO
	@OneToMany(mappedBy="ndtRegBajaReactiv")
	private List<NdtDoctosProbCpaDO> ndtDoctosProbCpas;

	//bi-directional many-to-one association to DitTramiteDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TRAMITE")
	private DitTramiteDO ditTramite;

	//bi-directional many-to-one association to NdcEstadoCpaDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ESTADO_CPA")
	private NdcEstadoCpaDO ndcEstadoCpa;

	//bi-directional many-to-one association to NdtContadorPublicoAutDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAutDO ndtContadorPublicoAut;

	public NdtRegBajaReactivDO() {
	}

	public long getCveIdCpaRegistro() {
		return this.cveIdCpaRegistro;
	}

	public void setCveIdCpaRegistro(long cveIdCpaRegistro) {
		this.cveIdCpaRegistro = cveIdCpaRegistro;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesComentarios() {
		return this.desComentarios;
	}

	public void setDesComentarios(String desComentarios) {
		this.desComentarios = desComentarios;
	}

	public Date getFecAutorizacionMovimiento() {
		return this.fecAutorizacionMovimiento;
	}

	public void setFecAutorizacionMovimiento(Date fecAutorizacionMovimiento) {
		this.fecAutorizacionMovimiento = fecAutorizacionMovimiento;
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

	public Date getFecSolicitudMovimiento() {
		return this.fecSolicitudMovimiento;
	}

	public void setFecSolicitudMovimiento(Date fecSolicitudMovimiento) {
		this.fecSolicitudMovimiento = fecSolicitudMovimiento;
	}

	public List<NdtDoctosProbCpaDO> getNdtDoctosProbCpas() {
		return this.ndtDoctosProbCpas;
	}

	public void setNdtDoctosProbCpas(List<NdtDoctosProbCpaDO> ndtDoctosProbCpas) {
		this.ndtDoctosProbCpas = ndtDoctosProbCpas;
	}
	
	public DitTramiteDO getDitTramite() {
		return this.ditTramite;
	}

	public void setDitTramite(DitTramiteDO ditTramite) {
		this.ditTramite = ditTramite;
	}

	public NdcEstadoCpaDO getNdcEstadoCpa() {
		return this.ndcEstadoCpa;
	}

	public void setNdcEstadoCpa(NdcEstadoCpaDO ndcEstadoCpa) {
		this.ndcEstadoCpa = ndcEstadoCpa;
	}

	public NdtContadorPublicoAutDO getNdtContadorPublicoAut() {
		return this.ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAutDO ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

}