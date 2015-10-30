package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA61PersonalProporcionadDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA61PersonalProporcionadDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA61PersonalProporcionadDAOImpl extends AbstractBaseDAO<NdtA61PersonalProporcionadDO> implements NdtA61PersonalProporcionadDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA61PersonalProporcionadDAOImpl() {
		super(NdtA61PersonalProporcionadDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

