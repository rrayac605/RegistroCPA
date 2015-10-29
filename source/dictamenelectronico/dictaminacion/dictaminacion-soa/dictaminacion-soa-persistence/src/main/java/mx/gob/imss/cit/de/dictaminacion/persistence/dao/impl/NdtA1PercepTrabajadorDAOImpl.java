package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.gob.imss.cit.de.dictaminacion.model.NdcAtestiguamientoDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtA1PercepTrabajadorDO;
import mx.gob.imss.cit.de.dictaminacion.model.NdtPatronDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA1PercepTrabajadorDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA1PercepTrabajadorDAOImpl extends AbstractBaseDAO<NdtA1PercepTrabajadorDO> implements NdtA1PercepTrabajadorDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA1PercepTrabajadorDAOImpl() {
		super(NdtA1PercepTrabajadorDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	/**
	 * Obtiene lista de NdtA1PercepTrabajadorDO
	 */
	@Override
	public Long findTotalImporte(NdtPatronDictamenDO cveIdPatronDictamen,String campo) {
		
			Long totalImporte;
			String sqlString = "SELECT n."+campo+" FROM NdtA1PercepTrabajadorDO n WHERE n.cveIdPatronDictamen = :cveIdPatronDictamen and n.isTotal = :isTotal";
			Query q = em.createQuery(sqlString);
			q.setParameter("cveIdPatronDictamen", cveIdPatronDictamen);
			q.setParameter("isTotal", 1);
			try{
			totalImporte=(Long) q.getResultList().get(0);
			
			}catch (NoResultException e){
				return null;
			}
			
			return totalImporte;
		
	}

}

