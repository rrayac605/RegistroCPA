package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtB1DetOtrosIngXsalarioDO;

@Local
public interface NdtB1DetOtrosIngXsalarioDAO {
	/** Genera un registro de la entidad NdtB1DetOtrosIngXsalarioDOO.
	 *
	 * @param entity the entity
	 */
	void create(NdtB1DetOtrosIngXsalarioDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtB1DetOtrosIngXsalarioDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtB1DetOtrosIngXsalarioDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtB1DetOtrosIngXsalarioDOO do
	 */
	NdtB1DetOtrosIngXsalarioDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtB1DetOtrosIngXsalarioDO> findAll();
	
	
	void flush();

}