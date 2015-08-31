package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DitRepresentanteLegalDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DitRepresentanteLegalDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DitRepresentanteLegalDAOImpl extends AbstractBaseDAO<DitRepresentanteLegalDO> implements DitRepresentanteLegalDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public DitRepresentanteLegalDAOImpl() {
		super(DitRepresentanteLegalDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

