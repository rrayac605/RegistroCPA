
package mx.gob.imss.cit.dictamen.contador.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.commons.exception.DictamenContadorException;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.DitPersonaDAO;
import mx.gob.imss.cit.dictamen.contador.services.PatronDictamenService;



/**
 * @author ajfuentes
 * 
 */

@Stateless
public class PatronDictamenServiceImpl implements PatronDictamenService {

	private static final Logger LOG = Logger
			.getLogger(PatronDictamenServiceImpl.class);

	@EJB
	private DitPersonaDAO ndtContadorPublicoAutDAO;



	@Override
	public boolean getDictamenByRfcPatronAndIdContador(String curp)
			throws DictamenContadorException {
		
		LOG.debug("SIZE="+ndtContadorPublicoAutDAO.findAll());
		return false;
	}

	
	public DitPersonaDAO getNdtContadorPublicoAutDAO() {
		return ndtContadorPublicoAutDAO;
	}

	public void setNdtContadorPublicoAutDAO(
			DitPersonaDAO ndtContadorPublicoAutDAO) {
		this.ndtContadorPublicoAutDAO = ndtContadorPublicoAutDAO;
	}
	


}
