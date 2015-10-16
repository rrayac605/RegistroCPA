package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtB1DetOtrosPagXseparacDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtB1DetOtrosPagXseparacDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtB1DetOtrosPagXseparacDAOImpl extends AbstractBaseDAO<NdtB1DetOtrosPagXseparacDO> implements NdtB1DetOtrosPagXseparacDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtB1DetOtrosPagXseparacDAOImpl() {
		super(NdtB1DetOtrosPagXseparacDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

