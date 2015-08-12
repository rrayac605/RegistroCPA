package mx.gob.imss.cit.dictamen.persistence.dao.impl;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatEstadoCpDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatEstadoCpDO;


@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatEstadoCpDAOImpl extends AbstractBaseDAO<DgCatEstadoCpDO> implements DgCatEstadoCpDAO{



	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatEstadoCpDAOImpl() {
		super(DgCatEstadoCpDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


	@Override
	public void create(DgCatEstadoCpDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgCatEstadoCpDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgCatEstadoCpDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgCatEstadoCpDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
