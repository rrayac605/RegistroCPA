package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class PersonaDefuncionTO extends BaseTO {


	/**
	 * 
	 */
	private static final long serialVersionUID = -2762615559713873505L;


	private long cveIdPersonaDefuncion;


	private Date anioRegistro;

	private String crip;

	private String desOficRegCivil;

	private String numActa;

	private String numFoja;

	private String numLibro;

	private String numTomo;

	private CatMunicipioTO dgCatMunicipio;

	private PersonaTO ditPersona;

	/**
	 * @return the cveIdPersonaDefuncion
	 */
	public long getCveIdPersonaDefuncion() {
		return cveIdPersonaDefuncion;
	}

	/**
	 * @param cveIdPersonaDefuncion the cveIdPersonaDefuncion to set
	 */
	public void setCveIdPersonaDefuncion(long cveIdPersonaDefuncion) {
		this.cveIdPersonaDefuncion = cveIdPersonaDefuncion;
	}

	/**
	 * @return the anioRegistro
	 */
	public Date getAnioRegistro() {
		return anioRegistro != null ? (Date) anioRegistro.clone() : null;
	}

	/**
	 * @param anioRegistro the anioRegistro to set
	 */
	public void setAnioRegistro(Date anioRegistro) {
		this.anioRegistro = anioRegistro;
	}

	/**
	 * @return the crip
	 */
	public String getCrip() {
		return crip;
	}

	/**
	 * @param crip the crip to set
	 */
	public void setCrip(String crip) {
		this.crip = crip;
	}

	/**
	 * @return the desOficRegCivil
	 */
	public String getDesOficRegCivil() {
		return desOficRegCivil;
	}

	/**
	 * @param desOficRegCivil the desOficRegCivil to set
	 */
	public void setDesOficRegCivil(String desOficRegCivil) {
		this.desOficRegCivil = desOficRegCivil;
	}

	/**
	 * @return the numActa
	 */
	public String getNumActa() {
		return numActa;
	}

	/**
	 * @param numActa the numActa to set
	 */
	public void setNumActa(String numActa) {
		this.numActa = numActa;
	}

	/**
	 * @return the numFoja
	 */
	public String getNumFoja() {
		return numFoja;
	}

	/**
	 * @param numFoja the numFoja to set
	 */
	public void setNumFoja(String numFoja) {
		this.numFoja = numFoja;
	}

	/**
	 * @return the numLibro
	 */
	public String getNumLibro() {
		return numLibro;
	}

	/**
	 * @param numLibro the numLibro to set
	 */
	public void setNumLibro(String numLibro) {
		this.numLibro = numLibro;
	}

	/**
	 * @return the numTomo
	 */
	public String getNumTomo() {
		return numTomo;
	}

	/**
	 * @param numTomo the numTomo to set
	 */
	public void setNumTomo(String numTomo) {
		this.numTomo = numTomo;
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
	 * @return the ditPersona
	 */
	public PersonaTO getDitPersona() {
		return ditPersona;
	}

	/**
	 * @param ditPersona the ditPersona to set
	 */
	public void setDitPersona(PersonaTO ditPersona) {
		this.ditPersona = ditPersona;
	}

	
}
