package mx.gob.imss.cit.dictamen.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.commons.exception.DictamenException;
import mx.gob.imss.cit.dictamen.commons.to.CuestionarioTO;
import mx.gob.imss.cit.dictamen.services.CuestionarioService;

@Stateless
public class CuestionarioServiceImpl implements	CuestionarioService {
	
	private static final Logger LOG = Logger
			.getLogger(CuestionarioServiceImpl.class);
	
	@Override
	public List<CuestionarioTO> getCuestionario() throws DictamenException {
		List<CuestionarioTO> cuestionarios = new ArrayList<CuestionarioTO>();
		
		return cuestionarios;
	}

}
