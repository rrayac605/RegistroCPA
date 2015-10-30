package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtContadorPublicoAutDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtContadorPublicoAutDAOImpl extends AbstractBaseDAO<NdtContadorPublicoAutDO> 
implements NdtContadorPublicoAutDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtContadorPublicoAutDAOImpl() {
		super(NdtContadorPublicoAutDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

