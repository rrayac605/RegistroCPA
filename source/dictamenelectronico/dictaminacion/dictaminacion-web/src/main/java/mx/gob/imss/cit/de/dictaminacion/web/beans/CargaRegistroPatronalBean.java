package mx.gob.imss.cit.de.dictaminacion.web.beans;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.portlet.PortletContext;

import org.apache.log4j.Logger;

import mx.gob.imss.cit.de.dictaminacion.integration.api.PatronDictamenIntegrator;
import mx.gob.imss.cit.de.dictaminacion.integration.api.dto.domain.PatronAsociadoDTO;
import mx.gob.imss.cit.de.dictaminacion.web.beans.base.BaseBean;
import mx.gob.imss.cit.de.dictaminacion.web.constants.DictamenWebConstants;
import mx.gob.imss.cit.de.dictaminacion.web.enums.MensajesNotificacionesEnum;
import mx.gob.imss.cit.de.dictaminacion.web.pages.CargaRegistroPatronalPage;
import mx.gob.imss.cit.de.dictaminacion.web.pages.DatosPatronalesPage;
import mx.gob.imss.cit.de.dictaminacion.web.util.FacesUtils;

@ManagedBean(name = "cargaRegistroPatronalBean")
@ViewScoped
public class CargaRegistroPatronalBean extends BaseBean {

	private static final long serialVersionUID = 2825687007915597308L;
	
	private Logger LOG=Logger.getLogger(CargaRegistroPatronalBean.class) ;

	@ManagedProperty(value = "#{cargaRegistroPatronalPage}")
	private CargaRegistroPatronalPage cargaRegistroPatronalPage;

	@ManagedProperty(value = "#{datosPatronalesPage}")
	private DatosPatronalesPage datosPatronalesPage;
	
	@EJB
	private PatronDictamenIntegrator patronDictamenIntegrator;
	

	private String calcularMensaje(int numRegistroPatronal, int numeroCargaRegistroPatronal){
		
		String mensaje="";
		if(numeroCargaRegistroPatronal==numRegistroPatronal){
			mensaje="El número de registros patronales capturados coincide con los cargados en el archivo";
		}else if(numeroCargaRegistroPatronal<numRegistroPatronal){
			
			mensaje="El número de registros patronales capturados ("+numRegistroPatronal+") no coincide con los cargados en el archivo ("+numeroCargaRegistroPatronal+
					"). Faltan: "+(numRegistroPatronal-numeroCargaRegistroPatronal);
		}else{
			mensaje="El número de registros patronales capturados ("+numRegistroPatronal+") no coincide con los cargados en el archivo ("+numeroCargaRegistroPatronal+
					"). Sobran: "+(numeroCargaRegistroPatronal-numRegistroPatronal);
		}
		
		return mensaje;

	}
	

	public String init(){
		 List<PatronAsociadoDTO> lista;
		 int totalExitosos=0;
		try {
			lista = patronDictamenIntegrator.findPatronesAsociados(datosPatronalesPage.getDatosPatron());
			if(lista==null){
				lista=new ArrayList<PatronAsociadoDTO>();
			}
			
			totalExitosos = contarCorrectos(lista);
	
			cargaRegistroPatronalPage.setListaRegistrosPatronales(lista);
			cargaRegistroPatronalPage.setMensajeRegistroPatronal(calcularMensaje(datosPatronalesPage.getDatosPatron().getNumRegistroPatronales(),totalExitosos));
		} catch( Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_REGISTROS_PATRONALES.getCode());
		}
		 
		
		
		return "";
		
	}


	private int contarCorrectos(List<PatronAsociadoDTO> lista) {
		int totalExitosos=0;
		for (PatronAsociadoDTO patronAsociadoDTO : lista) {
			if(DictamenWebConstants.ESTADO_RP_CORRECTO.equals(patronAsociadoDTO.getEstadoValidacion())){
				totalExitosos++;
			}
		}
		return totalExitosos;
	}
	
	 public void cargarRegistrosPatronales() {
		 LOG.info("entro bean");

		 List<PatronAsociadoDTO> lista=new ArrayList<PatronAsociadoDTO>();
		 int totalExitosos=0;
		 FacesContext ctx = FacesContext.getCurrentInstance();
		 PortletContext request = (PortletContext) ctx.getExternalContext().getContext();
		 LOG.info(request.getRealPath("/"));
		
		 try {
			 File file= new File(request.getRealPath("/")+DictamenWebConstants.NOMBREA_BASE_ARCHIVO_RP);
			 Scanner sc=new Scanner(file);
			 while(sc.hasNext()){
				 PatronAsociadoDTO patron=new PatronAsociadoDTO();
				 
				 patron.setCveIdPatronDictamen(datosPatronalesPage.getDatosPatron());
				 patron.setRegPatronAsociado( sc.nextLine());
				 LOG.info(patron.getRegPatronAsociado());				 				
				 
				 lista.add(patron);
			 }
			 

			 lista= patronDictamenIntegrator.savePatronesAsociados(lista);	
			 if(lista!=null){
				 totalExitosos = contarCorrectos(lista);
			 }
		
	 
			 cargaRegistroPatronalPage.setListaRegistrosPatronales(lista);
			cargaRegistroPatronalPage.setMensajeRegistroPatronal(calcularMensaje(datosPatronalesPage.getDatosPatron().getNumRegistroPatronales(),totalExitosos));

		     FacesUtils.messageSuccess(MensajesNotificacionesEnum.MSG_EXITO_REGISTROS_PATRONALES.getCode(),totalExitosos);
		    
		} catch (Exception e) {
			FacesUtils.messageError(MensajesNotificacionesEnum.MSG_ERROR_REGISTROS_PATRONALES.getCode());
		}
		

	    }

	
	public CargaRegistroPatronalPage getCargaRegistroPatronalPage() {
		return cargaRegistroPatronalPage;
	}


	public void setCargaRegistroPatronalPage(CargaRegistroPatronalPage cargaRegistroPatronalPage) {
		this.cargaRegistroPatronalPage = cargaRegistroPatronalPage;
	}

	public DatosPatronalesPage getDatosPatronalesPage() {
		return datosPatronalesPage;
	}

	public void setDatosPatronalesPage(DatosPatronalesPage datosPatronalesPage) {
		this.datosPatronalesPage = datosPatronalesPage;
	}



}
