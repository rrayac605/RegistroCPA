package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtNotasDictamenDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtNotasDictamenDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtNotasDictamenDAOImpl extends AbstractBaseDAO<NdtNotasDictamenDO> implements NdtNotasDictamenDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtNotasDictamenDAOImpl() {
		super(NdtNotasDictamenDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

