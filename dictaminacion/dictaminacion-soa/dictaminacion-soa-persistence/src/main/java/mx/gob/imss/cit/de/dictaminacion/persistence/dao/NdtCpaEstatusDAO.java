package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtCpaEstatusDO;

@Local
public interface NdtCpaEstatusDAO {
	/** Genera un registro de la entidad NdtCpaEstatusDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtCpaEstatusDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtCpaEstatusDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtCpaEstatusDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtCpaEstatusDO do
	 */
	NdtCpaEstatusDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtCpaEstatusDO> findAll();
	
	
	void flush();

}