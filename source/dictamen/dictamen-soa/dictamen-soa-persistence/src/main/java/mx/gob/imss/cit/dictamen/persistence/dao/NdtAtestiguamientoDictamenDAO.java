package mx.gob.imss.cit.dictamen.persistence.dao;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO;
@Local
public interface NdtAtestiguamientoDictamenDAO {
	
	/** Genera un registro de la entidad NdcAtestiguamientoDO.
	 *
	 * @param entity the entity
	 */
	void create(NdtAtestiguamientoDictamenDO entity);
	/**
	 * Metodo editar o actualizar.
	 *
	 * @param entity the entity
	 */
	void edit(NdtAtestiguamientoDictamenDO entity);
	/**
	 * Metodo Eliminar.
	 *
	 * @param entity the entity
	 */
	void remove(NdtAtestiguamientoDictamenDO entity);
	/**
	 * Metodo de busqueda por Id.
	 *
	 * @param id the id
	 * @return the NdcAtestiguamientoDO do
	 */
	NdtAtestiguamientoDictamenDO get(Object id);
	/**
	 * Metodo de busqueda por todos.
	 *
	 * @return the list
	 */
	List<NdtAtestiguamientoDictamenDO> findAll();
	
	
	List<NdtAtestiguamientoDictamenDO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen);
	
	
	/**
	 * Metodo para mostrar examen
	 *
	 * @return the list
	 */
	NdcAtestiguamientoDO getDetalleExamenByAtestiguamiento(Long cveIdEstadoAtestiguamiento, Long cveIdAtestiguamiento);
	
	
	
	void flush();
}
