package mx.gob.imss.distss.dictamen.entity;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import mx.gob.imss.distss.dictamen.interfaces.ContadorPublicoDAOLocal;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdcEstadoCpa;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtContadorPublicoAut;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdtCpaEstatus;
import mx.gob.imss.distss.dictamen.modelo.entidad.NdvContadorPublicoAut;
import mx.gob.imss.distss.dictamen.service.repository.AbstractRepository;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.ejb.EntityManagerImpl;

/**
 * Session Bean implementation class ContadorPublicoDAOBean
 */
@Stateless
public class ContadorPublicoDAOBean extends AbstractRepository implements
		ContadorPublicoDAOLocal {

	@SuppressWarnings("unchecked")
	@Override
	public Pagina<NdvContadorPublicoAut> consultaContador(Paginacion paginacion) {

		StringBuilder stringQueryCount = new StringBuilder();
		stringQueryCount
				.append("SELECT count(tabla) FROM NdvContadorPublicoAut tabla ");
		/* construcción de consulta para filtros */

		Pagina<NdvContadorPublicoAut> pagina = new Pagina<NdvContadorPublicoAut>();

		EntityManagerImpl enMa = (EntityManagerImpl) entityManager
				.getDelegate();
		Session ses = (Session) enMa.getSession();

		Criteria crit = ses.createCriteria(NdvContadorPublicoAut.class);
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
					crit.add(Restrictions.like("nombre", "%" + separaNombre[i]
							+ "%"));
					stringQueryCount.append(" tabla.nombre like " + "'%"
							+ separaNombre[i] + "%' ");
				}

			}
			if (paginacion.getFiltros().get("ndcEstadoCpa.desEstadoCpa") != null
					&& !paginacion.getFiltros()
							.get("ndcEstadoCpa.desEstadoCpa").isEmpty()) {

				crit.add(Restrictions.eq("desEstadoCpa", paginacion
						.getFiltros().get("ndcEstadoCpa.desEstadoCpa")));

				stringQueryCount.append(" and ");
				stringQueryCount.append(" tabla.desEstadoCpa = '"
						+ paginacion.getFiltros().get(
								"ndcEstadoCpa.desEstadoCpa") + "' ");
			}
		}
		crit.addOrder(Order.asc("nombre"));
		Query queryCount = entityManager.createQuery(stringQueryCount
				.toString());

		pagina.setRegistros(crit.list());
		pagina.setTotalRegistros(((Long) queryCount.getSingleResult())
				.intValue());

		return pagina;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<NdcEstadoCpa> catalogoEstadoContador() {
		Query query = this.entityManager
				.createNamedQuery("NdcEstadoCpa.findAll");
		List<NdcEstadoCpa> listaRegistros = query.getResultList();
		return listaRegistros;
	}
	
	@Override
	public NdtContadorPublicoAut consultaContadorNumReg(Long numRegistro){
            Query query = this.entityManager.createQuery("from NdtContadorPublicoAut a where a.numRegistroCpa=:numRegistro " +
                    "order by a.cveIdCpa desc");
            query.setParameter("numRegistro", numRegistro);
		return  (NdtContadorPublicoAut) query.getSingleResult();
	}
	
	@Override
	public void actualizaContador(NdtContadorPublicoAut ndtContadorPublicoAut){
		EntityManagerImpl enMa=(EntityManagerImpl) entityManager.getDelegate();
		Session ses=(Session) enMa.getSession();
		ses.saveOrUpdate(ndtContadorPublicoAut);
		ses.flush();
	}
	
	@Override
	public void actualizaEstatus(NdtCpaEstatus ndtCpaEstatus){
		EntityManagerImpl enMa=(EntityManagerImpl) entityManager.getDelegate();
		Session ses=(Session) enMa.getSession();
		ses.saveOrUpdate(ndtCpaEstatus);
		ses.flush();
	}

	@Override
	public Long obtieneUltimoNumRegCPA() {
		
		EntityManagerImpl enMa = (EntityManagerImpl) entityManager
				.getDelegate();
		Session ses = (Session) enMa.getSession();

		Criteria crit = ses.createCriteria(NdvContadorPublicoAut.class).setProjection(Projections.max("numRegistroCpa"));
		
		Long max = (Long)crit.uniqueResult();
		
		return max;
	}

	@Override
	public NdtContadorPublicoAut consultaContadorIdCPA(Long idCPA) {
		Query query = this.entityManager.createQuery("from NdtContadorPublicoAut a where a.cveIdCpa=:idCPA " +
                "order by a.cveIdCpa desc");
        query.setParameter("idCPA", idCPA);
	return  (NdtContadorPublicoAut) query.getSingleResult();
	}

}
