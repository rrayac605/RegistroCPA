package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtBitacoraErroresDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtBitacoraErroresDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



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

}

