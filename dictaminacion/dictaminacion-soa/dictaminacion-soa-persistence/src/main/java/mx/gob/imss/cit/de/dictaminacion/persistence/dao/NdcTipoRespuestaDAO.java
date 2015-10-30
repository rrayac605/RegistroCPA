package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdcTipoRespuestaDO;

@Local
public interface NdcTipoRespuestaDAO {
	/** Genera un registro de la entidad NdcTipoRespuestaDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcTipoRespuestaDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcTipoRespuestaDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcTipoRespuestaDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcTipoRespuestaDO do
	 */
	NdcTipoRespuestaDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcTipoRespuestaDO> findAll();
	
	
	void flush();

}