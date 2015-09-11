package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DicTipoSociedadDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DicTipoSociedadDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DicTipoSociedadDAOImpl extends AbstractBaseDAO<DicTipoSociedadDO> implements DicTipoSociedadDAO {


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DicTipoSociedadDAOImpl() {
		super(DicTipoSociedadDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
