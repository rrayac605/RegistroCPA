package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.DgCatMunicipioDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;
import mx.gob.imss.cit.dictamen.model.DgCatMunicipioDO;


@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class DgCatMunicipioDAOImpl extends AbstractBaseDAO<DgCatMunicipioDO> implements DgCatMunicipioDAO {


	  /** The em. */
    @PersistenceContext(unitName = "DictamenPU")
    private EntityManager em;
	
    
	public DgCatMunicipioDAOImpl() {
		super(DgCatMunicipioDO.class);
	
	}
	

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}


	@Override
	public void create(DgCatMunicipioDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void edit(DgCatMunicipioDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(DgCatMunicipioDO entity) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public DgCatMunicipioDO get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
