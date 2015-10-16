package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdcRemuneracionesDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdcRemuneracionesDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcRemuneracionesDAOImpl extends AbstractBaseDAO<NdcRemuneracionesDO> implements NdcRemuneracionesDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdcRemuneracionesDAOImpl() {
		super(NdcRemuneracionesDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

