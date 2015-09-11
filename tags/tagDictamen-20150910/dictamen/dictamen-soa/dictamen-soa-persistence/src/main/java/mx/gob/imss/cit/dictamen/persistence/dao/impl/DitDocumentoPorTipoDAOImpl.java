package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DitDocumentoPorTipoDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DitDocumentoPorTipoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DitDocumentoPorTipoDAOImpl extends AbstractBaseDAO<DitDocumentoPorTipoDO>
implements DitDocumentoPorTipoDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public DitDocumentoPorTipoDAOImpl() {
		super(DitDocumentoPorTipoDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

