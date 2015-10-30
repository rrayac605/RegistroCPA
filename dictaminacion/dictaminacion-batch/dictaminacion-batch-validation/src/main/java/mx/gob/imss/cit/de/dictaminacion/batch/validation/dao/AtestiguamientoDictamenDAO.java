/**
 * 
 */
package mx.gob.imss.cit.de.dictaminacion.batch.validation.dao;

import java.util.List;

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
	public List<AtestiguamientoDictamenTO> validaAtesDictamenByPatronDictamen(Long idPatronDictamen,Long idAtestiguamiento); 
	
	/**
	 * 
	 * @param atestiguamientoDictamenTO
	 */
	public void insertaAtestiguamientoDictamen(AtestiguamientoDictamenTO atestiguamientoDictamenTO);

	/**
	 * 
	 * @param idEstatus
	 * @param idPatronDictamen
	 * @param idAtestiguamiento
	 */
	void actualizaEstatus(Long idEstatus, Long idPatronDictamen,
			Long idAtestiguamiento);
}
