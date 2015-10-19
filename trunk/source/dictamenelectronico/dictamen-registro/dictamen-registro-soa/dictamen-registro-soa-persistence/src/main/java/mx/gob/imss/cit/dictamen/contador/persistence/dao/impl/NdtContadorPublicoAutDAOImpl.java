package mx.gob.imss.cit.dictamen.contador.persistence.dao.impl;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.contador.model.NdtContadorPublicoAutDO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.contador.persistence.dao.NdtContadorPublicoAutDAO;
import mx.gob.imss.cit.dictamen.contador.persistence.util.ExceptionHandlerDAOInterceptor;

@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtContadorPublicoAutDAOImpl extends AbstractBaseDAO<NdtContadorPublicoAutDO> 
 implements NdtContadorPublicoAutDAO {
	
	public NdtContadorPublicoAutDAOImpl() {
		super(NdtContadorPublicoAutDO.class);
	}

	private static final Logger lOGGER = Logger.getLogger(NdtContadorPublicoAutDAOImpl.class);

	/** The em. */
	@PersistenceContext(unitName = "DictamenContadorPU")
	private EntityManager em;
	
	@Override
	public NdtContadorPublicoAutDO selectContadorPublicoAutByIdEstado(
			int cveIdCpa, int cveIdEstadoCpa) {
		
		lOGGER.debug("curp="+cveIdCpa);
		NdtContadorPublicoAutDO rst=null;
	       Query query = null;
	       query = em.createQuery("SELECT n from NdtContadorPublicoAutDO n where n.cveIdCpa = :cveIdCpa and n.cveIdEstadoCpa = :cveIdEstadoCpa");
	       query.setParameter("cveIdCpa", cveIdCpa);
	       query.setParameter("cveIdEstadoCpa", cveIdEstadoCpa);

			try{
				rst = (NdtContadorPublicoAutDO)query.getSingleResult();
			}catch (NoResultException noResultException){
				lOGGER.debug("No hay personas con idContadorPublico="+cveIdCpa);
			}	
        return rst;
        
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
