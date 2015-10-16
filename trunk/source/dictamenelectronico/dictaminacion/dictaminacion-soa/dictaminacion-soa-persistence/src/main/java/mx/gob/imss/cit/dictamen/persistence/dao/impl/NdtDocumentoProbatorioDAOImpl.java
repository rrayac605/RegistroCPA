package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtDocumentoProbatorioDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtDocumentoProbatorioDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtDocumentoProbatorioDAOImpl extends AbstractBaseDAO<NdtDocumentoProbatorioDO> implements NdtDocumentoProbatorioDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtDocumentoProbatorioDAOImpl() {
		super(NdtDocumentoProbatorioDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

