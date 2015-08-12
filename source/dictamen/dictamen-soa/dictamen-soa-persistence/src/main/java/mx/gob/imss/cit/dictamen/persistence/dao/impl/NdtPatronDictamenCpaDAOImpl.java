package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtPatronDictamenCpaDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtPatronDictamenCpaDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



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

