package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronDictamenCpaDO;

@Local
public interface NdtPatronDictamenCpaDAO {
	/** Genera un registro de la entidad NdtPatronDictamenCpaDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtPatronDictamenCpaDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtPatronDictamenCpaDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtPatronDictamenCpaDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtPatronDictamenCpaDO do
	 */
	NdtPatronDictamenCpaDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtPatronDictamenCpaDO> findAll();
	
	
	void flush();

}