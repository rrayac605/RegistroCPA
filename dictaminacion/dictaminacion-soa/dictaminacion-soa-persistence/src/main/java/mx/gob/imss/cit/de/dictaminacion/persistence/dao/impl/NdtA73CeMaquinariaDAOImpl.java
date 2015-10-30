package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA73CeMaquinariaDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA73CeMaquinariaDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA73CeMaquinariaDAOImpl extends AbstractBaseDAO<NdtA73CeMaquinariaDO> implements NdtA73CeMaquinariaDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA73CeMaquinariaDAOImpl() {
		super(NdtA73CeMaquinariaDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

