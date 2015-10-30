package mx.gob.imss.cit.de.dictaminacion.persistence.dao.impl;

import javax.ejb.Stateless;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.de.dictaminacion.model.NdtRubroAtestiguamientoDictDO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.AbstractBaseDAO;
import mx.gob.imss.cit.de.dictaminacion.persistence.dao.NdtRubroAtestiguamientoDictDAO;

@Stateless
public class NdtRubroAtestiguamientoDictDAOImpl extends AbstractBaseDAO<NdtRubroAtestiguamientoDictDO> implements NdtRubroAtestiguamientoDictDAO {

	/** The em. */
	@PersistenceContext(unitName = "DictamenPU")
	private EntityManager em;
	
	public NdtRubroAtestiguamientoDictDAOImpl() {
		super(NdtRubroAtestiguamientoDictDO.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

}
