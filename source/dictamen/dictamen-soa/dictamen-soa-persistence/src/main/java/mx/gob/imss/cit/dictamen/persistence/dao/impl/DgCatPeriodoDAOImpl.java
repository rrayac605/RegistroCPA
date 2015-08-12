package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatPeriodoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatPeriodoDO;


@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatPeriodoDAOImpl extends AbstractBaseDAO<DgCatPeriodoDO> implements DgCatPeriodoDAO{


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatPeriodoDAOImpl() {
		super(DgCatPeriodoDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


	@Override
	public void create(DgCatPeriodoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgCatPeriodoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgCatPeriodoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgCatPeriodoDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
