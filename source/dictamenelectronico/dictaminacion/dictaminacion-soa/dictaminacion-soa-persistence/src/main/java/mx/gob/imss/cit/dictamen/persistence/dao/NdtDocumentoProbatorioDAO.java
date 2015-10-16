package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtDocumentoProbatorioDO;

@Local
public interface NdtDocumentoProbatorioDAO {
	/** Genera un registro de la entidad NdtDocumentoProbatorioDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtDocumentoProbatorioDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtDocumentoProbatorioDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtDocumentoProbatorioDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtDocumentoProbatorioDO do
	 */
	NdtDocumentoProbatorioDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtDocumentoProbatorioDO> findAll();
	
	
	void flush();

}