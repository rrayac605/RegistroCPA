package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdcAseveracionesDO;

@Local
public interface NdcAseveracionesDAO {
	/** Genera un registro de la entidad NdcAseveracionesDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcAseveracionesDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcAseveracionesDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcAseveracionesDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcAseveracionesDO do
	 */
	NdcAseveracionesDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcAseveracionesDO> findAll();
	
	
	void flush();

}