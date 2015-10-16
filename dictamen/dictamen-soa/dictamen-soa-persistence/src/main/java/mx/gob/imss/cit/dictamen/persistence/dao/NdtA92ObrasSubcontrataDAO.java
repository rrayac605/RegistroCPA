package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA92ObrasSubcontrataDO;

@Local
public interface NdtA92ObrasSubcontrataDAO {
	/** Genera un registro de la entidad NdtA92ObrasSubcontrataDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA92ObrasSubcontrataDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA92ObrasSubcontrataDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA92ObrasSubcontrataDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA92ObrasSubcontrataDO do
	 */
	NdtA92ObrasSubcontrataDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA92ObrasSubcontrataDO> findAll();
	
	
	void flush();

}