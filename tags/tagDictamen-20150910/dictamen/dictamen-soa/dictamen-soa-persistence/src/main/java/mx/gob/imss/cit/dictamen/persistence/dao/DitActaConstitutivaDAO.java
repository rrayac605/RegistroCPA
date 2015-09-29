package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.DitActaConstitutivaDO;

@Local
public interface DitActaConstitutivaDAO {
	/** Genera un registro de la entidad AliasPersonaDO.
	 *
	 * @param entity the entity
	 */
	void create(DitActaConstitutivaDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(DitActaConstitutivaDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(DitActaConstitutivaDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the AliasPersonaDO do
	 */
	DitActaConstitutivaDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<DitActaConstitutivaDO> findAll();
	
	
	void flush();

}