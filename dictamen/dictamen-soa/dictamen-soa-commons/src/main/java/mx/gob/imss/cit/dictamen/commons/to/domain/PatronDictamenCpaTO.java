package mx.gob.imss.cit.dictamen.commons.to.domain;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PatronDictamenCpaTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3584629041318151178L;
	
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
