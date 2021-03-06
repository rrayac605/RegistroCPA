package mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

public class PreguntaDTO extends BaseDTO{

	private static final long serialVersionUID = 2372740005419028723L;
	private Long cveIdPregunta;
    private String desPregunta;
    private Date fecRegistroAlta;
    private Date fecRegistroActualizado;
    private Date fecRegistroBaja;
    private Integer indOrden;
    private RubroDTO cveIdRubro;
    private PreguntaDTO cveIdPreguntaPadre;
    private List<OpcionPreguntaDTO> ndcOpcionesPregunta;
    private Long opcionSeleccionada;
    private String observaciones;
    private Boolean habilitaPregunta;
    private Boolean habilitaObservacion;
    
    
    
	public Long getCveIdPregunta() {
		return cveIdPregunta;
	}
	public void setCveIdPregunta(Long cveIdPregunta) {
		this.cveIdPregunta = cveIdPregunta;
	}
	public String getDesPregunta() {
		return desPregunta;
	}
	public void setDesPregunta(String desPregunta) {
		this.desPregunta = desPregunta;
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
	public Integer getIndOrden() {
		return indOrden;
	}
	public void setIndOrden(Integer indOrden) {
		this.indOrden = indOrden;
	}
	public RubroDTO getCveIdRubro() {
		return cveIdRubro;
	}
	public void setCveIdRubro(RubroDTO cveIdRubro) {
		this.cveIdRubro = cveIdRubro;
	}
	public PreguntaDTO getCveIdPreguntaPadre() {
		return cveIdPreguntaPadre;
	}
	public void setCveIdPreguntaPadre(PreguntaDTO cveIdPreguntaPadre) {
		this.cveIdPreguntaPadre = cveIdPreguntaPadre;
	}
	public List<OpcionPreguntaDTO> getNdcOpcionesPregunta() {
		return ndcOpcionesPregunta;
	}
	public void setNdcOpcionesPregunta(List<OpcionPreguntaDTO> ndcOpcionesPregunta) {
		this.ndcOpcionesPregunta = ndcOpcionesPregunta;
	}
	public Long getOpcionSeleccionada() {
		return opcionSeleccionada;
	}
	public void setOpcionSeleccionada(Long opcionSeleccionada) {
		this.opcionSeleccionada = opcionSeleccionada;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Boolean getHabilitaPregunta() {
		return habilitaPregunta;
	}
	public void setHabilitaPregunta(Boolean habilitaPregunta) {
		this.habilitaPregunta = habilitaPregunta;
	}
	public Boolean getHabilitaObservacion() {
		return habilitaObservacion;
	}
	public void setHabilitaObservacion(Boolean habilitaObservacion) {
		this.habilitaObservacion = habilitaObservacion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdPregunta == null) ? 0 : cveIdPregunta.hashCode());
		result = prime * result + ((cveIdPreguntaPadre == null) ? 0 : cveIdPreguntaPadre.hashCode());
		result = prime * result + ((cveIdRubro == null) ? 0 : cveIdRubro.hashCode());
		result = prime * result + ((desPregunta == null) ? 0 : desPregunta.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((habilitaObservacion == null) ? 0 : habilitaObservacion.hashCode());
		result = prime * result + ((habilitaPregunta == null) ? 0 : habilitaPregunta.hashCode());
		result = prime * result + ((indOrden == null) ? 0 : indOrden.hashCode());
		result = prime * result + ((ndcOpcionesPregunta == null) ? 0 : ndcOpcionesPregunta.hashCode());
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((opcionSeleccionada == null) ? 0 : opcionSeleccionada.hashCode());
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
		PreguntaDTO other = (PreguntaDTO) obj;
		if (cveIdPregunta == null) {
			if (other.cveIdPregunta != null)
				return false;
		} else if (!cveIdPregunta.equals(other.cveIdPregunta))
			return false;
		if (cveIdPreguntaPadre == null) {
			if (other.cveIdPreguntaPadre != null)
				return false;
		} else if (!cveIdPreguntaPadre.equals(other.cveIdPreguntaPadre))
			return false;
		if (cveIdRubro == null) {
			if (other.cveIdRubro != null)
				return false;
		} else if (!cveIdRubro.equals(other.cveIdRubro))
			return false;
		if (desPregunta == null) {
			if (other.desPregunta != null)
				return false;
		} else if (!desPregunta.equals(other.desPregunta))
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
		if (habilitaObservacion == null) {
			if (other.habilitaObservacion != null)
				return false;
		} else if (!habilitaObservacion.equals(other.habilitaObservacion))
			return false;
		if (habilitaPregunta == null) {
			if (other.habilitaPregunta != null)
				return false;
		} else if (!habilitaPregunta.equals(other.habilitaPregunta))
			return false;
		if (indOrden == null) {
			if (other.indOrden != null)
				return false;
		} else if (!indOrden.equals(other.indOrden))
			return false;
		if (ndcOpcionesPregunta == null) {
			if (other.ndcOpcionesPregunta != null)
				return false;
		} else if (!ndcOpcionesPregunta.equals(other.ndcOpcionesPregunta))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (opcionSeleccionada == null) {
			if (other.opcionSeleccionada != null)
				return false;
		} else if (!opcionSeleccionada.equals(other.opcionSeleccionada))
			return false;
		return true;
	}
	
}
