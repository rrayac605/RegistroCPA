package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DitPatronSujetoObligadoDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DitPatronSujetoObligadoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DitPatronGeneralDAOImpl extends AbstractBaseDAO<DitPatronSujetoObligadoDO> 
implements DitPatronSujetoObligadoDAO{
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public DitPatronGeneralDAOImpl() {
		super(DitPatronSujetoObligadoDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

