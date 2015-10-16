package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtB2CedulaPrestacionesDO;

@Local
public interface NdtB2CedulaPrestacionesDAO {
	/** Genera un registro de la entidad NdtB2CedulaPrestacionesDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtB2CedulaPrestacionesDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtB2CedulaPrestacionesDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtB2CedulaPrestacionesDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtB2CedulaPrestacionesDO do
	 */
	NdtB2CedulaPrestacionesDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtB2CedulaPrestacionesDO> findAll();
	
	
	void flush();

}