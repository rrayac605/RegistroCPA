package mx.gob.imss.distss.dictamen.web.form.base;

import java.io.Serializable;


/**@author Dj Leo 06/11/2014
 * The Class FormField.
 */
public class FormField implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** The name. */
	private String name;

	/** The value. */
	private String value;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}
}
