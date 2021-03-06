package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtR1DatosPersonalesDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtR1DatosPersonalesDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtR1DatosPersonalesDAOImpl extends AbstractBaseDAO<NdtR1DatosPersonalesDO> implements NdtR1DatosPersonalesDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtR1DatosPersonalesDAOImpl() {
		super(NdtR1DatosPersonalesDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

