package mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.base.BaseDTO;

public class AtestiguamientoDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	private Long cveIdAtestiguamiento;
    private String desAtestiguamiento;
    private Date fecRegistroAlta;
    private Date fecRegistroActualizado;
    private Date fecRegistroBaja;
    private List<RubroDTO> ndcRubros;
    private List<AtestiguamientoDictamenDTO> ndtAtestiguamientosDictamen;
    
	public Long getCveIdAtestiguamiento() {
		return cveIdAtestiguamiento;
	}
	public void setCveIdAtestiguamiento(Long cveIdAtestiguamiento) {
		this.cveIdAtestiguamiento = cveIdAtestiguamiento;
	}
	public String getDesAtestiguamiento() {
		return desAtestiguamiento;
	}
	public void setDesAtestiguamiento(String desAtestiguamiento) {
		this.desAtestiguamiento = desAtestiguamiento;
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
	
	public List<RubroDTO> getNdcRubros() {
		return ndcRubros;
	}
	public void setNdcRubros(List<RubroDTO> ndcRubro) {
		this.ndcRubros = ndcRubro;
	}
	public List<AtestiguamientoDictamenDTO> getNdtAtestiguamientosDictamen() {
		return ndtAtestiguamientosDictamen;
	}
	public void setNdtAtestiguamientosDictamen(List<AtestiguamientoDictamenDTO> ndtAtestiguamientosDictamen) {
		this.ndtAtestiguamientosDictamen = ndtAtestiguamientosDictamen;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdAtestiguamiento == null) ? 0 : cveIdAtestiguamiento.hashCode());
		result = prime * result + ((desAtestiguamiento == null) ? 0 : desAtestiguamiento.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((ndcRubros == null) ? 0 : ndcRubros.hashCode());
		result = prime * result + ((ndtAtestiguamientosDictamen == null) ? 0 : ndtAtestiguamientosDictamen.hashCode());
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
		AtestiguamientoDTO other = (AtestiguamientoDTO) obj;
		if (cveIdAtestiguamiento == null) {
			if (other.cveIdAtestiguamiento != null)
				return false;
		} else if (!cveIdAtestiguamiento.equals(other.cveIdAtestiguamiento))
			return false;
		if (desAtestiguamiento == null) {
			if (other.desAtestiguamiento != null)
				return false;
		} else if (!desAtestiguamiento.equals(other.desAtestiguamiento))
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
		if (ndcRubros == null) {
			if (other.ndcRubros != null)
				return false;
		} else if (!ndcRubros.equals(other.ndcRubros))
			return false;
		if (ndtAtestiguamientosDictamen == null) {
			if (other.ndtAtestiguamientosDictamen != null)
				return false;
		} else if (!ndtAtestiguamientosDictamen.equals(other.ndtAtestiguamientosDictamen))
			return false;
		return true;
	}
	
	
}
