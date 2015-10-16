package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA75CePersonalDO;

@Local
public interface NdtA75CePersonalDAO {
	/** Genera un registro de la entidad NdtA75CePersonalDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA75CePersonalDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA75CePersonalDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA75CePersonalDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA75CePersonalDO do
	 */
	NdtA75CePersonalDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA75CePersonalDO> findAll();
	
	
	void flush();

}
