package mx.gob.imss.cit.dictamen.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DIT_SOLICITUD database table.
 * 
 */
@Entity
@Table(name="DIT_SOLICITUD")
@NamedQuery(name="DitSolicitudDO.findAll", query="SELECT d FROM DitSolicitudDO d")
public class DitSolicitudDO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CVE_ID_SOLICITUD")
	private long cveIdSolicitud;

	@Column(name="CVE_ID_ORIGEN_SOLICITUD")
	private BigDecimal cveIdOrigenSolicitud;

	@Column(name="CVE_ID_RAZON_CANCELACION")
	private BigDecimal cveIdRazonCancelacion;

	@Column(name="CVE_ID_TURNO")
	private BigDecimal cveIdTurno;

	@Column(name="CVE_ID_UMF")
	private BigDecimal cveIdUmf;

	@Column(name="CVE_ID_USUARIO")
	private String cveIdUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_CITA")
	private Date fecCita;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_CONCLUSION")
	private Date fecConclusion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FEC_PRESENTACION")
	private Date fecPresentacion;

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
	@Column(name="FEC_SOLICITUD")
	private Date fecSolicitud;

	@Column(name="REF_FOLIO")
	private String refFolio;

	@Column(name="REF_OBSERVACION")
	private String refObservacion;

	//bi-directional many-to-one association to DicEstadoSolicitudDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_ESTADO_SOLICITUD")
	private DicEstadoSolicitudDO dicEstadoSolicitud;

	//bi-directional many-to-one association to DicSubdelegacionDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_SUBDELEGACION")
	private DicSubdelegacionDO dicSubdelegacion;

	//bi-directional many-to-one association to DicTipoSolicitudDO
	@ManyToOne
	@JoinColumn(name="CVE_ID_TIPO_SOLICITUD")
	private DicTipoSolicitudDO dicTipoSolicitud;

	//bi-directional many-to-one association to DitTramiteDO
	@OneToMany(mappedBy="ditSolicitud")
	private List<DitTramiteDO> ditTramites;

	public DitSolicitudDO() {
	}

	public long getCveIdSolicitud() {
		return this.cveIdSolicitud;
	}

	public void setCveIdSolicitud(long cveIdSolicitud) {
		this.cveIdSolicitud = cveIdSolicitud;
	}

	public BigDecimal getCveIdOrigenSolicitud() {
		return this.cveIdOrigenSolicitud;
	}

	public void setCveIdOrigenSolicitud(BigDecimal cveIdOrigenSolicitud) {
		this.cveIdOrigenSolicitud = cveIdOrigenSolicitud;
	}

	public BigDecimal getCveIdRazonCancelacion() {
		return this.cveIdRazonCancelacion;
	}

	public void setCveIdRazonCancelacion(BigDecimal cveIdRazonCancelacion) {
		this.cveIdRazonCancelacion = cveIdRazonCancelacion;
	}

	public BigDecimal getCveIdTurno() {
		return this.cveIdTurno;
	}

	public void setCveIdTurno(BigDecimal cveIdTurno) {
		this.cveIdTurno = cveIdTurno;
	}

	public BigDecimal getCveIdUmf() {
		return this.cveIdUmf;
	}

	public void setCveIdUmf(BigDecimal cveIdUmf) {
		this.cveIdUmf = cveIdUmf;
	}

	public String getCveIdUsuario() {
		return this.cveIdUsuario;
	}

	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	public Date getFecCita() {
		return this.fecCita;
	}

	public void setFecCita(Date fecCita) {
		this.fecCita = fecCita;
	}

	public Date getFecConclusion() {
		return this.fecConclusion;
	}

	public void setFecConclusion(Date fecConclusion) {
		this.fecConclusion = fecConclusion;
	}

	public Date getFecPresentacion() {
		return this.fecPresentacion;
	}

	public void setFecPresentacion(Date fecPresentacion) {
		this.fecPresentacion = fecPresentacion;
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

	public Date getFecSolicitud() {
		return this.fecSolicitud;
	}

	public void setFecSolicitud(Date fecSolicitud) {
		this.fecSolicitud = fecSolicitud;
	}

	public String getRefFolio() {
		return this.refFolio;
	}

	public void setRefFolio(String refFolio) {
		this.refFolio = refFolio;
	}

	public String getRefObservacion() {
		return this.refObservacion;
	}

	public void setRefObservacion(String refObservacion) {
		this.refObservacion = refObservacion;
	}

	public DicEstadoSolicitudDO getDicEstadoSolicitud() {
		return this.dicEstadoSolicitud;
	}

	public void setDicEstadoSolicitud(DicEstadoSolicitudDO dicEstadoSolicitud) {
		this.dicEstadoSolicitud = dicEstadoSolicitud;
	}

	public DicSubdelegacionDO getDicSubdelegacion() {
		return this.dicSubdelegacion;
	}

	public void setDicSubdelegacion(DicSubdelegacionDO dicSubdelegacion) {
		this.dicSubdelegacion = dicSubdelegacion;
	}

	public DicTipoSolicitudDO getDicTipoSolicitud() {
		return this.dicTipoSolicitud;
	}

	public void setDicTipoSolicitud(DicTipoSolicitudDO dicTipoSolicitud) {
		this.dicTipoSolicitud = dicTipoSolicitud;
	}

	public List<DitTramiteDO> getDitTramites() {
		return this.ditTramites;
	}

	public void setDitTramites(List<DitTramiteDO> ditTramites) {
		this.ditTramites = ditTramites;
	}

}