package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class AtestiguamientoDictamenTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2430453483478948042L;
	private Long cveIdAtestiguamientoDictamen;
	private PatronDictamenTO patronDictamen;
	private Long cveIdDictamen;
	private AtestiguamientoTO atestiguamiento;
	private EstadoAtestiguamientoTO estadoAtestiguamiento;
	private Date fecRegistroAlta;
	private Date fecRegistroActualizado;
	private Date fecRegistroBaja;
	private String cveIdUsuario;
	public Long getCveIdAtestiguamientoDictamen() {
		return cveIdAtestiguamientoDictamen;
	}
	public void setCveIdAtestiguamientoDictamen(Long cveIdAtestiguamientoDictamen) {
		this.cveIdAtestiguamientoDictamen = cveIdAtestiguamientoDictamen;
	}
	public PatronDictamenTO getPatronDictamen() {
		return patronDictamen;
	}
	public void setPatronDictamen(PatronDictamenTO patronDictamen) {
		this.patronDictamen = patronDictamen;
	}
	public Long getCveIdDictamen() {
		return cveIdDictamen;
	}
	public void setCveIdDictamen(Long cveIdDictamen) {
		this.cveIdDictamen = cveIdDictamen;
	}
	public AtestiguamientoTO getAtestiguamiento() {
		return atestiguamiento;
	}
	public void setAtestiguamiento(AtestiguamientoTO atestiguamiento) {
		this.atestiguamiento = atestiguamiento;
	}
	public EstadoAtestiguamientoTO getEstadoAtestiguamiento() {
		return estadoAtestiguamiento;
	}
	public void setEstadoAtestiguamiento(EstadoAtestiguamientoTO estadoAtestiguamiento) {
		this.estadoAtestiguamiento = estadoAtestiguamiento;
	}
	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}
	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}
	
	
}
