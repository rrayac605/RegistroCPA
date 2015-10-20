package mx.gob.imss.cit.dictamen.contador.web.util;

/**
 * ENUM Con las pantallas que se utilizan en el Registro de Solicitud de
 * Pension.
 * 
 * @author anavarrete
 *
 */
public enum EnumPantallasContador {

	CONTADORES(ContadorConstantes.NUM_CERO, "contadores", "Contadores Públicos"),
	SOLICITUD_REGISTRO(ContadorConstantes.NUM_UNO, "solicitudRegistro", "Solicitud de Registro de CPA");

	private int id;
	private String nombre;
	private String descripcion;

	private EnumPantallasContador(int id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dsnombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param dsnombre
	 *            the dsnombre to set
	 */

	public String getNombre() {
		return nombre;
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
}
