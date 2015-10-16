package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtB1CedulaRemuneracionesDO;

@Local
public interface NdtB1CedulaRemuneracionesDAO {
	/** Genera un registro de la entidad NdtB1CedulaRemuneracionesDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtB1CedulaRemuneracionesDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtB1CedulaRemuneracionesDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtB1CedulaRemuneracionesDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtB1CedulaRemuneracionesDO do
	 */
	NdtB1CedulaRemuneracionesDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtB1CedulaRemuneracionesDO> findAll();
	
	
	void flush();

}