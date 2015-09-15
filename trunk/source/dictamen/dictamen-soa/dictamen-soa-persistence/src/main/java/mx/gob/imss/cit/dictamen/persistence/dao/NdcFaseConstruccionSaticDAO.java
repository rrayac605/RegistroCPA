package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcFaseConstruccionSaticDO;

@Local
public interface NdcFaseConstruccionSaticDAO {
	/** Genera un registro de la entidad NdcFaseConstruccionSaticDO.
	 *
	 * @param entity the entity
	 */
	void create(NdcFaseConstruccionSaticDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdcFaseConstruccionSaticDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdcFaseConstruccionSaticDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcFaseConstruccionSaticDO do
	 */
	NdcFaseConstruccionSaticDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdcFaseConstruccionSaticDO> findAll();
	
	
	void flush();

}