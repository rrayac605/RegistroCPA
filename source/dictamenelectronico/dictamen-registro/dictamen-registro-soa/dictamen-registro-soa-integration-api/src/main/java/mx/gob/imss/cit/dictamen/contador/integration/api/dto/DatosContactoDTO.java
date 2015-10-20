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

}
