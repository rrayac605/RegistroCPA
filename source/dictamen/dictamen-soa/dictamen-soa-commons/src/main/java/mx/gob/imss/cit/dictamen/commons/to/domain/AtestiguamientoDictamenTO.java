package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class AtestiguamientoDictamenTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private Long cveIdAtestigDictamen;
    private Integer cveIdDictamen;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private String cveIdUsuario;
    private PatronDictamenTO cveIdPatronDictamen;
    private EstadoAtestiguamientoTO cveIdEstadoAtestiguamiento;
    private AtestiguamientoTO cveIdAtestiguamiento;
	public Long getCveIdAtestigDictamen() {
		return cveIdAtestigDictamen;
	}
	public void setCveIdAtestigDictamen(Long cveIdAtestigDictamen) {
		this.cveIdAtestigDictamen = cveIdAtestigDictamen;
	}
	public Integer getCveIdDictamen() {
		return cveIdDictamen;
	}
	public void setCveIdDictamen(Integer cveIdDictamen) {
		this.cveIdDictamen = cveIdDictamen;
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
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}
	public PatronDictamenTO getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}
	public void setCveIdPatronDictamen(PatronDictamenTO cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}
	public EstadoAtestiguamientoTO getCveIdEstadoAtestiguamiento() {
		return cveIdEstadoAtestiguamiento;
	}
	public void setCveIdEstadoAtestiguamiento(EstadoAtestiguamientoTO cveIdEstadoAtestiguamiento) {
		this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
	}
	public AtestiguamientoTO getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}
	public void setCveIdAtestiguamiento(AtestiguamientoTO cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}
}
