package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.model.NdcRubroDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcRubroDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdcRubroDAOImpl extends AbstractBaseDAO<NdcRubroDO> implements NdcRubroDAO{
		/** The em. */
		@PersistenceContext(unitName = "DictamenPU")
		private EntityManager em;

		public NdcRubroDAOImpl() {
			super(NdcRubroDO.class);

		}

		@Override
		protected EntityManager getEntityManager() {
			return em;
		}

	}

