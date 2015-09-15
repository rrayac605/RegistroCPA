package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtB1RespuestaAtestiguamienDO;

@Local
public interface NdtB1RespuestaAtestiguamienDAO {
	/** Genera un registro de la entidad NdtB1RespuestaAtestiguamienDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtB1RespuestaAtestiguamienDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtB1RespuestaAtestiguamienDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtB1RespuestaAtestiguamienDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtB1RespuestaAtestiguamienDO do
	 */
	NdtB1RespuestaAtestiguamienDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtB1RespuestaAtestiguamienDO> findAll();
	
	
	void flush();

}