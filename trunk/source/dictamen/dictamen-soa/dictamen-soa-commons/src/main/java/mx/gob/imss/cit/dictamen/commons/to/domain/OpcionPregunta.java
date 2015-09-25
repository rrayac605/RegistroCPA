package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class OpcionPregunta extends BaseTO{

	private static final long serialVersionUID = 1L;
	private Double cveIdOpcionPregunta;
	private Long cveIdPregunta;
	private Long cveIdRespuesta;
	private String desOpcionPregunta;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	public Double getCveIdOpcionPregunta() {
		return cveIdOpcionPregunta;
	}
	public void setCveIdOpcionPregunta(Double cveIdOpcionPregunta) {
		this.cveIdOpcionPregunta = cveIdOpcionPregunta;
	}
	public Long getCveIdPregunta() {
		return cveIdPregunta;
	}
	public void setCveIdPregunta(Long cveIdPregunta) {
		this.cveIdPregunta = cveIdPregunta;
	}
	public Long getCveIdRespuesta() {
		return cveIdRespuesta;
	}
	public void setCveIdRespuesta(Long cveIdRespuesta) {
		this.cveIdRespuesta = cveIdRespuesta;
	}
	public String getDesOpcionPregunta() {
		return desOpcionPregunta;
	}
	public void setDesOpcionPregunta(String desOpcionPregunta) {
		this.desOpcionPregunta = desOpcionPregunta;
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
}
