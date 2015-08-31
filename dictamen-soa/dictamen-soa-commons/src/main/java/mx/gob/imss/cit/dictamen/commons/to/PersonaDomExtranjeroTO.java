package mx.gob.imss.cit.dictamen.commons.to;

import java.util.Date;

public class PersonaDomExtranjeroTO extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2281632201336570497L;

	private long cveIdDomPersonaExtranjero;

	private String desCalle;

	private String desCiudad;

	private String desEntidad;

	private String desLocalidad;

	private String desPais;

	private Date fecRegistroActualizado;

	private Date fecRegistroAlta;

	private Date fecRegistroBaja;

	private String numExt;

	private String numInt;

	private String refCodigo;

	private PersonaTO ditPersona;

	/**
	 * @return the cveIdDomPersonaExtranjero
	 */
	public long getCveIdDomPersonaExtranjero() {
		return cveIdDomPersonaExtranjero;
	}

	/**
	 * @param cveIdDomPersonaExtranjero the cveIdDomPersonaExtranjero to set
	 */
	public void setCveIdDomPersonaExtranjero(long cveIdDomPersonaExtranjero) {
		this.cveIdDomPersonaExtranjero = cveIdDomPersonaExtranjero;
	}

	/**
	 * @return the desCalle
	 */
	public String getDesCalle() {
		return desCalle;
	}

	/**
	 * @param desCalle the desCalle to set
	 */
	public void setDesCalle(String desCalle) {
		this.desCalle = desCalle;
	}

	/**
	 * @return the desCiudad
	 */
	public String getDesCiudad() {
		return desCiudad;
	}

	/**
	 * @param desCiudad the desCiudad to set
	 */
	public void setDesCiudad(String desCiudad) {
		this.desCiudad = desCiudad;
	}

	/**
	 * @return the desEntidad
	 */
	public String getDesEntidad() {
		return desEntidad;
	}

	/**
	 * @param desEntidad the desEntidad to set
	 */
	public void setDesEntidad(String desEntidad) {
		this.desEntidad = desEntidad;
	}

	/**
	 * @return the desLocalidad
	 */
	public String getDesLocalidad() {
		return desLocalidad;
	}

	/**
	 * @param desLocalidad the desLocalidad to set
	 */
	public void setDesLocalidad(String desLocalidad) {
		this.desLocalidad = desLocalidad;
	}

	/**
	 * @return the desPais
	 */
	public String getDesPais() {
		return desPais;
	}

	/**
	 * @param desPais the desPais to set
	 */
	public void setDesPais(String desPais) {
		this.desPais = desPais;
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
	 * @return the numExt
	 */
	public String getNumExt() {
		return numExt;
	}

	/**
	 * @param numExt the numExt to set
	 */
	public void setNumExt(String numExt) {
		this.numExt = numExt;
	}

	/**
	 * @return the numInt
	 */
	public String getNumInt() {
		return numInt;
	}

	/**
	 * @param numInt the numInt to set
	 */
	public void setNumInt(String numInt) {
		this.numInt = numInt;
	}

	/**
	 * @return the refCodigo
	 */
	public String getRefCodigo() {
		return refCodigo;
	}

	/**
	 * @param refCodigo the refCodigo to set
	 */
	public void setRefCodigo(String refCodigo) {
		this.refCodigo = refCodigo;
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
