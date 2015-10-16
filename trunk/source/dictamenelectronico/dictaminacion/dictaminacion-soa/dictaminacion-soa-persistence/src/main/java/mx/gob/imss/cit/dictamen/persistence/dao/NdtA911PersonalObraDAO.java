package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA911PersonalObraDO;

@Local
public interface NdtA911PersonalObraDAO {
	/** Genera un registro de la entidad NdtA911PersonalObraDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA911PersonalObraDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA911PersonalObraDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA911PersonalObraDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA911PersonalObraDO do
	 */
	NdtA911PersonalObraDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA911PersonalObraDO> findAll();
	
	
	void flush();

}