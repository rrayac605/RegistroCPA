package mx.gob.imss.cit.dictamen.contador.commons.enums;

public enum ContadorExceptionCodeEnum {

	ERROR_DESCONOCIDO(0), ERROR_PERSISTENCIA(1), ERROR_SERVICIO_BOVEDA_OBTENER_DOCUMENTO(
			2), ERROR_SERVICIO_BOVEDA_ELIMINAR_DOCUMENTO(3), ERROR_SERVICIO_BOVEDA_AGREGAR_ACTOR(
			4), ERROR_SERVICIO_CUESTIONARIO_OBTENER(5), ERROR_SERVICIO_AWS_OBTENER_POLITICA(
			6), ERROR_SERVICIO_FIRMA_ELECTRONICA(7), ERROR_SERVICIO_CONSULTA_SAT_RFC(
			8), ERROR_SERVICIO_DATOS_PATRONALES_PARAM_NULL(9), ERROR_SERVICIO_DATOS_PATRONALES_GUARDAR(
			10), ERROR_KEY_GENERATOR_GET_KEY(11), ERROR_SERVICIO_EJERCICIO_FISCAL_FIND(
			12), ERROR_SERVICIO_TIPO_DICTAMEN_FIND(13), ERROR_SERVICIO_CONSULTA_CUESTIONARIOS(
			14), ERROR_SERVICIO_CONSULTA_EXAMENES(15), ERROR_SERVICIO_CARGA_ARCHIVOS_PARAM_NULL(
			16), ERROR_SERVICIO_CARGA_ARCHIVOS_GUARDAR(17), ERROR_SERVICIO_DATOS_PATRONALES_OBTENER(
			18), ERROR_SERVICIO_DATOS_PATRONALES_ACTUALIZAR(19), ERROR_SERVICIO_CARGA_ARCHIVOS_BUSCAR(
			20), ERROR_SERVICIO_PATRON_ASOCIADO_GUARDAR(21), ERROR_SERVICIO_GUARDAR_EXAMEN_ATESTIGUAMIENTO(
			22),

	;
	/**
	 * Constructor interno
	 * 
	 * @param id
	 */
	private ContadorExceptionCodeEnum(int id) {
		this.id = id;
	}

	private int id;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

}
