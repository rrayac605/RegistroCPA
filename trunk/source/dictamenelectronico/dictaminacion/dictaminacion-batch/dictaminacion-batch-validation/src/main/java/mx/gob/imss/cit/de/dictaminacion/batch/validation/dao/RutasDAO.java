package mx.gob.imss.cit.de.dictaminacion.batch.validation.dao;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.RutaTO;

/**
 * 
 * @author anhernandez
 *
 */
public interface RutasDAO {
	
	/**
	 * @return 
	 * 
	 */
	public List<RutaTO> obtieneRutas();
	
	/**
	 * 
	 * @param idBitacora
	 */
	public void borrarBitacora(Long idBitacora);
	
	/**
	 * 
	 * @param idBitacora
	 */
	public void borrarTablaAseveracion(Long idPatronDictamen,Long idAseveracion);
	
	/**
	 * 
	 * @param status
	 * @param idPatronDictamen
	 * @param idAseveracion
	 */
	public void actualizaStatus(int status,Long idPatronDictamen,Long idAseveracion);

}
