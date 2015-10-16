package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcPreguntaDO;

@Local
public interface NdcPreguntaDAO {
	/** Genera un registro de la entidad NdcPreguntaDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcPreguntaDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcPreguntaDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcPreguntaDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcPreguntaDO do
	 */
	NdcPreguntaDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcPreguntaDO> findAll();
	
	
	void flush();

}