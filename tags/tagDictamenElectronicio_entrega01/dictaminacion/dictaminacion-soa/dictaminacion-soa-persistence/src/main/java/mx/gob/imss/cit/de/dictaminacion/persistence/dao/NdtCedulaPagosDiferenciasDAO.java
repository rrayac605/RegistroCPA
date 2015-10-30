package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtCedulaPagosDiferenciasDO;

@Local
public interface NdtCedulaPagosDiferenciasDAO {
	/** Genera un registro de la entidad NdtCedulaPagosDiferenciasDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtCedulaPagosDiferenciasDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtCedulaPagosDiferenciasDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtCedulaPagosDiferenciasDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtCedulaPagosDiferenciasDO do
	 */
	NdtCedulaPagosDiferenciasDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtCedulaPagosDiferenciasDO> findAll();
	
	
	void flush();

}