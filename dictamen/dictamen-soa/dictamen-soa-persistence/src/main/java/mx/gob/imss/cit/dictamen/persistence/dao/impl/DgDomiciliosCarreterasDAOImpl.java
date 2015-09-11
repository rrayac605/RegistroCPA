package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DgDomiciliosCarreterasDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgDomiciliosCarreterasDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgDomiciliosCarreterasDAOImpl extends AbstractBaseDAO<DgDomiciliosCarreterasDO> implements DgDomiciliosCarreterasDAO {

	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgDomiciliosCarreterasDAOImpl() {
		super(DgDomiciliosCarreterasDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
