package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtDespachosDO;

@Local
public interface NdtDespachosDAO {
	/** Genera un registro de la entidad NdtDespachosDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtDespachosDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtDespachosDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtDespachosDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtDespachosDO do
	 */
	NdtDespachosDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtDespachosDO> findAll();
	
	
	void flush();

}