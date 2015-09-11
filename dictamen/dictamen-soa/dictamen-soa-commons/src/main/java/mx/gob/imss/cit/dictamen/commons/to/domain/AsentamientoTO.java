package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class AsentamientoTO extends BaseTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3450223107280085844L;

	private String agregado;

	private String nomAsen;

	private CatMunicipioTO dgCatMunicipio;

	private CatTipoAsenTO dgCatTipoAsen;

	private List<CodigosPostalesTO> dgCodigosPostales;

	private List<DomicilioGeograficoTO> dgDomicilioGeograficos;

	/**
	 * @return the agregado
	 */
	public String getAgregado() {
		return agregado;
	}

	/**
	 * @param agregado the agregado to set
	 */
	public void setAgregado(String agregado) {
		this.agregado = agregado;
	}

	/**
	 * @return the nomAsen
	 */
	public String getNomAsen() {
		return nomAsen;
	}

	/**
	 * @param nomAsen the nomAsen to set
	 */
	public void setNomAsen(String nomAsen) {
		this.nomAsen = nomAsen;
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
	 * @return the dgCatTipoAsen
	 */
	public CatTipoAsenTO getDgCatTipoAsen() {
		return dgCatTipoAsen;
	}

	/**
	 * @param dgCatTipoAsen the dgCatTipoAsen to set
	 */
	public void setDgCatTipoAsen(CatTipoAsenTO dgCatTipoAsen) {
		this.dgCatTipoAsen = dgCatTipoAsen;
	}

	/**
	 * @return the dgCodigosPostales
	 */
	public List<CodigosPostalesTO> getDgCodigosPostales() {
		return dgCodigosPostales;
	}

	/**
	 * @param dgCodigosPostales the dgCodigosPostales to set
	 */
	public void setDgCodigosPostales(List<CodigosPostalesTO> dgCodigosPostales) {
		this.dgCodigosPostales = dgCodigosPostales;
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
	
	
	

}
