package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA1DetOtrosPagXseparacDO;

@Local
public interface NdtA1DetOtrosPagXseparacDAO {
	/** Genera un registro de la entidad NdtA1DetOtrosPagXseparacDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA1DetOtrosPagXseparacDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA1DetOtrosPagXseparacDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA1DetOtrosPagXseparacDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA1DetOtrosPagXseparacDO do
	 */
	NdtA1DetOtrosPagXseparacDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA1DetOtrosPagXseparacDO> findAll();
	
	
	void flush();

}