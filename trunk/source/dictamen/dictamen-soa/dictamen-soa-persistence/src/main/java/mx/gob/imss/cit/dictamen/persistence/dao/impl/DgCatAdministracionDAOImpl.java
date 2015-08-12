package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatAdministracionDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatAdministracionDO;




@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatAdministracionDAOImpl extends AbstractBaseDAO<DgCatAdministracionDO> implements DgCatAdministracionDAO {

	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatAdministracionDAOImpl() {
		super(DgCatAdministracionDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


	@Override
	public void create(DgCatAdministracionDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgCatAdministracionDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgCatAdministracionDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgCatAdministracionDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
