package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.DgCatTipoDomDAO;

@Local
public interface DgCatTipoDomDAO {
	/** Genera un registro de la entidad AliasPersonaDO.
	 *
	 * @param entity the entity
	 */
	void create(DgCatTipoDomDAO entity);

	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(DgCatTipoDomDAO entity);

	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(DgCatTipoDomDAO entity);

	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the AliasPersonaDO do
	 */
	DgCatTipoDomDAO get(Object id);

	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<DgCatTipoDomDAO> findAll();

	void flush();
}
