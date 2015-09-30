package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;

@Local
public interface LayoutPatronAsociadoService {
	
	List<ParentLayoutTO> findLayoutAWSService(String anioEjercicio, String rfcUsuario, String rfcPAtron)throws DictamenException;
}
