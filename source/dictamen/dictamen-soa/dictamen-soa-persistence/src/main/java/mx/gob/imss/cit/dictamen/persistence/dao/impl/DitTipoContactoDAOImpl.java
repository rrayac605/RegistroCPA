package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DitTipoContactoDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DitTipoContactoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DitTipoContactoDAOImpl extends AbstractBaseDAO<DitTipoContactoDO> implements DitTipoContactoDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public DitTipoContactoDAOImpl() {
		super(DitTipoContactoDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

