package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatTipoDomDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatTipoDomDO;


@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatTipoDomDAOImpl extends AbstractBaseDAO<DgCatTipoDomDO> implements DgCatTipoDomDAO {


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatTipoDomDAOImpl() {
		super(DgCatTipoDomDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


	@Override
	public void create(DgCatTipoDomDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgCatTipoDomDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgCatTipoDomDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgCatTipoDomDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
