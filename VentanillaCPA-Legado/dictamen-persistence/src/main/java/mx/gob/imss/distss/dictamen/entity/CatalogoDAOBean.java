package mx.gob.imss.distss.dictamen.entity;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import mx.gob.imss.distss.dictamen.interfaces.CatalogoDAOLocal;
import mx.gob.imss.distss.dictamen.modelo.entidad.DicDelegacion;
import mx.gob.imss.distss.dictamen.modelo.entidad.DicSubdelegacion;
import mx.gob.imss.distss.dictamen.service.repository.AbstractRepository;

/**
 * Session Bean implementation class CatalogoDAOBean
 */
@Stateless
public class CatalogoDAOBean extends AbstractRepository implements CatalogoDAOLocal{

	@SuppressWarnings("unchecked")
	@Override
	public List<DicDelegacion> consultaDelegaciones() {
		Query query = this.entityManager
				.createNamedQuery("DicDelegacion.findAll");
		List<DicDelegacion> listaRegistros = query.getResultList();
		return listaRegistros;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DicSubdelegacion> consultaSubdelegacionPorIdDelegacion(
			Long idDelegacion) {
		Query query = this.entityManager.createQuery("from DicSubdelegacion a where a.dicDelegacion.cveIdDelegacion =:idDelegacion ");
        query.setParameter("idDelegacion", idDelegacion);
        return query.getResultList();
	}

}
