package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdcTipoConvenioCotizacionDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcTipoConvenioCotizacionDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcTipoConvenioCotizacionDAOImpl extends AbstractBaseDAO<NdcTipoConvenioCotizacionDO> implements NdcTipoConvenioCotizacionDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdcTipoConvenioCotizacionDAOImpl() {
		super(NdcTipoConvenioCotizacionDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

