package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatTermGenDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatTermGenDO;


@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatTermGenDAOImpl extends AbstractBaseDAO<DgCatTermGenDO> implements DgCatTermGenDAO{


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatTermGenDAOImpl() {
		super(DgCatTermGenDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


	@Override
	public void create(DgCatTermGenDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgCatTermGenDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgCatTermGenDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgCatTermGenDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
