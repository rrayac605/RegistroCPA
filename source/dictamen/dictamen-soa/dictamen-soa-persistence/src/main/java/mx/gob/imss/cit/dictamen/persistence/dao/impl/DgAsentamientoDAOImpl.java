package mx.gob.imss.cit.dictamen.persistence.dao.impl;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgAsentamientoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgAsentamientoDO;

@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgAsentamientoDAOImpl extends AbstractBaseDAO<DgAsentamientoDO> implements DgAsentamientoDAO{



	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgAsentamientoDAOImpl() {
		super(DgAsentamientoDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}



}
