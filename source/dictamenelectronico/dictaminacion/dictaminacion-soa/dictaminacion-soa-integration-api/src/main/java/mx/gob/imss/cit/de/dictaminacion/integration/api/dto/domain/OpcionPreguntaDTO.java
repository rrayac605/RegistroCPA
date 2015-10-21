package mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

public class OpcionPreguntaDTO extends BaseDTO {
	private static final long serialVersionUID = -5663789493709186799L;
	private Long cveIdOpcionPregunta;
    private Date fecAltaRegistro;
    private Date fecBajaRegistro;
    private TipoRespuestaDTO cveIdRespuesta;
    private PreguntaDTO cveIdPregunta;
    private List<AtestigPreguntasRespuestDTO> ndtAtestigPreguntasRespuestas;
    
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
	public TipoRespuestaDTO getCveIdRespuesta() {
		return cveIdRespuesta;
	}
	public void setCveIdRespuesta(TipoRespuestaDTO cveIdRespuesta) {
		this.cveIdRespuesta = cveIdRespuesta;
	}
	public PreguntaDTO getCveIdPregunta() {
		return cveIdPregunta;
	}
	public void setCveIdPregunta(PreguntaDTO cveIdPregunta) {
		this.cveIdPregunta = cveIdPregunta;
	}
	public List<AtestigPreguntasRespuestDTO> getNdtAtestigPreguntasRespuestas() {
		return ndtAtestigPreguntasRespuestas;
	}
	public void setNdtAtestigPreguntasRespuestas(List<AtestigPreguntasRespuestDTO> ndtAtestigPreguntasRespuestas) {
		this.ndtAtestigPreguntasRespuestas = ndtAtestigPreguntasRespuestas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdOpcionPregunta == null) ? 0 : cveIdOpcionPregunta.hashCode());
		result = prime * result + ((cveIdPregunta == null) ? 0 : cveIdPregunta.hashCode());
		result = prime * result + ((cveIdRespuesta == null) ? 0 : cveIdRespuesta.hashCode());
		result = prime * result + ((fecAltaRegistro == null) ? 0 : fecAltaRegistro.hashCode());
		result = prime * result + ((fecBajaRegistro == null) ? 0 : fecBajaRegistro.hashCode());
		result = prime * result
				+ ((ndtAtestigPreguntasRespuestas == null) ? 0 : ndtAtestigPreguntasRespuestas.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OpcionPreguntaDTO other = (OpcionPreguntaDTO) obj;
		if (cveIdOpcionPregunta == null) {
			if (other.cveIdOpcionPregunta != null)
				return false;
		} else if (!cveIdOpcionPregunta.equals(other.cveIdOpcionPregunta))
			return false;
		if (cveIdPregunta == null) {
			if (other.cveIdPregunta != null)
				return false;
		} else if (!cveIdPregunta.equals(other.cveIdPregunta))
			return false;
		if (cveIdRespuesta == null) {
			if (other.cveIdRespuesta != null)
				return false;
		} else if (!cveIdRespuesta.equals(other.cveIdRespuesta))
			return false;
		if (fecAltaRegistro == null) {
			if (other.fecAltaRegistro != null)
				return false;
		} else if (!fecAltaRegistro.equals(other.fecAltaRegistro))
			return false;
		if (fecBajaRegistro == null) {
			if (other.fecBajaRegistro != null)
				return false;
		} else if (!fecBajaRegistro.equals(other.fecBajaRegistro))
			return false;
		if (ndtAtestigPreguntasRespuestas == null) {
			if (other.ndtAtestigPreguntasRespuestas != null)
				return false;
		} else if (!ndtAtestigPreguntasRespuestas.equals(other.ndtAtestigPreguntasRespuestas))
			return false;
		return true;
	}
	
}
