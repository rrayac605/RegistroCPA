package mx.gob.imss.cit.de.dictaminacion.batch.validation.dao;



import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.AtestiguamientoTO;

public interface AtestiguamientoDAO {
	
	/**
	 * 
	 * @return
	 */
	public AtestiguamientoTO obtieneAtestiguamiento(Long idAseveracion);

}
