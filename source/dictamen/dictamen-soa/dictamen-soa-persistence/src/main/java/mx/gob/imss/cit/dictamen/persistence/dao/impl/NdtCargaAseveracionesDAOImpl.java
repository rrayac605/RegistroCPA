package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtCargaAseveracionesDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtCargaAseveracionesDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtCargaAseveracionesDAOImpl extends AbstractBaseDAO<NdtCargaAseveracionesDO> implements NdtCargaAseveracionesDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtCargaAseveracionesDAOImpl() {
		super(NdtCargaAseveracionesDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

