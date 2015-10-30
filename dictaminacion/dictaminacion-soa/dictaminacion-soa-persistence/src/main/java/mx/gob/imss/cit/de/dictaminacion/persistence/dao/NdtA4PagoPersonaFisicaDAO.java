package mx.gob.imss.cit.de.dictaminacion.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA4PagoPersonaFisicaDO;

@Local
public interface NdtA4PagoPersonaFisicaDAO {
	/** Genera un registro de la entidad NdtA4PagoPersonaFisicaDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtA4PagoPersonaFisicaDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtA4PagoPersonaFisicaDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtA4PagoPersonaFisicaDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtA4PagoPersonaFisicaDO do
	 */
	NdtA4PagoPersonaFisicaDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtA4PagoPersonaFisicaDO> findAll();
	
	
	void flush();

}