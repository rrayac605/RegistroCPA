package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtBitCargaAseveracionesDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtBitCargaAseveracionesDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtBitCargaAseveracionesDAOImpl extends AbstractBaseDAO<NdtBitCargaAseveracionesDO> implements NdtBitCargaAseveracionesDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtBitCargaAseveracionesDAOImpl() {
		super(NdtBitCargaAseveracionesDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

