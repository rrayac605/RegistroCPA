package mx.gob.imss.cit.dictamen.web.beans;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import mx.gob.imss.cit.dictamen.integration.api.PatronIntegrator;
import mx.gob.imss.cit.dictamen.integration.api.dto.DatosPatronDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.LayoutDTO;
import mx.gob.imss.cit.dictamen.integration.api.dto.ParentLayoutDTO;
import mx.gob.imss.cit.dictamen.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.dictamen.web.pages.DatosPatronPage;
import mx.gob.imss.cit.dictamen.web.util.FacesUtils;

@ManagedBean(name = "datosPatronBean")
@ViewScoped
public class DatosPatronBean extends BaseBean {

	/**
	 * 
	 */
	
	@EJB
	private PatronIntegrator  patronIntegration;
	
	private static final long serialVersionUID = 2825687007915597308L;

	@ManagedProperty(value = "#{datosPatronPage}")
	private DatosPatronPage datosPatronPage;
	
	public String init(){
		datosPatronPage.setDatosPatron(new DatosPatronDTO());
		datosPatronPage.setListaParentLayout(createList());
		datosPatronPage.setListaTipoDictamen(patronIntegration.findAllTipoDictamen());
		return "";
	}
	
	public void init(String rfc){
		
	}

	public void buscar(){
		FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_EJEMPLO.getCode());
		FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_EJEMPLO2.getCode());
		FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_EJEMPLO3.getCode(),"uno");
		FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_EJEMPLO4.getCode()," hola","hola2");
	}
	


	public List<ParentLayoutDTO> createList(){
		List<ParentLayoutDTO> listaParentLayout=new ArrayList<ParentLayoutDTO>();
		
		ParentLayoutDTO parentLayoutDTO=new ParentLayoutDTO();
		parentLayoutDTO.setListaLayout(new ArrayList<LayoutDTO>());
		
		parentLayoutDTO.setName("Layout Tipo1");
		LayoutDTO layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 1 de L1");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 2 de L1");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 3 de L1");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 4 de L1");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 5 de L1");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		
		listaParentLayout.add(parentLayoutDTO);		
		
		
		
		
		
		parentLayoutDTO=new ParentLayoutDTO();
		parentLayoutDTO.setListaLayout(new ArrayList<LayoutDTO>());
		
		parentLayoutDTO.setName("Layout Tipo2");
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 1 de L2");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 2 de L2");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 3 de L3");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		listaParentLayout.add(parentLayoutDTO);
		
		
		
		parentLayoutDTO=new ParentLayoutDTO();
		parentLayoutDTO.setListaLayout(new ArrayList<LayoutDTO>());
		
		parentLayoutDTO.setName("Layout Tipo3");
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 1 de L3");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 2 de L3");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		layoutDTO=new LayoutDTO();
		layoutDTO.setName("Documento 3 de L3");
		parentLayoutDTO.getListaLayout().add(layoutDTO);
		listaParentLayout.add(parentLayoutDTO);
		
		
		
		
		return listaParentLayout;
	}
	
	/**
	 * @param datosPatronPage the datosPatronPage to set
	 */
	public void setDatosPatronPage(DatosPatronPage datosPatronPage) {
		this.datosPatronPage = datosPatronPage;
	}



}
