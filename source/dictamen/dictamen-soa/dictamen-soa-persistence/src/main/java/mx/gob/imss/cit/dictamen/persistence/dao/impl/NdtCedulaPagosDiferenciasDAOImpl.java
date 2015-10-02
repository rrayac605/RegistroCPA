package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtCedulaPagosDiferenciasDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtCedulaPagosDiferenciasDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtCedulaPagosDiferenciasDAOImpl extends AbstractBaseDAO<NdtCedulaPagosDiferenciasDO> implements NdtCedulaPagosDiferenciasDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtCedulaPagosDiferenciasDAOImpl() {
		super(NdtCedulaPagosDiferenciasDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
