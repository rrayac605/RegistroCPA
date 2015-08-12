package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatEstadoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatEstadoDO;




@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatEstadoDAOImpl extends AbstractBaseDAO<DgCatEstadoDO> implements DgCatEstadoDAO {


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatEstadoDAOImpl() {
		super(DgCatEstadoDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


	@Override
	public void create(DgCatEstadoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgCatEstadoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgCatEstadoDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgCatEstadoDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
