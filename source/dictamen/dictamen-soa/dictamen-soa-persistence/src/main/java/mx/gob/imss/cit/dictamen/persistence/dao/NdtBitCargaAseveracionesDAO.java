package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtBitCargaAseveracionesDO;

@Local
public interface NdtBitCargaAseveracionesDAO {
	/** Genera un registro de la entidad NdtBitCargaAseveracionesDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtBitCargaAseveracionesDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtBitCargaAseveracionesDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtBitCargaAseveracionesDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtBitCargaAseveracionesDO do
	 */
	NdtBitCargaAseveracionesDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtBitCargaAseveracionesDO> findAll();
	
	
	void flush();

}