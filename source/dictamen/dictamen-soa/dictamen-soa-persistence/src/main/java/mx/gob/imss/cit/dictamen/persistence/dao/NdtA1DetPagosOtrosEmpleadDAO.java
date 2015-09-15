package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA1DetPagosOtrosEmpleadDO;

@Local
public interface NdtA1DetPagosOtrosEmpleadDAO {
	/** Genera un registro de la entidad NdtA1DetPagosOtrosEmpleadDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA1DetPagosOtrosEmpleadDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA1DetPagosOtrosEmpleadDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA1DetPagosOtrosEmpleadDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA1DetPagosOtrosEmpleadDO do
	 */
	NdtA1DetPagosOtrosEmpleadDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA1DetPagosOtrosEmpleadDO> findAll();
	
	
	void flush();

}