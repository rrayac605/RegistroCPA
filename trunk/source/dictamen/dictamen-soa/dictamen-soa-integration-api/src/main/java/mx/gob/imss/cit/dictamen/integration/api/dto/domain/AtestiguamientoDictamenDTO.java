package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class AtestiguamientoDictamenDTO extends BaseDTO {

	
	private static final long serialVersionUID = -7892175772742349433L;
	private Long cveIdAtestigDictamen;
    private Long cveIdDictamen;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private String cveIdUsuario;
    private PatronDictamenDTO cveIdPatronDictamen;
    private EstadoAtestiguamientoDTO cveIdEstadoAtestiguamiento;
    private AtestiguamientoDTO cveIdAtestiguamiento;
	public Long getCveIdAtestigDictamen() {
		return cveIdAtestigDictamen;
	}
	public void setCveIdAtestigDictamen(Long cveIdAtestigDictamen) {
		this.cveIdAtestigDictamen = cveIdAtestigDictamen;
	}
	public Long getCveIdDictamen() {
		return cveIdDictamen;
	}
	public void setCveIdDictamen(Long cveIdDictamen) {
		this.cveIdDictamen = cveIdDictamen;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdAtestigDictamen == null) ? 0 : cveIdAtestigDictamen.hashCode());
		result = prime * result + ((cveIdAtestiguamiento == null) ? 0 : cveIdAtestiguamiento.hashCode());
		result = prime * result + ((cveIdDictamen == null) ? 0 : cveIdDictamen.hashCode());
		result = prime * result + ((cveIdEstadoAtestiguamiento == null) ? 0 : cveIdEstadoAtestiguamiento.hashCode());
		result = prime * result + ((cveIdPatronDictamen == null) ? 0 : cveIdPatronDictamen.hashCode());
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
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
		if (cveIdDictamen == null) {
			if (other.cveIdDictamen != null)
				return false;
		} else if (!cveIdDictamen.equals(other.cveIdDictamen))
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
		return true;
	}
    
}
