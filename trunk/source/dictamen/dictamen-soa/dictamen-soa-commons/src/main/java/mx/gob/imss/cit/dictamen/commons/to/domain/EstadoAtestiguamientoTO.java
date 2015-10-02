package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class EstadoAtestiguamientoTO extends BaseTO{

	
	private static final long serialVersionUID = -5623554925291067552L;
	private Long cveIdEstadoAtestiguamiento;
    private String desEstadoAtestiguamiento;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    
	public Long getCveIdEstadoAtestiguamiento() {
		return cveIdEstadoAtestiguamiento;
	}
	public void setCveIdEstadoAtestiguamiento(Long cveIdEstadoAtestiguamiento) {
		this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
	}
	public String getDesEstadoAtestiguamiento() {
		return desEstadoAtestiguamiento;
	}
	public void setDesEstadoAtestiguamiento(String desEstadoAtestiguamiento) {
		this.desEstadoAtestiguamiento = desEstadoAtestiguamiento;
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
   
}
