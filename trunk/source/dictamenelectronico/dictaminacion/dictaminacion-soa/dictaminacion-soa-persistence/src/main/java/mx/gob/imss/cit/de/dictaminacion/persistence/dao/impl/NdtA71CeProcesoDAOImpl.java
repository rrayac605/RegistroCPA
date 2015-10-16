package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA71CeProcesoDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA71CeProcesoDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA71CeProcesoDAOImpl extends AbstractBaseDAO<NdtA71CeProcesoDO> implements NdtA71CeProcesoDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA71CeProcesoDAOImpl() {
		super(NdtA71CeProcesoDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

