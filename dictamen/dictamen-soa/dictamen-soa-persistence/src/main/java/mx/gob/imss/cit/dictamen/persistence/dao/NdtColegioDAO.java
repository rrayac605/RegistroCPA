package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtColegioDO;

@Local
public interface NdtColegioDAO {
	/** Genera un registro de la entidad NdtColegioDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtColegioDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtColegioDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtColegioDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtColegioDO do
	 */
	NdtColegioDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtColegioDO> findAll();
	
	
	void flush();

}