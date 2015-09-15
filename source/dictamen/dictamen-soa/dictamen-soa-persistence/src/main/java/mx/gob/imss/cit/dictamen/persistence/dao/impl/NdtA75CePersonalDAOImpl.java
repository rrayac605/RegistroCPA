package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtA75CePersonalDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtA75CePersonalDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA75CePersonalDAOImpl extends AbstractBaseDAO<NdtA75CePersonalDO> implements NdtA75CePersonalDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA75CePersonalDAOImpl() {
		super(NdtA75CePersonalDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

