package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import mx.gob.imss.cit.dictamen.model.NdtAtestigPreguntasRespuestDO;

public interface NdtAtestigPreguntasRespuestDAO {
	/** Genera un registro de la entidad NdcAtestiguamientoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtAtestigPreguntasRespuestDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtAtestigPreguntasRespuestDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtAtestigPreguntasRespuestDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcAtestiguamientoDO do
	 */
	NdtAtestigPreguntasRespuestDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtAtestigPreguntasRespuestDO> findAll();
	
	void flush();
}
