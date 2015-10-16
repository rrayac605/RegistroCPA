package mx.gob.imss.distss.dictamen.entity;

import javax.ejb.Stateless;
import javax.persistence.Query;

import mx.gob.imss.distss.dictamen.interfaces.ColegioDAOLocal;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdvColegios;
import mx.gob.imss.distss.dictamen.service.repository.AbstractRepository;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.ejb.EntityManagerImpl;

/**
 * Session Bean implementation class ColegioDAOBean
 */
@Stateless
public class ColegioDAOBean extends AbstractRepository implements ColegioDAOLocal{

	@SuppressWarnings("unchecked")
	@Override
	public Pagina<NdvColegios> consultaColegio(Paginacion paginacion) {

		StringBuilder stringQueryCount = new StringBuilder();
		stringQueryCount
				.append("SELECT count(tabla) FROM NdvColegios tabla ");
		/* construcción de consulta para filtros */

		Pagina<NdvColegios> pagina = new Pagina<NdvColegios>();

		EntityManagerImpl enMa = (EntityManagerImpl) entityManager
				.getDelegate();
		Session ses = (Session) enMa.getSession();

		Criteria crit = ses.createCriteria(NdvColegios.class);
		crit.setFirstResult(paginacion.getRegistroInicial());
		crit.setMaxResults(paginacion.getTamanioPagina());

		if (paginacion.getFiltros() != null
				&& !paginacion.getFiltros().isEmpty()) {

			stringQueryCount.append(" WHERE 1 = 1 ");

			if (paginacion.getFiltros().get("globalFilter") != null
					&& !paginacion.getFiltros().get("globalFilter").isEmpty()) {

				String[] separaNombre;

				separaNombre = paginacion.getFiltros().get("globalFilter")
						.split(" ");

				for (int i = 0; i < separaNombre.length; i++) {
					stringQueryCount.append(" and ");
					crit.add(Restrictions.like("denominacionRazonSocial", "%" + separaNombre[i]
							+ "%"));
					stringQueryCount.append(" tabla.denominacionRazonSocial like " + "'%"
							+ separaNombre[i] + "%' ");
				}

			}
		}
		crit.addOrder(Order.asc("denominacionRazonSocial"));
		Query queryCount = entityManager.createQuery(stringQueryCount
				.toString());

		pagina.setRegistros(crit.list());
		pagina.setTotalRegistros(((Long) queryCount.getSingleResult())
				.intValue());

		return pagina;
	}


}
