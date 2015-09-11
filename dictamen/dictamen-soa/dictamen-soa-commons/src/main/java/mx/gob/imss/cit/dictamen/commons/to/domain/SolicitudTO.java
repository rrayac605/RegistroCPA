package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class SolicitudTO extends BaseTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3930584867353976799L;

	private long cveIdSolicitud;

	private BigDecimal cveIdOrigenSolicitud;

	private BigDecimal cveIdRazonCancelacion;

	private BigDecimal cveIdTurno;

	private BigDecimal cveIdUmf;

	private String cveIdUsuario;

	private Date fecCita;

	private Date fecConclusion;

	private Date fecPresentacion;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private Date fecSolicitud;

	private String refFolio;

	private String refObservacion;

	private EstadoSolicitudTO dicEstadoSolicitud;

	private SubdelegacionTO dicSubdelegacion;

	private TipoSolicitudTO dicTipoSolicitud;

	private List<TramiteTO> ditTramites;

	/**
	 * @return the cveIdSolicitud
	 */
	public long getCveIdSolicitud() {
		return cveIdSolicitud;
	}

	/**
	 * @param cveIdSolicitud the cveIdSolicitud to set
	 */
	public void setCveIdSolicitud(long cveIdSolicitud) {
		this.cveIdSolicitud = cveIdSolicitud;
	}

	/**
	 * @return the cveIdOrigenSolicitud
	 */
	public BigDecimal getCveIdOrigenSolicitud() {
		return cveIdOrigenSolicitud;
	}

	/**
	 * @param cveIdOrigenSolicitud the cveIdOrigenSolicitud to set
	 */
	public void setCveIdOrigenSolicitud(BigDecimal cveIdOrigenSolicitud) {
		this.cveIdOrigenSolicitud = cveIdOrigenSolicitud;
	}

	/**
	 * @return the cveIdRazonCancelacion
	 */
	public BigDecimal getCveIdRazonCancelacion() {
		return cveIdRazonCancelacion;
	}

	/**
	 * @param cveIdRazonCancelacion the cveIdRazonCancelacion to set
	 */
	public void setCveIdRazonCancelacion(BigDecimal cveIdRazonCancelacion) {
		this.cveIdRazonCancelacion = cveIdRazonCancelacion;
	}

	/**
	 * @return the cveIdTurno
	 */
	public BigDecimal getCveIdTurno() {
		return cveIdTurno;
	}

	/**
	 * @param cveIdTurno the cveIdTurno to set
	 */
	public void setCveIdTurno(BigDecimal cveIdTurno) {
		this.cveIdTurno = cveIdTurno;
	}

	/**
	 * @return the cveIdUmf
	 */
	public BigDecimal getCveIdUmf() {
		return cveIdUmf;
	}

	/**
	 * @param cveIdUmf the cveIdUmf to set
	 */
	public void setCveIdUmf(BigDecimal cveIdUmf) {
		this.cveIdUmf = cveIdUmf;
	}

	/**
	 * @return the cveIdUsuario
	 */
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}

	/**
	 * @param cveIdUsuario the cveIdUsuario to set
	 */
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}

	/**
	 * @return the fecCita
	 */
	public Date getFecCita() {
		return fecCita != null ? (Date) fecCita.clone() : null;
	}

	/**
	 * @param fecCita the fecCita to set
	 */
	public void setFecCita(Date fecCita) {
		this.fecCita = fecCita;
	}

	/**
	 * @return the fecConclusion
	 */
	public Date getFecConclusion() {
		return fecConclusion != null ? (Date) fecConclusion.clone() : null;
	}

	/**
	 * @param fecConclusion the fecConclusion to set
	 */
	public void setFecConclusion(Date fecConclusion) {
		this.fecConclusion = fecConclusion;
	}

	/**
	 * @return the fecPresentacion
	 */
	public Date getFecPresentacion() {
		return fecPresentacion != null ? (Date) fecPresentacion.clone() : null;		
	}

	/**
	 * @param fecPresentacion the fecPresentacion to set
	 */
	public void setFecPresentacion(Date fecPresentacion) {
		this.fecPresentacion = fecPresentacion;
	}

	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;		
	}

	/**
	 * @param fecRegistroActualizado the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
	}

	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	/**
	 * @return the fecSolicitud
	 */
	public Date getFecSolicitud() {
		return fecSolicitud != null ? (Date) fecSolicitud.clone() : null;		
	}

	/**
	 * @param fecSolicitud the fecSolicitud to set
	 */
	public void setFecSolicitud(Date fecSolicitud) {
		this.fecSolicitud = fecSolicitud;
	}

	/**
	 * @return the refFolio
	 */
	public String getRefFolio() {
		return refFolio;
	}

	/**
	 * @param refFolio the refFolio to set
	 */
	public void setRefFolio(String refFolio) {
		this.refFolio = refFolio;
	}

	/**
	 * @return the refObservacion
	 */
	public String getRefObservacion() {
		return refObservacion;
	}

	/**
	 * @param refObservacion the refObservacion to set
	 */
	public void setRefObservacion(String refObservacion) {
		this.refObservacion = refObservacion;
	}

	/**
	 * @return the dicEstadoSolicitud
	 */
	public EstadoSolicitudTO getDicEstadoSolicitud() {
		return dicEstadoSolicitud;
	}

	/**
	 * @param dicEstadoSolicitud the dicEstadoSolicitud to set
	 */
	public void setDicEstadoSolicitud(EstadoSolicitudTO dicEstadoSolicitud) {
		this.dicEstadoSolicitud = dicEstadoSolicitud;
	}

	/**
	 * @return the dicSubdelegacion
	 */
	public SubdelegacionTO getDicSubdelegacion() {
		return dicSubdelegacion;
	}

	/**
	 * @param dicSubdelegacion the dicSubdelegacion to set
	 */
	public void setDicSubdelegacion(SubdelegacionTO dicSubdelegacion) {
		this.dicSubdelegacion = dicSubdelegacion;
	}

	/**
	 * @return the dicTipoSolicitud
	 */
	public TipoSolicitudTO getDicTipoSolicitud() {
		return dicTipoSolicitud;
	}

	/**
	 * @param dicTipoSolicitud the dicTipoSolicitud to set
	 */
	public void setDicTipoSolicitud(TipoSolicitudTO dicTipoSolicitud) {
		this.dicTipoSolicitud = dicTipoSolicitud;
	}

	/**
	 * @return the ditTramites
	 */
	public List<TramiteTO> getDitTramites() {
		return ditTramites;
	}

	/**
	 * @param ditTramites the ditTramites to set
	 */
	public void setDitTramites(List<TramiteTO> ditTramites) {
		this.ditTramites = ditTramites;
	}
	
	
	
}
