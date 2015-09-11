package mx.gob.imss.cit.dictamen.commons.to.domain;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;


public class CatEstadoCpTO extends BaseTO   {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4319010388126452840L;

	private String cveEnt;

	private String cpFinal;

	private String cpInicial;

	private CatEstadoTO dgCatEstado;

	/**
	 * @return the cveEnt
	 */
	public String getCveEnt() {
		return cveEnt;
	}

	/**
	 * @param cveEnt the cveEnt to set
	 */
	public void setCveEnt(String cveEnt) {
		this.cveEnt = cveEnt;
	}

	/**
	 * @return the cpFinal
	 */
	public String getCpFinal() {
		return cpFinal;
	}

	/**
	 * @param cpFinal the cpFinal to set
	 */
	public void setCpFinal(String cpFinal) {
		this.cpFinal = cpFinal;
	}

	/**
	 * @return the cpInicial
	 */
	public String getCpInicial() {
		return cpInicial;
	}

	/**
	 * @param cpInicial the cpInicial to set
	 */
	public void setCpInicial(String cpInicial) {
		this.cpInicial = cpInicial;
	}

	/**
	 * @return the dgCatEstado
	 */
	public CatEstadoTO getDgCatEstado() {
		return dgCatEstado;
	}

	/**
	 * @param dgCatEstado the dgCatEstado to set
	 */
	public void setDgCatEstado(CatEstadoTO dgCatEstado) {
		this.dgCatEstado = dgCatEstado;
	}



	
	
}
