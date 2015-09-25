package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DicEstadoSolicitudDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DicEstadoSolicitudDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DicEstadoSolicitudDAOImpl extends AbstractBaseDAO<DicEstadoSolicitudDO> implements DicEstadoSolicitudDAO {

	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DicEstadoSolicitudDAOImpl() {
		super(DicEstadoSolicitudDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}