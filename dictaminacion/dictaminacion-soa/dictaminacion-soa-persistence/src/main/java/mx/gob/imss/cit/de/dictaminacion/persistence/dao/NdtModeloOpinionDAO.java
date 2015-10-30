package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtModeloOpinionDO;

@Local
public interface NdtModeloOpinionDAO {
	/** Genera un registro de la entidad NdtModeloOpinionDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtModeloOpinionDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtModeloOpinionDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtModeloOpinionDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtModeloOpinionDO do
	 */
	NdtModeloOpinionDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtModeloOpinionDO> findAll();
	
	
	void flush();

}