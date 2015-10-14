package mx.gob.imss.distss.dictamen.service.entity.v2;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdtContadorPublicoAut;
import mx.gob.imss.distss.dictamen.service.entity.GenericDaoImpl;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ContadorPublicoServiceLocalV2;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name = "contadorPublicoServiceEntityV2", mappedName = "contadorPublicoServiceEntityV2")
public class ContadorPublicoServiceEntityV2 extends GenericDaoImpl<NdtContadorPublicoAut, Long> implements ContadorPublicoServiceLocalV2 {
	
	private static final Logger logger = LoggerFactory.getLogger(ContadorPublicoServiceEntityV2.class);
	
	@Override
	public NdtContadorPublicoAut obtenerContadorPorIdPersona(Long idPersona) {
		NdtContadorPublicoAut ndtContadorPublicoAut = null;
		try {
			Criteria criteria = getSession().createCriteria(NdtContadorPublicoAut.class);
			criteria.add(Restrictions.eq("cveIdPersona", idPersona));
			criteria.add(Restrictions.isNull("fecRegistroBaja"));
			ndtContadorPublicoAut = (NdtContadorPublicoAut) criteria.uniqueResult();
		} catch (Exception ex) {
			logger.info("Error al obtener la informaci\u00f3n del contador p\u00fablico autorizado de la base de datos.", ex);
			throw new RuntimeException("Error al obtener la informaci\u00f3n del contador p\u00fablico autorizado de la base de datos.", ex);
		}
		return ndtContadorPublicoAut;
	}

}
