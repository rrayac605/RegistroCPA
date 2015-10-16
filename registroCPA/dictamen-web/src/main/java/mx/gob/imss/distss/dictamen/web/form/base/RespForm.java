package mx.gob.imss.distss.dictamen.web.form.base;

import java.io.Serializable;

/** @author Dj Leo 06/11/2014
 * The Class RespForm.
 */
public class RespForm implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The respuesta. */
	private String respuesta;
	
	/** The num error. */
	private int   numError;
	
	/**
	 * Gets the respuesta.
	 *
	 * @return the respuesta
	 */
	public String getRespuesta() {
		return respuesta;
	}
	
	/**
	 * Sets the respuesta.
	 *
	 * @param respuesta the new respuesta
	 */
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	/**
	 * Gets the num error.
	 *
	 * @return the num error
	 */
	public int getNumError() {
		return numError;
	}
	
	/**
	 * Sets the num error.
	 *
	 * @param numError the new num error
	 */
	public void setNumError(int numError) {
		this.numError = numError;
	}
	
}
