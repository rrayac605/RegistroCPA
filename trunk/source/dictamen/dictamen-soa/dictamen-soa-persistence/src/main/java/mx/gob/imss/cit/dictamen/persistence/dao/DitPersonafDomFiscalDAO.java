package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.DitPersonafDomFiscalDAO;

@Local
public interface DitPersonafDomFiscalDAO {
	/** Genera un registro de la entidad AliasPersonaDO.
	 *
	 * @param entity the entity
	 */
	void create(DitPersonafDomFiscalDAO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(DitPersonafDomFiscalDAO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(DitPersonafDomFiscalDAO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the AliasPersonaDO do
	 */
	DitPersonafDomFiscalDAO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<DitPersonafDomFiscalDAO> findAll();
	
	
	void flush();

}