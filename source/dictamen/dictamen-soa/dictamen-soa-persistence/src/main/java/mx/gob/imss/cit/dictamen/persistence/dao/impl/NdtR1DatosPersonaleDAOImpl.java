package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtR1DatosPersonaleDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtR1DatosPersonaleDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtR1DatosPersonaleDAOImpl extends AbstractBaseDAO<NdtR1DatosPersonaleDO>
implements NdtR1DatosPersonaleDAO{
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtR1DatosPersonaleDAOImpl() {
		super(NdtR1DatosPersonaleDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

