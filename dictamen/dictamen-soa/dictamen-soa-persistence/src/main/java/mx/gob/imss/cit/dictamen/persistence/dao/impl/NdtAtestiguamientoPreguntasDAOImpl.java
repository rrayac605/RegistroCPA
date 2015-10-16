package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtAtestiguamientoPreguntasDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtAtestiguamientoPreguntasDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtAtestiguamientoPreguntasDAOImpl extends AbstractBaseDAO<NdtAtestiguamientoPreguntasDO> implements NdtAtestiguamientoPreguntasDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtAtestiguamientoPreguntasDAOImpl() {
		super(NdtAtestiguamientoPreguntasDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

