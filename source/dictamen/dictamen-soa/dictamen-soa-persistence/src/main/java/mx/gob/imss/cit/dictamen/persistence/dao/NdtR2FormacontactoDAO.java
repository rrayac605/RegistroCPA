package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtR2FormacontactoDO;

@Local
public interface NdtR2FormacontactoDAO {
	/** Genera un registro de la entidad NdtR2FormacontactoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtR2FormacontactoDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtR2FormacontactoDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtR2FormacontactoDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtR2FormacontactoDO do
	 */
	NdtR2FormacontactoDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtR2FormacontactoDO> findAll();
	
	
	void flush();

}