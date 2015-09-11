package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DicModuloDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DicModuloDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DicModuloDAOImpl extends AbstractBaseDAO<DicModuloDO> implements DicModuloDAO {


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DicModuloDAOImpl() {
		super(DicModuloDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
