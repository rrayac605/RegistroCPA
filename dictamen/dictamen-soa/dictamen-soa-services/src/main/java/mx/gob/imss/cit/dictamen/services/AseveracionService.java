package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;

@Local
public interface AseveracionService {

	List<ParentLayoutTO> findAseveraciones(PatronDictamenTO patronDictamenTO);
}
