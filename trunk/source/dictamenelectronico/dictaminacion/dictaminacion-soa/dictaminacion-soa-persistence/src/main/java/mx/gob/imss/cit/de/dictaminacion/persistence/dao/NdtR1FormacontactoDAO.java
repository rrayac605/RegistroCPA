package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtR1FormacontactoDO;

@Local
public interface NdtR1FormacontactoDAO {
	/** Genera un registro de la entidad NdtR1FormacontactoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtR1FormacontactoDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtR1FormacontactoDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtR1FormacontactoDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtR1FormacontactoDO do
	 */
	NdtR1FormacontactoDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtR1FormacontactoDO> findAll();
	
	
	void flush();

}