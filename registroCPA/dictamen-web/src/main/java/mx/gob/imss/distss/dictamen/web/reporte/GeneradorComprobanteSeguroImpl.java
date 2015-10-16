/**
 * 
 */
package mx.gob.imss.distss.dictamen.web.reporte;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import mx.gob.imss.ctirss.delta.model.gestion.solicitud.OrigenSolicitudEnum;
import mx.gob.imss.digital.modelo.seguros.ComprobanteSeguroReporte;
import mx.gob.imss.digital.modelo.seguros.ComprobantesSeguroReporte;
import mx.gob.imss.digital.modelo.seguros.SeguroIvro;
import mx.gob.imss.digital.modelo.seguros.SegurosIvro;
import mx.gob.imss.digital.modelo.util.JaxbUtil;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

/**
 * Implementacion para la generacion de seguros
 * 
 * @author NOVUTECK1
 * 
 */
@Component
public class GeneradorComprobanteSeguroImpl implements GeneradorComprobanteSeguro {

    /**
     * Ubicacion del reporte
     */
    private static final String REPORTE_URL = "comprobantes/comprobanteSeguro.jasper";
    /**
     * Logger de la clase
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(GeneradorComprobanteSeguroImpl.class);

    @Autowired
    @Qualifier("webServiceComprobanteSeguro")
    private WebServiceTemplate servicioComprobante;
    /*
     * (non-Javadoc)
     * 
     * @see mx.gob.imss.distss.dictamen.web.reporte.
     * GneradorComprobanteSeguro
     * #generaComprobante(mx.gob.imss.digital.modelo.seguros.SeguroIvro)
     */
    @Override
    public ByteArrayOutputStream generaComprobante(SeguroIvro seguro, Long origen) {
        SegurosIvro seguros = new SegurosIvro();
        List<SeguroIvro> seg = new ArrayList<SeguroIvro>();
        seg.add(seguro);
        seguros.setSeguroIvro(seg.toArray(new SeguroIvro[seg.size()]));
        return generaComprobantes(seguros, origen);
    }

    /*
     * (non-Javadoc)
     * 
     * @see mx.gob.imss.distss.dictamen.web.reporte.
     * GneradorComprobanteSeguro
     * #generaComprobantes(mx.gob.imss.digital.modelo.seguros.SegurosIvro)
     */
    @Override
    public ByteArrayOutputStream generaComprobantes(SegurosIvro seguros, Long origen) {
        // Se debera realizar: Aqui hay que mandar a pedir los datos del reporte
        ComprobantesSeguroReporte comprobantes = obtenDatosComprobantes(seguros);
        
        ByteArrayOutputStream byteArraySalida = new ByteArrayOutputStream();
        for (ComprobanteSeguroReporte comprobante : comprobantes.getComprobante()) {            
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                comprobante.setOrigen(origen != null ? origen.intValue() : 
                    OrigenSolicitudEnum.INTERNET.getId().intValue());
                //comprobante.setUsuario(tramite.get);
                //comprobante.setSubdelegacionUsuario(subdelegacionUsuario);
                Map<String, Object> parametros = convierteDatosReporte(comprobante);
                JasperReport report = (JasperReport) JRLoader.loadObject(new ClassPathResource(
                      REPORTE_URL).getInputStream());
                JasperPrint print;
                JREmptyDataSource emptyDS = new JREmptyDataSource();
                print = JasperFillManager.fillReport(report, parametros, emptyDS);
                JRPdfExporter exporter = new JRPdfExporter();
                exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
                exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, byteArrayOutputStream);
                exporter.exportReport();
                byteArraySalida.write(byteArrayOutputStream.toByteArray());
            } catch (Exception e) {
                LOGGER.error("Error al generar el reporte jasper", e);
            }
        }
        try {
            byteArraySalida.close();
        } catch (IOException e) {
            LOGGER.error("Error al cerrar el archivo", e);
        }
        return byteArraySalida;
    }

    /**
     * Genera el mapa de parametros para el reporte a partir de la clase scon sus valores
     * @param comprobante el comprobante a obtener sus valores
     * @return el mapa de parametro
     */
    private Map<String, Object> convierteDatosReporte(ComprobanteSeguroReporte comprobante) {
        Field[] fileds = comprobante.getClass().getDeclaredFields();
        Map<String, Object> parametros = new HashMap<String, Object>();
        for (Field field : fileds) {
            try {
                field.setAccessible(true);
                parametros.put(field.getName(), field.get(comprobante));
                LOGGER.info("Agregando parametro {}", field.getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return parametros;
    }
    
    private ComprobantesSeguroReporte obtenDatosComprobantes(SegurosIvro seguros) {
        ComprobantesSeguroReporte comprobantes = new ComprobantesSeguroReporte();
        try {          
            String segurosXml = JaxbUtil.marshaller(seguros);
            
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            LOGGER.info(":" + segurosXml);
            servicioComprobante.sendSourceAndReceiveToResult(new StreamSource(new StringReader(segurosXml)), 
                    result);
            String comprobanesXml = writer.toString();
            LOGGER.info("Respuesta ws " + segurosXml );
            comprobantes = JaxbUtil.unmarshaller(comprobanesXml, ComprobantesSeguroReporte.class);
            LOGGER.info("Parseo Objeto "+  ReflectionToStringBuilder.toString(comprobantes.getComprobante()));
            LOGGER.info("Parseo Objeto "+  ReflectionToStringBuilder.toString(comprobantes.getComprobante()[0]));
        } catch (Exception e) {            
            LOGGER.error("Error no controlado ", e);
        }
        return comprobantes;
    }
}
