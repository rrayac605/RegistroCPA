package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdcTipoDictamenDO;

@Local
public interface NdcTipoDictamenDAO {
	/** Genera un registro de la entidad NdcTipoDictamenDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcTipoDictamenDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcTipoDictamenDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcTipoDictamenDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcTipoDictamenDO do
	 */
	NdcTipoDictamenDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcTipoDictamenDO> findAll();
	
	
	void flush();

}