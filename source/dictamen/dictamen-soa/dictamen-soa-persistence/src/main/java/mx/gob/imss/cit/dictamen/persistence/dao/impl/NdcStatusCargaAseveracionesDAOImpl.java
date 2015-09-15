package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdcStatusCargaAseveracionesDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcStatusCargaAseveracionesDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcStatusCargaAseveracionesDAOImpl extends AbstractBaseDAO<NdcStatusCargaAseveracionesDO> implements NdcStatusCargaAseveracionesDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdcStatusCargaAseveracionesDAOImpl() {
		super(NdcStatusCargaAseveracionesDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}



