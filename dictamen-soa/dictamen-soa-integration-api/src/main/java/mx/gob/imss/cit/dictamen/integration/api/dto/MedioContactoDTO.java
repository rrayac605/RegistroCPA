package mx.gob.imss.cit.dictamen.integration.api.dto;

public class MedioContactoDTO extends BaseDTO {

	/**
	 * Serial Version UID de la clase
	 */
	private static final long serialVersionUID = 9031272826402555501L;

	private String descripcion;

	private String tipoMedioContacto;

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the tipoMedioContacto
	 */
	public String getTipoMedioContacto() {
		return tipoMedioContacto;
	}

	/**
	 * @param tipoMedioContacto
	 *            the tipoMedioContacto to set
	 */
	public void setTipoMedioContacto(String tipoMedioContacto) {
		this.tipoMedioContacto = tipoMedioContacto;
	}

}
