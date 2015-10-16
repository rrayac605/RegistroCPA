package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdcEstadoCpaDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdcEstadoCpaDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcEstadoCpaDAOImpl extends AbstractBaseDAO<NdcEstadoCpaDO> implements NdcEstadoCpaDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdcEstadoCpaDAOImpl() {
		super(NdcEstadoCpaDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

