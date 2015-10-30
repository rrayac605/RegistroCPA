package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA51PersonalProporcionadDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA51PersonalProporcionadDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA51PersonalProporcionadDAOImpl extends AbstractBaseDAO<NdtA51PersonalProporcionadDO> implements NdtA51PersonalProporcionadDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA51PersonalProporcionadDAOImpl() {
		super(NdtA51PersonalProporcionadDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

