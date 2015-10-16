package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.dictamen.model.NdtRubroAtestiguamientoDictDO;

public interface NdtRubroAtestiguamientoDictDAO {
	/** Genera un registro de la entidad NdcAtestiguamientoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtRubroAtestiguamientoDictDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtRubroAtestiguamientoDictDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtRubroAtestiguamientoDictDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcAtestiguamientoDO do
	 */
	NdtRubroAtestiguamientoDictDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtRubroAtestiguamientoDictDO> findAll();
	
	void flush();
}
