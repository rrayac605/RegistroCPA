package mx.gob.imss.cit.dictamen.integration.api.dto.domain;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

public class PatronDictamenDTO extends BaseDTO  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4965830174738536075L;
	
	private Long cveIdPatronDictamen;
	private String 	rfc;
	private String 	desRfc;
	private Integer numTrabajadoresPromedio;
	private TipoDictamenDTO cveIdTipoDictamen;
	
	private Boolean industriaConstruccion;
	private Boolean empresaValuada;	
	private Boolean actConstruccionOregObra;
	
	private String razonSocialNombre;
	private EjercicioFiscalDTO 	cveIdEjerFiscal;
	private Integer numRegistroPatronales;
	

	

	public TipoDictamenDTO getCveIdTipoDictamen() {
		return cveIdTipoDictamen;
	}
	public void setCveIdTipoDictamen(TipoDictamenDTO cveIdTipoDictamen) {
		this.cveIdTipoDictamen = cveIdTipoDictamen;
	}
	public EjercicioFiscalDTO getCveIdEjerFiscal() {
		return cveIdEjerFiscal;
	}
	public void setCveIdEjerFiscal(EjercicioFiscalDTO cveIdEjerFiscal) {
		this.cveIdEjerFiscal = cveIdEjerFiscal;
	}
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
	/**
	 * @return the cveIdPatronDictamen
	 */
	public Long getCveIdPatronDictamen() {
		return cveIdPatronDictamen;
	}
	/**
	 * @param cveIdPatronDictamen the cveIdPatronDictamen to set
	 */
	public void setCveIdPatronDictamen(Long cveIdPatronDictamen) {
		this.cveIdPatronDictamen = cveIdPatronDictamen;
	}
	/**
	 * @return the desRfc
	 */
	public String getDesRfc() {
		return desRfc;
	}
	/**
	 * @param desRfc the desRfc to set
	 */
	public void setDesRfc(String desRfc) {
		this.desRfc = desRfc;
	}

	
	
}
