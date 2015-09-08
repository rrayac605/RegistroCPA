package mx.gob.imss.cit.dictamen.integration.api.dto;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class TipoDictamenDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5390619474477148913L;

	Integer idDictamen;
	
	String descTipoDictamen;

	/**
	 * @return the idDictamen
	 */
	public Integer getIdDictamen() {
		return idDictamen;
	}

	/**
	 * @param idDictamen the idDictamen to set
	 */
	public void setIdDictamen(Integer idDictamen) {
		this.idDictamen = idDictamen;
	}

	/**
	 * @return the descTipoDictamen
	 */
	public String getDescTipoDictamen() {
		return descTipoDictamen;
	}

	/**
	 * @param descTipoDictamen the descTipoDictamen to set
	 */
	public void setDescTipoDictamen(String descTipoDictamen) {
		this.descTipoDictamen = descTipoDictamen;
	}
	
	
}
