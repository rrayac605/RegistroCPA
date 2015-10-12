package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;


import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class AtestigPreguntasRespuestTO extends BaseTO {
	
	private static final long serialVersionUID = 3990957852699991321L;
	private Long cveIdAtestiguamientos;
    private String desObservaciones;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private String cveIdUsuario;
    private RubroAtestiguamientoDictTO cveIdRubroAtestigDictamen;
    private OpcionPreguntaTO cveIdOpcionPregunta;
	public Long getCveIdAtestiguamientos() {
		return cveIdAtestiguamientos;
	}
	public void setCveIdAtestiguamientos(Long cveIdAtestiguamientos) {
		this.cveIdAtestiguamientos = cveIdAtestiguamientos;
	}
	public String getDesObservaciones() {
		return desObservaciones;
	}
	public void setDesObservaciones(String desObservaciones) {
		this.desObservaciones = desObservaciones;
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
	public RubroAtestiguamientoDictTO getCveIdRubroAtestigDictamen() {
		return cveIdRubroAtestigDictamen;
	}
	public void setCveIdRubroAtestigDictamen(RubroAtestiguamientoDictTO cveIdRubroAtestigDictamen) {
		this.cveIdRubroAtestigDictamen = cveIdRubroAtestigDictamen;
	}
	public OpcionPreguntaTO getCveIdOpcionPregunta() {
		return cveIdOpcionPregunta;
	}
	public void setCveIdOpcionPregunta(OpcionPreguntaTO cveIdOpcionPregunta) {
		this.cveIdOpcionPregunta = cveIdOpcionPregunta;
	}
}
