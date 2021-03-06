package mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

public class AtestiguamientoDictamenDTO extends BaseDTO {

	
	private static final long serialVersionUID = -7892175772742349433L;
	private Long cveIdAtestigDictamen;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private String cveIdUsuario;
    private List<RubroAtestiguamientoDictDTO> ndtRubrosAtestiguamiento;
    private PatronDictamenDTO cveIdPatronDictamen;
    private EstadoAtestiguamientoDTO cveIdEstadoAtestiguamiento;
    private AtestiguamientoDTO cveIdAtestiguamiento;
    
	public Long getCveIdAtestigDictamen() {
		return cveIdAtestigDictamen;
	}
	public void setCveIdAtestigDictamen(Long cveIdAtestigDictamen) {
		this.cveIdAtestigDictamen = cveIdAtestigDictamen;
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
	public PatronDictamenDTO getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}
	public void setCveIdPatronDictamen(PatronDictamenDTO cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}
	public EstadoAtestiguamientoDTO getCveIdEstadoAtestiguamiento() {
		return cveIdEstadoAtestiguamiento;
	}
	public void setCveIdEstadoAtestiguamiento(EstadoAtestiguamientoDTO cveIdEstadoAtestiguamiento) {
		this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
	}
	public AtestiguamientoDTO getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}
	public void setCveIdAtestiguamiento(AtestiguamientoDTO cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}
	public List<RubroAtestiguamientoDictDTO> getNdtRubrosAtestiguamiento() {
		return ndtRubrosAtestiguamiento;
	}
	public void setNdtRubrosAtestiguamiento(List<RubroAtestiguamientoDictDTO> ndtRubrosAtestiguamiento) {
		this.ndtRubrosAtestiguamiento = ndtRubrosAtestiguamiento;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdAtestigDictamen == null) ? 0 : cveIdAtestigDictamen.hashCode());
		result = prime * result + ((cveIdAtestiguamiento == null) ? 0 : cveIdAtestiguamiento.hashCode());
		result = prime * result + ((cveIdEstadoAtestiguamiento == null) ? 0 : cveIdEstadoAtestiguamiento.hashCode());
		result = prime * result + ((cveIdPatronDictamen == null) ? 0 : cveIdPatronDictamen.hashCode());
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndtRubrosAtestiguamiento == null) ? 0 : ndtRubrosAtestiguamiento.hashCode());
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
		AtestiguamientoDictamenDTO other = (AtestiguamientoDictamenDTO) obj;
		if (cveIdAtestigDictamen == null) {
			if (other.cveIdAtestigDictamen != null)
				return false;
		} else if (!cveIdAtestigDictamen.equals(other.cveIdAtestigDictamen))
			return false;
		if (cveIdAtestiguamiento == null) {
			if (other.cveIdAtestiguamiento != null)
				return false;
		} else if (!cveIdAtestiguamiento.equals(other.cveIdAtestiguamiento))
			return false;
		if (cveIdEstadoAtestiguamiento == null) {
			if (other.cveIdEstadoAtestiguamiento != null)
				return false;
		} else if (!cveIdEstadoAtestiguamiento.equals(other.cveIdEstadoAtestiguamiento))
			return false;
		if (cveIdPatronDictamen == null) {
			if (other.cveIdPatronDictamen != null)
				return false;
		} else if (!cveIdPatronDictamen.equals(other.cveIdPatronDictamen))
			return false;
		if (cveIdUsuario == null) {
			if (other.cveIdUsuario != null)
				return false;
		} else if (!cveIdUsuario.equals(other.cveIdUsuario))
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
		if (ndtRubrosAtestiguamiento == null) {
			if (other.ndtRubrosAtestiguamiento != null)
				return false;
		} else if (!ndtRubrosAtestiguamiento.equals(other.ndtRubrosAtestiguamiento))
			return false;
		return true;
	}
}
