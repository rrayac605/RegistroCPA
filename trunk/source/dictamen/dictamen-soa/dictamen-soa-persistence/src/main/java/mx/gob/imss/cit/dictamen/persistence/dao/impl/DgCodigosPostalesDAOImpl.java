package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.cit.dictamen.persistence.constants.PersitenciaDictamenConstants;
import mx.gob.imss.cit.dictamen.model.DgCodigosPostalesDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCodigosPostalesDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;




@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCodigosPostalesDAOImpl extends AbstractBaseDAO<DgCodigosPostalesDO> implements DgCodigosPostalesDAO {

	  /*The em. */
    @PersistenceContext(unitName = PersitenciaDictamenConstants.PERSISTENCE_UNIT)
    private EntityManager em;
	
    
	public DgCodigosPostalesDAOImpl() {
		super(DgCodigosPostalesDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
