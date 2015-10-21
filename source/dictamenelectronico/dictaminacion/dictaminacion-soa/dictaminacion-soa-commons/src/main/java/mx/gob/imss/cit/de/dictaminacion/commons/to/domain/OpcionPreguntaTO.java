package mx.gob.imss.cit.de.dictaminacion.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.commons.to.base.BaseTO;

public class OpcionPreguntaTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3308710887108580782L;
	private Long cveIdOpcionPregunta;
    private Date fecAltaRegistro;
    private Date fecBajaRegistro;
    private TipoRespuestaTO cveIdRespuesta;
    private PreguntaTO cveIdPregunta;
    private List<AtestigPreguntasRespuestTO> ndtAtestigPreguntasRespuestas;

    
	public Long getCveIdOpcionPregunta() {
		return cveIdOpcionPregunta;
	}
	public void setCveIdOpcionPregunta(Long cveIdOpcionPregunta) {
		this.cveIdOpcionPregunta = cveIdOpcionPregunta;
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
	public List<AtestigPreguntasRespuestTO> getNdtAtestigPreguntasRespuestas() {
		return ndtAtestigPreguntasRespuestas;
	}
	public void setNdtAtestigPreguntasRespuestas(List<AtestigPreguntasRespuestTO> ndtAtestigPreguntasRespuestas) {
		this.ndtAtestigPreguntasRespuestas = ndtAtestigPreguntasRespuestas;
	}
	
}
