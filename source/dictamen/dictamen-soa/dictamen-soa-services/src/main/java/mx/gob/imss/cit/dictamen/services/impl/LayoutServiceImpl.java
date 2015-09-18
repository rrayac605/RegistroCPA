package mx.gob.imss.cit.dictamen.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.commons.to.LayoutTO;
import mx.gob.imss.cit.dictamen.commons.to.ParentLayoutTO;
import mx.gob.imss.cit.dictamen.services.LayoutService;

@Local
@Stateless
public class LayoutServiceImpl implements LayoutService {


	public List<ParentLayoutTO> createList(){
		List<ParentLayoutTO> listaParentLayout=new ArrayList<ParentLayoutTO>();
		
		ParentLayoutTO parentLayoutTO=new ParentLayoutTO();
		parentLayoutTO.setListaLayout(new ArrayList<LayoutTO>());
		
		parentLayoutTO.setName("Titulo del Elemento Padre1");
		LayoutTO LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento1 L1");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento2 L1");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento3 L1");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		
		LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento4 L1");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento5 L1");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		
		listaParentLayout.add(parentLayoutTO);		
		
		parentLayoutTO=new ParentLayoutTO();
		parentLayoutTO.setListaLayout(new ArrayList<LayoutTO>());
		
		parentLayoutTO.setName("Titulo del Elemento Padre2");
		LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento1 L2");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento2 L2");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento3 L3");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		listaParentLayout.add(parentLayoutTO);			
		
		parentLayoutTO=new ParentLayoutTO();
		parentLayoutTO.setListaLayout(new ArrayList<LayoutTO>());
		
		parentLayoutTO.setName("Titulo del Elemento Padre3");
		LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento1 L3");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento2 L3");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		LayoutTO=new LayoutTO();
		LayoutTO.setName("Tipo Documento3 L3");
		parentLayoutTO.getListaLayout().add(LayoutTO);
		listaParentLayout.add(parentLayoutTO);
		
		return listaParentLayout;
	}


	
}
