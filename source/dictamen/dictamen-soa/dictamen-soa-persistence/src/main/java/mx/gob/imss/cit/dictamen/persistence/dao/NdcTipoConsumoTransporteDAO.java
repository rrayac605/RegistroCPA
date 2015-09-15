package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcTipoConsumoTransporteDO;

@Local
public interface NdcTipoConsumoTransporteDAO {
	/** Genera un registro de la entidad NdcTipoConsumoTransporteDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcTipoConsumoTransporteDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcTipoConsumoTransporteDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcTipoConsumoTransporteDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcTipoConsumoTransporteDO do
	 */
	NdcTipoConsumoTransporteDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcTipoConsumoTransporteDO> findAll();
	
	
	void flush();

}