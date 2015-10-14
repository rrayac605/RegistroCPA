package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class NdcOpcionPreguntaDTO implements Serializable {

	private static final long serialVersionUID = 4152256180749855695L;

	private Long cveIdOpcionPregunta;
	private String desOpcionPregunta;
	private Date fecAltaRegistro;
	private Date fecBajaRegistro;
	private NdcPreguntaDTO ndcPregunta;
	private NdcTipoRespuestaDTO ndcTipoRespuesta;

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

	public NdcPreguntaDTO getNdcPregunta() {
		return ndcPregunta;
	}

	public void setNdcPregunta(NdcPreguntaDTO ndcPregunta) {
		this.ndcPregunta = ndcPregunta;
	}

	public NdcTipoRespuestaDTO getNdcTipoRespuesta() {
		return ndcTipoRespuesta;
	}

	public void setNdcTipoRespuesta(NdcTipoRespuestaDTO ndcTipoRespuesta) {
		this.ndcTipoRespuesta = ndcTipoRespuesta;
	}

}
