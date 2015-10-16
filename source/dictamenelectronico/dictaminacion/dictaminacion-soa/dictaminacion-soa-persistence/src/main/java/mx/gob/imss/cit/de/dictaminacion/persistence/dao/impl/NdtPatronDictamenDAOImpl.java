package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtPatronDictamenDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;

@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtPatronDictamenDAOImpl extends
		AbstractBaseDAO<NdtPatronDictamenDO> implements NdtPatronDictamenDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtPatronDictamenDAOImpl() {
		super(NdtPatronDictamenDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NdtPatronDictamenDO> findByRfcPatronAndIdContador(String rfcPatron,Long idContador) {
		List<NdtPatronDictamenDO> lst = null;
		Query q = null;

		q = em.createNamedQuery("NdtPatronDictamenDO.findByRfcPatronAndIdContador");
		q.setParameter("desRfc", rfcPatron);
		q.setParameter("idContador", idContador);
		lst = (List<NdtPatronDictamenDO>) q.getResultList();

		return lst;
	}

}
