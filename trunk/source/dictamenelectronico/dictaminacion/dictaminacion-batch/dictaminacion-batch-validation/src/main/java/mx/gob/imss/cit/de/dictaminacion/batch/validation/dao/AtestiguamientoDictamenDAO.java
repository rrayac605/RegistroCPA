/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.batch.validation.dao;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.AtestiguamientoDictamenTO;

/**
 * @author anhernandez
 *
 */
public interface AtestiguamientoDictamenDAO {

	/**
	 * 
	 * @param idPatronDictamen
	 * @param idAtestiguamiento
	 * @return
	 */
	public AtestiguamientoDictamenTO validaAtesDictamenByPatronDictamen(Long idPatronDictamen,Long idAtestiguamiento); 
	
	/**
	 * 
	 * @param idEstatus
	 */
	public void actualizaEstatus(Long idEstatus);
	
	/**
	 * 
	 * @param atestiguamientoDictamenTO
	 */
	public void insertaAtestiguamientoDictamen(AtestiguamientoDictamenTO atestiguamientoDictamenTO);
}
