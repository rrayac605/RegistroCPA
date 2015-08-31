package mx.gob.imss.cit.dictamen.services.impl;

import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.commons.to.ContadorPublicoTO;
import mx.gob.imss.cit.dictamen.services.RegistrarContadorPublicoService;

@Stateless
public class RegistrarContadorPublicoServiceImpl implements
		RegistrarContadorPublicoService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(RegistrarContadorPublicoServiceImpl.class);

	@Override
	public void executeRegistrarContador(ContadorPublicoTO contadorPublicoTO) {
		LOGGER.info("###################### El EJB RegistrarContadorPublicoServiceImpl se ejecuto exitosamente ###########################################");

	}

}
