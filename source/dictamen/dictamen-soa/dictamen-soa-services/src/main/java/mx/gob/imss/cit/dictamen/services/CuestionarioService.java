package mx.gob.imss.cit.dictamen.services;

import java.util.List;

import javax.ejb.Local;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.CuestionarioTO;

@Local
public interface CuestionarioService {

	public List<CuestionarioTO> getCuestionario()throws DictamenException;
	
}