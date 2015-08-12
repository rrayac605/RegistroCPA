package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.DicDocumentoDAO;

@Local
public interface DicDocumentoDAO {
	/** Genera un registro de la entidad AliasPersonaDO.
	 *
	 * @param entity the entity
	 */
	void create(DicDocumentoDAO entity);

	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(DicDocumentoDAO entity);

	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(DicDocumentoDAO entity);

	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the AliasPersonaDO do
	 */
	DicDocumentoDAO get(Object id);

	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<DicDocumentoDAO> findAll();

	void flush();
}
