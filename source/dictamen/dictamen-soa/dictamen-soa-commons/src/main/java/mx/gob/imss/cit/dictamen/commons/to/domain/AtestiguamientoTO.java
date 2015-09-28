package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class AtestiguamientoTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4993167636489570181L;
	
	private Integer cveIdAtestiguamiento;
	private AseveracionesTO cveIdAseveracion;
	private String desAtestiguamiento;
	private Date fecRegistroAlta;
	private Date fecRegistroActualizado;
	private Date fecRegistroBaja;
	
	public Integer getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}
	public void setCveIdAtestiguamiento(Integer cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}
	public AseveracionesTO getCveIdAseveracion() {
		return cveIdAseveracion;
	}
	public void setCveIdAseveracion(AseveracionesTO cveIdAseveracion) {
		this.cveIdAseveracion = cveIdAseveracion;
	}
	public String getDesAtestiguamiento() {
		return desAtestiguamiento;
	}
	public void setDesAtestiguamiento(String desAtestiguamiento) {
		this.desAtestiguamiento = desAtestiguamiento;
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
	
	 
}
