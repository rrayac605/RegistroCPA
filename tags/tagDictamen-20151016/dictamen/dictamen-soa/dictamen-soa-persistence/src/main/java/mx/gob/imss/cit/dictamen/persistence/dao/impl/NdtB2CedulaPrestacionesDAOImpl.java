package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtB2CedulaPrestacionesDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtB2CedulaPrestacionesDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtB2CedulaPrestacionesDAOImpl extends AbstractBaseDAO<NdtB2CedulaPrestacionesDO> implements NdtB2CedulaPrestacionesDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtB2CedulaPrestacionesDAOImpl() {
		super(NdtB2CedulaPrestacionesDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

