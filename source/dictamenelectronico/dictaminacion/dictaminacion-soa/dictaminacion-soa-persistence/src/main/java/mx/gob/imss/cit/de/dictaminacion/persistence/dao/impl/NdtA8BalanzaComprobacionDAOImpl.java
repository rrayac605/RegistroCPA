package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA8BalanzaComprobacionDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA8BalanzaComprobacionDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA8BalanzaComprobacionDAOImpl extends AbstractBaseDAO<NdtA8BalanzaComprobacionDO> implements NdtA8BalanzaComprobacionDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA8BalanzaComprobacionDAOImpl() {
		super(NdtA8BalanzaComprobacionDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

