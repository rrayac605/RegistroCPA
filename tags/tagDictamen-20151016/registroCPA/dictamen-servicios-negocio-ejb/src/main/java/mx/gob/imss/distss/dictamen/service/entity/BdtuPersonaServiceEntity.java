package mx.gob.imss.distss.dictamen.service.entity;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersona;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuPersonaServiceLocal;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name = "bdtuPersonaServiceEntity", mappedName = "bdtuPersonaServiceEntity")
public class BdtuPersonaServiceEntity extends GenericDaoImpl<DitPersona, Long> implements BdtuPersonaServiceLocal {
	
	private static final Logger logger = LoggerFactory.getLogger(BdtuPersonaServiceEntity.class);
	
	@Override
	public DitPersona obtenerPersonaPorCurp(String cupr) {
		DitPersona ditPersona = null;
		try {
			Criteria criteria = getSession().createCriteria(DitPersona.class);
			criteria.add(Restrictions.eq("curp", cupr));
			criteria.addOrder(Order.desc("cveIdPersona"));
			ditPersona = (DitPersona) criteria.setFirstResult(0).setMaxResults(1).uniqueResult();
		} catch (Exception ex) {
			logger.info("Error al obtener a una Persona de la base de datos.", ex);
			throw new RuntimeException("Error al obtener a una Persona de la base de datos.", ex);
		}
		return ditPersona;
	}

}
