package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA61PersonalProporcionadDO;

@Local
public interface NdtA61PersonalProporcionadDAO {
	/** Genera un registro de la entidad NdtA61PersonalProporcionadDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA61PersonalProporcionadDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA61PersonalProporcionadDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA61PersonalProporcionadDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA61PersonalProporcionadDO do
	 */
	NdtA61PersonalProporcionadDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA61PersonalProporcionadDO> findAll();
	
	
	void flush();

}