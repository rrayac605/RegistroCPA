package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcTipoDistribucionDO;

@Local
public interface NdcTipoDistribucionDAO {
	/** Genera un registro de la entidad NdcTipoDistribucionDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcTipoDistribucionDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcTipoDistribucionDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcTipoDistribucionDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcTipoDistribucionDO do
	 */
	NdcTipoDistribucionDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcTipoDistribucionDO> findAll();
	
	
	void flush();

}