package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.DitPatronGeneralDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DitPatronGeneralDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DitPatronGeneralDAOImpl extends AbstractBaseDAO<DitPatronGeneralDO> 
implements DitPatronGeneralDAO{
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public DitPatronGeneralDAOImpl() {
		super(DitPatronGeneralDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

