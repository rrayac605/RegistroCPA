/**
 * 
 */
package mx.gob.imss.cit.dictamen.contador.services;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoDTO;

/**
 * En esta clase se manejarán las reglas de negocio para los contadores
 * autenticados
 * 
 * @author lramirez
 *
 */
public interface ContadorAutenticadoService {

	/**
	 * M&eacute;todo que valida que existan datos de sesi&oacute;n (RFC y CURP).
	 * Implementa el m&eacute;todo de
	 * {@link org.apache.commons.lang.StringUtils#isNotBlank}
	 * 
	 * @param rfc
	 *            El RFC del usuario que inici&oacute; sesi&oacute;n
	 * @param curp
	 *            El curp del usuario que inici&oacute; sesi&oacute;n
	 * @return Una bandera que indica si ambos registros no son nulos y no son
	 *         caracteres blancos
	 */
	boolean validarSesionContador(String rfc, String curp);

	/**
	 * M&eacute;todo que valida primordialmente los datos del contador
	 * autenticado, esta validaci&oacute;n se emplea como precondici&oacute;n
	 * para acceder a las pantallas. Dependiendo de la validación sera la
	 * respuesta:<br/>
	 * 0. Validaci&oacute;n correcta<br/>
	 * 1. No hay registro de contador autorizado<br/>
	 * 2. El estatus del contador es cancelado
	 * 
	 * @param contadorAut
	 * @return El resultado de la validación
	 */
	int validarContadorAutenticado(ContadorPublicoDTO contadorAut);
}
