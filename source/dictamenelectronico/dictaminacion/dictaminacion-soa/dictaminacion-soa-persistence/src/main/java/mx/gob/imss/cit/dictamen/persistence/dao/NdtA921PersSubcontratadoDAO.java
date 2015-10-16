package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA921PersSubcontratadoDO;

@Local
public interface NdtA921PersSubcontratadoDAO {
	/** Genera un registro de la entidad NdtA921PersSubcontratadoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA921PersSubcontratadoDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA921PersSubcontratadoDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA921PersSubcontratadoDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA921PersSubcontratadoDO do
	 */
	NdtA921PersSubcontratadoDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA921PersSubcontratadoDO> findAll();
	
	
	void flush();

}