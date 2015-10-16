package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.gob.imss.cit.de.dictaminacion.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtAtestiguamientoDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtAtestiguamientoDictamenDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;

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
	public  NdcAtestiguamientoDO getDetalleExamenByAtestiguamiento(Long cveIdEstadoAtestiguamiento, Long cveIdAtestiguamiento) {
		NdcAtestiguamientoDO ndcAtestiguamientoDO = null;
       Query q = null;
       
       q = em.createNamedQuery("NdtAtestiguamientoDictamenDO.getDetalleExamenByAtestiguamiento");
       q.setParameter("cveIdAtestiguamiento", cveIdAtestiguamiento);
       q.setParameter("cveIdEstadoAtestiguamiento", cveIdEstadoAtestiguamiento);
       ndcAtestiguamientoDO =(NdcAtestiguamientoDO) q.getResultList().get(0);
       
       return ndcAtestiguamientoDO;
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
