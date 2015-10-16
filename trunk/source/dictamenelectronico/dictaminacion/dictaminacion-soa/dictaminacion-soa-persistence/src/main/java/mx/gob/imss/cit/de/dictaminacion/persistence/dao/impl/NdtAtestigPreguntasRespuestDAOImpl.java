package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtAtestigPreguntasRespuestDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtAtestigPreguntasRespuestDAO;

@Stateless
public class NdtAtestigPreguntasRespuestDAOImpl extends AbstractBaseDAO<NdtAtestigPreguntasRespuestDO> implements NdtAtestigPreguntasRespuestDAO {
	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;
	
	public NdtAtestigPreguntasRespuestDAOImpl() {
		super(NdtAtestigPreguntasRespuestDO.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
}
