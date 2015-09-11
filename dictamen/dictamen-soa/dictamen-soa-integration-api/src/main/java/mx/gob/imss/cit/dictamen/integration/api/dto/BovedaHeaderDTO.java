package mx.gob.imss.cit.dictamen.integration.api.dto;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import mx.gob.imss.cit.dictamen.integration.api.dto.base.BaseDTO;

/**
 * 
 * 
 * @author cmarmolejo
 * 
 */
public class BovedaHeaderDTO extends BaseDTO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String contextoEntidad;
	private XMLGregorianCalendar fechaPeticion;
	private String folio;
	private BigInteger idCanal;
	private String idEntidad;
	private BigInteger idOperacion;
	private BigInteger idOrganizacion;
	private BigInteger idServicio;
	private BigInteger idSistema;
	private BigInteger idZona;
	private String nombreTramite;
	private String tipoIdEntidad;
	
	public String getContextoEntidad() {
		return contextoEntidad;
	}
	public void setContextoEntidad(String contextoEntidad) {
		this.contextoEntidad = contextoEntidad;
	}
	public XMLGregorianCalendar getFechaPeticion() {
		return fechaPeticion;
	}
	public void setFechaPeticion(XMLGregorianCalendar fechaPeticion) {
		this.fechaPeticion = fechaPeticion;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public BigInteger getIdCanal() {
		return idCanal;
	}
	public void setIdCanal(BigInteger idCanal) {
		this.idCanal = idCanal;
	}
	public String getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(String idEntidad) {
		this.idEntidad = idEntidad;
	}
	public BigInteger getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(BigInteger idOperacion) {
		this.idOperacion = idOperacion;
	}
	public BigInteger getIdOrganizacion() {
		return idOrganizacion;
	}
	public void setIdOrganizacion(BigInteger idOrganizacion) {
		this.idOrganizacion = idOrganizacion;
	}
	public BigInteger getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(BigInteger idServicio) {
		this.idServicio = idServicio;
	}
	public BigInteger getIdSistema() {
		return idSistema;
	}
	public void setIdSistema(BigInteger idSistema) {
		this.idSistema = idSistema;
	}
	public BigInteger getIdZona() {
		return idZona;
	}
	public void setIdZona(BigInteger idZona) {
		this.idZona = idZona;
	}
	public String getNombreTramite() {
		return nombreTramite;
	}
	public void setNombreTramite(String nombreTramite) {
		this.nombreTramite = nombreTramite;
	}
	public String getTipoIdEntidad() {
		return tipoIdEntidad;
	}
	public void setTipoIdEntidad(String tipoIdEntidad) {
		this.tipoIdEntidad = tipoIdEntidad;
	}	
}

