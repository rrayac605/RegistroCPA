package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.gob.imss.cit.de.dictaminacion.model.NdtB2CedulaPrestacionesDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtB2CedulaPrestacionesDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtB2CedulaPrestacionesDAOImpl extends AbstractBaseDAO<NdtB2CedulaPrestacionesDO> implements NdtB2CedulaPrestacionesDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtB2CedulaPrestacionesDAOImpl() {
		super(NdtB2CedulaPrestacionesDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public 	List<NdtB2CedulaPrestacionesDO> findPrestacionByIdCedulaByImporte(Long cveIdPatronDictamen, Long cveIdAtestiguamiento){
		List<NdtB2CedulaPrestacionesDO> list = null;
		Query q = null;
		q = em.createNamedQuery("NdtB2CedulaPrestacionesDO.findPrestacionByIdCedulaByImporte");
		q.setParameter("cveIdPatronDictamen", cveIdPatronDictamen);
		q.setParameter("cveIdAtestiguamiento",  2L);
		list = (List<NdtB2CedulaPrestacionesDO>)q.getResultList();

		return list;
	}
}

