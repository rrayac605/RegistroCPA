package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcTipoModeloOpinionDO;

@Local
public interface NdcTipoModeloOpinionDAO {
	/** Genera un registro de la entidad NdcTipoModeloOpinionDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcTipoModeloOpinionDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcTipoModeloOpinionDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcTipoModeloOpinionDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcTipoModeloOpinionDO do
	 */
	NdcTipoModeloOpinionDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcTipoModeloOpinionDO> findAll();
	
	
	void flush();

}