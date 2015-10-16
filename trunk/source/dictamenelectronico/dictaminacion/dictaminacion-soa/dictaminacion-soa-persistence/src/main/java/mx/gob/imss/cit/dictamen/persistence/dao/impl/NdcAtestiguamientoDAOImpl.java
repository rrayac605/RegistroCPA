package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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

	@Override
	public NdcAtestiguamientoDO getByIdAseveracion(Object id) {
		NdcAtestiguamientoDO rst = null;
		Query q = null;
		q = em.createNamedQuery("NdcAtestiguamientoDO.findByCveIdAseveracion");
		q.setParameter("cveIdAseveracion", id);
		try{
			rst = (NdcAtestiguamientoDO)q.getSingleResult();
			return rst;
		}catch (NoResultException e){
			return null;
		}
	}

}

