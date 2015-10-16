package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtR3ColegioDO;

@Local
public interface NdtR3ColegioDAO {
	/** Genera un registro de la entidad NdtR3ColegioDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtR3ColegioDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtR3ColegioDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtR3ColegioDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtR3ColegioDO do
	 */
	NdtR3ColegioDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtR3ColegioDO> findAll();
	
	
	void flush();

}