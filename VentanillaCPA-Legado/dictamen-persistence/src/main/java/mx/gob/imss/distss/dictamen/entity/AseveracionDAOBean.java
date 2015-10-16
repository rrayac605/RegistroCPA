package mx.gob.imss.distss.dictamen.entity;

import javax.ejb.Stateless;

import javax.persistence.Query;

import mx.gob.imss.distss.dictamen.table.model.DescriptorCampo;
import mx.gob.imss.distss.dictamen.table.model.DescriptorTabla;
import mx.gob.imss.distss.dictamen.table.model.Pagina;
import mx.gob.imss.distss.dictamen.table.model.Paginacion;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import mx.gob.imss.distss.dictamen.interfaces.AseveracionDAOLocal;
import mx.gob.imss.distss.dictamen.model.abstr.AbstractModel;
import mx.gob.imss.distss.dictamen.service.repository.AbstractRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Stateless
public class AseveracionDAOBean<T extends AbstractModel> extends AbstractRepository implements AseveracionDAOLocal<T> {

	private static final Log LOGGER = LogFactory.getLog(AseveracionDAOBean.class);

	@Override
	public Pagina getPagina(Paginacion paginacion){
		LOGGER.debug("se construira consulta para pagina de entidad "+ paginacion.getClassEntity().getName());
		StringBuilder consulta=new StringBuilder();
		StringBuilder stringQueryCount=new StringBuilder();
		consulta.append(" FROM "+ paginacion.getClassEntity().getSimpleName()+" tabla");
		stringQueryCount.append("SELECT count(tabla) FROM " + paginacion.getClassEntity().getSimpleName() + " tabla");
		/*construcción de consulta para filtros*/
		if(paginacion.getFiltros()!=null && !paginacion.getFiltros().isEmpty()){
			consulta.append(" WHERE ");
			stringQueryCount.append(" WHERE ");
			int s=0;
			for(String key: paginacion.getFiltros().keySet()){
				consulta.append(" tabla."+key+" LIKE '%"+ paginacion.getFiltros().get(key).toString()+"%' ");
				stringQueryCount.append(" tabla." + key + " LIKE '%" + paginacion.getFiltros().get(key).toString() + "%' ");
				if((++s)< paginacion.getFiltros().size()-1){
					consulta.append(" AND ");
					stringQueryCount.append(" AND ");
				}
			}
		}
		LOGGER.debug("se ha generado consulta con valor = " + consulta.toString());
		LOGGER.debug("ejecutando consulta..");
		Query query=entityManager.createQuery(consulta.toString());
        Query queryCount=entityManager.createQuery(stringQueryCount.toString());

		Pagina<AbstractModel> pagina=new Pagina<AbstractModel>();
		query.setFirstResult(paginacion.getRegistroInicial());
		query.setMaxResults(paginacion.getTamanioPagina());
        pagina.setTotalRegistros(((Long)queryCount.getSingleResult()).intValue());
		pagina.setRegistros(query.getResultList());
		LOGGER.debug("consulta ejecutada satisfactoriamente con un total de registros por pagina = " + pagina.getRegistros().size());
		return pagina;
	}

    @Override
    public Map<String, Double> getSumatoria(DescriptorTabla descriptorTabla) {
        if (!descriptorTabla.containsSumatorias())return null;
        LOGGER.debug("se construira consulta para pagina de entidad " + descriptorTabla.getClassEntity().getName());
        String stringQuerySum="SELECT ${sum} FROM "+descriptorTabla.getClassEntity().getSimpleName()+" tabla";
        StringBuilder stringQueryField=new StringBuilder();
        HashMap<String,Double> result=new HashMap<String, Double>();
        ArrayList<String> c=new ArrayList<String>();
        for (int i=0;i<descriptorTabla.getCampos().size();i++){
            DescriptorCampo campo=descriptorTabla.getCampos().get(i);
            if (campo.isSumatoria()) {
                stringQueryField.append("sum(tabla." +campo.getClave()+ "),");
                c.add(campo.getClave());
                result.put(campo.getClave(), 0.0);
            }
        }
        stringQuerySum=stringQuerySum.replaceAll("\\$\\{sum\\}", stringQueryField.toString().replaceAll(",$",""));
        Query queryCount = entityManager.createQuery(stringQuerySum);
        List sumList=queryCount.getResultList();
        if (sumList!=null && !sumList.isEmpty()){
			Object row=sumList.get(0);
			if(row instanceof Object[]){
				Object[] a=(Object[])row;
				for (int i=0;i<a.length;i++){
					Object o=a[i];
					result.put(c.get(i),o!=null? Double.parseDouble(o.toString()):0.0);
				}
			}else{
				result.put(c.get(0), Double.parseDouble(row.toString()));
			}
        }

        return result;
    }

	/*
	@Override
	public List<T> consulta(T filtro,ConfigTablaAseveracion configuracion) {
		LOGGER.debug("se construirá consulta para entidad "+filtro.getClass().getSimpleName());
		StringBuilder consulta=new StringBuilder();
		consulta.append("FROM "+filtro.getClass().getSimpleName()+" tabla");
		//construcción de consulta para filtros
		if(configuracion.getFiltro()!=null && !configuracion.getFiltro().isEmpty()){
			consulta.append(" WHERE ");
			int s=0;
			for(CampoFiltroAseveracion fil:configuracion.getFiltro()){
				consulta.append(" tabla."+fil.getMapeoCampo()+" LIKE '%"+fil.getValorFiltro()+"%' ");
				s++;
				if(s<configuracion.getFiltro().size()-1){
					consulta.append(" AND ");
				}
			}
		}
		LOGGER.debug("se ha generado consulta con valor = " + consulta.toString());
		LOGGER.debug("ejecutando consulta..");
		Query query=entityManager.createQuery(consulta.toString());
		query.setFirstResult(configuracion.getRegistroInicial());
		query.setMaxResults(configuracion.getTamPagina());
		List listaRegistros=query.getResultList();
		LOGGER.debug("consulta ejecutada satisfactoriamente con un total de registros por pagina = " + listaRegistros.size());
		return listaRegistros;	
	}

	@Override
	public Long consultaTotalRegistros(T filtro, ConfigTablaAseveracion configuracionTabla) {
		LOGGER.debug("consultando total de registros existentes en la entidad "+filtro.getClass().getSimpleName());
		StringBuilder cons=new StringBuilder();
		cons.append("SELECT COUNT(*) FROM " + filtro.getClass().getSimpleName() + " tabla ");
		
		if(configuracionTabla.getFiltro()!=null && !configuracionTabla.getFiltro().isEmpty()){
			cons.append(" WHERE ");
			int s=0;
			for(CampoFiltroAseveracion fil:configuracionTabla.getFiltro()){
				cons.append(" tabla."+fil.getMapeoCampo()+" LIKE '%"+fil.getValorFiltro()+"%' ");
				s++;
				if(s<configuracionTabla.getFiltro().size()-1){
					cons.append(" AND ");
				}
			}
		}
		
		System.out.println("Count Filtro " + cons.toString());
		Query query = entityManager.createQuery(cons.toString());		
		LOGGER.debug("consulta ejecutada satisfactoriamente");
		return (Long) query.getSingleResult();
	}
    */

}
//Query query=entityManager.createNamedQuery(filtro.getClass().getSimpleName()+".findAll");
//EntityManagerImpl enMa=(EntityManagerImpl) entityManager.getDelegate();
//Session ses=(Session) enMa.getSession();
//ses.saveOrUpdate(filtro);
//ses.flush();
//System.out.println("Sesssssion  "+ses);