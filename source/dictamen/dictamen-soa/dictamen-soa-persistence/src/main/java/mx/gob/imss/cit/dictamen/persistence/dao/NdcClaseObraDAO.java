package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcClaseObraDO;

@Local
public interface NdcClaseObraDAO {
	/** Genera un registro de la entidad NdcClaseObraDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcClaseObraDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcClaseObraDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcClaseObraDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcClaseObraDO do
	 */
	NdcClaseObraDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcClaseObraDO> findAll();
	
	
	void flush();

}