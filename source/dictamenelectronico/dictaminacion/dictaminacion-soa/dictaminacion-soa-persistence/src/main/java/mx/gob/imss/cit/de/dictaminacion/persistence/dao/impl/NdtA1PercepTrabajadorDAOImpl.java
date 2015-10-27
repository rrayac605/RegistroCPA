package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	public List<NdtA1PercepTrabajadorDO> findByCveIdPatronDictamen(NdtPatronDictamenDO cveIdPatronDictamen) {
		
		List<NdtA1PercepTrabajadorDO> list = null;
	
		Query q = null;
		q = em.createNamedQuery("NdtA1PercepTrabajadorDO.findByCveIdPatronDictamen");
		q.setParameter("cveIdPatronDictamen", cveIdPatronDictamen);

		list = (List<NdtA1PercepTrabajadorDO>)q.getResultList();

		return list;
	}

}

