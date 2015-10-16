package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA71CeProcesoDO;

@Local
public interface NdtA71CeProcesoDAO {
	/** Genera un registro de la entidad NdtA71CeProcesoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA71CeProcesoDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA71CeProcesoDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA71CeProcesoDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA71CeProcesoDO do
	 */
	NdtA71CeProcesoDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA71CeProcesoDO> findAll();
	
	
	void flush();

}