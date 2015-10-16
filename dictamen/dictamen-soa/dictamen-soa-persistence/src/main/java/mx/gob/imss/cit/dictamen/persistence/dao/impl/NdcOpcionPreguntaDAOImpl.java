package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdcOpcionPreguntaDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcOpcionPreguntaDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



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

