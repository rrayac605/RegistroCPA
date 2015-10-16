package mx.gob.imss.cit.de.dictaminacion.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.de.dictaminacion.commons.to.base.BaseTO;

public class OpcionPreguntaTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3308710887108580782L;
	private Long cveIdOpcionPregunta;
    private String desOpcionPregunta;
    private Date fecAltaRegistro;
    private Date fecBajaRegistro;
    private TipoRespuestaTO cveIdRespuesta;
    private PreguntaTO cveIdPregunta;
    
	public Long getCveIdOpcionPregunta() {
		return cveIdOpcionPregunta;
	}
	public void setCveIdOpcionPregunta(Long cveIdOpcionPregunta) {
		this.cveIdOpcionPregunta = cveIdOpcionPregunta;
	}
	public String getDesOpcionPregunta() {
		return desOpcionPregunta;
	}
	public void setDesOpcionPregunta(String desOpcionPregunta) {
		this.desOpcionPregunta = desOpcionPregunta;
	}
	public Date getFecAltaRegistro() {
		return fecAltaRegistro;
	}
	public void setFecAltaRegistro(Date fecAltaRegistro) {
		this.fecAltaRegistro = fecAltaRegistro;
	}
	public Date getFecBajaRegistro() {
		return fecBajaRegistro;
	}
	public void setFecBajaRegistro(Date fecBajaRegistro) {
		this.fecBajaRegistro = fecBajaRegistro;
	}
	public TipoRespuestaTO getCveIdRespuesta() {
		return cveIdRespuesta;
	}
	public void setCveIdRespuesta(TipoRespuestaTO cveIdRespuesta) {
		this.cveIdRespuesta = cveIdRespuesta;
	}
	public PreguntaTO getCveIdPregunta() {
		return cveIdPregunta;
	}
	public void setCveIdPregunta(PreguntaTO cveIdPregunta) {
		this.cveIdPregunta = cveIdPregunta;
	}
    
	
}
