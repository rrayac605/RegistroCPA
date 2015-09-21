/**
 * 
 */
package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

/**
 * @author ajfuentes
 *
 */
public class PatronDictamenTO extends BaseTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;    

    private Long cveIdPatronDictamen;
    private String desRfc;
    private String desNombreRazonSocial;
    private Integer numNumeroTrabajadores;
    private Integer numRegistroPatronales;
    private Integer indPatronObligado;
    private Short indPatronConstruccion;
    private Short indRealizoActConstruccion;
    private Short indPatronEmpresaValuada;
    private String desNumeroFolioDictamen;
    private Date fecRegistroAlta;
    private Date fecRegistroBaja;
    private Date fecRegistroAutorizado;
    private String cveIdUsuario;
    private Long cveIdTipoDictamenId;    
    private Long cveIdEjerFiscalId;
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
	/**
	 * @return the desNombreRazonSocial
	 */
	public String getDesNombreRazonSocial() {
		return desNombreRazonSocial;
	}
	/**
	 * @param desNombreRazonSocial the desNombreRazonSocial to set
	 */
	public void setDesNombreRazonSocial(String desNombreRazonSocial) {
		this.desNombreRazonSocial = desNombreRazonSocial;
	}
	/**
	 * @return the numNumeroTrabajadores
	 */
	public Integer getNumNumeroTrabajadores() {
		return numNumeroTrabajadores;
	}
	/**
	 * @param numNumeroTrabajadores the numNumeroTrabajadores to set
	 */
	public void setNumNumeroTrabajadores(Integer numNumeroTrabajadores) {
		this.numNumeroTrabajadores = numNumeroTrabajadores;
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
	 * @return the indPatronObligado
	 */
	public Integer getIndPatronObligado() {
		return indPatronObligado;
	}
	/**
	 * @param indPatronObligado the indPatronObligado to set
	 */
	public void setIndPatronObligado(Integer indPatronObligado) {
		this.indPatronObligado = indPatronObligado;
	}
	/**
	 * @return the indPatronConstruccion
	 */
	public Short getIndPatronConstruccion() {
		return indPatronConstruccion;
	}
	/**
	 * @param indPatronConstruccion the indPatronConstruccion to set
	 */
	public void setIndPatronConstruccion(Short indPatronConstruccion) {
		this.indPatronConstruccion = indPatronConstruccion;
	}
	/**
	 * @return the indRealizoActConstruccion
	 */
	public Short getIndRealizoActConstruccion() {
		return indRealizoActConstruccion;
	}
	/**
	 * @param indRealizoActConstruccion the indRealizoActConstruccion to set
	 */
	public void setIndRealizoActConstruccion(Short indRealizoActConstruccion) {
		this.indRealizoActConstruccion = indRealizoActConstruccion;
	}
	/**
	 * @return the indPatronEmpresaValuada
	 */
	public Short getIndPatronEmpresaValuada() {
		return indPatronEmpresaValuada;
	}
	/**
	 * @param indPatronEmpresaValuada the indPatronEmpresaValuada to set
	 */
	public void setIndPatronEmpresaValuada(Short indPatronEmpresaValuada) {
		this.indPatronEmpresaValuada = indPatronEmpresaValuada;
	}
	/**
	 * @return the desNumeroFolioDictamen
	 */
	public String getDesNumeroFolioDictamen() {
		return desNumeroFolioDictamen;
	}
	/**
	 * @param desNumeroFolioDictamen the desNumeroFolioDictamen to set
	 */
	public void setDesNumeroFolioDictamen(String desNumeroFolioDictamen) {
		this.desNumeroFolioDictamen = desNumeroFolioDictamen;
	}
	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}
	/**
	 * @param fecRegistroAlta the fecRegistroAlta to set
	 */
	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}
	/**
	 * @return the fecRegistroBaja
	 */
	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}
	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}
	/**
	 * @return the fecRegistroAutorizado
	 */
	public Date getFecRegistroAutorizado() {
		return fecRegistroAutorizado;
	}
	/**
	 * @param fecRegistroAutorizado the fecRegistroAutorizado to set
	 */
	public void setFecRegistroAutorizado(Date fecRegistroAutorizado) {
		this.fecRegistroAutorizado = fecRegistroAutorizado;
	}
	/**
	 * @return the cveIdUsuario
	 */
	public String getCveIdUsuario() {
		return cveIdUsuario;
	}
	/**
	 * @param cveIdUsuario the cveIdUsuario to set
	 */
	public void setCveIdUsuario(String cveIdUsuario) {
		this.cveIdUsuario = cveIdUsuario;
	}
	/**
	 * @return the cveIdTipoDictamenId
	 */
	public Long getCveIdTipoDictamenId() {
		return cveIdTipoDictamenId;
	}
	/**
	 * @param cveIdTipoDictamenId the cveIdTipoDictamenId to set
	 */
	public void setCveIdTipoDictamenId(Long cveIdTipoDictamenId) {
		this.cveIdTipoDictamenId = cveIdTipoDictamenId;
	}
	/**
	 * @return the cveIdEjerFiscalId
	 */
	public Long getCveIdEjerFiscalId() {
		return cveIdEjerFiscalId;
	}
	/**
	 * @param cveIdEjerFiscalId the cveIdEjerFiscalId to set
	 */
	public void setCveIdEjerFiscalId(Long cveIdEjerFiscalId) {
		this.cveIdEjerFiscalId = cveIdEjerFiscalId;
	}
   



}
