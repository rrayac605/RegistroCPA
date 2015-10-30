package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtB1DetPagosOtrosEmpleadDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtB1DetPagosOtrosEmpleadDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtB1DetPagosOtrosEmpleadDAOImpl extends AbstractBaseDAO<NdtB1DetPagosOtrosEmpleadDO> implements NdtB1DetPagosOtrosEmpleadDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtB1DetPagosOtrosEmpleadDAOImpl() {
		super(NdtB1DetPagosOtrosEmpleadDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

