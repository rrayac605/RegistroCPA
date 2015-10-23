package mx.gob.imss.cit.dictamen.contador.commons.to.domain;

import java.io.Serializable;

public class DomicilioTO implements Serializable{

	private static final long serialVersionUID = -472364403330767340L;
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Integer getNumeroExterior() {
		return numeroExterior;
	}
	public void setNumeroExterior(Integer numeroExterior) {
		this.numeroExterior = numeroExterior;
	}
	public String getLetraExterior() {
		return letraExterior;
	}
	public void setLetraExterior(String letraExterior) {
		this.letraExterior = letraExterior;
	}
	public Integer getNumeroInterior() {
		return numeroInterior;
	}
	public void setNumeroInterior(Integer numeroInterior) {
		this.numeroInterior = numeroInterior;
	}
	public String getLetraInterior() {
		return letraInterior;
	}
	public void setLetraInterior(String letraInterior) {
		this.letraInterior = letraInterior;
	}
	public String getEntreCalle() {
		return entreCalle;
	}
	public void setEntreCalle(String entreCalle) {
		this.entreCalle = entreCalle;
	}
	public String getyCalle() {
		return yCalle;
	}
	public void setyCalle(String yCalle) {
		this.yCalle = yCalle;
	}
	public String getColoniaAsentamiento() {
		return coloniaAsentamiento;
	}
	public void setColoniaAsentamiento(String coloniaAsentamiento) {
		this.coloniaAsentamiento = coloniaAsentamiento;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
	public String getMunicipioDelegacion() {
		return municipioDelegacion;
	}
	public void setMunicipioDelegacion(String municipioDelegacion) {
		this.municipioDelegacion = municipioDelegacion;
	}
	public String getEntidadFederativa() {
		return entidadFederativa;
	}
	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getCveEntidadFederativa() {
		return cveEntidadFederativa;
	}
	public void setCveEntidadFederativa(String cveEntidadFederativa) {
		this.cveEntidadFederativa = cveEntidadFederativa;
	}
	private String calle;
	private Integer numeroExterior;
	private String letraExterior;
	private Integer numeroInterior;
	private String letraInterior;
	private String entreCalle;
	private String yCalle; 
	private String coloniaAsentamiento;
	private String Localidad;
	private String municipioDelegacion;
	private String entidadFederativa;
	private String codigoPostal;
    private String cveEntidadFederativa;
	
	


}
