package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdcFaseConstruccionSaticDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcFaseConstruccionSaticDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcFaseConstruccionSaticDAOImpl extends AbstractBaseDAO<NdcFaseConstruccionSaticDO> implements NdcFaseConstruccionSaticDAO {
	
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;
	
	public NdcFaseConstruccionSaticDAOImpl() {
		super(NdcFaseConstruccionSaticDO.class);
		
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}


