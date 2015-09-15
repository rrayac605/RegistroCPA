package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA1DetOtrosIngXsalarioDO;

@Local
public interface NdtA1DetOtrosIngXsalarioDAO {
	/** Genera un registro de la entidad NdtA1DetOtrosIngXsalarioDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA1DetOtrosIngXsalarioDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA1DetOtrosIngXsalarioDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA1DetOtrosIngXsalarioDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA1DetOtrosIngXsalarioDO do
	 */
	NdtA1DetOtrosIngXsalarioDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA1DetOtrosIngXsalarioDO> findAll();
	
	
	void flush();

}