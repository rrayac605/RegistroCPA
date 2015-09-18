package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO;

@Local
public interface NdcAtestiguamientoDAO {
	/** Genera un registro de la entidad NdcAtestiguamientoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcAtestiguamientoDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcAtestiguamientoDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcAtestiguamientoDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcAtestiguamientoDO do
	 */
	NdcAtestiguamientoDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcAtestiguamientoDO> findAll();
	
	
	void flush();

}