package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DgDomiciliosCaminosDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgDomiciliosCaminosDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgDomiciliosCaminosDAOImpl extends AbstractBaseDAO<DgDomiciliosCaminosDO> implements DgDomiciliosCaminosDAO{


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgDomiciliosCaminosDAOImpl() {
		super(DgDomiciliosCaminosDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


	@Override
	public void create(DgDomiciliosCaminosDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgDomiciliosCaminosDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgDomiciliosCaminosDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgDomiciliosCaminosDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
