package mx.gob.imss.cit.dictamen.contador.web.beans.reactivacion;


import java.util.Date;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorReporteIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.DomicilioFiscalDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.PersonaDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.activacion.ActivacionContadorPage;
import mx.gob.imss.cit.dictamen.contador.web.pages.activacion.ActivacionSolicitudPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

import javax.annotation.PostConstruct;

@ManagedBean(name = "reactivacionReporteBean")
@ViewScoped
public class ReactivacionReporteBean  extends BaseBean{
	private static final Logger LOGGER = LoggerFactory.getLogger(ReactivacionReporteBean.class);

	private static final long serialVersionUID = -1700645583010439518L;
   
	@EJB(mappedName="contadorReporteIntegrator", name="contadorReporteIntegrator")
	private ContadorReporteIntegrator contadorReporteIntegrator;
    
	@ManagedProperty(value = "#{reactivacionContadorPage}")
	private ActivacionContadorPage activacionContadorPage;
	
	@ManagedProperty(value = "#{reactivacionSolicitudPage}")
	private ActivacionSolicitudPage activacionSolicitudPage;
	

	private String lblLoader ="msg";
	

	   public static String format(Date fechaNacimiento){
		     DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
		     if(fechaNacimiento ==  null){
				 return StringUtils.EMPTY;
		     }
		    return formatter.print(new DateTime(fechaNacimiento));
	   }

	   public static String formatTime(Date fechaNacimiento){
		     DateTimeFormatter formatter = DateTimeFormat.forPattern("ddMMyyyy");
		     if(fechaNacimiento ==  null){
				 return StringUtils.EMPTY;
		     }
		    return formatter.print(new DateTime(fechaNacimiento));
	   }
	   
	@PostConstruct
	public void init(){

		if(activacionSolicitudPage.getPersonaDTO()==null){
 		   FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activacion:","No se Registro un Contador publico"));

		}else{
			PersonaDTO personaDTO =activacionSolicitudPage.getPersonaDTO();
		NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO = new NdtContadorPublicoAutDTO();
		ndtContadorPublicoAutDTO.setCadenaOriginal("");
		ndtContadorPublicoAutDTO.setCurp(personaDTO.getCurp());
		ndtContadorPublicoAutDTO.setFecha(format(new Date()));
		ndtContadorPublicoAutDTO.setNombreCompleto(activacionSolicitudPage.getPersonaDTO().getNombreCompleto());
		ndtContadorPublicoAutDTO.setNumeroCedulaProfesional(activacionContadorPage.getDatosPersonalesDTO().getNumeroCedula());
		ndtContadorPublicoAutDTO.setNumRegistroCpa(activacionSolicitudPage.getPersonaDTO().getContadorPublicoAutDTO().getNumRegistroCPA());
		LOGGER.info("numRegistroCPA="+ndtContadorPublicoAutDTO.getNumRegistroCpa());
		ndtContadorPublicoAutDTO.setNumTramiteNotaria("");
		ndtContadorPublicoAutDTO.setRfc(activacionSolicitudPage.getPersonaDTO().getRfc());
		ndtContadorPublicoAutDTO.setSelloDigitalIMSS("");
		DomicilioFiscalDTO domicilioFiscalDTO =activacionSolicitudPage.getPersonaDTO().getContadorPublicoAutDTO().getDomicilioFiscalDTO();
		if(domicilioFiscalDTO!=null){
		domicilioFiscalDTO.setCalle(domicilioFiscalDTO.getCalle());
		domicilioFiscalDTO.setCodigoPostal(domicilioFiscalDTO.getCodigoPostal());
		domicilioFiscalDTO.setColoniaAsentamiento(domicilioFiscalDTO.getColoniaAsentamiento());
		domicilioFiscalDTO.setEntidadFederativa(domicilioFiscalDTO.getCveEntidadFederativa());
		domicilioFiscalDTO.setCveEntidadFederativa(domicilioFiscalDTO.getCveEntidadFederativa());
		domicilioFiscalDTO.setEntreCalle(domicilioFiscalDTO.getEntreCalle());
		domicilioFiscalDTO.setLetraExterior(domicilioFiscalDTO.getLetraExterior());
		domicilioFiscalDTO.setLetraInterior(domicilioFiscalDTO.getLetraInterior());
		domicilioFiscalDTO.setLocalidad(domicilioFiscalDTO.getLocalidad());
		domicilioFiscalDTO.setMunicipioDelegacion(domicilioFiscalDTO.getMunicipioDelegacion());
		domicilioFiscalDTO.setNumeroExterior(domicilioFiscalDTO.getNumeroExterior());
		domicilioFiscalDTO.setNumeroInterior(domicilioFiscalDTO.getNumeroInterior());
		domicilioFiscalDTO.setyCalle(domicilioFiscalDTO.getyCalle());
		
		ndtContadorPublicoAutDTO.setDomicilioFiscalDTO(domicilioFiscalDTO);
		}
		byte[] reporte = contadorReporteIntegrator.generarReportePreliminar(ndtContadorPublicoAutDTO, 1);
		
		LOGGER.info("size1="+reporte.length);
        StringBuilder sb = new StringBuilder();
        sb.append(REPORTE_NOMBRE);
        sb.append("-");
        sb.append(formatTime(new Date()));
        
        try {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            HttpServletResponse respuestaServlet =
                (HttpServletResponse)facesContext.getExternalContext().getResponse();
            respuestaServlet.setContentType(CONTENTTYPE_PDF);
            respuestaServlet.setContentLength(reporte.length);
            respuestaServlet.setHeader(HEADERCONTENT_PDF, "inline; filename=\""+sb.toString()+".pdf\"");
            respuestaServlet.setContentLength(reporte.length);
            respuestaServlet.getOutputStream().write(reporte);
            respuestaServlet.setStatus(HttpServletResponse.SC_OK);
            respuestaServlet.flushBuffer();
            respuestaServlet.getOutputStream().close();
            facesContext.responseComplete();
        } catch (RuntimeException e) {
            LOGGER.info(e.getMessage(),e);
        } catch (Exception e) {
            LOGGER.info( e.getMessage(),e);
        }
		}
	}
    
	public static final String CONTENTTYPE_PDF="application/pdf";
	public static final String HEADERCONTENT_PDF="Content-Disposition";
    public static final String REPORTE_NOMBRE="SolicitudActivacionContador";
    
    

	public ActivacionSolicitudPage getActivacionSolicitudPage() {
		return activacionSolicitudPage;
	}

	public void setActivacionSolicitudPage(
			ActivacionSolicitudPage activacionSolicitudPage) {
		this.activacionSolicitudPage = activacionSolicitudPage;
	}
	public ActivacionContadorPage getActivacionContadorPage() {
		return activacionContadorPage;
	}



	public void setActivacionContadorPage(
			ActivacionContadorPage activacionContadorPage) {
		this.activacionContadorPage = activacionContadorPage;
	}
	public String getLblLoader() {
		return lblLoader;
	}


	public void setLblLoader(String lblLoader) {
		this.lblLoader = lblLoader;
	}

	
	public ContadorReporteIntegrator getContadorReporteIntegrator() {
		return contadorReporteIntegrator;
	}

	public void setContadorReporteIntegrator(
			ContadorReporteIntegrator contadorReporteIntegrator) {
		this.contadorReporteIntegrator = contadorReporteIntegrator;
	}
	
}
