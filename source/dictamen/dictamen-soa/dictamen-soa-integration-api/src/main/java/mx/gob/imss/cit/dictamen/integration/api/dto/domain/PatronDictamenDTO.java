package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class PatronDictamenDTO extends BaseDTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4965830174738536075L;
	String 	rfc;
	Integer numTrabajadoresPromedio;
	Long idTipoDictamen;
	
	Boolean industriaConstruccion;
	Boolean empresaValuada;	
	Boolean actConstruccionOregObra;
	
	String razonSocialNombre;
	Long 	ejercicioDictaminar;
	Integer numRegistroPatronales;

	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return rfc;
	}
	/**
	 * @param rfc the rfc to set
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	/**
	 * @return the numTrabajadoresPromedio
	 */
	public Integer getNumTrabajadoresPromedio() {
		return numTrabajadoresPromedio;
	}
	/**
	 * @param numTrabajadoresPromedio the numTrabajadoresPromedio to set
	 */
	public void setNumTrabajadoresPromedio(Integer numTrabajadoresPromedio) {
		this.numTrabajadoresPromedio = numTrabajadoresPromedio;
	}
	/**
	 * @return the idTipoDictamen
	 */
	public Long getIdTipoDictamen() {
		return idTipoDictamen;
	}
	/**
	 * @param idTipoDictamen the idTipoDictamen to set
	 */
	public void setIdTipoDictamen(Long idTipoDictamen) {
		this.idTipoDictamen = idTipoDictamen;
	}
	/**
	 * @return the industriaConstruccion
	 */
	public Boolean getIndustriaConstruccion() {
		return industriaConstruccion;
	}
	/**
	 * @param industriaConstruccion the industriaConstruccion to set
	 */
	public void setIndustriaConstruccion(Boolean industriaConstruccion) {
		this.industriaConstruccion = industriaConstruccion;
	}
	/**
	 * @return the empresaValuada
	 */
	public Boolean getEmpresaValuada() {
		return empresaValuada;
	}
	/**
	 * @param empresaValuada the empresaValuada to set
	 */
	public void setEmpresaValuada(Boolean empresaValuada) {
		this.empresaValuada = empresaValuada;
	}
	/**
	 * @return the actConstruccionOregObra
	 */
	public Boolean getActConstruccionOregObra() {
		return actConstruccionOregObra;
	}
	/**
	 * @param actConstruccionOregObra the actConstruccionOregObra to set
	 */
	public void setActConstruccionOregObra(Boolean actConstruccionOregObra) {
		this.actConstruccionOregObra = actConstruccionOregObra;
	}
	/**
	 * @return the razonSocialNombre
	 */
	public String getRazonSocialNombre() {
		return razonSocialNombre;
	}
	/**
	 * @param razonSocialNombre the razonSocialNombre to set
	 */
	public void setRazonSocialNombre(String razonSocialNombre) {
		this.razonSocialNombre = razonSocialNombre;
	}
	/**
	 * @return the ejercicioDictaminar
	 */
	public Long getEjercicioDictaminar() {
		return ejercicioDictaminar;
	}
	/**
	 * @param ejercicioDictaminar the ejercicioDictaminar to set
	 */
	public void setEjercicioDictaminar(Long ejercicioDictaminar) {
		this.ejercicioDictaminar = ejercicioDictaminar;
	}
	/**
	 * @return the numRegistroPatronales
	 */
	public Integer getNumRegistroPatronales() {
		return numRegistroPatronales;
	}
	/**
	 * @param numRegistroPatronales the numRegistroPatronales to set
	 */
	public void setNumRegistroPatronales(Integer numRegistroPatronales) {
		this.numRegistroPatronales = numRegistroPatronales;
	}

	
	
}
