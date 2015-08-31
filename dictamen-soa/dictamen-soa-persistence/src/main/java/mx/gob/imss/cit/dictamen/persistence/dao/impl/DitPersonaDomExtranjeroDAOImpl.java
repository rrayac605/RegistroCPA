package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DitPersonaDomExtranjeroDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DitPersonaDomExtranjeroDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DitPersonaDomExtranjeroDAOImpl extends AbstractBaseDAO<DitPersonaDomExtranjeroDO> implements DitPersonaDomExtranjeroDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public DitPersonaDomExtranjeroDAOImpl() {
		super(DitPersonaDomExtranjeroDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

