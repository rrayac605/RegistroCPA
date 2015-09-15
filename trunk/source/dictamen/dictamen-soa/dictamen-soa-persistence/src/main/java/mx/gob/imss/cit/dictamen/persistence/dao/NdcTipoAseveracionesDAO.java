package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcTipoAseveracionesDO;

@Local
public interface NdcTipoAseveracionesDAO {
	/** Genera un registro de la entidad NdcTipoAseveracionesDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcTipoAseveracionesDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcTipoAseveracionesDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcTipoAseveracionesDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcTipoAseveracionesDO do
	 */
	NdcTipoAseveracionesDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcTipoAseveracionesDO> findAll();
	
	
	void flush();

}