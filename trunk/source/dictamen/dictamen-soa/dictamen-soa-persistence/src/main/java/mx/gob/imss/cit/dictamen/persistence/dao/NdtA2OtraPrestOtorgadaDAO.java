package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtA2OtraPrestOtorgadaDO;

@Local
public interface NdtA2OtraPrestOtorgadaDAO {
	/** Genera un registro de la entidad NdtA2OtraPrestOtorgadaDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA2OtraPrestOtorgadaDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA2OtraPrestOtorgadaDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA2OtraPrestOtorgadaDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA2OtraPrestOtorgadaDO do
	 */
	NdtA2OtraPrestOtorgadaDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA2OtraPrestOtorgadaDO> findAll();
	
	
	void flush();

}