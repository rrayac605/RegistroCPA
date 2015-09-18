package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcAtestiguamientoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcAtestiguamientoDAOImpl extends AbstractBaseDAO<NdcAtestiguamientoDO> implements NdcAtestiguamientoDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdcAtestiguamientoDAOImpl() {
		super(NdcAtestiguamientoDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

