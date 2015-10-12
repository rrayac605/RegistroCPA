package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class RubroAtestiguamientoDictDTO extends BaseDTO {

	private static final long serialVersionUID = 587664206914041699L;
	private Long cveIdRubroAtestigDictamen;
    private Short indAplica;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroActualizado;
    private String cveIdUsuario;
    private AtestiguamientoDictamenDTO cveIdAtestigDictamen;
    private RubroDTO cveIdRubro;
    private List<AtestigPreguntasRespuestDTO> ndtAtestigPreguntasRespuestDOList;
	public Long getCveIdRubroAtestigDictamen() {
		return cveIdRubroAtestigDictamen;
	}
	public void setCveIdRubroAtestigDictamen(Long cveIdRubroAtestigDictamen) {
		this.cveIdRubroAtestigDictamen = cveIdRubroAtestigDictamen;
	}
	public Short getIndAplica() {
		return indAplica;
	}
	public void setIndAplica(Short indAplica) {
		this.indAplica = indAplica;
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
	public AtestiguamientoDictamenDTO getCveIdAtestigDictamen() {
		return cveIdAtestigDictamen;
	}
	public void setCveIdAtestigDictamen(AtestiguamientoDictamenDTO cveIdAtestigDictamen) {
		this.cveIdAtestigDictamen = cveIdAtestigDictamen;
	}
	public RubroDTO getCveIdRubro() {
		return cveIdRubro;
	}
	public void setCveIdRubro(RubroDTO cveIdRubro) {
		this.cveIdRubro = cveIdRubro;
	}
	public List<AtestigPreguntasRespuestDTO> getNdtAtestigPreguntasRespuestDOList() {
		return ndtAtestigPreguntasRespuestDOList;
	}
	public void setNdtAtestigPreguntasRespuestDOList(List<AtestigPreguntasRespuestDTO> ndtAtestigPreguntasRespuestDOList) {
		this.ndtAtestigPreguntasRespuestDOList = ndtAtestigPreguntasRespuestDOList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cveIdAtestigDictamen == null) ? 0 : cveIdAtestigDictamen.hashCode());
		result = prime * result + ((cveIdRubro == null) ? 0 : cveIdRubro.hashCode());
		result = prime * result + ((cveIdRubroAtestigDictamen == null) ? 0 : cveIdRubroAtestigDictamen.hashCode());
		result = prime * result + ((cveIdUsuario == null) ? 0 : cveIdUsuario.hashCode());
		result = prime * result + ((fecRegistroActualizado == null) ? 0 : fecRegistroActualizado.hashCode());
		result = prime * result + ((fecRegistroAlta == null) ? 0 : fecRegistroAlta.hashCode());
		result = prime * result + ((fecRegistroBaja == null) ? 0 : fecRegistroBaja.hashCode());
		result = prime * result + ((indAplica == null) ? 0 : indAplica.hashCode());
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
		RubroAtestiguamientoDictDTO other = (RubroAtestiguamientoDictDTO) obj;
		if (cveIdAtestigDictamen == null) {
			if (other.cveIdAtestigDictamen != null)
				return false;
		} else if (!cveIdAtestigDictamen.equals(other.cveIdAtestigDictamen))
			return false;
		if (cveIdRubro == null) {
			if (other.cveIdRubro != null)
				return false;
		} else if (!cveIdRubro.equals(other.cveIdRubro))
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
		if (indAplica == null) {
			if (other.indAplica != null)
				return false;
		} else if (!indAplica.equals(other.indAplica))
			return false;
		return true;
	}

}
