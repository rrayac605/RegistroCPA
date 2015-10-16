package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA73CeMaquinariaDO;

@Local
public interface NdtA73CeMaquinariaDAO {
	/** Genera un registro de la entidad NdtA73CeMaquinariaDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA73CeMaquinariaDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA73CeMaquinariaDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA73CeMaquinariaDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA73CeMaquinariaDO do
	 */
	NdtA73CeMaquinariaDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA73CeMaquinariaDO> findAll();
	
	
	void flush();

}