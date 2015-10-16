package mx.gob.imss.distss.dictamen.service.entity;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonafDomFiscal;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonamDomFiscal;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuDomicilioFicalServiceLocal;
import mx.gob.imss.distss.dictamen.service.repository.AbstractRespository;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name = "bdtuDomicilioFicalServiceEntity", mappedName = "bdtuDomicilioFicalServiceEntity")
public class BdtuDomicilioFicalServiceEntity extends AbstractRespository implements BdtuDomicilioFicalServiceLocal {
	
	private static final Logger logger = LoggerFactory.getLogger(BdtuDomicilioFicalServiceEntity.class);

	@Override
	public DitPersonafDomFiscal obtenerPersonaFDomFiscalPorIdDom(Long cveIdDomicilio) {
		DitPersonafDomFiscal ditPersonafDomFiscal = null;
		try {
			Criteria criteria = getSession().createCriteria(DitPersonafDomFiscal.class);
			criteria.add(Restrictions.eq("ditDomicilioSat.cveIdDomicilio", cveIdDomicilio));
			ditPersonafDomFiscal = (DitPersonafDomFiscal) criteria.setFirstResult(0).setMaxResults(1).uniqueResult();
		} catch (Exception ex) {
			logger.info("Error al obtener el domicilio fiscal de persona fisica de la base de datos.", ex);
			throw new RuntimeException("Error al obtener el domicilio fiscal de persona fisica de la base de datos.", ex);
		}
		return ditPersonafDomFiscal;
	}
	
	@Override
	public DitPersonafDomFiscal obtenerPersonaFDomFiscalPorId(Long cveIdPfdomFiscal) {
		DitPersonafDomFiscal ditPersonafDomFiscal = null;
		try {
			Criteria criteria = getSession().createCriteria(DitPersonafDomFiscal.class);
			criteria.add(Restrictions.eq("cveIdPfdomFiscal", cveIdPfdomFiscal));
			ditPersonafDomFiscal = (DitPersonafDomFiscal) criteria.setFirstResult(0).setMaxResults(1).uniqueResult();
		} catch (Exception ex) {
			logger.info("Error al obtener PersonaFDomFiscal fiscal de persona moral de la base de datos.", ex);
			throw new RuntimeException("Error al obtener PersonaFDomFiscal fiscal de persona moral de la base de datos.", ex);
		}
		return ditPersonafDomFiscal;
	}
	
	@Override
	public DitPersonamDomFiscal obtenerPersonamDomFiscalPorIdDom(Long cveIdDomicilio) {
		DitPersonamDomFiscal ditPersonamDomFiscal = null;
		try {
			Criteria criteria = getSession().createCriteria(DitPersonamDomFiscal.class);
			
			criteria.add(Restrictions.eq("ditDomicilioSat.cveIdDomicilio", cveIdDomicilio));
			ditPersonamDomFiscal = (DitPersonamDomFiscal) criteria.setFirstResult(0).setMaxResults(1).uniqueResult();
		} catch (Exception ex) {
			logger.info("Error al obtener el domicilio fiscal de persona moral de la base de datos.", ex);
			throw new RuntimeException("Error al obtener el domicilio fiscal de persona moral de la base de datos.", ex);
		}
		return ditPersonamDomFiscal;
	}

}
