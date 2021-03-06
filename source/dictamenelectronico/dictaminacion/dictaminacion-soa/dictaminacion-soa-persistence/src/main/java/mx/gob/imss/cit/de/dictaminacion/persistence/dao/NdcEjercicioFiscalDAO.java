package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdcEjercicioFiscalDO;

@Local
public interface NdcEjercicioFiscalDAO {
	/** Genera un registro de la entidad NdcEjercicioFiscalDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcEjercicioFiscalDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcEjercicioFiscalDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcEjercicioFiscalDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcEjercicioFiscalDO do
	 */
	NdcEjercicioFiscalDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcEjercicioFiscalDO> findAll();
	
	
	void flush();

}