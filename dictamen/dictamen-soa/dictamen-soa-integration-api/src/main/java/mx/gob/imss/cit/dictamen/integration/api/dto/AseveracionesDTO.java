package mx.gob.imss.cit.dictamen.integration.api.dto;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class AseveracionesDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3008888701659406672L;
	
	private Long cveIdAseveracion;
	private String desTipoAseveracion;

	/**
	 * @return the cveIdAseveracion
	 */
	public Long getCveIdAseveracion() {
		return cveIdAseveracion;
	}
	/**
	 * @param cveIdAseveracion the cveIdAseveracion to set
	 */
	public void setCveIdAseveracion(Long cveIdAseveracion) {
		this.cveIdAseveracion = cveIdAseveracion;
	}
	/**
	 * @return the desTipoAseveracion
	 */
	public String getDesTipoAseveracion() {
		return desTipoAseveracion;
	}
	/**
	 * @param desTipoAseveracion the desTipoAseveracion to set
	 */
	public void setDesTipoAseveracion(String desTipoAseveracion) {
		this.desTipoAseveracion = desTipoAseveracion;
	}
}
