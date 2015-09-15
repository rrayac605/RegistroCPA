package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtOpcionPreguntaDO;

@Local
public interface NdtOpcionPreguntaDAO {
	/** Genera un registro de la entidad NdtOpcionPreguntaDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtOpcionPreguntaDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtOpcionPreguntaDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtOpcionPreguntaDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtOpcionPreguntaDO do
	 */
	NdtOpcionPreguntaDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtOpcionPreguntaDO> findAll();
	
	
	void flush();

}