package mx.gob.imss.cit.dictamen.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.to.LayoutTO;
import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.model.NdcAseveracionesDO;
import mx.gob.imss.cit.dictamen.persistence.dao.NdcAseveracionesDAO;
import mx.gob.imss.cit.dictamen.services.LayoutService;

@Local
@Stateless
public class LayoutServiceImpl implements LayoutService {
	
	@EJB
	NdcAseveracionesDAO ndcAseveracionesDAO;
	
	@Override
	public List<ParentLayoutTO> createList(){
		List<ParentLayoutTO> listaParentLayout=new ArrayList<ParentLayoutTO>();
		ParentLayoutTO parentLayoutTO;
		LayoutTO layoutTO;
		
		List<NdcAseveracionesDO> ndcAsevercionesDO = new ArrayList<NdcAseveracionesDO>();
		ndcAsevercionesDO = ndcAseveracionesDAO.findAll();
		
		Map<NdcAseveracionesDO, ArrayList<NdcAseveracionesDO>> tree  = new HashMap<NdcAseveracionesDO,ArrayList<NdcAseveracionesDO>>();
		Map<Long, NdcAseveracionesDO> roots  = new HashMap<Long,NdcAseveracionesDO>();
		for(NdcAseveracionesDO n : ndcAsevercionesDO) {
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
