package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA1PercepTrabajadorDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronDictamenDO;

@Local
public interface NdtA1PercepTrabajadorDAO {
	/** Genera un registro de la entidad NdtA1PercepTrabajadorDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA1PercepTrabajadorDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA1PercepTrabajadorDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA1PercepTrabajadorDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA1PercepTrabajadorDO do
	 */
	NdtA1PercepTrabajadorDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA1PercepTrabajadorDO> findAll();
	
	
	void flush();
	
	/**
	 * 
	 * @param cveIdPatronDictamen
	 * @return
	 */
	List<NdtA1PercepTrabajadorDO> findByCveIdPatronDictamen(
			NdtPatronDictamenDO cveIdPatronDictamen);

}