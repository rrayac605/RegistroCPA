package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA6SubcontratacionSpDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA6SubcontratacionSpDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA6SubcontratacionSpDAOImpl extends AbstractBaseDAO<NdtA6SubcontratacionSpDO> implements NdtA6SubcontratacionSpDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA6SubcontratacionSpDAOImpl() {
		super(NdtA6SubcontratacionSpDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

