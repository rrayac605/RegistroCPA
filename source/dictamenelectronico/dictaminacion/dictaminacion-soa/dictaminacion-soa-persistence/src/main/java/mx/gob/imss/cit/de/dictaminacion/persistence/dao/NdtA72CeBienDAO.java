package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA72CeBienDO;

@Local
public interface NdtA72CeBienDAO {
	/** Genera un registro de la entidad NdtA72CeBienDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA72CeBienDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA72CeBienDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA72CeBienDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA72CeBienDO do
	 */
	NdtA72CeBienDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA72CeBienDO> findAll();
	
	
	void flush();

}