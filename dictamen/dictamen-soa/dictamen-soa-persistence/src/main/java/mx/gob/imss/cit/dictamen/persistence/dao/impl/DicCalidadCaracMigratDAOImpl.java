package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DicCalidadCaracMigratDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DicCalidadCaracMigratDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DicCalidadCaracMigratDAOImpl extends AbstractBaseDAO<DicCalidadCaracMigratDO> implements DicCalidadCaracMigratDAO{

	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DicCalidadCaracMigratDAOImpl() {
		super(DicCalidadCaracMigratDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
