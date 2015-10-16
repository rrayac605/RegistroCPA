package mx.gob.imss.distss.dictamen.service.entity.v2;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdtColegio;
import mx.gob.imss.distss.dictamen.service.entity.GenericDaoImpl;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.ColegioServiceLocalV2;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name = "colegioServiceEntityV2", mappedName = "colegioServiceEntityV2")
public class ColegioServiceEntityV2 extends GenericDaoImpl<NdtColegio, Long> implements ColegioServiceLocalV2 {
	
	private static final Logger logger = LoggerFactory.getLogger(ColegioServiceEntityV2.class);
	
	public ColegioServiceEntityV2() {
		super(NdtColegio.class);
	}
	
	@Override
	public NdtColegio obtenerColegioRFC(String rfc) throws RuntimeException {
		NdtColegio ndtColegio = null;
		try {
			Criteria criteria = getSession().createCriteria(NdtColegio.class);
			criteria.add(Restrictions.like("rfc", rfc.toUpperCase()));
			ndtColegio = (NdtColegio) criteria.uniqueResult();
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener un Colegio de la Base de Datos.", ex);
			throw new RuntimeException("ERROR: Al obtener un Colegio de la Base de Datos.", ex);
		}
		return ndtColegio;
	}

}
