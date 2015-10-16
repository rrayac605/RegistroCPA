package mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

public class AtestigPreguntasRespuestDTO extends BaseDTO {

	private static final long serialVersionUID = -2041674888099890602L;
	private Long cveIdAtestiguamientos;
    private String desObservaciones;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private String cveIdUsuario;
    private RubroAtestiguamientoDictDTO cveIdRubroAtestigDictamen;
    private OpcionPreguntaDTO cveIdOpcionPregunta;
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
	public RubroAtestiguamientoDictDTO getCveIdRubroAtestigDictamen() {
		return cveIdRubroAtestigDictamen;
	}
	public void setCveIdRubroAtestigDictamen(RubroAtestiguamientoDictDTO cveIdRubroAtestigDictamen) {
		this.cveIdRubroAtestigDictamen = cveIdRubroAtestigDictamen;
	}
	public OpcionPreguntaDTO getCveIdOpcionPregunta() {
		return cveIdOpcionPregunta;
	}
	public void setCveIdOpcionPregunta(OpcionPreguntaDTO cveIdOpcionPregunta) {
		this.cveIdOpcionPregunta = cveIdOpcionPregunta;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdAtestiguamientos == null) ? 0 : cveIdAtestiguamientos.hashCode());
		result = prime * result + ((cveIdOpcionPregunta == null) ? 0 : cveIdOpcionPregunta.hashCode());
		result = prime * result + ((cveIdRubroAtestigDictamen == null) ? 0 : cveIdRubroAtestigDictamen.hashCode());
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((desObservaciones == null) ? 0 : desObservaciones.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
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
		AtestigPreguntasRespuestDTO other = (AtestigPreguntasRespuestDTO) obj;
		if (cveIdAtestiguamientos == null) {
			if (other.cveIdAtestiguamientos != null)
				return false;
		} else if (!cveIdAtestiguamientos.equals(other.cveIdAtestiguamientos))
			return false;
		if (cveIdOpcionPregunta == null) {
			if (other.cveIdOpcionPregunta != null)
				return false;
		} else if (!cveIdOpcionPregunta.equals(other.cveIdOpcionPregunta))
			return false;
		if (cveIdRubroAtestigDictamen == null) {
			if (other.cveIdRubroAtestigDictamen != null)
				return false;
		} else if (!cveIdRubroAtestigDictamen.equals(other.cveIdRubroAtestigDictamen))
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
			return false;
		if (desObservaciones == null) {
			if (other.desObservaciones != null)
				return false;
		} else if (!desObservaciones.equals(other.desObservaciones))
			return false;
		if (fecRegistroActualizado == null) {
			if (other.fecRegistroActualizado != null)
				return false;
		} else if (!fecRegistroActualizado.equals(other.fecRegistroActualizado))
			return false;
		if (fecRegistroAlta == null) {
			if (other.fecRegistroAlta != null)
				return false;
		} else if (!fecRegistroAlta.equals(other.fecRegistroAlta))
			return false;
		if (fecRegistroBaja == null) {
			if (other.fecRegistroBaja != null)
				return false;
		} else if (!fecRegistroBaja.equals(other.fecRegistroBaja))
			return false;
		return true;
	}
    
}
