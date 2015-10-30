package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdcTipoPagoDO;

@Local
public interface NdcTipoPagoDAO {
	/** Genera un registro de la entidad NdcTipoPagoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcTipoPagoDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcTipoPagoDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcTipoPagoDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcTipoPagoDO do
	 */
	NdcTipoPagoDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcTipoPagoDO> findAll();
	
	
	void flush();

}