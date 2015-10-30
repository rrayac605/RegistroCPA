package mx.gob.imss.cit.dictamen.contador.integration.api;

import java.util.List;

import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ColegioDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.ContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.CatalogoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DespachoDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.exception.DictamenContadorNegocioException;

/**
 * 
 * @author ariverav
 *
 */
public interface SolicitudRegistroIntegrator {
	/**
	 * Método que consulta los datos de un contador
	 * 
	 * @param curp
	 * @param rfc
	 * @return
	 * @throws DictamenContadorNegocioException
	 */
	ContadorPublicoAutDTO obtenerContadorPublicoAutDTO(String curp, String rfc)
			throws DictamenContadorNegocioException;

	/**
	 * Método que guarda los datos del contador.
	 * 
	 * @param contador
	 * @return
	 */
	boolean guardarDatosContador(ContadorPublicoAutDTO contador);

	/**
	 * Método que obtiene el catalogo de de cargos.
	 * 
	 * @return
	 */
	List<CatalogoDTO> obtenerCatalogoCargos();

	/**
	 * Método que consulta los datos de un despacho buscado por rfc
	 * 
	 * @param rfc
	 * @return
	 * @throws DictamenContadorNegocioException
	 */
	DespachoDTO obtenerDespachoDTO(String rfc)
			throws DictamenContadorNegocioException;

	/**
	 * Método que consulta los datos de un colegio buscado por rfc
	 * 
	 * @param rfc
	 * @return
	 * @throws DictamenContadorNegocioException
	 */
	ColegioDTO obtenerColegioDTO(String rfc)
			throws DictamenContadorNegocioException;

}
