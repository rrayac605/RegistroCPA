package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdcTipoAfiliacionDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcTipoAfiliacionDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcTipoAfiliacionDAOImpl extends AbstractBaseDAO<NdcTipoAfiliacionDO> implements NdcTipoAfiliacionDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdcTipoAfiliacionDAOImpl() {
		super(NdcTipoAfiliacionDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
