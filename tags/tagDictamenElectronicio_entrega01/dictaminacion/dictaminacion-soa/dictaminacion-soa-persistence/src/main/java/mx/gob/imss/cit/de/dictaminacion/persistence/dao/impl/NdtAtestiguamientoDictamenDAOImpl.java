package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	public  NdtAtestiguamientoDictamenDO getDetalleExamenByAtestiguamiento(NdtAtestiguamientoDictamenDO ndtAtestiguamientoDictamenDO) {
	   Query q = null;
       
       q = em.createNamedQuery("NdtAtestiguamientoDictamenDO.getDetalleExamenByAtestiguamiento");
       q.setParameter("cveIdAtestiguamiento", ndtAtestiguamientoDictamenDO.getCveIdAtestiguamiento().getCveIdAtestiguamiento());
       q.setParameter("cveIdEstadoAtestiguamiento", ndtAtestiguamientoDictamenDO.getCveIdEstadoAtestiguamiento().getCveIdEstadoAtestiguamiento());
       q.setParameter("cveIdPatronDictamen", ndtAtestiguamientoDictamenDO.getCveIdPatronDictamen().getCveIdPatronDictamen());
       ndtAtestiguamientoDictamenDO =(NdtAtestiguamientoDictamenDO) q.getResultList().get(0);
       
       return ndtAtestiguamientoDictamenDO;
	}
	
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
