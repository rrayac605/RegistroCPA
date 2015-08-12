package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.DicTipoDocumentoProbatorioDO;

@Local
public interface DicTipoDocumentoProbatorioDAO {
	/** Genera un registro de la entidad AliasPersonaDO.
	 *
	 * @param entity the entity
	 */
	void create(DicTipoDocumentoProbatorioDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(DicTipoDocumentoProbatorioDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(DicTipoDocumentoProbatorioDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the AliasPersonaDO do
	 */
	DicTipoDocumentoProbatorioDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<DicTipoDocumentoProbatorioDO> findAll();
	
	
	void flush();

}