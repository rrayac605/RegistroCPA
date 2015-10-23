package mx.gob.imss.cit.dictamen.contador.services.impl;


import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import mx.gob.imss.cit.dictamen.contador.commons.to.domain.NdtContadorPublicoAutTO;
import mx.gob.imss.cit.dictamen.contador.services.ContadorReporteService;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperRunManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Stateless(name  = "contadorReporteService", mappedName = "contadorReporteService")
public class ContadorReporteServiceImpl implements  ContadorReporteService{

	private static final Logger logger = LoggerFactory.getLogger(ContadorReporteServiceImpl.class);

	@Override
	public boolean generarReportePDF(Map<String, Object> parametrosReporte, Integer tipoReporte) throws RuntimeException {
		byte[] byteArray = null;
		String rutaJasper = null;
		boolean flagEstado = false;
		try {
			if (parametrosReporte == null) {
				parametrosReporte = new HashMap<String, Object>();
			}
			
			parametrosLayout(parametrosReporte);
			
			switch (tipoReporte) {
				case 0:
					rutaJasper = "/reporte/SolicitudRegistroContador.jasper";
					byteArray = obtenerPDFByteArray(rutaJasper, parametrosReporte);
					if (byteArray != null) {
						//notariaServiceLocal.guardarArchivoFirmado(parametrosReporte.get("numTramiteNotaria").toString(), generaArchivo(byteArray), ConstantesDictamen.NOMBRE_ACUSE_SOLICITUD_REGISTRO);
					}
					break;
				case 1:
					rutaJasper = "/reporte/SolicitudActivacionContador.jasper";
					byteArray = obtenerPDFByteArray(rutaJasper, parametrosReporte);
					if (byteArray != null) {
						//notariaServiceLocal.guardarArchivoFirmado(parametrosReporte.get("numTramiteNotaria").toString(), generaArchivo(byteArray), ConstantesDictamen.NOMBRE_ACUSE_SOLICITUD_BAJA_VOLUNTARIA);
					}
				case 2:
					rutaJasper = "/reporte/SolicitudReactivacionContador.jasper";
					byteArray = obtenerPDFByteArray(rutaJasper, parametrosReporte);
					if (byteArray != null) {
						//notariaServiceLocal.guardarArchivoFirmado(parametrosReporte.get("numTramiteNotaria").toString(), generaArchivo(byteArray), ConstantesDictamen.NOMBRE_ACUSE_SOLICITUD_BAJA_VOLUNTARIA);
					}
					break;
			}
		} catch (Exception ex) {
			logger.info("ERROR: Al generar el reporte y el guardado en notaria.", ex);
			throw new RuntimeException("ERROR: Al generar el reporte y el guardado en notar\u00eda.", ex);
		}
		return flagEstado;
	}
	
	/**
	 * Metodo que nos sirve para mandar los parametros de los layout de los reportes
	 * @param parametrosReporte
	 */
	private void parametrosLayout(Map<String, Object> iReportParameter) throws RuntimeException {
		try {
			iReportParameter.put("imgLogoImss","/img/logoImss.jpg");
			iReportParameter.put("imgGobiernoRepublica","/img/gobiernoRepublica.png");
			iReportParameter.put("imgEscudoNacional","/img/escudoNacional.jpg");
		} catch (Exception ex) {
			logger.info("ERROR: Al obtener los parametros del Layaout del reporte.", ex);
			throw new RuntimeException("ERROR: Al obtener los parametros del Layaout del reporte.", ex);
		}
	}
	
	/**
	 * Metodo que construye el reporte con los parametros enviados y es creado como un arreglo de bytes 
	 * @param rutaJasper
	 * @param parametrosReporte
	 * @return byte[]
	 */
	public byte[] obtenerPDFByteArray(String rutaJasper, Map<String, Object> parametrosReporte) throws RuntimeException {
		byte[] byteArray = null;
		InputStream inputStream = null;
		try {
			 URL url = ContadorReporteServiceImpl.class.getResource(rutaJasper);
			String path = url.getFile();
			logger.info("path="+path);
			inputStream = getClass().getResourceAsStream(rutaJasper);
			
			byteArray = JasperRunManager.runReportToPdf(path, parametrosReporte, new JREmptyDataSource());
		}  catch (JRException ex) {
			logger.error("ERROR: No se pudo crear el arreglo de byte del reporte ", ex);
			throw new RuntimeException("Error al generar el reporte y el guardado en notar\u00eda.", ex);
		}  finally {
            if (inputStream != null) {
                try {
                	inputStream.close();
                } catch (IOException ex) {
                    logger.error("ERROR: No se pudo cerrar el inputStream.", ex);
                    throw new RuntimeException("ERROR: No se pudo cerrar el inputStream.", ex);
                }
            }
        }
		return byteArray;
	}
	
	public String generaArchivo(byte[] bytes) throws RuntimeException {
		String acusePdf = null;
		try {
			acusePdf = org.apache.soap.encoding.soapenc.Base64.encode(bytes);
		} catch (Exception ex) {
			logger.error("ERROR: No se pudo obtner el encoding Base64 de los Bytes para generar el archivo del Reporte.", ex);
            throw new RuntimeException("ERROR: No se pudo obtner el encoding Base64 de los Bytes para generar el archivo del Reporte.", ex);
		}
		return acusePdf;
	}
	
	@Override
	public byte[] generarReportePreliminar(Map<String, Object> parametrosReporte, Integer tipoReporte) {
		byte[] byteArray = null;
		String rutaJasper = null;
		
		try {
			switch (tipoReporte) {
				case 0:
					rutaJasper = "/reporte/SolicitudRegistroContador.jasper";
					byteArray = obtenerPDFByteArray(rutaJasper, parametrosReporte);
					break;
				case 1: //Activacion
					rutaJasper = "/reporte/SolicitudActivacionContador.jasper";
					byteArray = obtenerPDFByteArray(rutaJasper, parametrosReporte);
					break;
				case 2: //Activacion
					rutaJasper = "/reporte/SolicitudReactivacionContador.jasper";
					byteArray = obtenerPDFByteArray(rutaJasper, parametrosReporte);
					break;
			}
		} catch (Exception ex) {
			logger.error("ERROR: No se pudo generar el arreglo de bytes del reporte para la visualizacion preliminar.", ex);
            throw new RuntimeException("ERROR: No se pudo generar el arreglo de bytes del reporte para la visualizacion preliminar.", ex);
		}
		return byteArray;
	}

	@Override
	public Map<String, Object> generaParametrosActualizacionVoluntariaContador(NdtContadorPublicoAutTO ndtContadorPublicoAutDTO) {
		final Map<String, Object> iReportParameter = new HashMap<String, Object>();
		
		parametrosLayout(iReportParameter);
		
		try {
			if (ndtContadorPublicoAutDTO != null) {
				iReportParameter.put("fecha", ndtContadorPublicoAutDTO.getFecha());
				iReportParameter.put("numTramiteNotaria", ndtContadorPublicoAutDTO.getNumTramiteNotaria() != null ? 
						ndtContadorPublicoAutDTO.getNumTramiteNotaria() != null ? 
						ndtContadorPublicoAutDTO.getNumTramiteNotaria() != null ? 
						ndtContadorPublicoAutDTO.getNumTramiteNotaria() : "" : "" : "");
				iReportParameter.put("nombreCompleto", ndtContadorPublicoAutDTO.getNombreCompleto() != null ? 
						ndtContadorPublicoAutDTO.getNombreCompleto() != null ? 
						ndtContadorPublicoAutDTO.getNombreCompleto() : "" : "");
				iReportParameter.put("RFC", ndtContadorPublicoAutDTO.getRfc() != null ? 
						ndtContadorPublicoAutDTO.getRfc() != null ? 
						ndtContadorPublicoAutDTO.getRfc() : "" : "");
				iReportParameter.put("CURP", ndtContadorPublicoAutDTO.getCurp() != null ? 
						ndtContadorPublicoAutDTO.getCurp() != null ? 
						ndtContadorPublicoAutDTO.getCurp() : "" : "");
				iReportParameter.put("numRegistroCpa", ndtContadorPublicoAutDTO.getNumRegistroCpa() != null ? 
						ndtContadorPublicoAutDTO.getNumRegistroCpa().toString() : "");
				StringBuilder  domicilioFiscal = new StringBuilder();
				if ( ndtContadorPublicoAutDTO.getDomicilioTO() != null) {
					
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getDomicilioTO().getCalle() != null ? 
							ndtContadorPublicoAutDTO.getDomicilioTO().getCalle() +" " : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getDomicilioTO().getNumeroExterior() != null ? 
							ndtContadorPublicoAutDTO.getDomicilioTO().getNumeroExterior() +"" : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getDomicilioTO().getLetraExterior() != null ? 
							ndtContadorPublicoAutDTO.getDomicilioTO().getLetraExterior() +" " : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getDomicilioTO().getNumeroInterior() != null ? 
							ndtContadorPublicoAutDTO.getDomicilioTO().getNumeroInterior() +" " : "");
					domicilioFiscal.append(ndtContadorPublicoAutDTO.getDomicilioTO().getLetraInterior() != null ? 
							ndtContadorPublicoAutDTO.getDomicilioTO().getLetraInterior() +" " : "");
					if (ndtContadorPublicoAutDTO.getDomicilioTO() != null) {
						if (ndtContadorPublicoAutDTO.getDomicilioTO().getEntidadFederativa() != null) {
							domicilioFiscal.append(ndtContadorPublicoAutDTO.getDomicilioTO().getEntidadFederativa() != null ?
									ndtContadorPublicoAutDTO.getDomicilioTO().getEntidadFederativa() +" " : "");
						}
						
						if (ndtContadorPublicoAutDTO.getDomicilioTO().getMunicipioDelegacion() != null) {
							domicilioFiscal.append(ndtContadorPublicoAutDTO.getDomicilioTO().getMunicipioDelegacion() != null ? ndtContadorPublicoAutDTO.getDomicilioTO().getMunicipioDelegacion() +" " : "");
						}
						//domicilioFiscal.append(ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getNombre() != null ? 
						//		ndtContadorPublicoAutDTO.getPersonaFiscal().getDomicilioFiscal().getAsentamiento().getNombre() +" " : "");
					}
					if (ndtContadorPublicoAutDTO.getDomicilioTO().getCodigoPostal() != null) {
						domicilioFiscal.append(ndtContadorPublicoAutDTO.getDomicilioTO().getCodigoPostal() != null ?
								ndtContadorPublicoAutDTO.getDomicilioTO().getCodigoPostal() : "");
					}
				}
				iReportParameter.put("domicilioFiscal", domicilioFiscal.toString() != null ? domicilioFiscal.toString() : "");
				
				String numeroCedula = "";
				if (ndtContadorPublicoAutDTO.getNumeroCedulaProfesional() != null && !ndtContadorPublicoAutDTO.getNumeroCedulaProfesional().isEmpty()) {
					numeroCedula = ndtContadorPublicoAutDTO.getNumeroCedulaProfesional();
					if (numeroCedula == null) {
						numeroCedula = "";
					}
				}
				iReportParameter.put("numeroCedulaProfesional", numeroCedula);
				iReportParameter.put("cadenaOriginal", ndtContadorPublicoAutDTO.getCadenaOriginal() != null ? 
						ndtContadorPublicoAutDTO.getCadenaOriginal() : "");
				String selloDigitalIMSS = "";
				if (ndtContadorPublicoAutDTO.getSelloDigitalIMSS() != null && !ndtContadorPublicoAutDTO.getSelloDigitalIMSS().isEmpty()) {
					selloDigitalIMSS = ndtContadorPublicoAutDTO.getSelloDigitalIMSS();
					if (selloDigitalIMSS == null) {
						selloDigitalIMSS = "";
					}
				}
				iReportParameter.put("selloDigitalIMSS", selloDigitalIMSS);
			}
		} catch (Exception ex) {
			logger.error("ERROR: al generar los par\u00e1metros preliminares del reporte de solicitud de baja voluntaria de un contador publico.", ex);
			throw new RuntimeException("ERROR: al generar los par\u00e1metros preliminares del reporte de solicitud de baja voluntaria de un contador publico.", ex);
		}
		return iReportParameter;
	}


}
