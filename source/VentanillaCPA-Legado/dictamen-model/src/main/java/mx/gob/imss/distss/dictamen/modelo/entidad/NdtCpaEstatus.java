package mx.gob.imss.distss.dictamen.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="NDT_CPA_ESTATUS")
@NamedQuery(name="NdtCpaEstatus.findAll", query="SELECT n FROM NdtCpaEstatus n")
public class NdtCpaEstatus implements Serializable {
	
	private static final long serialVersionUID = 1679957800516141408L;
	
	@Id
	@Column(name="CVE_ID_ESTATUS_CPA", unique=true, nullable=false)
	@SequenceGenerator(name = "NdtCpaEstatus_Id_Seq_Gen", sequenceName = "SEQ_NDTCPAESTATUS")
    @GeneratedValue(generator = "NdtCpaEstatus_Id_Seq_Gen")
	private Long cveIdEstatusCpa;

	@Column(name="CVE_ID_USUARIO", length=18)
	private String cveIdUsuario;

	@Column(name="DES_COMENTARIOS", length=1000)
	private String desComentarios;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_AUTORIZACION_RECHAZO")
	private Date fecAutorizacionRechazo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_BAJA")
	private Date fecBaja;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_FALLECIMIENTO")
	private Date fecFallecimiento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ACTUALIZADO")
	private Date fecRegistroActualizado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_ALTA")
	private Date fecRegistroAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_REGISTRO_BAJA")
	private Date fecRegistroBaja;

	//bi-directional many-to-one association to NdcEstadoCpa
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_ESTADO_CPA")
	private NdcEstadoCpa ndcEstadoCpa;

	//bi-directional many-to-one association to NdtContadorPublicoAut
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA")
	private NdtContadorPublicoAut ndtContadorPublicoAut;

	//bi-directional many-to-one association to NdtCpaTramite
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CVE_ID_CPA_TRAMITE")
	private NdtCpaTramite ndtCpaTramite;

	public NdtCpaEstatus() {
	}

	public Long getCveIdEstatusCpa() {
		return cveIdEstatusCpa;
	}

	public void setCveIdEstatusCpa(Long cveIdEstatusCpa) {
		this.cveIdEstatusCpa = cveIdEstatusCpa;
	}

	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public String getDesComentarios() {
		return desComentarios;
	}

	public void setDesComentarios(String desComentarios) {
		this.desComentarios = desComentarios;
	}

	public Date getFecAutorizacionRechazo() {
		return fecAutorizacionRechazo;
	}

	public void setFecAutorizacionRechazo(Date fecAutorizacionRechazo) {
		this.fecAutorizacionRechazo = fecAutorizacionRechazo;
	}

	public Date getFecBaja() {
		return fecBaja;
	}

	public void setFecBaja(Date fecBaja) {
		this.fecBaja = fecBaja;
	}

	public Date getFecFallecimiento() {
		return fecFallecimiento;
	}

	public void setFecFallecimiento(Date fecFallecimiento) {
		this.fecFallecimiento = fecFallecimiento;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public NdcEstadoCpa getNdcEstadoCpa() {
		return ndcEstadoCpa;
	}

	public void setNdcEstadoCpa(NdcEstadoCpa ndcEstadoCpa) {
		this.ndcEstadoCpa = ndcEstadoCpa;
	}

	public NdtContadorPublicoAut getNdtContadorPublicoAut() {
		return ndtContadorPublicoAut;
	}

	public void setNdtContadorPublicoAut(NdtContadorPublicoAut ndtContadorPublicoAut) {
		this.ndtContadorPublicoAut = ndtContadorPublicoAut;
	}

	public NdtCpaTramite getNdtCpaTramite() {
		return ndtCpaTramite;
	}

	public void setNdtCpaTramite(NdtCpaTramite ndtCpaTramite) {
		this.ndtCpaTramite = ndtCpaTramite;
	}

}