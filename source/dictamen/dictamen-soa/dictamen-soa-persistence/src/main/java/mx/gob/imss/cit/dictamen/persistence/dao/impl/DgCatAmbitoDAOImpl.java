package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatAmbitoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatAmbitoDO;




@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatAmbitoDAOImpl extends AbstractBaseDAO<DgCatAmbitoDO> implements DgCatAmbitoDAO{


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatAmbitoDAOImpl() {
		super(DgCatAmbitoDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


	@Override
	public void create(DgCatAmbitoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgCatAmbitoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgCatAmbitoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgCatAmbitoDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
