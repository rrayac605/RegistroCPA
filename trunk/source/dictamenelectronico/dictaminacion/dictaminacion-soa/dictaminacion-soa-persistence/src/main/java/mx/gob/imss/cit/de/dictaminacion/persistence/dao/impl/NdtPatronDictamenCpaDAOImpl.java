package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronDictamenCpaDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtPatronDictamenCpaDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtPatronDictamenCpaDAOImpl extends AbstractBaseDAO<NdtPatronDictamenCpaDO> implements NdtPatronDictamenCpaDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtPatronDictamenCpaDAOImpl() {
		super(NdtPatronDictamenCpaDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}


