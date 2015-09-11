package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class CatLocalidadTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8906132292545225579L;

	private String agregada;

	private String nomLoc;

	private CatAmbitoTO dgCatAmbito;

	private CatMunicipioTO dgCatMunicipio;

	private CatPeriodoTO dgCatPeriodo;

	private List<DomicilioGeograficoTO> dgDomicilioGeograficos;

	private List<VialidadTO> dgVialidads;

	/**
	 * @return the agregada
	 */
	public String getAgregada() {
		return agregada;
	}

	/**
	 * @param agregada the agregada to set
	 */
	public void setAgregada(String agregada) {
		this.agregada = agregada;
	}

	/**
	 * @return the nomLoc
	 */
	public String getNomLoc() {
		return nomLoc;
	}

	/**
	 * @param nomLoc the nomLoc to set
	 */
	public void setNomLoc(String nomLoc) {
		this.nomLoc = nomLoc;
	}

	/**
	 * @return the dgCatAmbito
	 */
	public CatAmbitoTO getDgCatAmbito() {
		return dgCatAmbito;
	}

	/**
	 * @param dgCatAmbito the dgCatAmbito to set
	 */
	public void setDgCatAmbito(CatAmbitoTO dgCatAmbito) {
		this.dgCatAmbito = dgCatAmbito;
	}

	/**
	 * @return the dgCatMunicipio
	 */
	public CatMunicipioTO getDgCatMunicipio() {
		return dgCatMunicipio;
	}

	/**
	 * @param dgCatMunicipio the dgCatMunicipio to set
	 */
	public void setDgCatMunicipio(CatMunicipioTO dgCatMunicipio) {
		this.dgCatMunicipio = dgCatMunicipio;
	}

	/**
	 * @return the dgCatPeriodo
	 */
	public CatPeriodoTO getDgCatPeriodo() {
		return dgCatPeriodo;
	}

	/**
	 * @param dgCatPeriodo the dgCatPeriodo to set
	 */
	public void setDgCatPeriodo(CatPeriodoTO dgCatPeriodo) {
		this.dgCatPeriodo = dgCatPeriodo;
	}

	/**
	 * @return the dgDomicilioGeograficos
	 */
	public List<DomicilioGeograficoTO> getDgDomicilioGeograficos() {
		return dgDomicilioGeograficos;
	}

	/**
	 * @param dgDomicilioGeograficos the dgDomicilioGeograficos to set
	 */
	public void setDgDomicilioGeograficos(
			List<DomicilioGeograficoTO> dgDomicilioGeograficos) {
		this.dgDomicilioGeograficos = dgDomicilioGeograficos;
	}

	/**
	 * @return the dgVialidads
	 */
	public List<VialidadTO> getDgVialidads() {
		return dgVialidads;
	}

	/**
	 * @param dgVialidads the dgVialidads to set
	 */
	public void setDgVialidads(List<VialidadTO> dgVialidads) {
		this.dgVialidads = dgVialidads;
	}

	
	
}
