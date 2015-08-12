package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatDerechosTransitoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatDerechosTransitoDO;


@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatDerechosTransitoDAOImpl extends AbstractBaseDAO<DgCatDerechosTransitoDO> implements DgCatDerechosTransitoDAO{


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatDerechosTransitoDAOImpl() {
		super(DgCatDerechosTransitoDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


	@Override
	public void create(DgCatDerechosTransitoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgCatDerechosTransitoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgCatDerechosTransitoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgCatDerechosTransitoDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
