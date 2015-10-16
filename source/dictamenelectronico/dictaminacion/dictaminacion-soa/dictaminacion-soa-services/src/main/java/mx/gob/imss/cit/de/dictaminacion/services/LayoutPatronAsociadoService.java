package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.exception.DictamenException;
import mx.gob.imss.cit.de.dictaminacion.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;

@Local
public interface LayoutPatronAsociadoService {
	
	List<ParentLayoutTO> findLayoutAWSService(PatronDictamenTO patronDictamenTO, String rfcContador)throws DictamenException;

	void setLayoutService(AseveracionService layoutService);

	void setKeyGeneratorService(KeyGeneratorService keyGeneratorService);

	void setAWSService(AWSService aWSService);

}
