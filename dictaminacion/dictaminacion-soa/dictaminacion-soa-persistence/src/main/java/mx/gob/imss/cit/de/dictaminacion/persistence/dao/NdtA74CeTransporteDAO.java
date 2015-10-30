package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA74CeTransporteDO;

@Local
public interface NdtA74CeTransporteDAO {
	/** Genera un registro de la entidad NdtA74CeTransporteDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA74CeTransporteDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA74CeTransporteDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA74CeTransporteDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA74CeTransporteDO do
	 */
	NdtA74CeTransporteDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA74CeTransporteDO> findAll();
	
	
	void flush();

}