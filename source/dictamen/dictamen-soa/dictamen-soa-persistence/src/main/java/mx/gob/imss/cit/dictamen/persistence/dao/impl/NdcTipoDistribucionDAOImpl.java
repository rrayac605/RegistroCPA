package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdcTipoDistribucionDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcTipoDistribucionDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcTipoDistribucionDAOImpl extends AbstractBaseDAO<NdcTipoDistribucionDO> implements NdcTipoDistribucionDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdcTipoDistribucionDAOImpl() {
		super(NdcTipoDistribucionDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

