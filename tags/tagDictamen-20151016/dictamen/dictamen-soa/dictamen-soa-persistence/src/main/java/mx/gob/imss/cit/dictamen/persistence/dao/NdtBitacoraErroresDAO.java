package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtBitacoraErroresDO;

@Local
public interface NdtBitacoraErroresDAO {
	/** Genera un registro de la entidad NdtBitacoraErroresDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtBitacoraErroresDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtBitacoraErroresDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtBitacoraErroresDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtBitacoraErroresDO do
	 */
	NdtBitacoraErroresDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtBitacoraErroresDO> findAll();
	
	
	void flush();

}