package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdcOpcionPreguntaDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdcOpcionPreguntaDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcOpcionPreguntaDAOImpl extends AbstractBaseDAO<NdcOpcionPreguntaDO> implements NdcOpcionPreguntaDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdcOpcionPreguntaDAOImpl() {
		super(NdcOpcionPreguntaDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

