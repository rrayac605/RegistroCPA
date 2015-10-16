package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtA1PercepTrabajadorDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtA1PercepTrabajadorDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



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

}

