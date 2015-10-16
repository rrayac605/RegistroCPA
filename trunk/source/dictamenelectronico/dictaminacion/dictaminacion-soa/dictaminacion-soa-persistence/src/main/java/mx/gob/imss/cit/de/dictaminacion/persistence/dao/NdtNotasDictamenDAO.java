package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtNotasDictamenDO;

@Local
public interface NdtNotasDictamenDAO {
	/** Genera un registro de la entidad NdtNotasDictamenDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtNotasDictamenDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtNotasDictamenDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtNotasDictamenDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtNotasDictamenDO do
	 */
	NdtNotasDictamenDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtNotasDictamenDO> findAll();
	
	
	void flush();

}