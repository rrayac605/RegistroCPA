package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DitPersonamContactoFiscalDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DitPersonamContactoFiscalDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DitPersonamContactoFiscalDAOImpl extends AbstractBaseDAO<DitPersonamContactoFiscalDO> 
implements DitPersonamContactoFiscalDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public DitPersonamContactoFiscalDAOImpl() {
		super(DitPersonamContactoFiscalDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

