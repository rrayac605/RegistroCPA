package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA5PrestadoraServiciosDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA5PrestadoraServiciosDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA5PrestadoraServiciosDAOImpl extends AbstractBaseDAO<NdtA5PrestadoraServiciosDO> implements NdtA5PrestadoraServiciosDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA5PrestadoraServiciosDAOImpl() {
		super(NdtA5PrestadoraServiciosDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

