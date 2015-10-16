package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA6SubcontratacionSpDO;

@Local
public interface NdtA6SubcontratacionSpDAO {
	/** Genera un registro de la entidad NdtA6SubcontratacionSpDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA6SubcontratacionSpDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA6SubcontratacionSpDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA6SubcontratacionSpDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA6SubcontratacionSpDO do
	 */
	NdtA6SubcontratacionSpDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA6SubcontratacionSpDO> findAll();
	
	
	void flush();

}