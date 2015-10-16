package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA8BalanzaComprobacionDO;

@Local
public interface NdtA8BalanzaComprobacionDAO {
	/** Genera un registro de la entidad NdtA8BalanzaComprobacionDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA8BalanzaComprobacionDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA8BalanzaComprobacionDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA8BalanzaComprobacionDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA8BalanzaComprobacionDO do
	 */
	NdtA8BalanzaComprobacionDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA8BalanzaComprobacionDO> findAll();
	
	
	void flush();

}