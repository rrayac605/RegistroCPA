package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdtR1DatosPersonalesDO;

@Local
public interface NdtR1DatosPersonalesDAO {
	/** Genera un registro de la entidad NdtR1DatosPersonalesDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtR1DatosPersonalesDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtR1DatosPersonalesDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtR1DatosPersonalesDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdtR1DatosPersonalesDO do
	 */
	NdtR1DatosPersonalesDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtR1DatosPersonalesDO> findAll();
	
	
	void flush();

}