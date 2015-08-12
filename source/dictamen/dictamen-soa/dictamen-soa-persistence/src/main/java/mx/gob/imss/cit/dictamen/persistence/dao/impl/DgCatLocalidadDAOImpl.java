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


	@Override
	public void create(DgCatLocalidadDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgCatLocalidadDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgCatLocalidadDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgCatLocalidadDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
