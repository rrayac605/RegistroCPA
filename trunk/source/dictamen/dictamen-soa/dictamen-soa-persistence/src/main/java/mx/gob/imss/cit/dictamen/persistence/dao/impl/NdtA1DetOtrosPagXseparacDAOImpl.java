package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtA1DetOtrosPagXseparacDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtA1DetOtrosPagXseparacDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA1DetOtrosPagXseparacDAOImpl extends AbstractBaseDAO<NdtA1DetOtrosPagXseparacDO> implements NdtA1DetOtrosPagXseparacDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA1DetOtrosPagXseparacDAOImpl() {
		super(NdtA1DetOtrosPagXseparacDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

