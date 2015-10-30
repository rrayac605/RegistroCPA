package mx.gob.imss.cit.de.dictaminacion.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.de.dictaminacion.commons.to.base.BaseTO;

public class TipoRespuestaTO extends BaseTO{

	private static final long serialVersionUID = 7787323420111216028L;
	private Long cveIdRespuesta;
    private String desTipoRespuesta;
    private Date fecRegistroAlta;
    private Date fecRegistroActualizado;
    private Date fecRegistroBaja;
    
	public Long getCveIdRespuesta() {
		return cveIdRespuesta;
	}
	public void setCveIdRespuesta(Long cveIdRespuesta) {
		this.cveIdRespuesta = cveIdRespuesta;
	}
	public String getDesTipoRespuesta() {
		return desTipoRespuesta;
	}
	public void setDesTipoRespuesta(String desTipoRespuesta) {
		this.desTipoRespuesta = desTipoRespuesta;
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
