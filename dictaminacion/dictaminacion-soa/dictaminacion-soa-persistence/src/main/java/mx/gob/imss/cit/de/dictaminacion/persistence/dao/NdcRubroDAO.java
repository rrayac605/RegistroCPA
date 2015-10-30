package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdcRubroDO;

@Local
public interface NdcRubroDAO {
	/** Genera un registro de la entidad NdcRubroDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcRubroDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcRubroDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcRubroDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcRubroDO do
	 */
	NdcRubroDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcRubroDO> findAll();
	
	
	void flush();

}