package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdtCpaEstatusDTO implements Serializable {

	private static final long serialVersionUID = 7437333009977964417L;

	private Long cveIdEstatusCpa;
	private String cveIdUsuario;
	private String desComentarios;
	private Date fecAutorizacionRechazo;
	private Date fecBaja;
	private Date fecFallecimiento;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private NdcEstadoCpaDTO ndcEstadoCpa;

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

	public NdcEstadoCpaDTO getNdcEstadoCpa() {
		return ndcEstadoCpa;
	}

	public void setNdcEstadoCpa(NdcEstadoCpaDTO ndcEstadoCpa) {
		this.ndcEstadoCpa = ndcEstadoCpa;
	}

}
