package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtCpaTramiteDO;

@Local
public interface NdtCpaTramiteDAO {
	/** Genera un registro de la entidad NdtCpaTramiteDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtCpaTramiteDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtCpaTramiteDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtCpaTramiteDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtCpaTramiteDO do
	 */
	NdtCpaTramiteDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtCpaTramiteDO> findAll();
	
	
	void flush();

}