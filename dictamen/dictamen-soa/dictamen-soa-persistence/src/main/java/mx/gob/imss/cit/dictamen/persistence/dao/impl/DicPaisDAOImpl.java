/**
 * 
 */
package mx.gob.imss.cit.dictamen.persistence.dao.impl;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DicPaisDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DicPaisDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;

/**
 * @author ajfuentes
 *
 */
@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DicPaisDAOImpl extends AbstractBaseDAO<DicPaisDO> implements DicPaisDAO{

	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DicPaisDAOImpl() {
		super(DicPaisDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
