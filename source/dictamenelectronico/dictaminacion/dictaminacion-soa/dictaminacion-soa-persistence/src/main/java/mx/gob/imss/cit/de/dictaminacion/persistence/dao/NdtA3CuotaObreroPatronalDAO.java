package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA3CuotaObreroPatronalDO;

@Local
public interface NdtA3CuotaObreroPatronalDAO {
	/** Genera un registro de la entidad NdtA3CuotaObreroPatronalDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA3CuotaObreroPatronalDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA3CuotaObreroPatronalDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA3CuotaObreroPatronalDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA3CuotaObreroPatronalDO do
	 */
	NdtA3CuotaObreroPatronalDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA3CuotaObreroPatronalDO> findAll();
	
	
	void flush();

}