package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcTipoOficioDO;

@Local
public interface NdcTipoOficioDAO {
	/** Genera un registro de la entidad NdcTipoOficioDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcTipoOficioDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcTipoOficioDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcTipoOficioDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcTipoOficioDO do
	 */
	NdcTipoOficioDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcTipoOficioDO> findAll();
	
	
	void flush();

}