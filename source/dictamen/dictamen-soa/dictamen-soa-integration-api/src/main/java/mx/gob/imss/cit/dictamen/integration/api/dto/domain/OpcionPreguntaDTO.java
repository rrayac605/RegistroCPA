package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class OpcionPreguntaDTO extends BaseDTO {
	private static final long serialVersionUID = 308710887108580782L;
	private Long cveIdOpcionPregunta;
    private String desOpcionPregunta;
    private Date fecAltaRegistro;
    private Date fecBajaRegistro;
    private TipoRespuestaDTO cveIdRespuesta;
    private PreguntaDTO cveIdPregunta;
    
    
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdOpcionPregunta == null) ? 0 : cveIdOpcionPregunta.hashCode());
		result = prime * result + ((cveIdPregunta == null) ? 0 : cveIdPregunta.hashCode());
		result = prime * result + ((cveIdRespuesta == null) ? 0 : cveIdRespuesta.hashCode());
		result = prime * result + ((desOpcionPregunta == null) ? 0 : desOpcionPregunta.hashCode());
		result = prime * result + ((fecAltaRegistro == null) ? 0 : fecAltaRegistro.hashCode());
		result = prime * result + ((fecBajaRegistro == null) ? 0 : fecBajaRegistro.hashCode());
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
		if (desOpcionPregunta == null) {
			if (other.desOpcionPregunta != null)
				return false;
		} else if (!desOpcionPregunta.equals(other.desOpcionPregunta))
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
		return true;
	}
	
}
