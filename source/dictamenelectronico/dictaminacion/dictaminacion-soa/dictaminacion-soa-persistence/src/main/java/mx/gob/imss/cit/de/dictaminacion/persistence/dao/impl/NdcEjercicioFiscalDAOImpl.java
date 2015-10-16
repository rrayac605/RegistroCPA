package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdcEjercicioFiscalDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdcEjercicioFiscalDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcEjercicioFiscalDAOImpl extends AbstractBaseDAO<NdcEjercicioFiscalDO> implements NdcEjercicioFiscalDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdcEjercicioFiscalDAOImpl() {
		super(NdcEjercicioFiscalDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

