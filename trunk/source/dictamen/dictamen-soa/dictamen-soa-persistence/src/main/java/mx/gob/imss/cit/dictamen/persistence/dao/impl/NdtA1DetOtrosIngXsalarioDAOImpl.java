package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtA1DetOtrosIngXsalarioDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtA1DetOtrosIngXsalarioDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA1DetOtrosIngXsalarioDAOImpl extends AbstractBaseDAO<NdtA1DetOtrosIngXsalarioDO> implements NdtA1DetOtrosIngXsalarioDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA1DetOtrosIngXsalarioDAOImpl() {
		super(NdtA1DetOtrosIngXsalarioDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

