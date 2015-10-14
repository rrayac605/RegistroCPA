package mx.gob.imss.cit.dictamen.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.dictamen.commons.to.LayoutTO;
import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.commons.to.domain.PatronDictamenTO;
import mx.gob.imss.cit.dictamen.model.NdcAseveracionesDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcAseveracionesDAO;
import mx.gob.imss.cit.dictamen.services.AseveracionService;

@Local
@Stateless
public class AseveracionServiceImpl implements AseveracionService {
	
	private Logger LOG=Logger.getLogger(AseveracionServiceImpl.class) ;
	
	@EJB
	private NdcAseveracionesDAO ndcAseveracionesDAO;
	
	@Override
	public List<ParentLayoutTO> findAseveraciones(PatronDictamenTO patronDictamenTO){
		List<ParentLayoutTO> listaParentLayout=new ArrayList<ParentLayoutTO>();
		ParentLayoutTO parentLayoutTO;
		LayoutTO layoutTO;
		
		List<NdcAseveracionesDO> ndcAsevercionesDO = null;
		List<NdcAseveracionesDO> ndcAsevercionesFiltrada = new ArrayList<NdcAseveracionesDO>();
		LOG.info("consultando aseveraciones");
		ndcAsevercionesDO = ndcAseveracionesDAO.findAll();
		
		short esObras=0;
		if(patronDictamenTO.getIndPatronConstruccion().equals((short)1) || patronDictamenTO.getIndRealizoActConstruccion().equals((short)1)){
			esObras=1;
		}
		
		if(esObras==1){
			for (NdcAseveracionesDO  ndcAseveracionesDO: ndcAsevercionesDO) {
				if(ndcAseveracionesDO.getIndConstruccion()==null || ndcAseveracionesDO.getIndConstruccion()==1){
					ndcAsevercionesFiltrada.add(ndcAseveracionesDO);
				}
				
			}
		}else{
			ndcAsevercionesFiltrada.addAll(ndcAsevercionesDO);
		}
		
		
		LOG.info("armando lista layout");
		Map<NdcAseveracionesDO, ArrayList<NdcAseveracionesDO>> tree  = new HashMap<NdcAseveracionesDO,ArrayList<NdcAseveracionesDO>>();
		Map<Long, NdcAseveracionesDO> roots  = new HashMap<Long,NdcAseveracionesDO>();
		for(NdcAseveracionesDO n : ndcAsevercionesFiltrada) {
		  if(n.getCveIdAseveracionPadre() == null){
			  roots.put(n.getCveIdAseveracion(), n);
		  }else {
		    if(!tree.containsKey(n.getCveIdAseveracionPadre())){
		    	tree.put(n.getCveIdAseveracionPadre(), new ArrayList<NdcAseveracionesDO>());
		    }				      
		    tree.get(n.getCveIdAseveracionPadre()).add(n);
		  }
		}
		for (Map.Entry<NdcAseveracionesDO, ArrayList<NdcAseveracionesDO>> entry: tree.entrySet()){
			parentLayoutTO = new ParentLayoutTO();
			parentLayoutTO.setName(entry.getKey().getDesTipoAseveracion());
			parentLayoutTO.setListaLayout(new ArrayList<LayoutTO>());
			for (NdcAseveracionesDO aseveracion: entry.getValue()){
				layoutTO = new LayoutTO();
				layoutTO.setName(aseveracion.getDesTipoAseveracion());
				layoutTO.setIdLayout(aseveracion.getCveIdAseveracion());
				parentLayoutTO.getListaLayout().add(layoutTO);
			}
			listaParentLayout.add(parentLayoutTO);
		}
		return listaParentLayout;
	}


	
}
