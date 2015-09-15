package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA76CeActCompDO;

@Local
public interface NdtA76CeActCompDAO {
	/** Genera un registro de la entidad NdtA76CeActCompDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA76CeActCompDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA76CeActCompDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA76CeActCompDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA76CeActCompDO do
	 */
	NdtA76CeActCompDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA76CeActCompDO> findAll();
	
	
	void flush();

}