package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtDoctosProbCpaDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtDoctosProbCpaDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtDoctosProbCpaDAOImpl extends AbstractBaseDAO<NdtDoctosProbCpaDO> implements NdtDoctosProbCpaDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtDoctosProbCpaDAOImpl() {
		super(NdtDoctosProbCpaDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

