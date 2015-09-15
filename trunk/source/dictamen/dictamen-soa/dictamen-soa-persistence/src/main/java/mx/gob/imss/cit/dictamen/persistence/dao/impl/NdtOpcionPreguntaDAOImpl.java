package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdtOpcionPreguntaDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtOpcionPreguntaDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtOpcionPreguntaDAOImpl extends AbstractBaseDAO<NdtOpcionPreguntaDO> implements NdtOpcionPreguntaDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtOpcionPreguntaDAOImpl() {
		super(NdtOpcionPreguntaDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}

