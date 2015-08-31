package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatLocalidadDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatLocalidadDO;

@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatLocalidadDAOImpl extends AbstractBaseDAO<DgCatLocalidadDO> implements DgCatLocalidadDAO{


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatLocalidadDAOImpl() {
		super(DgCatLocalidadDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
