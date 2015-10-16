package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtB1DetPagosOtrosEmpleadDO;

@Local
public interface NdtB1DetPagosOtrosEmpleadDAO {
	/** Genera un registro de la entidad NdtB1DetPagosOtrosEmpleadDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtB1DetPagosOtrosEmpleadDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtB1DetPagosOtrosEmpleadDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtB1DetPagosOtrosEmpleadDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtB1DetPagosOtrosEmpleadDO do
	 */
	NdtB1DetPagosOtrosEmpleadDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtB1DetPagosOtrosEmpleadDO> findAll();
	
	
	void flush();

}