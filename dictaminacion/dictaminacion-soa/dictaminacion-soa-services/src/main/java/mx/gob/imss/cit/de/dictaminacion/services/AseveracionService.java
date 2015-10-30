package mx.gob.imss.cit.de.dictaminacion.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.de.dictaminacion.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.de.dictaminacion.commons.to.domain.PatronDictamenTO;

@Local
public interface AseveracionService {

	List<ParentLayoutTO> findAseveraciones(PatronDictamenTO patronDictamenTO);
}
