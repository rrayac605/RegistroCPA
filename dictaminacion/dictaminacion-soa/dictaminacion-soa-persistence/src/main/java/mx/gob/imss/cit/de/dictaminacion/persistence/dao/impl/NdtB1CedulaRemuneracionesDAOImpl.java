package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtB1CedulaRemuneracionesDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtB1CedulaRemuneracionesDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtB1CedulaRemuneracionesDAOImpl extends AbstractBaseDAO<NdtB1CedulaRemuneracionesDO> implements NdtB1CedulaRemuneracionesDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtB1CedulaRemuneracionesDAOImpl() {
		super(NdtB1CedulaRemuneracionesDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

