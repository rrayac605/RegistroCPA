package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtB2DetPrestacionDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtB2DetPrestacionDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtB2DetPrestacionDAOImpl extends AbstractBaseDAO<NdtB2DetPrestacionDO> implements NdtB2DetPrestacionDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtB2DetPrestacionDAOImpl() {
		super(NdtB2DetPrestacionDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

