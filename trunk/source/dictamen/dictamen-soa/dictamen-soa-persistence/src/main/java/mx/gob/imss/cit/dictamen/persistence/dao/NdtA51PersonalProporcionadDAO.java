package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA51PersonalProporcionadDO;

@Local
public interface NdtA51PersonalProporcionadDAO {
	/** Genera un registro de la entidad NdtA51PersonalProporcionadDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA51PersonalProporcionadDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA51PersonalProporcionadDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA51PersonalProporcionadDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA51PersonalProporcionadDO do
	 */
	NdtA51PersonalProporcionadDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA51PersonalProporcionadDO> findAll();
	
	
	void flush();

}