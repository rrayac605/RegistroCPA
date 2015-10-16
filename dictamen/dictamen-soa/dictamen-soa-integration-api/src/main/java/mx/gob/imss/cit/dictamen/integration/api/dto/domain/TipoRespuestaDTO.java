package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class TipoRespuestaDTO extends BaseDTO {
	private static final long serialVersionUID = 7566762193029409672L;
	private Long cveIdRespuesta;
    private String desTipoRespuesta;
    private Date fecRegistroAlta;
    private Date fecRegistroActualizado;
    private Date fecRegistroBaja;
	
    
    public Long getCveIdRespuesta() {
		return cveIdRespuesta;
	}
	public void setCveIdRespuesta(Long cveIdRespuesta) {
		this.cveIdRespuesta = cveIdRespuesta;
	}
	public String getDesTipoRespuesta() {
		return desTipoRespuesta;
	}
	public void setDesTipoRespuesta(String desTipoRespuesta) {
		this.desTipoRespuesta = desTipoRespuesta;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdRespuesta == null) ? 0 : cveIdRespuesta.hashCode());
		result = prime * result + ((desTipoRespuesta == null) ? 0 : desTipoRespuesta.hashCode());
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
		TipoRespuestaDTO other = (TipoRespuestaDTO) obj;
		if (cveIdRespuesta == null) {
			if (other.cveIdRespuesta != null)
				return false;
		} else if (!cveIdRespuesta.equals(other.cveIdRespuesta))
			return false;
		if (desTipoRespuesta == null) {
			if (other.desTipoRespuesta != null)
				return false;
		} else if (!desTipoRespuesta.equals(other.desTipoRespuesta))
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
