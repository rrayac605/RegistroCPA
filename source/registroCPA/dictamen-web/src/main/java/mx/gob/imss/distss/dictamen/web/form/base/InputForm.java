package mx.gob.imss.distss.dictamen.web.form.base;

/**
 * The Class InputForm.
 *
 * @author Dj Leo 05/11/2014
 * The Class InputForm.
 */
public class InputForm {
	
	/** The json. */
	private String json;
	
	/** The opcion. */
	private int opcion;
	
	/** The campos. */
	private FormField[] campos;
	
	/**
	 * Gets the json.
	 *
	 * @return the json
	 */
	public String getJson() {
		return json;
	}

	/**
	 * Sets the json.
	 *
	 * @param json the new json
	 */
	public void setJson(String json) {
		this.json = json;
	}

	/**
	 * Gets the opcion.
	 *
	 * @return the opcion
	 */
	public int getOpcion() {
		return opcion;
	}

	/**
	 * Sets the opcion.
	 *
	 * @param opcion the new opcion
	 */
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	/**
	 * Gets the campos.
	 *
	 * @return the campos
	 */
	public FormField[] getCampos() {
		return campos;
	}

	/**
	 * Sets the campos.
	 *
	 * @param campos the new campos
	 */
	public void setCampos(FormField[] campos) {
		this.campos = campos;
	}
}
