package mx.gob.imss.distss.dictamen.modelo.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonafDomFiscal;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonamDomFiscal;

public class DitDomicilioSatDTO implements Serializable {

	private static final long serialVersionUID = -8155758619107342410L;

	private Long cveIdDomicilio;
	private String calle;
	private String codigo;
	private String colonia;
	private String entidadFederativa;
	private String entreCalle1;
	private String entreCalle2;
	private Date fecRegistroActualizado;
	private Date fecRegistroAlta;
	private Date fecRegistroBaja;
	private String inmueble;
	private String localidad;
	private String municipio;
	private String numExterior;
	private String numInterior;
	private String referencia;
	private String vialidad;
	private List<DitPersonafDomFiscal> ditPersonafDomFiscals;
	private List<DitPersonamDomFiscal> ditPersonamDomFiscals;

	public Long getCveIdDomicilio() {
		return cveIdDomicilio;
	}

	public void setCveIdDomicilio(Long cveIdDomicilio) {
		this.cveIdDomicilio = cveIdDomicilio;
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

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getEntidadFederativa() {
		return entidadFederativa;
	}

	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}

	public String getEntreCalle1() {
		return entreCalle1;
	}

	public void setEntreCalle1(String entreCalle1) {
		this.entreCalle1 = entreCalle1;
	}

	public String getEntreCalle2() {
		return entreCalle2;
	}

	public void setEntreCalle2(String entreCalle2) {
		this.entreCalle2 = entreCalle2;
	}

	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado;
	}

	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	public Date getFecRegistroAlta() {
		return fecRegistroAlta;
	}

	public void setFecRegistroAlta(Date fecRegistroAlta) {
		this.fecRegistroAlta = fecRegistroAlta;
	}

	public Date getFecRegistroBaja() {
		return fecRegistroBaja;
	}

	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	public String getInmueble() {
		return inmueble;
	}

	public void setInmueble(String inmueble) {
		this.inmueble = inmueble;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
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

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getVialidad() {
		return vialidad;
	}

	public void setVialidad(String vialidad) {
		this.vialidad = vialidad;
	}

	public List<DitPersonafDomFiscal> getDitPersonafDomFiscals() {
		return ditPersonafDomFiscals;
	}

	public void setDitPersonafDomFiscals(
			List<DitPersonafDomFiscal> ditPersonafDomFiscals) {
		this.ditPersonafDomFiscals = ditPersonafDomFiscals;
	}

	public List<DitPersonamDomFiscal> getDitPersonamDomFiscals() {
		return ditPersonamDomFiscals;
	}

	public void setDitPersonamDomFiscals(
			List<DitPersonamDomFiscal> ditPersonamDomFiscals) {
		this.ditPersonamDomFiscals = ditPersonamDomFiscals;
	}

}
