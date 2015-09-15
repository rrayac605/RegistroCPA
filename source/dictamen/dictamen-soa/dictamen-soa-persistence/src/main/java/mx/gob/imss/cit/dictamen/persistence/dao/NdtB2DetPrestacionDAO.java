package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtB2DetPrestacionDO;

@Local
public interface NdtB2DetPrestacionDAO {
	/** Genera un registro de la entidad NdtB2DetPrestacionDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtB2DetPrestacionDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtB2DetPrestacionDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtB2DetPrestacionDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtB2DetPrestacionDO do
	 */
	NdtB2DetPrestacionDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtB2DetPrestacionDO> findAll();
	
	
	void flush();

}