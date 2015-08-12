package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.DgCatAdministracionDAO;

@Local
public interface DgCatAdministracionDAO {
	/** Genera un registro de la entidad AliasPersonaDO.
	 *
	 * @param entity the entity
	 */
	void create(DgCatAdministracionDAO entity);

	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(DgCatAdministracionDAO entity);

	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(DgCatAdministracionDAO entity);

	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the AliasPersonaDO do
	 */
	DgCatAdministracionDAO get(Object id);

	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<DgCatAdministracionDAO> findAll();

	void flush();
}
