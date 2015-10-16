package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcFormaPagoDO;

@Local
public interface NdcFormaPagoDAO {
	/** Genera un registro de la entidad NdcFormaPagoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcFormaPagoDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcFormaPagoDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcFormaPagoDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcFormaPagoDO do
	 */
	NdcFormaPagoDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcFormaPagoDO> findAll();
	
	
	void flush();

}