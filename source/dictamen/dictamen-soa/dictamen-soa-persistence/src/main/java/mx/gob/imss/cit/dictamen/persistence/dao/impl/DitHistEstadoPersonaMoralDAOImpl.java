package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DitHistEstadoPersonaMoralDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DitHistEstadoPersonaMoralDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DitHistEstadoPersonaMoralDAOImpl extends AbstractBaseDAO<DitHistEstadoPersonaMoralDO>
implements DitHistEstadoPersonaMoralDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public DitHistEstadoPersonaMoralDAOImpl() {
		super(DitHistEstadoPersonaMoralDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

