package mx.gob.imss.cit.dictamen.integration.api.dto;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class LayoutDTO extends BaseDTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2644866008364925551L;
	
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
