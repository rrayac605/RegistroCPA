package mx.gob.imss.cit.dictamen.contador.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.contador.model.DitPersonaDO;
import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.DitPersonaDAO;
import mx.gob.imss.cit.dictamen.contador.persistence.util.ExceptionHandlerDAOInterceptor;

import javax.persistence.Query;
import javax.persistence.NoResultException;

import org.apache.log4j.Logger;


@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DitPersonaDAOImpl extends AbstractBaseDAO<DitPersonaDO> 
implements DitPersonaDAO {
	private static final Logger lOGGER = Logger.getLogger(DitPersonaDAOImpl.class);

	/** The em. */
	@PersistenceContext(unitName = "DictamenContadorPU")
	private EntityManager em;

	public DitPersonaDAOImpl() {
		super(DitPersonaDO.class);

	}

	public DitPersonaDO selectContadorPublicoByCurp(String curp){
		lOGGER.debug("curp="+curp);
		DitPersonaDO rst=null;
	       Query query = null;
	       query = em.createQuery("SELECT n from DitPersonaDO n where n.CURP = :curp");
	       query.setParameter("curp", curp);
			try{
				rst = (DitPersonaDO)query.getSingleResult();
			}catch (NoResultException noResultException){
				lOGGER.debug("No hay personas con curp="+curp);
			}	
        return rst;
	}
	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

