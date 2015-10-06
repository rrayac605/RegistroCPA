package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class EstadoAtestiguamientoDTO extends BaseDTO{

	
	private static final long serialVersionUID = -7884257984560843305L;
	private Long cveIdEstadoAtestiguamiento;
    private String desEstadoAtestiguamiento;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    
	public Long getCveIdEstadoAtestiguamiento() {
		return cveIdEstadoAtestiguamiento;
	}
	public void setCveIdEstadoAtestiguamiento(Long cveIdEstadoAtestiguamiento) {
		this.cveIdEstadoAtestiguamiento = cveIdEstadoAtestiguamiento;
	}
	public String getDesEstadoAtestiguamiento() {
		return desEstadoAtestiguamiento;
	}
	public void setDesEstadoAtestiguamiento(String desEstadoAtestiguamiento) {
		this.desEstadoAtestiguamiento = desEstadoAtestiguamiento;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdEstadoAtestiguamiento == null) ? 0 : cveIdEstadoAtestiguamiento.hashCode());
		result = prime * result + ((desEstadoAtestiguamiento == null) ? 0 : desEstadoAtestiguamiento.hashCode());
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
		EstadoAtestiguamientoDTO other = (EstadoAtestiguamientoDTO) obj;
		if (cveIdEstadoAtestiguamiento == null) {
			if (other.cveIdEstadoAtestiguamiento != null)
				return false;
		} else if (!cveIdEstadoAtestiguamiento.equals(other.cveIdEstadoAtestiguamiento))
			return false;
		if (desEstadoAtestiguamiento == null) {
			if (other.desEstadoAtestiguamiento != null)
				return false;
		} else if (!desEstadoAtestiguamiento.equals(other.desEstadoAtestiguamiento))
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
