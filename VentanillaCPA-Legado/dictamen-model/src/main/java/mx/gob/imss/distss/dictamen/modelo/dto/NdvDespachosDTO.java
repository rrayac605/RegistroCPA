package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;

public class NdvDespachosDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4631360183331889844L;

	private Long cveIdDespacho;
    
    private Long cveIdPersonaMoral;
    
    private String calle;
    
    private String codigo;
    
    private Long cveIdPmdomFiscal;
    
    private String denominacionRazonSocial;
    
    private String entidadFederativa;
    
    private String municipio;
    
    private String nombreComercial;
    
    private String numExterior;
    
    private String numInterior;
    
    private String rfc;

	public Long getCveIdDespacho() {
		return cveIdDespacho;
	}

	public void setCveIdDespacho(Long cveIdDespacho) {
		this.cveIdDespacho = cveIdDespacho;
	}

	public Long getCveIdPersonaMoral() {
		return cveIdPersonaMoral;
	}

	public void setCveIdPersonaMoral(Long cveIdPersonaMoral) {
		this.cveIdPersonaMoral = cveIdPersonaMoral;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getCveIdPmdomFiscal() {
		return cveIdPmdomFiscal;
	}

	public void setCveIdPmdomFiscal(Long cveIdPmdomFiscal) {
		this.cveIdPmdomFiscal = cveIdPmdomFiscal;
	}

	public String getDenominacionRazonSocial() {
		return denominacionRazonSocial;
	}

	public void setDenominacionRazonSocial(String denominacionRazonSocial) {
		this.denominacionRazonSocial = denominacionRazonSocial;
	}

	public String getEntidadFederativa() {
		return entidadFederativa;
	}

	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNumExterior() {
		return numExterior;
	}

	public void setNumExterior(String numExterior) {
		this.numExterior = numExterior;
	}

	public String getNumInterior() {
		return numInterior;
	}

	public void setNumInterior(String numInterior) {
		this.numInterior = numInterior;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
    
}
