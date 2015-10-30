package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

public class ColegioDTO implements Serializable {

	private static final long serialVersionUID = -6461289611184997774L;
	private String razonSocial;
	private String rfc;
	private DomicilioDTO domicilio;

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
}
