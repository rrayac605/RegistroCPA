package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdcTipoConsumoTransporteDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcTipoConsumoTransporteDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcTipoConsumoTransporteDAOImpl extends AbstractBaseDAO<NdcTipoConsumoTransporteDO> implements NdcTipoConsumoTransporteDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdcTipoConsumoTransporteDAOImpl() {
		super(NdcTipoConsumoTransporteDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

