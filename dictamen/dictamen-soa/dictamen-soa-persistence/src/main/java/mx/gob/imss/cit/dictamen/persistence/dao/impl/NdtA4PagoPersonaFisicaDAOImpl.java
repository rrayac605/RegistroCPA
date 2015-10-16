package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtA4PagoPersonaFisicaDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtA4PagoPersonaFisicaDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtA4PagoPersonaFisicaDAOImpl extends AbstractBaseDAO<NdtA4PagoPersonaFisicaDO> implements NdtA4PagoPersonaFisicaDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtA4PagoPersonaFisicaDAOImpl() {
		super(NdtA4PagoPersonaFisicaDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

