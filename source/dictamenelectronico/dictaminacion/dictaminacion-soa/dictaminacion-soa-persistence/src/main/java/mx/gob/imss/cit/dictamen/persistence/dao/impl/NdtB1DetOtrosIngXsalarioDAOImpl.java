package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtB1DetOtrosIngXsalarioDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtB1DetOtrosIngXsalarioDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtB1DetOtrosIngXsalarioDAOImpl extends AbstractBaseDAO<NdtB1DetOtrosIngXsalarioDO> implements NdtB1DetOtrosIngXsalarioDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtB1DetOtrosIngXsalarioDAOImpl() {
		super(NdtB1DetOtrosIngXsalarioDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

