package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.DitDatosCertificadoFielDAO;

@Local
public interface DitDatosCertificadoFielDAO {
	/** Genera un registro de la entidad AliasPersonaDO.
	 *
	 * @param entity the entity
	 */
	void create(DitDatosCertificadoFielDAO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(DitDatosCertificadoFielDAO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(DitDatosCertificadoFielDAO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the AliasPersonaDO do
	 */
	DitDatosCertificadoFielDAO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<DitDatosCertificadoFielDAO> findAll();
	
	
	void flush();

}