package mx.gob.imss.cit.de.dictaminacion.web.beans;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.portlet.PortletContext;

import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;

import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronAsociadoDTO;
import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CargaRegistroPatronalPage;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

@ManagedBean(name = "cargaRegistroPatronalBean")
@ViewScoped
public class CargaRegistroPatronalBean extends BaseBean {

	private static final long serialVersionUID = 2825687007915597308L;
	
	private Logger LOG=Logger.getLogger(CargaRegistroPatronalBean.class) ;

	@ManagedProperty(value = "#{cargaRegistroPatronalPage}")
	private CargaRegistroPatronalPage cargaRegistroPatronalPage;

	


	public String init(){
		 List<PatronAsociadoDTO> lista=new ArrayList<PatronAsociadoDTO>();		 
		cargaRegistroPatronalPage.setListaRegistrosPatronales(lista);
		
		return "";
		
	}
	
	 public void cargarRegistrosPatronales() {
		 System.out.println("entro bean");

		 List<PatronAsociadoDTO> lista=new ArrayList<PatronAsociadoDTO>();
		 FacesContext ctx = FacesContext.getCurrentInstance();
		 PortletContext request = (PortletContext) ctx.getExternalContext().getContext();
		 System.out.println(request.getRealPath("/"));
		
		 try {
			 File file= new File(request.getRealPath("/")+"/registroPatronal.txt");
			 Scanner sc=new Scanner(file);
			 while(sc.hasNext()){
				 PatronAsociadoDTO patron=new PatronAsociadoDTO();
				 patron.setDesRfcPatron( sc.nextLine());
				 System.out.println(patron.getDesRfcPatron());
				 lista.add(patron);
			 }
			 cargaRegistroPatronalPage.setListaRegistrosPatronales(lista);

		     FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_REGISTROS_PATRONALES.getCode());
		    
		} catch (Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_REGISTROS_PATRONALES.getCode());
			e.printStackTrace();
		}
		

	    }

	
	public CargaRegistroPatronalPage getCargaRegistroPatronalPage() {
		return cargaRegistroPatronalPage;
	}


	public void setCargaRegistroPatronalPage(CargaRegistroPatronalPage cargaRegistroPatronalPage) {
		this.cargaRegistroPatronalPage = cargaRegistroPatronalPage;
	}



}
