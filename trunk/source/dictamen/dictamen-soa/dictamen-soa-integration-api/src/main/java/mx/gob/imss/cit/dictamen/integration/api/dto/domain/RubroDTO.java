package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class RubroDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9131772946363586700L;
	private Long cveIdRubro;
    private String desRubro;
    private Date fecAltaRegistro;
    private Date fecActualizadoRegistro;
    private Date fecBajaRegistro;
    private Integer indOrden;
    private List<PreguntaDTO> ndcPreguntas;

	public Long getCveIdRubro() {
		return cveIdRubro;
	}
	public void setCveIdRubro(Long cveIdRubro) {
		this.cveIdRubro = cveIdRubro;
	}
	public String getDesRubro() {
		return desRubro;
	}
	public void setDesRubro(String desRubro) {
		this.desRubro = desRubro;
	}
	public Date getFecAltaRegistro() {
		return fecAltaRegistro;
	}
	public void setFecAltaRegistro(Date fecAltaRegistro) {
		this.fecAltaRegistro = fecAltaRegistro;
	}
	public Date getFecActualizadoRegistro() {
		return fecActualizadoRegistro;
	}
	public void setFecActualizadoRegistro(Date fecActualizadoRegistro) {
		this.fecActualizadoRegistro = fecActualizadoRegistro;
	}
	public Date getFecBajaRegistro() {
		return fecBajaRegistro;
	}
	public void setFecBajaRegistro(Date fecBajaRegistro) {
		this.fecBajaRegistro = fecBajaRegistro;
	}
	public Integer getIndOrden() {
		return indOrden;
	}
	public void setIndOrden(Integer indOrden) {
		this.indOrden = indOrden;
	}
	public List<PreguntaDTO> getNdcPreguntas() {
		return ndcPreguntas;
	}
	public void setNdcPreguntas(List<PreguntaDTO> ndcPreguntaDOList) {
		this.ndcPreguntas = ndcPreguntaDOList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdRubro == null) ? 0 : cveIdRubro.hashCode());
		result = prime * result + ((desRubro == null) ? 0 : desRubro.hashCode());
		result = prime * result + ((fecActualizadoRegistro == null) ? 0 : fecActualizadoRegistro.hashCode());
		result = prime * result + ((fecAltaRegistro == null) ? 0 : fecAltaRegistro.hashCode());
		result = prime * result + ((fecBajaRegistro == null) ? 0 : fecBajaRegistro.hashCode());
		result = prime * result + ((indOrden == null) ? 0 : indOrden.hashCode());
		result = prime * result + ((ndcPreguntas == null) ? 0 : ndcPreguntas.hashCode());
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
		RubroDTO other = (RubroDTO) obj;
		if (cveIdRubro == null) {
			if (other.cveIdRubro != null)
				return false;
		} else if (!cveIdRubro.equals(other.cveIdRubro))
			return false;
		if (desRubro == null) {
			if (other.desRubro != null)
				return false;
		} else if (!desRubro.equals(other.desRubro))
			return false;
		if (fecActualizadoRegistro == null) {
			if (other.fecActualizadoRegistro != null)
				return false;
		} else if (!fecActualizadoRegistro.equals(other.fecActualizadoRegistro))
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
		if (indOrden == null) {
			if (other.indOrden != null)
				return false;
		} else if (!indOrden.equals(other.indOrden))
			return false;
		if (ndcPreguntas == null) {
			if (other.ndcPreguntas != null)
				return false;
		} else if (!ndcPreguntas.equals(other.ndcPreguntas))
			return false;
		return true;
	}
	
	
	
}
