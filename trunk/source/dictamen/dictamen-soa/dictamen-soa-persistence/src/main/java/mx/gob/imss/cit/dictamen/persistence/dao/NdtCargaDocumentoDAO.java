package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtCargaDocumentoDO;

@Local
public interface NdtCargaDocumentoDAO {
	/** Genera un registro de la entidad NdtCargaDocumentoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtCargaDocumentoDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtCargaDocumentoDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtCargaDocumentoDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtCargaDocumentoDO
	 */
	NdtCargaDocumentoDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtCargaDocumentoDO> findAll();
	
	
	void flush();

}