package mx.gob.imss.distss.dictamen.service.entity.v2;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.entidad.NdtDespachos;
import mx.gob.imss.distss.dictamen.service.entity.GenericDaoImpl;
import mx.gob.imss.distss.dictamen.service.interfaces.v2.DespachoServiceLocalV2;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name = "despachoServiceEntityV2", mappedName = "despachoServiceEntityV2")
public class DespachoServiceEntityV2 extends GenericDaoImpl<NdtDespachos, Long> implements DespachoServiceLocalV2 {
	
	private static final Logger logger = LoggerFactory.getLogger(DespachoServiceEntityV2.class);
	
	public DespachoServiceEntityV2() {
		super(NdtDespachos.class);
	}
	
	@Override
	public NdtDespachos obtenerDespachoRFC(String rfc) throws RuntimeException {
		NdtDespachos ndtDespacho = null;
		try {
			Criteria criteria = getSession().createCriteria(NdtDespachos.class);
			criteria.add(Restrictions.like("rfc", rfc.toUpperCase()));
			ndtDespacho = (NdtDespachos) criteria.uniqueResult();
		} catch (Exception ex) {
			logger.info("ERROR: al obtener el Despachos de la base de datos.", ex);
			throw new RuntimeException("ERROR: al obtener el Despachos de la base de datos.", ex);
		}
		return ndtDespacho;
	}

}
