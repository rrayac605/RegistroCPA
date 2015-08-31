package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatTipoAsenDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatTipoAsenDO;


@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatTipoAsenDAOImpl extends AbstractBaseDAO<DgCatTipoAsenDO> implements DgCatTipoAsenDAO{


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatTipoAsenDAOImpl() {
		super(DgCatTipoAsenDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


}
