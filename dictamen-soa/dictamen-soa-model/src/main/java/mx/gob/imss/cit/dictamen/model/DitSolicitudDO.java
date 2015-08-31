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
	@OneToMany(fetch = FetchType.LAZY,   mappedBy="ditSolicitud")
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdOrigenSolicitud == null) ? 0 : cveIdOrigenSolicitud.hashCode());
		result = prime * result + ((cveIdRazonCancelacion == null) ? 0 : cveIdRazonCancelacion.hashCode());
		result = prime * result + (int) (cveIdSolicitud ^ (cveIdSolicitud >>> 32));
		result = prime * result + ((cveIdTurno == null) ? 0 : cveIdTurno.hashCode());
		result = prime * result + ((cveIdUmf == null) ? 0 : cveIdUmf.hashCode());
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((dicEstadoSolicitud == null) ? 0 : dicEstadoSolicitud.hashCode());
		result = prime * result + ((dicSubdelegacion == null) ? 0 : dicSubdelegacion.hashCode());
		result = prime * result + ((dicTipoSolicitud == null) ? 0 : dicTipoSolicitud.hashCode());
		result = prime * result + ((ditTramites == null) ? 0 : ditTramites.hashCode());
		result = prime * result + ((fecCita == null) ? 0 : fecCita.hashCode());
		result = prime * result + ((fecConclusion == null) ? 0 : fecConclusion.hashCode());
		result = prime * result + ((fecPresentacion == null) ? 0 : fecPresentacion.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((fecSolicitud == null) ? 0 : fecSolicitud.hashCode());
		result = prime * result + ((refFolio == null) ? 0 : refFolio.hashCode());
		result = prime * result + ((refObservacion == null) ? 0 : refObservacion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DitSolicitudDO other = (DitSolicitudDO) obj;
		if (cveIdOrigenSolicitud == null) {
			if (other.cveIdOrigenSolicitud != null)
				return false;
		} else if (!cveIdOrigenSolicitud.equals(other.cveIdOrigenSolicitud))
			return false;
		if (cveIdRazonCancelacion == null) {
			if (other.cveIdRazonCancelacion != null)
				return false;
		} else if (!cveIdRazonCancelacion.equals(other.cveIdRazonCancelacion))
			return false;
		if (cveIdSolicitud != other.cveIdSolicitud)
			return false;
		if (cveIdTurno == null) {
			if (other.cveIdTurno != null)
				return false;
		} else if (!cveIdTurno.equals(other.cveIdTurno))
			return false;
		if (cveIdUmf == null) {
			if (other.cveIdUmf != null)
				return false;
		} else if (!cveIdUmf.equals(other.cveIdUmf))
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
			return false;
		if (dicEstadoSolicitud == null) {
			if (other.dicEstadoSolicitud != null)
				return false;
		} else if (!dicEstadoSolicitud.equals(other.dicEstadoSolicitud))
			return false;
		if (dicSubdelegacion == null) {
			if (other.dicSubdelegacion != null)
				return false;
		} else if (!dicSubdelegacion.equals(other.dicSubdelegacion))
			return false;
		if (dicTipoSolicitud == null) {
			if (other.dicTipoSolicitud != null)
				return false;
		} else if (!dicTipoSolicitud.equals(other.dicTipoSolicitud))
			return false;
		if (ditTramites == null) {
			if (other.ditTramites != null)
				return false;
		} else if (!ditTramites.equals(other.ditTramites))
			return false;
		if (fecCita == null) {
			if (other.fecCita != null)
				return false;
		} else if (!fecCita.equals(other.fecCita))
			return false;
		if (fecConclusion == null) {
			if (other.fecConclusion != null)
				return false;
		} else if (!fecConclusion.equals(other.fecConclusion))
			return false;
		if (fecPresentacion == null) {
			if (other.fecPresentacion != null)
				return false;
		} else if (!fecPresentacion.equals(other.fecPresentacion))
			return false;
		if (fecRegistroActualizado == null) {
			if (other.fecRegistroActualizado != null)
				return false;
		} else if (!fecRegistroActualizado.equals(other.fecRegistroActualizado))
			return false;
		if (fecRegistroAlta == null) {
			if (other.fecRegistroAlta != null)
				return false;
		} else if (!fecRegistroAlta.equals(other.fecRegistroAlta))
			return false;
		if (fecRegistroBaja == null) {
			if (other.fecRegistroBaja != null)
				return false;
		} else if (!fecRegistroBaja.equals(other.fecRegistroBaja))
			return false;
		if (fecSolicitud == null) {
			if (other.fecSolicitud != null)
				return false;
		} else if (!fecSolicitud.equals(other.fecSolicitud))
			return false;
		if (refFolio == null) {
			if (other.refFolio != null)
				return false;
		} else if (!refFolio.equals(other.refFolio))
			return false;
		if (refObservacion == null) {
			if (other.refObservacion != null)
				return false;
		} else if (!refObservacion.equals(other.refObservacion))
			return false;
		return true;
	}
	
	

}