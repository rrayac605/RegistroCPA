package mx.gob.imss.distss.dictamen.service.entity;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.entidad.DitFormaContacto;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonafContacto;
import mx.gob.imss.distss.dictamen.modelo.entidad.DitPersonamContacto;
import mx.gob.imss.distss.dictamen.service.interfaces.BdtuMediosContactoServiceLocal;
import mx.gob.imss.distss.dictamen.service.repository.AbstractRespository;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name = "bdtuMediosContactoServiceEntity", mappedName = "bdtuMediosContactoServiceEntity")
public class BdtuMediosContactoServiceEntity extends AbstractRespository implements BdtuMediosContactoServiceLocal {
	
	private static final Logger logger = LoggerFactory.getLogger(BdtuMediosContactoServiceEntity.class);
	
	@Override
	public DitPersonafContacto obtenerPersonafContacto(Long cveIdFormaContacto) {
		DitPersonafContacto ditPersonafContacto = null;
		try {
			Criteria criteria = getSession().createCriteria(DitPersonafContacto.class);
			criteria.add(Restrictions.eq("cveIdFormaContacto", cveIdFormaContacto));
			ditPersonafContacto = (DitPersonafContacto) criteria.setFirstResult(0).setMaxResults(1).uniqueResult();
		} catch (Exception ex) {
			logger.info("Error al obtener a PersonafContacto de la base de datos.", ex);
			throw new RuntimeException("Error al obtener a PersonafContacto de la base de datos.", ex);
		}
		return ditPersonafContacto;
	}
	
	@Override
	public DitPersonamContacto obtenerPersonamContacto(Long cveIdFormaContacto) {
		DitPersonamContacto ditPersonamContacto = null;
		try {
			Criteria criteria = getSession().createCriteria(DitPersonamContacto.class);
			criteria.add(Restrictions.eq("cveIdFormaContacto", cveIdFormaContacto));
			ditPersonamContacto = (DitPersonamContacto) criteria.setFirstResult(0).setMaxResults(1).uniqueResult();
		} catch (Exception ex) {
			logger.info("Error al obtener a PersonamContacto de la base de datos.", ex);
			throw new RuntimeException("Error al obtener a PersonamContacto de la base de datos.", ex);
		}
		return ditPersonamContacto;
	}
	
	@Override
	public DitPersonafContacto obtenerPersonafContactoPorId(Long cveIdPersonafContacto) {
		DitPersonafContacto ditPersonafContacto = null;
		try {
			Criteria criteria = getSession().createCriteria(DitPersonafContacto.class);
			criteria.add(Restrictions.eq("cveIdPersonafContacto", cveIdPersonafContacto));
			ditPersonafContacto = (DitPersonafContacto) criteria.setFirstResult(0).setMaxResults(1).uniqueResult();
		} catch (Exception ex) {
			logger.info("Error al obtener a PersonafContacto por cveIdPersonafContacto de la base de datos.", ex);
			throw new RuntimeException("Error al obtener a PersonafContacto por cveIdPersonafContacto de la base de datos.", ex);
		}
		return ditPersonafContacto;
	}
	
	@Override
	public DitPersonamContacto obtenerPersonamContactoPorId(Long cveIdPersonamContacto) {
		DitPersonamContacto ditPersonamContacto = null;
		try {
			Criteria criteria = getSession().createCriteria(DitPersonamContacto.class);
			criteria.add(Restrictions.eq("cveIdPersonamContacto", cveIdPersonamContacto));
			ditPersonamContacto = (DitPersonamContacto) criteria.setFirstResult(0).setMaxResults(1).uniqueResult();
		} catch (Exception ex) {
			logger.info("Error al obtener a PersonafContacto por cveIdPersonafContacto de la base de datos.", ex);
			throw new RuntimeException("Error al obtener a PersonafContacto por cveIdPersonafContacto de la base de datos.", ex);
		}
		return ditPersonamContacto;
	}
	
	@Override
	public DitFormaContacto obtenerFormaContactoPorId(Long cveIdFormaContacto) {
		DitFormaContacto ditFormaContacto = null;
		try {
			Criteria criteria = getSession().createCriteria(DitFormaContacto.class);
			criteria.add(Restrictions.eq("cveIdFormaContacto", cveIdFormaContacto));
			ditFormaContacto = (DitFormaContacto) criteria.setFirstResult(0).setMaxResults(1).uniqueResult();
		} catch (Exception ex) {
			logger.info("Error al obtener a PersonafContacto de la base de datos.", ex);
			throw new RuntimeException("Error al obtener a PersonafContacto de la base de datos.", ex);
		}
		return ditFormaContacto;
	}
	
	@Override
	public DitFormaContacto actualizaMedioContacto(DitFormaContacto ditFormaContacto) {
		try {
			getSession().saveOrUpdate(ditFormaContacto);
			getSession().flush();
		} catch (Exception ex) {
			logger.info("ERROR: actualizar el medio de contacto en la base de datos.", ex);
			throw new RuntimeException("ERROR: actualizar el medio de contacto en la base de datos.", ex);
		}
		return ditFormaContacto;
	}

}
