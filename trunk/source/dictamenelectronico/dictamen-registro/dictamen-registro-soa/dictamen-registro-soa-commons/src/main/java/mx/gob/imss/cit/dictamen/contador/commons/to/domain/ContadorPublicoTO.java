package mx.gob.imss.cit.dictamen.contador.commons.to.domain;

import java.io.Serializable;

public class ContadorPublicoTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8258514210848734199L;

	
	public Integer getNumRegistroCPA() {
		return numRegistroCPA;
	}
	public void setNumRegistroCPA(Integer numRegistroCPA) {
		this.numRegistroCPA = numRegistroCPA;
	}
	public Long getCveIdEstadoCPA() {
		return cveIdEstadoCPA;
	}
	public void setCveIdEstadoCPA(Long cveIdEstadoCPA) {
		this.cveIdEstadoCPA = cveIdEstadoCPA;
	}
	private Integer numRegistroCPA;
	private Long cveIdEstadoCPA;
}
