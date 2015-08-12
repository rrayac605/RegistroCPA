package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtR3ColegioXcontadorDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtR3ColegioXcontadorDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtR3ColegioXcontadorDAOImpl extends AbstractBaseDAO<NdtR3ColegioXcontadorDO> implements NdtR3ColegioXcontadorDAO{
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtR3ColegioXcontadorDAOImpl() {
		super(NdtR3ColegioXcontadorDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

