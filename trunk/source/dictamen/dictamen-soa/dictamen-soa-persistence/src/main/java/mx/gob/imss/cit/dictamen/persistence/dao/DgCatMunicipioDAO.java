package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.DgCatMunicipioDAO;

@Local
public interface DgCatMunicipioDAO {
	/** Genera un registro de la entidad AliasPersonaDO.
	 *
	 * @param entity the entity
	 */
	void create(DgCatMunicipioDAO entity);

	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(DgCatMunicipioDAO entity);

	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(DgCatMunicipioDAO entity);

	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the AliasPersonaDO do
	 */
	DgCatMunicipioDAO get(Object id);

	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<DgCatMunicipioDAO> findAll();

	void flush();
}
