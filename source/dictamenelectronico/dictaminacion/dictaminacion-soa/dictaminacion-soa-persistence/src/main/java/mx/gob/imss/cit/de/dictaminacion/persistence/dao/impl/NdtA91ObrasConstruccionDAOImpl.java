package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA91ObrasConstruccionDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA91ObrasConstruccionDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA91ObrasConstruccionDAOImpl extends AbstractBaseDAO<NdtA91ObrasConstruccionDO> implements NdtA91ObrasConstruccionDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA91ObrasConstruccionDAOImpl() {
		super(NdtA91ObrasConstruccionDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

