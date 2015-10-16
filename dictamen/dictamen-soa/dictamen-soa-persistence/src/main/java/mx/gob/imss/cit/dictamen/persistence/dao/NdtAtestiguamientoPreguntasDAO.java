package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoPreguntasDO;

@Local
public interface NdtAtestiguamientoPreguntasDAO {
	/** Genera un registro de la entidad NdtAtestiguamientoPreguntasDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtAtestiguamientoPreguntasDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtAtestiguamientoPreguntasDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtAtestiguamientoPreguntasDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtAtestiguamientoPreguntasDO do
	 */
	NdtAtestiguamientoPreguntasDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtAtestiguamientoPreguntasDO> findAll();
	
	
	void flush();

}