package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DitFormaMigratoriaDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DitFormaMigratoriaDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DitFormaMigratoriaDAOImpl extends AbstractBaseDAO<DitFormaMigratoriaDO>
implements DitFormaMigratoriaDAO{
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public DitFormaMigratoriaDAOImpl() {
		super(DitFormaMigratoriaDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

