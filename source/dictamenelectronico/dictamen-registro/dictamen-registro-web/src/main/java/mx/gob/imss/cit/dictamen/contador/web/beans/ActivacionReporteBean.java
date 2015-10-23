package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorReporteIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;
import mx.gob.imss.cit.dictamen.contador.web.pages.ActivacionContadorPage;
import mx.gob.imss.cit.dictamen.contador.web.util.FacesUtils;

import javax.annotation.PostConstruct;

@ManagedBean(name = "activacionReporteBean")
@ViewScoped
public class ActivacionReporteBean extends BaseBean {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ActivacionReporteBean.class);

	private static final long serialVersionUID = -1700645583010439518L;

	@EJB(mappedName = "contadorReporteIntegrator", name = "contadorReporteIntegrator")
	private ContadorReporteIntegrator contadorReporteIntegrator;

	private String cargar;



	public final static Integer TIPO_REPORTE = 1;

	public final static String PDF_FILENAME = "SolicitudActivacionContador";

	
	@PostConstruct
	public void init() {
		//NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO = build();
		//if (ndtContadorPublicoAutDTO != null) {
		NdtContadorPublicoAutDTO to = new NdtContadorPublicoAutDTO();
		to.setCadenaOriginal("abc");
		to.setCurp("abc");
		to.setFecha("test");
		to.setNombreCompleto("test");
		to.setNumeroCedulaProfesional("test");
		to.setNumRegistroCpa(1);
		to.setNumTramiteNotaria("test");
		to.setNumTramiteNotaria("twes");
		to.setRfc("test");
		to.setSelloDigitalIMSS("test");
			byte[] reporte = contadorReporteIntegrator.generarReportePreliminar(to,1);

			LOGGER.info("size2=" + reporte.length);

			//ByteArrayInputStream breporte = new ByteArrayInputStream(reporte);
			//breporte.mark(0);
try{
             FacesContext facesContext = FacesContext.getCurrentInstance();
             HttpServletResponse respuestaServlet =
                 (HttpServletResponse)facesContext.getExternalContext().getResponse();
             respuestaServlet.setContentType("application/pdf");
             respuestaServlet.setHeader("Content-Disposition", "inline; filename=\"ReporteDeclaracionProvisional.pdf\"");
             respuestaServlet.getOutputStream().write(new byte[10]);
             respuestaServlet.setStatus(HttpServletResponse.SC_OK);
             respuestaServlet.flushBuffer();
             respuestaServlet.getOutputStream().close();
             facesContext.responseComplete();
         } catch (RuntimeException e) {
             LOGGER.info(e.getMessage(),e);

         } catch (Exception e) {
             LOGGER.info(e.getMessage(),e);
         }
         
		//} else {
			
      		//FacesUtils.getFacesContext().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Activación:","No hay registro de datos del Contador Previamente."));

		//}
		
	}


	public String getCargar() {
		return cargar;
	}

	public void setCargar(String cargar) {
		this.cargar = cargar;
	}

	public ContadorReporteIntegrator getContadorReporteIntegrator() {
		return contadorReporteIntegrator;
	}

	public void setContadorReporteIntegrator(
			ContadorReporteIntegrator contadorReporteIntegrator) {
		this.contadorReporteIntegrator = contadorReporteIntegrator;
	}

}
