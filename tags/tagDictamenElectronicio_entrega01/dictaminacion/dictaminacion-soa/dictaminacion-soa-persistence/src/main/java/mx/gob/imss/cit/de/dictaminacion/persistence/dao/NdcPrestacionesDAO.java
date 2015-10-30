package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdcPrestacionesDO;

@Local
public interface NdcPrestacionesDAO {
	/** Genera un registro de la entidad NdcPrestacionesDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcPrestacionesDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcPrestacionesDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcPrestacionesDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcPrestacionesDO do
	 */
	NdcPrestacionesDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcPrestacionesDO> findAll();
	
	
	void flush();

}