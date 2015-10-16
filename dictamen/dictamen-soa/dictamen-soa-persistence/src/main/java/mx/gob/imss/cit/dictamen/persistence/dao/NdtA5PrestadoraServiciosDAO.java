package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA5PrestadoraServiciosDO;

@Local
public interface NdtA5PrestadoraServiciosDAO {
	/** Genera un registro de la entidad NdtA5PrestadoraServiciosDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA5PrestadoraServiciosDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA5PrestadoraServiciosDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA5PrestadoraServiciosDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA5PrestadoraServiciosDO do
	 */
	NdtA5PrestadoraServiciosDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA5PrestadoraServiciosDO> findAll();
	
	
	void flush();

}