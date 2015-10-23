package mx.gob.imss.cit.dictamen.contador.web.beans;

import java.io.ByteArrayInputStream;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mx.gob.imss.cit.dictamen.contador.integration.api.ContadorReporteIntegrator;
import mx.gob.imss.cit.dictamen.contador.integration.api.dto.NdtContadorPublicoAutDTO;
import mx.gob.imss.cit.dictamen.contador.web.beans.base.BaseBean;

@ManagedBean(name = "activacionAcuseBean")
@ViewScoped
public class ActivacionAcuseBean  extends BaseBean{
	private static final Logger LOGGER = LoggerFactory.getLogger(ActivacionAcuseBean.class);

	private static final long serialVersionUID = -1700645583010439518L;
   
	@EJB(mappedName="contadorReporteIntegrator", name="contadorReporteIntegrator")
	private ContadorReporteIntegrator contadorReporteIntegrator;

	
	public StreamedContent getStream() {
		NdtContadorPublicoAutDTO ndtContadorPublicoAutDTO= new NdtContadorPublicoAutDTO();
		byte[] reporte = contadorReporteIntegrator.generarReportePreliminar(ndtContadorPublicoAutDTO, 1);
		LOGGER.info("size="+reporte.length);
        return new DefaultStreamedContent(new ByteArrayInputStream(reporte));
	}
	
	public ContadorReporteIntegrator getContadorReporteIntegrator() {
		return contadorReporteIntegrator;
	}

	public void setContadorReporteIntegrator(
			ContadorReporteIntegrator contadorReporteIntegrator) {
		this.contadorReporteIntegrator = contadorReporteIntegrator;
	}
	
}
