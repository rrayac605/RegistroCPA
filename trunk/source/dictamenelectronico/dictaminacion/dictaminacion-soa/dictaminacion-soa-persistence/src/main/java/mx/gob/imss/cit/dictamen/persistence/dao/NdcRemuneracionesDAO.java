package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcRemuneracionesDO;

@Local
public interface NdcRemuneracionesDAO {
	/** Genera un registro de la entidad NdcRemuneracionesDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcRemuneracionesDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcRemuneracionesDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcRemuneracionesDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcRemuneracionesDO do
	 */
	NdcRemuneracionesDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcRemuneracionesDO> findAll();
	
	
	void flush();

}