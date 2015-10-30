package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtA921PersSubcontratadoDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtA921PersSubcontratadoDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA921PersSubcontratadoDAOImpl extends AbstractBaseDAO<NdtA921PersSubcontratadoDO> implements NdtA921PersSubcontratadoDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA921PersSubcontratadoDAOImpl() {
		super(NdtA921PersSubcontratadoDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

