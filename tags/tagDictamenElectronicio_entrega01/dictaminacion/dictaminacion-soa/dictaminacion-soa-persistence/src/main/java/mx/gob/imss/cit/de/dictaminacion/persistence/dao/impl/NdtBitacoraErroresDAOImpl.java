package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.gob.imss.cit.de.dictaminacion.model.NdtBitacoraErroresDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtBitacoraErroresDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtBitacoraErroresDAOImpl extends AbstractBaseDAO<NdtBitacoraErroresDO> implements NdtBitacoraErroresDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtBitacoraErroresDAOImpl() {
		super(NdtBitacoraErroresDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NdtBitacoraErroresDO> findByIdCargaDocumento(Long cveIdBitacoraCargaAsev) {
		List<NdtBitacoraErroresDO> lst=null;
		Query q = null;

		q = em.createNamedQuery("NdtBitacoraErroresDO.findByIdCargaDocumento");
		q.setParameter("cveIdBitacoraCargaAsev", cveIdBitacoraCargaAsev);
		lst = (List<NdtBitacoraErroresDO>) q.getResultList();

		return lst;
	}

}

