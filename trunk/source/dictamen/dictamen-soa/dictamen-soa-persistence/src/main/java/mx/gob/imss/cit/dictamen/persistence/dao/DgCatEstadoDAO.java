package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.DgCatEstadoDAO;

@Local
public interface DgCatEstadoDAO {
	/** Genera un registro de la entidad AliasPersonaDO.
	 *
	 * @param entity the entity
	 */
	void create(DgCatEstadoDAO entity);

	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(DgCatEstadoDAO entity);

	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(DgCatEstadoDAO entity);

	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the AliasPersonaDO do
	 */
	DgCatEstadoDAO get(Object id);

	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<DgCatEstadoDAO> findAll();

	void flush();
}
