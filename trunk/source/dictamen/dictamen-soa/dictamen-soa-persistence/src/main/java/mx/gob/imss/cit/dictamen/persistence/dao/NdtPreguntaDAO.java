package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtPreguntaDO;

@Local
public interface NdtPreguntaDAO {
	/** Genera un registro de la entidad NdtPreguntaDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtPreguntaDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtPreguntaDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtPreguntaDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtPreguntaDO do
	 */
	NdtPreguntaDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtPreguntaDO> findAll();
	
	
	void flush();

}