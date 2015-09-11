package mx.gob.imss.cit.dictamen.commons.to.domain;

import java.util.Date;
import java.util.List;

import mx.gob.imss.cit.dictamen.commons.to.base.BaseTO;

public class DomicilioSatTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6749231647730317696L;

	private long cveIdDomicilio;

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

	private List<PersonafDomFiscalTO> ditPersonafDomFiscals;

	private List<PersonamDomFiscalTO> ditPersonamDomFiscals;

	/**
	 * @return the cveIdDomicilio
	 */
	public long getCveIdDomicilio() {
		return cveIdDomicilio;
	}

	/**
	 * @param cveIdDomicilio the cveIdDomicilio to set
	 */
	public void setCveIdDomicilio(long cveIdDomicilio) {
		this.cveIdDomicilio = cveIdDomicilio;
	}

	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the colonia
	 */
	public String getColonia() {
		return colonia;
	}

	/**
	 * @param colonia the colonia to set
	 */
	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	/**
	 * @return the entidadFederativa
	 */
	public String getEntidadFederativa() {
		return entidadFederativa;
	}

	/**
	 * @param entidadFederativa the entidadFederativa to set
	 */
	public void setEntidadFederativa(String entidadFederativa) {
		this.entidadFederativa = entidadFederativa;
	}

	/**
	 * @return the entreCalle1
	 */
	public String getEntreCalle1() {
		return entreCalle1;
	}

	/**
	 * @param entreCalle1 the entreCalle1 to set
	 */
	public void setEntreCalle1(String entreCalle1) {
		this.entreCalle1 = entreCalle1;
	}

	/**
	 * @return the entreCalle2
	 */
	public String getEntreCalle2() {
		return entreCalle2;
	}

	/**
	 * @param entreCalle2 the entreCalle2 to set
	 */
	public void setEntreCalle2(String entreCalle2) {
		this.entreCalle2 = entreCalle2;
	}



	/**
	 * @return the fecRegistroActualizado
	 */
	public Date getFecRegistroActualizado() {
		return fecRegistroActualizado != null ? (Date) fecRegistroActualizado.clone() : null;
	}

	/**
	 * @param fecRegistroActualizado the fecRegistroActualizado to set
	 */
	public void setFecRegistroActualizado(Date fecRegistroActualizado) {
		this.fecRegistroActualizado = fecRegistroActualizado;
	}

	/**
	 * @return the fecRegistroAlta
	 */
	public Date getFecRegistroAlta() {
		return fecRegistroAlta != null ? (Date) fecRegistroAlta.clone() : null;
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
		return fecRegistroBaja != null ? (Date) fecRegistroBaja.clone() : null;
	}

	/**
	 * @param fecRegistroBaja the fecRegistroBaja to set
	 */
	public void setFecRegistroBaja(Date fecRegistroBaja) {
		this.fecRegistroBaja = fecRegistroBaja;
	}

	/**
	 * @return the inmueble
	 */
	public String getInmueble() {
		return inmueble;
	}

	/**
	 * @param inmueble the inmueble to set
	 */
	public void setInmueble(String inmueble) {
		this.inmueble = inmueble;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the numExterior
	 */
	public String getNumExterior() {
		return numExterior;
	}

	/**
	 * @param numExterior the numExterior to set
	 */
	public void setNumExterior(String numExterior) {
		this.numExterior = numExterior;
	}

	/**
	 * @return the numInterior
	 */
	public String getNumInterior() {
		return numInterior;
	}

	/**
	 * @param numInterior the numInterior to set
	 */
	public void setNumInterior(String numInterior) {
		this.numInterior = numInterior;
	}

	/**
	 * @return the referencia
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * @param referencia the referencia to set
	 */
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	/**
	 * @return the vialidad
	 */
	public String getVialidad() {
		return vialidad;
	}

	/**
	 * @param vialidad the vialidad to set
	 */
	public void setVialidad(String vialidad) {
		this.vialidad = vialidad;
	}

	/**
	 * @return the ditPersonafDomFiscals
	 */
	public List<PersonafDomFiscalTO> getDitPersonafDomFiscals() {
		return ditPersonafDomFiscals;
	}

	/**
	 * @param ditPersonafDomFiscals the ditPersonafDomFiscals to set
	 */
	public void setDitPersonafDomFiscals(
			List<PersonafDomFiscalTO> ditPersonafDomFiscals) {
		this.ditPersonafDomFiscals = ditPersonafDomFiscals;
	}

	/**
	 * @return the ditPersonamDomFiscals
	 */
	public List<PersonamDomFiscalTO> getDitPersonamDomFiscals() {
		return ditPersonamDomFiscals;
	}

	/**
	 * @param ditPersonamDomFiscals the ditPersonamDomFiscals to set
	 */
	public void setDitPersonamDomFiscals(
			List<PersonamDomFiscalTO> ditPersonamDomFiscals) {
		this.ditPersonamDomFiscals = ditPersonamDomFiscals;
	}

	
	
}
