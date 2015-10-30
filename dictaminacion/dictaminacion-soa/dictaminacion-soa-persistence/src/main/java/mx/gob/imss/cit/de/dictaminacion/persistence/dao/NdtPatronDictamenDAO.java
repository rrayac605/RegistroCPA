package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronDictamenDO;

@Local
public interface NdtPatronDictamenDAO {
	/** Genera un registro de la entidad AliasPersonaDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtPatronDictamenDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtPatronDictamenDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtPatronDictamenDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the AliasPersonaDO do
	 */
	NdtPatronDictamenDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtPatronDictamenDO> findAll();
	
	/**
	 * Metodo de busqueda .
	 *
	 * @return the list
	 */
	List<NdtPatronDictamenDO> findByRfcPatronAndIdContador(String rfcPatron,Long idContador);
	
	
	void flush();

}