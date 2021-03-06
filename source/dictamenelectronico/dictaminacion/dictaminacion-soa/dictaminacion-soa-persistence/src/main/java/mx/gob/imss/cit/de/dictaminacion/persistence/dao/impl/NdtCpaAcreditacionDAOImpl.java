package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtCpaAcreditacionDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtCpaAcreditacionDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtCpaAcreditacionDAOImpl extends AbstractBaseDAO<NdtCpaAcreditacionDO> implements NdtCpaAcreditacionDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtCpaAcreditacionDAOImpl() {
		super(NdtCpaAcreditacionDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

