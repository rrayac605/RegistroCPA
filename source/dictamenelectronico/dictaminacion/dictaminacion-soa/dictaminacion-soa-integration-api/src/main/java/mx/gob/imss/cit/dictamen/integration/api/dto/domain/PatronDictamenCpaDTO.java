package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class PatronDictamenCpaDTO extends BaseDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3769354967191211732L;
	
	private Long cveIdPatronCpaDictamen;

	/**
	 * @return the cveIdPatronCpaDictamen
	 */
	public Long getCveIdPatronCpaDictamen() {
		return cveIdPatronCpaDictamen;
	}

	/**
	 * @param cveIdPatronCpaDictamen the cveIdPatronCpaDictamen to set
	 */
	public void setCveIdPatronCpaDictamen(Long cveIdPatronCpaDictamen) {
		this.cveIdPatronCpaDictamen = cveIdPatronCpaDictamen;
	}

}
