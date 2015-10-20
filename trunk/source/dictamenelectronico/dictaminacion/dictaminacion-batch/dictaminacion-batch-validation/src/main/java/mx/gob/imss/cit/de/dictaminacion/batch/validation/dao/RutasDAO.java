package mx.gob.imss.cit.de.dictaminacion.batch.validation.dao;

import java.util.List;

import mx.gob.imss.cit.de.dictaminacion.batch.validation.to.RutaTO;

public interface RutasDAO {
	
	/**
	 * @return 
	 * 
	 */
	public List<RutaTO> obtieneRutas();

}
