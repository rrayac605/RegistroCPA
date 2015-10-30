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
	SOLICITUD_REGISTRO(ContadorConstantes.NUM_UNO, "solicitudRegistro", "Solicitud de Registro de CPA"),
	REGISTRO_DESPACHO(ContadorConstantes.NUM_DOS, "registroDespacho", "Registro de Despacho"),
	REGISTRO_COLEGIO(ContadorConstantes.NUM_TRES, "registroColegio", "Registro de Colegio"),
	REGISTRO_DOCUMENTACION(ContadorConstantes.NUM_CUATRO, "registroDocumentacion", "Registro de Documentacion"),
	REGISTRO_VISTA(ContadorConstantes.NUM_CINCO, "registroVista", "Registro de Vista Previa"),
	REGISTRO_PROTESTA(ContadorConstantes.NUM_SEIS, "registroProtesta", "Registro de Protesta"),
	ACUSE_RECIBO(ContadorConstantes.NUM_SIETE, "acuseReciboSolicitud", "Acuse de Recibo de la Solicitud");

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
