package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class DespachoDTO implements Serializable {

	private static final long serialVersionUID = -739802508461439450L;
	private String razonSocial;
	private String rfc;
	private DomicilioDTO domicilio;
	private String telefonoFijo;

	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @param razonSocial
	 *            the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * @return the rfc
	 */
	public String getRfc() {
		return rfc;
	}

	/**
	 * @param rfc
	 *            the rfc to set
	 */
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	/**
	 * @return the domicilio
	 */
	public DomicilioDTO getDomicilio() {
		return domicilio;
	}

	/**
	 * @param domicilio
	 *            the domicilio to set
	 */
	public void setDomicilio(DomicilioDTO domicilio) {
		this.domicilio = domicilio;
	}

	/**
	 * @return the telefonoFijo
	 */
	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	/**
	 * @param telefonoFijo
	 *            the telefonoFijo to set
	 */
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	

}
