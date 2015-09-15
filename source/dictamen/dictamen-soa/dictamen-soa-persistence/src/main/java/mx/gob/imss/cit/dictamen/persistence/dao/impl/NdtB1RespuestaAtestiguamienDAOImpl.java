package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtB1RespuestaAtestiguamienDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtB1RespuestaAtestiguamienDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtB1RespuestaAtestiguamienDAOImpl extends AbstractBaseDAO<NdtB1RespuestaAtestiguamienDO> implements NdtB1RespuestaAtestiguamienDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtB1RespuestaAtestiguamienDAOImpl() {
		super(NdtB1RespuestaAtestiguamienDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

