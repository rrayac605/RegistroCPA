package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdcOpcionPreguntaDO;

@Local
public interface NdcOpcionPreguntaDAO {
	/** Genera un registro de la entidad NdcOpcionPreguntaDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcOpcionPreguntaDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcOpcionPreguntaDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcOpcionPreguntaDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcOpcionPreguntaDO do
	 */
	NdcOpcionPreguntaDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcOpcionPreguntaDO> findAll();
	
	
	void flush();

}
