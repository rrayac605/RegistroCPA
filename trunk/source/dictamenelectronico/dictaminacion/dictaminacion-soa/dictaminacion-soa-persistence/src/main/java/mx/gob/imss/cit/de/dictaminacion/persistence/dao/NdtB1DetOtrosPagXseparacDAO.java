package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtB1DetOtrosPagXseparacDO;

@Local
public interface NdtB1DetOtrosPagXseparacDAO {
	/** Genera un registro de la entidad NdtB1DetOtrosPagXseparacDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtB1DetOtrosPagXseparacDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtB1DetOtrosPagXseparacDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtB1DetOtrosPagXseparacDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtB1DetOtrosPagXseparacDO do
	 */
	NdtB1DetOtrosPagXseparacDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtB1DetOtrosPagXseparacDO> findAll();
	
	
	void flush();

}