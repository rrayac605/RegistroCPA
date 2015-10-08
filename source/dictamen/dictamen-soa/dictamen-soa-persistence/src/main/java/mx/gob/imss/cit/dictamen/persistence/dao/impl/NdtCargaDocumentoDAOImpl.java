package mx.gob.imss.cit.dictamen.persistence.dao.impl;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.gob.imss.cit.dictamen.model.NdtCargaDocumentoDO;
import mx.gob.imss.cit.dictamen.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdtCargaDocumentoDAO;
import mx.gob.imss.cit.dictamen.persistence.util.ExceptionHandlerDAOInterceptor;



@Stateless
@Interceptors({ ExceptionHandlerDAOInterceptor.class })
public class NdtCargaDocumentoDAOImpl extends AbstractBaseDAO<NdtCargaDocumentoDO> implements NdtCargaDocumentoDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;

	public NdtCargaDocumentoDAOImpl() {
		super(NdtCargaDocumentoDO.class);

	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	@Override
	public NdtCargaDocumentoDO findByCveIdPatronDictamen(NdtCargaDocumentoDO entity) {
		NdtCargaDocumentoDO rst = null;
		Query q = null;
		q = em.createNamedQuery("NdtCargaDocumentoDO.findByCveIdPatronDictamenAndCveIdAseveracion");
		q.setParameter("cveIdPatronDictamen", entity.getCveIdPatronDictamen().getCveIdPatronDictamen());
		q.setParameter("cveIdAseveracion", entity.getCveIdAseveracion().getCveIdAseveracion());
		try{
			rst = (NdtCargaDocumentoDO)q.getSingleResult();
			return rst;
		}catch (NoResultException e){
			return null;
		}		
	}

}

