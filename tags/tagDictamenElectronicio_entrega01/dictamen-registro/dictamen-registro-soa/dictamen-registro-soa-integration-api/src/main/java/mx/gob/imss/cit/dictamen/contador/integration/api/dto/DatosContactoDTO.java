package mx.gob.imss.cit.dictamen.contador.integration.api.dto;

import java.io.Serializable;

/**
 * 
 * @author ariverav
 *
 */
public class DatosContactoDTO implements Serializable {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 317108249806150923L;
	private String email1;
	private String email2;
	private String cEmail1;
	private String cEmail2;
	private String telefono;

	/**
	 * @return the email1
	 */
	public String getEmail1() {
		return email1;
	}

	/**
	 * @param email1
	 *            the email1 to set
	 */
	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	/**
	 * @return the email2
	 */
	public String getEmail2() {
		return email2;
	}

	/**
	 * @param email2
	 *            the email2 to set
	 */
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	/**
	 * @return the cEmail1
	 */
	public String getcEmail1() {
		return cEmail1;
	}

	/**
	 * @param cEmail1
	 *            the cEmail1 to set
	 */
	public void setcEmail1(String cEmail1) {
		this.cEmail1 = cEmail1;
	}

	/**
	 * @return the cEmail2
	 */
	public String getcEmail2() {
		return cEmail2;
	}

	/**
	 * @param cEmail2
	 *            the cEmail2 to set
	 */
	public void setcEmail2(String cEmail2) {
		this.cEmail2 = cEmail2;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}
