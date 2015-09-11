package mx.gob.imss.cit.dictamen.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.dto.LayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.pages.CargaArchivosPage;

@ManagedBean(name = "cargaArchivosBean")
@ViewScoped
public class CargaArchivosBean extends BaseBean {

	
	private static final long serialVersionUID = 2825687007915597308L;

	@ManagedProperty(value = "#{cargaArchivosPage}")
	private CargaArchivosPage cargaArchivosPage;
	
	public void init(){
		cargaArchivosPage.setListaParentLayout(createList());
	}
	



	public List<ParentLayoutDTO> createList(){
		List<ParentLayoutDTO> listaParentLayout=new ArrayList<ParentLayoutDTO>();
		
		ParentLayoutDTO parentLayoutDTO=new ParentLayoutDTO();
		parentLayoutDTO.setListaLayout(new ArrayList<LayoutDTO>());
		
		parentLayoutDTO.setName("Titulo del Elemento Padre1");
		LayoutDTO layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento1 L1");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento2 L1");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento3 L1");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento4 L1");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento5 L1");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		
		listaParentLayout.add(parentLayoutDTO);		
		
		parentLayoutDTO=new ParentLayoutDTO();
		parentLayoutDTO.setListaLayout(new ArrayList<LayoutDTO>());
		
		parentLayoutDTO.setName("Titulo del Elemento Padre2");
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento1 L2");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento2 L2");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento3 L3");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		listaParentLayout.add(parentLayoutDTO);			
		
		parentLayoutDTO=new ParentLayoutDTO();
		parentLayoutDTO.setListaLayout(new ArrayList<LayoutDTO>());
		
		parentLayoutDTO.setName("Titulo del Elemento Padre3");
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento1 L3");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento2 L3");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Tipo Documento3 L3");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		listaParentLayout.add(parentLayoutDTO);
		
		return listaParentLayout;
	}




	/**
	 * @param cargaArchivosPage the cargaArchivosPage to set
	 */
	public void setCargaArchivosPage(CargaArchivosPage cargaArchivosPage) {
		this.cargaArchivosPage = cargaArchivosPage;
	}





}
