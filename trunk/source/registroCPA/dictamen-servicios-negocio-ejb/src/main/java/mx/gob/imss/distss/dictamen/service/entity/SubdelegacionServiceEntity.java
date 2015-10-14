package mx.gob.imss.distss.dictamen.service.entity;

import java.util.List;

import javax.ejb.Stateless;

import mx.gob.imss.distss.dictamen.modelo.entidad.DicSubdelegacion;
import mx.gob.imss.distss.dictamen.service.interfaces.SubdelegacionServicesLocal;

import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

@Stateless(name = "subDelegacionEntity", mappedName = "subDelegacionEntity")
public class SubdelegacionServiceEntity extends GenericDaoImpl<DicSubdelegacion, Long> implements SubdelegacionServicesLocal {

		public SubdelegacionServiceEntity() {
			super(DicSubdelegacion.class);
		}

		@Override
		public List<DicSubdelegacion> getSubdelegacionByClaveDelegacion(long cveDelegacion) {
			@SuppressWarnings("unchecked")
			List<DicSubdelegacion> lista = getCriteria()
					.add(Restrictions.eq("dicDelegacion.cveIdDelegacion",cveDelegacion))
					.addOrder(Order.asc("desSubdelegacion")).list();
			return lista;
		}
		


}
