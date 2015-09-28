package mx.gob.imss.cit.dictamen.persistence.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoDictamenDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtAtestiguamientoDictamenDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;

@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtAtestiguamientoDictamenDAOImpl extends AbstractBaseDAO<NdtAtestiguamientoDictamenDO> implements NdtAtestiguamientoDictamenDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;
	
	public NdtAtestiguamientoDictamenDAOImpl() {
		super(NdtAtestiguamientoDictamenDO.class);
	}

	 @SuppressWarnings("unchecked")
	 @Override
	 public List<NdtAtestiguamientoDictamenDO> findExamenesByIdPatronDictamen(Long cveIdPatronDictamen) {
	      List<NdtAtestiguamientoDictamenDO> lst = null;
	       Query q = null;
	       
	       q = em.createNamedQuery("NdtAtestiguamientoDictamenDO.findByCveIdPatronDictamen");
	       q.setParameter("cveIdPatronDictamen", cveIdPatronDictamen);
	       lst = (List<NdtAtestiguamientoDictamenDO>)q.getResultList();
	       
	       return lst;
	 }

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
