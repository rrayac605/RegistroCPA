package mx.gob.imss.cit.dictamen.persistence.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.gob.imss.cit.dictamen.model.NdtPatronAsociadoDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtPatronAsociadoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;

@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtPatronAsociadoDAOImpl extends
		AbstractBaseDAO<NdtPatronAsociadoDO> implements NdtPatronAsociadoDAO {
	
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtPatronAsociadoDAOImpl() {
		super(NdtPatronAsociadoDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NdtPatronAsociadoDO> findByIdPatronDictamen(Long idPatronDictamen) {
		
		List<NdtPatronAsociadoDO> lst=null;
		Query q = null;

		q = em.createNamedQuery("NdtPatronAsociadoDO.findByIdPatronDictamen");
		q.setParameter("cveIdPatronDictamen", idPatronDictamen);
		lst = (List<NdtPatronAsociadoDO>) q.getResultList();

		return lst;
	}



}
