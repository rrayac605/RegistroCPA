package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA91ObrasConstruccionDO;

@Local
public interface NdtA91ObrasConstruccionDAO {
	/** Genera un registro de la entidad NdtA91ObrasConstruccionDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA91ObrasConstruccionDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA91ObrasConstruccionDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA91ObrasConstruccionDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA91ObrasConstruccionDO do
	 */
	NdtA91ObrasConstruccionDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA91ObrasConstruccionDO> findAll();
	
	
	void flush();

}