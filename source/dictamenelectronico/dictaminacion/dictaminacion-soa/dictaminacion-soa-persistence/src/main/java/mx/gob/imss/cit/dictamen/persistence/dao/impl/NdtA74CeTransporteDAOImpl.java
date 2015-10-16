package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtA74CeTransporteDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtA74CeTransporteDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA74CeTransporteDAOImpl extends AbstractBaseDAO<NdtA74CeTransporteDO> implements NdtA74CeTransporteDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA74CeTransporteDAOImpl() {
		super(NdtA74CeTransporteDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

