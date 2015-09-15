package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcStatusCargaAseveracionesDO;

@Local
public interface NdcStatusCargaAseveracionesDAO {
	/** Genera un registro de la entidad NdcStatusCargaAseveracionesDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcStatusCargaAseveracionesDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcStatusCargaAseveracionesDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcStatusCargaAseveracionesDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcStatusCargaAseveracionesDO do
	 */
	NdcStatusCargaAseveracionesDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcStatusCargaAseveracionesDO> findAll();
	
	
	void flush();

}