package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtCargaAseveracionesDO;

@Local
public interface NdtCargaAseveracionesDAO {
	/** Genera un registro de la entidad NdtCargaAseveracionesDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtCargaAseveracionesDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtCargaAseveracionesDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtCargaAseveracionesDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtCargaAseveracionesDO do
	 */
	NdtCargaAseveracionesDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtCargaAseveracionesDO> findAll();
	
	
	void flush();

}