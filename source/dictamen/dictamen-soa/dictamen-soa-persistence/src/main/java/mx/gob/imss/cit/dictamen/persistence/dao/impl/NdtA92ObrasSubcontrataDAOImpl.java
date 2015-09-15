package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtA92ObrasSubcontrataDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtA92ObrasSubcontrataDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA92ObrasSubcontrataDAOImpl extends AbstractBaseDAO<NdtA92ObrasSubcontrataDO> implements NdtA92ObrasSubcontrataDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA92ObrasSubcontrataDAOImpl() {
		super(NdtA92ObrasSubcontrataDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

