package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtA3CuotaObreroPatronalDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtA3CuotaObreroPatronalDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA3CuotaObreroPatronalDAOImpl extends AbstractBaseDAO<NdtA3CuotaObreroPatronalDO> implements NdtA3CuotaObreroPatronalDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA3CuotaObreroPatronalDAOImpl() {
		super(NdtA3CuotaObreroPatronalDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
