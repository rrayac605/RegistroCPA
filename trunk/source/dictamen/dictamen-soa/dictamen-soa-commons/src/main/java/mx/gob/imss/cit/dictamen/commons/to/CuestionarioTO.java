package mx.gob.imss.cit.dictamen.commons.to;

/**
 * @author lsantiago
 *
 */
public class CuestionarioTO extends BaseTO {

	/**
	 * Serial Version UID de la clase
	 */
	private static final long serialVersionUID = -5048928266069489289L;

	private String clave;
	private String inciso;
	private String descripcion;
	private boolean obligatoria;
	private String respuesta;

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave
	 *            the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the inciso
	 */
	public String getInciso() {
		return inciso;
	}

	/**
	 * @param inciso
	 *            the inciso to set
	 */
	public void setInciso(String inciso) {
		this.inciso = inciso;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the obligatoria
	 */
	public boolean isObligatoria() {
		return obligatoria;
	}

	/**
	 * @param obligatoria
	 *            the obligatoria to set
	 */
	public void setObligatoria(boolean obligatoria) {
		this.obligatoria = obligatoria;
	}

	/**
	 * @return the respuesta
	 */
	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * @param respuesta
	 *            the respuesta to set
	 */
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
