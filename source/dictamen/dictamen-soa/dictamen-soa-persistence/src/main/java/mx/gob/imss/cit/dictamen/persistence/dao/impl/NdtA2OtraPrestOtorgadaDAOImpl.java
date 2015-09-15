package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtA2OtraPrestOtorgadaDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtA2OtraPrestOtorgadaDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA2OtraPrestOtorgadaDAOImpl extends AbstractBaseDAO<NdtA2OtraPrestOtorgadaDO> implements NdtA2OtraPrestOtorgadaDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA2OtraPrestOtorgadaDAOImpl() {
		super(NdtA2OtraPrestOtorgadaDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

