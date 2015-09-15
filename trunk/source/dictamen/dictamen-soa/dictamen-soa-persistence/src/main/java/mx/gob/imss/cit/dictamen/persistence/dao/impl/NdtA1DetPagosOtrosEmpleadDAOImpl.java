package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtA1DetPagosOtrosEmpleadDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtA1DetPagosOtrosEmpleadDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA1DetPagosOtrosEmpleadDAOImpl extends AbstractBaseDAO<NdtA1DetPagosOtrosEmpleadDO> implements NdtA1DetPagosOtrosEmpleadDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA1DetPagosOtrosEmpleadDAOImpl() {
		super(NdtA1DetPagosOtrosEmpleadDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

